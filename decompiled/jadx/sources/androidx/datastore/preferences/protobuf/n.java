package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f670a = new m();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m f671b;

    static {
        m mVar = null;
        try {
            mVar = (m) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f671b = mVar;
    }
}
