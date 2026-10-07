package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzcjm implements zzdtn {
    private final zzciy zza;
    private final zzcjp zzb;
    private Long zzc;
    private String zzd;

    public /* synthetic */ zzcjm(zzciy zzciyVar, zzcjp zzcjpVar, zzckd zzckdVar) {
        this.zza = zzciyVar;
        this.zzb = zzcjpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdtn
    public final /* bridge */ /* synthetic */ zzdtn zza(String str) {
        str.getClass();
        this.zzd = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdtn
    public final /* bridge */ /* synthetic */ zzdtn zzb(long j4) {
        this.zzc = Long.valueOf(j4);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdtn
    public final zzdto zzc() {
        zzhgf.zzc(this.zzc, Long.class);
        zzhgf.zzc(this.zzd, String.class);
        return new zzcjn(this.zza, this.zzb, this.zzc, this.zzd, null);
    }
}
