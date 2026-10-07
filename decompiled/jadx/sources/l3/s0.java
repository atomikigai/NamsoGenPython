package l3;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s0 implements ic.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b1 f6677b;

    public /* synthetic */ s0(b1 b1Var, int i) {
        this.f6676a = i;
        this.f6677b = b1Var;
    }

    @Override // ic.l
    public final Object invoke(Object obj) {
        boolean zA;
        b1 b1Var = (b1) obj;
        switch (this.f6676a) {
            case 0:
                jc.i.e(b1Var, "it");
                zA = jc.i.a(b1Var.a(), this.f6677b.a());
                break;
            default:
                jc.i.e(b1Var, "it");
                zA = jc.i.a(b1Var.a(), this.f6677b.a());
                break;
        }
        return Boolean.valueOf(zA);
    }
}
