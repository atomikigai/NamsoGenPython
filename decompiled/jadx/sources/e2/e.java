package e2;

import java.util.Locale;
import jc.i;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f3231c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f3232d;
    public final String e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f3233f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f3234g;

    public e(int i, String str, String str2, String str3, boolean z4, int i10) {
        i.e(str, "name");
        i.e(str2, "type");
        this.f3229a = str;
        this.f3230b = str2;
        this.f3231c = z4;
        this.f3232d = i;
        this.e = str3;
        this.f3233f = i10;
        String upperCase = str2.toUpperCase(Locale.ROOT);
        i.d(upperCase, "toUpperCase(...)");
        this.f3234g = pc.g.f0(upperCase, "INT", false) ? 3 : (pc.g.f0(upperCase, "CHAR", false) || pc.g.f0(upperCase, "CLOB", false) || pc.g.f0(upperCase, "TEXT", false)) ? 2 : pc.g.f0(upperCase, "BLOB", false) ? 5 : (pc.g.f0(upperCase, "REAL", false) || pc.g.f0(upperCase, "FLOA", false) || pc.g.f0(upperCase, "DOUB", false)) ? 4 : 1;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof e) {
                boolean z4 = this.f3232d > 0;
                e eVar = (e) obj;
                int i = eVar.f3233f;
                if (z4 == (eVar.f3232d > 0) && i.a(this.f3229a, eVar.f3229a) && this.f3231c == eVar.f3231c) {
                    String str = eVar.e;
                    int i10 = this.f3233f;
                    String str2 = this.e;
                    if ((i10 != 1 || i != 2 || str2 == null || com.bumptech.glide.d.h(str2, str)) && ((i10 != 2 || i != 1 || str == null || com.bumptech.glide.d.h(str, str2)) && ((i10 == 0 || i10 != i || (str2 == null ? str == null : com.bumptech.glide.d.h(str2, str))) && this.f3234g == eVar.f3234g))) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.f3229a.hashCode() * 31) + this.f3234g) * 31) + (this.f3231c ? 1231 : 1237)) * 31) + this.f3232d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("\n            |Column {\n            |   name = '");
        sb2.append(this.f3229a);
        sb2.append("',\n            |   type = '");
        sb2.append(this.f3230b);
        sb2.append("',\n            |   affinity = '");
        sb2.append(this.f3234g);
        sb2.append("',\n            |   notNull = '");
        sb2.append(this.f3231c);
        sb2.append("',\n            |   primaryKeyPosition = '");
        sb2.append(this.f3232d);
        sb2.append("',\n            |   defaultValue = '");
        String str = this.e;
        if (str == null) {
            str = "undefined";
        }
        sb2.append(str);
        sb2.append("'\n            |}\n        ");
        return pc.h.V(pc.h.X(sb2.toString()));
    }
}
