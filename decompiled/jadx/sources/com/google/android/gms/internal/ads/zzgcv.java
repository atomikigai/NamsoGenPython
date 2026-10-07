package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzgcv extends zzgcx {
    public zzgcv(m9.a aVar, Class cls, zzgdp zzgdpVar) {
        super(aVar, cls, zzgdpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    public final /* bridge */ /* synthetic */ Object zze(Object obj, Throwable th) throws Exception {
        zzgdp zzgdpVar = (zzgdp) obj;
        m9.a aVarZza = zzgdpVar.zza(th);
        zzfwq.zzd(aVarZza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzgdpVar);
        return aVarZza;
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    public final /* synthetic */ void zzf(Object obj) {
        zzs((m9.a) obj);
    }
}
