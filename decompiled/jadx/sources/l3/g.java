package l3;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements ic.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f6560b;

    public /* synthetic */ g(String str, int i) {
        this.f6559a = i;
        this.f6560b = str;
    }

    @Override // ic.l
    public final Object invoke(Object obj) {
        switch (this.f6559a) {
            case 0:
                n3.c cVar = (n3.c) obj;
                return Boolean.valueOf(jc.i.a(cVar.f7247b + ':' + cVar.f7248c, this.f6560b));
            case 1:
                b1 b1Var = (b1) obj;
                jc.i.e(b1Var, "it");
                return Boolean.valueOf(!jc.i.a(b1Var.a(), this.f6560b));
            default:
                String str = (String) obj;
                jc.i.e(str, "it");
                boolean zM0 = pc.g.m0(str);
                String str2 = this.f6560b;
                if (zM0) {
                    return str.length() < str2.length() ? str2 : str;
                }
                return da.v.h(str2, str);
        }
    }
}
