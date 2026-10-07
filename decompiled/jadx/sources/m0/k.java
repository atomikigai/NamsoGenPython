package m0;

import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k f6971b = new k(new l(j.a(new Locale[0])));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f6972a;

    public k(l lVar) {
        this.f6972a = lVar;
    }

    public static k a(String str) {
        if (str == null || str.isEmpty()) {
            return f6971b;
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            localeArr[i] = i.a(strArrSplit[i]);
        }
        return new k(new l(j.a(localeArr)));
    }

    public final boolean b() {
        return this.f6972a.f6973a.isEmpty();
    }

    public final String c() {
        return this.f6972a.f6973a.toLanguageTags();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return this.f6972a.equals(((k) obj).f6972a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6972a.f6973a.hashCode();
    }

    public final String toString() {
        return this.f6972a.f6973a.toString();
    }
}
