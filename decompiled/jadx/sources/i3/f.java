package i3;

import da.v;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f5170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f5172c;

    public f(long j4, String str, long j10) {
        jc.i.e(str, "content");
        this.f5170a = j4;
        this.f5171b = str;
        this.f5172c = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f5170a == fVar.f5170a && jc.i.a(this.f5171b, fVar.f5171b) && this.f5172c == fVar.f5172c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f5172c) + v.d(Long.hashCode(this.f5170a) * 31, 31, this.f5171b);
    }

    public final String toString() {
        return "Note(id=" + this.f5170a + ", content=" + this.f5171b + ", createdAt=" + this.f5172c + ')';
    }
}
