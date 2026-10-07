package a2;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements yb.g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final wa.d f2b = new wa.d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f3a;

    public a(v vVar) {
        jc.i.e(vVar, "connectionWrapper");
        this.f3a = vVar;
    }

    @Override // yb.i
    public final yb.i B(yb.i iVar) {
        return com.bumptech.glide.d.x(this, iVar);
    }

    @Override // yb.i
    public final yb.i E(yb.h hVar) {
        return com.bumptech.glide.d.u(this, hVar);
    }

    @Override // yb.i
    public final Object G(Object obj, ic.p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // yb.i
    public final yb.g H(yb.h hVar) {
        return com.bumptech.glide.d.n(this, hVar);
    }

    @Override // yb.g
    public final yb.h getKey() {
        return f2b;
    }
}
