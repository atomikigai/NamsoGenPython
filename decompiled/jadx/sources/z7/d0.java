package z7;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends m0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f11065c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f11066d;

    public d0(a1 a1Var) {
        super(a1Var);
        this.f11065c = new i(this, ((a1) this.f159a).f11000a);
    }

    @Override // z7.m0
    public final boolean f() {
        return false;
    }

    public final SQLiteDatabase g() {
        if (this.f11066d) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.f11065c.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.f11066d = true;
        return null;
    }

    public final void h() {
        int iDelete;
        a1 a1Var = (a1) this.f159a;
        c();
        try {
            SQLiteDatabase sQLiteDatabaseG = g();
            if (sQLiteDatabaseG == null || (iDelete = sQLiteDatabaseG.delete("messages", null, null)) <= 0) {
                return;
            }
            i0 i0Var = a1Var.f11007t;
            a1.f(i0Var);
            i0Var.f11198y.c(Integer.valueOf(iDelete), "Reset local analytics data. records");
        } catch (SQLiteException e) {
            i0 i0Var2 = a1Var.f11007t;
            a1.f(i0Var2);
            i0Var2.f11190f.c(e, "Error resetting local analytics data. error");
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x006f A[PHI: r4
      0x006f: PHI (r4v4 int) = (r4v1 int), (r4v2 int), (r4v1 int) binds: [B:32:0x0080, B:28:0x006d, B:25:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    public final void j() {
        a1 a1Var = (a1) this.f159a;
        c();
        if (!this.f11066d && a1Var.f11000a.getDatabasePath("google_app_measurement_local.db").exists()) {
            int i = 5;
            for (int i10 = 0; i10 < 5; i10++) {
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    try {
                        SQLiteDatabase sQLiteDatabaseG = g();
                        if (sQLiteDatabaseG == null) {
                            this.f11066d = true;
                            return;
                        }
                        sQLiteDatabaseG.beginTransaction();
                        sQLiteDatabaseG.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                        sQLiteDatabaseG.setTransactionSuccessful();
                        sQLiteDatabaseG.endTransaction();
                        sQLiteDatabaseG.close();
                        return;
                    } catch (SQLiteException e) {
                        if (0 != 0) {
                            try {
                                if (sQLiteDatabase.inTransaction()) {
                                    sQLiteDatabase.endTransaction();
                                }
                            } catch (Throwable th) {
                                if (0 != 0) {
                                    sQLiteDatabase.close();
                                }
                                throw th;
                            }
                        }
                        i0 i0Var = a1Var.f11007t;
                        a1.f(i0Var);
                        i0Var.f11190f.c(e, "Error deleting app launch break from local database");
                        this.f11066d = true;
                        if (0 != 0) {
                            sQLiteDatabase.close();
                        }
                    }
                } catch (SQLiteDatabaseLockedException unused) {
                    SystemClock.sleep(i);
                    i += 20;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                } catch (SQLiteFullException e4) {
                    i0 i0Var2 = a1Var.f11007t;
                    a1.f(i0Var2);
                    i0Var2.f11190f.c(e4, "Error deleting app launch break from local database");
                    this.f11066d = true;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                }
            }
            i0 i0Var3 = a1Var.f11007t;
            a1.f(i0Var3);
            i0Var3.f11193t.b("Error deleting app launch break from local database in reasonable time");
        }
    }

    /* JADX WARN: Code duplicated, block: B:109:0x00f5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:0x014b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x014b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:0x014b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:69:0x00fb A[Catch: all -> 0x00ff, TryCatch #16 {all -> 0x00ff, blocks: (B:67:0x00f5, B:69:0x00fb, B:72:0x0101, B:90:0x0136), top: B:109:0x00f5 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0111  */
    /* JADX WARN: Code duplicated, block: B:76:0x0116 A[PHI: r9 r17
      0x0116: PHI (r9v3 android.database.sqlite.SQLiteDatabase) = (r9v2 android.database.sqlite.SQLiteDatabase), (r9v4 android.database.sqlite.SQLiteDatabase) binds: [B:75:0x0114, B:93:0x0148] A[DONT_GENERATE, DONT_INLINE]
      0x0116: PHI (r17v5 boolean) = (r17v4 boolean), (r17v6 boolean) binds: [B:75:0x0114, B:93:0x0148] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:83:0x0127  */
    /* JADX WARN: Code duplicated, block: B:85:0x012c  */
    /* JADX WARN: Code duplicated, block: B:92:0x0145  */
    /* JADX WARN: Code duplicated, block: B:97:0x0154  */
    /* JADX WARN: Code duplicated, block: B:99:0x0159  */
    public final boolean k(int i, byte[] bArr) {
        SQLiteDatabase sQLiteDatabaseG;
        boolean z4;
        boolean z10;
        Cursor cursorRawQuery;
        a1 a1Var = (a1) this.f159a;
        c();
        boolean z11 = false;
        z11 = false;
        if (!this.f11066d) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("type", Integer.valueOf(i));
            contentValues.put("entry", bArr);
            a1Var.getClass();
            i0 i0Var = a1Var.f11007t;
            int i10 = 0;
            int i11 = 5;
            for (int i12 = 5; i10 < i12; i12 = 5) {
                Cursor cursor = null;
                cursor = null;
                cursor = null;
                Cursor cursor2 = null;
                sQLiteDatabase = null;
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    sQLiteDatabaseG = g();
                    if (sQLiteDatabaseG == null) {
                        this.f11066d = true;
                    } else {
                        try {
                            try {
                                sQLiteDatabaseG.beginTransaction();
                                cursorRawQuery = sQLiteDatabaseG.rawQuery("select count(1) from messages", null);
                                long j4 = 0;
                                if (cursorRawQuery != null) {
                                    try {
                                        try {
                                            if (cursorRawQuery.moveToFirst()) {
                                                j4 = cursorRawQuery.getLong(z11 ? 1 : 0);
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                            cursor = cursorRawQuery;
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                            if (sQLiteDatabaseG != null) {
                                                sQLiteDatabaseG.close();
                                            }
                                            throw th;
                                        }
                                    } catch (SQLiteDatabaseLockedException unused) {
                                        z4 = z11 ? 1 : 0;
                                        cursor2 = cursorRawQuery;
                                        SystemClock.sleep(i11);
                                        i11 += 20;
                                        if (cursor2 != null) {
                                            cursor2.close();
                                        }
                                        if (sQLiteDatabaseG != null) {
                                            sQLiteDatabaseG.close();
                                        }
                                        i10++;
                                        z11 = z4;
                                    } catch (SQLiteFullException e) {
                                        e = e;
                                        z4 = z11 ? 1 : 0;
                                        sQLiteDatabase = sQLiteDatabaseG;
                                        a1.f(i0Var);
                                        i0Var.f11190f.c(e, "Error writing entry; local database full");
                                        this.f11066d = true;
                                        if (cursorRawQuery != null) {
                                            cursorRawQuery.close();
                                        }
                                        if (sQLiteDatabase != null) {
                                            sQLiteDatabase.close();
                                        }
                                        i10++;
                                        z11 = z4;
                                    } catch (SQLiteException e4) {
                                        e = e4;
                                        z4 = z11 ? 1 : 0;
                                        z10 = true;
                                        sQLiteDatabase = sQLiteDatabaseG;
                                        if (sQLiteDatabase != null) {
                                            try {
                                                if (sQLiteDatabase.inTransaction()) {
                                                    sQLiteDatabase.endTransaction();
                                                }
                                            } catch (Throwable th2) {
                                                th = th2;
                                                sQLiteDatabaseG = sQLiteDatabase;
                                                cursor = cursorRawQuery;
                                                if (cursor != null) {
                                                    cursor.close();
                                                }
                                                if (sQLiteDatabaseG != null) {
                                                    sQLiteDatabaseG.close();
                                                }
                                                throw th;
                                            }
                                        }
                                        a1.f(i0Var);
                                        i0Var.f11190f.c(e, "Error writing entry to local database");
                                        this.f11066d = z10;
                                        if (cursorRawQuery != null) {
                                            cursorRawQuery.close();
                                        }
                                        if (sQLiteDatabase != null) {
                                            sQLiteDatabase.close();
                                        }
                                        i10++;
                                        z11 = z4;
                                    }
                                }
                                if (j4 >= 100000) {
                                    a1.f(i0Var);
                                    i0Var.f11190f.b("Data loss, local db full");
                                    long j10 = 100001 - j4;
                                    long jDelete = sQLiteDatabaseG.delete("messages", "rowid in (select rowid from messages order by rowid asc limit ?)", new String[]{Long.toString(j10)});
                                    if (jDelete != j10) {
                                        a1.f(i0Var);
                                        fd.b bVar = i0Var.f11190f;
                                        z4 = z11 ? 1 : 0;
                                        try {
                                            try {
                                                z10 = true;
                                                try {
                                                    bVar.e("Different delete count than expected in local db. expected, received, difference", Long.valueOf(j10), Long.valueOf(jDelete), Long.valueOf(j10 - jDelete));
                                                } catch (SQLiteFullException e10) {
                                                    e = e10;
                                                    sQLiteDatabase = sQLiteDatabaseG;
                                                    a1.f(i0Var);
                                                    i0Var.f11190f.c(e, "Error writing entry; local database full");
                                                    this.f11066d = true;
                                                    if (cursorRawQuery != null) {
                                                        cursorRawQuery.close();
                                                    }
                                                    if (sQLiteDatabase != null) {
                                                        sQLiteDatabase.close();
                                                    }
                                                    i10++;
                                                    z11 = z4;
                                                } catch (SQLiteException e11) {
                                                    e = e11;
                                                    sQLiteDatabase = sQLiteDatabaseG;
                                                    if (sQLiteDatabase != null) {
                                                        if (sQLiteDatabase.inTransaction()) {
                                                            sQLiteDatabase.endTransaction();
                                                        }
                                                    }
                                                    a1.f(i0Var);
                                                    i0Var.f11190f.c(e, "Error writing entry to local database");
                                                    this.f11066d = z10;
                                                    if (cursorRawQuery != null) {
                                                        cursorRawQuery.close();
                                                    }
                                                    if (sQLiteDatabase != null) {
                                                        sQLiteDatabase.close();
                                                    }
                                                    i10++;
                                                    z11 = z4;
                                                }
                                            } catch (SQLiteDatabaseLockedException unused2) {
                                                cursor2 = cursorRawQuery;
                                                SystemClock.sleep(i11);
                                                i11 += 20;
                                                if (cursor2 != null) {
                                                    cursor2.close();
                                                }
                                                if (sQLiteDatabaseG != null) {
                                                    sQLiteDatabaseG.close();
                                                }
                                                i10++;
                                                z11 = z4;
                                            }
                                        } catch (SQLiteFullException e12) {
                                            e = e12;
                                            sQLiteDatabase = sQLiteDatabaseG;
                                            a1.f(i0Var);
                                            i0Var.f11190f.c(e, "Error writing entry; local database full");
                                            this.f11066d = true;
                                            if (cursorRawQuery != null) {
                                                cursorRawQuery.close();
                                            }
                                            if (sQLiteDatabase != null) {
                                                sQLiteDatabase.close();
                                            }
                                            i10++;
                                            z11 = z4;
                                        } catch (SQLiteException e13) {
                                            e = e13;
                                            z10 = true;
                                            sQLiteDatabase = sQLiteDatabaseG;
                                            if (sQLiteDatabase != null) {
                                                if (sQLiteDatabase.inTransaction()) {
                                                    sQLiteDatabase.endTransaction();
                                                }
                                            }
                                            a1.f(i0Var);
                                            i0Var.f11190f.c(e, "Error writing entry to local database");
                                            this.f11066d = z10;
                                            if (cursorRawQuery != null) {
                                                cursorRawQuery.close();
                                            }
                                            if (sQLiteDatabase != null) {
                                                sQLiteDatabase.close();
                                            }
                                            i10++;
                                            z11 = z4;
                                        }
                                    } else {
                                        z4 = z11 ? 1 : 0;
                                        z10 = true;
                                    }
                                } else {
                                    z4 = z11 ? 1 : 0;
                                    z10 = true;
                                }
                                sQLiteDatabaseG.insertOrThrow("messages", null, contentValues);
                                sQLiteDatabaseG.setTransactionSuccessful();
                                sQLiteDatabaseG.endTransaction();
                                if (cursorRawQuery != null) {
                                    cursorRawQuery.close();
                                }
                                sQLiteDatabaseG.close();
                                return z10;
                            } catch (Throwable th3) {
                                th = th3;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                if (sQLiteDatabaseG != null) {
                                    sQLiteDatabaseG.close();
                                }
                                throw th;
                            }
                        } catch (SQLiteDatabaseLockedException unused3) {
                            z4 = z11 ? 1 : 0;
                        } catch (SQLiteFullException e14) {
                            e = e14;
                            z4 = z11 ? 1 : 0;
                            cursorRawQuery = null;
                        } catch (SQLiteException e15) {
                            e = e15;
                            z4 = z11 ? 1 : 0;
                            z10 = true;
                            cursorRawQuery = null;
                        }
                    }
                } catch (SQLiteDatabaseLockedException unused4) {
                    z4 = z11 ? 1 : 0;
                    sQLiteDatabaseG = null;
                } catch (SQLiteFullException e16) {
                    e = e16;
                    z4 = z11 ? 1 : 0;
                    cursorRawQuery = null;
                } catch (SQLiteException e17) {
                    e = e17;
                    z4 = z11 ? 1 : 0;
                    z10 = true;
                    cursorRawQuery = null;
                } catch (Throwable th4) {
                    th = th4;
                    sQLiteDatabaseG = null;
                }
            }
            boolean z12 = z11 ? 1 : 0;
            a1.f(i0Var);
            i0Var.f11198y.b("Failed to write entry to local database");
            return z12;
        }
        return z11;
    }
}
