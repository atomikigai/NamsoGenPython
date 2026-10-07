package j$.time.chrono;

import j$.time.LocalDateTime;
import java.util.Arrays;
import java.util.Objects;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public interface m extends Comparable {
    b A(j$.time.temporal.n nVar);

    boolean equals(Object obj);

    int hashCode();

    String o();

    String s();

    String toString();

    n x(int i);

    static m p(j$.time.temporal.n nVar) {
        Objects.requireNonNull(nVar, "temporal");
        m mVar = (m) nVar.b(j$.time.temporal.r.f5535b);
        t tVar = t.f5416c;
        if (mVar != null) {
            return mVar;
        }
        Objects.requireNonNull(tVar, "defaultObj");
        return tVar;
    }

    static m of(String str) {
        ConcurrentHashMap concurrentHashMap = a.f5375a;
        Objects.requireNonNull(str, "id");
        while (true) {
            ConcurrentHashMap concurrentHashMap2 = a.f5375a;
            m mVar = (m) concurrentHashMap2.get(str);
            if (mVar == null) {
                mVar = (m) a.f5376b.get(str);
            }
            if (mVar != null) {
                return mVar;
            }
            if (concurrentHashMap2.get("ISO") != null) {
                for (m mVar2 : ServiceLoader.load(m.class)) {
                    if (str.equals(mVar2.o()) || str.equals(mVar2.s())) {
                        return mVar2;
                    }
                }
                throw new j$.time.a("Unknown chronology: ".concat(str));
            }
            p pVar = p.f5403l;
            pVar.getClass();
            a.u(pVar, "Hijrah-umalqura");
            w wVar = w.f5419c;
            wVar.getClass();
            a.u(wVar, "Japanese");
            b0 b0Var = b0.f5378c;
            b0Var.getClass();
            a.u(b0Var, "Minguo");
            h0 h0Var = h0.f5393c;
            h0Var.getClass();
            a.u(h0Var, "ThaiBuddhist");
            try {
                for (a aVar : Arrays.asList(new a[0])) {
                    if (!aVar.o().equals("ISO")) {
                        a.u(aVar, aVar.o());
                    }
                }
                t tVar = t.f5416c;
                tVar.getClass();
                a.u(tVar, "ISO");
            } catch (Throwable th) {
                throw new ServiceConfigurationError(th.getMessage(), th);
            }
        }
    }

    default e B(LocalDateTime localDateTime) {
        try {
            return A(localDateTime).F(j$.time.i.C(localDateTime));
        } catch (j$.time.a e) {
            throw new j$.time.a("Unable to obtain ChronoLocalDateTime from TemporalAccessor: " + LocalDateTime.class, e);
        }
    }
}
