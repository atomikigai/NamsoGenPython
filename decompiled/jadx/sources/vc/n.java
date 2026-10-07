package vc;

import rc.b1;
import rc.l1;
import rc.y;
import wc.s;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class n extends jc.j implements ic.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f9337a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(k kVar) {
        super(2);
        this.f9337a = kVar;
    }

    @Override // ic.p
    public final Object invoke(Object obj, Object obj2) {
        int iIntValue = ((Number) obj).intValue();
        yb.g gVar = (yb.g) obj2;
        yb.h key = gVar.getKey();
        yb.g gVarH = this.f9337a.f9332b.H(key);
        if (key != y.f8337b) {
            return Integer.valueOf(gVar != gVarH ? Integer.MIN_VALUE : iIntValue + 1);
        }
        b1 b1Var = (b1) gVarH;
        b1 parent = (b1) gVar;
        while (true) {
            if (parent != null) {
                if (parent == b1Var || !(parent instanceof s)) {
                    break;
                }
                rc.n nVar = (rc.n) l1.f8301b.get((l1) parent);
                parent = nVar != null ? nVar.getParent() : null;
            } else {
                parent = null;
                break;
            }
        }
        if (parent == b1Var) {
            if (b1Var != null) {
                iIntValue++;
            }
            return Integer.valueOf(iIntValue);
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + parent + ", expected child of " + b1Var + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
    }
}
