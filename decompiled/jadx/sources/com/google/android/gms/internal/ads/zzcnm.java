package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzcnm implements zzgee {
    final /* synthetic */ String zza;
    final /* synthetic */ zzcnn zzb;

    public zzcnm(zzcnn zzcnnVar, String str) {
        this.zza = str;
        this.zzb = zzcnnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final void zza(Throwable th) {
        zzcnn zzcnnVar = this.zzb;
        zzcnnVar.zzh.zza(zzcnnVar.zzg.zzd(zzcnnVar.zze, zzcnnVar.zzf, false, this.zza, null, zzcnnVar.zzu()));
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcnn zzcnnVar = this.zzb;
        zzcnnVar.zzh.zza(zzcnnVar.zzg.zzd(zzcnnVar.zze, zzcnnVar.zzf, false, this.zza, (String) obj, zzcnnVar.zzu()));
    }
}
