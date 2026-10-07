package s5;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements d, t5.c, c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final i5.b f8438f = new i5.b("proto");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f8439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u5.a f8440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u5.a f8441c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f8442d;
    public final tb.a e;

    public i(u5.a aVar, u5.a aVar2, a aVar3, l lVar, tb.a aVar4) {
        this.f8439a = lVar;
        this.f8440b = aVar;
        this.f8441c = aVar2;
        this.f8442d = aVar3;
        this.e = aVar4;
    }

    public static String G(Iterable iterable) {
        StringBuilder sb2 = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb2.append(((b) it.next()).f8430a);
            if (it.hasNext()) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        return sb2.toString();
    }

    public static Object H(Cursor cursor, g gVar) {
        try {
            return gVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public static Long d(SQLiteDatabase sQLiteDatabase, l5.i iVar) {
        StringBuilder sb2 = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(iVar.f6822a, String.valueOf(v5.a.a(iVar.f6824c))));
        byte[] bArr = iVar.f6823b;
        if (bArr != null) {
            sb2.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb2.append(" and extras is null");
        }
        Cursor cursorQuery = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb2.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            return !cursorQuery.moveToNext() ? null : Long.valueOf(cursorQuery.getLong(0));
        } finally {
            cursorQuery.close();
        }
    }

    public final void B(long j4, o5.c cVar, String str) {
        g(new aa.a(str, cVar, j4));
    }

    public final Object E(t5.b bVar) {
        SQLiteDatabase sQLiteDatabaseC = c();
        u5.a aVar = this.f8441c;
        long jD = aVar.d();
        while (true) {
            try {
                sQLiteDatabaseC.beginTransaction();
                try {
                    Object objF = bVar.f();
                    sQLiteDatabaseC.setTransactionSuccessful();
                    return objF;
                } finally {
                    sQLiteDatabaseC.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e) {
                if (aVar.d() >= ((long) this.f8442d.f8428c) + jD) {
                    throw new t5.a("Timed out while trying to acquire the lock.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    public final SQLiteDatabase c() {
        l lVar = this.f8439a;
        Objects.requireNonNull(lVar);
        u5.a aVar = this.f8441c;
        long jD = aVar.d();
        while (true) {
            try {
                return lVar.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e) {
                if (aVar.d() >= ((long) this.f8442d.f8428c) + jD) {
                    throw new t5.a("Timed out while trying to open db.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f8439a.close();
    }

    public final Object g(g gVar) {
        SQLiteDatabase sQLiteDatabaseC = c();
        sQLiteDatabaseC.beginTransaction();
        try {
            Object objApply = gVar.apply(sQLiteDatabaseC);
            sQLiteDatabaseC.setTransactionSuccessful();
            return objApply;
        } finally {
            sQLiteDatabaseC.endTransaction();
        }
    }

    public final ArrayList o(SQLiteDatabase sQLiteDatabase, l5.i iVar, int i) {
        ArrayList arrayList = new ArrayList();
        Long lD = d(sQLiteDatabase, iVar);
        if (lD == null) {
            return arrayList;
        }
        H(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{lD.toString()}, null, null, null, String.valueOf(i)), new e5.d(this, arrayList, iVar, 9));
        return arrayList;
    }
}
