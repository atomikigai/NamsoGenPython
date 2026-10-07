package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 implements l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l0[] f625a;

    @Override // androidx.datastore.preferences.protobuf.l0
    public final u0 a(Class cls) {
        for (l0 l0Var : this.f625a) {
            if (l0Var.b(cls)) {
                return l0Var.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public final boolean b(Class cls) {
        for (l0 l0Var : this.f625a) {
            if (l0Var.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
