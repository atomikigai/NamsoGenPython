package z7;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f11264c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f11265d;
    public final long e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f11266f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f11267g;
    public final Long h;
    public final Long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Long f11268j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Boolean f11269k;

    public n(String str, String str2, long j4, long j10, long j11, long j12, long j13, Long l2, Long l10, Long l11, Boolean bool) {
        com.google.android.gms.common.internal.i0.e(str);
        com.google.android.gms.common.internal.i0.e(str2);
        com.google.android.gms.common.internal.i0.b(j4 >= 0);
        com.google.android.gms.common.internal.i0.b(j10 >= 0);
        com.google.android.gms.common.internal.i0.b(j11 >= 0);
        com.google.android.gms.common.internal.i0.b(j13 >= 0);
        this.f11262a = str;
        this.f11263b = str2;
        this.f11264c = j4;
        this.f11265d = j10;
        this.e = j11;
        this.f11266f = j12;
        this.f11267g = j13;
        this.h = l2;
        this.i = l10;
        this.f11268j = l11;
        this.f11269k = bool;
    }

    public final n a(Long l2, Long l10, Boolean bool) {
        return new n(this.f11262a, this.f11263b, this.f11264c, this.f11265d, this.e, this.f11266f, this.f11267g, this.h, l2, l10, bool);
    }

    public final n b(long j4) {
        return new n(this.f11262a, this.f11263b, this.f11264c, this.f11265d, this.e, j4, this.f11267g, this.h, this.i, this.f11268j, this.f11269k);
    }
}
