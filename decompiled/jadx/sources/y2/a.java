package y2;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f10537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f10538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f10539c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f10540d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f10537a == aVar.f10537a && this.f10538b == aVar.f10538b && this.f10539c == aVar.f10539c && this.f10540d == aVar.f10540d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public final int hashCode() {
        ?? r10 = this.f10537a;
        int i = r10;
        if (this.f10538b) {
            i = r10 + 16;
        }
        int i10 = i;
        if (this.f10539c) {
            i10 = i + 256;
        }
        return this.f10540d ? i10 + 4096 : i10;
    }

    public final String toString() {
        return "[ Connected=" + this.f10537a + " Validated=" + this.f10538b + " Metered=" + this.f10539c + " NotRoaming=" + this.f10540d + " ]";
    }
}
