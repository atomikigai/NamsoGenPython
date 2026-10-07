package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzlk extends zzuf {
    private final zzbu zzc;

    public zzlk(zzll zzllVar, zzbv zzbvVar) {
        super(zzbvVar);
        this.zzc = new zzbu();
    }

    @Override // com.google.android.gms.internal.ads.zzuf, com.google.android.gms.internal.ads.zzbv
    public final zzbt zzd(int i, zzbt zzbtVar, boolean z4) {
        zzbt zzbtVarZzd = this.zzb.zzd(i, zzbtVar, z4);
        if (this.zzb.zze(zzbtVarZzd.zzc, this.zzc, 0L).zzb()) {
            zzbtVarZzd.zzi(zzbtVar.zza, zzbtVar.zzb, zzbtVar.zzc, zzbtVar.zzd, 0L, zzb.zza, true);
            return zzbtVarZzd;
        }
        zzbtVarZzd.zzf = true;
        return zzbtVarZzd;
    }
}
