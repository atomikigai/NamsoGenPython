package z7;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzcf;
import com.google.android.gms.internal.measurement.zzra;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class t1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f11365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f11366c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f11367d;
    public final /* synthetic */ Object e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f11368f;

    public t1(gb.k kVar, boolean z4, Uri uri, String str, String str2) {
        this.f11364a = 1;
        this.f11368f = kVar;
        this.f11365b = z4;
        this.e = uri;
        this.f11366c = str;
        this.f11367d = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z4;
        String str;
        Bundle bundleF0;
        CharSequence charSequence;
        CharSequence charSequence2;
        switch (this.f11364a) {
            case 0:
                k2 k2VarN = ((a1) ((x1) this.f11368f).f159a).n();
                AtomicReference atomicReference = (AtomicReference) this.e;
                k2VarN.c();
                k2VarN.d();
                k2VarN.p(new e2(k2VarN, atomicReference, this.f11366c, this.f11367d, k2VarN.m(false), this.f11365b));
                break;
            case 1:
                gb.k kVar = (gb.k) this.f11368f;
                Uri uri = (Uri) this.e;
                String str2 = this.f11367d;
                x1 x1Var = (x1) kVar.f4475b;
                s0 s0Var = x1Var.f11432w;
                a1 a1Var = (a1) x1Var.f159a;
                x1Var.c();
                try {
                    d3 d3Var = a1Var.f11010w;
                    a1.d(d3Var);
                    zzra.zzc();
                    g gVar = a1Var.f11005r;
                    y yVar = z.f11474p0;
                    boolean zL = gVar.l(null, yVar);
                    if (TextUtils.isEmpty(str2)) {
                        str = "Activity created with data 'referrer' without required params";
                        bundleF0 = null;
                    } else {
                        if (str2.contains("gclid") || str2.contains("utm_campaign") || str2.contains("utm_source") || str2.contains("utm_medium") || str2.contains("utm_id") || str2.contains("dclid") || str2.contains("srsltid")) {
                            z4 = zL;
                        } else {
                            if (zL && str2.contains("sfmc_id")) {
                                z4 = true;
                            }
                            i0 i0Var = ((a1) d3Var.f159a).f11007t;
                            a1.f(i0Var);
                            i0Var.f11197x.b("Activity created with data 'referrer' without required params");
                            str = "Activity created with data 'referrer' without required params";
                            bundleF0 = null;
                        }
                        str = "Activity created with data 'referrer' without required params";
                        bundleF0 = d3Var.f0(Uri.parse("https://google.com/search?".concat(str2)), z4);
                        if (bundleF0 != null) {
                            bundleF0.putString("_cis", "referrer");
                        }
                    }
                    boolean z10 = this.f11365b;
                    String str3 = this.f11366c;
                    if (z10) {
                        d3 d3Var2 = a1Var.f11010w;
                        a1.d(d3Var2);
                        zzra.zzc();
                        charSequence = "utm_medium";
                        charSequence2 = "utm_source";
                        Bundle bundleF1 = d3Var2.f0(uri, a1Var.f11005r.l(null, yVar));
                        if (bundleF1 != null) {
                            bundleF1.putString("_cis", "intent");
                            if (!bundleF1.containsKey("gclid") && bundleF0 != null && bundleF0.containsKey("gclid")) {
                                bundleF1.putString("_cer", "gclid=" + bundleF0.getString("gclid"));
                            }
                            x1Var.k(str3, "_cmp", bundleF1);
                            s0Var.a(str3, bundleF1);
                        }
                    } else {
                        charSequence = "utm_medium";
                        charSequence2 = "utm_source";
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        i0 i0Var2 = a1Var.f11007t;
                        a1.f(i0Var2);
                        i0Var2.f11197x.c(str2, "Activity created with referrer");
                        if (a1Var.f11005r.l(null, z.Z)) {
                            if (bundleF0 != null) {
                                x1Var.k(str3, "_cmp", bundleF0);
                                s0Var.a(str3, bundleF0);
                            } else {
                                i0 i0Var3 = a1Var.f11007t;
                                a1.f(i0Var3);
                                i0Var3.f11197x.c(str2, "Referrer does not contain valid parameters");
                            }
                            a1Var.f11012y.getClass();
                            x1Var.s("auto", "_ldl", null, true, System.currentTimeMillis());
                        } else if (!str2.contains("gclid") || (!str2.contains("utm_campaign") && !str2.contains(charSequence2) && !str2.contains(charSequence) && !str2.contains("utm_term") && !str2.contains("utm_content"))) {
                            i0 i0Var4 = a1Var.f11007t;
                            a1.f(i0Var4);
                            i0Var4.f11197x.b(str);
                        } else if (!TextUtils.isEmpty(str2)) {
                            a1Var.f11012y.getClass();
                            x1Var.s("auto", "_ldl", str2, true, System.currentTimeMillis());
                        }
                    }
                } catch (RuntimeException e) {
                    i0 i0Var5 = a1Var.f11007t;
                    a1.f(i0Var5);
                    i0Var5.f11190f.c(e, "Throwable caught in handleReferrerForOnActivityCreated");
                    return;
                }
                break;
            default:
                k2 k2VarN2 = ((AppMeasurementDynamiteService) this.f11368f).f2316a.n();
                zzcf zzcfVar = (zzcf) this.e;
                k2VarN2.c();
                k2VarN2.d();
                k2VarN2.p(new e2(k2VarN2, this.f11366c, this.f11367d, k2VarN2.m(false), this.f11365b, zzcfVar));
                break;
        }
    }

    public /* synthetic */ t1(Object obj, Object obj2, String str, String str2, boolean z4, int i) {
        this.f11364a = i;
        this.f11368f = obj;
        this.e = obj2;
        this.f11366c = str;
        this.f11367d = str2;
        this.f11365b = z4;
    }
}
