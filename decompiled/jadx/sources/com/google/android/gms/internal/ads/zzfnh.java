package com.google.android.gms.internal.ads;

import android.view.View;
import android.webkit.WebView;
import androidx.webkit.ProxyConfig;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewFeature;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Timer;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfnh {
    private final zzfnj zza;
    private final WebView zzb;
    private final HashMap zzc = new HashMap();
    private final zzfnv zzd = new zzfnv();

    private zzfnh(zzfnj zzfnjVar, WebView webView, boolean z4) {
        zzfor.zza();
        this.zza = zzfnjVar;
        this.zzb = webView;
        if (!WebViewFeature.isFeatureSupported(WebViewFeature.WEB_MESSAGE_LISTENER)) {
            throw new UnsupportedOperationException("The JavaScriptSessionService cannot be supported in this WebView version.");
        }
        zzg();
        WebViewCompat.addWebMessageListener(webView, "omidJsSessionService", new HashSet(Arrays.asList(ProxyConfig.MATCH_ALL_SCHEMES)), new zzfng(this));
    }

    public static zzfnh zza(zzfnj zzfnjVar, WebView webView, boolean z4) {
        return new zzfnh(zzfnjVar, webView, true);
    }

    public static /* bridge */ /* synthetic */ void zzb(zzfnh zzfnhVar, String str) {
        zzfmw zzfmwVar = (zzfmw) zzfnhVar.zzc.get(str);
        if (zzfmwVar != null) {
            zzfmwVar.zzc();
            zzfnhVar.zzc.remove(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* bridge */ /* synthetic */ void zzd(zzfnh zzfnhVar, String str) {
        zzfnb zzfnbVar = zzfnb.DEFINED_BY_JAVASCRIPT;
        zzfne zzfneVar = zzfne.DEFINED_BY_JAVASCRIPT;
        zzfni zzfniVar = zzfni.JAVASCRIPT;
        zzfna zzfnaVar = new zzfna(zzfmx.zza(zzfnbVar, zzfneVar, zzfniVar, zzfniVar, false), zzfmy.zzb(zzfnhVar.zza, zzfnhVar.zzb, null, null), str);
        zzfnhVar.zzc.put(str, zzfnaVar);
        zzfnaVar.zzd(zzfnhVar.zzb);
        for (zzfnu zzfnuVar : zzfnhVar.zzd.zza()) {
            zzfnaVar.zzb((View) zzfnuVar.zzb().get(), zzfnuVar.zza(), zzfnuVar.zzc());
        }
        zzfnaVar.zze();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzg() {
        WebViewCompat.removeWebMessageListener(this.zzb, "omidJsSessionService");
    }

    public final void zze(View view, zzfnd zzfndVar, String str) {
        Iterator it = this.zzc.values().iterator();
        while (it.hasNext()) {
            ((zzfmw) it.next()).zzb(view, zzfndVar, "Ad overlay");
        }
        this.zzd.zzb(view, zzfndVar, "Ad overlay");
    }

    public final void zzf(zzcfz zzcfzVar) {
        Iterator it = this.zzc.values().iterator();
        while (it.hasNext()) {
            ((zzfmw) it.next()).zzc();
        }
        Timer timer = new Timer();
        timer.schedule(new zzfnf(this, zzcfzVar, timer), 1000L);
    }
}
