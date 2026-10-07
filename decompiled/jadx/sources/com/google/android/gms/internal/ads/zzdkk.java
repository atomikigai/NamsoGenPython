package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.view.View;
import e6.q3;
import i6.h;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdkk {
    private final zzdpn zza;
    private final zzdoc zzb;
    private final zzcoi zzc;
    private final zzdjg zzd;

    public zzdkk(zzdpn zzdpnVar, zzdoc zzdocVar, zzcoi zzcoiVar, zzdjg zzdjgVar) {
        this.zza = zzdpnVar;
        this.zzb = zzdocVar;
        this.zzc = zzcoiVar;
        this.zzd = zzdjgVar;
    }

    public final View zza() throws zzcfw {
        zzcfk zzcfkVarZza = this.zza.zza(q3.h(), null, null);
        zzcfkVarZza.zzF().setVisibility(8);
        zzcfkVarZza.zzag("/sendMessageToSdk", new zzbjr() { // from class: com.google.android.gms.internal.ads.zzdkf
            @Override // com.google.android.gms.internal.ads.zzbjr
            public final void zza(Object obj, Map map) {
                this.zza.zzb((zzcfk) obj, map);
            }
        });
        zzcfkVarZza.zzag("/adMuted", new zzbjr() { // from class: com.google.android.gms.internal.ads.zzdkg
            @Override // com.google.android.gms.internal.ads.zzbjr
            public final void zza(Object obj, Map map) {
                this.zza.zzc((zzcfk) obj, map);
            }
        });
        this.zzb.zzm(new WeakReference(zzcfkVarZza), "/loadHtml", new zzbjr() { // from class: com.google.android.gms.internal.ads.zzdkh
            @Override // com.google.android.gms.internal.ads.zzbjr
            public final void zza(Object obj, final Map map) {
                zzcfk zzcfkVar = (zzcfk) obj;
                zzchc zzchcVarZzN = zzcfkVar.zzN();
                final zzdkk zzdkkVar = this.zza;
                zzchcVarZzN.zzB(new zzcha() { // from class: com.google.android.gms.internal.ads.zzdke
                    @Override // com.google.android.gms.internal.ads.zzcha
                    public final void zza(boolean z4, int i, String str, String str2) {
                        zzdkkVar.zzd(map, z4, i, str, str2);
                    }
                });
                String str = (String) map.get("overlayHtml");
                String str2 = (String) map.get("baseUrl");
                if (TextUtils.isEmpty(str2)) {
                    zzcfkVar.loadData(str, "text/html", "UTF-8");
                } else {
                    zzcfkVar.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                }
            }
        });
        this.zzb.zzm(new WeakReference(zzcfkVarZza), "/showOverlay", new zzbjr() { // from class: com.google.android.gms.internal.ads.zzdki
            @Override // com.google.android.gms.internal.ads.zzbjr
            public final void zza(Object obj, Map map) {
                this.zza.zze((zzcfk) obj, map);
            }
        });
        this.zzb.zzm(new WeakReference(zzcfkVarZza), "/hideOverlay", new zzbjr() { // from class: com.google.android.gms.internal.ads.zzdkj
            @Override // com.google.android.gms.internal.ads.zzbjr
            public final void zza(Object obj, Map map) {
                this.zza.zzf((zzcfk) obj, map);
            }
        });
        return zzcfkVarZza.zzF();
    }

    public final /* synthetic */ void zzb(zzcfk zzcfkVar, Map map) {
        this.zzb.zzj("sendMessageToNativeJs", map);
    }

    public final /* synthetic */ void zzc(zzcfk zzcfkVar, Map map) {
        this.zzd.zzg();
    }

    public final /* synthetic */ void zzd(Map map, boolean z4, int i, String str, String str2) {
        HashMap map2 = new HashMap();
        map2.put("messageType", "htmlLoaded");
        map2.put("id", (String) map.get("id"));
        this.zzb.zzj("sendMessageToNativeJs", map2);
    }

    public final /* synthetic */ void zze(zzcfk zzcfkVar, Map map) {
        h.f("Showing native ads overlay.");
        zzcfkVar.zzF().setVisibility(0);
        this.zzc.zze(true);
    }

    public final /* synthetic */ void zzf(zzcfk zzcfkVar, Map map) {
        h.f("Hiding native ads overlay.");
        zzcfkVar.zzF().setVisibility(8);
        this.zzc.zze(false);
    }
}
