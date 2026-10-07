package ua;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class h implements ra.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f9058a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f9059b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ra.c f9060c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f9061d;

    public h(f fVar) {
        this.f9061d = fVar;
    }

    @Override // ra.g
    public final ra.g f(String str) {
        if (this.f9058a) {
            throw new ra.b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f9058a = true;
        this.f9061d.h(this.f9060c, str, this.f9059b);
        return this;
    }

    @Override // ra.g
    public final ra.g g(boolean z4) {
        if (this.f9058a) {
            throw new ra.b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f9058a = true;
        this.f9061d.g(this.f9060c, z4 ? 1 : 0, this.f9059b);
        return this;
    }
}
