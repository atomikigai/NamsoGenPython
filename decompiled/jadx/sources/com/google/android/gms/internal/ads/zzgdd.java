package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzgdd extends zzgdf {
    public zzgdd(m9.a aVar, zzgdp zzgdpVar) {
        super(aVar, zzgdpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgdf
    public final /* bridge */ /* synthetic */ Object zze(Object obj, Object obj2) throws Exception {
        zzgdp zzgdpVar = (zzgdp) obj;
        m9.a aVarZza = zzgdpVar.zza(obj2);
        zzfwq.zzd(aVarZza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzgdpVar);
        return aVarZza;
    }

    @Override // com.google.android.gms.internal.ads.zzgdf
    public final /* synthetic */ void zzf(Object obj) {
        zzs((m9.a) obj);
    }
}
