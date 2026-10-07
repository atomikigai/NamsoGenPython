package bd;

import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Pattern f1603j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Pattern f1604k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Pattern f1605l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Pattern f1606m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f1609c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f1610d;
    public final String e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f1611f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f1612g;
    public final boolean h;
    public final boolean i;

    public j(String str, String str2, long j4, String str3, String str4, boolean z4, boolean z10, boolean z11, boolean z12) {
        this.f1607a = str;
        this.f1608b = str2;
        this.f1609c = j4;
        this.f1610d = str3;
        this.e = str4;
        this.f1611f = z4;
        this.f1612g = z10;
        this.h = z11;
        this.i = z12;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return jc.i.a(jVar.f1607a, this.f1607a) && jc.i.a(jVar.f1608b, this.f1608b) && jVar.f1609c == this.f1609c && jc.i.a(jVar.f1610d, this.f1610d) && jc.i.a(jVar.e, this.e) && jVar.f1611f == this.f1611f && jVar.f1612g == this.f1612g && jVar.h == this.h && jVar.i == this.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + ((Boolean.hashCode(this.h) + ((Boolean.hashCode(this.f1612g) + ((Boolean.hashCode(this.f1611f) + da.v.d(da.v.d((Long.hashCode(this.f1609c) + da.v.d(da.v.d(527, 31, this.f1607a), 31, this.f1608b)) * 31, 31, this.f1610d), 31, this.e)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f1607a);
        sb2.append('=');
        sb2.append(this.f1608b);
        if (this.h) {
            long j4 = this.f1609c;
            if (j4 == Long.MIN_VALUE) {
                sb2.append("; max-age=0");
            } else {
                sb2.append("; expires=");
                String str = ((DateFormat) gd.c.f4534a.get()).format(new Date(j4));
                jc.i.d(str, "STANDARD_DATE_FORMAT.get().format(this)");
                sb2.append(str);
            }
        }
        if (!this.i) {
            sb2.append("; domain=");
            sb2.append(this.f1610d);
        }
        sb2.append("; path=");
        sb2.append(this.e);
        if (this.f1611f) {
            sb2.append("; secure");
        }
        if (this.f1612g) {
            sb2.append("; httponly");
        }
        String string = sb2.toString();
        jc.i.d(string, "toString()");
        return string;
    }
}
