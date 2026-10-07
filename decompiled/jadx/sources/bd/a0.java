package bd;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f1547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Proxy f1548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InetSocketAddress f1549c;

    public a0(a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        jc.i.e(inetSocketAddress, "socketAddress");
        this.f1547a = aVar;
        this.f1548b = proxy;
        this.f1549c = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return jc.i.a(a0Var.f1547a, this.f1547a) && jc.i.a(a0Var.f1548b, this.f1548b) && jc.i.a(a0Var.f1549c, this.f1549c);
    }

    public final int hashCode() {
        return this.f1549c.hashCode() + ((this.f1548b.hashCode() + ((this.f1547a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.f1549c + '}';
    }
}
