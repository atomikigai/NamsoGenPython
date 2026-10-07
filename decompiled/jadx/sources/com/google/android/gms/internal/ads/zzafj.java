package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzafj extends zzade {
    final /* synthetic */ zzadq zza;
    final /* synthetic */ zzafk zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzafj(zzafk zzafkVar, zzadq zzadqVar, zzadq zzadqVar2) {
        super(zzadqVar);
        this.zza = zzadqVar2;
        this.zzb = zzafkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzade, com.google.android.gms.internal.ads.zzadq
    public final zzado zzg(long j4) {
        zzado zzadoVarZzg = this.zza.zzg(j4);
        zzadr zzadrVar = zzadoVarZzg.zza;
        zzadr zzadrVar2 = new zzadr(zzadrVar.zzb, this.zzb.zzb + zzadrVar.zzc);
        zzadr zzadrVar3 = zzadoVarZzg.zzb;
        return new zzado(zzadrVar2, new zzadr(zzadrVar3.zzb, this.zzb.zzb + zzadrVar3.zzc));
    }
}
