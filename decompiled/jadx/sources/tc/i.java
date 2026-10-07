package tc;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f8708a = new h();

    public static b a(int i, int i10, int i11) {
        if ((i11 & 2) != 0) {
            i10 = 1;
        }
        if (i == -2) {
            if (i10 != 1) {
                return new m(1, i10);
            }
            f.f8706o.getClass();
            return new b(e.f8705b);
        }
        if (i == -1) {
            if (i10 == 1) {
                return new m(1, 2);
            }
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        }
        if (i == 0) {
            return i10 == 1 ? new b(0) : new m(1, i10);
        }
        if (i != Integer.MAX_VALUE) {
            return i10 == 1 ? new b(i) : new m(i, i10);
        }
        return new b(com.google.android.gms.common.api.f.API_PRIORITY_OTHER);
    }
}
