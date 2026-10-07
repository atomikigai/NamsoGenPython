package i3;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements ic.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f5185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f5186c;

    public /* synthetic */ l(n nVar, o oVar, int i) {
        this.f5184a = i;
        this.f5185b = nVar;
        this.f5186c = oVar;
    }

    @Override // ic.l
    public final Object invoke(Object obj) {
        g2.a aVar = (g2.a) obj;
        switch (this.f5184a) {
            case 0:
                jc.i.e(aVar, "_connection");
                this.f5185b.f5189b.f(aVar, this.f5186c);
                break;
            default:
                jc.i.e(aVar, "_connection");
                this.f5185b.f5190c.e(aVar, this.f5186c);
                break;
        }
        return ub.k.f9073a;
    }
}
