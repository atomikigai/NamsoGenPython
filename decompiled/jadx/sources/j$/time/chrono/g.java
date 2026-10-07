package j$.time.chrono;

import j$.time.ZoneOffset;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class g implements e, j$.time.temporal.m, j$.time.temporal.o, Serializable {
    private static final long serialVersionUID = 4556003607393004514L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient b f5386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final transient j$.time.i f5387b;

    public static g u(m mVar, j$.time.temporal.m mVar2) {
        g gVar = (g) mVar2;
        if (mVar.equals(gVar.d())) {
            return gVar;
        }
        throw new ClassCastException("Chronology mismatch, required: " + mVar.o() + ", actual: " + gVar.d().o());
    }

    public g(b bVar, j$.time.i iVar) {
        Objects.requireNonNull(iVar, "time");
        this.f5386a = bVar;
        this.f5387b = iVar;
    }

    public final g K(j$.time.temporal.m mVar, j$.time.i iVar) {
        b bVar = this.f5386a;
        return (bVar == mVar && this.f5387b == iVar) ? this : new g(d.u(bVar.d(), mVar), iVar);
    }

    public final int hashCode() {
        return this.f5386a.hashCode() ^ this.f5387b.hashCode();
    }

    @Override // j$.time.chrono.e
    public final b m() {
        return this.f5386a;
    }

    public final String toString() {
        return this.f5386a.toString() + "T" + this.f5387b.toString();
    }

    @Override // j$.time.chrono.e
    public final j$.time.i h() {
        return this.f5387b;
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
            return (((j$.time.temporal.a) qVar).N() ? this.f5387b : this.f5386a).k(qVar);
        }
        return qVar.w(this);
    }

    @Override // j$.time.temporal.n
    public final int e(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) qVar).N() ? this.f5387b.e(qVar) : this.f5386a.e(qVar);
        }
        return k(qVar).a(g(qVar), qVar);
    }

    @Override // j$.time.temporal.n
    public final long g(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) qVar).N() ? this.f5387b.g(qVar) : this.f5386a.g(qVar);
        }
        return qVar.I(this);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: j */
    public final j$.time.temporal.m z(j$.time.f fVar) {
        return K(fVar, this.f5387b);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public final g i(long j4, j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            if (((j$.time.temporal.a) qVar).N()) {
                return K(this.f5386a, this.f5387b.i(j4, qVar));
            }
            return K(this.f5386a.i(j4, qVar), this.f5387b);
        }
        return u(this.f5386a.d(), qVar.K(this, j4));
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public final g l(long j4, j$.time.temporal.s sVar) {
        if (!(sVar instanceof j$.time.temporal.b)) {
            return u(this.f5386a.d(), sVar.u(this, j4));
        }
        switch (f.f5383a[((j$.time.temporal.b) sVar).ordinal()]) {
            case 1:
                return C(this.f5386a, 0L, 0L, 0L, j4);
            case 2:
                g gVarK = K(this.f5386a.l(j4 / 86400000000L, (j$.time.temporal.s) j$.time.temporal.b.DAYS), this.f5387b);
                return gVarK.C(gVarK.f5386a, 0L, 0L, 0L, (j4 % 86400000000L) * 1000);
            case 3:
                g gVarK2 = K(this.f5386a.l(j4 / 86400000, (j$.time.temporal.s) j$.time.temporal.b.DAYS), this.f5387b);
                return gVarK2.C(gVarK2.f5386a, 0L, 0L, 0L, (j4 % 86400000) * 1000000);
            case 4:
                return C(this.f5386a, 0L, 0L, j4, 0L);
            case 5:
                return C(this.f5386a, 0L, j4, 0L, 0L);
            case 6:
                return C(this.f5386a, j4, 0L, 0L, 0L);
            case 7:
                g gVarK3 = K(this.f5386a.l(j4 / 256, (j$.time.temporal.s) j$.time.temporal.b.DAYS), this.f5387b);
                return gVarK3.C(gVarK3.f5386a, (j4 % 256) * 12, 0L, 0L, 0L);
            default:
                return K(this.f5386a.l(j4, sVar), this.f5387b);
        }
    }

    public final g C(b bVar, long j4, long j10, long j11, long j12) {
        if ((j4 | j10 | j11 | j12) == 0) {
            return K(bVar, this.f5387b);
        }
        long j13 = j4 / 24;
        long j14 = ((j4 % 24) * 3600000000000L) + ((j10 % 1440) * 60000000000L) + ((j11 % 86400) * 1000000000) + (j12 % 86400000000000L);
        long jS = this.f5387b.S();
        long j15 = j14 + jS;
        long jFloorDiv = Math.floorDiv(j15, 86400000000000L) + j13 + (j10 / 1440) + (j11 / 86400) + (j12 / 86400000000000L);
        long jFloorMod = Math.floorMod(j15, 86400000000000L);
        return K(bVar.l(jFloorDiv, (j$.time.temporal.s) j$.time.temporal.b.DAYS), jFloorMod == jS ? this.f5387b : j$.time.i.K(jFloorMod));
    }

    @Override // j$.time.chrono.e
    public final j r(ZoneOffset zoneOffset) {
        return l.w(zoneOffset, null, this);
    }

    private Object writeReplace() {
        return new f0((byte) 2, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && compareTo((e) obj) == 0;
    }
}
