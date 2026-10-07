package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;
import android.webkit.WebView;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzazj implements Runnable {
    final ValueCallback zza = new ValueCallback() { // from class: com.google.android.gms.internal.ads.zzazi
        @Override // android.webkit.ValueCallback
        public final void onReceiveValue(Object obj) {
            zzazj zzazjVar = this.zza;
            zzazjVar.zze.zzc(zzazjVar.zzb, zzazjVar.zzc, (String) obj, zzazjVar.zzd);
        }
    };
    final /* synthetic */ zzazb zzb;
    final /* synthetic */ WebView zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ zzazl zze;

    public zzazj(zzazl zzazlVar, zzazb zzazbVar, WebView webView, boolean z4) {
        this.zzb = zzazbVar;
        this.zzc = webView;
        this.zzd = z4;
        this.zze = zzazlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zzc.getSettings().getJavaScriptEnabled()) {
            try {
                this.zzc.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", this.zza);
            } catch (Throwable unused) {
                this.zza.onReceiveValue("");
            }
        }
    }
}
