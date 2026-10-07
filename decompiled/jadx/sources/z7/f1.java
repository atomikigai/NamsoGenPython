package z7;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f1 extends a4.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f11115b;

    public f1(a1 a1Var) {
        super(a1Var);
        ((a1) this.f159a).P++;
    }

    public abstract boolean d();

    public final void e() {
        if (!this.f11115b) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void f() {
        if (this.f11115b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (d()) {
            return;
        }
        ((a1) this.f159a).a();
        this.f11115b = true;
    }
}
