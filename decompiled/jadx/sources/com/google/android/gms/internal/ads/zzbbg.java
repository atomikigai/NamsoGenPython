package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.c;
import g7.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzbbg implements c {
    final /* synthetic */ zzcao zza;
    final /* synthetic */ zzbbh zzb;

    public zzbbg(zzbbh zzbbhVar, zzcao zzcaoVar) {
        this.zza = zzcaoVar;
        this.zzb = zzbbhVar;
    }

    @Override // com.google.android.gms.common.internal.c
    public final void onConnectionFailed(b bVar) {
        synchronized (this.zzb.zzd) {
            this.zza.zzd(new RuntimeException("Connection failed."));
        }
    }
}
