package rc;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class n0 extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f8303b;

    public /* synthetic */ n0(Object obj, int i) {
        this.f8302a = i;
        this.f8303b = obj;
    }

    @Override // rc.i
    public final void c(Throwable th) {
        switch (this.f8302a) {
            case 0:
                ((m0) this.f8303b).f();
                break;
            default:
                ((ic.l) this.f8303b).invoke(th);
                break;
        }
    }

    @Override // ic.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f8302a) {
            case 0:
                c((Throwable) obj);
                break;
            default:
                c((Throwable) obj);
                break;
        }
        return ub.k.f9073a;
    }

    public final String toString() {
        switch (this.f8302a) {
            case 0:
                return "DisposeOnCancel[" + ((m0) this.f8303b) + ']';
            default:
                return "InvokeOnCancel[" + ((ic.l) this.f8303b).getClass().getSimpleName() + '@' + b0.l(this) + ']';
        }
    }
}
