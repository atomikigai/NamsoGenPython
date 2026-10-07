package z7;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f10997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f10998c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u f10999d;

    public /* synthetic */ a(u uVar, String str, long j4, int i) {
        this.f10996a = i;
        this.f10999d = uVar;
        this.f10997b = str;
        this.f10998c = j4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10996a) {
            case 0:
                u uVar = this.f10999d;
                uVar.c();
                String str = this.f10997b;
                com.google.android.gms.common.internal.i0.e(str);
                r.e eVar = uVar.f11374c;
                boolean zIsEmpty = eVar.isEmpty();
                long j4 = this.f10998c;
                if (zIsEmpty) {
                    uVar.f11375d = j4;
                }
                Integer num = (Integer) eVar.get(str);
                if (num != null) {
                    eVar.put(str, Integer.valueOf(num.intValue() + 1));
                } else if (eVar.f8100c < 100) {
                    eVar.put(str, 1);
                    uVar.f11373b.put(str, Long.valueOf(j4));
                } else {
                    i0 i0Var = ((a1) uVar.f159a).f11007t;
                    a1.f(i0Var);
                    i0Var.f11193t.b("Too many ads visible");
                }
                break;
            default:
                u uVar2 = this.f10999d;
                uVar2.c();
                r.e eVar2 = uVar2.f11373b;
                a1 a1Var = (a1) uVar2.f159a;
                String str2 = this.f10997b;
                com.google.android.gms.common.internal.i0.e(str2);
                r.e eVar3 = uVar2.f11374c;
                Integer num2 = (Integer) eVar3.get(str2);
                if (num2 == null) {
                    i0 i0Var2 = a1Var.f11007t;
                    a1.f(i0Var2);
                    i0Var2.f11190f.c(str2, "Call to endAdUnitExposure for unknown ad unit id");
                } else {
                    d2 d2Var = a1Var.f11013z;
                    i0 i0Var3 = a1Var.f11007t;
                    a1.e(d2Var);
                    b2 b2VarJ = d2Var.j(false);
                    int iIntValue = num2.intValue() - 1;
                    if (iIntValue != 0) {
                        eVar3.put(str2, Integer.valueOf(iIntValue));
                    } else {
                        eVar3.remove(str2);
                        Long l2 = (Long) eVar2.get(str2);
                        long j10 = this.f10998c;
                        if (l2 == null) {
                            a1.f(i0Var3);
                            i0Var3.f11190f.b("First ad unit exposure time was never set");
                        } else {
                            long jLongValue = j10 - l2.longValue();
                            eVar2.remove(str2);
                            uVar2.h(str2, jLongValue, b2VarJ);
                        }
                        if (eVar3.isEmpty()) {
                            long j11 = uVar2.f11375d;
                            if (j11 != 0) {
                                uVar2.g(j10 - j11, b2VarJ);
                                uVar2.f11375d = 0L;
                            } else {
                                a1.f(i0Var3);
                                i0Var3.f11190f.b("First ad exposure time was never set");
                            }
                        }
                    }
                }
                break;
        }
    }
}
