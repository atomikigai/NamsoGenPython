package w3;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class r implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f9565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f9566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f9567c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q f9568d;
    public final u3.f e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f9569f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f9570r;

    public r(x xVar, boolean z4, boolean z10, u3.f fVar, q qVar) {
        p4.f.c(xVar, "Argument must not be null");
        this.f9567c = xVar;
        this.f9565a = z4;
        this.f9566b = z10;
        this.e = fVar;
        p4.f.c(qVar, "Argument must not be null");
        this.f9568d = qVar;
    }

    public final synchronized void a() {
        if (this.f9570r) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f9569f++;
    }

    @Override // w3.x
    public final synchronized void b() {
        if (this.f9569f > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.f9570r) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.f9570r = true;
        if (this.f9566b) {
            this.f9567c.b();
        }
    }

    public final void c() {
        boolean z4;
        synchronized (this) {
            int i = this.f9569f;
            if (i <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z4 = true;
            int i10 = i - 1;
            this.f9569f = i10;
            if (i10 != 0) {
                z4 = false;
            }
        }
        if (z4) {
            ((k) this.f9568d).e(this.e, this);
        }
    }

    @Override // w3.x
    public final int d() {
        return this.f9567c.d();
    }

    @Override // w3.x
    public final Class e() {
        return this.f9567c.e();
    }

    @Override // w3.x
    public final Object get() {
        return this.f9567c.get();
    }

    public final synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f9565a + ", listener=" + this.f9568d + ", key=" + this.e + ", acquired=" + this.f9569f + ", isRecycled=" + this.f9570r + ", resource=" + this.f9567c + '}';
    }
}
