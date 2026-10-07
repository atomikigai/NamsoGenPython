package a2;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements w, y1.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f59a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f60b;

    public /* synthetic */ p(Object obj, int i) {
        this.f59a = i;
        this.f60b = obj;
    }

    @Override // y1.o
    public final Object b(String str, ic.l lVar, ac.c cVar) {
        switch (this.f59a) {
            case 0:
                return ((v) this.f60b).b(str, lVar, cVar);
            default:
                return ((b2.d) this.f60b).b(str, lVar, cVar);
        }
    }

    @Override // a2.w
    public final g2.a d() {
        switch (this.f59a) {
            case 0:
                return ((v) this.f60b).f83a;
            default:
                return ((b2.d) this.f60b).f1355a;
        }
    }
}
