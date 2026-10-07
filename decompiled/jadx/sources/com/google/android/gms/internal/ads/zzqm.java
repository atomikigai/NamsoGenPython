package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzqm {
    private final zzcm[] zza;
    private final zzre zzb;
    private final zzcp zzc;

    public zzqm(zzcm... zzcmVarArr) {
        zzre zzreVar = new zzre();
        zzcp zzcpVar = new zzcp();
        zzcm[] zzcmVarArr2 = {zzreVar, zzcpVar};
        this.zza = zzcmVarArr2;
        System.arraycopy(zzcmVarArr, 0, zzcmVarArr2, 0, 0);
        this.zzb = zzreVar;
        this.zzc = zzcpVar;
    }

    public final long zza(long j4) {
        return this.zzc.zzg() ? this.zzc.zzi(j4) : j4;
    }

    public final long zzb() {
        return this.zzb.zzo();
    }

    public final zzbj zzc(zzbj zzbjVar) {
        this.zzc.zzk(zzbjVar.zzb);
        this.zzc.zzj(zzbjVar.zzc);
        return zzbjVar;
    }

    public final boolean zzd(boolean z4) {
        this.zzb.zzp(z4);
        return z4;
    }

    public final zzcm[] zze() {
        return this.zza;
    }
}
