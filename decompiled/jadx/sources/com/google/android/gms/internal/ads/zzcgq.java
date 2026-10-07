package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import h6.k0;
import h6.r0;
import i6.h;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcgq {
    private final zzcgr zza;
    private final zzcgp zzb;

    public zzcgq(zzcgr zzcgrVar, zzcgp zzcgpVar) {
        this.zzb = zzcgpVar;
        this.zza = zzcgrVar;
    }

    @JavascriptInterface
    public String getClickSignals(String str) {
        if (TextUtils.isEmpty(str)) {
            k0.k("Click string is empty, not proceeding.");
            return "";
        }
        zzavc zzavcVarZzI = ((zzcgx) this.zza).zzI();
        if (zzavcVarZzI == null) {
            k0.k("Signal utils is empty, ignoring.");
            return "";
        }
        zzaux zzauxVarZzc = zzavcVarZzI.zzc();
        if (zzauxVarZzc == null) {
            k0.k("Signals object is empty, ignoring.");
            return "";
        }
        if (this.zza.getContext() == null) {
            k0.k("Context is null, ignoring.");
            return "";
        }
        zzcgr zzcgrVar = this.zza;
        return zzauxVarZzc.zze(zzcgrVar.getContext(), str, ((zzcgz) zzcgrVar).zzF(), this.zza.zzi());
    }

    @JavascriptInterface
    public String getViewSignals() {
        zzavc zzavcVarZzI = ((zzcgx) this.zza).zzI();
        if (zzavcVarZzI == null) {
            k0.k("Signal utils is empty, ignoring.");
            return "";
        }
        zzaux zzauxVarZzc = zzavcVarZzI.zzc();
        if (zzauxVarZzc == null) {
            k0.k("Signals object is empty, ignoring.");
            return "";
        }
        if (this.zza.getContext() == null) {
            k0.k("Context is null, ignoring.");
            return "";
        }
        zzcgr zzcgrVar = this.zza;
        return zzauxVarZzc.zzh(zzcgrVar.getContext(), ((zzcgz) zzcgrVar).zzF(), this.zza.zzi());
    }

    @JavascriptInterface
    public void notify(final String str) {
        if (TextUtils.isEmpty(str)) {
            h.g("URL is empty, ignoring message");
        } else {
            r0.f5068l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgo
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zza(str);
                }
            });
        }
    }

    public final /* synthetic */ void zza(String str) {
        Uri uri = Uri.parse(str);
        zzcfs zzcfsVarZzaO = ((zzcgj) this.zzb.zza).zzaO();
        if (zzcfsVarZzaO == null) {
            h.d("Unable to pass GMSG, no AdWebViewClient for AdWebView!");
        } else {
            zzcfsVarZzaO.zzj(uri);
        }
    }
}
