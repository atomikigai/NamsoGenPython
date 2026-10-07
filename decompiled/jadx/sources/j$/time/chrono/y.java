package j$.time.chrono;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class y extends d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final j$.time.f f5421d = j$.time.f.P(1873, 1, 1);
    private static final long serialVersionUID = -305327627230580483L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient j$.time.f f5422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final transient z f5423b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient int f5424c;

    @Override // j$.time.chrono.b
    public final e F(j$.time.i iVar) {
        return new g(this, iVar);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    public y(j$.time.f fVar) {
        boolean z4;
        j$.time.f fVar2 = f5421d;
        if (fVar2 != null) {
            fVar.getClass();
            if (fVar.u(fVar2) < 0) {
                z4 = true;
            } else {
                z4 = false;
            }
        } else if (fVar.E() < fVar2.E()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            throw new j$.time.a("JapaneseDate before Meiji 6 is not supported");
        }
        z zVarO = z.o(fVar);
        this.f5423b = zVarO;
        this.f5424c = (fVar.f5434a - zVarO.f5427b.f5434a) + 1;
        this.f5422a = fVar;
    }

    @Override // j$.time.chrono.b
    public final m d() {
        return w.f5419c;
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final int hashCode() {
        w.f5419c.getClass();
        return this.f5422a.hashCode() ^ (-688086063);
    }

    @Override // j$.time.chrono.b
    public final n G() {
        return this.f5423b;
    }

    @Override // j$.time.chrono.b, j$.time.temporal.n
    public final boolean f(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH || qVar == j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR || qVar == j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH || qVar == j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR) {
            return false;
        }
        if (qVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) qVar).isDateBased();
        }
        return qVar != null && qVar.u(this);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0060  */
    /* JADX WARN: Code duplicated, block: B:27:0x0068  */
    /* JADX WARN: Code duplicated, block: B:28:0x006b  */
    @Override // j$.time.temporal.n
    public final j$.time.temporal.u k(j$.time.temporal.q qVar) {
        int iM;
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.w(this);
        }
        if (!f(qVar)) {
            throw new j$.time.temporal.t(j$.time.b.a("Unsupported field: ", qVar));
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        int i = x.f5420a[aVar.ordinal()];
        if (i == 1) {
            return j$.time.temporal.u.e(1L, this.f5422a.O());
        }
        if (i != 2) {
            if (i != 3) {
                return w.f5419c.w(aVar);
            }
            z zVar = this.f5423b;
            int i10 = zVar.f5427b.f5434a;
            z zVarP = zVar.p();
            return zVarP != null ? j$.time.temporal.u.e(1L, (zVarP.f5427b.f5434a - i10) + 1) : j$.time.temporal.u.e(1L, 999999999 - i10);
        }
        z zVarP2 = this.f5423b.p();
        if (zVarP2 != null) {
            j$.time.f fVar = zVarP2.f5427b;
            if (fVar.f5434a == this.f5422a.f5434a) {
                iM = fVar.M() - 1;
            } else if (this.f5422a.N()) {
                iM = 366;
            } else {
                iM = 365;
            }
        } else if (this.f5422a.N()) {
            iM = 366;
        } else {
            iM = 365;
        }
        if (this.f5424c == 1) {
            iM -= this.f5423b.f5427b.M() - 1;
        }
        return j$.time.temporal.u.e(1L, iM);
    }

    @Override // j$.time.temporal.n
    public final long g(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.I(this);
        }
        switch (x.f5420a[((j$.time.temporal.a) qVar).ordinal()]) {
            case 2:
                return this.f5424c == 1 ? (this.f5422a.M() - this.f5423b.f5427b.M()) + 1 : this.f5422a.M();
            case 3:
                return this.f5424c;
            case 4:
            case 5:
            case 6:
            case 7:
                throw new j$.time.temporal.t(j$.time.b.a("Unsupported field: ", qVar));
            case 8:
                return this.f5423b.f5426a;
            default:
                return this.f5422a.g(qVar);
        }
    }

    @Override // j$.time.chrono.d, j$.time.temporal.m
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public final y i(long j4, j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
            if (g(aVar) == j4) {
                return this;
            }
            int[] iArr = x.f5420a;
            int i = iArr[aVar.ordinal()];
            if (i == 3 || i == 8 || i == 9) {
                int iA = w.f5419c.w(aVar).a(j4, aVar);
                int i10 = iArr[aVar.ordinal()];
                if (i10 == 3) {
                    return O(this.f5423b, iA);
                }
                if (i10 == 8) {
                    return O(z.s(iA), this.f5424c);
                }
                if (i10 == 9) {
                    return N(this.f5422a.Z(iA));
                }
            }
            return N(this.f5422a.i(j4, qVar));
        }
        return (y) super.i(j4, qVar);
    }

    @Override // j$.time.chrono.d
    /* JADX INFO: renamed from: K */
    public final b z(j$.time.temporal.o oVar) {
        return (y) super.z(oVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.m
    /* JADX INFO: renamed from: j */
    public final j$.time.temporal.m z(j$.time.f fVar) {
        return (y) super.z(fVar);
    }

    public final y O(z zVar, int i) {
        w.f5419c.getClass();
        if (zVar == null) {
            throw new ClassCastException("Era must be JapaneseEra");
        }
        int i10 = zVar.f5427b.f5434a;
        int i11 = (i10 + i) - 1;
        if (i != 1 && (i11 < -999999999 || i11 > 999999999 || i11 < i10 || zVar != z.o(j$.time.f.P(i11, 1, 1)))) {
            throw new j$.time.a("Invalid yearOfEra value");
        }
        return N(this.f5422a.Z(i11));
    }

    @Override // j$.time.chrono.d
    public final b I(long j4) {
        return N(this.f5422a.U(j4));
    }

    @Override // j$.time.chrono.d
    public final b C(long j4) {
        return N(this.f5422a.T(j4));
    }

    @Override // j$.time.chrono.d
    public final b w(long j4) {
        return N(this.f5422a.S(j4));
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b, j$.time.temporal.m
    public final b l(long j4, j$.time.temporal.s sVar) {
        return (y) super.l(j4, sVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.m
    public final j$.time.temporal.m l(long j4, j$.time.temporal.s sVar) {
        return (y) super.l(j4, sVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.m
    public final b a(long j4, j$.time.temporal.s sVar) {
        return (y) super.a(j4, sVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.m
    public final j$.time.temporal.m a(long j4, j$.time.temporal.s sVar) {
        return (y) super.a(j4, sVar);
    }

    public final y N(j$.time.f fVar) {
        return fVar.equals(this.f5422a) ? this : new y(fVar);
    }

    @Override // j$.time.chrono.b
    public final long E() {
        return this.f5422a.E();
    }

    @Override // j$.time.chrono.d
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y) {
            return this.f5422a.equals(((y) obj).f5422a);
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new f0((byte) 4, this);
    }
}
