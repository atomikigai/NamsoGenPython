package com.google.android.gms.internal.ads;

import h6.k0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzbnm implements zzcas {
    final /* synthetic */ zzbno zza;

    public zzbnm(zzbno zzbnoVar) {
        this.zza = zzbnoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcas
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        k0.k("Releasing engine reference.");
        this.zza.zzb.zzd();
    }
}
