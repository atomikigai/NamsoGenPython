package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzaij implements zzaig {
    private final int zza;
    private final int zzb;
    private final zzed zzc;

    public zzaij(zzet zzetVar, zzad zzadVar) {
        zzed zzedVar = zzetVar.zza;
        this.zzc = zzedVar;
        zzedVar.zzL(12);
        int iZzp = zzedVar.zzp();
        if ("audio/raw".equals(zzadVar.zzo)) {
            int iZzk = zzen.zzk(zzadVar.zzE) * zzadVar.zzC;
            if (iZzp == 0 || iZzp % iZzk != 0) {
                zzdt.zzf("BoxParsers", "Audio sample size mismatch. stsd sample size: " + iZzk + ", stsz sample size: " + iZzp);
                iZzp = iZzk;
            }
        }
        this.zza = iZzp == 0 ? -1 : iZzp;
        this.zzb = zzedVar.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzaig
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzaig
    public final int zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzaig
    public final int zzc() {
        int i = this.zza;
        return i == -1 ? this.zzc.zzp() : i;
    }
}
