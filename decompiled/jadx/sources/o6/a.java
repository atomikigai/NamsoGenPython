package o6;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.zzavc;
import com.google.android.gms.internal.ads.zzbce;
import com.google.android.gms.internal.ads.zzbcn;
import com.google.android.gms.internal.ads.zzbes;
import com.google.android.gms.internal.ads.zzcaj;
import com.google.android.gms.internal.ads.zzdsr;
import com.google.android.gms.internal.ads.zzffs;
import com.google.android.gms.internal.ads.zzflr;
import com.google.android.gms.internal.ads.zzges;
import h6.r0;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f7580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WebView f7581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zzavc f7582c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zzffs f7583d;
    public final int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final zzdsr f7584f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f7585g;
    public final zzges h = zzcaj.zze;
    public final zzflr i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final x f7586j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b f7587k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final v f7588l;

    public a(WebView webView, zzavc zzavcVar, zzdsr zzdsrVar, zzflr zzflrVar, zzffs zzffsVar, x xVar, b bVar, v vVar) {
        this.f7581b = webView;
        Context context = webView.getContext();
        this.f7580a = context;
        this.f7582c = zzavcVar;
        this.f7584f = zzdsrVar;
        zzbcn.zza(context);
        zzbce zzbceVar = zzbcn.zzjh;
        e6.t tVar = e6.t.f3437d;
        this.e = ((Integer) tVar.f3440c.zza(zzbceVar)).intValue();
        this.f7585g = ((Boolean) tVar.f3440c.zza(zzbcn.zzji)).booleanValue();
        this.i = zzflrVar;
        this.f7583d = zzffsVar;
        this.f7586j = xVar;
        this.f7587k = bVar;
        this.f7588l = vVar;
    }

    @JavascriptInterface
    public String getClickSignals(String str) {
        try {
            d6.p pVar = d6.p.C;
            pVar.f2983j.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            String strZzd = this.f7582c.zzc().zzd(this.f7580a, str, this.f7581b);
            if (!this.f7585g) {
                return strZzd;
            }
            pVar.f2983j.getClass();
            android.support.v4.media.session.a.N(this.f7584f, "csg", new Pair("clat", String.valueOf(System.currentTimeMillis() - jCurrentTimeMillis)));
            return strZzd;
        } catch (RuntimeException e) {
            i6.h.e("Exception getting click signals. ", e);
            d6.p.C.f2982g.zzw(e, "TaggingLibraryJsInterface.getClickSignals");
            return "";
        }
    }

    @JavascriptInterface
    public String getClickSignalsWithTimeout(String str, int i) {
        if (i <= 0) {
            i6.h.d("Invalid timeout for getting click signals. Timeout=" + i);
            return "";
        }
        try {
            return (String) zzcaj.zza.zzb(new d6.g(6, this, str)).get(Math.min(i, this.e), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            i6.h.e("Exception getting click signals with timeout. ", e);
            d6.p.C.f2982g.zzw(e, "TaggingLibraryJsInterface.getClickSignalsWithTimeout");
            return e instanceof TimeoutException ? "17" : "";
        }
    }

    @JavascriptInterface
    public String getQueryInfo() throws Throwable {
        r0 r0Var = d6.p.C.f2979c;
        String string = UUID.randomUUID().toString();
        Bundle bundle = new Bundle();
        bundle.putString("query_info_type", "requester_type_6");
        t tVar = new t(this, string);
        if (((Boolean) zzbes.zzb.zze()).booleanValue()) {
            this.f7586j.b(this.f7581b, tVar);
            return string;
        }
        if (((Boolean) e6.t.f3437d.f3440c.zza(zzbcn.zzjk)).booleanValue()) {
            this.h.execute(new b3.b(this, bundle, tVar, 11, false));
            return string;
        }
        ta.c cVar = new ta.c();
        cVar.e(bundle);
        q6.a.a(this.f7580a, new w5.g(cVar), tVar);
        return string;
    }

    @JavascriptInterface
    public String getViewSignals() {
        try {
            d6.p pVar = d6.p.C;
            pVar.f2983j.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            String strZzh = this.f7582c.zzc().zzh(this.f7580a, this.f7581b, null);
            if (!this.f7585g) {
                return strZzh;
            }
            pVar.f2983j.getClass();
            android.support.v4.media.session.a.N(this.f7584f, "vsg", new Pair("vlat", String.valueOf(System.currentTimeMillis() - jCurrentTimeMillis)));
            return strZzh;
        } catch (RuntimeException e) {
            i6.h.e("Exception getting view signals. ", e);
            d6.p.C.f2982g.zzw(e, "TaggingLibraryJsInterface.getViewSignals");
            return "";
        }
    }

    @JavascriptInterface
    public String getViewSignalsWithTimeout(int i) {
        if (i <= 0) {
            i6.h.d("Invalid timeout for getting view signals. Timeout=" + i);
            return "";
        }
        try {
            return (String) zzcaj.zza.zzb(new d6.m(this, 4)).get(Math.min(i, this.e), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            i6.h.e("Exception getting view signals with timeout. ", e);
            d6.p.C.f2982g.zzw(e, "TaggingLibraryJsInterface.getViewSignalsWithTimeout");
            return e instanceof TimeoutException ? "17" : "";
        }
    }

    @JavascriptInterface
    public void recordClick(String str) {
        if (!((Boolean) e6.t.f3437d.f3440c.zza(zzbcn.zzjm)).booleanValue() || TextUtils.isEmpty(str)) {
            return;
        }
        zzcaj.zza.execute(new a3.e(this, str, 22, false));
    }

    @JavascriptInterface
    public void reportTouchEvent(String str) {
        int i;
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i10 = jSONObject.getInt("x");
            int i11 = jSONObject.getInt("y");
            int i12 = jSONObject.getInt("duration_ms");
            float f10 = (float) jSONObject.getDouble("force");
            int i13 = jSONObject.getInt("type");
            if (i13 != 0) {
                i = 1;
                if (i13 != 1) {
                    i = 2;
                    if (i13 != 2) {
                        i = 3;
                        if (i13 != 3) {
                            i = -1;
                        }
                    }
                }
            } else {
                i = 0;
            }
            try {
                this.f7582c.zzd(MotionEvent.obtain(0L, i12, i, i10, i11, f10, 1.0f, 0, 1.0f, 1.0f, 0, 0));
            } catch (RuntimeException e) {
                e = e;
                i6.h.e("Failed to parse the touch string. ", e);
                d6.p.C.f2982g.zzw(e, "TaggingLibraryJsInterface.reportTouchEvent");
            } catch (JSONException e4) {
                e = e4;
                i6.h.e("Failed to parse the touch string. ", e);
                d6.p.C.f2982g.zzw(e, "TaggingLibraryJsInterface.reportTouchEvent");
            }
        } catch (RuntimeException | JSONException e10) {
            e = e10;
        }
    }
}
