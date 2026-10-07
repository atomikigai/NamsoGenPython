package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzcjn implements zzdto {
    private final Long zza;
    private final String zzb;
    private final zzciy zzc;
    private final zzcjp zzd;

    public /* synthetic */ zzcjn(zzciy zzciyVar, zzcjp zzcjpVar, Long l2, String str, zzckd zzckdVar) {
        this.zzc = zzciyVar;
        this.zzd = zzcjpVar;
        this.zza = l2;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzdto
    public final zzdty zza() {
        zzcjp zzcjpVar = this.zzd;
        return zzdtz.zza(this.zza.longValue(), zzcjpVar.zza, zzdts.zzc(zzcjpVar.zzb), this.zzc, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzdto
    public final zzduc zzb() {
        zzcjp zzcjpVar = this.zzd;
        return zzdud.zza(this.zza.longValue(), zzcjpVar.zza, zzdts.zzc(zzcjpVar.zzb), this.zzc, this.zzb);
    }
}
