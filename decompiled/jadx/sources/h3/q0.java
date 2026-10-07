package h3;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q0 implements ic.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e1 f4808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f4809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f4810c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f4811d;
    public final /* synthetic */ String e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f4812f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ List f4813r;

    public /* synthetic */ q0(e1 e1Var, String str, boolean z4, String str2, String str3, int i, List list) {
        this.f4808a = e1Var;
        this.f4809b = str;
        this.f4810c = z4;
        this.f4811d = str2;
        this.e = str3;
        this.f4812f = i;
        this.f4813r = list;
    }

    @Override // ic.l
    public final Object invoke(Object obj) {
        v0 v0VarI0;
        t0 t0Var = (t0) obj;
        boolean z4 = t0Var != null;
        e1 e1Var = this.f4808a;
        boolean z10 = this.f4810c;
        Integer numValueOf = (!z10 || (v0VarI0 = e1.i0(e1Var.A0)) == null) ? null : Integer.valueOf(v0VarI0.f4872b);
        String str = this.f4809b;
        String strH0 = e1.h0(str, z4, z10, numValueOf);
        e1Var.m0(this.f4811d, str, strH0, this.e);
        e1Var.d0(str, new w0(str, strH0, t0Var));
        int i = this.f4812f;
        int i10 = i + 1;
        List list = this.f4813r;
        e1Var.f0(str, strH0, z10, i10 < list.size(), new l0(e1Var, list, z10, i, 4));
        return ub.k.f9073a;
    }
}
