package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzaik implements zzaig {
    private final zzed zza;
    private final int zzb;
    private final int zzc;
    private int zzd;
    private int zze;

    public zzaik(zzet zzetVar) {
        zzed zzedVar = zzetVar.zza;
        this.zza = zzedVar;
        zzedVar.zzL(12);
        this.zzc = zzedVar.zzp() & 255;
        this.zzb = zzedVar.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzaig
    public final int zza() {
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzaig
    public final int zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzaig
    public final int zzc() {
        int i = this.zzc;
        if (i == 8) {
            return this.zza.zzm();
        }
        if (i == 16) {
            return this.zza.zzq();
        }
        int i10 = this.zzd;
        this.zzd = i10 + 1;
        if (i10 % 2 != 0) {
            return this.zze & 15;
        }
        int iZzm = this.zza.zzm();
        this.zze = iZzm;
        return (iZzm & 240) >> 4;
    }
}
