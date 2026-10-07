package z7;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m0 extends w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f11256b;

    public m0(a1 a1Var) {
        super(a1Var);
        ((a1) this.f159a).P++;
    }

    public final void d() {
        if (!this.f11256b) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void e() {
        if (this.f11256b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (f()) {
            return;
        }
        ((a1) this.f159a).a();
        this.f11256b = true;
    }

    public abstract boolean f();
}
