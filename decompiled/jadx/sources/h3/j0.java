package h3;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j0 implements ic.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f4737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f4738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e1 f4739c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f4740d;
    public final /* synthetic */ int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ List f4741f;

    public /* synthetic */ j0(String str, String str2, e1 e1Var, boolean z4, int i, List list) {
        this.f4737a = str;
        this.f4738b = str2;
        this.f4739c = e1Var;
        this.f4740d = z4;
        this.e = i;
        this.f4741f = list;
    }

    @Override // ic.q
    public final Object b(Object obj, Object obj2, Object obj3) {
        final boolean zBooleanValue = ((Boolean) obj).booleanValue();
        final String str = (String) obj2;
        final Long l2 = (Long) obj3;
        long jE = kc.d.f6207b.e(5000L, 7500L);
        Handler handler = new Handler(Looper.getMainLooper());
        final String str2 = this.f4737a;
        final String str3 = this.f4738b;
        final e1 e1Var = this.f4739c;
        final boolean z4 = this.f4740d;
        final int i = this.e;
        final List list = this.f4741f;
        handler.postDelayed(new Runnable() { // from class: h3.m0
            @Override // java.lang.Runnable
            public final void run() {
                v0 v0VarI0;
                Long l10;
                String str4;
                v0 v0VarI1;
                boolean z10 = zBooleanValue;
                String str5 = str2;
                String str6 = str3;
                e1 e1Var2 = e1Var;
                boolean z11 = z4;
                int i10 = i;
                List list2 = list;
                if (!z10) {
                    Log.d("CheckerCache", "Server no disponible, evaluando local: " + str5 + " (" + str6 + ')');
                    String strH0 = e1.h0(str5, true, z11, (!z11 || (v0VarI0 = e1.i0(e1Var2.A0)) == null) ? null : Integer.valueOf(v0VarI0.f4872b));
                    e1Var2.d0(str5, new w0(str5, strH0, null));
                    e1Var2.f0(str5, strH0, z11, i10 + 1 < list2.size(), new l0(e1Var2, list2, z11, i10, 3));
                    return;
                }
                String str7 = str;
                if (str7 != null && !str7.equals("LIVE")) {
                    StringBuilder sbE = u3.b.e("Resultado en cache: ", str5, " (", str6, ") -> ");
                    sbE.append(str7);
                    Log.d("CheckerCache", sbE.toString());
                    e1Var2.d0(str5, new w0(str5, str7, null));
                    e1Var2.f0(str5, str7, z11, i10 + 1 < list2.size(), new l0(e1Var2, list2, z11, i10, 1));
                    return;
                }
                if (!jc.i.a(str7, "LIVE") || (l10 = l2) == null) {
                    StringBuilder sbE2 = u3.b.e("Revalidando tarjeta: ", str5, " (", str6, ", cache=");
                    sbE2.append(str7);
                    sbE2.append(')');
                    Log.d("CheckerCache", sbE2.toString());
                    String strA0 = pc.g.A0(6, str5);
                    q0 q0Var = new q0(e1Var2, str5, z11, str6, str7, i10, list2);
                    com.bumptech.glide.d.v(e1Var2.U()).a(new r3.e(0, "https://bins.antipublic.cc/bins/".concat(strA0), null, new r0(e1Var2, q0Var), new r0(q0Var)));
                    return;
                }
                long j4 = e1Var2.f4682w0;
                long j10 = e1Var2.f4681v0;
                ub.f fVar = (str6 == null || str6.equals(e1Var2.f4683x0) || (v0VarI1 = e1.i0(str6)) == null) ? new ub.f(Long.valueOf(j10), Long.valueOf(j4)) : new ub.f(Long.valueOf(v0VarI1.f4873c), Long.valueOf(v0VarI1.f4874d));
                long jLongValue = l10.longValue();
                long jLongValue2 = ((Number) fVar.f9065a).longValue();
                long jLongValue3 = ((Number) fVar.f9066b).longValue();
                long jHashCode = (((long) str5.hashCode()) * 31) + jLongValue;
                if (jLongValue3 <= jLongValue2) {
                    jLongValue3 = jLongValue2 + 1;
                }
                if (System.currentTimeMillis() - l10.longValue() > jd.l.a(jHashCode).e(jLongValue2, jLongValue3)) {
                    Log.d("CheckerCache", "Tarjeta LIVE envejeció y murió: " + str5 + " (" + str6 + ')');
                    e1Var2.m0(str6, str5, "DIED", str7);
                    e1Var2.d0(str5, new w0(str5, "DIED", null));
                    str4 = "DIED";
                } else {
                    Log.d("CheckerCache", "Tarjeta LIVE sigue viva: " + str5 + " (" + str6 + ')');
                    str4 = "LIVE";
                    e1Var2.d0(str5, new w0(str5, str4, null));
                }
                e1Var2.f0(str5, str4, z11, i10 + 1 < list2.size(), new l0(e1Var2, list2, z11, i10, 2));
            }
        }, jE);
        return ub.k.f9073a;
    }
}
