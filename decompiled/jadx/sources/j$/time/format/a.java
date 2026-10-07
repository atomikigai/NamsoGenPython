package j$.time.format;

import j$.time.ZoneOffset;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5441a;

    public final Object a(j$.time.temporal.n nVar) {
        switch (this.f5441a) {
            case 0:
                j$.time.v vVar = (j$.time.v) nVar.b(j$.time.temporal.r.f5534a);
                if (vVar == null || (vVar instanceof ZoneOffset)) {
                    return null;
                }
                return vVar;
            case 1:
                return (j$.time.v) nVar.b(j$.time.temporal.r.f5534a);
            case 2:
                return (j$.time.chrono.m) nVar.b(j$.time.temporal.r.f5535b);
            case 3:
                return (j$.time.temporal.s) nVar.b(j$.time.temporal.r.f5536c);
            case 4:
                j$.time.temporal.a aVar = j$.time.temporal.a.OFFSET_SECONDS;
                if (nVar.f(aVar)) {
                    return ZoneOffset.N(nVar.e(aVar));
                }
                return null;
            case 5:
                j$.time.v vVar2 = (j$.time.v) nVar.b(j$.time.temporal.r.f5534a);
                return vVar2 != null ? vVar2 : (j$.time.v) nVar.b(j$.time.temporal.r.f5537d);
            case 6:
                j$.time.temporal.a aVar2 = j$.time.temporal.a.EPOCH_DAY;
                if (nVar.f(aVar2)) {
                    return j$.time.f.Q(nVar.g(aVar2));
                }
                return null;
            default:
                j$.time.temporal.a aVar3 = j$.time.temporal.a.NANO_OF_DAY;
                if (nVar.f(aVar3)) {
                    return j$.time.i.K(nVar.g(aVar3));
                }
                return null;
        }
    }

    public String toString() {
        switch (this.f5441a) {
            case 1:
                return "ZoneId";
            case 2:
                return "Chronology";
            case 3:
                return "Precision";
            case 4:
                return "ZoneOffset";
            case 5:
                return "Zone";
            case 6:
                return "LocalDate";
            case 7:
                return "LocalTime";
            default:
                return super.toString();
        }
    }
}
