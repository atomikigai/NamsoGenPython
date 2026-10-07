package c3;

import da.v;
import t2.m;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f1744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1745b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f1746c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f1747d;
    public t2.f e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public t2.f f1748f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f1749g;
    public long h;
    public long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public t2.c f1750j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f1751k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f1752l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f1753m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f1754n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f1755o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f1756p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f1757q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f1758r;

    static {
        m.f("WorkSpec");
    }

    public i(String str, String str2) {
        t2.f fVar = t2.f.f8542c;
        this.e = fVar;
        this.f1748f = fVar;
        this.f1750j = t2.c.i;
        this.f1752l = 1;
        this.f1753m = 30000L;
        this.f1756p = -1L;
        this.f1758r = 1;
        this.f1744a = str;
        this.f1746c = str2;
    }

    public final long a() {
        int i;
        if (this.f1745b == 1 && (i = this.f1751k) > 0) {
            return Math.min(18000000L, this.f1752l == 2 ? this.f1753m * ((long) i) : (long) Math.scalb(this.f1753m, i - 1)) + this.f1754n;
        }
        if (!c()) {
            long jCurrentTimeMillis = this.f1754n;
            if (jCurrentTimeMillis == 0) {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            return jCurrentTimeMillis + this.f1749g;
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        long j4 = this.f1754n;
        if (j4 == 0) {
            j4 = this.f1749g + jCurrentTimeMillis2;
        }
        long j10 = this.i;
        long j11 = this.h;
        if (j10 != j11) {
            return j4 + j11 + (j4 == 0 ? j10 * (-1) : 0L);
        }
        return j4 + (j4 != 0 ? j11 : 0L);
    }

    public final boolean b() {
        return !t2.c.i.equals(this.f1750j);
    }

    public final boolean c() {
        return this.h != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f1749g != iVar.f1749g || this.h != iVar.h || this.i != iVar.i || this.f1751k != iVar.f1751k || this.f1753m != iVar.f1753m || this.f1754n != iVar.f1754n || this.f1755o != iVar.f1755o || this.f1756p != iVar.f1756p || this.f1757q != iVar.f1757q || !this.f1744a.equals(iVar.f1744a) || this.f1745b != iVar.f1745b || !this.f1746c.equals(iVar.f1746c)) {
            return false;
        }
        String str = this.f1747d;
        if (str != null) {
            if (!str.equals(iVar.f1747d)) {
                return false;
            }
        } else if (iVar.f1747d != null) {
            return false;
        }
        return this.e.equals(iVar.e) && this.f1748f.equals(iVar.f1748f) && this.f1750j.equals(iVar.f1750j) && this.f1752l == iVar.f1752l && this.f1758r == iVar.f1758r;
    }

    public final int hashCode() {
        int iD = v.d((u.e.d(this.f1745b) + (this.f1744a.hashCode() * 31)) * 31, 31, this.f1746c);
        String str = this.f1747d;
        int iHashCode = (this.f1748f.hashCode() + ((this.e.hashCode() + ((iD + (str != null ? str.hashCode() : 0)) * 31)) * 31)) * 31;
        long j4 = this.f1749g;
        int i = (iHashCode + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j10 = this.h;
        int i10 = (i + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.i;
        int iD2 = (u.e.d(this.f1752l) + ((((this.f1750j.hashCode() + ((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31)) * 31) + this.f1751k) * 31)) * 31;
        long j12 = this.f1753m;
        int i11 = (iD2 + ((int) (j12 ^ (j12 >>> 32)))) * 31;
        long j13 = this.f1754n;
        int i12 = (i11 + ((int) (j13 ^ (j13 >>> 32)))) * 31;
        long j14 = this.f1755o;
        int i13 = (i12 + ((int) (j14 ^ (j14 >>> 32)))) * 31;
        long j15 = this.f1756p;
        return u.e.d(this.f1758r) + ((((i13 + ((int) (j15 ^ (j15 >>> 32)))) * 31) + (this.f1757q ? 1 : 0)) * 31);
    }

    public final String toString() {
        return q1.a.m(new StringBuilder("{WorkSpec: "), this.f1744a, "}");
    }
}
