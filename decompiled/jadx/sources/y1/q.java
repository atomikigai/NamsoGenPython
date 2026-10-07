package y1;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends h2.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h6.m f10494b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(h6.m mVar, int i) {
        super(i);
        this.f10494b = mVar;
    }

    @Override // h2.c
    public final void h(i2.d dVar) {
        this.f10494b.d(new b2.a(dVar));
    }

    @Override // h2.c
    public final void i(i2.d dVar, int i, int i10) {
        k(dVar, i, i10);
    }

    @Override // h2.c
    public final void j(i2.d dVar) throws Throwable {
        b2.a aVar = new b2.a(dVar);
        h6.m mVar = this.f10494b;
        mVar.f(aVar);
        mVar.f5034g = dVar;
    }

    @Override // h2.c
    public final void k(i2.d dVar, int i, int i10) {
        this.f10494b.e(new b2.a(dVar), i, i10);
    }
}
