package j$.time;

import com.google.android.gms.internal.ads.zzbbs;
import j$.time.format.DateTimeFormatter;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class Instant implements j$.time.temporal.m, j$.time.temporal.o, Comparable<Instant>, Serializable {
    public static final Instant EPOCH = new Instant(0, 0);
    private static final long serialVersionUID = -665713676816604388L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f5359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5360b;

    @Override // java.lang.Comparable
    public final int compareTo(Instant instant) {
        Instant instant2 = instant;
        int iCompare = Long.compare(this.f5359a, instant2.f5359a);
        return iCompare != 0 ? iCompare : this.f5360b - instant2.f5360b;
    }

    static {
        w(-31557014167219200L, 0L);
        w(31556889864403199L, 999999999L);
    }

    public static Instant w(long j4, long j10) {
        return u(Math.addExact(j4, Math.floorDiv(j10, 1000000000L)), (int) Math.floorMod(j10, 1000000000L));
    }

    public static Instant ofEpochMilli(long j4) {
        long j10 = zzbbs.zzq.zzf;
        return u(Math.floorDiv(j4, j10), ((int) Math.floorMod(j4, j10)) * 1000000);
    }

    public static Instant u(long j4, int i) {
        if ((((long) i) | j4) == 0) {
            return EPOCH;
        }
        if (j4 < -31557014167219200L || j4 > 31556889864403199L) {
            throw new a("Instant exceeds minimum or maximum instant");
        }
        return new Instant(j4, i);
    }

    public Instant(long j4, int i) {
        this.f5359a = j4;
        this.f5360b = i;
    }

    @Override // j$.time.temporal.n
    public final boolean f(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return qVar == j$.time.temporal.a.INSTANT_SECONDS || qVar == j$.time.temporal.a.NANO_OF_SECOND || qVar == j$.time.temporal.a.MICRO_OF_SECOND || qVar == j$.time.temporal.a.MILLI_OF_SECOND;
        }
        return qVar != null && qVar.u(this);
    }

    @Override // j$.time.temporal.n
    public final int e(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return super.k(qVar).a(qVar.I(this), qVar);
        }
        int i = d.f5429a[((j$.time.temporal.a) qVar).ordinal()];
        if (i == 1) {
            return this.f5360b;
        }
        if (i == 2) {
            return this.f5360b / zzbbs.zzq.zzf;
        }
        if (i == 3) {
            return this.f5360b / 1000000;
        }
        if (i == 4) {
            j$.time.temporal.a aVar = j$.time.temporal.a.INSTANT_SECONDS;
            aVar.f5516b.a(this.f5359a, aVar);
        }
        throw new j$.time.temporal.t(b.a("Unsupported field: ", qVar));
    }

    @Override // j$.time.temporal.n
    public final long g(j$.time.temporal.q qVar) {
        int i;
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.I(this);
        }
        int i10 = d.f5429a[((j$.time.temporal.a) qVar).ordinal()];
        if (i10 == 1) {
            i = this.f5360b;
        } else if (i10 == 2) {
            i = this.f5360b / zzbbs.zzq.zzf;
        } else {
            if (i10 != 3) {
                if (i10 == 4) {
                    return this.f5359a;
                }
                throw new j$.time.temporal.t(b.a("Unsupported field: ", qVar));
            }
            i = this.f5360b / 1000000;
        }
        return i;
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m j(f fVar) {
        return (Instant) fVar.c(this);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m i(long j4, j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return (Instant) qVar.K(this, j4);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        aVar.M(j4);
        int i = d.f5429a[aVar.ordinal()];
        if (i != 1) {
            if (i == 2) {
                int i10 = ((int) j4) * zzbbs.zzq.zzf;
                if (i10 != this.f5360b) {
                    return u(this.f5359a, i10);
                }
            } else if (i == 3) {
                int i11 = ((int) j4) * 1000000;
                if (i11 != this.f5360b) {
                    return u(this.f5359a, i11);
                }
            } else {
                if (i != 4) {
                    throw new j$.time.temporal.t(b.a("Unsupported field: ", qVar));
                }
                if (j4 != this.f5359a) {
                    return u(j4, this.f5360b);
                }
            }
        } else if (j4 != this.f5360b) {
            return u(this.f5359a, (int) j4);
        }
        return this;
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public final Instant l(long j4, j$.time.temporal.s sVar) {
        if (!(sVar instanceof j$.time.temporal.b)) {
            return (Instant) sVar.u(this, j4);
        }
        switch (d.f5430b[((j$.time.temporal.b) sVar).ordinal()]) {
            case 1:
                return C(0L, j4);
            case 2:
                return C(j4 / 1000000, (j4 % 1000000) * 1000);
            case 3:
                return C(j4 / 1000, (j4 % 1000) * 1000000);
            case 4:
                return C(j4, 0L);
            case 5:
                return C(Math.multiplyExact(j4, 60), 0L);
            case 6:
                return C(Math.multiplyExact(j4, 3600), 0L);
            case 7:
                return C(Math.multiplyExact(j4, 43200), 0L);
            case 8:
                return C(Math.multiplyExact(j4, 86400), 0L);
            default:
                throw new j$.time.temporal.t("Unsupported unit: " + sVar);
        }
    }

    public final Instant C(long j4, long j10) {
        if ((j4 | j10) == 0) {
            return this;
        }
        return w(Math.addExact(Math.addExact(this.f5359a, j4), j10 / 1000000000), ((long) this.f5360b) + (j10 % 1000000000));
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m a(long j4, j$.time.temporal.s sVar) {
        return j4 == Long.MIN_VALUE ? l(Long.MAX_VALUE, sVar).l(1L, sVar) : l(-j4, sVar);
    }

    @Override // j$.time.temporal.n
    public final Object b(j$.time.format.a aVar) {
        if (aVar == j$.time.temporal.r.f5536c) {
            return j$.time.temporal.b.NANOS;
        }
        if (aVar == j$.time.temporal.r.f5535b || aVar == j$.time.temporal.r.f5534a || aVar == j$.time.temporal.r.e || aVar == j$.time.temporal.r.f5537d || aVar == j$.time.temporal.r.f5538f || aVar == j$.time.temporal.r.f5539g) {
            return null;
        }
        return aVar.a(this);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.m c(j$.time.temporal.m mVar) {
        return mVar.i(this.f5359a, j$.time.temporal.a.INSTANT_SECONDS).i(this.f5360b, j$.time.temporal.a.NANO_OF_SECOND);
    }

    public OffsetDateTime atOffset(ZoneOffset zoneOffset) {
        return OffsetDateTime.u(this, zoneOffset);
    }

    public long toEpochMilli() {
        long j4 = this.f5359a;
        return (j4 >= 0 || this.f5360b <= 0) ? Math.addExact(Math.multiplyExact(j4, zzbbs.zzq.zzf), this.f5360b / 1000000) : Math.addExact(Math.multiplyExact(j4 + 1, zzbbs.zzq.zzf), (this.f5360b / 1000000) - zzbbs.zzq.zzf);
    }

    public boolean isAfter(Instant instant) {
        int iCompare = Long.compare(this.f5359a, instant.f5359a);
        if (iCompare == 0) {
            iCompare = this.f5360b - instant.f5360b;
        }
        return iCompare > 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Instant) {
            Instant instant = (Instant) obj;
            if (this.f5359a == instant.f5359a && this.f5360b == instant.f5360b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j4 = this.f5359a;
        return (this.f5360b * 51) + ((int) (j4 ^ (j4 >>> 32)));
    }

    public final String toString() {
        return DateTimeFormatter.e.a(this);
    }

    private Object writeReplace() {
        return new q((byte) 2, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
