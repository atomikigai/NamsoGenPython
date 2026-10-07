package d4;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m f2882b = new m(2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m f2883c = new m(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m f2884d;
    public static final m e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final m f2885f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final u3.h f2886g;
    public static final boolean h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2887a;

    static {
        m mVar = new m(1);
        f2884d = mVar;
        e = new m(3);
        f2885f = mVar;
        f2886g = u3.h.a(mVar, "com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy");
        h = true;
    }

    public /* synthetic */ m(int i) {
        this.f2887a = i;
    }

    public final int a(int i, int i10, int i11, int i12) {
        switch (this.f2887a) {
            case 0:
                if (b(i, i10, i11, i12) == 1.0f) {
                    return 2;
                }
                return f2882b.a(i, i10, i11, i12);
            case 1:
                return 2;
            case 2:
                return h ? 2 : 1;
            default:
                return 2;
        }
    }

    public final float b(int i, int i10, int i11, int i12) {
        switch (this.f2887a) {
            case 0:
                return Math.min(1.0f, f2882b.b(i, i10, i11, i12));
            case 1:
                return Math.max(i11 / i, i12 / i10);
            case 2:
                if (h) {
                    return Math.min(i11 / i, i12 / i10);
                }
                int iMax = Math.max(i10 / i12, i / i11);
                if (iMax == 0) {
                    return 1.0f;
                }
                return 1.0f / Integer.highestOneBit(iMax);
            default:
                return 1.0f;
        }
    }
}
