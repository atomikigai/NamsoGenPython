package k3;

import da.v;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f5957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5959c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f5960d;
    public final String e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f5961f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f5962g;
    public final String h;
    public final String i;

    public n(int i, int i10, int i11, String str, String str2, String str3, String str4, String str5, String str6, boolean z4) {
        str = (i11 & 2) != 0 ? "" : str;
        i = (i11 & 4) != 0 ? 1337 : i;
        str2 = (i11 & 8) != 0 ? "" : str2;
        str3 = (i11 & 16) != 0 ? "" : str3;
        str4 = (i11 & 32) != 0 ? "" : str4;
        i10 = (i11 & 64) != 0 ? 0 : i10;
        str5 = (i11 & 128) != 0 ? null : str5;
        str6 = (i11 & 256) != 0 ? null : str6;
        this.f5957a = z4;
        this.f5958b = str;
        this.f5959c = i;
        this.f5960d = str2;
        this.e = str3;
        this.f5961f = str4;
        this.f5962g = i10;
        this.h = str5;
        this.i = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f5957a == nVar.f5957a && this.f5958b.equals(nVar.f5958b) && this.f5959c == nVar.f5959c && this.f5960d.equals(nVar.f5960d) && this.e.equals(nVar.e) && this.f5961f.equals(nVar.f5961f) && this.f5962g == nVar.f5962g && jc.i.a(this.h, nVar.h) && jc.i.a(this.i, nVar.i);
    }

    public final int hashCode() {
        int iHashCode = (Integer.hashCode(this.f5962g) + v.d(v.d(v.d((Integer.hashCode(this.f5959c) + v.d(Boolean.hashCode(this.f5957a) * 31, 31, this.f5958b)) * 31, 31, this.f5960d), 31, this.e), 31, this.f5961f)) * 31;
        String str = this.h;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.i;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "ProxyResult(ok=" + this.f5957a + ", host=" + this.f5958b + ", port=" + this.f5959c + ", user=" + this.f5960d + ", pass=" + this.e + ", country=" + this.f5961f + ", mbLeft=" + this.f5962g + ", error=" + this.h + ", message=" + this.i + ')';
    }
}
