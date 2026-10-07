package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzadi implements zzadq {
    private final zzdu zza;
    private final zzdu zzb;
    private long zzc;

    public zzadi(long[] jArr, long[] jArr2, long j4) {
        int length = jArr.length;
        int length2 = jArr2.length;
        zzdb.zzd(length == length2);
        if (length2 <= 0 || jArr2[0] <= 0) {
            this.zza = new zzdu(length2);
            this.zzb = new zzdu(length2);
        } else {
            int i = length2 + 1;
            zzdu zzduVar = new zzdu(i);
            this.zza = zzduVar;
            zzdu zzduVar2 = new zzdu(i);
            this.zzb = zzduVar2;
            zzduVar.zzc(0L);
            zzduVar2.zzc(0L);
        }
        this.zza.zzd(jArr);
        this.zzb.zzd(jArr2);
        this.zzc = j4;
    }

    @Override // com.google.android.gms.internal.ads.zzadq
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzadq
    public final zzado zzg(long j4) {
        zzdu zzduVar = this.zzb;
        if (zzduVar.zza() == 0) {
            zzadr zzadrVar = zzadr.zza;
            return new zzado(zzadrVar, zzadrVar);
        }
        int iZzb = zzen.zzb(zzduVar, j4, true, true);
        zzadr zzadrVar2 = new zzadr(this.zzb.zzb(iZzb), this.zza.zzb(iZzb));
        if (zzadrVar2.zzb != j4) {
            zzdu zzduVar2 = this.zzb;
            if (iZzb != zzduVar2.zza() - 1) {
                int i = iZzb + 1;
                return new zzado(zzadrVar2, new zzadr(zzduVar2.zzb(i), this.zza.zzb(i)));
            }
        }
        return new zzado(zzadrVar2, zzadrVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzadq
    public final boolean zzh() {
        return this.zzb.zza() > 0;
    }
}
