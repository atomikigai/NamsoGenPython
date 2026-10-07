package ka;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f6126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f6127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f6128c;

    public a(boolean z4, boolean z10, boolean z11) {
        this.f6126a = z4;
        this.f6127b = z10;
        this.f6128c = z11;
    }

    public boolean a() {
        return (this.f6128c || this.f6127b) && this.f6126a;
    }
}
