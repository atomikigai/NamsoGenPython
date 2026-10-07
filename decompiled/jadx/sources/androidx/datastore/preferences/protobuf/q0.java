package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p0 f704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p0 f705b;

    static {
        p0 p0Var = null;
        try {
            p0Var = (p0) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f704a = p0Var;
        f705b = new p0();
    }
}
