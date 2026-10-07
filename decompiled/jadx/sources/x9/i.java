package x9;

import da.v;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f10334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10336c;

    public i(int i, int i10, Class cls) {
        this(q.a(cls), i, i10);
    }

    public static i a(Class cls) {
        return new i(0, 1, cls);
    }

    public static i b(Class cls) {
        return new i(1, 0, cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f10334a.equals(iVar.f10334a) && this.f10335b == iVar.f10335b && this.f10336c == iVar.f10336c;
    }

    public final int hashCode() {
        return ((((this.f10334a.hashCode() ^ 1000003) * 1000003) ^ this.f10335b) * 1000003) ^ this.f10336c;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder("Dependency{anInterface=");
        sb2.append(this.f10334a);
        sb2.append(", type=");
        int i = this.f10335b;
        if (i == 1) {
            str = "required";
        } else {
            str = i == 0 ? "optional" : "set";
        }
        sb2.append(str);
        sb2.append(", injection=");
        int i10 = this.f10336c;
        if (i10 == 0) {
            str2 = "direct";
        } else if (i10 == 1) {
            str2 = "provider";
        } else {
            if (i10 != 2) {
                throw new AssertionError(v.f(i10, "Unsupported injection: "));
            }
            str2 = "deferred";
        }
        return q1.a.m(sb2, str2, "}");
    }

    public i(q qVar, int i, int i10) {
        jd.d.f(qVar, "Null dependency anInterface.");
        this.f10334a = qVar;
        this.f10335b = i;
        this.f10336c = i10;
    }
}
