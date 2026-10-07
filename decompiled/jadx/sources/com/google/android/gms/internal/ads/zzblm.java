package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.b;
import da.v;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzblm implements b {
    final /* synthetic */ zzcao zza;
    final /* synthetic */ zzblo zzb;

    public zzblm(zzblo zzbloVar, zzcao zzcaoVar) {
        this.zza = zzcaoVar;
        this.zzb = zzbloVar;
    }

    @Override // com.google.android.gms.common.internal.b
    public final void onConnected(Bundle bundle) {
        try {
            this.zza.zzc(this.zzb.zza.zzp());
        } catch (DeadObjectException e) {
            this.zza.zzd(e);
        }
    }

    @Override // com.google.android.gms.common.internal.b
    public final void onConnectionSuspended(int i) {
        this.zza.zzd(new RuntimeException(v.f(i, "onConnectionSuspended: ")));
    }
}
