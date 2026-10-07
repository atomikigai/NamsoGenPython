package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzlj {
    private final zzli zza;
    private final zzlh zzb;
    private final zzbv zzc;
    private int zzd;
    private Object zze;
    private final Looper zzf;
    private final int zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;

    public zzlj(zzlh zzlhVar, zzli zzliVar, zzbv zzbvVar, int i, zzdc zzdcVar, Looper looper) {
        this.zzb = zzlhVar;
        this.zza = zzliVar;
        this.zzc = zzbvVar;
        this.zzf = looper;
        this.zzg = i;
    }

    public final int zza() {
        return this.zzd;
    }

    public final Looper zzb() {
        return this.zzf;
    }

    public final zzli zzc() {
        return this.zza;
    }

    public final zzlj zzd() {
        zzdb.zzf(!this.zzh);
        this.zzh = true;
        this.zzb.zzm(this);
        return this;
    }

    public final zzlj zze(Object obj) {
        zzdb.zzf(!this.zzh);
        this.zze = obj;
        return this;
    }

    public final zzlj zzf(int i) {
        zzdb.zzf(!this.zzh);
        this.zzd = i;
        return this;
    }

    public final Object zzg() {
        return this.zze;
    }

    public final synchronized void zzh(boolean z4) {
        this.zzi = z4 | this.zzi;
        this.zzj = true;
        notifyAll();
    }

    public final synchronized boolean zzi(long j4) throws InterruptedException, TimeoutException {
        try {
            zzdb.zzf(this.zzh);
            zzdb.zzf(this.zzf.getThread() != Thread.currentThread());
            long jElapsedRealtime = SystemClock.elapsedRealtime() + j4;
            while (!this.zzj) {
                if (j4 <= 0) {
                    throw new TimeoutException("Message delivery timed out.");
                }
                wait(j4);
                j4 = jElapsedRealtime - SystemClock.elapsedRealtime();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.zzi;
    }

    public final synchronized boolean zzj() {
        return false;
    }
}
