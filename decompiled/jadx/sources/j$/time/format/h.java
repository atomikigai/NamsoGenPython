package j$.time.format;

import j$.time.LocalDateTime;
import j$.time.ZoneOffset;

/* JADX INFO: loaded from: classes2.dex */
public final class h implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5449a;

    public /* synthetic */ h(int i) {
        this.f5449a = i;
    }

    @Override // j$.time.format.f
    public final boolean u(p pVar, StringBuilder sb2) {
        switch (this.f5449a) {
            case 0:
                Long lA = pVar.a(j$.time.temporal.a.INSTANT_SECONDS);
                j$.time.temporal.n nVar = pVar.f5474a;
                j$.time.temporal.a aVar = j$.time.temporal.a.NANO_OF_SECOND;
                Long lValueOf = nVar.f(aVar) ? Long.valueOf(nVar.g(aVar)) : null;
                int i = 0;
                if (lA == null) {
                    return false;
                }
                long jLongValue = lA.longValue();
                int iA = aVar.f5516b.a(lValueOf != null ? lValueOf.longValue() : 0L, aVar);
                if (jLongValue >= -62167219200L) {
                    long j4 = jLongValue - 253402300800L;
                    long jFloorDiv = Math.floorDiv(j4, 315569520000L) + 1;
                    LocalDateTime localDateTimeK = LocalDateTime.K(Math.floorMod(j4, 315569520000L) - 62167219200L, 0, ZoneOffset.UTC);
                    if (jFloorDiv > 0) {
                        sb2.append('+');
                        sb2.append(jFloorDiv);
                    }
                    sb2.append(localDateTimeK);
                    if (localDateTimeK.f5364b.f5489c == 0) {
                        sb2.append(":00");
                    }
                } else {
                    long j10 = jLongValue + 62167219200L;
                    long j11 = j10 / 315569520000L;
                    long j12 = j10 % 315569520000L;
                    LocalDateTime localDateTimeK2 = LocalDateTime.K(j12 - 62167219200L, 0, ZoneOffset.UTC);
                    int length = sb2.length();
                    sb2.append(localDateTimeK2);
                    if (localDateTimeK2.f5364b.f5489c == 0) {
                        sb2.append(":00");
                    }
                    if (j11 < 0) {
                        if (localDateTimeK2.f5363a.f5434a == -10000) {
                            sb2.replace(length, length + 2, Long.toString(j11 - 1));
                        } else if (j12 == 0) {
                            sb2.insert(length, j11);
                        } else {
                            sb2.insert(length + 1, Math.abs(j11));
                        }
                    }
                }
                if (iA > 0) {
                    sb2.append('.');
                    int i10 = 100000000;
                    while (true) {
                        if (iA > 0 || i % 3 != 0 || i < -2) {
                            int i11 = iA / i10;
                            sb2.append((char) (i11 + 48));
                            iA -= i11 * i10;
                            i10 /= 10;
                            i++;
                        }
                    }
                }
                sb2.append('Z');
                return true;
            default:
                a aVar2 = n.f5465f;
                j$.time.temporal.n nVar2 = pVar.f5474a;
                Object objB = nVar2.b(aVar2);
                if (objB == null && pVar.f5476c == 0) {
                    throw new j$.time.a("Unable to extract " + aVar2 + " from temporal " + nVar2);
                }
                j$.time.v vVar = (j$.time.v) objB;
                if (vVar == null) {
                    return false;
                }
                sb2.append(vVar.o());
                return true;
        }
    }

    public final String toString() {
        switch (this.f5449a) {
            case 0:
                return "Instant()";
            default:
                return "ZoneRegionId()";
        }
    }
}
