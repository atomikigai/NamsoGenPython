package androidx.activity;

import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class t extends jc.j implements ic.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f407b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(b0 b0Var, int i) {
        super(1);
        this.f406a = i;
        this.f407b = b0Var;
    }

    @Override // ic.l
    public final Object invoke(Object obj) {
        Object objPrevious;
        Object objPrevious2;
        switch (this.f406a) {
            case 0:
                jc.i.e((b) obj, "backEvent");
                b0 b0Var = this.f407b;
                vb.g gVar = b0Var.f340b;
                ListIterator listIterator = gVar.listIterator(gVar.size());
                while (listIterator.hasPrevious()) {
                    objPrevious = listIterator.previous();
                    if (((androidx.fragment.app.b0) objPrevious).f847a) {
                        b0Var.f341c = (androidx.fragment.app.b0) objPrevious;
                        break;
                    }
                }
                objPrevious = null;
                b0Var.f341c = (androidx.fragment.app.b0) objPrevious;
                break;
            default:
                jc.i.e((b) obj, "backEvent");
                vb.g gVar2 = this.f407b.f340b;
                ListIterator listIterator2 = gVar2.listIterator(gVar2.size());
                while (listIterator2.hasPrevious()) {
                    objPrevious2 = listIterator2.previous();
                    if (((androidx.fragment.app.b0) objPrevious2).f847a) {
                        break;
                    }
                }
                objPrevious2 = null;
                break;
        }
        return ub.k.f9073a;
    }
}
