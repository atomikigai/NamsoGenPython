package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzada implements zzadq {
    private final zzadc zza;
    private final long zzb;

    public zzada(zzadc zzadcVar, long j4) {
        this.zza = zzadcVar;
        this.zzb = j4;
    }

    private final zzadr zzb(long j4, long j10) {
        return new zzadr((j4 * 1000000) / ((long) this.zza.zze), this.zzb + j10);
    }

    @Override // com.google.android.gms.internal.ads.zzadq
    public final long zza() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzadq
    public final zzado zzg(long j4) {
        zzdb.zzb(this.zza.zzk);
        zzadc zzadcVar = this.zza;
        zzadb zzadbVar = zzadcVar.zzk;
        long[] jArr = zzadbVar.zza;
        long[] jArr2 = zzadbVar.zzb;
        int iZzd = zzen.zzd(jArr, zzadcVar.zzb(j4), true, false);
        zzadr zzadrVarZzb = zzb(iZzd == -1 ? 0L : jArr[iZzd], iZzd != -1 ? jArr2[iZzd] : 0L);
        if (zzadrVarZzb.zzb == j4 || iZzd == jArr.length - 1) {
            return new zzado(zzadrVarZzb, zzadrVarZzb);
        }
        int i = iZzd + 1;
        return new zzado(zzadrVarZzb, zzb(jArr[i], jArr2[i]));
    }

    @Override // com.google.android.gms.internal.ads.zzadq
    public final boolean zzh() {
        return true;
    }
}
