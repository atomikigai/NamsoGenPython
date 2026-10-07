package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzhbp extends zzhbn {
    @Override // com.google.android.gms.internal.ads.zzhbn
    public final /* bridge */ /* synthetic */ Object zza(Object obj) {
        zzgyx zzgyxVar = (zzgyx) obj;
        zzhbo zzhboVar = zzgyxVar.zzt;
        if (zzhboVar != zzhbo.zzc()) {
            return zzhboVar;
        }
        zzhbo zzhboVarZzf = zzhbo.zzf();
        zzgyxVar.zzt = zzhboVarZzf;
        return zzhboVarZzf;
    }

    @Override // com.google.android.gms.internal.ads.zzhbn
    public final /* synthetic */ Object zzb() {
        return zzhbo.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzhbn
    public final /* synthetic */ Object zzc(Object obj) {
        zzhbo zzhboVar = (zzhbo) obj;
        zzhboVar.zzh();
        return zzhboVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbn
    public final /* bridge */ /* synthetic */ void zzd(Object obj, int i, int i10) {
        ((zzhbo) obj).zzj((i << 3) | 5, Integer.valueOf(i10));
    }

    @Override // com.google.android.gms.internal.ads.zzhbn
    public final /* bridge */ /* synthetic */ void zze(Object obj, int i, long j4) {
        ((zzhbo) obj).zzj((i << 3) | 1, Long.valueOf(j4));
    }

    @Override // com.google.android.gms.internal.ads.zzhbn
    public final /* bridge */ /* synthetic */ void zzf(Object obj, int i, Object obj2) {
        ((zzhbo) obj).zzj((i << 3) | 3, (zzhbo) obj2);
    }

    @Override // com.google.android.gms.internal.ads.zzhbn
    public final /* bridge */ /* synthetic */ void zzg(Object obj, int i, zzgxp zzgxpVar) {
        ((zzhbo) obj).zzj((i << 3) | 2, zzgxpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhbn
    public final /* bridge */ /* synthetic */ void zzh(Object obj, int i, long j4) {
        ((zzhbo) obj).zzj(i << 3, Long.valueOf(j4));
    }

    @Override // com.google.android.gms.internal.ads.zzhbn
    public final void zzi(Object obj) {
        ((zzgyx) obj).zzt.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzhbn
    public final /* synthetic */ void zzj(Object obj, Object obj2) {
        ((zzgyx) obj).zzt = (zzhbo) obj2;
    }
}
