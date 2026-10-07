package tc;

import java.util.concurrent.CancellationException;
import rc.b0;
import rc.c1;
import rc.i1;
import rc.s;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class n extends rc.a implements o, f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f8711d;

    public n(yb.i iVar, b bVar) {
        super(iVar, true);
        this.f8711d = bVar;
    }

    @Override // rc.a
    public final void V(boolean z4, Throwable th) {
        if (this.f8711d.g(false, th) || z4) {
            return;
        }
        b0.n(th, this.f8249c);
    }

    @Override // rc.a
    public final void W(Object obj) {
        this.f8711d.g(false, null);
    }

    @Override // tc.q
    public final Object a(Object obj) {
        throw null;
    }

    @Override // rc.l1, rc.b1
    public final void d(CancellationException cancellationException) {
        Object objA = A();
        if (objA instanceof s) {
            return;
        }
        if ((objA instanceof i1) && ((i1) objA).d()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new c1(p(), null, this);
        }
        n(cancellationException);
    }

    @Override // tc.q
    public final Object h(Object obj, yb.d dVar) {
        return this.f8711d.h(obj, dVar);
    }

    @Override // tc.p
    public final a iterator() {
        b bVar = this.f8711d;
        bVar.getClass();
        return new a(bVar);
    }

    @Override // rc.l1
    public final void n(CancellationException cancellationException) {
        this.f8711d.g(true, cancellationException);
        m(cancellationException);
    }
}
