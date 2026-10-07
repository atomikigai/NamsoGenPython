package com.google.android.gms.internal.ads;

import e6.t;
import n7.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfes {
    private final n7.a zza;
    private final Object zzb = new Object();
    private volatile int zzd = 1;
    private volatile long zzc = 0;

    public zzfes(n7.a aVar) {
        this.zza = aVar;
    }

    private final void zze() {
        ((b) this.zza).getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (this.zzb) {
            try {
                if (this.zzd == 3) {
                    if (this.zzc + ((Long) t.f3437d.f3440c.zza(zzbcn.zzfQ)).longValue() <= jCurrentTimeMillis) {
                        this.zzd = 1;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void zzf(int i, int i10) {
        zze();
        Object obj = this.zzb;
        ((b) this.zza).getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (obj) {
            try {
                if (this.zzd != i) {
                    return;
                }
                this.zzd = i10;
                if (this.zzd == 3) {
                    this.zzc = jCurrentTimeMillis;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zza() {
        zzf(2, 3);
    }

    public final void zzb(boolean z4) {
        if (z4) {
            zzf(1, 2);
        } else {
            zzf(2, 1);
        }
    }

    public final boolean zzc() {
        boolean z4;
        synchronized (this.zzb) {
            zze();
            z4 = this.zzd == 3;
        }
        return z4;
    }

    public final boolean zzd() {
        boolean z4;
        synchronized (this.zzb) {
            zze();
            z4 = this.zzd == 2;
        }
        return z4;
    }
}
