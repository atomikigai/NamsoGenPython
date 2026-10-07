package w3;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j f9530b = new j(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j f9531c = new j(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final j f9532d = new j(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9533a;

    public /* synthetic */ j(int i) {
        this.f9533a = i;
    }

    public final boolean a(int i) {
        switch (this.f9533a) {
            case 0:
                return false;
            case 1:
                return (i == 3 || i == 5) ? false : true;
            default:
                return i == 2;
        }
    }
}
