package q3;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7992b;

    public f(String str, String str2) {
        this.f7991a = str;
        this.f7992b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (TextUtils.equals(this.f7991a, fVar.f7991a) && TextUtils.equals(this.f7992b, fVar.f7992b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f7992b.hashCode() + (this.f7991a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Header[name=");
        sb2.append(this.f7991a);
        sb2.append(",value=");
        return q1.a.m(sb2, this.f7992b, "]");
    }
}
