package n3;

import android.net.Uri;
import java.util.Locale;
import pc.o;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f7238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f7240c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f7241d;
    public final String e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f7242f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f7243g;
    public final String h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f7244j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f7245k;

    public b(long j4, String str, String str2, int i, String str3, int i10, String str4, String str5, String str6, String str7, boolean z4) {
        jc.i.e(str, "name");
        jc.i.e(str2, "url");
        jc.i.e(str3, "h");
        jc.i.e(str4, "u");
        jc.i.e(str5, "w");
        this.f7238a = j4;
        this.f7239b = str;
        this.f7240c = str2;
        this.f7241d = i;
        this.e = str3;
        this.f7242f = i10;
        this.f7243g = str4;
        this.h = str5;
        this.i = str6;
        this.f7244j = str7;
        this.f7245k = z4;
    }

    public final String a() {
        String host = Uri.parse(this.f7240c).getHost();
        if (host == null) {
            return "";
        }
        String lowerCase = host.toLowerCase(Locale.ROOT);
        jc.i.d(lowerCase, "toLowerCase(...)");
        return pc.g.r0(lowerCase, "www.");
    }

    public final boolean b() {
        return pc.g.f0(this.e, "proxiware.com", true) || o.e0(this.f7243g, "user-", false);
    }

    public final boolean c(b bVar) {
        jc.i.e(bVar, "other");
        String strA = a();
        String strA2 = bVar.a();
        if (strA.length() == 0 || strA2.length() == 0) {
            return false;
        }
        return strA.equals(strA2) || o.Z(strA, ".".concat(strA2)) || o.Z(strA2, ".".concat(strA));
    }
}
