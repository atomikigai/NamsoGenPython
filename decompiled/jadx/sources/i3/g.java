package i3;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements ic.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f5174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f5175c;

    public /* synthetic */ g(h hVar, f fVar, int i) {
        this.f5173a = i;
        this.f5174b = hVar;
        this.f5175c = fVar;
    }

    @Override // ic.l
    public final Object invoke(Object obj) {
        g2.a aVar = (g2.a) obj;
        switch (this.f5173a) {
            case 0:
                jc.i.e(aVar, "_connection");
                this.f5174b.f5179d.e(aVar, this.f5175c);
                return ub.k.f9073a;
            case 1:
                jc.i.e(aVar, "_connection");
                return Long.valueOf(this.f5174b.f5177b.g(aVar, this.f5175c));
            default:
                jc.i.e(aVar, "_connection");
                this.f5174b.f5178c.e(aVar, this.f5175c);
                return ub.k.f9073a;
        }
    }
}
