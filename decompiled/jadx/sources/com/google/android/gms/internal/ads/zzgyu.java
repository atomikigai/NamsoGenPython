package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzgyu implements zzgyl {
    final int zza;
    final zzhca zzb;
    final boolean zzc;
    final boolean zzd;

    public zzgyu(zzgzc zzgzcVar, int i, zzhca zzhcaVar, boolean z4, boolean z10) {
        this.zza = i;
        this.zzb = zzhcaVar;
        this.zzc = z4;
        this.zzd = z10;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return this.zza - ((zzgyu) obj).zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgyl
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgyl
    public final zzhca zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgyl
    public final zzhcb zzc() {
        return this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzgyl
    public final boolean zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgyl
    public final boolean zze() {
        return this.zzc;
    }
}
