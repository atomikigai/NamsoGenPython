package z7;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class w2 extends v2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f11419c;

    public w2(z2 z2Var) {
        super(z2Var);
        this.f11411b.B++;
    }

    public final void d() {
        if (!this.f11419c) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void e() {
        if (this.f11419c) {
            throw new IllegalStateException("Can't initialize twice");
        }
        f();
        this.f11411b.C++;
        this.f11419c = true;
    }

    public abstract void f();
}
