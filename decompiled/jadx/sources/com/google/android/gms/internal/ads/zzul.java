package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzul extends zzbv {
    private final zzaw zzb;

    public zzul(zzaw zzawVar) {
        this.zzb = zzawVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbv
    public final int zza(Object obj) {
        return obj == zzuk.zzc ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbv
    public final int zzb() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzbv
    public final int zzc() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzbv
    public final zzbt zzd(int i, zzbt zzbtVar, boolean z4) {
        zzbtVar.zzi(z4 ? 0 : null, z4 ? zzuk.zzc : null, 0, -9223372036854775807L, 0L, zzb.zza, true);
        return zzbtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbv
    public final zzbu zze(int i, zzbu zzbuVar, long j4) {
        zzbuVar.zza(zzbu.zza, this.zzb, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
        zzbuVar.zzk = true;
        return zzbuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbv
    public final Object zzf(int i) {
        return zzuk.zzc;
    }
}
