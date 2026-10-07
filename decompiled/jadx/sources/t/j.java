package t;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements m9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f8517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f8518b = new i(this);

    public j(h hVar) {
        this.f8517a = new WeakReference(hVar);
    }

    @Override // m9.a
    public final void addListener(Runnable runnable, Executor executor) {
        this.f8518b.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z4) {
        h hVar = (h) this.f8517a.get();
        boolean zCancel = this.f8518b.cancel(z4);
        if (zCancel && hVar != null) {
            hVar.f8512a = null;
            hVar.f8513b = null;
            hVar.f8514c.i(null);
        }
        return zCancel;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f8518b.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f8518b.f8509a instanceof a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f8518b.isDone();
    }

    public final String toString() {
        return this.f8518b.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j4, TimeUnit timeUnit) {
        return this.f8518b.get(j4, timeUnit);
    }
}
