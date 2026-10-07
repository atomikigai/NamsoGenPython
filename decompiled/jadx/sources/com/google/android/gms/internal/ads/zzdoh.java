package com.google.android.gms.internal.ads;

import e6.t;
import g6.c;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdoh {
    private final zzcwk zza;
    private final zzcxt zzb;
    private final zzcyg zzc;
    private final zzcys zzd;
    private final zzdbi zze;
    private final zzdej zzf;
    private final zzdsm zzg;
    private final zzflr zzh;
    private final zzedp zzi;
    private final zzcnb zzj;

    public zzdoh(zzcwk zzcwkVar, zzcxt zzcxtVar, zzcyg zzcygVar, zzcys zzcysVar, zzdbi zzdbiVar, zzdej zzdejVar, zzdsm zzdsmVar, zzflr zzflrVar, zzedp zzedpVar, zzcnb zzcnbVar) {
        this.zza = zzcwkVar;
        this.zzb = zzcxtVar;
        this.zzc = zzcygVar;
        this.zzd = zzcysVar;
        this.zze = zzdbiVar;
        this.zzf = zzdejVar;
        this.zzg = zzdsmVar;
        this.zzh = zzflrVar;
        this.zzi = zzedpVar;
        this.zzj = zzcnbVar;
    }

    public final void zza(zzdoi zzdoiVar, zzcfk zzcfkVar) throws Throwable {
        zzdof zzdofVar = zzdoiVar.zza;
        final zzcxt zzcxtVar = this.zzb;
        Objects.requireNonNull(zzcxtVar);
        zzdofVar.zzi(this.zza, this.zzc, this.zzd, this.zze, new c() { // from class: com.google.android.gms.internal.ads.zzdog
            @Override // g6.c
            public final void zzg() {
                zzcxtVar.zzb();
            }
        }, this.zzf);
        if (!((Boolean) t.f3437d.f3440c.zza(zzbcn.zzjO)).booleanValue() || zzcfkVar == null || zzcfkVar.zzN() == null) {
            return;
        }
        zzchc zzchcVarZzN = zzcfkVar.zzN();
        zzchcVarZzN.zzJ(this.zzj, this.zzi, this.zzh);
        zzchcVarZzN.zzL(this.zzj, this.zzi, this.zzg);
    }
}
