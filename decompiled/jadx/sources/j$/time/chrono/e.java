package j$.time.chrono;

import j$.time.ZoneOffset;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public interface e extends j$.time.temporal.m, j$.time.temporal.o, Comparable {
    j$.time.i h();

    b m();

    j r(ZoneOffset zoneOffset);

    default m d() {
        return m().d();
    }

    @Override // j$.time.temporal.m
    default e a(long j4, j$.time.temporal.s sVar) {
        return g.u(d(), super.a(j4, sVar));
    }

    @Override // j$.time.temporal.n
    default Object b(j$.time.format.a aVar) {
        if (aVar == j$.time.temporal.r.f5534a || aVar == j$.time.temporal.r.e || aVar == j$.time.temporal.r.f5537d) {
            return null;
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

    @Override // j$.time.temporal.o
    default j$.time.temporal.m c(j$.time.temporal.m mVar) {
        return mVar.i(m().E(), j$.time.temporal.a.EPOCH_DAY).i(h().S(), j$.time.temporal.a.NANO_OF_DAY);
    }

    default long t(ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, "offset");
        return ((m().E() * 86400) + ((long) h().T())) - ((long) zoneOffset.f5371a);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: H */
    default int compareTo(e eVar) {
        int iCompareTo = m().compareTo(eVar.m());
        return (iCompareTo == 0 && (iCompareTo = h().compareTo(eVar.h())) == 0) ? ((a) d()).o().compareTo(eVar.d().o()) : iCompareTo;
    }
}
