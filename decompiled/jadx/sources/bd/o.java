package bd;

import androidx.webkit.ProxyConfig;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class o {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final char[] f1625j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f1628c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f1629d;
    public final int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f1630f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f1631g;
    public final String h;
    public final boolean i;

    public o(String str, String str2, String str3, String str4, int i, ArrayList arrayList, ArrayList arrayList2, String str5, String str6) {
        jc.i.e(str, "scheme");
        jc.i.e(str4, "host");
        this.f1626a = str;
        this.f1627b = str2;
        this.f1628c = str3;
        this.f1629d = str4;
        this.e = i;
        this.f1630f = arrayList2;
        this.f1631g = str5;
        this.h = str6;
        this.i = str.equals(ProxyConfig.MATCH_HTTPS);
    }

    public final String a() {
        if (this.f1628c.length() == 0) {
            return "";
        }
        int length = this.f1626a.length() + 3;
        String str = this.h;
        String strSubstring = str.substring(pc.g.j0(str, ':', length, 4) + 1, pc.g.j0(str, '@', 0, 6));
        jc.i.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final String b() {
        int length = this.f1626a.length() + 3;
        String str = this.h;
        int iJ0 = pc.g.j0(str, '/', length, 4);
        String strSubstring = str.substring(iJ0, cd.b.f(iJ0, str.length(), str, "?#"));
        jc.i.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final ArrayList c() {
        int length = this.f1626a.length() + 3;
        String str = this.h;
        int iJ0 = pc.g.j0(str, '/', length, 4);
        int iF = cd.b.f(iJ0, str.length(), str, "?#");
        ArrayList arrayList = new ArrayList();
        while (iJ0 < iF) {
            int i = iJ0 + 1;
            int iG = cd.b.g(str, '/', i, iF);
            String strSubstring = str.substring(i, iG);
            jc.i.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(strSubstring);
            iJ0 = iG;
        }
        return arrayList;
    }

    public final String d() {
        if (this.f1630f == null) {
            return null;
        }
        String str = this.h;
        int iJ0 = pc.g.j0(str, '?', 0, 6) + 1;
        String strSubstring = str.substring(iJ0, cd.b.g(str, '#', iJ0, str.length()));
        jc.i.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final String e() {
        if (this.f1627b.length() == 0) {
            return "";
        }
        int length = this.f1626a.length() + 3;
        String str = this.h;
        String strSubstring = str.substring(length, cd.b.f(length, str.length(), str, ":@"));
        jc.i.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof o) && jc.i.a(((o) obj).h, this.h);
    }

    public final URI f() {
        String strSubstring;
        String strReplaceAll;
        n nVar = new n();
        ArrayList arrayList = (ArrayList) nVar.h;
        String str = this.f1626a;
        nVar.f1620b = str;
        nVar.f1622d = e();
        nVar.e = a();
        nVar.f1623f = this.f1629d;
        jc.i.e(str, "scheme");
        int i = str.equals(ProxyConfig.MATCH_HTTP) ? 80 : str.equals(ProxyConfig.MATCH_HTTPS) ? 443 : -1;
        int i10 = this.e;
        nVar.f1621c = i10 != i ? i10 : -1;
        arrayList.clear();
        arrayList.addAll(c());
        String strD = d();
        nVar.i = strD != null ? b.f(b.b(0, 0, 211, strD, " \"'<>#")) : null;
        if (this.f1631g == null) {
            strSubstring = null;
        } else {
            String str2 = this.h;
            strSubstring = str2.substring(pc.g.j0(str2, '#', 0, 6) + 1);
            jc.i.d(strSubstring, "this as java.lang.String).substring(startIndex)");
        }
        nVar.f1624g = strSubstring;
        String str3 = (String) nVar.f1623f;
        if (str3 != null) {
            Pattern patternCompile = Pattern.compile("[\"<>^`{|}]");
            jc.i.d(patternCompile, "compile(...)");
            strReplaceAll = patternCompile.matcher(str3).replaceAll("");
            jc.i.d(strReplaceAll, "replaceAll(...)");
        } else {
            strReplaceAll = null;
        }
        nVar.f1623f = strReplaceAll;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.set(i11, b.b(0, 0, 227, (String) arrayList.get(i11), "[]"));
        }
        ArrayList arrayList2 = (ArrayList) nVar.i;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                String str4 = (String) arrayList2.get(i12);
                arrayList2.set(i12, str4 != null ? b.b(0, 0, 195, str4, "\\^`{|}") : null);
            }
        }
        String str5 = (String) nVar.f1624g;
        nVar.f1624g = str5 != null ? b.b(0, 0, 163, str5, " \"#<>\\^`{|}") : null;
        String string = nVar.toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e) {
            try {
                Pattern patternCompile2 = Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
                jc.i.d(patternCompile2, "compile(...)");
                String strReplaceAll2 = patternCompile2.matcher(string).replaceAll("");
                jc.i.d(strReplaceAll2, "replaceAll(...)");
                URI uriCreate = URI.create(strReplaceAll2);
                jc.i.d(uriCreate, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
                return uriCreate;
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    public final int hashCode() {
        return this.h.hashCode();
    }

    public final String toString() {
        return this.h;
    }
}
