package p4;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends r.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f7791r;

    @Override // r.k, java.util.Map
    public final void clear() {
        this.f7791r = 0;
        super.clear();
    }

    @Override // r.k
    public final void g(r.k kVar) {
        this.f7791r = 0;
        super.g(kVar);
    }

    @Override // r.k
    public final Object h(int i) {
        this.f7791r = 0;
        return super.h(i);
    }

    @Override // r.k, java.util.Map
    public final int hashCode() {
        if (this.f7791r == 0) {
            this.f7791r = super.hashCode();
        }
        return this.f7791r;
    }

    @Override // r.k
    public final Object i(int i, Object obj) {
        this.f7791r = 0;
        return super.i(i, obj);
    }

    @Override // r.k, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.f7791r = 0;
        return super.put(obj, obj2);
    }
}
