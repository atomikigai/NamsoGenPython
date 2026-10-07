package y1;

import android.database.Cursor;
import androidx.work.impl.WorkDatabase_Impl;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class x extends h2.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f10525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f10526c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a5.b f10527d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(a aVar, a5.b bVar) {
        super(12);
        jc.i.e(aVar, "configuration");
        this.f10526c = aVar.e;
        this.f10525b = aVar;
        this.f10527d = bVar;
    }

    @Override // h2.c
    public final void h(i2.d dVar) throws IOException {
        Cursor cursorP = dVar.p(new h2.a("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'"));
        try {
            boolean z4 = false;
            if (cursorP.moveToFirst() && cursorP.getInt(0) == 0) {
                z4 = true;
            }
            cursorP.close();
            a5.b.t(dVar);
            if (!z4) {
                w wVarY = a5.b.y(dVar);
                if (!wVarY.f10523a) {
                    throw new IllegalStateException("Pre-packaged database has an invalid schema: " + wVarY.f10524b);
                }
            }
            dVar.i("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            dVar.i("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
            int i = WorkDatabase_Impl.f1253u;
            List list = this.f10526c;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((t) it.next()).getClass();
                }
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                r7.g.h(cursorP, th);
                throw th2;
            }
        }
    }

    @Override // h2.c
    public final void i(i2.d dVar, int i, int i10) throws IOException {
        k(dVar, i, i10);
    }

    @Override // h2.c
    public final void j(i2.d dVar) throws IOException {
        Cursor cursorP = dVar.p(new h2.a("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'"));
        try {
            boolean z4 = cursorP.moveToFirst() && cursorP.getInt(0) != 0;
            cursorP.close();
            if (z4) {
                Cursor cursorP2 = dVar.p(new h2.a("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
                try {
                    String string = cursorP2.moveToFirst() ? cursorP2.getString(0) : null;
                    cursorP2.close();
                    if (!"c103703e120ae8cc73c9248622f3cd1e".equals(string) && !"49f946663a8deb7054212b8adda248c6".equals(string)) {
                        throw new IllegalStateException(u3.b.b("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: c103703e120ae8cc73c9248622f3cd1e, found: ", string));
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        r7.g.h(cursorP2, th);
                        throw th2;
                    }
                }
            } else {
                w wVarY = a5.b.y(dVar);
                if (!wVarY.f10523a) {
                    throw new IllegalStateException("Pre-packaged database has an invalid schema: " + wVarY.f10524b);
                }
                dVar.i("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                dVar.i("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
            }
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f10527d.f188b;
            int i = WorkDatabase_Impl.f1253u;
            dVar.i("PRAGMA foreign_keys = ON");
            workDatabase_Impl.o(new b2.a(dVar));
            List list = this.f10526c;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((t) it.next()).a(dVar);
                }
            }
            this.f10525b = null;
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                r7.g.h(cursorP, th3);
                throw th4;
            }
        }
    }

    @Override // h2.c
    public final void k(i2.d dVar, int i, int i10) throws IOException {
        a aVar = this.f10525b;
        if (aVar != null) {
            q3.e eVar = aVar.f10397d;
            eVar.getClass();
            List<c2.a> listJ = p3.a.j(eVar, i, i10);
            if (listJ != null) {
                n9.b.k(new b2.a(dVar));
                for (c2.a aVar2 : listJ) {
                    aVar2.getClass();
                    aVar2.a(dVar);
                }
                w wVarY = a5.b.y(dVar);
                if (!wVarY.f10523a) {
                    throw new IllegalStateException("Migration didn't properly handle: " + wVarY.f10524b);
                }
                dVar.i("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                dVar.i("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
                return;
            }
        }
        a aVar3 = this.f10525b;
        if (aVar3 == null || p3.a.m(aVar3, i, i10)) {
            throw new IllegalStateException("A migration from " + i + " to " + i10 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
        }
        if (aVar3.f10409s) {
            Cursor cursorP = dVar.p(new h2.a("SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'"));
            try {
                wb.c cVar = new wb.c(10);
                while (cursorP.moveToNext()) {
                    String string = cursorP.getString(0);
                    jc.i.b(string);
                    if (!pc.o.e0(string, "sqlite_", false) && !string.equals("android_metadata")) {
                        cVar.add(new ub.f(string, Boolean.valueOf(jc.i.a(cursorP.getString(1), "view"))));
                    }
                }
                wb.c cVarC = jd.d.c(cVar);
                cursorP.close();
                ListIterator listIterator = cVarC.listIterator(0);
                while (true) {
                    wb.a aVar4 = (wb.a) listIterator;
                    if (!aVar4.hasNext()) {
                        break;
                    }
                    ub.f fVar = (ub.f) aVar4.next();
                    String str = (String) fVar.f9065a;
                    if (((Boolean) fVar.f9066b).booleanValue()) {
                        dVar.i("DROP VIEW IF EXISTS " + str);
                    } else {
                        dVar.i("DROP TABLE IF EXISTS " + str);
                    }
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    r7.g.h(cursorP, th);
                    throw th2;
                }
            }
        } else {
            dVar.i("DROP TABLE IF EXISTS `Dependency`");
            dVar.i("DROP TABLE IF EXISTS `WorkSpec`");
            dVar.i("DROP TABLE IF EXISTS `WorkTag`");
            dVar.i("DROP TABLE IF EXISTS `SystemIdInfo`");
            dVar.i("DROP TABLE IF EXISTS `WorkName`");
            dVar.i("DROP TABLE IF EXISTS `WorkProgress`");
            dVar.i("DROP TABLE IF EXISTS `Preference`");
            int i11 = WorkDatabase_Impl.f1253u;
        }
        List list = this.f10526c;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((t) it.next()).getClass();
            }
        }
        a5.b.t(dVar);
    }

    @Override // h2.c
    public final void g(i2.d dVar) {
    }
}
