package j$.time.chrono;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class d0 extends d {
    private static final long serialVersionUID = 1300372329181994526L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient j$.time.f f5381a;

    @Override // j$.time.chrono.b
    public final e F(j$.time.i iVar) {
        return new g(this, iVar);
    }

    public d0(j$.time.f fVar) {
        Objects.requireNonNull(fVar, "isoDate");
        this.f5381a = fVar;
    }

    @Override // j$.time.chrono.b
    public final m d() {
        return b0.f5378c;
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final int hashCode() {
        b0.f5378c.getClass();
        return this.f5381a.hashCode() ^ (-1990173233);
    }

    @Override // j$.time.chrono.b
    public final n G() {
        return M() >= 1 ? e0.ROC : e0.BEFORE_ROC;
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
        int i = c0.f5380a[aVar.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return this.f5381a.k(qVar);
        }
        if (i != 4) {
            return b0.f5378c.w(aVar);
        }
        j$.time.temporal.u uVar = j$.time.temporal.a.YEAR.f5516b;
        return j$.time.temporal.u.e(1L, M() <= 0 ? (-uVar.f5540a) + 1912 : uVar.f5543d - 1911);
    }

    @Override // j$.time.temporal.n
    public final long g(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            int i = c0.f5380a[((j$.time.temporal.a) qVar).ordinal()];
            if (i == 4) {
                int iM = M();
                if (iM < 1) {
                    iM = 1 - iM;
                }
                return iM;
            }
            if (i == 5) {
                return ((((long) M()) * 12) + ((long) this.f5381a.f5435b)) - 1;
            }
            if (i == 6) {
                return M();
            }
            if (i != 7) {
                return this.f5381a.g(qVar);
            }
            return M() < 1 ? 0 : 1;
        }
        return qVar.I(this);
    }

    public final int M() {
        return this.f5381a.f5434a - 1911;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0049  */
    /* JADX WARN: Code duplicated, block: B:18:0x005b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x005d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x006a  */
    /* JADX WARN: Code duplicated, block: B:24:0x007b  */
    /* JADX WARN: Code duplicated, block: B:26:0x0088  */
    /* JADX WARN: Code duplicated, block: B:28:0x0091  */
    /* JADX WARN: Code duplicated, block: B:29:0x0094  */
    @Override // j$.time.chrono.d, j$.time.temporal.m
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public final d0 i(long j4, j$.time.temporal.q qVar) {
        int iA;
        int i;
        int i10;
        if (qVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
            if (g(aVar) == j4) {
                return this;
            }
            int[] iArr = c0.f5380a;
            int i11 = iArr[aVar.ordinal()];
            if (i11 == 4) {
                iA = b0.f5378c.w(aVar).a(j4, aVar);
                i = iArr[aVar.ordinal()];
                if (i != 4) {
                    j$.time.f fVar = this.f5381a;
                    if (M() >= 1) {
                        i10 = iA + 1911;
                    } else {
                        i10 = 1912 - iA;
                    }
                    return O(fVar.Z(i10));
                }
                if (i != 6) {
                    return O(this.f5381a.Z(iA + 1911));
                }
                if (i == 7) {
                    return O(this.f5381a.Z(1912 - M()));
                }
            } else {
                if (i11 == 5) {
                    b0.f5378c.w(aVar).b(j4, aVar);
                    long jM = ((long) M()) * 12;
                    j$.time.f fVar2 = this.f5381a;
                    return O(fVar2.T(j4 - ((jM + ((long) fVar2.f5435b)) - 1)));
                }
                if (i11 == 6 || i11 == 7) {
                    iA = b0.f5378c.w(aVar).a(j4, aVar);
                    i = iArr[aVar.ordinal()];
                    if (i != 4) {
                        j$.time.f fVar3 = this.f5381a;
                        if (M() >= 1) {
                            i10 = iA + 1911;
                        } else {
                            i10 = 1912 - iA;
                        }
                        return O(fVar3.Z(i10));
                    }
                    if (i != 6) {
                        return O(this.f5381a.Z(iA + 1911));
                    }
                    if (i == 7) {
                        return O(this.f5381a.Z(1912 - M()));
                    }
                }
            }
            return O(this.f5381a.i(j4, qVar));
        }
        return (d0) super.i(j4, qVar);
    }

    @Override // j$.time.chrono.d
    /* JADX INFO: renamed from: K */
    public final b z(j$.time.temporal.o oVar) {
        return (d0) super.z(oVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.m
    /* JADX INFO: renamed from: j */
    public final j$.time.temporal.m z(j$.time.f fVar) {
        return (d0) super.z(fVar);
    }

    @Override // j$.time.chrono.d
    public final b I(long j4) {
        return O(this.f5381a.U(j4));
    }

    @Override // j$.time.chrono.d
    public final b C(long j4) {
        return O(this.f5381a.T(j4));
    }

    @Override // j$.time.chrono.d
    public final b w(long j4) {
        return O(this.f5381a.S(j4));
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b, j$.time.temporal.m
    public final b l(long j4, j$.time.temporal.s sVar) {
        return (d0) super.l(j4, sVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.m
    public final j$.time.temporal.m l(long j4, j$.time.temporal.s sVar) {
        return (d0) super.l(j4, sVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.m
    public final b a(long j4, j$.time.temporal.s sVar) {
        return (d0) super.a(j4, sVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.m
    public final j$.time.temporal.m a(long j4, j$.time.temporal.s sVar) {
        return (d0) super.a(j4, sVar);
    }

    public final d0 O(j$.time.f fVar) {
        return fVar.equals(this.f5381a) ? this : new d0(fVar);
    }

    @Override // j$.time.chrono.b
    public final long E() {
        return this.f5381a.E();
    }

    @Override // j$.time.chrono.d
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d0) {
            return this.f5381a.equals(((d0) obj).f5381a);
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new f0((byte) 7, this);
    }
}
