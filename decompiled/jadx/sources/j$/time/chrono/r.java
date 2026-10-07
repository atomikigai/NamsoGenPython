package j$.time.chrono;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class r extends d {
    private static final long serialVersionUID = -5207853542612002020L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient p f5411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final transient int f5412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient int f5413c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f5414d;

    @Override // j$.time.chrono.b
    public final e F(j$.time.i iVar) {
        return new g(this, iVar);
    }

    public r(p pVar, int i, int i10, int i11) {
        pVar.I(i, i10, i11);
        this.f5411a = pVar;
        this.f5412b = i;
        this.f5413c = i10;
        this.f5414d = i11;
    }

    public r(p pVar, long j4) {
        int i = (int) j4;
        pVar.w();
        if (i < pVar.e || i >= pVar.f5406f) {
            throw new j$.time.a("Hijrah date out of range");
        }
        int iBinarySearch = Arrays.binarySearch(pVar.f5405d, i);
        iBinarySearch = iBinarySearch < 0 ? (-iBinarySearch) - 2 : iBinarySearch;
        int i10 = pVar.f5407g;
        int[] iArr = {(iBinarySearch + i10) / 12, ((i10 + iBinarySearch) % 12) + 1, (i - pVar.f5405d[iBinarySearch]) + 1};
        this.f5411a = pVar;
        this.f5412b = iArr[0];
        this.f5413c = iArr[1];
        this.f5414d = iArr[2];
    }

    @Override // j$.time.chrono.b
    public final m d() {
        return this.f5411a;
    }

    @Override // j$.time.chrono.b
    public final n G() {
        return s.AH;
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.u k(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.w(this);
        }
        if (!f(qVar)) {
            throw new j$.time.temporal.t(j$.time.b.a("Unsupported field: ", qVar));
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        int i = q.f5410a[aVar.ordinal()];
        if (i == 1) {
            return j$.time.temporal.u.e(1L, this.f5411a.K(this.f5412b, this.f5413c));
        }
        if (i != 2) {
            return i != 3 ? this.f5411a.N(aVar) : j$.time.temporal.u.e(1L, 5L);
        }
        return j$.time.temporal.u.e(1L, this.f5411a.O(this.f5412b, 12));
    }

    @Override // j$.time.temporal.n
    public final long g(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.I(this);
        }
        switch (q.f5410a[((j$.time.temporal.a) qVar).ordinal()]) {
            case 1:
                return this.f5414d;
            case 2:
                return M();
            case 3:
                return ((this.f5414d - 1) / 7) + 1;
            case 4:
                return ((int) Math.floorMod(E() + 3, 7)) + 1;
            case 5:
                return ((this.f5414d - 1) % 7) + 1;
            case 6:
                return ((M() - 1) % 7) + 1;
            case 7:
                return E();
            case 8:
                return ((M() - 1) / 7) + 1;
            case 9:
                return this.f5413c;
            case 10:
                return ((((long) this.f5412b) * 12) + ((long) this.f5413c)) - 1;
            case 11:
                return this.f5412b;
            case 12:
                return this.f5412b;
            case 13:
                return this.f5412b <= 1 ? 0 : 1;
            default:
                throw new j$.time.temporal.t(j$.time.b.a("Unsupported field: ", qVar));
        }
    }

    @Override // j$.time.chrono.d, j$.time.temporal.m
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public final r i(long j4, j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return (r) super.i(j4, qVar);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        this.f5411a.N(aVar).b(j4, aVar);
        int i = (int) j4;
        switch (q.f5410a[aVar.ordinal()]) {
            case 1:
                return P(this.f5412b, this.f5413c, i);
            case 2:
                return w(Math.min(i, this.f5411a.O(this.f5412b, 12)) - M());
            case 3:
                return w((j4 - g(j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH)) * 7);
            case 4:
                return w(j4 - ((long) (((int) Math.floorMod(E() + 3, 7)) + 1)));
            case 5:
                return w(j4 - g(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 6:
                return w(j4 - g(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 7:
                return new r(this.f5411a, j4);
            case 8:
                return w((j4 - g(j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR)) * 7);
            case 9:
                return P(this.f5412b, i, this.f5414d);
            case 10:
                return C(j4 - (((((long) this.f5412b) * 12) + ((long) this.f5413c)) - 1));
            case 11:
                if (this.f5412b < 1) {
                    i = 1 - i;
                }
                return P(i, this.f5413c, this.f5414d);
            case 12:
                return P(i, this.f5413c, this.f5414d);
            case 13:
                return P(1 - this.f5412b, this.f5413c, this.f5414d);
            default:
                throw new j$.time.temporal.t(j$.time.b.a("Unsupported field: ", qVar));
        }
    }

    public final r P(int i, int i10, int i11) {
        int iK = this.f5411a.K(i, i10);
        if (i11 > iK) {
            i11 = iK;
        }
        return new r(this.f5411a, i, i10, i11);
    }

    @Override // j$.time.chrono.d
    /* JADX INFO: renamed from: K */
    public final b z(j$.time.temporal.o oVar) {
        return (r) super.z(oVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.m
    /* JADX INFO: renamed from: j */
    public final j$.time.temporal.m z(j$.time.f fVar) {
        return (r) super.z(fVar);
    }

    @Override // j$.time.chrono.b
    public final long E() {
        return this.f5411a.I(this.f5412b, this.f5413c, this.f5414d);
    }

    public final int M() {
        return this.f5411a.O(this.f5412b, this.f5413c - 1) + this.f5414d;
    }

    @Override // j$.time.chrono.d
    public final b I(long j4) {
        return j4 == 0 ? this : P(Math.addExact(this.f5412b, (int) j4), this.f5413c, this.f5414d);
    }

    @Override // j$.time.chrono.d
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public final r C(long j4) {
        if (j4 == 0) {
            return this;
        }
        long j10 = (((long) this.f5412b) * 12) + ((long) (this.f5413c - 1)) + j4;
        p pVar = this.f5411a;
        long jFloorDiv = Math.floorDiv(j10, 12L);
        int i = pVar.f5407g;
        if (jFloorDiv >= i / 12 && jFloorDiv <= (((pVar.f5405d.length - 1) + i) / 12) - 1) {
            return P((int) jFloorDiv, ((int) Math.floorMod(j10, 12L)) + 1, this.f5414d);
        }
        throw new j$.time.a("Invalid Hijrah year: " + jFloorDiv);
    }

    @Override // j$.time.chrono.d
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public final r w(long j4) {
        return new r(this.f5411a, E() + j4);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b, j$.time.temporal.m
    public final b l(long j4, j$.time.temporal.s sVar) {
        return (r) super.l(j4, sVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.m
    public final j$.time.temporal.m l(long j4, j$.time.temporal.s sVar) {
        return (r) super.l(j4, sVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.m
    public final b a(long j4, j$.time.temporal.s sVar) {
        return (r) super.a(j4, sVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.m
    public final j$.time.temporal.m a(long j4, j$.time.temporal.s sVar) {
        return (r) super.a(j4, sVar);
    }

    @Override // j$.time.chrono.d
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r) {
            r rVar = (r) obj;
            if (this.f5412b == rVar.f5412b && this.f5413c == rVar.f5413c && this.f5414d == rVar.f5414d && this.f5411a.equals(rVar.f5411a)) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final int hashCode() {
        int i = this.f5412b;
        int i10 = this.f5413c;
        int i11 = this.f5414d;
        this.f5411a.getClass();
        return (((i << 11) + (i10 << 6)) + i11) ^ ((i & (-2048)) ^ 2100100019);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new f0((byte) 6, this);
    }
}
