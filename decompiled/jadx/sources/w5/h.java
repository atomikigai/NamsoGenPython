package w5;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class h {
    public static final h h = new h(320, 50, "320x50_mb");
    public static final h i = new h(468, 60, "468x60_as");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final h f9648j = new h(320, 100, "320x100_as");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final h f9649k = new h(728, 90, "728x90_as");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final h f9650l = new h(300, 250, "300x250_as");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final h f9651m = new h(160, 600, "160x600_as");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final h f9652n = new h(-1, -2, "smart_banner");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final h f9653o = new h(-3, -4, "fluid");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final h f9654p = new h(0, 0, "invalid");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final h f9655q = new h(50, 50, "50x50_mb");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f9658c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f9659d;
    public int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f9660f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f9661g;

    static {
        new h(-3, 0, "search_v2");
    }

    public h(int i10, int i11) {
        this(i10, i11, da.v.v(i10 == -1 ? "FULL" : String.valueOf(i10), "x", i11 == -2 ? "AUTO" : String.valueOf(i11), "_as"));
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f9656a == hVar.f9656a && this.f9657b == hVar.f9657b && this.f9658c.equals(hVar.f9658c);
    }

    public final int hashCode() {
        return this.f9658c.hashCode();
    }

    public final String toString() {
        return this.f9658c;
    }

    public h(int i10, int i11, String str) {
        if (i10 < 0 && i10 != -1 && i10 != -3) {
            throw new IllegalArgumentException(da.v.f(i10, "Invalid width for AdSize: "));
        }
        if (i11 < 0 && i11 != -2 && i11 != -4) {
            throw new IllegalArgumentException(da.v.f(i11, "Invalid height for AdSize: "));
        }
        this.f9656a = i10;
        this.f9657b = i11;
        this.f9658c = str;
    }
}
