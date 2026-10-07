package j$.time;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class OffsetDateTime implements j$.time.temporal.m, j$.time.temporal.o, Comparable<OffsetDateTime>, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f5365c = 0;
    private static final long serialVersionUID = 2287754244819255394L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDateTime f5366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ZoneOffset f5367b;

    @Override // java.lang.Comparable
    public final int compareTo(OffsetDateTime offsetDateTime) {
        int iCompare;
        OffsetDateTime offsetDateTime2 = offsetDateTime;
        if (this.f5367b.equals(offsetDateTime2.f5367b)) {
            iCompare = toLocalDateTime().compareTo(offsetDateTime2.toLocalDateTime());
        } else {
            iCompare = Long.compare(this.f5366a.t(this.f5367b), offsetDateTime2.f5366a.t(offsetDateTime2.f5367b));
            if (iCompare == 0) {
                iCompare = this.f5366a.f5364b.f5490d - offsetDateTime2.f5366a.f5364b.f5490d;
            }
        }
        return iCompare == 0 ? toLocalDateTime().compareTo(offsetDateTime2.toLocalDateTime()) : iCompare;
    }

    static {
        LocalDateTime localDateTime = LocalDateTime.f5361c;
        ZoneOffset zoneOffset = ZoneOffset.f5370f;
        localDateTime.getClass();
        new OffsetDateTime(localDateTime, zoneOffset);
        LocalDateTime localDateTime2 = LocalDateTime.f5362d;
        ZoneOffset zoneOffset2 = ZoneOffset.e;
        localDateTime2.getClass();
        new OffsetDateTime(localDateTime2, zoneOffset2);
    }

    public static OffsetDateTime u(Instant instant, v vVar) {
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(vVar, "zone");
        ZoneOffset zoneOffsetD = vVar.u().d(instant);
        return new OffsetDateTime(LocalDateTime.K(instant.f5359a, instant.f5360b, zoneOffsetD), zoneOffsetD);
    }

    public OffsetDateTime(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        Objects.requireNonNull(localDateTime, "dateTime");
        this.f5366a = localDateTime;
        Objects.requireNonNull(zoneOffset, "offset");
        this.f5367b = zoneOffset;
    }

    public final OffsetDateTime C(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        return (this.f5366a == localDateTime && this.f5367b.equals(zoneOffset)) ? this : new OffsetDateTime(localDateTime, zoneOffset);
    }

    @Override // j$.time.temporal.n
    public final boolean f(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return true;
        }
        return qVar != null && qVar.u(this);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.u k(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            if (qVar != j$.time.temporal.a.INSTANT_SECONDS && qVar != j$.time.temporal.a.OFFSET_SECONDS) {
                return this.f5366a.k(qVar);
            }
            return ((j$.time.temporal.a) qVar).f5516b;
        }
        return qVar.w(this);
    }

    @Override // j$.time.temporal.n
    public final int e(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            int i = n.f5498a[((j$.time.temporal.a) qVar).ordinal()];
            if (i == 1) {
                throw new j$.time.temporal.t("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            if (i == 2) {
                return this.f5367b.f5371a;
            }
            return this.f5366a.e(qVar);
        }
        return super.e(qVar);
    }

    @Override // j$.time.temporal.n
    public final long g(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            int i = n.f5498a[((j$.time.temporal.a) qVar).ordinal()];
            if (i == 1) {
                return this.f5366a.t(this.f5367b);
            }
            if (i == 2) {
                return this.f5367b.f5371a;
            }
            return this.f5366a.g(qVar);
        }
        return qVar.I(this);
    }

    public LocalDateTime toLocalDateTime() {
        return this.f5366a;
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: j */
    public final j$.time.temporal.m z(f fVar) {
        LocalDateTime localDateTime = this.f5366a;
        return C(localDateTime.Q(fVar, localDateTime.f5364b), this.f5367b);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m i(long j4, j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
            int i = n.f5498a[aVar.ordinal()];
            if (i == 1) {
                return u(Instant.w(j4, this.f5366a.f5364b.f5490d), this.f5367b);
            }
            if (i == 2) {
                return C(this.f5366a, ZoneOffset.N(aVar.f5516b.a(j4, aVar)));
            }
            return C(this.f5366a.i(j4, qVar), this.f5367b);
        }
        return (OffsetDateTime) qVar.K(this, j4);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public final OffsetDateTime l(long j4, j$.time.temporal.s sVar) {
        if (sVar instanceof j$.time.temporal.b) {
            return C(this.f5366a.l(j4, sVar), this.f5367b);
        }
        return (OffsetDateTime) sVar.u(this, j4);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m a(long j4, j$.time.temporal.s sVar) {
        return j4 == Long.MIN_VALUE ? l(Long.MAX_VALUE, sVar).l(1L, sVar) : l(-j4, sVar);
    }

    @Override // j$.time.temporal.n
    public final Object b(j$.time.format.a aVar) {
        if (aVar == j$.time.temporal.r.f5537d || aVar == j$.time.temporal.r.e) {
            return this.f5367b;
        }
        if (aVar == j$.time.temporal.r.f5534a) {
            return null;
        }
        if (aVar == j$.time.temporal.r.f5538f) {
            return this.f5366a.f5363a;
        }
        if (aVar == j$.time.temporal.r.f5539g) {
            return this.f5366a.f5364b;
        }
        if (aVar == j$.time.temporal.r.f5535b) {
            return j$.time.chrono.t.f5416c;
        }
        if (aVar == j$.time.temporal.r.f5536c) {
            return j$.time.temporal.b.NANOS;
        }
        return aVar.a(this);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.m c(j$.time.temporal.m mVar) {
        return mVar.i(this.f5366a.f5363a.E(), j$.time.temporal.a.EPOCH_DAY).i(this.f5366a.f5364b.S(), j$.time.temporal.a.NANO_OF_DAY).i(this.f5367b.f5371a, j$.time.temporal.a.OFFSET_SECONDS);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OffsetDateTime) {
            OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
            if (this.f5366a.equals(offsetDateTime.f5366a) && this.f5367b.equals(offsetDateTime.f5367b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f5366a.hashCode() ^ this.f5367b.f5371a;
    }

    public final String toString() {
        return this.f5366a.toString() + this.f5367b.f5372b;
    }

    private Object writeReplace() {
        return new q((byte) 10, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
