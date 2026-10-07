package jd;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements nd.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X509TrustManager f5780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Method f5781b;

    public b(X509TrustManager x509TrustManager, Method method) {
        this.f5780a = x509TrustManager;
        this.f5781b = method;
    }

    @Override // nd.d
    public final X509Certificate a(X509Certificate x509Certificate) {
        try {
            Object objInvoke = this.f5781b.invoke(this.f5780a, x509Certificate);
            jc.i.c(objInvoke, "null cannot be cast to non-null type java.security.cert.TrustAnchor");
            return ((TrustAnchor) objInvoke).getTrustedCert();
        } catch (IllegalAccessException e) {
            throw new AssertionError("unable to get issues and signature", e);
        } catch (InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return jc.i.a(this.f5780a, bVar.f5780a) && jc.i.a(this.f5781b, bVar.f5781b);
    }

    public final int hashCode() {
        return this.f5781b.hashCode() + (this.f5780a.hashCode() * 31);
    }

    public final String toString() {
        return "CustomTrustRootIndex(trustManager=" + this.f5780a + ", findByIssuerAndSignatureMethod=" + this.f5781b + ')';
    }
}
