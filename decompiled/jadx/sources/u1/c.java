package u1;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f8780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f8781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8782c;

    public c(long j4, long j10, int i) {
        this.f8780a = j4;
        this.f8781b = j10;
        this.f8782c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f8780a == cVar.f8780a && this.f8781b == cVar.f8781b && this.f8782c == cVar.f8782c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f8782c) + ((Long.hashCode(this.f8781b) + (Long.hashCode(this.f8780a) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TaxonomyVersion=");
        sb2.append(this.f8780a);
        sb2.append(", ModelVersion=");
        sb2.append(this.f8781b);
        sb2.append(", TopicCode=");
        return u3.b.b("Topic { ", u3.b.c(sb2, this.f8782c, " }"));
    }
}
