package bd;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v f1686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public t f1687b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f1689d;
    public k e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public z f1691g;
    public x h;
    public x i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public x f1692j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f1693k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f1694l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public fd.e f1695m;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1688c = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public l f1690f = new l(0);

    public static void b(x xVar, String str) {
        if (xVar != null) {
            if (xVar.f1701r != null) {
                throw new IllegalArgumentException(str.concat(".body != null").toString());
            }
            if (xVar.f1702s != null) {
                throw new IllegalArgumentException(str.concat(".networkResponse != null").toString());
            }
            if (xVar.f1703t != null) {
                throw new IllegalArgumentException(str.concat(".cacheResponse != null").toString());
            }
            if (xVar.f1704u != null) {
                throw new IllegalArgumentException(str.concat(".priorResponse != null").toString());
            }
        }
    }

    public final x a() {
        int i = this.f1688c;
        if (i < 0) {
            throw new IllegalStateException(("code < 0: " + this.f1688c).toString());
        }
        v vVar = this.f1686a;
        if (vVar == null) {
            throw new IllegalStateException("request == null");
        }
        t tVar = this.f1687b;
        if (tVar == null) {
            throw new IllegalStateException("protocol == null");
        }
        String str = this.f1689d;
        if (str != null) {
            return new x(vVar, tVar, str, i, this.e, this.f1690f.b(), this.f1691g, this.h, this.i, this.f1692j, this.f1693k, this.f1694l, this.f1695m);
        }
        throw new IllegalStateException("message == null");
    }
}
