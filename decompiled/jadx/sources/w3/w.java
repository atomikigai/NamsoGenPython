package w3;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class w implements x, q4.b {
    public static final a2.l e = q4.d.a(20, new r7.j());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q4.e f9581a = new q4.e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public x f9582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f9583c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f9584d;

    public final synchronized void a() {
        this.f9581a.a();
        if (!this.f9583c) {
            throw new IllegalStateException("Already unlocked");
        }
        this.f9583c = false;
        if (this.f9584d) {
            b();
        }
    }

    @Override // w3.x
    public final synchronized void b() {
        this.f9581a.a();
        this.f9584d = true;
        if (!this.f9583c) {
            this.f9582b.b();
            this.f9582b = null;
            e.b(this);
        }
    }

    @Override // q4.b
    public final q4.e c() {
        return this.f9581a;
    }

    @Override // w3.x
    public final int d() {
        return this.f9582b.d();
    }

    @Override // w3.x
    public final Class e() {
        return this.f9582b.e();
    }

    @Override // w3.x
    public final Object get() {
        return this.f9582b.get();
    }
}
