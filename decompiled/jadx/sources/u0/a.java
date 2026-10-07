package u0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f8752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f8754c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f8755d;
    public long e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f8756f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f8757g;
    public float h;
    public int i;

    public final float a(long j4) {
        long j10 = this.e;
        if (j4 < j10) {
            return 0.0f;
        }
        long j11 = this.f8757g;
        if (j11 < 0 || j4 < j11) {
            return g.b((j4 - j10) / this.f8752a, 0.0f, 1.0f) * 0.5f;
        }
        float f10 = this.h;
        return (g.b((j4 - j11) / this.i, 0.0f, 1.0f) * f10) + (1.0f - f10);
    }
}
