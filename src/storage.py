"""SQLite reconstruction of the four Room tables used by NamsoGen."""

from __future__ import annotations

import argparse
import sqlite3
from pathlib import Path
from typing import Any


SCHEMA = """
CREATE TABLE IF NOT EXISTS notes (
    id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,
    content TEXT NOT NULL,
    createdAt INTEGER NOT NULL
);
CREATE TABLE IF NOT EXISTS notifications (
    notificationId TEXT NOT NULL PRIMARY KEY,
    title TEXT NOT NULL,
    body TEXT NOT NULL,
    url TEXT,
    receivedAt INTEGER NOT NULL
);
CREATE TABLE IF NOT EXISTS checker_batches (
    id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,
    gate TEXT NOT NULL,
    content TEXT NOT NULL,
    total INTEGER NOT NULL,
    createdAt INTEGER NOT NULL
);
CREATE TABLE IF NOT EXISTS temp_mail_history (
    email TEXT NOT NULL PRIMARY KEY,
    createdAt INTEGER NOT NULL
);
"""


class Storage:
    """Direct SQLite CRUD matching the recovered Room schema."""

    def __init__(self, database: str | Path = ":memory:") -> None:
        self.connection = sqlite3.connect(str(database))
        self.connection.row_factory = sqlite3.Row
        self.connection.executescript(SCHEMA)

    def close(self) -> None:
        self.connection.close()

    def add_note(self, content: str, created_at: int, note_id: int = 0) -> int:
        cursor = self.connection.execute(
            "INSERT OR ABORT INTO notes(id, content, createdAt) "
            "VALUES (NULLIF(?, 0), ?, ?)",
            (note_id, content, created_at),
        )
        self.connection.commit()
        return int(cursor.lastrowid)

    def list_notes(self) -> list[dict[str, Any]]:
        rows = self.connection.execute(
            "SELECT id, content, createdAt FROM notes ORDER BY createdAt DESC"
        )
        return [dict(row) for row in rows]

    def update_note(self, note_id: int, content: str, created_at: int) -> bool:
        cursor = self.connection.execute(
            "UPDATE OR ABORT notes SET content = ?, createdAt = ? WHERE id = ?",
            (content, created_at, note_id),
        )
        self.connection.commit()
        return cursor.rowcount > 0

    def delete_note(self, note_id: int) -> bool:
        cursor = self.connection.execute("DELETE FROM notes WHERE id = ?", (note_id,))
        self.connection.commit()
        return cursor.rowcount > 0

    def save_notification(
        self, notification_id: str, title: str, body: str, url: str | None, received_at: int
    ) -> None:
        self.connection.execute(
            "INSERT OR REPLACE INTO notifications"
            "(notificationId, title, body, url, receivedAt) VALUES (?, ?, ?, ?, ?)",
            (notification_id, title, body, url, received_at),
        )
        self.connection.commit()

    def list_notifications(self) -> list[dict[str, Any]]:
        rows = self.connection.execute(
            "SELECT notificationId, title, body, url, receivedAt "
            "FROM notifications ORDER BY receivedAt DESC"
        )
        return [dict(row) for row in rows]

    def delete_notifications_before(self, received_at: int) -> int:
        cursor = self.connection.execute(
            "DELETE FROM notifications WHERE receivedAt < ?", (received_at,)
        )
        self.connection.commit()
        return cursor.rowcount

    def add_checker_batch(
        self, gate: str, content: str, total: int, created_at: int, batch_id: int = 0
    ) -> int:
        cursor = self.connection.execute(
            "INSERT OR ABORT INTO checker_batches(id, gate, content, total, createdAt) "
            "VALUES (NULLIF(?, 0), ?, ?, ?, ?)",
            (batch_id, gate, content, total, created_at),
        )
        self.connection.commit()
        return int(cursor.lastrowid)

    def list_checker_batches(self, premium: bool | None = None) -> list[dict[str, Any]]:
        # h3/o.java separates the GRATIS tab from all other gates.
        where = "" if premium is None else (
            " WHERE gate != 'GRATIS'" if premium else " WHERE gate = 'GRATIS'"
        )
        rows = self.connection.execute(
            "SELECT id, gate, content, total, createdAt FROM checker_batches"
            + where + " ORDER BY createdAt DESC"
        )
        return [dict(row) for row in rows]

    def save_temp_mail(self, email: str, created_at: int) -> None:
        self.connection.execute(
            "INSERT OR REPLACE INTO temp_mail_history(email, createdAt) VALUES (?, ?)",
            (email, created_at),
        )
        self.connection.commit()

    def list_temp_mail(self) -> list[dict[str, Any]]:
        rows = self.connection.execute(
            "SELECT email, createdAt FROM temp_mail_history ORDER BY createdAt DESC"
        )
        return [dict(row) for row in rows]

    def delete_temp_mail(self, emails: list[str]) -> int:
        if not emails:
            return 0
        marks = ",".join("?" for _ in emails)
        cursor = self.connection.execute(
            f"DELETE FROM temp_mail_history WHERE email IN ({marks})", emails
        )
        self.connection.commit()
        return cursor.rowcount


def demo() -> None:
    """Exercise every table with synthetic data in an in-memory database."""
    store = Storage()
    try:
        note_id = store.add_note("nota sintética", 1)
        print("note updated:", store.update_note(note_id, "nota actualizada", 2))
        print("notes:", store.list_notes())
        print("note deleted:", store.delete_note(note_id))

        store.save_notification("demo-1", "Aviso demo", "Contenido sintético", None, 10)
        store.save_notification("demo-2", "Aviso demo 2", "Otro contenido", "https://example.invalid", 20)
        print("notifications:", store.list_notifications())
        print("old notifications deleted:", store.delete_notifications_before(15))

        store.add_checker_batch("gate-demo", "dato1|dato2", 2, 30)
        print("checker_batches:", store.list_checker_batches())

        store.save_temp_mail("demo@example.invalid", 40)
        print("temp_mail_history:", store.list_temp_mail())
        print("temp mail deleted:", store.delete_temp_mail(["demo@example.invalid"]))
    finally:
        store.close()


def main() -> None:
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument("command", choices=("demo",))
    args = parser.parse_args()
    if args.command == "demo":
        demo()


if __name__ == "__main__":
    main()
