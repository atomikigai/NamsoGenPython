package i3;

import app.namso_gen.spacehowen.data.NotesDatabase_Impl;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import y1.w;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends androidx.emoji2.text.g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ NotesDatabase_Impl f5183d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(NotesDatabase_Impl notesDatabase_Impl) {
        super(5, "85464543635732221bef2a29cb28b470", "74d13384e8113f9b3d5c92235be3c546");
        this.f5183d = notesDatabase_Impl;
    }

    @Override // androidx.emoji2.text.g
    public final void a(g2.a aVar) {
        jc.i.e(aVar, "connection");
        jd.d.o(aVar, "CREATE TABLE IF NOT EXISTS `notes` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `content` TEXT NOT NULL, `createdAt` INTEGER NOT NULL)");
        jd.d.o(aVar, "CREATE TABLE IF NOT EXISTS `notifications` (`notificationId` TEXT NOT NULL, `title` TEXT NOT NULL, `body` TEXT NOT NULL, `url` TEXT, `receivedAt` INTEGER NOT NULL, PRIMARY KEY(`notificationId`))");
        jd.d.o(aVar, "CREATE TABLE IF NOT EXISTS `checker_batches` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `gate` TEXT NOT NULL, `content` TEXT NOT NULL, `total` INTEGER NOT NULL, `createdAt` INTEGER NOT NULL)");
        jd.d.o(aVar, "CREATE TABLE IF NOT EXISTS `temp_mail_history` (`email` TEXT NOT NULL, `createdAt` INTEGER NOT NULL, PRIMARY KEY(`email`))");
        jd.d.o(aVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        jd.d.o(aVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '85464543635732221bef2a29cb28b470')");
    }

    @Override // androidx.emoji2.text.g
    public final void c(g2.a aVar) {
        jc.i.e(aVar, "connection");
        jd.d.o(aVar, "DROP TABLE IF EXISTS `notes`");
        jd.d.o(aVar, "DROP TABLE IF EXISTS `notifications`");
        jd.d.o(aVar, "DROP TABLE IF EXISTS `checker_batches`");
        jd.d.o(aVar, "DROP TABLE IF EXISTS `temp_mail_history`");
    }

    @Override // androidx.emoji2.text.g
    public final void r(g2.a aVar) {
        jc.i.e(aVar, "connection");
    }

    @Override // androidx.emoji2.text.g
    public final void s(g2.a aVar) {
        jc.i.e(aVar, "connection");
        this.f5183d.o(aVar);
    }

    @Override // androidx.emoji2.text.g
    public final void t(g2.a aVar) {
        jc.i.e(aVar, "connection");
    }

    @Override // androidx.emoji2.text.g
    public final void u(g2.a aVar) {
        jc.i.e(aVar, "connection");
        n9.b.k(aVar);
    }

    @Override // androidx.emoji2.text.g
    public final w v(g2.a aVar) {
        jc.i.e(aVar, "connection");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("id", new e2.e(1, "id", "INTEGER", null, true, 1));
        linkedHashMap.put("content", new e2.e(0, "content", "TEXT", null, true, 1));
        linkedHashMap.put("createdAt", new e2.e(0, "createdAt", "INTEGER", null, true, 1));
        e2.h hVar = new e2.h("notes", linkedHashMap, new LinkedHashSet(), new LinkedHashSet());
        e2.h hVarD = com.bumptech.glide.c.D(aVar, "notes");
        if (!hVar.equals(hVarD)) {
            return new w("notes(app.namso_gen.spacehowen.data.Note).\n Expected:\n" + hVar + "\n Found:\n" + hVarD, false);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("notificationId", new e2.e(1, "notificationId", "TEXT", null, true, 1));
        linkedHashMap2.put("title", new e2.e(0, "title", "TEXT", null, true, 1));
        linkedHashMap2.put("body", new e2.e(0, "body", "TEXT", null, true, 1));
        linkedHashMap2.put("url", new e2.e(0, "url", "TEXT", null, false, 1));
        linkedHashMap2.put("receivedAt", new e2.e(0, "receivedAt", "INTEGER", null, true, 1));
        e2.h hVar2 = new e2.h("notifications", linkedHashMap2, new LinkedHashSet(), new LinkedHashSet());
        e2.h hVarD2 = com.bumptech.glide.c.D(aVar, "notifications");
        if (!hVar2.equals(hVarD2)) {
            return new w("notifications(app.namso_gen.spacehowen.data.NotificationItem).\n Expected:\n" + hVar2 + "\n Found:\n" + hVarD2, false);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put("id", new e2.e(1, "id", "INTEGER", null, true, 1));
        linkedHashMap3.put("gate", new e2.e(0, "gate", "TEXT", null, true, 1));
        linkedHashMap3.put("content", new e2.e(0, "content", "TEXT", null, true, 1));
        linkedHashMap3.put("total", new e2.e(0, "total", "INTEGER", null, true, 1));
        linkedHashMap3.put("createdAt", new e2.e(0, "createdAt", "INTEGER", null, true, 1));
        e2.h hVar3 = new e2.h("checker_batches", linkedHashMap3, new LinkedHashSet(), new LinkedHashSet());
        e2.h hVarD3 = com.bumptech.glide.c.D(aVar, "checker_batches");
        if (!hVar3.equals(hVarD3)) {
            return new w("checker_batches(app.namso_gen.spacehowen.data.CheckerBatch).\n Expected:\n" + hVar3 + "\n Found:\n" + hVarD3, false);
        }
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        linkedHashMap4.put("email", new e2.e(1, "email", "TEXT", null, true, 1));
        linkedHashMap4.put("createdAt", new e2.e(0, "createdAt", "INTEGER", null, true, 1));
        e2.h hVar4 = new e2.h("temp_mail_history", linkedHashMap4, new LinkedHashSet(), new LinkedHashSet());
        e2.h hVarD4 = com.bumptech.glide.c.D(aVar, "temp_mail_history");
        if (hVar4.equals(hVarD4)) {
            return new w(null, true);
        }
        return new w("temp_mail_history(app.namso_gen.spacehowen.data.TempMailHistory).\n Expected:\n" + hVar4 + "\n Found:\n" + hVarD4, false);
    }
}
