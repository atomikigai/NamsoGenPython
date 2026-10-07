package com.google.android.gms.internal.ads;

import java.math.BigInteger;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzajj implements zzadq {
    final /* synthetic */ zzajl zza;

    public /* synthetic */ zzajj(zzajl zzajlVar, zzajk zzajkVar) {
        this.zza = zzajlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzadq
    public final long zza() {
        zzajl zzajlVar = this.zza;
        return zzajlVar.zzd.zzf(zzajlVar.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzadq
    public final zzado zzg(long j4) {
        zzajl zzajlVar = this.zza;
        long jZzg = zzajlVar.zzd.zzg(j4);
        long j10 = zzajlVar.zzb;
        BigInteger bigIntegerValueOf = BigInteger.valueOf(jZzg);
        zzajl zzajlVar2 = this.zza;
        long jLongValue = bigIntegerValueOf.multiply(BigInteger.valueOf(zzajlVar2.zzc - zzajlVar2.zzb)).divide(BigInteger.valueOf(this.zza.zzf)).longValue() + j10;
        zzajl zzajlVar3 = this.zza;
        zzadr zzadrVar = new zzadr(j4, Math.max(zzajlVar3.zzb, Math.min(jLongValue - 30000, zzajlVar3.zzc - 1)));
        return new zzado(zzadrVar, zzadrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzadq
    public final boolean zzh() {
        return true;
    }
}
