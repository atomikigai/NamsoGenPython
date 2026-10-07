package bd;

import androidx.webkit.ProxyConfig;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f1539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SocketFactory f1540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SSLSocketFactory f1541c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HostnameVerifier f1542d;
    public final e e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b f1543f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Proxy f1544g;
    public final ProxySelector h;
    public final o i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f1545j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List f1546k;

    public a(String str, int i, b bVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, e eVar, b bVar2, Proxy proxy, List list, List list2, ProxySelector proxySelector) {
        jc.i.e(str, "uriHost");
        jc.i.e(bVar, "dns");
        jc.i.e(socketFactory, "socketFactory");
        jc.i.e(bVar2, "proxyAuthenticator");
        jc.i.e(list, "protocols");
        jc.i.e(list2, "connectionSpecs");
        jc.i.e(proxySelector, "proxySelector");
        this.f1539a = bVar;
        this.f1540b = socketFactory;
        this.f1541c = sSLSocketFactory;
        this.f1542d = hostnameVerifier;
        this.e = eVar;
        this.f1543f = bVar2;
        this.f1544g = proxy;
        this.h = proxySelector;
        n nVar = new n();
        String str2 = sSLSocketFactory != null ? ProxyConfig.MATCH_HTTPS : ProxyConfig.MATCH_HTTP;
        if (str2.equalsIgnoreCase(ProxyConfig.MATCH_HTTP)) {
            nVar.f1620b = ProxyConfig.MATCH_HTTP;
        } else {
            if (!str2.equalsIgnoreCase(ProxyConfig.MATCH_HTTPS)) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(str2));
            }
            nVar.f1620b = ProxyConfig.MATCH_HTTPS;
        }
        String strD = n9.b.D(b.e(0, 0, str, 7));
        if (strD == null) {
            throw new IllegalArgumentException("unexpected host: ".concat(str));
        }
        nVar.f1623f = strD;
        if (1 > i || i >= 65536) {
            throw new IllegalArgumentException(da.v.f(i, "unexpected port: ").toString());
        }
        nVar.f1621c = i;
        this.i = nVar.a();
        this.f1545j = cd.b.w(list);
        this.f1546k = cd.b.w(list2);
    }

    public final boolean a(a aVar) {
        jc.i.e(aVar, "that");
        return jc.i.a(this.f1539a, aVar.f1539a) && jc.i.a(this.f1543f, aVar.f1543f) && jc.i.a(this.f1545j, aVar.f1545j) && jc.i.a(this.f1546k, aVar.f1546k) && jc.i.a(this.h, aVar.h) && jc.i.a(this.f1544g, aVar.f1544g) && jc.i.a(this.f1541c, aVar.f1541c) && jc.i.a(this.f1542d, aVar.f1542d) && jc.i.a(this.e, aVar.e) && this.i.e == aVar.i.e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return jc.i.a(this.i, aVar.i) && a(aVar);
    }

    public final int hashCode() {
        return Objects.hashCode(this.e) + ((Objects.hashCode(this.f1542d) + ((Objects.hashCode(this.f1541c) + ((Objects.hashCode(this.f1544g) + ((this.h.hashCode() + ((this.f1546k.hashCode() + ((this.f1545j.hashCode() + ((this.f1543f.hashCode() + ((this.f1539a.hashCode() + da.v.d(527, 31, this.i.h)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("Address{");
        o oVar = this.i;
        sb2.append(oVar.f1629d);
        sb2.append(':');
        sb2.append(oVar.e);
        sb2.append(", ");
        Proxy proxy = this.f1544g;
        if (proxy != null) {
            str = "proxy=" + proxy;
        } else {
            str = "proxySelector=" + this.h;
        }
        sb2.append(str);
        sb2.append('}');
        return sb2.toString();
    }
}
