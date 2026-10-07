package y4;

import v9.t;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f10569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f10570c;

    public e(String str, t tVar, boolean z4) {
        this.f10568a = str;
        this.f10569b = tVar;
        this.f10570c = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return this.f10570c == eVar.f10570c && this.f10568a.equals(eVar.f10568a) && this.f10569b.equals(eVar.f10569b);
    }

    public final int hashCode() {
        return ((this.f10569b.hashCode() + (this.f10568a.hashCode() * 31)) * 31) + (this.f10570c ? 1 : 0);
    }

    public final String toString() {
        return "PhoneVerification{mNumber='" + this.f10568a + "', mCredential=" + this.f10569b + ", mIsAutoVerified=" + this.f10570c + '}';
    }
}
