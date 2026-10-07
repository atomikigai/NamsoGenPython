package q0;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class z0 extends ac.h implements ic.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewGroup f7966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f7967c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f7968d;
    public int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f7969f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f7970r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f7971s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(ViewGroup viewGroup, yb.d dVar) {
        super(dVar);
        this.f7971s = viewGroup;
    }

    @Override // ac.a
    public final yb.d create(Object obj, yb.d dVar) {
        z0 z0Var = new z0(this.f7971s, dVar);
        z0Var.f7970r = obj;
        return z0Var;
    }

    @Override // ic.p
    public final Object invoke(Object obj, Object obj2) {
        return ((z0) create((oc.f) obj, (yb.d) obj2)).invokeSuspend(ub.k.f9073a);
    }

    @Override // ac.a
    public final Object invokeSuspend(Object obj) {
        oc.f fVar;
        ViewGroup viewGroup;
        int childCount;
        int i;
        int i10;
        Object obj2;
        int i11;
        ViewGroup viewGroup2;
        oc.f fVar2;
        Object obj3 = zb.a.f11555a;
        int i12 = this.f7969f;
        Object obj4 = ub.k.f9073a;
        if (i12 != 0) {
            if (i12 == 1) {
                childCount = this.e;
                i10 = this.f7968d;
                View view = this.f7967c;
                viewGroup = this.f7966b;
                fVar = (oc.f) this.f7970r;
                r7.g.G(obj);
                if (view instanceof ViewGroup) {
                    z0 z0Var = new z0((ViewGroup) view, null);
                    this.f7970r = fVar;
                    this.f7966b = viewGroup;
                    this.f7967c = null;
                    this.f7968d = i10;
                    this.e = childCount;
                    this.f7969f = 2;
                    fVar.getClass();
                    oc.f fVarT = com.bumptech.glide.d.t(z0Var);
                    if (fVarT.hasNext()) {
                        fVar.f7712c = fVarT;
                        fVar.f7710a = 2;
                        fVar.f7713d = this;
                        obj2 = zb.a.f11555a;
                    } else {
                        obj2 = obj4;
                    }
                    if (obj2 != zb.a.f11555a) {
                        obj2 = obj4;
                    }
                    if (obj2 == obj3) {
                        return obj3;
                    }
                    i11 = i10;
                    viewGroup2 = viewGroup;
                    fVar2 = fVar;
                }
                i = i10 + 1;
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                childCount = this.e;
                i11 = this.f7968d;
                viewGroup2 = this.f7966b;
                fVar2 = (oc.f) this.f7970r;
                r7.g.G(obj);
            }
            viewGroup = viewGroup2;
            fVar = fVar2;
            i10 = i11;
            i = i10 + 1;
        } else {
            r7.g.G(obj);
            fVar = (oc.f) this.f7970r;
            viewGroup = this.f7971s;
            childCount = viewGroup.getChildCount();
            i = 0;
        }
        if (i >= childCount) {
            return obj4;
        }
        View childAt = viewGroup.getChildAt(i);
        this.f7970r = fVar;
        this.f7966b = viewGroup;
        this.f7967c = childAt;
        this.f7968d = i;
        this.e = childCount;
        this.f7969f = 1;
        fVar.b(childAt, this);
        return obj3;
    }
}
