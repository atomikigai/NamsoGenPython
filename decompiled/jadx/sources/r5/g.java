package r5;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import c3.j;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import l5.i;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements t5.b, y9.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f8192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f8193c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f8194d;
    public final /* synthetic */ Object e;

    public /* synthetic */ g(j jVar, Iterable iterable, i iVar, long j4) {
        this.f8191a = 0;
        this.f8193c = jVar;
        this.f8194d = iterable;
        this.e = iVar;
        this.f8192b = j4;
    }

    @Override // y9.g
    public ScheduledFuture a(final ta.c cVar) {
        switch (this.f8191a) {
            case 1:
                y9.f fVar = (y9.f) this.f8193c;
                Runnable runnable = (Runnable) this.f8194d;
                return fVar.f10654b.schedule(new y9.d(fVar, runnable, cVar, 1), this.f8192b, (TimeUnit) this.e);
            default:
                final y9.f fVar2 = (y9.f) this.f8193c;
                final Callable callable = (Callable) this.f8194d;
                return fVar2.f10654b.schedule(new Callable() { // from class: y9.e
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return fVar2.f10653a.submit(new androidx.webkit.b(21, callable, cVar));
                    }
                }, this.f8192b, (TimeUnit) this.e);
        }
    }

    @Override // t5.b
    public Object f() {
        j jVar = (j) this.f8193c;
        Iterable iterable = (Iterable) this.f8194d;
        i iVar = (i) this.e;
        s5.i iVar2 = (s5.i) ((s5.d) jVar.f1761c);
        iVar2.getClass();
        if (iterable.iterator().hasNext()) {
            String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + s5.i.G(iterable);
            SQLiteDatabase sQLiteDatabaseC = iVar2.c();
            sQLiteDatabaseC.beginTransaction();
            try {
                sQLiteDatabaseC.compileStatement(str).execute();
                Cursor cursorRawQuery = sQLiteDatabaseC.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                while (cursorRawQuery.moveToNext()) {
                    try {
                        iVar2.B(cursorRawQuery.getInt(0), o5.c.MAX_RETRIES_REACHED, cursorRawQuery.getString(1));
                    } catch (Throwable th) {
                        cursorRawQuery.close();
                        throw th;
                    }
                }
                cursorRawQuery.close();
                sQLiteDatabaseC.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                sQLiteDatabaseC.setTransactionSuccessful();
                sQLiteDatabaseC.endTransaction();
            } catch (Throwable th2) {
                sQLiteDatabaseC.endTransaction();
                throw th2;
            }
        }
        iVar2.g(new s5.f(((u5.a) jVar.f1764g).d() + this.f8192b, iVar));
        return null;
    }

    public /* synthetic */ g(y9.f fVar, Object obj, long j4, TimeUnit timeUnit, int i) {
        this.f8191a = i;
        this.f8193c = fVar;
        this.f8194d = obj;
        this.f8192b = j4;
        this.e = timeUnit;
    }
}
