package bd;

import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class x implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f1696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f1697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f1698c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f1699d;
    public final k e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m f1700f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final z f1701r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final x f1702s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final x f1703t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final x f1704u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final long f1705v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final long f1706w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final fd.e f1707x;

    public x(v vVar, t tVar, String str, int i, k kVar, m mVar, z zVar, x xVar, x xVar2, x xVar3, long j4, long j10, fd.e eVar) {
        jc.i.e(vVar, "request");
        jc.i.e(tVar, "protocol");
        jc.i.e(str, "message");
        this.f1696a = vVar;
        this.f1697b = tVar;
        this.f1698c = str;
        this.f1699d = i;
        this.e = kVar;
        this.f1700f = mVar;
        this.f1701r = zVar;
        this.f1702s = xVar;
        this.f1703t = xVar2;
        this.f1704u = xVar3;
        this.f1705v = j4;
        this.f1706w = j10;
        this.f1707x = eVar;
    }

    public static String c(x xVar, String str) {
        xVar.getClass();
        String strD = xVar.f1700f.d(str);
        if (strD == null) {
            return null;
        }
        return strD;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        z zVar = this.f1701r;
        if (zVar == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        zVar.close();
    }

    public final boolean d() {
        int i = this.f1699d;
        return 200 <= i && i < 300;
    }

    public final w g() {
        w wVar = new w();
        wVar.f1686a = this.f1696a;
        wVar.f1687b = this.f1697b;
        wVar.f1688c = this.f1699d;
        wVar.f1689d = this.f1698c;
        wVar.e = this.e;
        wVar.f1690f = this.f1700f.h();
        wVar.f1691g = this.f1701r;
        wVar.h = this.f1702s;
        wVar.i = this.f1703t;
        wVar.f1692j = this.f1704u;
        wVar.f1693k = this.f1705v;
        wVar.f1694l = this.f1706w;
        wVar.f1695m = this.f1707x;
        return wVar;
    }

    public final String toString() {
        return "Response{protocol=" + this.f1697b + ", code=" + this.f1699d + ", message=" + this.f1698c + ", url=" + ((o) this.f1696a.f1682c) + '}';
    }
}
