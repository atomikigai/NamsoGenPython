package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzgff extends zzgeq {
    final /* synthetic */ zzgfh zza;
    private final zzgdo zzb;

    public zzgff(zzgfh zzgfhVar, zzgdo zzgdoVar) {
        this.zza = zzgfhVar;
        this.zzb = zzgdoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgeq
    public final /* bridge */ /* synthetic */ Object zza() throws Exception {
        zzgdo zzgdoVar = this.zzb;
        m9.a aVarZza = zzgdoVar.zza();
        zzfwq.zzd(aVarZza, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzgdoVar);
        return aVarZza;
    }

    @Override // com.google.android.gms.internal.ads.zzgeq
    public final String zzb() {
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgeq
    public final void zzd(Throwable th) {
        this.zza.zzd(th);
    }

    @Override // com.google.android.gms.internal.ads.zzgeq
    public final /* synthetic */ void zze(Object obj) {
        this.zza.zzs((m9.a) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgeq
    public final boolean zzg() {
        return this.zza.isDone();
    }
}
