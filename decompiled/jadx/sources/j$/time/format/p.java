package j$.time.format;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j$.time.temporal.n f5474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DateTimeFormatter f5475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5476c;

    public p(j$.time.temporal.n nVar, DateTimeFormatter dateTimeFormatter) {
        j$.time.chrono.m mVar = dateTimeFormatter.f5440d;
        if (mVar != null) {
            j$.time.chrono.m mVar2 = (j$.time.chrono.m) nVar.b(j$.time.temporal.r.f5535b);
            j$.time.v vVar = (j$.time.v) nVar.b(j$.time.temporal.r.f5534a);
            j$.time.chrono.b bVarA = null;
            mVar = Objects.equals(mVar, mVar2) ? null : mVar;
            if (mVar != null) {
                j$.time.chrono.m mVar3 = mVar != null ? mVar : mVar2;
                if (mVar != null) {
                    if (nVar.f(j$.time.temporal.a.EPOCH_DAY)) {
                        bVarA = mVar3.A(nVar);
                    } else if (mVar != j$.time.chrono.t.f5416c || mVar2 != null) {
                        for (j$.time.temporal.a aVar : j$.time.temporal.a.values()) {
                            if (aVar.isDateBased() && nVar.f(aVar)) {
                                throw new j$.time.a("Unable to apply override chronology '" + mVar + "' because the temporal object being formatted contains date fields but does not represent a whole date: " + nVar);
                            }
                        }
                    }
                }
                nVar = new o(bVarA, nVar, mVar3, vVar);
            }
        }
        this.f5474a = nVar;
        this.f5475b = dateTimeFormatter;
    }

    public final Long a(j$.time.temporal.q qVar) {
        int i = this.f5476c;
        j$.time.temporal.n nVar = this.f5474a;
        if (i <= 0 || nVar.f(qVar)) {
            return Long.valueOf(nVar.g(qVar));
        }
        return null;
    }

    public final String toString() {
        return this.f5474a.toString();
    }
}
