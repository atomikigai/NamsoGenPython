package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzwn implements zzwg {
    private final zzwg zza;
    private final long zzb;

    public zzwn(zzwg zzwgVar, long j4) {
        this.zza = zzwgVar;
        this.zzb = j4;
    }

    @Override // com.google.android.gms.internal.ads.zzwg
    public final int zza(zzkj zzkjVar, zzhm zzhmVar, int i) {
        int iZza = this.zza.zza(zzkjVar, zzhmVar, i);
        if (iZza != -4) {
            return iZza;
        }
        zzhmVar.zze += this.zzb;
        return -4;
    }

    @Override // com.google.android.gms.internal.ads.zzwg
    public final int zzb(long j4) {
        return this.zza.zzb(j4 - this.zzb);
    }

    public final zzwg zzc() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzwg
    public final void zzd() throws IOException {
        this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzwg
    public final boolean zze() {
        return this.zza.zze();
    }
}
