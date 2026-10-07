package j$.time;

import com.google.android.gms.internal.ads.zzbbs;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class f implements j$.time.temporal.m, j$.time.temporal.o, j$.time.chrono.b, Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f f5433d = P(-999999999, 1, 1);
    public static final f e = P(999999999, 12, 31);
    private static final long serialVersionUID = 2942565459149668126L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final short f5435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final short f5436c;

    static {
        P(1970, 1, 1);
    }

    public static f P(int i, int i10, int i11) {
        j$.time.temporal.a.YEAR.M(i);
        j$.time.temporal.a.MONTH_OF_YEAR.M(i10);
        j$.time.temporal.a.DAY_OF_MONTH.M(i11);
        return w(i, i10, i11);
    }

    public static f Q(long j4) {
        long j10;
        j$.time.temporal.a.EPOCH_DAY.M(j4);
        long j11 = 719468 + j4;
        if (j11 < 0) {
            long j12 = ((j4 + 719469) / 146097) - 1;
            j10 = j12 * 400;
            j11 += (-j12) * 146097;
        } else {
            j10 = 0;
        }
        long j13 = ((j11 * 400) + 591) / 146097;
        long j14 = j11 - ((j13 / 400) + (((j13 / 4) + (j13 * 365)) - (j13 / 100)));
        if (j14 < 0) {
            j13--;
            j14 = j11 - ((j13 / 400) + (((j13 / 4) + (365 * j13)) - (j13 / 100)));
        }
        int i = (int) j14;
        int i10 = ((i * 5) + 2) / 153;
        int i11 = ((i10 + 2) % 12) + 1;
        int i12 = (i - (((i10 * 306) + 5) / 10)) + 1;
        long j15 = j13 + j10 + ((long) (i10 / 10));
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return new f(aVar.f5516b.a(j15, aVar), i11, i12);
    }

    public static f C(j$.time.temporal.n nVar) {
        Objects.requireNonNull(nVar, "temporal");
        f fVar = (f) nVar.b(j$.time.temporal.r.f5538f);
        if (fVar != null) {
            return fVar;
        }
        throw new a("Unable to obtain LocalDate from TemporalAccessor: " + nVar + " of type " + nVar.getClass().getName());
    }

    public static f w(int i, int i10, int i11) {
        int i12 = 28;
        if (i11 > 28) {
            if (i10 != 2) {
                i12 = (i10 == 4 || i10 == 6 || i10 == 9 || i10 == 11) ? 30 : 31;
            } else {
                j$.time.chrono.t.f5416c.getClass();
                if (j$.time.chrono.t.w(i)) {
                    i12 = 29;
                }
            }
            if (i11 > i12) {
                if (i11 == 29) {
                    throw new a("Invalid date 'February 29' as '" + i + "' is not a leap year");
                }
                throw new a("Invalid date '" + k.I(i10).name() + " " + i11 + "'");
            }
        }
        return new f(i, i10, i11);
    }

    public static f V(int i, int i10, int i11) {
        if (i10 == 2) {
            j$.time.chrono.t.f5416c.getClass();
            i11 = Math.min(i11, j$.time.chrono.t.w((long) i) ? 29 : 28);
        } else if (i10 == 4 || i10 == 6 || i10 == 9 || i10 == 11) {
            i11 = Math.min(i11, 30);
        }
        return new f(i, i10, i11);
    }

    public f(int i, int i10, int i11) {
        this.f5434a = i;
        this.f5435b = (short) i10;
        this.f5436c = (short) i11;
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.u k(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.w(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        if (!aVar.isDateBased()) {
            throw new j$.time.temporal.t(b.a("Unsupported field: ", qVar));
        }
        int i = e.f5431a[aVar.ordinal()];
        if (i == 1) {
            return j$.time.temporal.u.e(1L, O());
        }
        if (i == 2) {
            return j$.time.temporal.u.e(1L, N() ? 366 : 365);
        }
        if (i == 3) {
            return j$.time.temporal.u.e(1L, (k.I(this.f5435b) != k.FEBRUARY || N()) ? 5L : 4L);
        }
        if (i != 4) {
            return aVar.f5516b;
        }
        return this.f5434a <= 0 ? j$.time.temporal.u.e(1L, 1000000000L) : j$.time.temporal.u.e(1L, 999999999L);
    }

    @Override // j$.time.temporal.n
    public final int e(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return I(qVar);
        }
        return super.e(qVar);
    }

    @Override // j$.time.temporal.n
    public final long g(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            if (qVar == j$.time.temporal.a.EPOCH_DAY) {
                return E();
            }
            if (qVar != j$.time.temporal.a.PROLEPTIC_MONTH) {
                return I(qVar);
            }
            return ((((long) this.f5434a) * 12) + ((long) this.f5435b)) - 1;
        }
        return qVar.I(this);
    }

    public final int I(j$.time.temporal.q qVar) {
        switch (e.f5431a[((j$.time.temporal.a) qVar).ordinal()]) {
            case 1:
                return this.f5436c;
            case 2:
                return M();
            case 3:
                return ((this.f5436c - 1) / 7) + 1;
            case 4:
                int i = this.f5434a;
                return i >= 1 ? i : 1 - i;
            case 5:
                return K().getValue();
            case 6:
                return ((this.f5436c - 1) % 7) + 1;
            case 7:
                return ((M() - 1) % 7) + 1;
            case 8:
                throw new j$.time.temporal.t("Invalid field 'EpochDay' for get() method, use getLong() instead");
            case 9:
                return ((M() - 1) / 7) + 1;
            case 10:
                return this.f5435b;
            case 11:
                throw new j$.time.temporal.t("Invalid field 'ProlepticMonth' for get() method, use getLong() instead");
            case 12:
                return this.f5434a;
            case 13:
                return this.f5434a >= 1 ? 1 : 0;
            default:
                throw new j$.time.temporal.t(b.a("Unsupported field: ", qVar));
        }
    }

    @Override // j$.time.chrono.b
    public final j$.time.chrono.m d() {
        return j$.time.chrono.t.f5416c;
    }

    public final int M() {
        return (k.I(this.f5435b).u(N()) + this.f5436c) - 1;
    }

    public final c K() {
        return c.u(((int) Math.floorMod(E() + 3, 7)) + 1);
    }

    public final boolean N() {
        j$.time.chrono.t tVar = j$.time.chrono.t.f5416c;
        long j4 = this.f5434a;
        tVar.getClass();
        return j$.time.chrono.t.w(j4);
    }

    public final int O() {
        short s10 = this.f5435b;
        if (s10 != 2) {
            return (s10 == 4 || s10 == 6 || s10 == 9 || s10 == 11) ? 30 : 31;
        }
        return N() ? 29 : 28;
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public final f z(j$.time.temporal.o oVar) {
        if (oVar instanceof f) {
            return (f) oVar;
        }
        return (f) oVar.c(this);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public final f i(long j4, j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return (f) qVar.K(this, j4);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        aVar.M(j4);
        switch (e.f5431a[aVar.ordinal()]) {
            case 1:
                int i = (int) j4;
                if (this.f5436c != i) {
                    return P(this.f5434a, this.f5435b, i);
                }
                return this;
            case 2:
                return Y((int) j4);
            case 3:
                return S(Math.multiplyExact(j4 - g(j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH), 7));
            case 4:
                if (this.f5434a < 1) {
                    j4 = 1 - j4;
                }
                return Z((int) j4);
            case 5:
                return S(j4 - ((long) K().getValue()));
            case 6:
                return S(j4 - g(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 7:
                return S(j4 - g(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 8:
                return Q(j4);
            case 9:
                return S(Math.multiplyExact(j4 - g(j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR), 7));
            case 10:
                int i10 = (int) j4;
                if (this.f5435b != i10) {
                    j$.time.temporal.a.MONTH_OF_YEAR.M(i10);
                    return V(this.f5434a, i10, this.f5436c);
                }
                return this;
            case 11:
                return T(j4 - (((((long) this.f5434a) * 12) + ((long) this.f5435b)) - 1));
            case 12:
                return Z((int) j4);
            case 13:
                if (g(j$.time.temporal.a.ERA) != j4) {
                    return Z(1 - this.f5434a);
                }
                return this;
            default:
                throw new j$.time.temporal.t(b.a("Unsupported field: ", qVar));
        }
    }

    public final f Z(int i) {
        if (this.f5434a == i) {
            return this;
        }
        j$.time.temporal.a.YEAR.M(i);
        return V(i, this.f5435b, this.f5436c);
    }

    public final f Y(int i) {
        if (M() == i) {
            return this;
        }
        int i10 = this.f5434a;
        long j4 = i10;
        j$.time.temporal.a.YEAR.M(j4);
        j$.time.temporal.a.DAY_OF_YEAR.M(i);
        j$.time.chrono.t.f5416c.getClass();
        boolean zW = j$.time.chrono.t.w(j4);
        if (i == 366 && !zW) {
            throw new a("Invalid date 'DayOfYear 366' as '" + i10 + "' is not a leap year");
        }
        k kVarI = k.I(((i - 1) / 31) + 1);
        if (i > (kVarI.w(zW) + kVarI.u(zW)) - 1) {
            kVarI = k.f5492a[((((int) 1) + 12) + kVarI.ordinal()) % 12];
        }
        return new f(i10, kVarI.getValue(), (i - kVarI.u(zW)) + 1);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public final f l(long j4, j$.time.temporal.s sVar) {
        if (!(sVar instanceof j$.time.temporal.b)) {
            return (f) sVar.u(this, j4);
        }
        switch (e.f5432b[((j$.time.temporal.b) sVar).ordinal()]) {
            case 1:
                return S(j4);
            case 2:
                return S(Math.multiplyExact(j4, 7));
            case 3:
                return T(j4);
            case 4:
                return U(j4);
            case 5:
                return U(Math.multiplyExact(j4, 10));
            case 6:
                return U(Math.multiplyExact(j4, 100));
            case 7:
                return U(Math.multiplyExact(j4, zzbbs.zzq.zzf));
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return i(Math.addExact(g(aVar), j4), aVar);
            default:
                throw new j$.time.temporal.t("Unsupported unit: " + sVar);
        }
    }

    public final f U(long j4) {
        if (j4 == 0) {
            return this;
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return V(aVar.f5516b.a(((long) this.f5434a) + j4, aVar), this.f5435b, this.f5436c);
    }

    public final f T(long j4) {
        if (j4 == 0) {
            return this;
        }
        long j10 = (((long) this.f5434a) * 12) + ((long) (this.f5435b - 1)) + j4;
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        long j11 = 12;
        return V(aVar.f5516b.a(Math.floorDiv(j10, j11), aVar), ((int) Math.floorMod(j10, j11)) + 1, this.f5436c);
    }

    public final f S(long j4) {
        if (j4 == 0) {
            return this;
        }
        long j10 = ((long) this.f5436c) + j4;
        if (j10 > 0) {
            if (j10 <= 28) {
                return new f(this.f5434a, this.f5435b, (int) j10);
            }
            if (j10 <= 59) {
                long jO = O();
                if (j10 <= jO) {
                    return new f(this.f5434a, this.f5435b, (int) j10);
                }
                short s10 = this.f5435b;
                if (s10 < 12) {
                    return new f(this.f5434a, s10 + 1, (int) (j10 - jO));
                }
                j$.time.temporal.a.YEAR.M(this.f5434a + 1);
                return new f(this.f5434a + 1, 1, (int) (j10 - jO));
            }
        }
        return Q(Math.addExact(E(), j4));
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m a(long j4, j$.time.temporal.s sVar) {
        return j4 == Long.MIN_VALUE ? l(Long.MAX_VALUE, sVar).l(1L, sVar) : l(-j4, sVar);
    }

    @Override // j$.time.temporal.n
    public final Object b(j$.time.format.a aVar) {
        return aVar == j$.time.temporal.r.f5538f ? this : super.b(aVar);
    }

    @Override // j$.time.chrono.b
    public final j$.time.chrono.e F(i iVar) {
        return LocalDateTime.I(this, iVar);
    }

    @Override // j$.time.chrono.b
    public final long E() {
        long j4;
        long j10 = this.f5434a;
        long j11 = this.f5435b;
        long j12 = 365 * j10;
        if (j10 >= 0) {
            j4 = ((j10 + 399) / 400) + (((3 + j10) / 4) - ((99 + j10) / 100)) + j12;
        } else {
            j4 = j12 - ((j10 / (-400)) + ((j10 / (-4)) - (j10 / (-100))));
        }
        long j13 = (((367 * j11) - 362) / 12) + j4 + ((long) (this.f5436c - 1));
        if (j11 > 2) {
            j13 = !N() ? j13 - 2 : j13 - 1;
        }
        return j13 - 719528;
    }

    @Override // j$.time.chrono.b, java.lang.Comparable
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public final int compareTo(j$.time.chrono.b bVar) {
        if (bVar instanceof f) {
            return u((f) bVar);
        }
        return super.compareTo(bVar);
    }

    public final int u(f fVar) {
        int i = this.f5434a - fVar.f5434a;
        if (i != 0) {
            return i;
        }
        int i10 = this.f5435b - fVar.f5435b;
        return i10 == 0 ? this.f5436c - fVar.f5436c : i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && u((f) obj) == 0;
    }

    @Override // j$.time.chrono.b
    public final int hashCode() {
        int i = this.f5434a;
        return (((i << 11) + (this.f5435b << 6)) + this.f5436c) ^ (i & (-2048));
    }

    @Override // j$.time.chrono.b
    public final String toString() {
        int i = this.f5434a;
        short s10 = this.f5435b;
        short s11 = this.f5436c;
        int iAbs = Math.abs(i);
        StringBuilder sb2 = new StringBuilder(10);
        if (iAbs >= 1000) {
            if (i > 9999) {
                sb2.append('+');
            }
            sb2.append(i);
        } else if (i < 0) {
            sb2.append(i - 10000);
            sb2.deleteCharAt(1);
        } else {
            sb2.append(i + 10000);
            sb2.deleteCharAt(0);
        }
        sb2.append(s10 < 10 ? "-0" : "-");
        sb2.append((int) s10);
        sb2.append(s11 < 10 ? "-0" : "-");
        sb2.append((int) s11);
        return sb2.toString();
    }

    private Object writeReplace() {
        return new q((byte) 3, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
