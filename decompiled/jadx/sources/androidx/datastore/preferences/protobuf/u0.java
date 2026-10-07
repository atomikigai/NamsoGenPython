package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f718c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f719d;

    public u0(t tVar, String str, Object[] objArr) {
        this.f716a = tVar;
        this.f717b = str;
        this.f718c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f719d = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i10 = 13;
        int i11 = 1;
        while (true) {
            int i12 = i11 + 1;
            char cCharAt2 = str.charAt(i11);
            if (cCharAt2 < 55296) {
                this.f719d = i | (cCharAt2 << i10);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i10;
                i10 += 13;
                i11 = i12;
            }
        }
    }
}
