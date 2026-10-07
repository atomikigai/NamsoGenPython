package j$.time.chrono;

import com.google.android.gms.internal.ads.zzbbs;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d implements b, j$.time.temporal.m, j$.time.temporal.o, Serializable {
    private static final long serialVersionUID = 6282433883239719096L;

    public abstract b C(long j4);

    public abstract b I(long j4);

    public abstract b w(long j4);

    @Override // j$.time.temporal.m
    public /* bridge */ /* synthetic */ j$.time.temporal.m a(long j4, j$.time.temporal.s sVar) {
        return a(j4, sVar);
    }

    public static b u(m mVar, j$.time.temporal.m mVar2) {
        b bVar = (b) mVar2;
        if (mVar.equals(bVar.d())) {
            return bVar;
        }
        throw new ClassCastException("Chronology mismatch, expected: " + mVar.o() + ", actual: " + bVar.d().o());
    }

    @Override // j$.time.temporal.m
    public b l(long j4, j$.time.temporal.s sVar) {
        boolean z4 = sVar instanceof j$.time.temporal.b;
        if (!z4) {
            if (!z4) {
                return u(d(), sVar.u(this, j4));
            }
            throw new j$.time.temporal.t("Unsupported unit: " + sVar);
        }
        switch (c.f5379a[((j$.time.temporal.b) sVar).ordinal()]) {
            case 1:
                return w(j4);
            case 2:
                return w(Math.multiplyExact(j4, 7));
            case 3:
                return C(j4);
            case 4:
                return I(j4);
            case 5:
                return I(Math.multiplyExact(j4, 10));
            case 6:
                return I(Math.multiplyExact(j4, 100));
            case 7:
                return I(Math.multiplyExact(j4, zzbbs.zzq.zzf));
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return i(Math.addExact(g(aVar), j4), (j$.time.temporal.q) aVar);
            default:
                throw new j$.time.temporal.t("Unsupported unit: " + sVar);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && compareTo((b) obj) == 0;
    }

    @Override // j$.time.chrono.b
    public int hashCode() {
        long jE = E();
        return ((int) (jE ^ (jE >>> 32))) ^ d().hashCode();
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public b z(j$.time.temporal.o oVar) {
        return u(d(), oVar.c(this));
    }

    @Override // j$.time.chrono.b
    public final String toString() {
        long jG = g(j$.time.temporal.a.YEAR_OF_ERA);
        long jG2 = g(j$.time.temporal.a.MONTH_OF_YEAR);
        long jG3 = g(j$.time.temporal.a.DAY_OF_MONTH);
        StringBuilder sb2 = new StringBuilder(30);
        sb2.append(d().toString());
        sb2.append(" ");
        sb2.append(G());
        sb2.append(" ");
        sb2.append(jG);
        sb2.append(jG2 < 10 ? "-0" : "-");
        sb2.append(jG2);
        sb2.append(jG3 < 10 ? "-0" : "-");
        sb2.append(jG3);
        return sb2.toString();
    }

    @Override // j$.time.temporal.m
    public b i(long j4, j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.t(j$.time.b.a("Unsupported field: ", qVar));
        }
        return u(d(), qVar.K(this, j4));
    }
}
