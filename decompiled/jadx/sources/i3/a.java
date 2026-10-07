package i3;

import da.v;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f5158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f5160c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f5161d;
    public final long e;

    public a(int i, long j4, long j10, String str, String str2) {
        jc.i.e(str, "gate");
        jc.i.e(str2, "content");
        this.f5158a = j4;
        this.f5159b = str;
        this.f5160c = str2;
        this.f5161d = i;
        this.e = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f5158a == aVar.f5158a && jc.i.a(this.f5159b, aVar.f5159b) && jc.i.a(this.f5160c, aVar.f5160c) && this.f5161d == aVar.f5161d && this.e == aVar.e;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + ((Integer.hashCode(this.f5161d) + v.d(v.d(Long.hashCode(this.f5158a) * 31, 31, this.f5159b), 31, this.f5160c)) * 31);
    }

    public final String toString() {
        return "CheckerBatch(id=" + this.f5158a + ", gate=" + this.f5159b + ", content=" + this.f5160c + ", total=" + this.f5161d + ", createdAt=" + this.e + ')';
    }
}
