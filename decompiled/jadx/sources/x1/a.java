package x1;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f10012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f10014c;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            int i = this.f10012a;
            if (i != aVar.f10012a) {
                return false;
            }
            if (i != 8 || Math.abs(this.f10014c - this.f10013b) != 1 || this.f10014c != aVar.f10013b || this.f10013b != aVar.f10014c) {
                return this.f10014c == aVar.f10014c && this.f10013b == aVar.f10013b;
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((this.f10012a * 31) + this.f10013b) * 31) + this.f10014c;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("[");
        int i = this.f10012a;
        if (i == 1) {
            str = "add";
        } else if (i == 2) {
            str = "rm";
        } else if (i != 4) {
            str = i != 8 ? "??" : "mv";
        } else {
            str = "up";
        }
        sb2.append(str);
        sb2.append(",s:");
        sb2.append(this.f10013b);
        sb2.append("c:");
        return u3.b.c(sb2, this.f10014c, ",p:null]");
    }
}
