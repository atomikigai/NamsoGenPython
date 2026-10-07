package j$.time;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class m implements j$.time.temporal.n, j$.time.temporal.o, Comparable, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f5495c = 0;
    private static final long serialVersionUID = -939150713474957432L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5497b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        m mVar = (m) obj;
        int i = this.f5496a - mVar.f5496a;
        return i == 0 ? this.f5497b - mVar.f5497b : i;
    }

    static {
        j$.time.format.n nVar = new j$.time.format.n();
        nVar.d("--");
        nVar.g(j$.time.temporal.a.MONTH_OF_YEAR, 2);
        nVar.c('-');
        nVar.g(j$.time.temporal.a.DAY_OF_MONTH, 2);
        nVar.l(Locale.getDefault(), j$.time.format.t.SMART, null);
    }

    public m(int i, int i10) {
        this.f5496a = i;
        this.f5497b = i10;
    }

    @Override // j$.time.temporal.n
    public final boolean f(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return qVar == j$.time.temporal.a.MONTH_OF_YEAR || qVar == j$.time.temporal.a.DAY_OF_MONTH;
        }
        return qVar != null && qVar.u(this);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.u k(j$.time.temporal.q qVar) {
        int i;
        if (qVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return qVar.C();
        }
        if (qVar != j$.time.temporal.a.DAY_OF_MONTH) {
            return super.k(qVar);
        }
        k kVarI = k.I(this.f5496a);
        kVarI.getClass();
        int i10 = j.f5491a[kVarI.ordinal()];
        if (i10 != 1) {
            i = (i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5) ? 30 : 31;
        } else {
            i = 28;
        }
        return j$.time.temporal.u.f(i, k.I(this.f5496a).C());
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
        int i10 = l.f5494a[((j$.time.temporal.a) qVar).ordinal()];
        if (i10 == 1) {
            i = this.f5497b;
        } else {
            if (i10 != 2) {
                throw new j$.time.temporal.t(b.a("Unsupported field: ", qVar));
            }
            i = this.f5496a;
        }
        return i;
    }

    @Override // j$.time.temporal.n
    public final Object b(j$.time.format.a aVar) {
        if (aVar == j$.time.temporal.r.f5535b) {
            return j$.time.chrono.t.f5416c;
        }
        return super.b(aVar);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.m c(j$.time.temporal.m mVar) {
        if (!j$.time.chrono.m.p(mVar).equals(j$.time.chrono.t.f5416c)) {
            throw new a("Adjustment only supported on ISO date-time");
        }
        j$.time.temporal.m mVarI = mVar.i(this.f5496a, j$.time.temporal.a.MONTH_OF_YEAR);
        j$.time.temporal.a aVar = j$.time.temporal.a.DAY_OF_MONTH;
        return mVarI.i(Math.min(mVarI.k(aVar).f5543d, this.f5497b), aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            if (this.f5496a == mVar.f5496a && this.f5497b == mVar.f5497b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f5496a << 6) + this.f5497b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(10);
        sb2.append("--");
        sb2.append(this.f5496a < 10 ? "0" : "");
        sb2.append(this.f5496a);
        sb2.append(this.f5497b < 10 ? "-0" : "-");
        sb2.append(this.f5497b);
        return sb2.toString();
    }

    private Object writeReplace() {
        return new q((byte) 13, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
