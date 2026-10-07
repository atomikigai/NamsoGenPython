package z7;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.measurement.zzov;
import java.net.MalformedURLException;
import java.net.URL;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x1 f11298b;

    public /* synthetic */ p1(x1 x1Var, int i) {
        this.f11297a = i;
        this.f11298b = x1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Pair pair;
        NetworkInfo activeNetworkInfo;
        switch (this.f11297a) {
            case 0:
                x1 x1Var = this.f11298b;
                x1Var.c();
                a1 a1Var = (a1) x1Var.f159a;
                q0 q0Var = a1Var.f11006s;
                i0 i0Var = a1Var.f11007t;
                q0 q0Var2 = a1Var.f11006s;
                a1.d(q0Var);
                if (q0Var.C.b()) {
                    a1.f(i0Var);
                    i0Var.f11197x.b("Deferred Deep Link already retrieved. Not fetching again.");
                } else {
                    a1.d(q0Var2);
                    long jA = q0Var2.D.a();
                    a1.d(q0Var2);
                    q0Var2.D.b(1 + jA);
                    if (jA >= 5) {
                        a1.f(i0Var);
                        i0Var.f11193t.b("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                        a1.d(q0Var2);
                        q0Var2.C.a(true);
                    } else {
                        z0 z0Var = a1Var.f11008u;
                        a1.f(z0Var);
                        z0Var.c();
                        a2 a2Var = a1Var.C;
                        a1.f(a2Var);
                        a1 a1Var2 = (a1) a2Var.f159a;
                        a1.f(a2Var);
                        String strG = a1Var.j().g();
                        a1.d(q0Var2);
                        q0Var2.c();
                        zzov.zzc();
                        a1 a1Var3 = (a1) q0Var2.f159a;
                        URL url = null;
                        if (!a1Var3.f11005r.l(null, z.A0) || q0Var2.h().f(i1.AD_STORAGE)) {
                            a1Var3.f11012y.getClass();
                            long jElapsedRealtime = SystemClock.elapsedRealtime();
                            String str = q0Var2.f11309r;
                            if (str == null || jElapsedRealtime >= q0Var2.f11311t) {
                                q0Var2.f11311t = a1Var3.f11005r.h(strG, z.f11449b) + jElapsedRealtime;
                                try {
                                    b6.a aVarA = b6.b.a(a1Var3.f11000a);
                                    q0Var2.f11309r = "";
                                    String str2 = aVarA.f1406a;
                                    if (str2 != null) {
                                        q0Var2.f11309r = str2;
                                    }
                                    q0Var2.f11310s = aVarA.f1407b;
                                } catch (Exception e) {
                                    i0 i0Var2 = a1Var3.f11007t;
                                    a1.f(i0Var2);
                                    i0Var2.f11197x.c(e, "Unable to get advertising id");
                                    q0Var2.f11309r = "";
                                }
                                pair = new Pair(q0Var2.f11309r, Boolean.valueOf(q0Var2.f11310s));
                            } else {
                                pair = new Pair(str, Boolean.valueOf(q0Var2.f11310s));
                            }
                        } else {
                            pair = new Pair("", Boolean.FALSE);
                        }
                        Boolean boolK = a1Var.f11005r.k("google_analytics_adid_collection_enabled");
                        if ((boolK != null && !boolK.booleanValue()) || ((Boolean) pair.second).booleanValue() || TextUtils.isEmpty((CharSequence) pair.first)) {
                            a1.f(i0Var);
                            i0Var.f11197x.b("ADID unavailable to retrieve Deferred Deep Link. Skipping");
                        } else {
                            a1.f(a2Var);
                            a2Var.e();
                            ConnectivityManager connectivityManager = (ConnectivityManager) a1Var2.f11000a.getSystemService("connectivity");
                            if (connectivityManager != null) {
                                try {
                                    activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                                } catch (SecurityException unused) {
                                    activeNetworkInfo = null;
                                }
                            } else {
                                activeNetworkInfo = null;
                            }
                            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                                a1.f(i0Var);
                                i0Var.f11193t.b("Network is not available for Deferred Deep Link request. Skipping");
                            } else {
                                d3 d3Var = a1Var.f11010w;
                                a1.d(d3Var);
                                ((a1) a1Var.j().f159a).f11005r.g();
                                String str3 = (String) pair.first;
                                long jA2 = q0Var2.D.a() - 1;
                                a1 a1Var4 = (a1) d3Var.f159a;
                                try {
                                    com.google.android.gms.common.internal.i0.e(str3);
                                    com.google.android.gms.common.internal.i0.e(strG);
                                    String strConcat = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v79000." + d3Var.c0()) + "&rdid=" + str3 + "&bundleid=" + strG + "&retry=" + jA2;
                                    if (strG.equals(a1Var4.f11005r.d("debug.deferred.deeplink"))) {
                                        strConcat = strConcat.concat("&ddl_test=1");
                                    }
                                    url = new URL(strConcat);
                                } catch (IllegalArgumentException e4) {
                                    e = e4;
                                    i0 i0Var3 = a1Var4.f11007t;
                                    a1.f(i0Var3);
                                    i0Var3.f11190f.c(e.getMessage(), "Failed to create BOW URL for Deferred Deep Link. exception");
                                } catch (MalformedURLException e10) {
                                    e = e10;
                                    i0 i0Var4 = a1Var4.f11007t;
                                    a1.f(i0Var4);
                                    i0Var4.f11190f.c(e.getMessage(), "Failed to create BOW URL for Deferred Deep Link. exception");
                                }
                                if (url != null) {
                                    a1.f(a2Var);
                                    ta.c cVar = new ta.c(a1Var);
                                    a2Var.c();
                                    a2Var.e();
                                    z0 z0Var2 = a1Var2.f11008u;
                                    a1.f(z0Var2);
                                    z0Var2.k(new b3.b(a2Var, strG, url, cVar));
                                }
                            }
                        }
                    }
                }
                break;
            default:
                s0 s0Var = this.f11298b.f11432w;
                a1 a1Var5 = s0Var.f11339b;
                z0 z0Var3 = a1Var5.f11008u;
                x1 x1Var2 = a1Var5.A;
                q0 q0Var3 = a1Var5.f11006s;
                a1.f(z0Var3);
                z0Var3.c();
                if (s0Var.c()) {
                    if (s0Var.d()) {
                        a1.d(q0Var3);
                        q0Var3.F.h(null);
                        Bundle bundle = new Bundle();
                        bundle.putString("source", "(not set)");
                        bundle.putString("medium", "(not set)");
                        bundle.putString("_cis", "intent");
                        bundle.putLong("_cc", 1L);
                        a1.e(x1Var2);
                        x1Var2.k("auto", "_cmpx", bundle);
                    } else {
                        a1.d(q0Var3);
                        String strG2 = q0Var3.F.g();
                        if (TextUtils.isEmpty(strG2)) {
                            i0 i0Var5 = a1Var5.f11007t;
                            a1.f(i0Var5);
                            i0Var5.f11191r.b("Cache still valid but referrer not found");
                        } else {
                            a1.d(q0Var3);
                            long jA3 = q0Var3.G.a() / 3600000;
                            Uri uri = Uri.parse(strG2);
                            Bundle bundle2 = new Bundle();
                            Pair pair2 = new Pair(uri.getPath(), bundle2);
                            for (String str4 : uri.getQueryParameterNames()) {
                                bundle2.putString(str4, uri.getQueryParameter(str4));
                            }
                            ((Bundle) pair2.second).putLong("_cc", (jA3 - 1) * 3600000);
                            Object obj = pair2.first;
                            String str5 = obj == null ? "app" : (String) obj;
                            a1.e(x1Var2);
                            x1Var2.k(str5, "_cmp", (Bundle) pair2.second);
                        }
                        a1.d(q0Var3);
                        q0Var3.F.h(null);
                    }
                    a1.d(q0Var3);
                    q0Var3.G.b(0L);
                    break;
                }
                break;
        }
    }
}
