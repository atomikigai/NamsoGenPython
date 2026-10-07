package com.google.android.gms.internal.ads;

import h6.k0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbno extends zzcav {
    private final Object zza = new Object();
    private final zzbnt zzb;
    private boolean zzc;

    public zzbno(zzbnt zzbntVar) {
        this.zzb = zzbntVar;
    }

    public final void zzb() {
        k0.k("release: Trying to acquire lock");
        synchronized (this.zza) {
            try {
                k0.k("release: Lock acquired");
                if (this.zzc) {
                    k0.k("release: Lock already released");
                    return;
                }
                this.zzc = true;
                zzj(new zzbnl(this), new zzcar());
                zzj(new zzbnm(this), new zzbnn(this));
                k0.k("release: Lock released");
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
