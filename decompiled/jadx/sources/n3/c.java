package n3;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7248c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f7249d;
    public String e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f7250f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f7251g;
    public final String h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f7252j;

    public /* synthetic */ c(int i, int i10, int i11, String str, String str2, String str3, String str4, String str5, String str6, boolean z4) {
        this(i, str, i10, str2, str3, (i11 & 32) != 0 ? null : str4, (i11 & 64) != 0 ? null : str5, (i11 & 128) != 0 ? null : str6, (i11 & 256) != 0 ? false : z4, 0L);
    }

    public c(int i, String str, int i10, String str2, String str3, String str4, String str5, String str6, boolean z4, long j4) {
        jc.i.e(str, "host");
        jc.i.e(str2, "user");
        jc.i.e(str3, "pass");
        this.f7246a = i;
        this.f7247b = str;
        this.f7248c = i10;
        this.f7249d = str2;
        this.e = str3;
        this.f7250f = str4;
        this.f7251g = str5;
        this.h = str6;
        this.i = z4;
        this.f7252j = j4;
    }
}
