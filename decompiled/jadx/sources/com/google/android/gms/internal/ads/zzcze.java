package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import n7.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcze extends zzdcc {
    private final ScheduledExecutorService zzb;
    private final n7.a zzc;
    private long zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private boolean zzh;
    private ScheduledFuture zzi;
    private ScheduledFuture zzj;

    public zzcze(ScheduledExecutorService scheduledExecutorService, n7.a aVar) {
        super(Collections.EMPTY_SET);
        this.zzd = -1L;
        this.zze = -1L;
        this.zzf = -1L;
        this.zzg = -1L;
        this.zzh = false;
        this.zzb = scheduledExecutorService;
        this.zzc = aVar;
    }

    private final synchronized void zzf(long j4) {
        try {
            ScheduledFuture scheduledFuture = this.zzi;
            if (scheduledFuture != null && !scheduledFuture.isDone()) {
                this.zzi.cancel(false);
            }
            ((b) this.zzc).getClass();
            this.zzd = SystemClock.elapsedRealtime() + j4;
            this.zzi = this.zzb.schedule(new zzczb(this, null), j4, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized void zzg(long j4) {
        try {
            ScheduledFuture scheduledFuture = this.zzj;
            if (scheduledFuture != null && !scheduledFuture.isDone()) {
                this.zzj.cancel(false);
            }
            ((b) this.zzc).getClass();
            this.zze = SystemClock.elapsedRealtime() + j4;
            this.zzj = this.zzb.schedule(new zzczc(this, null), j4, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zza() {
        this.zzh = false;
        zzf(0L);
    }

    public final synchronized void zzb() {
        try {
            if (this.zzh) {
                return;
            }
            ScheduledFuture scheduledFuture = this.zzi;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                this.zzf = -1L;
            } else {
                this.zzi.cancel(false);
                long j4 = this.zzd;
                ((b) this.zzc).getClass();
                this.zzf = j4 - SystemClock.elapsedRealtime();
            }
            ScheduledFuture scheduledFuture2 = this.zzj;
            if (scheduledFuture2 == null || scheduledFuture2.isCancelled()) {
                this.zzg = -1L;
            } else {
                this.zzj.cancel(false);
                long j10 = this.zze;
                ((b) this.zzc).getClass();
                this.zzg = j10 - SystemClock.elapsedRealtime();
            }
            this.zzh = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzc() {
        try {
            if (this.zzh) {
                if (this.zzf > 0 && this.zzi.isCancelled()) {
                    zzf(this.zzf);
                }
                if (this.zzg > 0 && this.zzj.isCancelled()) {
                    zzg(this.zzg);
                }
                this.zzh = false;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzd(int i) {
        if (i > 0) {
            long millis = TimeUnit.SECONDS.toMillis(i);
            if (this.zzh) {
                long j4 = this.zzf;
                if (j4 <= 0 || millis >= j4) {
                    millis = j4;
                }
                this.zzf = millis;
                return;
            }
            ((b) this.zzc).getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = this.zzd;
            if (jElapsedRealtime > j10 || j10 - jElapsedRealtime > millis) {
                zzf(millis);
            }
        }
    }

    public final synchronized void zze(int i) {
        if (i > 0) {
            long millis = TimeUnit.SECONDS.toMillis(i);
            if (this.zzh) {
                long j4 = this.zzg;
                if (j4 <= 0 || millis >= j4) {
                    millis = j4;
                }
                this.zzg = millis;
                return;
            }
            ((b) this.zzc).getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = this.zze;
            if (jElapsedRealtime > j10 || j10 - jElapsedRealtime > millis) {
                zzg(millis);
            }
        }
    }
}
