package rc;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class u1 extends wc.s implements Runnable {
    public final long e;

    public u1(long j4, ac.c cVar) {
        super(cVar, cVar.getContext());
        this.e = j4;
    }

    @Override // rc.l1
    public final String M() {
        return super.M() + "(timeMillis=" + this.e + ')';
    }

    @Override // java.lang.Runnable
    public final void run() {
        b0.k(this.f8249c);
        m(new t1("Timed out waiting for " + this.e + " ms", this));
    }
}
