package rc;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class u0 extends x {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f8325f = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f8326c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f8327d;
    public vb.g e;

    public final void U(boolean z4) {
        long j4 = this.f8326c - (z4 ? 4294967296L : 1L);
        this.f8326c = j4;
        if (j4 <= 0 && this.f8327d) {
            shutdown();
        }
    }

    public abstract Thread V();

    public final void W(boolean z4) {
        this.f8326c = (z4 ? 4294967296L : 1L) + this.f8326c;
        if (z4) {
            return;
        }
        this.f8327d = true;
    }

    public abstract long X();

    public final boolean Y() {
        vb.g gVar = this.e;
        if (gVar == null) {
            return false;
        }
        i0 i0Var = (i0) (gVar.isEmpty() ? null : gVar.removeFirst());
        if (i0Var == null) {
            return false;
        }
        i0Var.run();
        return true;
    }

    public void Z(long j4, r0 r0Var) {
        c0.f8262u.d0(j4, r0Var);
    }

    public abstract void shutdown();
}
