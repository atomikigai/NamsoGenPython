package fd;

import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import z7.i0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f3897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f3898c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f3899d;

    public b(i0 i0Var, int i, boolean z4, boolean z10) {
        this.f3899d = i0Var;
        this.f3896a = i;
        this.f3897b = z4;
        this.f3898c = z10;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.io.Serializable, java.lang.String[]] */
    public bd.i a(SSLSocket sSLSocket) throws UnknownServiceException {
        bd.i iVar;
        int i;
        boolean z4;
        String[] enabledCipherSuites;
        String[] enabledProtocols;
        int i10 = this.f3896a;
        List list = (List) this.f3899d;
        int size = list.size();
        while (true) {
            if (i10 >= size) {
                iVar = null;
                break;
            }
            iVar = (bd.i) list.get(i10);
            if (iVar.b(sSLSocket)) {
                this.f3896a = i10 + 1;
                break;
            }
            i10++;
        }
        if (iVar == null) {
            StringBuilder sb2 = new StringBuilder("Unable to find acceptable protocols. isFallback=");
            sb2.append(this.f3898c);
            sb2.append(", modes=");
            sb2.append(list);
            sb2.append(", supported protocols=");
            String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
            jc.i.b(enabledProtocols2);
            String string = Arrays.toString(enabledProtocols2);
            jc.i.d(string, "toString(this)");
            sb2.append(string);
            throw new UnknownServiceException(sb2.toString());
        }
        int i11 = this.f3896a;
        int size2 = list.size();
        while (true) {
            i = 0;
            if (i11 >= size2) {
                z4 = false;
                break;
            }
            if (((bd.i) list.get(i11)).b(sSLSocket)) {
                z4 = true;
                break;
            }
            i11++;
        }
        this.f3897b = z4;
        boolean z10 = this.f3898c;
        ?? r10 = iVar.f1602d;
        String[] strArr = iVar.f1601c;
        if (strArr != null) {
            String[] enabledCipherSuites2 = sSLSocket.getEnabledCipherSuites();
            jc.i.d(enabledCipherSuites2, "sslSocket.enabledCipherSuites");
            enabledCipherSuites = cd.b.o(enabledCipherSuites2, strArr, bd.g.f1578c);
        } else {
            enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        }
        if (r10 != 0) {
            String[] enabledProtocols3 = sSLSocket.getEnabledProtocols();
            jc.i.d(enabledProtocols3, "sslSocket.enabledProtocols");
            enabledProtocols = cd.b.o(enabledProtocols3, r10, xb.b.f10357b);
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        jc.i.d(supportedCipherSuites, "supportedCipherSuites");
        bd.f fVar = bd.g.f1578c;
        byte[] bArr = cd.b.f1822a;
        int length = supportedCipherSuites.length;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            if (fVar.compare(supportedCipherSuites[i], "TLS_FALLBACK_SCSV") == 0) {
                break;
            }
            i++;
        }
        if (z10 && i != -1) {
            jc.i.d(enabledCipherSuites, "cipherSuitesIntersection");
            String str = supportedCipherSuites[i];
            jc.i.d(str, "supportedCipherSuites[indexOfFallbackScsv]");
            Object[] objArrCopyOf = Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length + 1);
            jc.i.d(objArrCopyOf, "copyOf(this, newSize)");
            enabledCipherSuites = (String[]) objArrCopyOf;
            enabledCipherSuites[enabledCipherSuites.length - 1] = str;
        }
        bd.h hVar = new bd.h();
        hVar.f1594a = iVar.f1599a;
        hVar.f1596c = strArr;
        hVar.f1597d = r10;
        hVar.f1595b = iVar.f1600b;
        jc.i.d(enabledCipherSuites, "cipherSuitesIntersection");
        hVar.c((String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length));
        jc.i.d(enabledProtocols, "tlsVersionsIntersection");
        hVar.e((String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length));
        bd.i iVarA = hVar.a();
        if (iVarA.c() != null) {
            sSLSocket.setEnabledProtocols(iVarA.f1602d);
        }
        if (iVarA.a() != null) {
            sSLSocket.setEnabledCipherSuites(iVarA.f1601c);
        }
        return iVar;
    }

    public void b(String str) {
        ((i0) this.f3899d).p(this.f3896a, this.f3897b, this.f3898c, str, null, null, null);
    }

    public void c(Object obj, String str) {
        ((i0) this.f3899d).p(this.f3896a, this.f3897b, this.f3898c, str, obj, null, null);
    }

    public void d(Object obj, String str, Object obj2) {
        ((i0) this.f3899d).p(this.f3896a, this.f3897b, this.f3898c, str, obj, obj2, null);
    }

    public void e(String str, Object obj, Object obj2, Object obj3) {
        ((i0) this.f3899d).p(this.f3896a, this.f3897b, this.f3898c, str, obj, obj2, obj3);
    }

    public b(List list) {
        jc.i.e(list, "connectionSpecs");
        this.f3899d = list;
    }
}
