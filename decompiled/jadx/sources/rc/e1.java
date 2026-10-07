package rc;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public class e1 extends l1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f8269c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(b1 b1Var) {
        super(true);
        boolean z4 = true;
        F(b1Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = l1.f8301b;
        n nVar = (n) atomicReferenceFieldUpdater.get(this);
        o oVar = nVar instanceof o ? (o) nVar : null;
        if (oVar == null) {
            z4 = false;
            break;
        }
        l1 l1VarL = oVar.l();
        while (!l1VarL.x()) {
            n nVar2 = (n) atomicReferenceFieldUpdater.get(l1VarL);
            o oVar2 = nVar2 instanceof o ? (o) nVar2 : null;
            if (oVar2 == null) {
                z4 = false;
                break;
            }
            l1VarL = oVar2.l();
        }
        this.f8269c = z4;
    }

    @Override // rc.l1
    public final boolean x() {
        return this.f8269c;
    }

    @Override // rc.l1
    public final boolean y() {
        return true;
    }
}
