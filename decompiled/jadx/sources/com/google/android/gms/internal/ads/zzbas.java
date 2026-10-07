package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.c;
import g7.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzbas implements c {
    final /* synthetic */ zzbat zza;

    public zzbas(zzbat zzbatVar) {
        this.zza = zzbatVar;
    }

    @Override // com.google.android.gms.common.internal.c
    public final void onConnectionFailed(b bVar) {
        synchronized (this.zza.zzc) {
            try {
                this.zza.zzf = null;
                zzbat zzbatVar = this.zza;
                if (zzbatVar.zzd != null) {
                    zzbatVar.zzd = null;
                }
                this.zza.zzc.notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
