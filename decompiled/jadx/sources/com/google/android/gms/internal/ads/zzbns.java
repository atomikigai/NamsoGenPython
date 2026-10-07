package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzbns implements zzcas {
    final /* synthetic */ zzbnt zza;

    public zzbns(zzbnt zzbntVar) {
        this.zza = zzbntVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcas
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        final zzbmp zzbmpVar = (zzbmp) obj;
        zzcaj.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbnr
            @Override // java.lang.Runnable
            public final void run() {
                zzbmp zzbmpVar2 = zzbmpVar;
                zzbmpVar2.zzr("/result", zzbjq.zzo);
                zzbmpVar2.zzc();
            }
        });
    }
}
