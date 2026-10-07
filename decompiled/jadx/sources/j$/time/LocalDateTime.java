package j$.time;

import j$.time.format.DateTimeFormatter;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class LocalDateTime implements j$.time.temporal.m, j$.time.temporal.o, j$.time.chrono.e, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final LocalDateTime f5361c = I(f.f5433d, i.e);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final LocalDateTime f5362d = I(f.e, i.f5485f);
    private static final long serialVersionUID = 6207766400415563566L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f5363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f5364b;

    @Override // j$.time.chrono.e
    public final j$.time.chrono.j r(ZoneOffset zoneOffset) {
        return y.w(this, zoneOffset, null);
    }

    public static LocalDateTime I(f fVar, i iVar) {
        Objects.requireNonNull(fVar, "date");
        Objects.requireNonNull(iVar, "time");
        return new LocalDateTime(fVar, iVar);
    }

    public static LocalDateTime K(long j4, int i, ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, "offset");
        long j10 = i;
        j$.time.temporal.a.NANO_OF_SECOND.M(j10);
        long j11 = j4 + ((long) zoneOffset.f5371a);
        long j12 = 86400;
        return new LocalDateTime(f.Q(Math.floorDiv(j11, j12)), i.K((((long) ((int) Math.floorMod(j11, j12))) * 1000000000) + j10));
    }

    public static LocalDateTime w(j$.time.temporal.n nVar) {
        if (nVar instanceof LocalDateTime) {
            return (LocalDateTime) nVar;
        }
        if (!(nVar instanceof y)) {
            if (nVar instanceof OffsetDateTime) {
                return ((OffsetDateTime) nVar).toLocalDateTime();
            }
            try {
                return new LocalDateTime(f.C(nVar), i.C(nVar));
            } catch (a e) {
                throw new a("Unable to obtain LocalDateTime from TemporalAccessor: " + nVar + " of type " + nVar.getClass().getName(), e);
            }
        }
        return ((y) nVar).f5551a;
    }

    public LocalDateTime(f fVar, i iVar) {
        this.f5363a = fVar;
        this.f5364b = iVar;
    }

    public final LocalDateTime Q(f fVar, i iVar) {
        return (this.f5363a == fVar && this.f5364b == iVar) ? this : new LocalDateTime(fVar, iVar);
    }

    @Override // j$.time.temporal.n
    public final boolean f(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar != null && qVar.u(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        return aVar.isDateBased() || aVar.N();
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.u k(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) qVar).N() ? this.f5364b.k(qVar) : this.f5363a.k(qVar);
        }
        return qVar.w(this);
    }

    @Override // j$.time.temporal.n
    public final int e(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) qVar).N() ? this.f5364b.e(qVar) : this.f5363a.e(qVar);
        }
        return super.e(qVar);
    }

    @Override // j$.time.temporal.n
    public final long g(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) qVar).N() ? this.f5364b.g(qVar) : this.f5363a.g(qVar);
        }
        return qVar.I(this);
    }

    @Override // j$.time.chrono.e
    public final j$.time.chrono.b m() {
        return this.f5363a;
    }

    @Override // j$.time.chrono.e
    public final i h() {
        return this.f5364b;
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: j */
    public final j$.time.temporal.m z(f fVar) {
        return Q(fVar, this.f5364b);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime i(long j4, j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            if (((j$.time.temporal.a) qVar).N()) {
                return Q(this.f5363a, this.f5364b.i(j4, qVar));
            }
            return Q(this.f5363a.i(j4, qVar), this.f5364b);
        }
        return (LocalDateTime) qVar.K(this, j4);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime l(long j4, j$.time.temporal.s sVar) {
        if (!(sVar instanceof j$.time.temporal.b)) {
            return (LocalDateTime) sVar.u(this, j4);
        }
        switch (g.f5482a[((j$.time.temporal.b) sVar).ordinal()]) {
            case 1:
                return O(this.f5363a, 0L, 0L, 0L, j4);
            case 2:
                LocalDateTime localDateTimeQ = Q(this.f5363a.S(j4 / 86400000000L), this.f5364b);
                return localDateTimeQ.O(localDateTimeQ.f5363a, 0L, 0L, 0L, (j4 % 86400000000L) * 1000);
            case 3:
                LocalDateTime localDateTimeQ2 = Q(this.f5363a.S(j4 / 86400000), this.f5364b);
                return localDateTimeQ2.O(localDateTimeQ2.f5363a, 0L, 0L, 0L, (j4 % 86400000) * 1000000);
            case 4:
                return N(j4);
            case 5:
                return O(this.f5363a, 0L, j4, 0L, 0L);
            case 6:
                return O(this.f5363a, j4, 0L, 0L, 0L);
            case 7:
                LocalDateTime localDateTimeQ3 = Q(this.f5363a.S(j4 / 256), this.f5364b);
                return localDateTimeQ3.O(localDateTimeQ3.f5363a, (j4 % 256) * 12, 0L, 0L, 0L);
            default:
                return Q(this.f5363a.l(j4, sVar), this.f5364b);
        }
    }

    public final LocalDateTime N(long j4) {
        return O(this.f5363a, 0L, 0L, j4, 0L);
    }

    @Override // j$.time.temporal.m
    public final j$.time.chrono.e a(long j4, j$.time.temporal.s sVar) {
        return j4 == Long.MIN_VALUE ? l(Long.MAX_VALUE, sVar).l(1L, sVar) : l(-j4, sVar);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m a(long j4, j$.time.temporal.s sVar) {
        return j4 == Long.MIN_VALUE ? l(Long.MAX_VALUE, sVar).l(1L, sVar) : l(-j4, sVar);
    }

    public final LocalDateTime O(f fVar, long j4, long j10, long j11, long j12) {
        if ((j4 | j10 | j11 | j12) == 0) {
            return Q(fVar, this.f5364b);
        }
        long j13 = 1;
        long jS = this.f5364b.S();
        long j14 = ((((j4 % 24) * 3600000000000L) + ((j10 % 1440) * 60000000000L) + ((j11 % 86400) * 1000000000) + (j12 % 86400000000000L)) * j13) + jS;
        long jFloorDiv = Math.floorDiv(j14, 86400000000000L) + (((j4 / 24) + (j10 / 1440) + (j11 / 86400) + (j12 / 86400000000000L)) * j13);
        long jFloorMod = Math.floorMod(j14, 86400000000000L);
        return Q(fVar.S(jFloorDiv), jFloorMod == jS ? this.f5364b : i.K(jFloorMod));
    }

    @Override // j$.time.temporal.n
    public final Object b(j$.time.format.a aVar) {
        if (aVar == j$.time.temporal.r.f5538f) {
            return this.f5363a;
        }
        return super.b(aVar);
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return dateTimeFormatter.a(this);
    }

    @Override // j$.time.chrono.e, java.lang.Comparable
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public final int compareTo(j$.time.chrono.e eVar) {
        if (eVar instanceof LocalDateTime) {
            return u((LocalDateTime) eVar);
        }
        return super.compareTo(eVar);
    }

    public final int u(LocalDateTime localDateTime) {
        int iU = this.f5363a.u(localDateTime.f5363a);
        return iU == 0 ? this.f5364b.compareTo(localDateTime.f5364b) : iU;
    }

    public final boolean C(j$.time.chrono.e eVar) {
        if (eVar instanceof LocalDateTime) {
            return u((LocalDateTime) eVar) < 0;
        }
        long jE = this.f5363a.E();
        long jE2 = eVar.m().E();
        if (jE >= jE2) {
            return jE == jE2 && this.f5364b.S() < eVar.h().S();
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalDateTime) {
            LocalDateTime localDateTime = (LocalDateTime) obj;
            if (this.f5363a.equals(localDateTime.f5363a) && this.f5364b.equals(localDateTime.f5364b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f5363a.hashCode() ^ this.f5364b.hashCode();
    }

    public final String toString() {
        return this.f5363a.toString() + "T" + this.f5364b.toString();
    }

    private Object writeReplace() {
        return new q((byte) 5, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
