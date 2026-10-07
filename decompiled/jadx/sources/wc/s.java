package wc;

import rc.b0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public class s extends rc.a implements ac.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final yb.d f9952d;

    public s(yb.d dVar, yb.i iVar) {
        super(iVar, true);
        this.f9952d = dVar;
    }

    @Override // rc.l1
    public final boolean J() {
        return true;
    }

    @Override // ac.d
    public final ac.d getCallerFrame() {
        yb.d dVar = this.f9952d;
        if (dVar instanceof ac.d) {
            return (ac.d) dVar;
        }
        return null;
    }

    @Override // rc.l1
    public void k(Object obj) {
        a.h(b0.s(obj), qd.b.r(this.f9952d));
    }

    @Override // rc.l1
    public void l(Object obj) {
        this.f9952d.resumeWith(b0.s(obj));
    }
}
