package j$.time.chrono;

import j$.time.Duration;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class l implements j, Serializable {
    private static final long serialVersionUID = -5261813987200935591L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient g f5399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final transient ZoneOffset f5400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient j$.time.v f5401c;

    public static l w(j$.time.v vVar, ZoneOffset zoneOffset, g gVar) {
        Objects.requireNonNull(gVar, "localDateTime");
        Objects.requireNonNull(vVar, "zone");
        if (vVar instanceof ZoneOffset) {
            return new l(vVar, (ZoneOffset) vVar, gVar);
        }
        j$.time.zone.f fVarU = vVar.u();
        LocalDateTime localDateTimeW = LocalDateTime.w(gVar);
        List listF = fVarU.f(localDateTimeW);
        if (listF.size() == 1) {
            zoneOffset = (ZoneOffset) listF.get(0);
        } else if (listF.size() != 0) {
            if (zoneOffset == null || !listF.contains(zoneOffset)) {
                zoneOffset = (ZoneOffset) listF.get(0);
            }
            gVar = gVar;
        } else {
            Object objE = fVarU.e(localDateTimeW);
            j$.time.zone.b bVar = objE instanceof j$.time.zone.b ? (j$.time.zone.b) objE : null;
            gVar = gVar.C(gVar.f5386a, 0L, 0L, Duration.ofSeconds(bVar.f5559d.f5371a - bVar.f5558c.f5371a).f5357a, 0L);
            zoneOffset = bVar.f5559d;
        }
        Objects.requireNonNull(zoneOffset, "offset");
        return new l(vVar, zoneOffset, gVar);
    }

    public static l u(m mVar, j$.time.temporal.m mVar2) {
        l lVar = (l) mVar2;
        if (mVar.equals(lVar.d())) {
            return lVar;
        }
        throw new ClassCastException("Chronology mismatch, required: " + mVar.o() + ", actual: " + lVar.d().o());
    }

    public l(j$.time.v vVar, ZoneOffset zoneOffset, g gVar) {
        Objects.requireNonNull(gVar, "dateTime");
        this.f5399a = gVar;
        Objects.requireNonNull(zoneOffset, "offset");
        this.f5400b = zoneOffset;
        Objects.requireNonNull(vVar, "zone");
        this.f5401c = vVar;
    }

    @Override // j$.time.chrono.j
    public final ZoneOffset n() {
        return this.f5400b;
    }

    public final int hashCode() {
        return (this.f5399a.hashCode() ^ this.f5400b.f5371a) ^ Integer.rotateLeft(this.f5401c.hashCode(), 3);
    }

    public final String toString() {
        String str = this.f5399a.toString() + this.f5400b.f5372b;
        ZoneOffset zoneOffset = this.f5400b;
        j$.time.v vVar = this.f5401c;
        if (zoneOffset == vVar) {
            return str;
        }
        return str + "[" + vVar.toString() + "]";
    }

    @Override // j$.time.chrono.j
    public final e v() {
        return this.f5399a;
    }

    @Override // j$.time.chrono.j
    public final j$.time.v D() {
        return this.f5401c;
    }

    @Override // j$.time.chrono.j
    public final j y(j$.time.v vVar) {
        return w(vVar, this.f5400b, this.f5399a);
    }

    @Override // j$.time.temporal.n
    public final boolean f(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return true;
        }
        return qVar != null && qVar.u(this);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m i(long j4, j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
            int i = k.f5397a[aVar.ordinal()];
            if (i == 1) {
                return l(j4 - L(), j$.time.temporal.b.SECONDS);
            }
            if (i == 2) {
                ZoneOffset zoneOffsetN = ZoneOffset.N(aVar.f5516b.a(j4, aVar));
                g gVar = this.f5399a;
                Instant instantW = Instant.w(gVar.t(zoneOffsetN), gVar.f5387b.f5490d);
                j$.time.v vVar = this.f5401c;
                m mVarD = d();
                ZoneOffset zoneOffsetD = vVar.u().d(instantW);
                Objects.requireNonNull(zoneOffsetD, "offset");
                return new l(vVar, zoneOffsetD, (g) mVarD.B(LocalDateTime.K(instantW.f5359a, instantW.f5360b, zoneOffsetD)));
            }
            return w(this.f5401c, this.f5400b, this.f5399a.i(j4, qVar));
        }
        return u(d(), qVar.K(this, j4));
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public final l l(long j4, j$.time.temporal.s sVar) {
        if (sVar instanceof j$.time.temporal.b) {
            return (l) z(this.f5399a.l(j4, sVar));
        }
        return u(d(), sVar.u(this, j4));
    }

    private Object writeReplace() {
        return new f0((byte) 3, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && compareTo((j) obj) == 0;
    }
}
