package k9;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f6110c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile h f6111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f6112b;

    /* JADX WARN: Multi-variable type inference failed */
    public static f b(g gVar) {
        if (gVar instanceof f) {
            return (f) gVar;
        }
        f fVar = new f();
        fVar.f6112b = f6110c;
        fVar.f6111a = gVar;
        return fVar;
    }

    @Override // k9.h
    public final Object a() {
        Object objA;
        Object obj = this.f6112b;
        Object obj2 = f6110c;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            try {
                objA = this.f6112b;
                if (objA == obj2) {
                    objA = this.f6111a.a();
                    Object obj3 = this.f6112b;
                    if (obj3 != obj2 && obj3 != objA) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + objA + ". This is likely due to a circular dependency.");
                    }
                    this.f6112b = objA;
                    this.f6111a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return objA;
    }
}
