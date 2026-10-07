package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class q implements l0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q f702b = new q(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f703a;

    public /* synthetic */ q(int i) {
        this.f703a = i;
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public final u0 a(Class cls) {
        switch (this.f703a) {
            case 0:
                if (!t.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (u0) t.e(cls.asSubclass(t.class)).d(3);
                } catch (Exception e) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public final boolean b(Class cls) {
        switch (this.f703a) {
            case 0:
                return t.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
