package j$.time.format;

/* JADX INFO: loaded from: classes2.dex */
public final class o implements j$.time.temporal.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j$.time.chrono.b f5470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j$.time.temporal.n f5471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j$.time.chrono.m f5472c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j$.time.v f5473d;

    public o(j$.time.chrono.b bVar, j$.time.temporal.n nVar, j$.time.chrono.m mVar, j$.time.v vVar) {
        this.f5470a = bVar;
        this.f5471b = nVar;
        this.f5472c = mVar;
        this.f5473d = vVar;
    }

    @Override // j$.time.temporal.n
    public final boolean f(j$.time.temporal.q qVar) {
        j$.time.chrono.b bVar = this.f5470a;
        if (bVar != null && qVar.isDateBased()) {
            return bVar.f(qVar);
        }
        return this.f5471b.f(qVar);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.u k(j$.time.temporal.q qVar) {
        j$.time.chrono.b bVar = this.f5470a;
        if (bVar != null && qVar.isDateBased()) {
            return bVar.k(qVar);
        }
        return this.f5471b.k(qVar);
    }

    @Override // j$.time.temporal.n
    public final long g(j$.time.temporal.q qVar) {
        j$.time.chrono.b bVar = this.f5470a;
        if (bVar != null && qVar.isDateBased()) {
            return bVar.g(qVar);
        }
        return this.f5471b.g(qVar);
    }

    @Override // j$.time.temporal.n
    public final Object b(a aVar) {
        if (aVar == j$.time.temporal.r.f5535b) {
            return this.f5472c;
        }
        if (aVar == j$.time.temporal.r.f5534a) {
            return this.f5473d;
        }
        if (aVar == j$.time.temporal.r.f5536c) {
            return this.f5471b.b(aVar);
        }
        return aVar.a(this);
    }

    public final String toString() {
        String str;
        String str2 = "";
        j$.time.chrono.m mVar = this.f5472c;
        if (mVar != null) {
            str = " with chronology " + mVar;
        } else {
            str = "";
        }
        j$.time.v vVar = this.f5473d;
        if (vVar != null) {
            str2 = " with zone " + vVar;
        }
        return this.f5471b + str + str2;
    }
}
