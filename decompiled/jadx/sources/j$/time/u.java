package j$.time;

import com.google.android.gms.internal.ads.zzbbs;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class u implements j$.time.temporal.m, j$.time.temporal.o, Comparable, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f5544c = 0;
    private static final long serialVersionUID = 4183400860270640070L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5546b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        u uVar = (u) obj;
        int i = this.f5545a - uVar.f5545a;
        return i == 0 ? this.f5546b - uVar.f5546b : i;
    }

    static {
        j$.time.format.n nVar = new j$.time.format.n();
        nVar.h(j$.time.temporal.a.YEAR, 4, 10, j$.time.format.u.EXCEEDS_PAD);
        nVar.c('-');
        nVar.g(j$.time.temporal.a.MONTH_OF_YEAR, 2);
        nVar.l(Locale.getDefault(), j$.time.format.t.SMART, null);
    }

    public u(int i, int i10) {
        this.f5545a = i;
        this.f5546b = i10;
    }

    public final u K(int i, int i10) {
        return (this.f5545a == i && this.f5546b == i10) ? this : new u(i, i10);
    }

    @Override // j$.time.temporal.n
    public final boolean f(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return qVar == j$.time.temporal.a.YEAR || qVar == j$.time.temporal.a.MONTH_OF_YEAR || qVar == j$.time.temporal.a.PROLEPTIC_MONTH || qVar == j$.time.temporal.a.YEAR_OF_ERA || qVar == j$.time.temporal.a.ERA;
        }
        return qVar != null && qVar.u(this);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.u k(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.a.YEAR_OF_ERA) {
            return j$.time.temporal.u.e(1L, this.f5545a <= 0 ? 1000000000L : 999999999L);
        }
        return super.k(qVar);
    }

    @Override // j$.time.temporal.n
    public final int e(j$.time.temporal.q qVar) {
        return k(qVar).a(g(qVar), qVar);
    }

    @Override // j$.time.temporal.n
    public final long g(j$.time.temporal.q qVar) {
        int i;
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.I(this);
        }
        int i10 = t.f5512a[((j$.time.temporal.a) qVar).ordinal()];
        if (i10 == 1) {
            i = this.f5546b;
        } else {
            if (i10 == 2) {
                return u();
            }
            if (i10 == 3) {
                int i11 = this.f5545a;
                if (i11 < 1) {
                    i11 = 1 - i11;
                }
                return i11;
            }
            if (i10 != 4) {
                if (i10 == 5) {
                    return this.f5545a < 1 ? 0 : 1;
                }
                throw new j$.time.temporal.t(b.a("Unsupported field: ", qVar));
            }
            i = this.f5545a;
        }
        return i;
    }

    public final long u() {
        return ((((long) this.f5545a) * 12) + ((long) this.f5546b)) - 1;
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: j */
    public final j$.time.temporal.m z(f fVar) {
        return (u) fVar.c(this);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public final u i(long j4, j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return (u) qVar.K(this, j4);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        aVar.M(j4);
        int i = t.f5512a[aVar.ordinal()];
        if (i == 1) {
            int i10 = (int) j4;
            j$.time.temporal.a.MONTH_OF_YEAR.M(i10);
            return K(this.f5545a, i10);
        }
        if (i == 2) {
            return C(j4 - u());
        }
        if (i == 3) {
            if (this.f5545a < 1) {
                j4 = 1 - j4;
            }
            int i11 = (int) j4;
            j$.time.temporal.a.YEAR.M(i11);
            return K(i11, this.f5546b);
        }
        if (i == 4) {
            int i12 = (int) j4;
            j$.time.temporal.a.YEAR.M(i12);
            return K(i12, this.f5546b);
        }
        if (i != 5) {
            throw new j$.time.temporal.t(b.a("Unsupported field: ", qVar));
        }
        if (g(j$.time.temporal.a.ERA) == j4) {
            return this;
        }
        int i13 = 1 - this.f5545a;
        j$.time.temporal.a.YEAR.M(i13);
        return K(i13, this.f5546b);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public final u l(long j4, j$.time.temporal.s sVar) {
        if (!(sVar instanceof j$.time.temporal.b)) {
            return (u) sVar.u(this, j4);
        }
        switch (t.f5513b[((j$.time.temporal.b) sVar).ordinal()]) {
            case 1:
                return C(j4);
            case 2:
                return I(j4);
            case 3:
                return I(Math.multiplyExact(j4, 10));
            case 4:
                return I(Math.multiplyExact(j4, 100));
            case 5:
                return I(Math.multiplyExact(j4, zzbbs.zzq.zzf));
            case 6:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return i(Math.addExact(g(aVar), j4), aVar);
            default:
                throw new j$.time.temporal.t("Unsupported unit: " + sVar);
        }
    }

    public final u I(long j4) {
        if (j4 == 0) {
            return this;
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return K(aVar.f5516b.a(((long) this.f5545a) + j4, aVar), this.f5546b);
    }

    public final u C(long j4) {
        if (j4 == 0) {
            return this;
        }
        long j10 = (((long) this.f5545a) * 12) + ((long) (this.f5546b - 1)) + j4;
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        long j11 = 12;
        return K(aVar.f5516b.a(Math.floorDiv(j10, j11), aVar), ((int) Math.floorMod(j10, j11)) + 1);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m a(long j4, j$.time.temporal.s sVar) {
        return j4 == Long.MIN_VALUE ? l(Long.MAX_VALUE, sVar).l(1L, sVar) : l(-j4, sVar);
    }

    @Override // j$.time.temporal.n
    public final Object b(j$.time.format.a aVar) {
        if (aVar == j$.time.temporal.r.f5535b) {
            return j$.time.chrono.t.f5416c;
        }
        if (aVar == j$.time.temporal.r.f5536c) {
            return j$.time.temporal.b.MONTHS;
        }
        return super.b(aVar);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.m c(j$.time.temporal.m mVar) {
        if (!j$.time.chrono.m.p(mVar).equals(j$.time.chrono.t.f5416c)) {
            throw new a("Adjustment only supported on ISO date-time");
        }
        return mVar.i(u(), j$.time.temporal.a.PROLEPTIC_MONTH);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u) {
            u uVar = (u) obj;
            if (this.f5545a == uVar.f5545a && this.f5546b == uVar.f5546b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f5545a ^ (this.f5546b << 27);
    }

    public final String toString() {
        int iAbs = Math.abs(this.f5545a);
        StringBuilder sb2 = new StringBuilder(9);
        if (iAbs < 1000) {
            int i = this.f5545a;
            if (i < 0) {
                sb2.append(i - 10000);
                sb2.deleteCharAt(1);
            } else {
                sb2.append(i + 10000);
                sb2.deleteCharAt(0);
            }
        } else {
            sb2.append(this.f5545a);
        }
        sb2.append(this.f5546b < 10 ? "-0" : "-");
        sb2.append(this.f5546b);
        return sb2.toString();
    }

    private Object writeReplace() {
        return new q((byte) 12, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
