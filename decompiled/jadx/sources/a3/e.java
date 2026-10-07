package a3;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.SystemClock;
import android.security.NetworkSecurityPolicy;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import androidx.fragment.app.w0;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.google.android.gms.common.internal.i0;
import com.google.android.gms.internal.ads.zzavd;
import com.google.android.gms.internal.ads.zzbbs;
import com.google.android.gms.internal.ads.zzbcn;
import com.google.android.gms.internal.ads.zzbef;
import com.google.android.gms.internal.ads.zzbuj;
import com.google.android.gms.internal.ads.zzbzt;
import com.google.android.gms.internal.ads.zzdoc;
import com.google.android.gms.internal.ads.zzdsm;
import com.google.android.gms.internal.ads.zzffs;
import com.google.android.gms.internal.ads.zzgei;
import com.google.android.gms.internal.play_billing.zzbt;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzie;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import d6.p;
import da.s;
import e6.o2;
import e6.p3;
import e6.q2;
import e6.t;
import h3.m1;
import h6.k0;
import h6.n0;
import h6.o0;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import o3.l;
import o3.m;
import o3.n;
import o3.x;
import org.json.JSONException;
import org.json.JSONObject;
import q3.k;
import rc.b0;
import w9.v;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f96a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f97b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f98c;

    public /* synthetic */ e(int i, Object obj, Object obj2) {
        this.f96a = i;
        this.f98c = obj;
        this.f97b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzffs zzffsVar;
        switch (this.f96a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.f97b;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    z2.c cVar = (z2.c) obj;
                    Object obj2 = ((f) this.f98c).e;
                    cVar.f10957b = obj2;
                    cVar.d(cVar.f10959d, obj2);
                }
                return;
            case 1:
                ArrayList arrayList2 = (ArrayList) this.f97b;
                w0 w0Var = (w0) this.f98c;
                if (arrayList2.contains(w0Var)) {
                    arrayList2.remove(w0Var);
                    q1.a.a(w0Var.f1006c.P, w0Var.f1004a);
                    return;
                }
                return;
            case 2:
                ((d0.d) this.f97b).f2747a = this.f98c;
                return;
            case 3:
                ((Application) this.f97b).unregisterActivityLifecycleCallbacks((d0.d) this.f98c);
                return;
            case 4:
                Object obj3 = this.f98c;
                Object obj4 = this.f97b;
                try {
                    Method method = d0.e.f2755d;
                    if (method != null) {
                        method.invoke(obj4, obj3, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        d0.e.e.invoke(obj4, obj3, Boolean.FALSE);
                    }
                    return;
                } catch (RuntimeException e) {
                    if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                        throw e;
                    }
                    return;
                } catch (Throwable th) {
                    Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
                    return;
                }
            case 5:
                d3.i iVar = (d3.i) this.f97b;
                try {
                    ((Runnable) this.f98c).run();
                    return;
                } finally {
                    iVar.a();
                }
            case 6:
                zzdsm zzdsmVar = (zzdsm) this.f97b;
                Long l2 = (Long) this.f98c;
                p.C.f2983j.getClass();
                d6.e.k(zzdsmVar, "cld_r", SystemClock.elapsedRealtime() - l2.longValue());
                return;
            case 7:
                s.a((s) this.f98c, (c3.j) this.f97b);
                return;
            case 8:
                ((q2) this.f97b).f3404l.addView((View) q7.b.I((q7.a) this.f98c));
                return;
            case 9:
                f7.h hVar = (f7.h) this.f97b;
                IBinder iBinder = (IBinder) this.f98c;
                synchronized (hVar) {
                    if (iBinder == null) {
                        hVar.a("Null service connection");
                    } else {
                        try {
                            hVar.f3631c = new aa.c(iBinder);
                            hVar.f3629a = 2;
                            ((ScheduledExecutorService) hVar.f3633f.f3640c).execute(new f7.g(hVar, 1));
                        } catch (RemoteException e4) {
                            hVar.a(e4.getMessage());
                        }
                    }
                }
                return;
            case 10:
                f7.h hVar2 = (f7.h) this.f97b;
                int i10 = ((f7.i) this.f98c).f3634a;
                synchronized (hVar2) {
                    f7.i iVar2 = (f7.i) hVar2.e.get(i10);
                    if (iVar2 != null) {
                        StringBuilder sb2 = new StringBuilder(31);
                        sb2.append("Timing out request: ");
                        sb2.append(i10);
                        Log.w("MessengerIpcClient", sb2.toString());
                        hVar2.e.remove(i10);
                        iVar2.b(new f7.j("Timed out waiting for response", null));
                        hVar2.c();
                    }
                    break;
                }
                return;
            case 11:
                synchronized (((ConstraintTrackingWorker) this.f98c).f1277r) {
                    if (((ConstraintTrackingWorker) this.f98c).f1278s) {
                        ((ConstraintTrackingWorker) this.f98c).f1279t.h(new t2.j());
                    } else {
                        ((ConstraintTrackingWorker) this.f98c).f1279t.j((m9.a) this.f97b);
                    }
                    break;
                }
                return;
            case 12:
                ((g6.i) ((g6.h) this.f97b).f4195b).f4196a.getWindow().setBackgroundDrawable((BitmapDrawable) this.f98c);
                return;
            case 13:
                n0 n0Var = (n0) this.f97b;
                Context context = (Context) this.f98c;
                n0Var.getClass();
                SharedPreferences sharedPreferences = context.getSharedPreferences("admob", 0);
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                try {
                    synchronized (n0Var.f5036a) {
                        try {
                            n0Var.f5040f = sharedPreferences;
                            n0Var.f5041g = editorEdit;
                            NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
                            n0Var.h = n0Var.f5040f.getBoolean("use_https", n0Var.h);
                            n0Var.f5053u = n0Var.f5040f.getBoolean("content_url_opted_out", n0Var.f5053u);
                            n0Var.i = n0Var.f5040f.getString("content_url_hashes", n0Var.i);
                            n0Var.f5043k = n0Var.f5040f.getBoolean("gad_idless", n0Var.f5043k);
                            n0Var.f5054v = n0Var.f5040f.getBoolean("content_vertical_opted_out", n0Var.f5054v);
                            n0Var.f5042j = n0Var.f5040f.getString("content_vertical_hashes", n0Var.f5042j);
                            n0Var.f5050r = n0Var.f5040f.getInt("version_code", n0Var.f5050r);
                            if (((Boolean) zzbef.zzg.zze()).booleanValue() && t.f3437d.f3440c.zze()) {
                                n0Var.f5046n = new zzbzt("", 0L);
                            } else {
                                n0Var.f5046n = new zzbzt(n0Var.f5040f.getString("app_settings_json", n0Var.f5046n.zzc()), n0Var.f5040f.getLong("app_settings_last_update_ms", n0Var.f5046n.zza()));
                            }
                            n0Var.f5047o = n0Var.f5040f.getLong("app_last_background_time_ms", n0Var.f5047o);
                            n0Var.f5049q = n0Var.f5040f.getInt("request_in_session_count", n0Var.f5049q);
                            n0Var.f5048p = n0Var.f5040f.getLong("first_ad_req_time_ms", n0Var.f5048p);
                            n0Var.f5051s = n0Var.f5040f.getStringSet("never_pool_slots", n0Var.f5051s);
                            n0Var.f5055w = n0Var.f5040f.getString("display_cutout", n0Var.f5055w);
                            n0Var.B = n0Var.f5040f.getInt("app_measurement_npa", n0Var.B);
                            n0Var.C = n0Var.f5040f.getInt("sd_app_measure_npa", n0Var.C);
                            n0Var.D = n0Var.f5040f.getLong("sd_app_measure_npa_ts", n0Var.D);
                            n0Var.f5056x = n0Var.f5040f.getString("inspector_info", n0Var.f5056x);
                            n0Var.f5057y = n0Var.f5040f.getBoolean("linked_device", n0Var.f5057y);
                            n0Var.f5058z = n0Var.f5040f.getString("linked_ad_unit", n0Var.f5058z);
                            n0Var.A = n0Var.f5040f.getString("inspector_ui_storage", n0Var.A);
                            n0Var.f5044l = n0Var.f5040f.getString("IABTCF_TCString", n0Var.f5044l);
                            n0Var.f5045m = n0Var.f5040f.getInt("gad_has_consent_for_cookies", n0Var.f5045m);
                            try {
                                n0Var.f5052t = new JSONObject(n0Var.f5040f.getString("native_advanced_settings", "{}"));
                            } catch (JSONException e10) {
                                i6.h.h("Could not convert native advanced settings to json object", e10);
                            }
                            n0Var.m();
                        } catch (Throwable th2) {
                            throw th2;
                        }
                        break;
                    }
                    return;
                } catch (Throwable th3) {
                    p.C.f2982g.zzw(th3, "AdSharedPreferenceManagerImpl.initializeOnBackgroundThread");
                    k0.l("AdSharedPreferenceManagerImpl.initializeOnBackgroundThread, errorMessage = ", th3);
                    return;
                }
            case 14:
                a5.b bVar = (a5.b) this.f97b;
                Typeface typeface = (Typeface) this.f98c;
                g0.b bVar2 = (g0.b) bVar.f188b;
                if (bVar2 != null) {
                    bVar2.h(typeface);
                    return;
                }
                return;
            case 15:
                ((n0.d) this.f97b).accept(this.f98c);
                return;
            case 16:
                o3.b bVar3 = (o3.b) this.f97b;
                o3.a aVar = (o3.a) this.f98c;
                zzie zzieVar = zzie.EXECUTE_ASYNC_TIMEOUT;
                o3.e eVar = x.f7538k;
                bVar3.V(3, zzieVar, eVar);
                aVar.a(eVar);
                return;
            case 17:
                o3.b bVar4 = (o3.b) this.f97b;
                o3.e eVar2 = (o3.e) this.f98c;
                if (((n) bVar4.f7474f.f2116c) != null) {
                    ((n) bVar4.f7474f.f2116c).j(eVar2, null);
                    return;
                } else {
                    zzc.zzn("BillingClient", "No valid listener is set in BroadcastManager");
                    return;
                }
            case 18:
                Future future = (Future) this.f97b;
                if (future.isDone() || future.isCancelled()) {
                    return;
                }
                Runnable runnable = (Runnable) this.f98c;
                future.cancel(true);
                zzc.zzn("BillingClient", "Async task is taking too long, cancel it!");
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 19:
                o3.b bVar5 = (o3.b) this.f97b;
                l lVar = (l) this.f98c;
                zzie zzieVar2 = zzie.EXECUTE_ASYNC_TIMEOUT;
                o3.e eVar3 = x.f7538k;
                bVar5.V(7, zzieVar2, eVar3);
                lVar.d(eVar3, new o0(19, zzbt.zzk(), zzbt.zzk()));
                return;
            case 20:
                o3.b bVar6 = (o3.b) this.f97b;
                m mVar = (m) this.f98c;
                zzie zzieVar3 = zzie.EXECUTE_ASYNC_TIMEOUT;
                o3.e eVar4 = x.f7538k;
                bVar6.V(9, zzieVar3, eVar4);
                mVar.b(eVar4, zzbt.zzk());
                return;
            case zzbbs.zzt.zzm /* 21 */:
                o6.i iVar3 = (o6.i) this.f97b;
                zzdoc[] zzdocVarArr = (zzdoc[]) this.f98c;
                iVar3.getClass();
                zzdoc zzdocVar = zzdocVarArr[0];
                if (zzdocVar != null) {
                    iVar3.e.zzb(zzgei.zzh(zzdocVar));
                    return;
                }
                return;
            case 22:
                o6.a aVar2 = (o6.a) this.f97b;
                String str = (String) this.f98c;
                WebView webView = aVar2.f7581b;
                Context context2 = aVar2.f7580a;
                Uri uriZza = Uri.parse(str);
                try {
                    uriZza = (!((Boolean) t.f3437d.f3440c.zza(zzbcn.zzlI)).booleanValue() || (zzffsVar = aVar2.f7583d) == null) ? aVar2.f7582c.zza(uriZza, context2, webView, null) : zzffsVar.zza(uriZza, context2, webView, null);
                    break;
                } catch (zzavd e11) {
                    i6.h.c("Failed to append the click signal to URL: ", e11);
                    p.C.f2982g.zzw(e11, "TaggingLibraryJsInterface.recordClick");
                }
                aVar2.i.zzc(uriZza.toString(), null);
                return;
            case 23:
                try {
                    ((q3.c) this.f98c).f7986b.put((k) this.f97b);
                    return;
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return;
                }
            case 24:
                t2.m mVarD = t2.m.d();
                String str2 = v2.a.f9147d;
                c3.i iVar4 = (c3.i) this.f97b;
                mVarD.a(str2, u3.b.b("Scheduling work ", iVar4.f1744a), new Throwable[0]);
                ((v2.a) this.f98c).f9148a.a(iVar4);
                return;
            case 25:
                ((m1) this.f97b).a((FirebaseAuth) this.f98c);
                return;
            case 26:
                w5.f fVar = (w5.f) this.f97b;
                try {
                    fVar.f9646b.zzg(p3.a(fVar.f9645a, (o2) this.f98c));
                    return;
                } catch (RemoteException e12) {
                    i6.h.e("Failed to load ad.", e12);
                    return;
                }
            case 27:
                w5.j jVar = (w5.j) this.f97b;
                try {
                    jVar.f9664a.b(((w5.g) this.f98c).f9647a);
                    return;
                } catch (IllegalStateException e13) {
                    zzbuj.zza(jVar.getContext()).zzh(e13, "BaseAdView.loadAd");
                    return;
                }
            case 28:
                FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(n9.g.e((String) this.f97b));
                v9.n nVar = firebaseAuth.f2702f;
                if (nVar != null) {
                    Task taskJ = firebaseAuth.j(nVar, true);
                    w9.e.e.e("Token refreshing started", new Object[0]);
                    taskJ.addOnFailureListener(new v(this, 1));
                    return;
                }
                return;
            default:
                wc.i iVar5 = (wc.i) this.f98c;
                rc.x xVar = iVar5.f9935c;
                int i11 = 0;
                while (true) {
                    try {
                        ((Runnable) this.f97b).run();
                    } catch (Throwable th4) {
                        b0.n(th4, yb.j.f10674a);
                    }
                    Runnable runnableU = iVar5.U();
                    if (runnableU == null) {
                        return;
                    }
                    this.f97b = runnableU;
                    i11++;
                    if (i11 >= 16 && xVar.T()) {
                        xVar.S(iVar5, this);
                        return;
                    }
                    break;
                }
                break;
        }
    }

    public /* synthetic */ e(Object obj, Object obj2, int i, boolean z4) {
        this.f96a = i;
        this.f97b = obj;
        this.f98c = obj2;
    }

    public e(w9.e eVar, String str) {
        this.f96a = 28;
        this.f98c = eVar;
        i0.e(str);
        this.f97b = str;
    }

    public e(androidx.fragment.app.h hVar, ArrayList arrayList, w0 w0Var) {
        this.f96a = 1;
        this.f97b = arrayList;
        this.f98c = w0Var;
    }
}
