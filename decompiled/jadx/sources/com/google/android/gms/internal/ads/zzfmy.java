package com.google.android.gms.internal.ads;

import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfmy {
    private final zzfnj zza;
    private final WebView zzb;
    private final List zzc = new ArrayList();
    private final Map zzd = new HashMap();
    private final String zze;
    private final String zzf;
    private final zzfmz zzg;

    private zzfmy(zzfnj zzfnjVar, WebView webView, String str, List list, String str2, String str3, zzfmz zzfmzVar) {
        this.zza = zzfnjVar;
        this.zzb = webView;
        this.zzg = zzfmzVar;
        this.zzf = str2;
        this.zze = str3;
    }

    public static zzfmy zzb(zzfnj zzfnjVar, WebView webView, String str, String str2) {
        if (str2 != null) {
            zzfor.zzd(str2, 256, "CustomReferenceData is greater than 256 characters");
        }
        return new zzfmy(zzfnjVar, webView, null, null, str, str2, zzfmz.HTML);
    }

    public static zzfmy zzc(zzfnj zzfnjVar, WebView webView, String str, String str2) {
        zzfor.zzd("", 256, "CustomReferenceData is greater than 256 characters");
        return new zzfmy(zzfnjVar, webView, null, null, str, "", zzfmz.JAVASCRIPT);
    }

    public final WebView zza() {
        return this.zzb;
    }

    public final zzfmz zzd() {
        return this.zzg;
    }

    public final zzfnj zze() {
        return this.zza;
    }

    public final String zzf() {
        return this.zzf;
    }

    public final String zzg() {
        return this.zze;
    }

    public final List zzh() {
        return Collections.unmodifiableList(this.zzc);
    }

    public final Map zzi() {
        return Collections.unmodifiableMap(this.zzd);
    }
}
