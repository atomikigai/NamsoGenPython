package q0;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a1 extends ac.h implements ic.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f7879c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ View f7880d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(View view, yb.d dVar) {
        super(dVar);
        this.f7880d = view;
    }

    @Override // ac.a
    public final yb.d create(Object obj, yb.d dVar) {
        a1 a1Var = new a1(this.f7880d, dVar);
        a1Var.f7879c = obj;
        return a1Var;
    }

    @Override // ic.p
    public final Object invoke(Object obj, Object obj2) {
        return ((a1) create((oc.f) obj, (yb.d) obj2)).invokeSuspend(ub.k.f9073a);
    }

    @Override // ac.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object obj3 = zb.a.f11555a;
        int i = this.f7878b;
        View view = this.f7880d;
        if (i == 0) {
            r7.g.G(obj);
            oc.f fVar = (oc.f) this.f7879c;
            this.f7879c = fVar;
            this.f7878b = 1;
            fVar.b(view, this);
            return obj3;
        }
        Object obj4 = ub.k.f9073a;
        if (i == 1) {
            oc.f fVar2 = (oc.f) this.f7879c;
            r7.g.G(obj);
            if (view instanceof ViewGroup) {
                z0 z0Var = new z0((ViewGroup) view, null);
                this.f7879c = null;
                this.f7878b = 2;
                fVar2.getClass();
                oc.f fVarT = com.bumptech.glide.d.t(z0Var);
                if (fVarT.hasNext()) {
                    fVar2.f7712c = fVarT;
                    fVar2.f7710a = 2;
                    fVar2.f7713d = this;
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
            }
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r7.g.G(obj);
        }
        return obj4;
    }
}
