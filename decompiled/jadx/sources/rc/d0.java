package rc;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g0 f8266a;

    static {
        String property;
        sc.d dVar;
        g0 g0Var;
        int i = wc.v.f9956a;
        try {
            property = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null ? Boolean.parseBoolean(property) : false) {
            yc.d dVar2 = k0.f8292a;
            dVar = wc.o.f9950a;
            sc.d dVar3 = dVar.e;
            if (dVar == null) {
                g0Var = dVar;
                g0Var = c0.f8262u;
            }
        } else {
            g0Var = c0.f8262u;
        }
        g0Var = dVar;
        f8266a = g0Var;
    }
}
