package j$.time.chrono;

/* JADX INFO: loaded from: classes2.dex */
public interface n extends j$.time.temporal.n, j$.time.temporal.o {
    int getValue();

    @Override // j$.time.temporal.n
    default boolean f(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return qVar == j$.time.temporal.a.ERA;
        }
        return qVar != null && qVar.u(this);
    }

    @Override // j$.time.temporal.n
    default int e(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.a.ERA) {
            return getValue();
        }
        return super.e(qVar);
    }

    @Override // j$.time.temporal.n
    default long g(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.a.ERA) {
            return getValue();
        }
        if (qVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.t(j$.time.b.a("Unsupported field: ", qVar));
        }
        return qVar.I(this);
    }

    @Override // j$.time.temporal.n
    default Object b(j$.time.format.a aVar) {
        if (aVar == j$.time.temporal.r.f5536c) {
            return j$.time.temporal.b.ERAS;
        }
        return super.b(aVar);
    }

    @Override // j$.time.temporal.o
    default j$.time.temporal.m c(j$.time.temporal.m mVar) {
        return mVar.i(getValue(), j$.time.temporal.a.ERA);
    }
}
