package rc;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class u extends jc.j implements ic.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u f8322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u f8323c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8324a;

    static {
        int i = 2;
        f8322b = new u(i, 0);
        f8323c = new u(i, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(int i, int i10) {
        super(i);
        this.f8324a = i10;
    }

    @Override // ic.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f8324a) {
            case 0:
                return ((yb.i) obj).B((yb.g) obj2);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            default:
                return ((yb.i) obj).B((yb.g) obj2);
        }
    }
}
