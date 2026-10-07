package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcu extends zzcw {
    public static zzcz zza(Object obj) {
        return new zzcx(obj);
    }

    public static zzcz zzb(zzcz zzczVar, long j4, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return zzczVar.isDone() ? zzczVar : zzde.zzs(zzczVar, 28500L, timeUnit, scheduledExecutorService);
    }

    public static void zzc(zzcz zzczVar, zzcs zzcsVar, Executor executor) {
        zzczVar.zzb(new zzct(zzczVar, zzcsVar), executor);
    }
}
