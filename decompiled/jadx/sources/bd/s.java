package bd;

import java.net.Proxy;
import java.net.ProxySelector;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class s implements Cloneable {
    public static final List L = cd.b.k(t.HTTP_2, t.HTTP_1_1);
    public static final List M = cd.b.k(i.e, i.f1598f);
    public final SSLSocketFactory A;
    public final X509TrustManager B;
    public final List C;
    public final List D;
    public final nd.c E;
    public final e F;
    public final r7.g G;
    public final int H;
    public final int I;
    public final int J;
    public final ib.c K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a3.j f1654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a4.b f1655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f1656c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f1657d;
    public final a5.f e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f1658f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final b f1659r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f1660s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f1661t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final b f1662u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final b f1663v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Proxy f1664w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ProxySelector f1665x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final b f1666y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final SocketFactory f1667z;

    public s(r rVar) throws NoSuchAlgorithmException, KeyStoreException {
        ProxySelector proxySelector;
        this.f1654a = rVar.f1636a;
        this.f1655b = rVar.f1637b;
        this.f1656c = cd.b.w(rVar.f1638c);
        this.f1657d = cd.b.w(rVar.f1639d);
        this.e = rVar.e;
        this.f1658f = rVar.f1640f;
        this.f1659r = rVar.f1641g;
        this.f1660s = rVar.h;
        this.f1661t = rVar.i;
        this.f1662u = rVar.f1642j;
        this.f1663v = rVar.f1643k;
        Proxy proxy = rVar.f1644l;
        this.f1664w = proxy;
        if (proxy != null || (proxySelector = ProxySelector.getDefault()) == null) {
            proxySelector = ld.a.f6956a;
        }
        this.f1665x = proxySelector;
        this.f1666y = rVar.f1645m;
        this.f1667z = rVar.f1646n;
        List list = rVar.f1647o;
        this.C = list;
        this.D = rVar.f1648p;
        this.E = rVar.f1649q;
        this.H = rVar.f1651s;
        this.I = rVar.f1652t;
        this.J = rVar.f1653u;
        this.K = new ib.c(15);
        if (list != null && list.isEmpty()) {
            this.A = null;
            this.G = null;
            this.B = null;
            this.F = e.f1574c;
            break;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                this.A = null;
                this.G = null;
                this.B = null;
                this.F = e.f1574c;
                break;
            }
            if (((i) it.next()).f1599a) {
                jd.n nVar = jd.n.f5799a;
                X509TrustManager x509TrustManagerM = jd.n.f5799a.m();
                this.B = x509TrustManagerM;
                this.A = jd.n.f5799a.l(x509TrustManagerM);
                r7.g gVarB = jd.n.f5799a.b(x509TrustManagerM);
                this.G = gVarB;
                e eVar = rVar.f1650r;
                this.F = jc.i.a(eVar.f1576b, gVarB) ? eVar : new e(eVar.f1575a, gVarB);
                break;
            }
        }
        X509TrustManager x509TrustManager = this.B;
        r7.g gVar = this.G;
        SSLSocketFactory sSLSocketFactory = this.A;
        List list2 = this.f1657d;
        List list3 = this.f1656c;
        jc.i.c(list3, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (list3.contains(null)) {
            throw new IllegalStateException(("Null interceptor: " + list3).toString());
        }
        jc.i.c(list2, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (list2.contains(null)) {
            throw new IllegalStateException(("Null network interceptor: " + list2).toString());
        }
        List list4 = this.C;
        if (list4 == null || !list4.isEmpty()) {
            Iterator it2 = list4.iterator();
            while (it2.hasNext()) {
                if (((i) it2.next()).f1599a) {
                    if (sSLSocketFactory == null) {
                        throw new IllegalStateException("sslSocketFactory == null");
                    }
                    if (gVar == null) {
                        throw new IllegalStateException("certificateChainCleaner == null");
                    }
                    if (x509TrustManager == null) {
                        throw new IllegalStateException("x509TrustManager == null");
                    }
                    return;
                }
            }
        }
        if (sSLSocketFactory != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (gVar != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (x509TrustManager != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (!jc.i.a(this.F, e.f1574c)) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final Object clone() {
        return super.clone();
    }

    public s() {
        this(new r());
    }
}
