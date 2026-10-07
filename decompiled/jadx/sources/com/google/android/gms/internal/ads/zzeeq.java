package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import d6.p;
import e6.t;
import i6.h;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzeeq implements zzeer {
    public static /* synthetic */ zzeew zzc(String str, String str2, String str3, zzees zzeesVar, String str4, WebView webView, String str5, String str6, zzeet zzeetVar) {
        zzfnj zzfnjVarZza = zzfnj.zza("Google", str2);
        zzfni zzfniVarZzp = zzp("javascript");
        zzfnb zzfnbVarZzn = zzn(zzeesVar.toString());
        zzfni zzfniVar = zzfni.NONE;
        if (zzfniVarZzp == zzfniVar) {
            h.g("Omid html session error; Unable to parse impression owner: javascript");
            return null;
        }
        if (zzfnbVarZzn == null) {
            h.g("Omid html session error; Unable to parse creative type: ".concat(String.valueOf(zzeesVar)));
            return null;
        }
        zzfni zzfniVarZzp2 = zzp(str4);
        if (zzfnbVarZzn == zzfnb.VIDEO && zzfniVarZzp2 == zzfniVar) {
            h.g("Omid html session error; Video events owner unknown for video creative: ".concat(String.valueOf(str4)));
            return null;
        }
        zzfmy zzfmyVarZzb = zzfmy.zzb(zzfnjVarZza, webView, str5, "");
        return new zzeew(zzfmw.zza(zzfmx.zza(zzfnbVarZzn, zzo(zzeetVar.toString()), zzfniVarZzp, zzfniVarZzp2, true), zzfmyVarZzb), zzfmyVarZzb);
    }

    public static /* synthetic */ zzeew zzd(String str, String str2, String str3, String str4, zzees zzeesVar, WebView webView, String str5, String str6, zzeet zzeetVar) {
        zzfnj zzfnjVarZza = zzfnj.zza(str, str2);
        zzfni zzfniVarZzp = zzp("javascript");
        zzfni zzfniVarZzp2 = zzp(str4);
        zzfnb zzfnbVarZzn = zzn(zzeesVar.toString());
        zzfni zzfniVar = zzfni.NONE;
        if (zzfniVarZzp == zzfniVar) {
            h.g("Omid js session error; Unable to parse impression owner: javascript");
            return null;
        }
        if (zzfnbVarZzn == null) {
            h.g("Omid js session error; Unable to parse creative type: ".concat(String.valueOf(zzeesVar)));
            return null;
        }
        if (zzfnbVarZzn == zzfnb.VIDEO && zzfniVarZzp2 == zzfniVar) {
            h.g("Omid js session error; Video events owner unknown for video creative: ".concat(String.valueOf(str4)));
            return null;
        }
        zzfmy zzfmyVarZzc = zzfmy.zzc(zzfnjVarZza, webView, str5, "");
        return new zzeew(zzfmw.zza(zzfmx.zza(zzfnbVarZzn, zzo(zzeetVar.toString()), zzfniVarZzp, zzfniVarZzp2, true), zzfmyVarZzc), zzfmyVarZzc);
    }

    private static zzfnb zzn(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode == -382745961) {
            if (str.equals("htmlDisplay")) {
                return zzfnb.HTML_DISPLAY;
            }
            return null;
        }
        if (iHashCode == 112202875) {
            if (str.equals("video")) {
                return zzfnb.VIDEO;
            }
            return null;
        }
        if (iHashCode == 714893483 && str.equals("nativeDisplay")) {
            return zzfnb.NATIVE_DISPLAY;
        }
        return null;
    }

    private static zzfne zzo(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != -1104128070) {
            if (iHashCode != 1318088141) {
                if (iHashCode == 1988248512 && str.equals("onePixel")) {
                    return zzfne.ONE_PIXEL;
                }
            } else if (str.equals("definedByJavascript")) {
                return zzfne.DEFINED_BY_JAVASCRIPT;
            }
        } else if (str.equals("beginToRender")) {
            return zzfne.BEGIN_TO_RENDER;
        }
        return zzfne.UNSPECIFIED;
    }

    private static zzfni zzp(String str) {
        if ("native".equals(str)) {
            return zzfni.NATIVE;
        }
        return "javascript".equals(str) ? zzfni.JAVASCRIPT : zzfni.NONE;
    }

    private static final Object zzq(zzeep zzeepVar) {
        try {
            return zzeepVar.zza();
        } catch (RuntimeException e) {
            p.C.f2982g.zzv(e, "omid exception");
            return null;
        }
    }

    private static final void zzr(Runnable runnable) {
        try {
            runnable.run();
        } catch (RuntimeException e) {
            p.C.f2982g.zzv(e, "omid exception");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeer
    public final zzeew zza(final String str, final WebView webView, String str2, String str3, final String str4, final zzeet zzeetVar, final zzees zzeesVar, final String str5) {
        if (!((Boolean) t.f3437d.f3440c.zza(zzbcn.zzfb)).booleanValue() || !zzfmu.zzb()) {
            return null;
        }
        final String str6 = "javascript";
        final String str7 = "Google";
        final String str8 = "";
        return (zzeew) zzq(new zzeep(str7, str, str6, zzeesVar, str4, webView, str5, str8, zzeetVar) { // from class: com.google.android.gms.internal.ads.zzeef
            public final /* synthetic */ String zzb;
            public final /* synthetic */ zzees zzd;
            public final /* synthetic */ String zze;
            public final /* synthetic */ WebView zzf;
            public final /* synthetic */ String zzg;
            public final /* synthetic */ zzeet zzi;
            public final /* synthetic */ String zza = "Google";
            public final /* synthetic */ String zzc = "javascript";
            public final /* synthetic */ String zzh = "";

            {
                this.zzb = str;
                this.zzd = zzeesVar;
                this.zze = str4;
                this.zzf = webView;
                this.zzg = str5;
                this.zzi = zzeetVar;
            }

            @Override // com.google.android.gms.internal.ads.zzeep
            public final Object zza() {
                return zzeeq.zzc(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeer
    public final zzeew zzb(final String str, final WebView webView, String str2, String str3, final String str4, final String str5, final zzeet zzeetVar, final zzees zzeesVar, final String str6) {
        if (!((Boolean) t.f3437d.f3440c.zza(zzbcn.zzfb)).booleanValue() || !zzfmu.zzb()) {
            return null;
        }
        final String str7 = "";
        final String str8 = "javascript";
        return (zzeew) zzq(new zzeep(str5, str, str8, str4, zzeesVar, webView, str6, str7, zzeetVar) { // from class: com.google.android.gms.internal.ads.zzeei
            public final /* synthetic */ String zza;
            public final /* synthetic */ String zzb;
            public final /* synthetic */ String zzd;
            public final /* synthetic */ zzees zze;
            public final /* synthetic */ WebView zzf;
            public final /* synthetic */ String zzg;
            public final /* synthetic */ zzeet zzi;
            public final /* synthetic */ String zzc = "javascript";
            public final /* synthetic */ String zzh = "";

            {
                this.zzd = str4;
                this.zze = zzeesVar;
                this.zzf = webView;
                this.zzg = str6;
                this.zzi = zzeetVar;
            }

            @Override // com.google.android.gms.internal.ads.zzeep
            public final Object zza() {
                return zzeeq.zzd(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeer
    public final zzfnh zze(final i6.a aVar, final WebView webView, boolean z4) {
        final boolean z10 = true;
        return (zzfnh) zzq(new zzeep(webView, z10) { // from class: com.google.android.gms.internal.ads.zzeen
            public final /* synthetic */ WebView zzb;

            @Override // com.google.android.gms.internal.ads.zzeep
            public final Object zza() {
                i6.a aVar2 = this.zza;
                return zzfnh.zza(zzfnj.zza("Google", aVar2.f5214b + "." + aVar2.f5215c), this.zzb, true);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeer
    public final String zzf(Context context) {
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzfb)).booleanValue()) {
            return (String) zzq(new zzeep() { // from class: com.google.android.gms.internal.ads.zzeel
                @Override // com.google.android.gms.internal.ads.zzeep
                public final Object zza() {
                    return "a.1.4.14-google_20240908";
                }
            });
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzeer
    public final void zzg(final zzfmw zzfmwVar, final View view) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeee
            @Override // java.lang.Runnable
            public final void run() {
                if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzfb)).booleanValue() && zzfmu.zzb()) {
                    zzfmwVar.zzb(view, zzfnd.NOT_VISIBLE, "Ad overlay");
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeer
    public final void zzh(final zzfnh zzfnhVar, final View view) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeek
            @Override // java.lang.Runnable
            public final void run() {
                zzfnhVar.zze(view, zzfnd.NOT_VISIBLE, "Ad overlay");
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeer
    public final void zzi(final zzfmw zzfmwVar) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeeo
            @Override // java.lang.Runnable
            public final void run() {
                if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzfb)).booleanValue() && zzfmu.zzb()) {
                    zzfmwVar.zzc();
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeer
    public final void zzj(final zzfmw zzfmwVar, final View view) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeeg
            @Override // java.lang.Runnable
            public final void run() {
                if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzfb)).booleanValue() && zzfmu.zzb()) {
                    zzfmwVar.zzd(view);
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeer
    public final void zzk(final zzfmw zzfmwVar) {
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzfb)).booleanValue() && zzfmu.zzb()) {
            Objects.requireNonNull(zzfmwVar);
            zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeeh
                @Override // java.lang.Runnable
                public final void run() {
                    zzfmwVar.zze();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeer
    public final boolean zzl(final Context context) {
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzfb)).booleanValue()) {
            Boolean bool = (Boolean) zzq(new zzeep() { // from class: com.google.android.gms.internal.ads.zzeej
                @Override // com.google.android.gms.internal.ads.zzeep
                public final Object zza() {
                    if (zzfmu.zzb()) {
                        return Boolean.TRUE;
                    }
                    zzfmu.zza(context);
                    return Boolean.valueOf(zzfmu.zzb());
                }
            });
            return bool != null && bool.booleanValue();
        }
        h.g("Omid flag is disabled");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzeer
    public final void zzm(final zzfnh zzfnhVar, final zzcfz zzcfzVar) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeem
            @Override // java.lang.Runnable
            public final void run() {
                zzfnhVar.zzf(zzcfzVar);
            }
        });
    }
}
