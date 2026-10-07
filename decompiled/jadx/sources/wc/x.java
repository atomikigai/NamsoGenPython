package wc;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class x implements yb.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f9961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ThreadLocal f9962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y f9963c;

    public x(a2.v vVar, ThreadLocal threadLocal) {
        this.f9961a = vVar;
        this.f9962b = threadLocal;
        this.f9963c = new y(threadLocal);
    }

    @Override // yb.i
    public final yb.i B(yb.i iVar) {
        return com.bumptech.glide.d.x(this, iVar);
    }

    @Override // yb.i
    public final yb.i E(yb.h hVar) {
        return this.f9963c.equals(hVar) ? yb.j.f10674a : this;
    }

    @Override // yb.i
    public final Object G(Object obj, ic.p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // yb.i
    public final yb.g H(yb.h hVar) {
        if (this.f9963c.equals(hVar)) {
            return this;
        }
        return null;
    }

    public final void a(Object obj) {
        this.f9962b.set(obj);
    }

    public final Object b(yb.i iVar) {
        ThreadLocal threadLocal = this.f9962b;
        Object obj = threadLocal.get();
        threadLocal.set(this.f9961a);
        return obj;
    }

    @Override // yb.g
    public final yb.h getKey() {
        return this.f9963c;
    }

    public final String toString() {
        return "ThreadLocal(value=" + this.f9961a + ", threadLocal = " + this.f9962b + ')';
    }
}
