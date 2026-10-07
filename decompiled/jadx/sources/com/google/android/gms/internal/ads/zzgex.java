package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzgex extends zzgeu implements ScheduledExecutorService, zzges, AutoCloseable {
    final ScheduledExecutorService zza;

    public zzgex(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        scheduledExecutorService.getClass();
        this.zza = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzgdc, com.google.android.gms.internal.ads.zzges, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        boolean zIsTerminated;
        if (this == ForkJoinPool.commonPool() || (zIsTerminated = isTerminated())) {
            return;
        }
        shutdown();
        boolean z4 = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z4) {
                    shutdownNow();
                    z4 = true;
                }
            }
        }
        if (z4) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Runnable runnable, long j4, TimeUnit timeUnit) {
        ScheduledExecutorService scheduledExecutorService = this.zza;
        zzgfh zzgfhVarZze = zzgfh.zze(runnable, null);
        return new zzgev(zzgfhVarZze, scheduledExecutorService.schedule(zzgfhVarZze, j4, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j4, long j10, TimeUnit timeUnit) {
        zzgew zzgewVar = new zzgew(runnable);
        return new zzgev(zzgewVar, this.zza.scheduleAtFixedRate(zzgewVar, j4, j10, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j4, long j10, TimeUnit timeUnit) {
        zzgew zzgewVar = new zzgew(runnable);
        return new zzgev(zzgewVar, this.zza.scheduleWithFixedDelay(zzgewVar, j4, j10, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Callable callable, long j4, TimeUnit timeUnit) {
        zzgfh zzgfhVar = new zzgfh(callable);
        return new zzgev(zzgfhVar, this.zza.schedule(zzgfhVar, j4, timeUnit));
    }
}
