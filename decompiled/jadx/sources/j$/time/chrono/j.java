package j$.time.chrono;

import j$.time.ZoneOffset;

/* JADX INFO: loaded from: classes2.dex */
public interface j extends j$.time.temporal.m, Comparable {
    j$.time.v D();

    ZoneOffset n();

    e v();

    j y(j$.time.v vVar);

    @Override // j$.time.temporal.n
    default j$.time.temporal.u k(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            if (qVar != j$.time.temporal.a.INSTANT_SECONDS && qVar != j$.time.temporal.a.OFFSET_SECONDS) {
                return v().k(qVar);
            }
            return ((j$.time.temporal.a) qVar).f5516b;
        }
        return qVar.w(this);
    }

    @Override // j$.time.temporal.n
    default int e(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            int i = i.f5394a[((j$.time.temporal.a) qVar).ordinal()];
            if (i == 1) {
                throw new j$.time.temporal.t("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            if (i != 2) {
                return v().e(qVar);
            }
            return n().f5371a;
        }
        return super.e(qVar);
    }

    @Override // j$.time.temporal.n
    default long g(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            int i = i.f5394a[((j$.time.temporal.a) qVar).ordinal()];
            if (i == 1) {
                return L();
            }
            if (i != 2) {
                return v().g(qVar);
            }
            return n().f5371a;
        }
        return qVar.I(this);
    }

    default b m() {
        return v().m();
    }

    default j$.time.i h() {
        return v().h();
    }

    default m d() {
        return m().d();
    }

    @Override // j$.time.temporal.m
    default j z(j$.time.temporal.o oVar) {
        return l.u(d(), oVar.c(this));
    }

    @Override // j$.time.temporal.m
    default j a(long j4, j$.time.temporal.s sVar) {
        return l.u(d(), super.a(j4, sVar));
    }

    @Override // j$.time.temporal.n
    default Object b(j$.time.format.a aVar) {
        if (aVar == j$.time.temporal.r.e || aVar == j$.time.temporal.r.f5534a) {
            return D();
        }
        if (aVar == j$.time.temporal.r.f5537d) {
            return n();
        }
        if (aVar == j$.time.temporal.r.f5539g) {
            return h();
        }
        if (aVar == j$.time.temporal.r.f5535b) {
            return d();
        }
        if (aVar == j$.time.temporal.r.f5536c) {
            return j$.time.temporal.b.NANOS;
        }
        return aVar.a(this);
    }

    default long L() {
        return ((m().E() * 86400) + ((long) h().T())) - ((long) n().f5371a);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    default int compareTo(j jVar) {
        int iCompare = Long.compare(L(), jVar.L());
        return (iCompare == 0 && (iCompare = h().f5490d - jVar.h().f5490d) == 0 && (iCompare = v().compareTo(jVar.v())) == 0 && (iCompare = D().o().compareTo(jVar.D().o())) == 0) ? ((a) d()).o().compareTo(jVar.d().o()) : iCompare;
    }
}
