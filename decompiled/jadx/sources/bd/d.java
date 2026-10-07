package bd;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends jc.j implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f1571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1572c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1573d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(e eVar, Object obj, Object obj2, int i) {
        super(0);
        this.f1570a = i;
        this.f1571b = eVar;
        this.f1572c = obj;
        this.f1573d = obj2;
    }

    @Override // ic.a
    public final Object a() {
        switch (this.f1570a) {
            case 0:
                List<Certificate> listG = (List) this.f1572c;
                r7.g gVar = this.f1571b.f1576b;
                if (gVar != null) {
                    listG = gVar.g((String) this.f1573d, listG);
                }
                ArrayList arrayList = new ArrayList(vb.k.U(listG));
                for (Certificate certificate : listG) {
                    jc.i.c(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    arrayList.add((X509Certificate) certificate);
                }
                return arrayList;
            default:
                r7.g gVar2 = this.f1571b.f1576b;
                jc.i.b(gVar2);
                return gVar2.g(((a) this.f1573d).i.f1629d, ((k) this.f1572c).a());
        }
    }
}
