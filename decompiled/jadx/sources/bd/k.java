package bd;

import androidx.lifecycle.j0;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f1613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f1614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f1615c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ub.i f1616d;

    public k(b0 b0Var, g gVar, List list, ic.a aVar) {
        this.f1613a = b0Var;
        this.f1614b = gVar;
        this.f1615c = list;
        this.f1616d = new ub.i(new j0(aVar));
    }

    public final List a() {
        return (List) this.f1616d.getValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return kVar.f1613a == this.f1613a && jc.i.a(kVar.f1614b, this.f1614b) && jc.i.a(kVar.a(), a()) && jc.i.a(kVar.f1615c, this.f1615c);
    }

    public final int hashCode() {
        return this.f1615c.hashCode() + ((a().hashCode() + ((this.f1614b.hashCode() + ((this.f1613a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String type;
        String type2;
        List<Certificate> listA = a();
        ArrayList arrayList = new ArrayList(vb.k.U(listA));
        for (Certificate certificate : listA) {
            if (certificate instanceof X509Certificate) {
                type2 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                type2 = certificate.getType();
                jc.i.d(type2, "type");
            }
            arrayList.add(type2);
        }
        String string = arrayList.toString();
        StringBuilder sb2 = new StringBuilder("Handshake{tlsVersion=");
        sb2.append(this.f1613a);
        sb2.append(" cipherSuite=");
        sb2.append(this.f1614b);
        sb2.append(" peerCertificates=");
        sb2.append(string);
        sb2.append(" localCertificates=");
        List<Certificate> list = this.f1615c;
        ArrayList arrayList2 = new ArrayList(vb.k.U(list));
        for (Certificate certificate2 : list) {
            if (certificate2 instanceof X509Certificate) {
                type = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                type = certificate2.getType();
                jc.i.d(type, "type");
            }
            arrayList2.add(type);
        }
        sb2.append(arrayList2);
        sb2.append('}');
        return sb2.toString();
    }
}
