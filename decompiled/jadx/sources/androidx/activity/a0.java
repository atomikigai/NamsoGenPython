package androidx.activity;

import rc.b1;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a0 extends jc.h implements ic.a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f334t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(int i, Object obj, Class cls, String str, String str2, int i10, int i11, int i12) {
        super(i, obj, cls, str, str2, i10, i11);
        this.f334t = i12;
    }

    @Override // ic.a
    public final Object a() throws Exception {
        switch (this.f334t) {
            case 0:
                ((b0) this.f5761b).d();
                return ub.k.f9073a;
            case 1:
                ((b0) this.f5761b).d();
                return ub.k.f9073a;
            default:
                y1.v vVar = (y1.v) this.f5761b;
                wc.e eVar = vVar.f10515a;
                if (eVar == null) {
                    jc.i.i("coroutineScope");
                    throw null;
                }
                b1 b1Var = (b1) eVar.f9927a.H(rc.y.f8337b);
                if (b1Var == null) {
                    throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + eVar).toString());
                }
                b1Var.d(null);
                vVar.h();
                h6.m mVar = vVar.e;
                if (mVar != null) {
                    ((a2.b) mVar.f5033f).close();
                    return ub.k.f9073a;
                }
                jc.i.i("connectionManager");
                throw null;
        }
    }
}
