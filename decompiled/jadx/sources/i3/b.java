package i3;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements ic.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f5163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f5164c;

    public /* synthetic */ b(e eVar, a aVar, int i) {
        this.f5162a = i;
        this.f5163b = eVar;
        this.f5164c = aVar;
    }

    @Override // ic.l
    public final Object invoke(Object obj) {
        g2.a aVar = (g2.a) obj;
        switch (this.f5162a) {
            case 0:
                jc.i.e(aVar, "_connection");
                this.f5163b.f5169c.e(aVar, this.f5164c);
                return ub.k.f9073a;
            default:
                jc.i.e(aVar, "_connection");
                return Long.valueOf(this.f5163b.f5168b.g(aVar, this.f5164c));
        }
    }
}
