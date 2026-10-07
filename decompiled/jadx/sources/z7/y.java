package z7;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Object f11435g = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f11437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f11438c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f11439d;
    public final Object e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile Object f11440f = null;

    public /* synthetic */ y(String str, Object obj, Object obj2, x xVar) {
        this.f11436a = str;
        this.f11438c = obj;
        this.f11439d = obj2;
        this.f11437b = xVar;
    }

    public final Object a(Object obj) {
        synchronized (this.e) {
        }
        if (obj != null) {
            return obj;
        }
        if (k1.f11236k == null) {
            return this.f11438c;
        }
        synchronized (f11435g) {
            try {
                if (v.a()) {
                    return this.f11440f == null ? this.f11438c : this.f11440f;
                }
                try {
                    for (y yVar : z.f11447a) {
                        if (v.a()) {
                            throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                        }
                        Object objZza = null;
                        try {
                            x xVar = yVar.f11437b;
                            if (xVar != null) {
                                objZza = xVar.zza();
                            }
                        } catch (IllegalStateException unused) {
                        }
                        synchronized (f11435g) {
                            yVar.f11440f = objZza;
                        }
                    }
                } catch (SecurityException unused2) {
                }
                x xVar2 = this.f11437b;
                if (xVar2 == null) {
                    return this.f11438c;
                }
                try {
                    return xVar2.zza();
                } catch (IllegalStateException unused3) {
                    return this.f11438c;
                } catch (SecurityException unused4) {
                    return this.f11438c;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
