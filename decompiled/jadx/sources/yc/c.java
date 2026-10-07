package yc;

import java.util.concurrent.Executor;
import rc.v0;
import rc.x;
import wc.v;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends v0 implements Executor {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f10693c = new c();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x f10694d;

    static {
        x iVar = k.f10707c;
        int i = v.f9956a;
        if (64 >= i) {
            i = 64;
        }
        int iK = wc.a.k(i, 12, "kotlinx.coroutines.io.parallelism");
        iVar.getClass();
        wc.a.a(iK);
        if (iK < j.f10704d) {
            wc.a.a(iK);
            iVar = new wc.i(iVar, iK);
        }
        f10694d = iVar;
    }

    @Override // rc.x
    public final void S(yb.i iVar, Runnable runnable) {
        f10694d.S(iVar, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        S(yb.j.f10674a, runnable);
    }

    @Override // rc.x
    public final String toString() {
        return "Dispatchers.IO";
    }
}
