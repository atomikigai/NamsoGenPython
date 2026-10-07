package com.google.android.gms.internal.ads;

import h6.k0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzboj implements zzcas {
    final /* synthetic */ zzbno zza;
    final /* synthetic */ Object zzb;
    final /* synthetic */ zzcao zzc;
    final /* synthetic */ zzbom zzd;

    public zzboj(zzbom zzbomVar, zzbno zzbnoVar, Object obj, zzcao zzcaoVar) {
        this.zza = zzbnoVar;
        this.zzb = obj;
        this.zzc = zzcaoVar;
        this.zzd = zzbomVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcas
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        k0.k("callJs > getEngine: Promise fulfilled");
        Object obj2 = this.zzb;
        zzcao zzcaoVar = this.zzc;
        zzbom.zzd(this.zzd, this.zza, (zzbnv) obj, obj2, zzcaoVar);
    }
}
