package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.TrafficStats;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toolbar;
import androidx.webkit.ProxyConfig;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import d6.b;
import d6.m;
import d6.p;
import e6.t;
import g6.c;
import g6.e;
import g6.i;
import g6.l;
import h6.k0;
import h6.r0;
import h6.s0;
import i6.g;
import i6.h;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import q0.g0;
import q0.v0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class zzcfs extends WebViewClient implements zzchc {
    public static final /* synthetic */ int zzb = 0;
    private boolean zzA;
    private boolean zzB;
    private int zzC;
    private boolean zzD;
    private final zzeea zzF;
    private View.OnAttachStateChangeListener zzG;
    protected zzbyh zza;
    private final zzcfk zzc;
    private final zzbbl zzd;
    private e6.a zzg;
    private l zzh;
    private zzcha zzi;
    private zzchb zzj;
    private zzbih zzk;
    private zzbij zzl;
    private zzdel zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzs;
    private boolean zzt;
    private boolean zzu;
    private boolean zzv;
    private c zzw;
    private zzbsj zzx;
    private b zzy;
    private final HashMap zze = new HashMap();
    private final Object zzf = new Object();
    private int zzp = 0;
    private String zzq = "";
    private String zzr = "";
    private zzbse zzz = null;
    private final HashSet zzE = new HashSet(Arrays.asList(((String) t.f3437d.f3440c.zza(zzbcn.zzfD)).split(",")));

    public zzcfs(zzcfk zzcfkVar, zzbbl zzbblVar, boolean z4, zzbsj zzbsjVar, zzbse zzbseVar, zzeea zzeeaVar) {
        this.zzd = zzbblVar;
        this.zzc = zzcfkVar;
        this.zzs = z4;
        this.zzx = zzbsjVar;
        this.zzF = zzeeaVar;
    }

    private static WebResourceResponse zzV() {
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzaR)).booleanValue()) {
            return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    private final WebResourceResponse zzW(String str, Map map) throws IOException {
        URL url = new URL(str);
        try {
            TrafficStats.setThreadStatsTag(264);
            int i = 0;
            while (true) {
                i++;
                if (i > 20) {
                    TrafficStats.clearThreadStatsTag();
                    throw new IOException("Too many redirects (20)");
                }
                URLConnection uRLConnectionOpenConnection = url.openConnection();
                uRLConnectionOpenConnection.setConnectTimeout(10000);
                uRLConnectionOpenConnection.setReadTimeout(10000);
                for (Map.Entry entry : map.entrySet()) {
                    uRLConnectionOpenConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
                    throw new IOException("Invalid protocol.");
                }
                HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                p.C.f2979c.y(this.zzc.getContext(), this.zzc.zzn().f5213a, httpURLConnection, 60000);
                g gVar = new g();
                WebResourceResponse webResourceResponse = null;
                gVar.a(httpURLConnection, null);
                int responseCode = httpURLConnection.getResponseCode();
                gVar.b(httpURLConnection, responseCode);
                if (responseCode < 300 || responseCode >= 400) {
                    String contentType = httpURLConnection.getContentType();
                    String strTrim = "";
                    String strTrim2 = TextUtils.isEmpty(contentType) ? "" : contentType.split(";")[0].trim();
                    String contentType2 = httpURLConnection.getContentType();
                    if (!TextUtils.isEmpty(contentType2)) {
                        String[] strArrSplit = contentType2.split(";");
                        if (strArrSplit.length != 1) {
                            for (int i10 = 1; i10 < strArrSplit.length; i10++) {
                                if (strArrSplit[i10].trim().startsWith("charset")) {
                                    String[] strArrSplit2 = strArrSplit[i10].trim().split("=");
                                    if (strArrSplit2.length > 1) {
                                        strTrim = strArrSplit2[1].trim();
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    String str2 = strTrim;
                    Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                    HashMap map2 = new HashMap(headerFields.size());
                    for (Map.Entry<String, List<String>> entry2 : headerFields.entrySet()) {
                        if (entry2.getKey() != null && entry2.getValue() != null && !entry2.getValue().isEmpty()) {
                            map2.put(entry2.getKey(), entry2.getValue().get(0));
                        }
                    }
                    s0 s0Var = p.C.e;
                    int responseCode2 = httpURLConnection.getResponseCode();
                    String responseMessage = httpURLConnection.getResponseMessage();
                    InputStream inputStream = httpURLConnection.getInputStream();
                    s0Var.getClass();
                    webResourceResponse = new WebResourceResponse(strTrim2, str2, responseCode2, responseMessage, map2, inputStream);
                } else {
                    String headerField = httpURLConnection.getHeaderField("Location");
                    if (headerField == null) {
                        throw new IOException("Missing Location header in redirect");
                    }
                    if (!headerField.startsWith("tel:")) {
                        URL url2 = new URL(url, headerField);
                        String protocol = url2.getProtocol();
                        if (protocol == null) {
                            h.g("Protocol is null");
                            webResourceResponse = zzV();
                        } else if (protocol.equals(ProxyConfig.MATCH_HTTP) || protocol.equals(ProxyConfig.MATCH_HTTPS)) {
                            h.b("Redirecting to " + headerField);
                            httpURLConnection.disconnect();
                            url = url2;
                        } else {
                            h.g("Unsupported scheme: " + protocol);
                            webResourceResponse = zzV();
                        }
                    }
                }
                TrafficStats.clearThreadStatsTag();
                return webResourceResponse;
            }
        } catch (Throwable th) {
            TrafficStats.clearThreadStatsTag();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzX(Map map, List list, String str) {
        if (k0.m()) {
            k0.k("Received GMSG: ".concat(str));
            for (String str2 : map.keySet()) {
                k0.k("  " + str2 + ": " + ((String) map.get(str2)));
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((zzbjr) it.next()).zza(this.zzc, map);
        }
    }

    private final void zzY() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.zzG;
        if (onAttachStateChangeListener == null) {
            return;
        }
        ((View) this.zzc).removeOnAttachStateChangeListener(onAttachStateChangeListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzZ(final View view, final zzbyh zzbyhVar, final int i) {
        if (!zzbyhVar.zzi() || i <= 0) {
            return;
        }
        zzbyhVar.zzg(view);
        if (zzbyhVar.zzi()) {
            r0.f5068l.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfl
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzp(view, zzbyhVar, i);
                }
            }, 100L);
        }
    }

    private static final boolean zzaa(zzcfk zzcfkVar) {
        if (zzcfkVar.zzD() != null) {
            return zzcfkVar.zzD().zzai;
        }
        return false;
    }

    private static final boolean zzab(boolean z4, zzcfk zzcfkVar) {
        return (!z4 || zzcfkVar.zzO().zzi() || zzcfkVar.zzU().equals("interstitial_mb")) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzchc, e6.a
    public final void onAdClicked() {
        e6.a aVar = this.zzg;
        if (aVar != null) {
            aVar.onAdClicked();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        k0.k("Loading resource: ".concat(String.valueOf(str)));
        Uri uri = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(uri.getScheme()) && "mobileads.google.com".equalsIgnoreCase(uri.getHost())) {
            zzj(uri);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        Toolbar toolbar;
        synchronized (this.zzf) {
            try {
                if (this.zzc.zzaE()) {
                    k0.k("Blank page loaded, 1...");
                    this.zzc.zzX();
                    return;
                }
                this.zzA = true;
                zzchb zzchbVar = this.zzj;
                if (zzchbVar != null) {
                    zzchbVar.zza();
                    this.zzj = null;
                }
                zzg();
                if (this.zzc.zzL() != null) {
                    if (!((Boolean) t.f3437d.f3440c.zza(zzbcn.zzlD)).booleanValue() || (toolbar = this.zzc.zzL().F) == null) {
                        return;
                    }
                    toolbar.setSubtitle(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        this.zzo = true;
        this.zzp = i;
        this.zzq = str;
        this.zzr = str2;
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return this.zzc.zzaD(renderProcessGoneDetail.didCrash(), renderProcessGoneDetail.rendererPriorityAtExit());
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return zzc(str, Collections.EMPTY_MAP);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 79 || keyCode == 222) {
            return true;
        }
        switch (keyCode) {
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
                return true;
            default:
                switch (keyCode) {
                    case 126:
                    case 127:
                    case 128:
                    case 129:
                    case 130:
                        return true;
                    default:
                        return false;
                }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        k0.k("AdWebView shouldOverrideUrlLoading: ".concat(String.valueOf(str)));
        Uri uriZza = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(uriZza.getScheme()) && "mobileads.google.com".equalsIgnoreCase(uriZza.getHost())) {
            zzj(uriZza);
        } else {
            if (this.zzn && webView == this.zzc.zzG()) {
                String scheme = uriZza.getScheme();
                if (ProxyConfig.MATCH_HTTP.equalsIgnoreCase(scheme) || ProxyConfig.MATCH_HTTPS.equalsIgnoreCase(scheme)) {
                    e6.a aVar = this.zzg;
                    if (aVar != null) {
                        aVar.onAdClicked();
                        zzbyh zzbyhVar = this.zza;
                        if (zzbyhVar != null) {
                            zzbyhVar.zzh(str);
                        }
                        this.zzg = null;
                    }
                    zzdel zzdelVar = this.zzm;
                    if (zzdelVar != null) {
                        zzdelVar.zzdG();
                        this.zzm = null;
                    }
                    return super.shouldOverrideUrlLoading(webView, str);
                }
            }
            if (this.zzc.zzG().willNotDraw()) {
                h.g("AdWebView unable to handle URL: ".concat(String.valueOf(str)));
            } else {
                try {
                    zzavc zzavcVarZzI = this.zzc.zzI();
                    zzffs zzffsVarZzS = this.zzc.zzS();
                    if (!((Boolean) t.f3437d.f3440c.zza(zzbcn.zzlI)).booleanValue() || zzffsVarZzS == null) {
                        if (zzavcVarZzI != null && zzavcVarZzI.zzf(uriZza)) {
                            Context context = this.zzc.getContext();
                            zzcfk zzcfkVar = this.zzc;
                            uriZza = zzavcVarZzI.zza(uriZza, context, (View) zzcfkVar, zzcfkVar.zzi());
                        }
                    } else if (zzavcVarZzI != null && zzavcVarZzI.zzf(uriZza)) {
                        Context context2 = this.zzc.getContext();
                        zzcfk zzcfkVar2 = this.zzc;
                        uriZza = zzffsVarZzS.zza(uriZza, context2, (View) zzcfkVar2, zzcfkVar2.zzi());
                    }
                } catch (zzavd unused) {
                    h.g("Unable to append parameter to URL: ".concat(String.valueOf(str)));
                }
                b bVar = this.zzy;
                if (bVar == null || bVar.b()) {
                    zzu(new e("android.intent.action.VIEW", uriZza.toString(), null, null, null, null, null, null), true, false);
                } else {
                    bVar.a(str);
                }
            }
        }
        return true;
    }

    public final void zzA(String str, zzbjr zzbjrVar) {
        synchronized (this.zzf) {
            try {
                List copyOnWriteArrayList = (List) this.zze.get(str);
                if (copyOnWriteArrayList == null) {
                    copyOnWriteArrayList = new CopyOnWriteArrayList();
                    this.zze.put(str, copyOnWriteArrayList);
                }
                copyOnWriteArrayList.add(zzbjrVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchc
    public final void zzB(zzcha zzchaVar) {
        this.zzi = zzchaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzchc
    public final void zzC(int i, int i10) {
        zzbse zzbseVar = this.zzz;
        if (zzbseVar != null) {
            zzbseVar.zze(i, i10);
        }
    }

    public final void zzD(boolean z4) {
        this.zzn = false;
    }

    @Override // com.google.android.gms.internal.ads.zzchc
    public final void zzE(boolean z4) {
        synchronized (this.zzf) {
            this.zzu = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchc
    public final void zzF(boolean z4) {
        synchronized (this.zzf) {
            this.zzv = z4;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchc
    public final void zzG() {
        synchronized (this.zzf) {
            this.zzn = false;
            this.zzs = true;
            zzcaj.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfm
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzn();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchc
    public final void zzH(boolean z4) {
        synchronized (this.zzf) {
            this.zzt = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchc
    public final void zzI(zzchb zzchbVar) {
        this.zzj = zzchbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzchc
    public final void zzJ(zzcnb zzcnbVar, zzedp zzedpVar, zzflr zzflrVar) {
        zzN("/click");
        if (zzedpVar == null || zzflrVar == null) {
            zzA("/click", new zzbip(this.zzm, zzcnbVar));
        } else {
            zzA("/click", new zzffw(this.zzm, zzcnbVar, zzflrVar, zzedpVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchc
    public final void zzK(zzcnb zzcnbVar) {
        zzN("/click");
        zzA("/click", new zzbip(this.zzm, zzcnbVar));
    }

    @Override // com.google.android.gms.internal.ads.zzchc
    public final void zzL(zzcnb zzcnbVar, zzedp zzedpVar, zzdsm zzdsmVar) {
        zzN("/open");
        zzA("/open", new zzbkd(this.zzy, this.zzz, zzedpVar, zzdsmVar, zzcnbVar));
    }

    @Override // com.google.android.gms.internal.ads.zzchc
    public final void zzM(zzfet zzfetVar) {
        if (p.C.f2998y.zzp(this.zzc.getContext())) {
            zzN("/logScionEvent");
            new HashMap();
            zzA("/logScionEvent", new zzbjx(this.zzc.getContext(), zzfetVar.zzaw));
        }
    }

    public final void zzN(String str) {
        synchronized (this.zzf) {
            try {
                List list = (List) this.zze.get(str);
                if (list == null) {
                    return;
                }
                list.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzO(String str, zzbjr zzbjrVar) {
        synchronized (this.zzf) {
            try {
                List list = (List) this.zze.get(str);
                if (list == null) {
                    return;
                }
                list.remove(zzbjrVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzP(String str, n7.e eVar) {
        synchronized (this.zzf) {
            try {
                List<zzbjr> list = (List) this.zze.get(str);
                if (list == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (zzbjr zzbjrVar : list) {
                    if (eVar.apply(zzbjrVar)) {
                        arrayList.add(zzbjrVar);
                    }
                }
                list.removeAll(arrayList);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean zzQ() {
        boolean z4;
        synchronized (this.zzf) {
            z4 = this.zzu;
        }
        return z4;
    }

    public final boolean zzR() {
        boolean z4;
        synchronized (this.zzf) {
            z4 = this.zzv;
        }
        return z4;
    }

    @Override // com.google.android.gms.internal.ads.zzchc
    public final boolean zzS() {
        boolean z4;
        synchronized (this.zzf) {
            z4 = this.zzs;
        }
        return z4;
    }

    public final boolean zzT() {
        boolean z4;
        synchronized (this.zzf) {
            z4 = this.zzt;
        }
        return z4;
    }

    @Override // com.google.android.gms.internal.ads.zzchc
    public final void zzU(e6.a aVar, zzbih zzbihVar, l lVar, zzbij zzbijVar, c cVar, boolean z4, zzbju zzbjuVar, b bVar, zzbsl zzbslVar, zzbyh zzbyhVar, final zzedp zzedpVar, final zzflr zzflrVar, zzdsm zzdsmVar, zzbkl zzbklVar, zzdel zzdelVar, zzbkk zzbkkVar, zzbke zzbkeVar, zzbjs zzbjsVar, zzcnb zzcnbVar) {
        b bVar2 = bVar == null ? new b(this.zzc.getContext(), zzbyhVar) : bVar;
        this.zzz = new zzbse(this.zzc, zzbslVar);
        this.zza = zzbyhVar;
        zzbce zzbceVar = zzbcn.zzaY;
        t tVar = t.f3437d;
        zzbcl zzbclVar = tVar.f3440c;
        zzbcl zzbclVar2 = tVar.f3440c;
        if (((Boolean) zzbclVar.zza(zzbceVar)).booleanValue()) {
            zzA("/adMetadata", new zzbig(zzbihVar));
        }
        if (zzbijVar != null) {
            zzA("/appEvent", new zzbii(zzbijVar));
        }
        zzA("/backButton", zzbjq.zzj);
        zzA("/refresh", zzbjq.zzk);
        zzA("/canOpenApp", zzbjq.zzb);
        zzA("/canOpenURLs", zzbjq.zza);
        zzA("/canOpenIntents", zzbjq.zzc);
        zzA("/close", zzbjq.zzd);
        zzA("/customClose", zzbjq.zze);
        zzA("/instrument", zzbjq.zzn);
        zzA("/delayPageLoaded", zzbjq.zzp);
        zzA("/delayPageClosed", zzbjq.zzq);
        zzA("/getLocationInfo", zzbjq.zzr);
        zzA("/log", zzbjq.zzg);
        zzA("/mraid", new zzbjy(bVar2, this.zzz, zzbslVar));
        zzbsj zzbsjVar = this.zzx;
        if (zzbsjVar != null) {
            zzA("/mraidLoaded", zzbsjVar);
        }
        b bVar3 = bVar2;
        zzA("/open", new zzbkd(bVar3, this.zzz, zzedpVar, zzdsmVar, zzcnbVar));
        zzA("/precache", new zzcds());
        zzA("/touch", zzbjq.zzi);
        zzA("/video", zzbjq.zzl);
        zzA("/videoMeta", zzbjq.zzm);
        if (zzedpVar == null || zzflrVar == null) {
            zzA("/click", new zzbip(zzdelVar, zzcnbVar));
            zzA("/httpTrack", zzbjq.zzf);
        } else {
            zzA("/click", new zzffw(zzdelVar, zzcnbVar, zzflrVar, zzedpVar));
            zzA("/httpTrack", new zzbjr() { // from class: com.google.android.gms.internal.ads.zzffx
                @Override // com.google.android.gms.internal.ads.zzbjr
                public final void zza(Object obj, Map map) {
                    zzcfb zzcfbVar = (zzcfb) obj;
                    String str = (String) map.get("u");
                    if (str == null) {
                        h.g("URL missing from httpTrack GMSG.");
                    } else {
                        if (!zzcfbVar.zzD().zzai) {
                            zzflrVar.zzc(str, null);
                            return;
                        }
                        zzedp zzedpVar2 = zzedpVar;
                        p.C.f2983j.getClass();
                        zzedpVar2.zzd(new zzedr(System.currentTimeMillis(), ((zzcgn) zzcfbVar).zzR().zzb, str, 2));
                    }
                }
            });
        }
        if (p.C.f2998y.zzp(this.zzc.getContext())) {
            Map map = new HashMap();
            if (this.zzc.zzD() != null) {
                map = this.zzc.zzD().zzaw;
            }
            zzA("/logScionEvent", new zzbjx(this.zzc.getContext(), map));
        }
        if (zzbjuVar != null) {
            zzA("/setInterstitialProperties", new zzbjt(zzbjuVar));
        }
        if (zzbklVar != null && ((Boolean) zzbclVar2.zza(zzbcn.zziz)).booleanValue()) {
            zzA("/inspectorNetworkExtras", zzbklVar);
        }
        if (((Boolean) zzbclVar2.zza(zzbcn.zziS)).booleanValue() && zzbkkVar != null) {
            zzA("/shareSheet", zzbkkVar);
        }
        if (((Boolean) zzbclVar2.zza(zzbcn.zziX)).booleanValue() && zzbkeVar != null) {
            zzA("/inspectorOutOfContextTest", zzbkeVar);
        }
        if (((Boolean) zzbclVar2.zza(zzbcn.zzjb)).booleanValue() && zzbjsVar != null) {
            zzA("/inspectorStorage", zzbjsVar);
        }
        if (((Boolean) zzbclVar2.zza(zzbcn.zzlg)).booleanValue()) {
            zzA("/bindPlayStoreOverlay", zzbjq.zzu);
            zzA("/presentPlayStoreOverlay", zzbjq.zzv);
            zzA("/expandPlayStoreOverlay", zzbjq.zzw);
            zzA("/collapsePlayStoreOverlay", zzbjq.zzx);
            zzA("/closePlayStoreOverlay", zzbjq.zzy);
        }
        if (((Boolean) zzbclVar2.zza(zzbcn.zzdq)).booleanValue()) {
            zzA("/setPAIDPersonalizationEnabled", zzbjq.zzA);
            zzA("/resetPAID", zzbjq.zzz);
        }
        if (((Boolean) zzbclVar2.zza(zzbcn.zzlC)).booleanValue()) {
            zzcfk zzcfkVar = this.zzc;
            if (zzcfkVar.zzD() != null && zzcfkVar.zzD().zzar) {
                zzA("/writeToLocalStorage", zzbjq.zzB);
                zzA("/clearLocalStorageKeys", zzbjq.zzC);
            }
        }
        this.zzg = aVar;
        this.zzh = lVar;
        this.zzk = zzbihVar;
        this.zzl = zzbijVar;
        this.zzw = cVar;
        this.zzy = bVar3;
        this.zzm = zzdelVar;
        this.zzn = z4;
    }

    public final ViewTreeObserver.OnGlobalLayoutListener zza() {
        synchronized (this.zzf) {
        }
        return null;
    }

    public final ViewTreeObserver.OnScrollChangedListener zzb() {
        synchronized (this.zzf) {
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02b8 A[Catch: NoClassDefFoundError -> 0x0022, Exception -> 0x0025, TryCatch #12 {Exception -> 0x0025, NoClassDefFoundError -> 0x0022, blocks: (B:3:0x000c, B:5:0x0019, B:10:0x0028, B:12:0x003a, B:14:0x0041, B:16:0x004d, B:18:0x0069, B:20:0x0082, B:22:0x0099, B:23:0x009c, B:25:0x009f, B:28:0x00bd, B:30:0x00d5, B:32:0x00e6, B:77:0x01bb, B:49:0x0170, B:96:0x02a2, B:99:0x02b2, B:101:0x02b8, B:103:0x02c6, B:85:0x022a, B:86:0x0253, B:84:0x0202, B:48:0x014b, B:31:0x00de, B:87:0x0254, B:89:0x025e, B:91:0x0264, B:93:0x0297), top: B:111:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:24:0x009e  */
    /* JADX WARN: Code duplicated, block: B:82:0x01f7 A[Catch: all -> 0x01ae, TryCatch #7 {all -> 0x01ae, blocks: (B:70:0x0193, B:72:0x01a5, B:76:0x01b1, B:80:0x01e5, B:82:0x01f7, B:83:0x01fe), top: B:110:0x00e6 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x02a2 A[Catch: NoClassDefFoundError -> 0x0022, Exception -> 0x0025, TryCatch #12 {Exception -> 0x0025, NoClassDefFoundError -> 0x0022, blocks: (B:3:0x000c, B:5:0x0019, B:10:0x0028, B:12:0x003a, B:14:0x0041, B:16:0x004d, B:18:0x0069, B:20:0x0082, B:22:0x0099, B:23:0x009c, B:25:0x009f, B:28:0x00bd, B:30:0x00d5, B:32:0x00e6, B:77:0x01bb, B:49:0x0170, B:96:0x02a2, B:99:0x02b2, B:101:0x02b8, B:103:0x02c6, B:85:0x022a, B:86:0x0253, B:84:0x0202, B:48:0x014b, B:31:0x00de, B:87:0x0254, B:89:0x025e, B:91:0x0264, B:93:0x0297), top: B:111:0x000c }] */
    /* JADX WARN: Multi-variable type inference failed */
    public final WebResourceResponse zzc(String str, Map map) throws Throwable {
        WebResourceResponse webResourceResponse;
        int i;
        InputStream inputStream;
        InputStream inputStreamZzc;
        final boolean z4;
        final boolean z10;
        final boolean z11;
        String str2;
        try {
            Map map2 = new HashMap();
            if (this.zzc.zzD() != null) {
                map2 = this.zzc.zzD().zzaw;
            }
            String strZzc = zzbyx.zzc(str, this.zzc.getContext(), this.zzD, map2);
            if (!strZzc.equals(str)) {
                return zzW(strZzc, map);
            }
            zzbax zzbaxVarZza = zzbax.zza(Uri.parse(str));
            if (zzbaxVarZza != null) {
                HashMap map3 = new HashMap();
                map3.put("Access-Control-Allow-Origin", ProxyConfig.MATCH_ALL_SCHEMES);
                Uri uri = Uri.parse(str);
                if (uri.getQueryParameterNames().contains("range")) {
                    List listZze = zzfxd.zzb(zzfwf.zzc('-')).zze(uri.getQueryParameter("range"));
                    if (listZze.size() == 2) {
                        int i10 = Integer.parseInt((String) listZze.get(0));
                        int i11 = Integer.parseInt((String) listZze.get(1)) + 1;
                        if (i10 > 0) {
                            zzbaxVarZza.zzh = i10;
                        }
                        i = i11 - i10;
                    } else {
                        i = -1;
                    }
                } else {
                    i = -1;
                }
                zzbce zzbceVar = zzbcn.zzep;
                t tVar = t.f3437d;
                zzbcl zzbclVar = tVar.f3440c;
                zzbcl zzbclVar2 = tVar.f3440c;
                webResourceResponse = null;
                if (((Boolean) zzbclVar.zza(zzbceVar)).booleanValue()) {
                    zzbaxVarZza.zzi = zzfxf.zzc(this.zzc.zzr());
                    zzbaxVarZza.zzj = this.zzc.zzf();
                    try {
                        long jLongValue = (zzbaxVarZza.zzg ? (Long) zzbclVar2.zza(zzbcn.zzer) : (Long) zzbclVar2.zza(zzbcn.zzeq)).longValue();
                        p pVar = p.C;
                        pVar.f2983j.getClass();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        Future futureZza = zzbbi.zza(this.zzc.getContext(), zzbaxVarZza);
                        try {
                            zzbbj zzbbjVar = (zzbbj) futureZza.get(jLongValue, TimeUnit.MILLISECONDS);
                            try {
                                try {
                                    map3.put("X-Afma-Gcache-HasAdditionalMetadataFromReadV2", Boolean.toString(zzbbjVar.zzd()));
                                    map3.put("X-Afma-Gcache-IsGcacheHit", Boolean.toString(zzbbjVar.zzf()));
                                    map3.put("X-Afma-Gcache-IsDownloaded", Boolean.toString(zzbbjVar.zze()));
                                    map3.put("X-Afma-Gcache-CachedBytes", Long.toString(zzbbjVar.zza()));
                                    inputStreamZzc = zzbbjVar.zzc();
                                    if (i != -1) {
                                        try {
                                            inputStreamZzc = zzgce.zza(inputStreamZzc, i);
                                        } catch (InterruptedException e) {
                                            e = e;
                                            z11 = true;
                                            if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzeu)).booleanValue()) {
                                                p.C.f2982g.zzw(e, "AdWebViewClient.interceptRequest.gcache");
                                            }
                                            futureZza.cancel(true);
                                            Thread.currentThread().interrupt();
                                            p.C.f2983j.getClass();
                                            final long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                                            r0.f5068l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfo
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    this.zza.zzo(z11, jElapsedRealtime2);
                                                }
                                            });
                                            str2 = "Cache connection took " + jElapsedRealtime2 + "ms";
                                        } catch (ExecutionException e4) {
                                            e = e4;
                                            z10 = true;
                                            if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzeu)).booleanValue()) {
                                                p.C.f2982g.zzw(e, "AdWebViewClient.interceptRequest.gcache");
                                            }
                                            futureZza.cancel(true);
                                            p.C.f2983j.getClass();
                                            final long jElapsedRealtime3 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                                            r0.f5068l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfo
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    this.zza.zzo(z10, jElapsedRealtime3);
                                                }
                                            });
                                            str2 = "Cache connection took " + jElapsedRealtime3 + "ms";
                                        } catch (TimeoutException e10) {
                                            e = e10;
                                            z10 = true;
                                            if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzeu)).booleanValue()) {
                                                p.C.f2982g.zzw(e, "AdWebViewClient.interceptRequest.gcache");
                                            }
                                            futureZza.cancel(true);
                                            p.C.f2983j.getClass();
                                            final long jElapsedRealtime4 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                                            r0.f5068l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfo
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    this.zza.zzo(z10, jElapsedRealtime4);
                                                }
                                            });
                                            str2 = "Cache connection took " + jElapsedRealtime4 + "ms";
                                        }
                                    }
                                    pVar.f2983j.getClass();
                                    final long jElapsedRealtime5 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                                    final boolean z12 = true;
                                    r0.f5068l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfo
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            this.zza.zzo(z12, jElapsedRealtime5);
                                        }
                                    });
                                    str2 = "Cache connection took " + jElapsedRealtime5 + "ms";
                                } catch (Throwable th) {
                                    th = th;
                                    z4 = 1;
                                    p.C.f2983j.getClass();
                                    final long jElapsedRealtime6 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                                    r0.f5068l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfo
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            this.zza.zzo(z4, jElapsedRealtime6);
                                        }
                                    });
                                    k0.k("Cache connection took " + jElapsedRealtime6 + "ms");
                                    throw th;
                                }
                            } catch (InterruptedException e11) {
                                e = e11;
                                inputStreamZzc = null;
                            } catch (ExecutionException e12) {
                                e = e12;
                                inputStreamZzc = null;
                                z10 = true;
                                if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzeu)).booleanValue()) {
                                    p.C.f2982g.zzw(e, "AdWebViewClient.interceptRequest.gcache");
                                }
                                futureZza.cancel(true);
                                p.C.f2983j.getClass();
                                final long jElapsedRealtime7 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                                r0.f5068l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfo
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        this.zza.zzo(z10, jElapsedRealtime7);
                                    }
                                });
                                str2 = "Cache connection took " + jElapsedRealtime7 + "ms";
                                k0.k(str2);
                                inputStream = inputStreamZzc;
                                if (inputStream != null) {
                                    return new WebResourceResponse("", "", 200, "OK", map3, inputStream);
                                }
                                if (g.c()) {
                                }
                            } catch (TimeoutException e13) {
                                e = e13;
                                inputStreamZzc = null;
                                z10 = true;
                                if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzeu)).booleanValue()) {
                                    p.C.f2982g.zzw(e, "AdWebViewClient.interceptRequest.gcache");
                                }
                                futureZza.cancel(true);
                                p.C.f2983j.getClass();
                                final long jElapsedRealtime8 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                                r0.f5068l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfo
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        this.zza.zzo(z10, jElapsedRealtime8);
                                    }
                                });
                                str2 = "Cache connection took " + jElapsedRealtime8 + "ms";
                                k0.k(str2);
                                inputStream = inputStreamZzc;
                                if (inputStream != null) {
                                    return new WebResourceResponse("", "", 200, "OK", map3, inputStream);
                                }
                                if (g.c()) {
                                }
                            }
                        } catch (InterruptedException e14) {
                            e = e14;
                            inputStreamZzc = null;
                            z11 = false;
                        } catch (ExecutionException e15) {
                            e = e15;
                            inputStreamZzc = null;
                            z10 = false;
                            if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzeu)).booleanValue()) {
                                p.C.f2982g.zzw(e, "AdWebViewClient.interceptRequest.gcache");
                            }
                            futureZza.cancel(true);
                            p.C.f2983j.getClass();
                            final long jElapsedRealtime9 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                            r0.f5068l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfo
                                @Override // java.lang.Runnable
                                public final void run() {
                                    this.zza.zzo(z10, jElapsedRealtime9);
                                }
                            });
                            str2 = "Cache connection took " + jElapsedRealtime9 + "ms";
                            k0.k(str2);
                            inputStream = inputStreamZzc;
                            if (inputStream != null) {
                                return new WebResourceResponse("", "", 200, "OK", map3, inputStream);
                            }
                            if (g.c()) {
                            }
                        } catch (TimeoutException e16) {
                            e = e16;
                            inputStreamZzc = null;
                            z10 = false;
                            if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzeu)).booleanValue()) {
                                p.C.f2982g.zzw(e, "AdWebViewClient.interceptRequest.gcache");
                            }
                            futureZza.cancel(true);
                            p.C.f2983j.getClass();
                            final long jElapsedRealtime10 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                            r0.f5068l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfo
                                @Override // java.lang.Runnable
                                public final void run() {
                                    this.zza.zzo(z10, jElapsedRealtime10);
                                }
                            });
                            str2 = "Cache connection took " + jElapsedRealtime10 + "ms";
                            k0.k(str2);
                            inputStream = inputStreamZzc;
                            if (inputStream != null) {
                                return new WebResourceResponse("", "", 200, "OK", map3, inputStream);
                            }
                            if (g.c()) {
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            z4 = 0;
                        }
                        k0.k(str2);
                    } catch (Throwable th3) {
                        th = th3;
                        z4 = zzbclVar2;
                    }
                } else {
                    zzbau zzbauVarZzb = p.C.i.zzb(zzbaxVarZza);
                    if (zzbauVarZzb == null || !zzbauVarZzb.zze()) {
                        inputStream = null;
                    } else {
                        map3.put("X-Afma-Gcache-HasAdditionalMetadataFromReadV2", Boolean.toString(zzbauVarZzb.zzd()));
                        map3.put("X-Afma-Gcache-IsGcacheHit", Boolean.toString(zzbauVarZzb.zzg()));
                        map3.put("X-Afma-Gcache-IsDownloaded", Boolean.toString(zzbauVarZzb.zzf()));
                        map3.put("X-Afma-Gcache-CachedBytes", Long.toString(zzbauVarZzb.zza()));
                        inputStreamZzc = zzbauVarZzb.zzc();
                        if (i != -1) {
                            inputStreamZzc = zzgce.zza(inputStreamZzc, i);
                        }
                    }
                    if (inputStream != null) {
                        return new WebResourceResponse("", "", 200, "OK", map3, inputStream);
                    }
                }
                inputStream = inputStreamZzc;
                if (inputStream != null) {
                    return new WebResourceResponse("", "", 200, "OK", map3, inputStream);
                }
            } else {
                webResourceResponse = null;
            }
            return (g.c() || !((Boolean) zzbej.zzb.zze()).booleanValue()) ? webResourceResponse : zzW(str, map);
        } catch (Exception e17) {
            e = e17;
            p.C.f2982g.zzw(e, "AdWebViewClient.interceptRequest");
            return zzV();
        } catch (NoClassDefFoundError e18) {
            e = e18;
            p.C.f2982g.zzw(e, "AdWebViewClient.interceptRequest");
            return zzV();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchc
    public final b zzd() {
        return this.zzy;
    }

    @Override // com.google.android.gms.internal.ads.zzdel
    public final void zzdG() {
        zzdel zzdelVar = this.zzm;
        if (zzdelVar != null) {
            zzdelVar.zzdG();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdel
    public final void zzdf() {
        zzdel zzdelVar = this.zzm;
        if (zzdelVar != null) {
            zzdelVar.zzdf();
        }
    }

    public final void zzg() {
        if (this.zzi != null && ((this.zzA && this.zzC <= 0) || this.zzB || this.zzo)) {
            if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzbW)).booleanValue() && this.zzc.zzm() != null) {
                zzbcu.zza(this.zzc.zzm().zza(), this.zzc.zzk(), "awfllc");
            }
            zzcha zzchaVar = this.zzi;
            boolean z4 = false;
            if (!this.zzB && !this.zzo) {
                z4 = true;
            }
            zzchaVar.zza(z4, this.zzp, this.zzq, this.zzr);
            this.zzi = null;
        }
        this.zzc.zzaf();
    }

    public final void zzh() {
        zzbyh zzbyhVar = this.zza;
        if (zzbyhVar != null) {
            zzbyhVar.zze();
            this.zza = null;
        }
        zzY();
        synchronized (this.zzf) {
            try {
                this.zze.clear();
                this.zzg = null;
                this.zzh = null;
                this.zzi = null;
                this.zzj = null;
                this.zzk = null;
                this.zzl = null;
                this.zzn = false;
                this.zzs = false;
                this.zzt = false;
                this.zzu = false;
                this.zzw = null;
                this.zzy = null;
                this.zzx = null;
                zzbse zzbseVar = this.zzz;
                if (zzbseVar != null) {
                    zzbseVar.zza(true);
                    this.zzz = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzi(boolean z4) {
        this.zzD = z4;
    }

    @Override // com.google.android.gms.internal.ads.zzchc
    public final void zzj(Uri uri) {
        k0.k("Received GMSG: ".concat(String.valueOf(uri)));
        HashMap map = this.zze;
        String path = uri.getPath();
        List list = (List) map.get(path);
        if (path == null || list == null) {
            k0.k("No GMSG handler found for GMSG: ".concat(String.valueOf(uri)));
            if (!((Boolean) t.f3437d.f3440c.zza(zzbcn.zzgC)).booleanValue() || p.C.f2982g.zzg() == null) {
                return;
            }
            final String strSubstring = (path == null || path.length() < 2) ? "null" : path.substring(1);
            zzcaj.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfn
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    int i = zzcfs.zzb;
                    p.C.f2982g.zzg().zze(strSubstring);
                }
            });
            return;
        }
        String encodedQuery = uri.getEncodedQuery();
        zzbce zzbceVar = zzbcn.zzfC;
        t tVar = t.f3437d;
        if (((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue() && this.zzE.contains(path) && encodedQuery != null) {
            if (encodedQuery.length() >= ((Integer) tVar.f3440c.zza(zzbcn.zzfE)).intValue()) {
                k0.k("Parsing gmsg query params on BG thread: ".concat(path));
                r0 r0Var = p.C.f2979c;
                r0Var.getClass();
                zzgei.zzr(zzgei.zzj(new m(uri, 1), r0Var.f5076k), new zzcfq(this, list, path, uri), zzcaj.zze);
                return;
            }
        }
        r0 r0Var2 = p.C.f2979c;
        zzX(r0.l(uri), list, path);
    }

    @Override // com.google.android.gms.internal.ads.zzchc
    public final void zzk() {
        zzbbl zzbblVar = this.zzd;
        if (zzbblVar != null) {
            zzbblVar.zzc(10005);
        }
        this.zzB = true;
        this.zzp = 10004;
        this.zzq = "Page loaded delay cancel.";
        zzg();
        this.zzc.destroy();
    }

    @Override // com.google.android.gms.internal.ads.zzchc
    public final void zzl() {
        synchronized (this.zzf) {
        }
        this.zzC++;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzchc
    public final void zzm() {
        this.zzC--;
        zzg();
    }

    public final void zzn() {
        this.zzc.zzad();
        i iVarZzL = this.zzc.zzL();
        if (iVarZzL != null) {
            iVarZzL.f4205v.removeView(iVarZzL.e);
            iVarZzL.M(true);
        }
    }

    public final /* synthetic */ void zzo(boolean z4, long j4) {
        this.zzc.zzv(z4, j4);
    }

    public final /* synthetic */ void zzp(View view, zzbyh zzbyhVar, int i) {
        zzZ(view, zzbyhVar, i - 1);
    }

    @Override // com.google.android.gms.internal.ads.zzchc
    public final void zzq(int i, int i10, boolean z4) {
        zzbsj zzbsjVar = this.zzx;
        if (zzbsjVar != null) {
            zzbsjVar.zzb(i, i10);
        }
        zzbse zzbseVar = this.zzz;
        if (zzbseVar != null) {
            zzbseVar.zzd(i, i10, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchc
    public final void zzr() {
        zzbyh zzbyhVar = this.zza;
        if (zzbyhVar != null) {
            WebView webViewZzG = this.zzc.zzG();
            WeakHashMap weakHashMap = v0.f7946a;
            if (g0.b(webViewZzG)) {
                zzZ(webViewZzG, zzbyhVar, 10);
                return;
            }
            zzY();
            zzcfp zzcfpVar = new zzcfp(this, zzbyhVar);
            this.zzG = zzcfpVar;
            ((View) this.zzc).addOnAttachStateChangeListener(zzcfpVar);
        }
    }

    public final void zzu(e eVar, boolean z4, boolean z10) {
        zzcfk zzcfkVar = this.zzc;
        boolean zZzaF = zzcfkVar.zzaF();
        boolean z11 = zzab(zZzaF, zzcfkVar) || z10;
        boolean z12 = z11 || !z4;
        e6.a aVar = z11 ? null : this.zzg;
        l lVar = zZzaF ? null : this.zzh;
        c cVar = this.zzw;
        zzcfk zzcfkVar2 = this.zzc;
        zzx(new AdOverlayInfoParcel(eVar, aVar, lVar, cVar, zzcfkVar2.zzn(), zzcfkVar2, z12 ? null : this.zzm));
    }

    public final void zzv(String str, String str2, int i) {
        zzeea zzeeaVar = this.zzF;
        zzcfk zzcfkVar = this.zzc;
        zzx(new AdOverlayInfoParcel(zzcfkVar, zzcfkVar.zzn(), str, str2, zzeeaVar));
    }

    public final void zzw(boolean z4, int i, boolean z10) {
        zzcfk zzcfkVar = this.zzc;
        boolean zZzab = zzab(zzcfkVar.zzaF(), zzcfkVar);
        boolean z11 = true;
        if (!zZzab && z10) {
            z11 = false;
        }
        e6.a aVar = zZzab ? null : this.zzg;
        l lVar = this.zzh;
        c cVar = this.zzw;
        zzcfk zzcfkVar2 = this.zzc;
        zzx(new AdOverlayInfoParcel(aVar, lVar, cVar, zzcfkVar2, z4, i, zzcfkVar2.zzn(), z11 ? null : this.zzm, zzaa(this.zzc) ? this.zzF : null));
    }

    public final void zzx(AdOverlayInfoParcel adOverlayInfoParcel) {
        e eVar;
        zzbse zzbseVar = this.zzz;
        boolean zZzf = zzbseVar != null ? zzbseVar.zzf() : false;
        b9.e eVar2 = p.C.f2978b;
        b9.e.y(this.zzc.getContext(), adOverlayInfoParcel, !zZzf);
        zzbyh zzbyhVar = this.zza;
        if (zzbyhVar != null) {
            String str = adOverlayInfoParcel.f1973w;
            if (str == null && (eVar = adOverlayInfoParcel.f1963a) != null) {
                str = eVar.f4184b;
            }
            zzbyhVar.zzh(str);
        }
    }

    public final void zzy(boolean z4, int i, String str, String str2, boolean z10) {
        zzcfk zzcfkVar = this.zzc;
        boolean zZzaF = zzcfkVar.zzaF();
        boolean zZzab = zzab(zZzaF, zzcfkVar);
        boolean z11 = true;
        if (!zZzab && z10) {
            z11 = false;
        }
        e6.a aVar = zZzab ? null : this.zzg;
        zzcfr zzcfrVar = zZzaF ? null : new zzcfr(this.zzc, this.zzh);
        zzbih zzbihVar = this.zzk;
        zzbij zzbijVar = this.zzl;
        c cVar = this.zzw;
        zzcfk zzcfkVar2 = this.zzc;
        zzx(new AdOverlayInfoParcel(aVar, zzcfrVar, zzbihVar, zzbijVar, cVar, zzcfkVar2, z4, i, str, str2, zzcfkVar2.zzn(), z11 ? null : this.zzm, zzaa(this.zzc) ? this.zzF : null));
    }

    public final void zzz(boolean z4, int i, String str, boolean z10, boolean z11) {
        zzcfk zzcfkVar = this.zzc;
        boolean zZzaF = zzcfkVar.zzaF();
        boolean zZzab = zzab(zZzaF, zzcfkVar);
        boolean z12 = true;
        if (!zZzab && z10) {
            z12 = false;
        }
        e6.a aVar = zZzab ? null : this.zzg;
        zzcfr zzcfrVar = zZzaF ? null : new zzcfr(this.zzc, this.zzh);
        zzbih zzbihVar = this.zzk;
        zzbij zzbijVar = this.zzl;
        c cVar = this.zzw;
        zzcfk zzcfkVar2 = this.zzc;
        zzx(new AdOverlayInfoParcel(aVar, zzcfrVar, zzbihVar, zzbijVar, cVar, zzcfkVar2, z4, i, str, zzcfkVar2.zzn(), z12 ? null : this.zzm, zzaa(this.zzc) ? this.zzF : null, z11));
    }
}
