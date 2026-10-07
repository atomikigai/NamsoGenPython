package n5;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements tb.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f7279c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile b f7280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f7281b;

    public static tb.a a(b bVar) {
        if (bVar instanceof a) {
            return bVar;
        }
        a aVar = new a();
        aVar.f7281b = f7279c;
        aVar.f7280a = bVar;
        return aVar;
    }

    @Override // tb.a
    public final Object get() {
        Object obj;
        Object obj2 = this.f7281b;
        Object obj3 = f7279c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f7281b;
                if (obj == obj3) {
                    obj = this.f7280a.get();
                    Object obj4 = this.f7281b;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.f7281b = obj;
                    this.f7280a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
