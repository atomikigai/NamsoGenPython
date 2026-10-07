package j$.time;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class o implements j$.time.temporal.m, j$.time.temporal.o, Comparable, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f5499c = 0;
    private static final long serialVersionUID = 7264499704384272492L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f5500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ZoneOffset f5501b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        o oVar = (o) obj;
        if (this.f5501b.equals(oVar.f5501b)) {
            return this.f5500a.compareTo(oVar.f5500a);
        }
        int iCompare = Long.compare(this.f5500a.S() - (((long) this.f5501b.f5371a) * 1000000000), oVar.f5500a.S() - (((long) oVar.f5501b.f5371a) * 1000000000));
        return iCompare == 0 ? this.f5500a.compareTo(oVar.f5500a) : iCompare;
    }

    static {
        i iVar = i.e;
        ZoneOffset zoneOffset = ZoneOffset.f5370f;
        iVar.getClass();
        new o(iVar, zoneOffset);
        i iVar2 = i.f5485f;
        ZoneOffset zoneOffset2 = ZoneOffset.e;
        iVar2.getClass();
        new o(iVar2, zoneOffset2);
    }

    public o(i iVar, ZoneOffset zoneOffset) {
        Objects.requireNonNull(iVar, "time");
        this.f5500a = iVar;
        Objects.requireNonNull(zoneOffset, "offset");
        this.f5501b = zoneOffset;
    }

    public final o w(i iVar, ZoneOffset zoneOffset) {
        return (this.f5500a == iVar && this.f5501b.equals(zoneOffset)) ? this : new o(iVar, zoneOffset);
    }

    @Override // j$.time.temporal.n
    public final boolean f(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) qVar).N() || qVar == j$.time.temporal.a.OFFSET_SECONDS;
        }
        return qVar != null && qVar.u(this);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.u k(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            if (qVar != j$.time.temporal.a.OFFSET_SECONDS) {
                return this.f5500a.k(qVar);
            }
            return ((j$.time.temporal.a) qVar).f5516b;
        }
        return qVar.w(this);
    }

    @Override // j$.time.temporal.n
    public final long g(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            if (qVar == j$.time.temporal.a.OFFSET_SECONDS) {
                return this.f5501b.f5371a;
            }
            return this.f5500a.g(qVar);
        }
        return qVar.I(this);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: j */
    public final j$.time.temporal.m z(f fVar) {
        return (o) fVar.c(this);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m i(long j4, j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            if (qVar == j$.time.temporal.a.OFFSET_SECONDS) {
                j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
                return w(this.f5500a, ZoneOffset.N(aVar.f5516b.a(j4, aVar)));
            }
            return w(this.f5500a.i(j4, qVar), this.f5501b);
        }
        return (o) qVar.K(this, j4);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public final o l(long j4, j$.time.temporal.s sVar) {
        if (sVar instanceof j$.time.temporal.b) {
            return w(this.f5500a.l(j4, sVar), this.f5501b);
        }
        return (o) sVar.u(this, j4);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m a(long j4, j$.time.temporal.s sVar) {
        return j4 == Long.MIN_VALUE ? l(Long.MAX_VALUE, sVar).l(1L, sVar) : l(-j4, sVar);
    }

    @Override // j$.time.temporal.n
    public final Object b(j$.time.format.a aVar) {
        if (aVar == j$.time.temporal.r.f5537d || aVar == j$.time.temporal.r.e) {
            return this.f5501b;
        }
        if (((aVar == j$.time.temporal.r.f5534a) || (aVar == j$.time.temporal.r.f5535b)) || aVar == j$.time.temporal.r.f5538f) {
            return null;
        }
        if (aVar == j$.time.temporal.r.f5539g) {
            return this.f5500a;
        }
        if (aVar == j$.time.temporal.r.f5536c) {
            return j$.time.temporal.b.NANOS;
        }
        return aVar.a(this);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.m c(j$.time.temporal.m mVar) {
        return mVar.i(this.f5500a.S(), j$.time.temporal.a.NANO_OF_DAY).i(this.f5501b.f5371a, j$.time.temporal.a.OFFSET_SECONDS);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            if (this.f5500a.equals(oVar.f5500a) && this.f5501b.equals(oVar.f5501b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f5500a.hashCode() ^ this.f5501b.f5371a;
    }

    public final String toString() {
        return this.f5500a.toString() + this.f5501b.f5372b;
    }

    private Object writeReplace() {
        return new q((byte) 9, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
