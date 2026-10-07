package x9;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class m implements ya.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f10340c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Object f10341a = f10340c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile ya.b f10342b;

    public m(ya.b bVar) {
        this.f10342b = bVar;
    }

    @Override // ya.b
    public final Object get() {
        Object obj;
        Object obj2 = this.f10341a;
        Object obj3 = f10340c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f10341a;
                if (obj == obj3) {
                    obj = this.f10342b.get();
                    this.f10341a = obj;
                    this.f10342b = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
