package rc;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class p0 implements y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f8306a;

    public p0(boolean z4) {
        this.f8306a = z4;
    }

    @Override // rc.y0
    public final boolean c() {
        return this.f8306a;
    }

    @Override // rc.y0
    public final m1 e() {
        return null;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Empty{");
        sb2.append(this.f8306a ? "Active" : "New");
        sb2.append('}');
        return sb2.toString();
    }
}
