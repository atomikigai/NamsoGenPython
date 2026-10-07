package j$.time;

import com.google.android.gms.internal.ads.zzbbs;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class s implements j$.time.temporal.m, j$.time.temporal.o, Comparable, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f5510b = 0;
    private static final long serialVersionUID = -23038383694477807L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5511a;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f5511a - ((s) obj).f5511a;
    }

    static {
        j$.time.format.n nVar = new j$.time.format.n();
        nVar.h(j$.time.temporal.a.YEAR, 4, 10, j$.time.format.u.EXCEEDS_PAD);
        nVar.l(Locale.getDefault(), j$.time.format.t.SMART, null);
    }

    public static s u(int i) {
        j$.time.temporal.a.YEAR.M(i);
        return new s(i);
    }

    public s(int i) {
        this.f5511a = i;
    }

    @Override // j$.time.temporal.n
    public final boolean f(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return qVar == j$.time.temporal.a.YEAR || qVar == j$.time.temporal.a.YEAR_OF_ERA || qVar == j$.time.temporal.a.ERA;
        }
        return qVar != null && qVar.u(this);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.u k(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.a.YEAR_OF_ERA) {
            return j$.time.temporal.u.e(1L, this.f5511a <= 0 ? 1000000000L : 999999999L);
        }
        return super.k(qVar);
    }

    @Override // j$.time.temporal.n
    public final int e(j$.time.temporal.q qVar) {
        return k(qVar).a(g(qVar), qVar);
    }

    @Override // j$.time.temporal.n
    public final long g(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.I(this);
        }
        int i = r.f5508a[((j$.time.temporal.a) qVar).ordinal()];
        if (i == 1) {
            int i10 = this.f5511a;
            if (i10 < 1) {
                i10 = 1 - i10;
            }
            return i10;
        }
        if (i == 2) {
            return this.f5511a;
        }
        if (i == 3) {
            return this.f5511a < 1 ? 0 : 1;
        }
        throw new j$.time.temporal.t(b.a("Unsupported field: ", qVar));
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: j */
    public final j$.time.temporal.m z(f fVar) {
        return (s) fVar.c(this);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public final s i(long j4, j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return (s) qVar.K(this, j4);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        aVar.M(j4);
        int i = r.f5508a[aVar.ordinal()];
        if (i == 1) {
            if (this.f5511a < 1) {
                j4 = 1 - j4;
            }
            return u((int) j4);
        }
        if (i == 2) {
            return u((int) j4);
        }
        if (i == 3) {
            return g(j$.time.temporal.a.ERA) == j4 ? this : u(1 - this.f5511a);
        }
        throw new j$.time.temporal.t(b.a("Unsupported field: ", qVar));
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public final s l(long j4, j$.time.temporal.s sVar) {
        if (!(sVar instanceof j$.time.temporal.b)) {
            return (s) sVar.u(this, j4);
        }
        int i = r.f5509b[((j$.time.temporal.b) sVar).ordinal()];
        if (i == 1) {
            return C(j4);
        }
        if (i == 2) {
            return C(Math.multiplyExact(j4, 10));
        }
        if (i == 3) {
            return C(Math.multiplyExact(j4, 100));
        }
        if (i == 4) {
            return C(Math.multiplyExact(j4, zzbbs.zzq.zzf));
        }
        if (i == 5) {
            j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
            return i(Math.addExact(g(aVar), j4), aVar);
        }
        throw new j$.time.temporal.t("Unsupported unit: " + sVar);
    }

    public final s C(long j4) {
        if (j4 == 0) {
            return this;
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return u(aVar.f5516b.a(((long) this.f5511a) + j4, aVar));
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
            return j$.time.temporal.b.YEARS;
        }
        return super.b(aVar);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.m c(j$.time.temporal.m mVar) {
        if (!j$.time.chrono.m.p(mVar).equals(j$.time.chrono.t.f5416c)) {
            throw new a("Adjustment only supported on ISO date-time");
        }
        return mVar.i(this.f5511a, j$.time.temporal.a.YEAR);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s) && this.f5511a == ((s) obj).f5511a;
    }

    public final int hashCode() {
        return this.f5511a;
    }

    public final String toString() {
        return Integer.toString(this.f5511a);
    }

    private Object writeReplace() {
        return new q((byte) 11, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
