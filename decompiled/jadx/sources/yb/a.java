package yb;

import ic.p;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f10669a;

    public a(h hVar) {
        this.f10669a = hVar;
    }

    @Override // yb.i
    public final i B(i iVar) {
        return com.bumptech.glide.d.x(this, iVar);
    }

    @Override // yb.i
    public i E(h hVar) {
        return com.bumptech.glide.d.u(this, hVar);
    }

    @Override // yb.i
    public final Object G(Object obj, p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // yb.i
    public g H(h hVar) {
        return com.bumptech.glide.d.n(this, hVar);
    }

    @Override // yb.g
    public final h getKey() {
        return this.f10669a;
    }
}
