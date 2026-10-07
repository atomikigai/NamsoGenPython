package j$.time.temporal;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public interface n {
    boolean f(q qVar);

    long g(q qVar);

    default u k(q qVar) {
        if (!(qVar instanceof a)) {
            Objects.requireNonNull(qVar, "field");
            return qVar.w(this);
        }
        if (f(qVar)) {
            return ((a) qVar).f5516b;
        }
        throw new t(j$.time.b.a("Unsupported field: ", qVar));
    }

    default int e(q qVar) {
        u uVarK = k(qVar);
        if (uVarK.f5540a < -2147483648L || uVarK.f5543d > 2147483647L) {
            throw new t("Invalid field " + qVar + " for get() method, use getLong() instead");
        }
        long jG = g(qVar);
        if (uVarK.d(jG)) {
            return (int) jG;
        }
        throw new j$.time.a("Invalid value for " + qVar + " (valid values " + uVarK + "): " + jG);
    }

    default Object b(j$.time.format.a aVar) {
        if (aVar == r.f5534a || aVar == r.f5535b || aVar == r.f5536c) {
            return null;
        }
        return aVar.a(this);
    }
}
