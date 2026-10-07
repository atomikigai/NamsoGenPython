package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Canvas;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Looper;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewFeature;
import com.google.android.gms.common.api.f;
import d6.g;
import d6.j;
import d6.p;
import da.a0;
import da.v;
import e6.s;
import e6.t;
import g6.i;
import h6.b;
import h6.j0;
import h6.k0;
import h6.l0;
import h6.r0;
import i6.d;
import i6.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import n7.e;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzcgj extends WebView implements DownloadListener, ViewTreeObserver.OnGlobalLayoutListener, zzcfk {
    public static final /* synthetic */ int zza = 0;
    private final String zzA;
    private zzcgm zzB;
    private boolean zzC;
    private boolean zzD;
    private zzbfm zzE;
    private zzbfk zzF;
    private zzazz zzG;
    private int zzH;
    private int zzI;
    private zzbcz zzJ;
    private final zzbcz zzK;
    private zzbcz zzL;
    private final zzbda zzM;
    private int zzN;
    private i zzO;
    private boolean zzP;
    private final j0 zzQ;
    private int zzR;
    private int zzS;
    private int zzT;
    private int zzU;
    private Map zzV;
    private final WindowManager zzW;
    private final zzbbl zzX;
    private boolean zzY;
    private final zzchd zzb;
    private final zzavc zzc;
    private final zzffs zzd;
    private final zzbdu zze;
    private final i6.a zzf;
    private j zzg;
    private final d6.a zzh;
    private final DisplayMetrics zzi;
    private final float zzj;
    private zzfet zzk;
    private zzfew zzl;
    private boolean zzm;
    private boolean zzn;
    private zzcfs zzo;
    private i zzp;
    private zzeew zzq;
    private zzeeu zzr;
    private zzche zzs;
    private final String zzt;
    private boolean zzu;
    private boolean zzv;
    private boolean zzw;
    private boolean zzx;
    private Boolean zzy;
    private boolean zzz;

    public zzcgj(zzchd zzchdVar, zzche zzcheVar, String str, boolean z4, boolean z10, zzavc zzavcVar, zzbdu zzbduVar, i6.a aVar, zzbdc zzbdcVar, j jVar, d6.a aVar2, zzbbl zzbblVar, zzfet zzfetVar, zzfew zzfewVar, zzffs zzffsVar) {
        zzfew zzfewVar2;
        super(zzchdVar);
        this.zzm = false;
        this.zzn = false;
        this.zzz = true;
        this.zzA = "";
        this.zzR = -1;
        this.zzS = -1;
        this.zzT = -1;
        this.zzU = -1;
        this.zzb = zzchdVar;
        this.zzs = zzcheVar;
        this.zzt = str;
        this.zzw = z4;
        this.zzc = zzavcVar;
        this.zzd = zzffsVar;
        this.zze = zzbduVar;
        this.zzf = aVar;
        this.zzg = jVar;
        this.zzh = aVar2;
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        this.zzW = windowManager;
        r0 r0Var = p.C.f2979c;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        this.zzi = displayMetrics;
        this.zzj = displayMetrics.density;
        this.zzX = zzbblVar;
        this.zzk = zzfetVar;
        this.zzl = zzfewVar;
        this.zzQ = new j0(zzchdVar.zza(), this, this);
        this.zzY = false;
        setBackgroundColor(0);
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (NullPointerException e) {
            h.e("Unable to enable Javascript.", e);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        zzbce zzbceVar = zzbcn.zzlm;
        t tVar = t.f3437d;
        if (((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue()) {
            settings.setMixedContentMode(1);
        } else {
            settings.setMixedContentMode(2);
        }
        p pVar = p.C;
        settings.setUserAgentString(pVar.f2979c.w(zzchdVar, aVar.f5213a));
        Context context = getContext();
        a.a.r(context, new g(5, settings, context));
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setMediaPlaybackRequiresUserGesture(false);
        setDownloadListener(this);
        zzba();
        addJavascriptInterface(new zzcgq(this, new zzcgp(this)), "googleAdsJsInterface");
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        zzbi();
        zzbda zzbdaVar = new zzbda(new zzbdc(true, "make_wv", this.zzt));
        this.zzM = zzbdaVar;
        Context contextCreatePackageContext = null;
        zzbdaVar.zza().zzc(null);
        if (((Boolean) tVar.f3440c.zza(zzbcn.zzbW)).booleanValue() && (zzfewVar2 = this.zzl) != null && zzfewVar2.zzb != null) {
            zzbdaVar.zza().zzd("gqi", this.zzl.zzb);
        }
        zzbdaVar.zza();
        zzbcz zzbczVarZzf = zzbdc.zzf();
        this.zzK = zzbczVarZzf;
        zzbdaVar.zzb("native:view_create", zzbczVarZzf);
        this.zzL = null;
        this.zzJ = null;
        if (a0.f3088b == null) {
            a0.f3088b = new a0();
        }
        a0 a0Var = a0.f3088b;
        a0Var.getClass();
        k0.k("Updating user agent.");
        String defaultUserAgent = WebSettings.getDefaultUserAgent(zzchdVar);
        if (!defaultUserAgent.equals(a0Var.f3089a)) {
            AtomicBoolean atomicBoolean = g7.h.f4242a;
            try {
                contextCreatePackageContext = zzchdVar.createPackageContext("com.google.android.gms", 3);
            } catch (PackageManager.NameNotFoundException unused) {
            }
            if (contextCreatePackageContext == null) {
                zzchdVar.getSharedPreferences("admob_user_agent", 0).edit().putString("user_agent", WebSettings.getDefaultUserAgent(zzchdVar)).apply();
            }
            a0Var.f3089a = defaultUserAgent;
        }
        k0.k("User agent is updated.");
        pVar.f2982g.zzt();
    }

    private final synchronized void zzba() {
        zzfet zzfetVar = this.zzk;
        if (zzfetVar != null && zzfetVar.zzam) {
            h.b("Disabling hardware acceleration on an overlay.");
            zzbc();
            return;
        }
        if (!this.zzw && !this.zzs.zzi()) {
            h.b("Enabling hardware acceleration on an AdView.");
            zzbe();
            return;
        }
        h.b("Enabling hardware acceleration on an overlay.");
        zzbe();
    }

    private final synchronized void zzbb() {
        if (this.zzP) {
            return;
        }
        this.zzP = true;
        p.C.f2982g.zzr();
    }

    private final synchronized void zzbc() {
        try {
            if (!this.zzx) {
                setLayerType(1, null);
            }
            this.zzx = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    private final void zzbd(boolean z4) {
        HashMap map = new HashMap();
        map.put("isVisible", true != z4 ? "0" : "1");
        zzd("onAdVisibilityChanged", map);
    }

    private final synchronized void zzbe() {
        try {
            if (this.zzx) {
                setLayerType(0, null);
            }
            this.zzx = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized void zzbf(String str) {
        final String str2 = "about:blank";
        try {
            r0.f5068l.post(new Runnable(str2) { // from class: com.google.android.gms.internal.ads.zzcge
                public final /* synthetic */ String zzb = "about:blank";

                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzaW(this.zzb);
                }
            });
        } catch (Throwable th) {
            p.C.f2982g.zzw(th, "AdWebViewImpl.loadUrlUnsafe");
            h.h("Could not call loadUrl in destroy(). ", th);
        }
    }

    private final void zzbg() {
        zzbcu.zza(this.zzM.zza(), this.zzK, "aeh2");
    }

    private final synchronized void zzbh() {
        try {
            Map map = this.zzV;
            if (map != null) {
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    ((zzcdr) it.next()).release();
                }
            }
            this.zzV = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    private final void zzbi() {
        zzbda zzbdaVar = this.zzM;
        if (zzbdaVar == null) {
            return;
        }
        zzbdc zzbdcVarZza = zzbdaVar.zza();
        zzbcs zzbcsVarZzg = p.C.f2982g.zzg();
        if (zzbcsVarZzg != null) {
            zzbcsVarZzg.zzf(zzbdcVarZza);
        }
    }

    private final synchronized void zzbj() {
        Boolean boolZzl = p.C.f2982g.zzl();
        this.zzy = boolZzl;
        if (boolZzl == null) {
            try {
                evaluateJavascript("(function(){})()", null);
                zzaY(Boolean.TRUE);
            } catch (IllegalStateException unused) {
                zzaY(Boolean.FALSE);
            }
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcfk
    public final synchronized void destroy() {
        View decorView;
        try {
            zzbi();
            j0 j0Var = this.zzQ;
            j0Var.e = false;
            Activity activity = j0Var.f5020b;
            if (activity != null && j0Var.f5021c) {
                ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = j0Var.f5023f;
                Window window = activity.getWindow();
                ViewTreeObserver viewTreeObserver = (window == null || (decorView = window.getDecorView()) == null) ? null : decorView.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
                }
                j0Var.f5021c = false;
            }
            i iVar = this.zzp;
            if (iVar != null) {
                iVar.zzb();
                this.zzp.zzm();
                this.zzp = null;
            }
            this.zzq = null;
            this.zzr = null;
            this.zzo.zzh();
            this.zzG = null;
            this.zzg = null;
            setOnClickListener(null);
            setOnTouchListener(null);
            if (this.zzv) {
                return;
            }
            p.C.A.zzd(this);
            zzbh();
            this.zzv = true;
            if (!((Boolean) t.f3437d.f3440c.zza(zzbcn.zzku)).booleanValue()) {
                k0.k("Destroying the WebView immediately...");
                zzX();
                return;
            }
            Activity activityZza = this.zzb.zza();
            if (activityZza != null && activityZza.isDestroyed()) {
                k0.k("Destroying the WebView immediately...");
                zzX();
            } else {
                k0.k("Initiating WebView self destruct sequence in 3...");
                k0.k("Loading blank page in WebView, 2...");
                zzbf("about:blank");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.webkit.WebView
    public final synchronized void evaluateJavascript(final String str, final ValueCallback valueCallback) {
        if (zzaE()) {
            h.i("#004 The webview is destroyed. Ignoring action.", null);
            if (valueCallback != null) {
                valueCallback.onReceiveValue(null);
                return;
            }
            return;
        }
        if (!((Boolean) t.f3437d.f3440c.zza(zzbcn.zzkv)).booleanValue() || Looper.getMainLooper().getThread() == Thread.currentThread()) {
            super.evaluateJavascript(str, valueCallback);
        } else {
            zzcaj.zze.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgd
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzaU(str, valueCallback);
                }
            });
        }
    }

    public final void finalize() throws Throwable {
        try {
            synchronized (this) {
                try {
                    if (!this.zzv) {
                        this.zzo.zzh();
                        p.C.A.zzd(this);
                        zzbh();
                        zzbb();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            super.finalize();
        } catch (Throwable th2) {
            super.finalize();
            throw th2;
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcfk
    public final synchronized void loadData(String str, String str2, String str3) {
        if (zzaE()) {
            h.g("#004 The webview is destroyed. Ignoring action.");
        } else {
            super.loadData(str, str2, str3);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcfk
    public final synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) throws Throwable {
        try {
            try {
                if (zzaE()) {
                    h.g("#004 The webview is destroyed. Ignoring action.");
                } else {
                    super.loadDataWithBaseURL(str, str2, str3, str4, str5);
                }
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcfk
    public final synchronized void loadUrl(final String str) {
        if (zzaE()) {
            h.g("#004 The webview is destroyed. Ignoring action.");
            return;
        }
        try {
            r0.f5068l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgg
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzaV(str);
                }
            });
        } catch (Throwable th) {
            p.C.f2982g.zzw(th, "AdWebViewImpl.loadUrl");
            h.h("Could not call loadUrl. ", th);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfk, e6.a
    public final void onAdClicked() {
        zzcfs zzcfsVar = this.zzo;
        if (zzcfsVar != null) {
            zzcfsVar.onAdClicked();
        }
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final synchronized void onAttachedToWindow() {
        try {
            super.onAttachedToWindow();
            boolean z4 = true;
            if (!zzaE()) {
                j0 j0Var = this.zzQ;
                j0Var.f5022d = true;
                if (j0Var.e) {
                    j0Var.a();
                }
            }
            if (this.zzY) {
                onResume();
                this.zzY = false;
            }
            boolean z10 = this.zzC;
            zzcfs zzcfsVar = this.zzo;
            if (zzcfsVar == null || !zzcfsVar.zzT()) {
                z4 = z10;
            } else {
                if (!this.zzD) {
                    this.zzo.zza();
                    this.zzo.zzb();
                    this.zzD = true;
                }
                zzaZ();
            }
            zzbd(z4);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        zzcfs zzcfsVar;
        View decorView;
        synchronized (this) {
            try {
                if (!zzaE()) {
                    j0 j0Var = this.zzQ;
                    j0Var.f5022d = false;
                    Activity activity = j0Var.f5020b;
                    if (activity != null && j0Var.f5021c) {
                        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = j0Var.f5023f;
                        Window window = activity.getWindow();
                        ViewTreeObserver viewTreeObserver = (window == null || (decorView = window.getDecorView()) == null) ? null : decorView.getViewTreeObserver();
                        if (viewTreeObserver != null) {
                            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
                        }
                        j0Var.f5021c = false;
                    }
                }
                super.onDetachedFromWindow();
                if (this.zzD && (zzcfsVar = this.zzo) != null && zzcfsVar.zzT() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                    this.zzo.zza();
                    this.zzo.zzb();
                    this.zzD = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        zzbd(false);
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j4) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzkJ)).booleanValue() && getContext() != null) {
                intent.setPackage(getContext().getPackageName());
            }
            r0 r0Var = p.C.f2979c;
            r0.p(getContext(), intent);
        } catch (ActivityNotFoundException e) {
            h.b("Couldn't find an Activity to view url/mimetype: " + str + " / " + str4);
            p.C.f2982g.zzw(e, "AdWebViewImpl.onDownloadStart: ".concat(String.valueOf(str)));
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (zzaE()) {
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue = motionEvent.getAxisValue(9);
        float axisValue2 = motionEvent.getAxisValue(10);
        if (motionEvent.getActionMasked() == 8) {
            if (axisValue > 0.0f && !canScrollVertically(-1)) {
                return false;
            }
            if (axisValue < 0.0f && !canScrollVertically(1)) {
                return false;
            }
            if (axisValue2 > 0.0f && !canScrollHorizontally(-1)) {
                return false;
            }
            if (axisValue2 < 0.0f && !canScrollHorizontally(1)) {
                return false;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        boolean zZzaZ = zzaZ();
        i iVarZzL = zzL();
        if (iVarZzL != null && zZzaZ && iVarZzL.f4206w) {
            iVarZzL.f4206w = false;
            iVarZzL.f4198c.zzaa();
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0083 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x0085 A[Catch: all -> 0x000f, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000a, B:11:0x0012, B:13:0x0018, B:15:0x001c, B:18:0x0026, B:20:0x002e, B:23:0x0033, B:25:0x003b, B:27:0x004d, B:30:0x0052, B:32:0x0059, B:36:0x0063, B:39:0x0068, B:42:0x0079, B:50:0x0091, B:44:0x0080, B:47:0x0085, B:53:0x009e, B:55:0x00a6, B:57:0x00b8, B:60:0x00bd, B:62:0x00d9, B:64:0x00e1, B:63:0x00dd, B:67:0x00e6, B:69:0x00ee, B:72:0x00f9, B:81:0x011d, B:83:0x0124, B:87:0x012b, B:89:0x013d, B:91:0x014b, B:95:0x0158, B:98:0x015d, B:100:0x01a3, B:101:0x01a7, B:103:0x01ae, B:108:0x01bb, B:110:0x01c1, B:111:0x01c4, B:113:0x01c8, B:114:0x01d1, B:117:0x01dc), top: B:122:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x008f  */
    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    public final synchronized void onMeasure(int i, int i10) {
        int i11;
        int i12;
        int i13;
        int i14 = 0;
        if (zzaE()) {
            setMeasuredDimension(0, 0);
            return;
        }
        if (!isInEditMode() && !this.zzw && !this.zzs.zzf()) {
            if (this.zzs.zzh()) {
                super.onMeasure(i, i10);
                return;
            }
            if (this.zzs.zzj()) {
                if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzdU)).booleanValue()) {
                    super.onMeasure(i, i10);
                    return;
                }
                zzcgm zzcgmVarZzq = zzq();
                float fZze = zzcgmVarZzq != null ? zzcgmVarZzq.zze() : 0.0f;
                if (fZze == 0.0f) {
                    super.onMeasure(i, i10);
                    return;
                }
                int size = View.MeasureSpec.getSize(i);
                int size2 = View.MeasureSpec.getSize(i10);
                float f10 = size2 * fZze;
                int i15 = (int) (size / fZze);
                if (size2 != 0) {
                    i11 = (int) f10;
                    if (size == 0) {
                        i14 = size;
                    } else if (i11 != 0) {
                        i15 = (int) (i11 / fZze);
                        i12 = size2;
                        i13 = i11;
                        i14 = i13;
                    }
                    i12 = size2;
                    i13 = i11;
                } else if (i15 != 0) {
                    i13 = (int) (i15 * fZze);
                    i14 = size;
                    i12 = i15;
                } else {
                    size2 = 0;
                    i11 = (int) f10;
                    if (size == 0) {
                        i14 = size;
                    } else if (i11 != 0) {
                        i15 = (int) (i11 / fZze);
                        i12 = size2;
                        i13 = i11;
                        i14 = i13;
                    }
                    i12 = size2;
                    i13 = i11;
                }
                setMeasuredDimension(Math.min(i13, i14), Math.min(i15, i12));
                return;
            }
            if (this.zzs.zzg()) {
                if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzdZ)).booleanValue()) {
                    super.onMeasure(i, i10);
                    return;
                }
                zzag("/contentHeight", new zzcgh(this));
                zzaT("(function() {  var height = -1;  if (document.body) {    height = document.body.offsetHeight;  } else if (document.documentElement) {    height = document.documentElement.offsetHeight;  }  var url = 'gmsg://mobileads.google.com/contentHeight?';  url += 'height=' + height;  try {    window.googleAdsJsInterface.notify(url);  } catch (e) {    var frame = document.getElementById('afma-notify-fluid');    if (!frame) {      frame = document.createElement('IFRAME');      frame.id = 'afma-notify-fluid';      frame.style.display = 'none';      var body = document.body || document.documentElement;      body.appendChild(frame);    }    frame.src = url;  }})();");
                float f11 = this.zzi.density;
                int size3 = View.MeasureSpec.getSize(i);
                int i16 = this.zzI;
                setMeasuredDimension(size3, i16 != -1 ? (int) (i16 * f11) : View.MeasureSpec.getSize(i10));
                return;
            }
            if (this.zzs.zzi()) {
                DisplayMetrics displayMetrics = this.zzi;
                setMeasuredDimension(displayMetrics.widthPixels, displayMetrics.heightPixels);
                return;
            }
            int mode = View.MeasureSpec.getMode(i);
            int size4 = View.MeasureSpec.getSize(i);
            int mode2 = View.MeasureSpec.getMode(i10);
            int size5 = View.MeasureSpec.getSize(i10);
            int i17 = f.API_PRIORITY_OTHER;
            int i18 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size4 : Integer.MAX_VALUE;
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i17 = size5;
            }
            zzche zzcheVar = this.zzs;
            boolean z4 = zzcheVar.zzb > i18 || zzcheVar.zza > i17;
            if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzfr)).booleanValue()) {
                zzche zzcheVar2 = this.zzs;
                float f12 = zzcheVar2.zzb;
                float f13 = this.zzj;
                z4 &= f12 / f13 <= ((float) i18) / f13 && ((float) zzcheVar2.zza) / f13 <= ((float) i17) / f13;
            }
            if (!z4) {
                if (getVisibility() != 8) {
                    setVisibility(0);
                }
                if (!this.zzn) {
                    this.zzX.zzc(10002);
                    this.zzn = true;
                }
                zzche zzcheVar3 = this.zzs;
                setMeasuredDimension(zzcheVar3.zzb, zzcheVar3.zza);
                return;
            }
            zzche zzcheVar4 = this.zzs;
            float f14 = zzcheVar4.zzb;
            float f15 = this.zzj;
            h.g("Not enough space to show ad. Needs " + ((int) (f14 / f15)) + "x" + ((int) (zzcheVar4.zza / f15)) + " dp, but only has " + ((int) (size4 / f15)) + "x" + ((int) (size5 / f15)) + " dp.");
            if (getVisibility() != 8) {
                setVisibility(4);
            }
            setMeasuredDimension(0, 0);
            if (this.zzm) {
                return;
            }
            this.zzX.zzc(10001);
            this.zzm = true;
            return;
        }
        super.onMeasure(i, i10);
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcfk
    public final void onPause() {
        if (zzaE()) {
            return;
        }
        try {
            super.onPause();
            if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzml)).booleanValue() && WebViewFeature.isFeatureSupported(WebViewFeature.MUTE_AUDIO)) {
                h.b("Muting webview");
                WebViewCompat.setAudioMuted(this, true);
            }
        } catch (Exception e) {
            h.e("Could not pause webview.", e);
            if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzmo)).booleanValue()) {
                p.C.f2982g.zzw(e, "AdWebViewImpl.onPause");
            }
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcfk
    public final void onResume() {
        if (zzaE()) {
            return;
        }
        try {
            super.onResume();
            if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzml)).booleanValue() && WebViewFeature.isFeatureSupported(WebViewFeature.MUTE_AUDIO)) {
                h.b("Unmuting webview");
                WebViewCompat.setAudioMuted(this, false);
            }
        } catch (Exception e) {
            h.e("Could not resume webview.", e);
            if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzmo)).booleanValue()) {
                p.C.f2982g.zzw(e, "AdWebViewImpl.onResume");
            }
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z4 = ((Boolean) t.f3437d.f3440c.zza(zzbcn.zzdC)).booleanValue() && this.zzo.zzQ();
        if ((!this.zzo.zzT() || this.zzo.zzR()) && !z4) {
            zzavc zzavcVar = this.zzc;
            if (zzavcVar != null) {
                zzavcVar.zzd(motionEvent);
            }
            zzbdu zzbduVar = this.zze;
            if (zzbduVar != null) {
                zzbduVar.zzb(motionEvent);
            }
        } else {
            synchronized (this) {
                try {
                    zzbfm zzbfmVar = this.zzE;
                    if (zzbfmVar != null) {
                        zzbfmVar.zzd(motionEvent);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (zzaE()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcfk
    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof zzcfs) {
            this.zzo = (zzcfs) webViewClient;
        }
    }

    @Override // android.webkit.WebView
    public final void stopLoading() {
        if (zzaE()) {
            return;
        }
        try {
            super.stopLoading();
        } catch (Exception e) {
            h.e("Could not stop loading webview.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccf
    public final synchronized void zzA(int i) {
        this.zzN = i;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk, com.google.android.gms.internal.ads.zzccf
    public final synchronized void zzC(zzcgm zzcgmVar) {
        if (this.zzB != null) {
            h.d("Attempt to create multiple AdWebViewVideoControllers.");
        } else {
            this.zzB = zzcgmVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfk, com.google.android.gms.internal.ads.zzcfb
    public final zzfet zzD() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final Context zzE() {
        return this.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final WebViewClient zzH() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk, com.google.android.gms.internal.ads.zzcgx
    public final zzavc zzI() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final synchronized zzazz zzJ() {
        return this.zzG;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final synchronized zzbfm zzK() {
        return this.zzE;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final synchronized i zzL() {
        return this.zzp;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final synchronized i zzM() {
        return this.zzO;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final /* synthetic */ zzchc zzN() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk, com.google.android.gms.internal.ads.zzcgw
    public final synchronized zzche zzO() {
        return this.zzs;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final synchronized zzeeu zzP() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final synchronized zzeew zzQ() {
        return this.zzq;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk, com.google.android.gms.internal.ads.zzcgn
    public final zzfew zzR() {
        return this.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final zzffs zzS() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final m9.a zzT() {
        zzbdu zzbduVar = this.zze;
        return zzbduVar == null ? zzgei.zzh(null) : zzbduVar.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final synchronized String zzU() {
        return this.zzt;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final List zzV() {
        return new ArrayList();
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzW(zzfet zzfetVar, zzfew zzfewVar) {
        this.zzk = zzfetVar;
        this.zzl = zzfewVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final synchronized void zzX() {
        k0.k("Destroying WebView!");
        zzbb();
        r0.f5068l.post(new zzcgi(this));
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzY() {
        zzbg();
        HashMap map = new HashMap(1);
        map.put("version", this.zzf.f5213a);
        zzd("onhide", map);
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzZ(int i) {
        if (i == 0) {
            zzbda zzbdaVar = this.zzM;
            zzbcu.zza(zzbdaVar.zza(), this.zzK, "aebb2");
        }
        zzbg();
        this.zzM.zza();
        this.zzM.zza().zzd("close_type", String.valueOf(i));
        HashMap map = new HashMap(2);
        map.put("closetype", String.valueOf(i));
        map.put("version", this.zzf.f5213a);
        zzd("onhide", map);
    }

    @Override // com.google.android.gms.internal.ads.zzbmy
    public final void zza(String str) {
        zzaT(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzaA(String str, e eVar) {
        zzcfs zzcfsVar = this.zzo;
        if (zzcfsVar != null) {
            zzcfsVar.zzP(str, eVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final synchronized boolean zzaB() {
        return this.zzu;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final synchronized boolean zzaC() {
        return this.zzH > 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final boolean zzaD(final boolean z4, final int i) {
        destroy();
        this.zzX.zzb(new zzbbk() { // from class: com.google.android.gms.internal.ads.zzcgf
            @Override // com.google.android.gms.internal.ads.zzbbk
            public final void zza(zzbbs.zzt.zza zzaVar) {
                int i10 = zzcgj.zza;
                zzbbs.zzbl.zza zzaVarZzb = zzbbs.zzbl.zzb();
                boolean zZzf = zzaVarZzb.zzf();
                boolean z10 = z4;
                if (zZzf != z10) {
                    zzaVarZzb.zzd(z10);
                }
                zzaVarZzb.zze(i);
                zzaVar.zzab(zzaVarZzb.zzbr());
            }
        });
        this.zzX.zzc(10003);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final synchronized boolean zzaE() {
        return this.zzv;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final synchronized boolean zzaF() {
        return this.zzw;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final boolean zzaG() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final synchronized boolean zzaH() {
        return this.zzz;
    }

    @Override // com.google.android.gms.internal.ads.zzcgu
    public final void zzaJ(g6.e eVar, boolean z4, boolean z10) {
        this.zzo.zzu(eVar, z4, z10);
    }

    @Override // com.google.android.gms.internal.ads.zzcgu
    public final void zzaK(String str, String str2, int i) {
        this.zzo.zzv(str, str2, 14);
    }

    @Override // com.google.android.gms.internal.ads.zzcgu
    public final void zzaL(boolean z4, int i, boolean z10) {
        this.zzo.zzw(z4, i, z10);
    }

    @Override // com.google.android.gms.internal.ads.zzcgu
    public final void zzaM(boolean z4, int i, String str, String str2, boolean z10) {
        this.zzo.zzy(z4, i, str, str2, z10);
    }

    @Override // com.google.android.gms.internal.ads.zzcgu
    public final void zzaN(boolean z4, int i, String str, boolean z10, boolean z11) {
        this.zzo.zzz(z4, i, str, z10, z11);
    }

    public final zzcfs zzaO() {
        return this.zzo;
    }

    public final synchronized Boolean zzaP() {
        return this.zzy;
    }

    public final synchronized void zzaS(String str, ValueCallback valueCallback) {
        if (zzaE()) {
            h.g("#004 The webview is destroyed. Ignoring action.");
        } else {
            evaluateJavascript(str, null);
        }
    }

    public final void zzaT(String str) {
        if (zzaP() == null) {
            zzbj();
        }
        if (zzaP().booleanValue()) {
            zzaS(str, null);
        } else {
            zzaX("javascript:".concat(str));
        }
    }

    public final /* synthetic */ void zzaU(String str, ValueCallback valueCallback) {
        super.evaluateJavascript(str, valueCallback);
    }

    public final /* synthetic */ void zzaV(String str) {
        super.loadUrl(str);
    }

    public final /* synthetic */ void zzaW(String str) {
        super.loadUrl("about:blank");
    }

    public final synchronized void zzaX(String str) {
        if (zzaE()) {
            h.g("#004 The webview is destroyed. Ignoring action.");
        } else {
            loadUrl(str);
        }
    }

    public final void zzaY(Boolean bool) {
        synchronized (this) {
            this.zzy = bool;
        }
        p.C.f2982g.zzy(bool);
    }

    public final boolean zzaZ() {
        int i;
        int iRound;
        if (this.zzo.zzS() || this.zzo.zzT()) {
            d dVar = s.f3427f.f3428a;
            DisplayMetrics displayMetrics = this.zzi;
            int iRound2 = Math.round(displayMetrics.widthPixels / displayMetrics.density);
            DisplayMetrics displayMetrics2 = this.zzi;
            int iRound3 = Math.round(displayMetrics2.heightPixels / displayMetrics2.density);
            Activity activityZza = this.zzb.zza();
            if (activityZza == null || activityZza.getWindow() == null) {
                i = iRound2;
                iRound = iRound3;
            } else {
                r0 r0Var = p.C.f2979c;
                int[] iArrM = r0.m(activityZza);
                int iRound4 = Math.round(iArrM[0] / this.zzi.density);
                iRound = Math.round(iArrM[1] / this.zzi.density);
                i = iRound4;
            }
            int i10 = this.zzS;
            if (i10 != iRound2 || this.zzR != iRound3 || this.zzT != i || this.zzU != iRound) {
                boolean z4 = (i10 == iRound2 && this.zzR == iRound3) ? false : true;
                this.zzS = iRound2;
                this.zzR = iRound3;
                this.zzT = i;
                this.zzU = iRound;
                new zzbsk(this, "").zzj(iRound2, iRound3, i, iRound, this.zzi.density, this.zzW.getDefaultDisplay().getRotation());
                return z4;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzaa() {
        if (this.zzJ == null) {
            zzbda zzbdaVar = this.zzM;
            zzbcu.zza(zzbdaVar.zza(), this.zzK, "aes2");
            this.zzM.zza();
            zzbcz zzbczVarZzf = zzbdc.zzf();
            this.zzJ = zzbczVarZzf;
            this.zzM.zzb("native:view_show", zzbczVarZzf);
        }
        HashMap map = new HashMap(1);
        map.put("version", this.zzf.f5213a);
        zzd("onshow", map);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0043  */
    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzab() {
        boolean z4;
        float f10;
        HashMap map = new HashMap(3);
        p pVar = p.C;
        b bVar = pVar.h;
        synchronized (bVar) {
            z4 = bVar.f4971a;
        }
        map.put("app_muted", String.valueOf(z4));
        map.put("app_volume", String.valueOf(pVar.h.a()));
        AudioManager audioManager = (AudioManager) getContext().getSystemService("audio");
        if (audioManager == null) {
            f10 = 0.0f;
        } else {
            int streamMaxVolume = audioManager.getStreamMaxVolume(3);
            int streamVolume = audioManager.getStreamVolume(3);
            if (streamMaxVolume != 0) {
                f10 = streamVolume / streamMaxVolume;
            } else {
                f10 = 0.0f;
            }
        }
        map.put("device_volume", String.valueOf(f10));
        zzd("volume", map);
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzac(boolean z4) {
        this.zzo.zzi(z4);
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzad() {
        j0 j0Var = this.zzQ;
        j0Var.e = true;
        if (j0Var.f5022d) {
            j0Var.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final synchronized void zzae(String str, String str2, String str3) throws Throwable {
        Throwable th;
        String str4;
        try {
            try {
                if (zzaE()) {
                    h.g("#004 The webview is destroyed. Ignoring action.");
                    return;
                }
                String str5 = (String) t.f3437d.f3440c.zza(zzbcn.zzY);
                JSONObject jSONObject = new JSONObject();
                try {
                    try {
                        jSONObject.put("version", str5);
                        jSONObject.put("sdk", "Google Mobile Ads");
                        jSONObject.put("sdkVersion", "12.4.51-000");
                        str4 = "<script>Object.defineProperty(window,'MRAID_ENV',{get:function(){return " + jSONObject.toString() + "}});</script>";
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } catch (JSONException e) {
                    h.h("Unable to build MRAID_ENV", e);
                    str4 = null;
                }
                super.loadDataWithBaseURL(str, zzcgv.zzb(str2, str4), "text/html", "UTF-8", null);
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzaf() {
        if (this.zzL == null) {
            this.zzM.zza();
            zzbcz zzbczVarZzf = zzbdc.zzf();
            this.zzL = zzbczVarZzf;
            this.zzM.zzb("native:view_load", zzbczVarZzf);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzag(String str, zzbjr zzbjrVar) {
        zzcfs zzcfsVar = this.zzo;
        if (zzcfsVar != null) {
            zzcfsVar.zzA(str, zzbjrVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzah() {
        k0.k("Cannot add text view to inner AdWebView");
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final synchronized void zzai(i iVar) {
        this.zzp = iVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final synchronized void zzaj(zzche zzcheVar) {
        this.zzs = zzcheVar;
        requestLayout();
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final synchronized void zzak(zzazz zzazzVar) {
        this.zzG = zzazzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final synchronized void zzal(boolean z4) {
        this.zzz = z4;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzam() {
        setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzan(Context context) {
        this.zzb.setBaseContext(context);
        this.zzQ.f5020b = this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final synchronized void zzao(boolean z4) {
        i iVar = this.zzp;
        if (iVar != null) {
            iVar.N(this.zzo.zzS(), z4);
        } else {
            this.zzu = z4;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final synchronized void zzap(zzbfk zzbfkVar) {
        this.zzF = zzbfkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final synchronized void zzaq(boolean z4) {
        try {
            boolean z10 = this.zzw;
            this.zzw = z4;
            zzba();
            if (z4 != z10) {
                if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzZ)).booleanValue()) {
                    if (!this.zzs.zzi()) {
                    }
                }
                new zzbsk(this, "").zzl(true != z4 ? "default" : "expanded");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final synchronized void zzar(zzbfm zzbfmVar) {
        this.zzE = zzbfmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final synchronized void zzas(zzeeu zzeeuVar) {
        this.zzr = zzeeuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final synchronized void zzat(zzeew zzeewVar) {
        this.zzq = zzeewVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final synchronized void zzau(int i) {
        i iVar = this.zzp;
        if (iVar != null) {
            iVar.y(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzav(boolean z4) {
        this.zzY = true;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final synchronized void zzaw(i iVar) {
        this.zzO = iVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final synchronized void zzax(boolean z4) {
        i iVar;
        int i = this.zzH + (true != z4 ? -1 : 1);
        this.zzH = i;
        if (i > 0 || (iVar = this.zzp) == null) {
            return;
        }
        synchronized (iVar.f4207x) {
            try {
                iVar.A = true;
                androidx.activity.i iVar2 = iVar.f4209z;
                if (iVar2 != null) {
                    l0 l0Var = r0.f5068l;
                    l0Var.removeCallbacks(iVar2);
                    l0Var.post(iVar.f4209z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final synchronized void zzay(boolean z4) {
        if (z4) {
            try {
                setBackgroundColor(0);
            } catch (Throwable th) {
                throw th;
            }
        }
        i iVar = this.zzp;
        if (iVar != null) {
            if (z4) {
                iVar.f4205v.setBackgroundColor(0);
            } else {
                iVar.f4205v.setBackgroundColor(-16777216);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzaz(String str, zzbjr zzbjrVar) {
        zzcfs zzcfsVar = this.zzo;
        if (zzcfsVar != null) {
            zzcfsVar.zzO(str, zzbjrVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbmy
    public final void zzb(String str, String str2) {
        zzaT(v.v(str, "(", str2, ");"));
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final void zzd(String str, Map map) {
        try {
            zze(str, s.f3427f.f3428a.i(map));
        } catch (JSONException unused) {
            h.g("Could not convert parameters to JSON.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdel
    public final void zzdG() {
        zzcfs zzcfsVar = this.zzo;
        if (zzcfsVar != null) {
            zzcfsVar.zzdG();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdel
    public final void zzdf() {
        zzcfs zzcfsVar = this.zzo;
        if (zzcfsVar != null) {
            zzcfsVar.zzdf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfk, d6.j
    public final synchronized void zzdg() {
        j jVar = this.zzg;
        if (jVar != null) {
            jVar.zzdg();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfk, d6.j
    public final synchronized void zzdh() {
        j jVar = this.zzg;
        if (jVar != null) {
            jVar.zzdh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccf
    public final synchronized String zzdi() {
        return this.zzA;
    }

    @Override // com.google.android.gms.internal.ads.zzaym
    public final void zzdp(zzayl zzaylVar) {
        boolean z4;
        synchronized (this) {
            z4 = zzaylVar.zzj;
            this.zzC = z4;
        }
        zzbd(z4);
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final void zze(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        StringBuilder sbE = u3.b.e("(window.AFMA_ReceiveMessage || function() {})('", str, "',", jSONObject.toString(), ");");
        h.b("Dispatching AFMA event: ".concat(sbE.toString()));
        zzaT(sbE.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzccf
    public final synchronized int zzf() {
        return this.zzN;
    }

    @Override // com.google.android.gms.internal.ads.zzccf
    public final int zzg() {
        return getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.zzccf
    public final int zzh() {
        return getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.zzcfk, com.google.android.gms.internal.ads.zzcgr, com.google.android.gms.internal.ads.zzccf
    public final Activity zzi() {
        return this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcfk, com.google.android.gms.internal.ads.zzccf
    public final d6.a zzj() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzccf
    public final zzbcz zzk() {
        return this.zzK;
    }

    @Override // com.google.android.gms.internal.ads.zzbmy
    public final void zzl(String str, JSONObject jSONObject) {
        zzb(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzcfk, com.google.android.gms.internal.ads.zzccf
    public final zzbda zzm() {
        return this.zzM;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk, com.google.android.gms.internal.ads.zzcgy, com.google.android.gms.internal.ads.zzccf
    public final i6.a zzn() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzccf
    public final zzcbu zzo() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzccf
    public final synchronized zzcdr zzp(String str) {
        Map map = this.zzV;
        if (map == null) {
            return null;
        }
        return (zzcdr) map.get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcfk, com.google.android.gms.internal.ads.zzccf
    public final synchronized zzcgm zzq() {
        return this.zzB;
    }

    @Override // com.google.android.gms.internal.ads.zzccf
    public final synchronized String zzr() {
        zzfew zzfewVar = this.zzl;
        if (zzfewVar == null) {
            return null;
        }
        return zzfewVar.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk, com.google.android.gms.internal.ads.zzccf
    public final synchronized void zzt(String str, zzcdr zzcdrVar) {
        try {
            if (this.zzV == null) {
                this.zzV = new HashMap();
            }
            this.zzV.put(str, zzcdrVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccf
    public final void zzu() {
        i iVarZzL = zzL();
        if (iVarZzL != null) {
            iVarZzL.f4205v.f4193b = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccf
    public final void zzv(boolean z4, long j4) {
        HashMap map = new HashMap(2);
        map.put("success", true != z4 ? "0" : "1");
        map.put("duration", Long.toString(j4));
        zzd("onCacheAccessComplete", map);
    }

    @Override // com.google.android.gms.internal.ads.zzccf
    public final synchronized void zzw() {
        zzbfk zzbfkVar = this.zzF;
        if (zzbfkVar != null) {
            final zzdnd zzdndVar = (zzdnd) zzbfkVar;
            r0.f5068l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdnb
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        zzdndVar.zzd();
                    } catch (RemoteException e) {
                        h.i("#007 Could not call remote method.", e);
                    }
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccf
    public final void zzz(boolean z4) {
        this.zzo.zzD(false);
    }

    @Override // com.google.android.gms.internal.ads.zzcfk, com.google.android.gms.internal.ads.zzcgz
    public final View zzF() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final WebView zzG() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzccf
    public final void zzB(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzccf
    public final void zzx(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzccf
    public final void zzy(int i) {
    }
}
