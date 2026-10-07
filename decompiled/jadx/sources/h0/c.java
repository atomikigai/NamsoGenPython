package h0;

import android.graphics.Insets;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    public static final c e = new c(0, 0, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f4547c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f4548d;

    public c(int i, int i10, int i11, int i12) {
        this.f4545a = i;
        this.f4546b = i10;
        this.f4547c = i11;
        this.f4548d = i12;
    }

    public static c a(c cVar, c cVar2) {
        return b(Math.max(cVar.f4545a, cVar2.f4545a), Math.max(cVar.f4546b, cVar2.f4546b), Math.max(cVar.f4547c, cVar2.f4547c), Math.max(cVar.f4548d, cVar2.f4548d));
    }

    public static c b(int i, int i10, int i11, int i12) {
        return (i == 0 && i10 == 0 && i11 == 0 && i12 == 0) ? e : new c(i, i10, i11, i12);
    }

    public static c c(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final Insets d() {
        return b.a(this.f4545a, this.f4546b, this.f4547c, this.f4548d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f4548d == cVar.f4548d && this.f4545a == cVar.f4545a && this.f4547c == cVar.f4547c && this.f4546b == cVar.f4546b;
    }

    public final int hashCode() {
        return (((((this.f4545a * 31) + this.f4546b) * 31) + this.f4547c) * 31) + this.f4548d;
    }

    public final String toString() {
        return "Insets{left=" + this.f4545a + ", top=" + this.f4546b + ", right=" + this.f4547c + ", bottom=" + this.f4548d + '}';
    }
}
