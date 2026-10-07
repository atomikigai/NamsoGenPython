package d6;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebSettings;
import com.google.android.gms.common.api.internal.h0;
import com.google.android.gms.common.internal.i0;
import com.google.android.gms.internal.ads.zzbcn;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import da.s;
import e6.t;
import h6.k0;
import h6.l0;
import h6.r0;
import java.io.File;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import z7.e1;
import z7.f3;
import z7.i1;
import z7.j1;
import z7.z2;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2939c;

    public /* synthetic */ g(int i, Object obj, Object obj2) {
        this.f2937a = i;
        this.f2938b = obj;
        this.f2939c = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        SharedPreferences sharedPreferences;
        int i = this.f2937a;
        boolean z4 = true;
        boolean z10 = false;
        Object obj = this.f2938b;
        Object obj2 = this.f2939c;
        switch (i) {
            case 0:
                return ((h) obj).a((Context) obj2);
            case 1:
                aa.c cVar = (aa.c) obj2;
                da.p pVar = (da.p) cVar.f264c;
                Boolean bool = (Boolean) obj;
                if (bool.booleanValue()) {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Sending cached crash reports...", null);
                    }
                    boolean zBooleanValue = bool.booleanValue();
                    h0 h0Var = pVar.f3126b;
                    if (!zBooleanValue) {
                        h0Var.getClass();
                        throw new IllegalStateException("An invalid data collection token was used.");
                    }
                    ((TaskCompletionSource) h0Var.f2118f).trySetResult(null);
                    Executor executor = (Executor) pVar.e.f107a;
                    return ((Task) cVar.f263b).onSuccessTask(executor, new aa.c(this, executor, 17, z10));
                }
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Deleting cached crash reports...", null);
                }
                Iterator it = ia.b.e(pVar.f3130g.f5246b.listFiles(da.p.f3124r)).iterator();
                while (it.hasNext()) {
                    ((File) it.next()).delete();
                }
                ia.b bVar = ((ia.a) pVar.f3134m.f1681b).f5242b;
                ia.a.a(ia.b.e(bVar.f5248d.listFiles()));
                ia.a.a(ia.b.e(bVar.e.listFiles()));
                ia.a.a(ia.b.e(bVar.f5249f.listFiles()));
                pVar.f3138q.trySetResult(null);
                return Tasks.forResult(null);
            case 2:
                da.p.a((da.p) obj2, (String) obj);
                return null;
            case 3:
                return s.a((s) obj2, (c3.j) obj);
            case 4:
                Context context = (Context) obj2;
                Context context2 = (Context) obj;
                if (context != null) {
                    k0.k("Attempting to read user agent from Google Play Services.");
                    sharedPreferences = context.getSharedPreferences("admob_user_agent", 0);
                    z4 = false;
                } else {
                    k0.k("Attempting to read user agent from local cache.");
                    sharedPreferences = context2.getSharedPreferences("admob_user_agent", 0);
                }
                String string = sharedPreferences.getString("user_agent", "");
                if (TextUtils.isEmpty(string)) {
                    k0.k("Reading user agent from WebSettings");
                    string = WebSettings.getDefaultUserAgent(context2);
                    if (z4) {
                        sharedPreferences.edit().putString("user_agent", string).apply();
                        k0.k("Persisting user agent.");
                    }
                }
                return string;
            case 5:
                l0 l0Var = r0.f5068l;
                WebSettings webSettings = (WebSettings) obj;
                webSettings.setDatabasePath(((Context) obj2).getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath());
                webSettings.setDatabaseEnabled(true);
                webSettings.setDomStorageEnabled(true);
                webSettings.setDisplayZoomControls(false);
                webSettings.setBuiltInZoomControls(true);
                webSettings.setSupportZoom(true);
                if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzaS)).booleanValue()) {
                    webSettings.setTextZoom(100);
                }
                webSettings.setAllowContentAccess(false);
                return Boolean.TRUE;
            case 6:
                return ((o6.a) obj).getClickSignals((String) obj2);
            case 7:
                z2 z2Var = ((e1) obj2).f11104a;
                z2Var.a();
                z7.j jVar = z2Var.f11509c;
                z2.D(jVar);
                return jVar.F((String) obj);
            default:
                z2 z2Var2 = (z2) obj2;
                f3 f3Var = (f3) obj;
                String str = f3Var.f11119a;
                i0.i(str);
                j1 j1VarI = z2Var2.I(str);
                i1 i1Var = i1.ANALYTICS_STORAGE;
                if (j1VarI.f(i1Var) && j1.b(100, f3Var.G).f(i1Var)) {
                    return z2Var2.E(f3Var).K();
                }
                z2Var2.zzaA().f11198y.b("Analytics storage consent denied. Returning null app instance id");
                return null;
        }
    }

    public /* synthetic */ g(Object obj, Object obj2, int i, boolean z4) {
        this.f2937a = i;
        this.f2939c = obj;
        this.f2938b = obj2;
    }
}
