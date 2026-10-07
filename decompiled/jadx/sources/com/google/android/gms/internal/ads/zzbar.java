package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.b;
import i6.h;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzbar implements b {
    final /* synthetic */ zzbat zza;

    public zzbar(zzbat zzbatVar) {
        this.zza = zzbatVar;
    }

    @Override // com.google.android.gms.common.internal.b
    public final void onConnected(Bundle bundle) {
        synchronized (this.zza.zzc) {
            try {
                zzbat zzbatVar = this.zza;
                if (zzbatVar.zzd != null) {
                    zzbatVar.zzf = zzbatVar.zzd.zzq();
                }
            } catch (DeadObjectException e) {
                h.e("Unable to obtain a cache service instance.", e);
                zzbat.zzh(this.zza);
            }
            this.zza.zzc.notifyAll();
        }
    }

    @Override // com.google.android.gms.common.internal.b
    public final void onConnectionSuspended(int i) {
        synchronized (this.zza.zzc) {
            this.zza.zzf = null;
            this.zza.zzc.notifyAll();
        }
    }
}
