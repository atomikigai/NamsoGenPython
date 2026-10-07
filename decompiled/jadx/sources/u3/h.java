package u3;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class h {
    public static final r7.k e = new r7.k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f8848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f8849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f8850c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile byte[] f8851d;

    public h(String str, Object obj, g gVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must not be null or empty");
        }
        this.f8850c = str;
        this.f8848a = obj;
        this.f8849b = gVar;
    }

    public static h a(Object obj, String str) {
        return new h(str, obj, e);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f8850c.equals(((h) obj).f8850c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8850c.hashCode();
    }

    public final String toString() {
        return q1.a.m(new StringBuilder("Option{key='"), this.f8850c, "'}");
    }
}
