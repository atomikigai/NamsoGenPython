package j$.time;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class y implements j$.time.temporal.m, j$.time.chrono.j, Serializable {
    private static final long serialVersionUID = -6260982410461394882L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDateTime f5551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ZoneOffset f5552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f5553c;

    public static y w(LocalDateTime localDateTime, v vVar, ZoneOffset zoneOffset) {
        Objects.requireNonNull(localDateTime, "localDateTime");
        Objects.requireNonNull(vVar, "zone");
        if (vVar instanceof ZoneOffset) {
            return new y(localDateTime, vVar, (ZoneOffset) vVar);
        }
        j$.time.zone.f fVarU = vVar.u();
        List listF = fVarU.f(localDateTime);
        if (listF.size() == 1) {
            zoneOffset = (ZoneOffset) listF.get(0);
        } else if (listF.size() != 0) {
            if (zoneOffset == null || !listF.contains(zoneOffset)) {
                zoneOffset = (ZoneOffset) listF.get(0);
                Objects.requireNonNull(zoneOffset, "offset");
            }
        } else {
            Object objE = fVarU.e(localDateTime);
            j$.time.zone.b bVar = objE instanceof j$.time.zone.b ? (j$.time.zone.b) objE : null;
            localDateTime = localDateTime.N(Duration.ofSeconds(bVar.f5559d.f5371a - bVar.f5558c.f5371a).f5357a);
            zoneOffset = bVar.f5559d;
        }
        return new y(localDateTime, vVar, zoneOffset);
    }

    public static y u(long j4, int i, v vVar) {
        ZoneOffset zoneOffsetD = vVar.u().d(Instant.w(j4, i));
        return new y(LocalDateTime.K(j4, i, zoneOffsetD), vVar, zoneOffsetD);
    }

    public y(LocalDateTime localDateTime, v vVar, ZoneOffset zoneOffset) {
        this.f5551a = localDateTime;
        this.f5552b = zoneOffset;
        this.f5553c = vVar;
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
            if (qVar == j$.time.temporal.a.INSTANT_SECONDS || qVar == j$.time.temporal.a.OFFSET_SECONDS) {
                return ((j$.time.temporal.a) qVar).f5516b;
            }
            return this.f5551a.k(qVar);
        }
        return qVar.w(this);
    }

    @Override // j$.time.temporal.n
    public final int e(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            int i = x.f5550a[((j$.time.temporal.a) qVar).ordinal()];
            if (i == 1) {
                throw new j$.time.temporal.t("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            if (i == 2) {
                return this.f5552b.f5371a;
            }
            return this.f5551a.e(qVar);
        }
        return super.e(qVar);
    }

    @Override // j$.time.temporal.n
    public final long g(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            int i = x.f5550a[((j$.time.temporal.a) qVar).ordinal()];
            if (i == 1) {
                return L();
            }
            if (i == 2) {
                return this.f5552b.f5371a;
            }
            return this.f5551a.g(qVar);
        }
        return qVar.I(this);
    }

    @Override // j$.time.chrono.j
    public final ZoneOffset n() {
        return this.f5552b;
    }

    @Override // j$.time.chrono.j
    public final v D() {
        return this.f5553c;
    }

    @Override // j$.time.chrono.j
    public final j$.time.chrono.j y(v vVar) {
        Objects.requireNonNull(vVar, "zone");
        return this.f5553c.equals(vVar) ? this : w(this.f5551a, vVar, this.f5552b);
    }

    @Override // j$.time.chrono.j
    public final j$.time.chrono.e v() {
        return this.f5551a;
    }

    @Override // j$.time.chrono.j
    public final j$.time.chrono.b m() {
        return this.f5551a.f5363a;
    }

    @Override // j$.time.chrono.j
    public final i h() {
        return this.f5551a.f5364b;
    }

    @Override // j$.time.chrono.j
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final y z(f fVar) {
        return w(LocalDateTime.I(fVar, this.f5551a.f5364b), this.f5553c, this.f5552b);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m i(long j4, j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
            int i = x.f5550a[aVar.ordinal()];
            if (i == 1) {
                return u(j4, this.f5551a.f5364b.f5490d, this.f5553c);
            }
            if (i != 2) {
                return w(this.f5551a.i(j4, qVar), this.f5553c, this.f5552b);
            }
            ZoneOffset zoneOffsetN = ZoneOffset.N(aVar.f5516b.a(j4, aVar));
            return (zoneOffsetN.equals(this.f5552b) || !this.f5553c.u().f(this.f5551a).contains(zoneOffsetN)) ? this : new y(this.f5551a, this.f5553c, zoneOffsetN);
        }
        return (y) qVar.K(this, j4);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public final y l(long j4, j$.time.temporal.s sVar) {
        if (sVar instanceof j$.time.temporal.b) {
            j$.time.temporal.b bVar = (j$.time.temporal.b) sVar;
            if (bVar.compareTo(j$.time.temporal.b.DAYS) >= 0 && bVar != j$.time.temporal.b.FOREVER) {
                return w(this.f5551a.l(j4, sVar), this.f5553c, this.f5552b);
            }
            LocalDateTime localDateTimeL = this.f5551a.l(j4, sVar);
            ZoneOffset zoneOffset = this.f5552b;
            v vVar = this.f5553c;
            Objects.requireNonNull(localDateTimeL, "localDateTime");
            Objects.requireNonNull(zoneOffset, "offset");
            Objects.requireNonNull(vVar, "zone");
            if (vVar.u().f(localDateTimeL).contains(zoneOffset)) {
                return new y(localDateTimeL, vVar, zoneOffset);
            }
            return u(localDateTimeL.t(zoneOffset), localDateTimeL.f5364b.f5490d, vVar);
        }
        return (y) sVar.u(this, j4);
    }

    @Override // j$.time.temporal.m
    public final j$.time.chrono.j a(long j4, j$.time.temporal.s sVar) {
        return j4 == Long.MIN_VALUE ? l(Long.MAX_VALUE, sVar).l(1L, sVar) : l(-j4, sVar);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m a(long j4, j$.time.temporal.s sVar) {
        return j4 == Long.MIN_VALUE ? l(Long.MAX_VALUE, sVar).l(1L, sVar) : l(-j4, sVar);
    }

    @Override // j$.time.temporal.n
    public final Object b(j$.time.format.a aVar) {
        if (aVar == j$.time.temporal.r.f5538f) {
            return this.f5551a.f5363a;
        }
        return super.b(aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y) {
            y yVar = (y) obj;
            if (this.f5551a.equals(yVar.f5551a) && this.f5552b.equals(yVar.f5552b) && this.f5553c.equals(yVar.f5553c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f5551a.hashCode() ^ this.f5552b.f5371a) ^ Integer.rotateLeft(this.f5553c.hashCode(), 3);
    }

    public final String toString() {
        String str = this.f5551a.toString() + this.f5552b.f5372b;
        ZoneOffset zoneOffset = this.f5552b;
        v vVar = this.f5553c;
        if (zoneOffset == vVar) {
            return str;
        }
        return str + "[" + vVar.toString() + "]";
    }

    private Object writeReplace() {
        return new q((byte) 6, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
