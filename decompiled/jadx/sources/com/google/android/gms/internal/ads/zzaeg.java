package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzaeg implements zzadq {
    final /* synthetic */ zzaej zza;
    private final long zzb;

    public zzaeg(zzaej zzaejVar, long j4) {
        this.zza = zzaejVar;
        this.zzb = j4;
    }

    @Override // com.google.android.gms.internal.ads.zzadq
    public final long zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzadq
    public final zzado zzg(long j4) {
        zzado zzadoVarZza = this.zza.zzi[0].zza(j4);
        int i = 1;
        while (true) {
            zzaej zzaejVar = this.zza;
            if (i >= zzaejVar.zzi.length) {
                return zzadoVarZza;
            }
            zzado zzadoVarZza2 = zzaejVar.zzi[i].zza(j4);
            if (zzadoVarZza2.zza.zzc < zzadoVarZza.zza.zzc) {
                zzadoVarZza = zzadoVarZza2;
            }
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadq
    public final boolean zzh() {
        return true;
    }
}
