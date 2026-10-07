package com.google.android.gms.internal.ads;

import g6.c;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdny {
    private final zzcwk zza;
    private final zzcxt zzb;
    private final zzcyg zzc;
    private final zzcys zzd;
    private final zzdbi zze;
    private final zzfet zzf;
    private final zzfew zzg;
    private final zzcnb zzh;

    public zzdny(zzcwk zzcwkVar, zzcxt zzcxtVar, zzcyg zzcygVar, zzcys zzcysVar, zzdbi zzdbiVar, zzfet zzfetVar, zzfew zzfewVar, zzcnb zzcnbVar) {
        this.zza = zzcwkVar;
        this.zzb = zzcxtVar;
        this.zzc = zzcygVar;
        this.zzd = zzcysVar;
        this.zze = zzdbiVar;
        this.zzf = zzfetVar;
        this.zzg = zzfewVar;
        this.zzh = zzcnbVar;
    }

    public final void zza(zzdoc zzdocVar) {
        final zzcxt zzcxtVar = this.zzb;
        zzdnp zzdnpVar = zzdocVar.zza;
        Objects.requireNonNull(zzcxtVar);
        zzdnpVar.zzh(this.zza, this.zzc, this.zzd, this.zze, new c() { // from class: com.google.android.gms.internal.ads.zzdnx
            @Override // g6.c
            public final void zzg() {
                zzcxtVar.zzb();
            }
        });
        zzdocVar.zzh(this.zzf, this.zzg, this.zzh);
    }
}
