package rc;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class j1 extends wc.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f1 f8285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public m1 f8286c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l1 f8287d;
    public final /* synthetic */ y0 e;

    public j1(f1 f1Var, l1 l1Var, y0 y0Var) {
        this.f8287d = l1Var;
        this.e = y0Var;
        this.f8285b = f1Var;
    }

    @Override // wc.b
    public final void b(Object obj, Object obj2) {
        wc.k kVar = (wc.k) obj;
        boolean z4 = obj2 == null;
        f1 f1Var = this.f8285b;
        y0 y0Var = z4 ? f1Var : this.f8286c;
        if (y0Var != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = wc.k.f9939a;
            while (!atomicReferenceFieldUpdater.compareAndSet(kVar, this, y0Var)) {
                if (atomicReferenceFieldUpdater.get(kVar) != this) {
                    return;
                }
            }
            if (z4) {
                m1 m1Var = this.f8286c;
                jc.i.b(m1Var);
                f1Var.h(m1Var);
            }
        }
    }

    @Override // wc.b
    public final i6.e c(Object obj) {
        if (this.f8287d.A() == this.e) {
            return null;
        }
        return wc.a.e;
    }
}
