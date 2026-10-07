package androidx.activity;

import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends jc.j implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f409b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(b0 b0Var, int i) {
        super(0);
        this.f408a = i;
        this.f409b = b0Var;
    }

    @Override // ic.a
    public final Object a() {
        Object objPrevious;
        switch (this.f408a) {
            case 0:
                this.f409b.b();
                break;
            case 1:
                b0 b0Var = this.f409b;
                vb.g gVar = b0Var.f340b;
                ListIterator listIterator = gVar.listIterator(gVar.size());
                while (listIterator.hasPrevious()) {
                    objPrevious = listIterator.previous();
                    if (((androidx.fragment.app.b0) objPrevious).f847a) {
                        b0Var.f341c = null;
                        break;
                    }
                }
                objPrevious = null;
                b0Var.f341c = null;
                break;
            default:
                this.f409b.b();
                break;
        }
        return ub.k.f9073a;
    }
}
