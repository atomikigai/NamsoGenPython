package bd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class i {
    public static final i e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final i f1598f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f1599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f1600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String[] f1601c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String[] f1602d;

    static {
        g gVar = g.f1590r;
        g gVar2 = g.f1591s;
        g gVar3 = g.f1592t;
        g gVar4 = g.f1584l;
        g gVar5 = g.f1586n;
        g gVar6 = g.f1585m;
        g gVar7 = g.f1587o;
        g gVar8 = g.f1589q;
        g gVar9 = g.f1588p;
        g[] gVarArr = {gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7, gVar8, gVar9};
        g[] gVarArr2 = {gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7, gVar8, gVar9, g.f1582j, g.f1583k, g.h, g.i, g.f1580f, g.f1581g, g.e};
        h hVar = new h();
        hVar.b((g[]) Arrays.copyOf(gVarArr, 9));
        b0 b0Var = b0.TLS_1_3;
        b0 b0Var2 = b0.TLS_1_2;
        hVar.d(b0Var, b0Var2);
        hVar.f1595b = true;
        hVar.a();
        h hVar2 = new h();
        hVar2.b((g[]) Arrays.copyOf(gVarArr2, 16));
        hVar2.d(b0Var, b0Var2);
        hVar2.f1595b = true;
        e = hVar2.a();
        h hVar3 = new h();
        hVar3.b((g[]) Arrays.copyOf(gVarArr2, 16));
        hVar3.d(b0Var, b0Var2, b0.TLS_1_1, b0.TLS_1_0);
        hVar3.f1595b = true;
        hVar3.a();
        f1598f = new i(false, false, null, null);
    }

    public i(boolean z4, boolean z10, String[] strArr, String[] strArr2) {
        this.f1599a = z4;
        this.f1600b = z10;
        this.f1601c = strArr;
        this.f1602d = strArr2;
    }

    public final List a() {
        String[] strArr = this.f1601c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(g.f1577b.c(str));
        }
        return vb.i.n0(arrayList);
    }

    public final boolean b(SSLSocket sSLSocket) {
        if (!this.f1599a) {
            return false;
        }
        String[] strArr = this.f1602d;
        if (strArr != null && !cd.b.i(strArr, sSLSocket.getEnabledProtocols(), xb.b.f10357b)) {
            return false;
        }
        String[] strArr2 = this.f1601c;
        return strArr2 == null || cd.b.i(strArr2, sSLSocket.getEnabledCipherSuites(), g.f1578c);
    }

    public final List c() {
        String[] strArr = this.f1602d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(com.bumptech.glide.c.o(str));
        }
        return vb.i.n0(arrayList);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        i iVar = (i) obj;
        boolean z4 = iVar.f1599a;
        boolean z10 = this.f1599a;
        if (z10 != z4) {
            return false;
        }
        if (z10) {
            return Arrays.equals(this.f1601c, iVar.f1601c) && Arrays.equals(this.f1602d, iVar.f1602d) && this.f1600b == iVar.f1600b;
        }
        return true;
    }

    public final int hashCode() {
        if (!this.f1599a) {
            return 17;
        }
        String[] strArr = this.f1601c;
        int iHashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.f1602d;
        return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f1600b ? 1 : 0);
    }

    public final String toString() {
        if (!this.f1599a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(a(), "[all enabled]") + ", tlsVersions=" + Objects.toString(c(), "[all enabled]") + ", supportsTlsExtensions=" + this.f1600b + ')';
    }
}
