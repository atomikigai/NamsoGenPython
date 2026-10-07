package j$.time.chrono;

/* JADX INFO: loaded from: classes2.dex */
public interface b extends j$.time.temporal.m, j$.time.temporal.o, Comparable {
    m d();

    int hashCode();

    @Override // j$.time.temporal.m
    b i(long j4, j$.time.temporal.q qVar);

    @Override // j$.time.temporal.m
    b l(long j4, j$.time.temporal.s sVar);

    String toString();

    default e F(j$.time.i iVar) {
        return new g(this, iVar);
    }

    default n G() {
        return d().x(e(j$.time.temporal.a.ERA));
    }

    @Override // j$.time.temporal.n
    default boolean f(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) qVar).isDateBased();
        }
        return qVar != null && qVar.u(this);
    }

    @Override // j$.time.temporal.m
    default b a(long j4, j$.time.temporal.s sVar) {
        return d.u(d(), super.a(j4, sVar));
    }

    @Override // j$.time.temporal.n
    default Object b(j$.time.format.a aVar) {
        if (aVar == j$.time.temporal.r.f5534a || aVar == j$.time.temporal.r.e || aVar == j$.time.temporal.r.f5537d || aVar == j$.time.temporal.r.f5539g) {
            return null;
        }
        if (aVar == j$.time.temporal.r.f5535b) {
            return d();
        }
        if (aVar == j$.time.temporal.r.f5536c) {
            return j$.time.temporal.b.DAYS;
        }
        return aVar.a(this);
    }

    @Override // j$.time.temporal.o
    default j$.time.temporal.m c(j$.time.temporal.m mVar) {
        return mVar.i(E(), j$.time.temporal.a.EPOCH_DAY);
    }

    default long E() {
        return g(j$.time.temporal.a.EPOCH_DAY);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: J */
    default int compareTo(b bVar) {
        int iCompare = Long.compare(E(), bVar.E());
        if (iCompare != 0) {
            return iCompare;
        }
        return ((a) d()).o().compareTo(bVar.d().o());
    }
}
