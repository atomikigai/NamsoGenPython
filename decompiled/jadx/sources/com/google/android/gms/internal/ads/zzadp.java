package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class zzadp implements zzadq {
    private final long zza;
    private final zzado zzb;

    public zzadp(long j4, long j10) {
        this.zza = j4;
        zzadr zzadrVar = j10 == 0 ? zzadr.zza : new zzadr(0L, j10);
        this.zzb = new zzado(zzadrVar, zzadrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzadq
    public final long zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzadq
    public final zzado zzg(long j4) {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzadq
    public final boolean zzh() {
        return false;
    }
}
