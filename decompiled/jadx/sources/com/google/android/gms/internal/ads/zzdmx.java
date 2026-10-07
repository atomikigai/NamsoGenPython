package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import e6.t;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdmx {
    private final Executor zza;
    private final zzcoi zzb;
    private final zzdef zzc;
    private final zzcnb zzd;

    public zzdmx(Executor executor, zzcoi zzcoiVar, zzdef zzdefVar, zzcnb zzcnbVar) {
        this.zza = executor;
        this.zzc = zzdefVar;
        this.zzb = zzcoiVar;
        this.zzd = zzcnbVar;
    }

    public final void zza(final zzcfk zzcfkVar) {
        if (zzcfkVar == null) {
            return;
        }
        this.zzc.zza(zzcfkVar.zzF());
        this.zzc.zzo(new zzaym() { // from class: com.google.android.gms.internal.ads.zzdmt
            @Override // com.google.android.gms.internal.ads.zzaym
            public final void zzdp(zzayl zzaylVar) {
                zzchc zzchcVarZzN = zzcfkVar.zzN();
                Rect rect = zzaylVar.zzd;
                zzchcVarZzN.zzq(rect.left, rect.top, false);
            }
        }, this.zza);
        this.zzc.zzo(new zzaym() { // from class: com.google.android.gms.internal.ads.zzdmu
            @Override // com.google.android.gms.internal.ads.zzaym
            public final void zzdp(zzayl zzaylVar) {
                HashMap map = new HashMap();
                map.put("isVisible", true != zzaylVar.zzj ? "0" : "1");
                zzcfkVar.zzd("onAdVisibilityChanged", map);
            }
        }, this.zza);
        this.zzc.zzo(this.zzb, this.zza);
        this.zzb.zzf(zzcfkVar);
        zzchc zzchcVarZzN = zzcfkVar.zzN();
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzjN)).booleanValue() && zzchcVarZzN != null) {
            zzchcVarZzN.zzK(this.zzd);
            zzchcVarZzN.zzL(this.zzd, null, null);
        }
        zzcfkVar.zzag("/trackActiveViewUnit", new zzbjr() { // from class: com.google.android.gms.internal.ads.zzdmv
            @Override // com.google.android.gms.internal.ads.zzbjr
            public final void zza(Object obj, Map map) {
                this.zza.zzb((zzcfk) obj, map);
            }
        });
        zzcfkVar.zzag("/untrackActiveViewUnit", new zzbjr() { // from class: com.google.android.gms.internal.ads.zzdmw
            @Override // com.google.android.gms.internal.ads.zzbjr
            public final void zza(Object obj, Map map) {
                this.zza.zzc((zzcfk) obj, map);
            }
        });
    }

    public final /* synthetic */ void zzb(zzcfk zzcfkVar, Map map) {
        this.zzb.zzb();
    }

    public final /* synthetic */ void zzc(zzcfk zzcfkVar, Map map) {
        this.zzb.zza();
    }
}
