package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzvy implements zzym {
    public long zza;
    public long zzb;
    public zzyl zzc;
    public zzvy zzd;

    public zzvy(long j4, int i) {
        zze(j4, 65536);
    }

    public final int zza(long j4) {
        long j10 = j4 - this.zza;
        int i = this.zzc.zzb;
        return (int) j10;
    }

    public final zzvy zzb() {
        this.zzc = null;
        zzvy zzvyVar = this.zzd;
        this.zzd = null;
        return zzvyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzym
    public final zzyl zzc() {
        zzyl zzylVar = this.zzc;
        zzylVar.getClass();
        return zzylVar;
    }

    @Override // com.google.android.gms.internal.ads.zzym
    public final zzym zzd() {
        zzvy zzvyVar = this.zzd;
        if (zzvyVar == null || zzvyVar.zzc == null) {
            return null;
        }
        return zzvyVar;
    }

    public final void zze(long j4, int i) {
        zzdb.zzf(this.zzc == null);
        this.zza = j4;
        this.zzb = j4 + 65536;
    }
}
