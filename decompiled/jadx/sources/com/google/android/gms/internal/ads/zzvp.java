package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzvp implements zzwg {
    final /* synthetic */ zzvs zza;
    private final int zzb;

    public zzvp(zzvs zzvsVar, int i) {
        this.zza = zzvsVar;
        this.zzb = i;
    }

    @Override // com.google.android.gms.internal.ads.zzwg
    public final int zza(zzkj zzkjVar, zzhm zzhmVar, int i) {
        return this.zza.zzg(this.zzb, zzkjVar, zzhmVar, i);
    }

    @Override // com.google.android.gms.internal.ads.zzwg
    public final int zzb(long j4) {
        return this.zza.zzi(this.zzb, j4);
    }

    @Override // com.google.android.gms.internal.ads.zzwg
    public final void zzd() throws IOException {
        this.zza.zzI(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzwg
    public final boolean zze() {
        return this.zza.zzP(this.zzb);
    }
}
