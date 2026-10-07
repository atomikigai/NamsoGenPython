package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdoo implements zzbki {
    private final zzcxt zza;
    private final zzbwv zzb;
    private final String zzc;
    private final String zzd;

    public zzdoo(zzcxt zzcxtVar, zzfet zzfetVar) {
        this.zza = zzcxtVar;
        this.zzb = zzfetVar.zzl;
        this.zzc = zzfetVar.zzj;
        this.zzd = zzfetVar.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzbki
    public final void zza(zzbwv zzbwvVar) {
        int i;
        String str;
        zzbwv zzbwvVar2 = this.zzb;
        if (zzbwvVar2 != null) {
            zzbwvVar = zzbwvVar2;
        }
        if (zzbwvVar != null) {
            str = zzbwvVar.zza;
            i = zzbwvVar.zzb;
        } else {
            i = 1;
            str = "";
        }
        this.zza.zzd(new zzbwg(str, i), this.zzc, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzbki
    public final void zzb() {
        this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzbki
    public final void zzc() {
        this.zza.zzf();
    }
}
