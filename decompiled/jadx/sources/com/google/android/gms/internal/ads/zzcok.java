package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import d6.p;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import n7.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcok implements zzazf {
    private final ScheduledExecutorService zza;
    private final n7.a zzb;
    private ScheduledFuture zzc;
    private long zzd = -1;
    private long zze = -1;
    private Runnable zzf = null;
    private boolean zzg = false;

    public zzcok(ScheduledExecutorService scheduledExecutorService, n7.a aVar) {
        this.zza = scheduledExecutorService;
        this.zzb = aVar;
        p.C.f2981f.zzc(this);
    }

    @Override // com.google.android.gms.internal.ads.zzazf
    public final void zza(boolean z4) {
        if (z4) {
            zzc();
        } else {
            zzb();
        }
    }

    public final synchronized void zzb() {
        try {
            if (this.zzg) {
                return;
            }
            ScheduledFuture scheduledFuture = this.zzc;
            if (scheduledFuture == null || scheduledFuture.isDone()) {
                this.zze = -1L;
            } else {
                this.zzc.cancel(true);
                long j4 = this.zzd;
                ((b) this.zzb).getClass();
                this.zze = j4 - SystemClock.elapsedRealtime();
            }
            this.zzg = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzc() {
        ScheduledFuture scheduledFuture;
        try {
            if (this.zzg) {
                if (this.zze > 0 && (scheduledFuture = this.zzc) != null && scheduledFuture.isCancelled()) {
                    this.zzc = this.zza.schedule(this.zzf, this.zze, TimeUnit.MILLISECONDS);
                }
                this.zzg = false;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzd(int i, Runnable runnable) {
        this.zzf = runnable;
        ((b) this.zzb).getClass();
        long j4 = i;
        this.zzd = SystemClock.elapsedRealtime() + j4;
        this.zzc = this.zza.schedule(runnable, j4, TimeUnit.MILLISECONDS);
    }
}
