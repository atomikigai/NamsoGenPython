package w5;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public enum b {
    BANNER(0),
    INTERSTITIAL(1),
    REWARDED(2),
    REWARDED_INTERSTITIAL(3),
    NATIVE(4),
    APP_OPEN_AD(6);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9642a;

    b(int i) {
        this.f9642a = i;
    }

    public static b a(int i) {
        for (b bVar : values()) {
            if (bVar.f9642a == i) {
                return bVar;
            }
        }
        return null;
    }
}
