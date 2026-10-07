package com.google.android.gms.internal.ads;

import h6.k0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzbok implements zzcaq {
    final /* synthetic */ zzcao zza;
    final /* synthetic */ zzbno zzb;

    public zzbok(zzbom zzbomVar, zzcao zzcaoVar, zzbno zzbnoVar) {
        this.zza = zzcaoVar;
        this.zzb = zzbnoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcaq
    public final void zza() {
        k0.k("callJs > getEngine: Promise rejected");
        this.zza.zzd(new zzbnx("Unable to obtain a JavascriptEngine."));
        this.zzb.zzb();
    }
}
