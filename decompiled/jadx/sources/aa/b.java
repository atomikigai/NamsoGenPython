package aa;

import android.util.Log;
import fa.t0;
import java.util.concurrent.atomic.AtomicReference;
import x9.o;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f259c = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f261b = new AtomicReference(null);

    public b(o oVar) {
        this.f260a = oVar;
        oVar.a(new a5.a(this, 1));
    }

    public final d a(String str) {
        b bVar = (b) this.f261b.get();
        return bVar == null ? f259c : bVar.a(str);
    }

    public final boolean b() {
        b bVar = (b) this.f261b.get();
        return bVar != null && bVar.b();
    }

    public final boolean c(String str) {
        b bVar = (b) this.f261b.get();
        return bVar != null && bVar.c(str);
    }

    public final void d(String str, long j4, t0 t0Var) {
        String strB = u3.b.b("Deferring native open session: ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", strB, null);
        }
        this.f260a.a(new a(str, j4, t0Var));
    }
}
