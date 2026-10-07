package j$.time.chrono;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class j0 extends d {
    private static final long serialVersionUID = -8722293800195731463L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient j$.time.f f5396a;

    @Override // j$.time.chrono.b
    public final e F(j$.time.i iVar) {
        return new g(this, iVar);
    }

    public j0(j$.time.f fVar) {
        Objects.requireNonNull(fVar, "isoDate");
        this.f5396a = fVar;
    }

    @Override // j$.time.chrono.b
    public final m d() {
        return h0.f5393c;
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final int hashCode() {
        h0.f5393c.getClass();
        return this.f5396a.hashCode() ^ 146118545;
    }

    @Override // j$.time.chrono.b
    public final n G() {
        return M() >= 1 ? k0.BE : k0.BEFORE_BE;
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
        int i = i0.f5395a[aVar.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return this.f5396a.k(qVar);
        }
        if (i != 4) {
            return h0.f5393c.w(aVar);
        }
        j$.time.temporal.u uVar = j$.time.temporal.a.YEAR.f5516b;
        return j$.time.temporal.u.e(1L, M() <= 0 ? (-(uVar.f5540a + 543)) + 1 : 543 + uVar.f5543d);
    }

    @Override // j$.time.temporal.n
    public final long g(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            int i = i0.f5395a[((j$.time.temporal.a) qVar).ordinal()];
            if (i == 4) {
                int iM = M();
                if (iM < 1) {
                    iM = 1 - iM;
                }
                return iM;
            }
            if (i == 5) {
                return ((((long) M()) * 12) + ((long) this.f5396a.f5435b)) - 1;
            }
            if (i == 6) {
                return M();
            }
            if (i != 7) {
                return this.f5396a.g(qVar);
            }
            return M() < 1 ? 0 : 1;
        }
        return qVar.I(this);
    }

    public final int M() {
        return this.f5396a.f5434a + 543;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0049  */
    /* JADX WARN: Code duplicated, block: B:18:0x005b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x005d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x006a  */
    /* JADX WARN: Code duplicated, block: B:24:0x007b  */
    /* JADX WARN: Code duplicated, block: B:26:0x0088  */
    /* JADX WARN: Code duplicated, block: B:29:0x0092  */
    @Override // j$.time.chrono.d, j$.time.temporal.m
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public final j0 i(long j4, j$.time.temporal.q qVar) {
        int iA;
        int i;
        if (qVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
            if (g(aVar) == j4) {
                return this;
            }
            int[] iArr = i0.f5395a;
            int i10 = iArr[aVar.ordinal()];
            if (i10 == 4) {
                iA = h0.f5393c.w(aVar).a(j4, aVar);
                i = iArr[aVar.ordinal()];
                if (i != 4) {
                    j$.time.f fVar = this.f5396a;
                    if (M() < 1) {
                        iA = 1 - iA;
                    }
                    return O(fVar.Z(iA - 543));
                }
                if (i != 6) {
                    return O(this.f5396a.Z(iA - 543));
                }
                if (i == 7) {
                    return O(this.f5396a.Z((-542) - M()));
                }
            } else {
                if (i10 == 5) {
                    h0.f5393c.w(aVar).b(j4, aVar);
                    long jM = ((long) M()) * 12;
                    j$.time.f fVar2 = this.f5396a;
                    return O(fVar2.T(j4 - ((jM + ((long) fVar2.f5435b)) - 1)));
                }
                if (i10 == 6 || i10 == 7) {
                    iA = h0.f5393c.w(aVar).a(j4, aVar);
                    i = iArr[aVar.ordinal()];
                    if (i != 4) {
                        j$.time.f fVar3 = this.f5396a;
                        if (M() < 1) {
                            iA = 1 - iA;
                        }
                        return O(fVar3.Z(iA - 543));
                    }
                    if (i != 6) {
                        return O(this.f5396a.Z(iA - 543));
                    }
                    if (i == 7) {
                        return O(this.f5396a.Z((-542) - M()));
                    }
                }
            }
            return O(this.f5396a.i(j4, qVar));
        }
        return (j0) super.i(j4, qVar);
    }

    @Override // j$.time.chrono.d
    /* JADX INFO: renamed from: K */
    public final b z(j$.time.temporal.o oVar) {
        return (j0) super.z(oVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.m
    /* JADX INFO: renamed from: j */
    public final j$.time.temporal.m z(j$.time.f fVar) {
        return (j0) super.z(fVar);
    }

    @Override // j$.time.chrono.d
    public final b I(long j4) {
        return O(this.f5396a.U(j4));
    }

    @Override // j$.time.chrono.d
    public final b C(long j4) {
        return O(this.f5396a.T(j4));
    }

    @Override // j$.time.chrono.d
    public final b w(long j4) {
        return O(this.f5396a.S(j4));
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b, j$.time.temporal.m
    public final b l(long j4, j$.time.temporal.s sVar) {
        return (j0) super.l(j4, sVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.m
    public final j$.time.temporal.m l(long j4, j$.time.temporal.s sVar) {
        return (j0) super.l(j4, sVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.m
    public final b a(long j4, j$.time.temporal.s sVar) {
        return (j0) super.a(j4, sVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.m
    public final j$.time.temporal.m a(long j4, j$.time.temporal.s sVar) {
        return (j0) super.a(j4, sVar);
    }

    public final j0 O(j$.time.f fVar) {
        return fVar.equals(this.f5396a) ? this : new j0(fVar);
    }

    @Override // j$.time.chrono.b
    public final long E() {
        return this.f5396a.E();
    }

    @Override // j$.time.chrono.d
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j0) {
            return this.f5396a.equals(((j0) obj).f5396a);
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new f0((byte) 8, this);
    }
}
