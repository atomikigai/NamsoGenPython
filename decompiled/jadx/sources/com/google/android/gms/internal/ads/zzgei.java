package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgei extends zzgek {
    public static zzgeg zza(Iterable iterable) {
        return new zzgeg(false, zzfzo.zzk(iterable), null);
    }

    public static zzgeg zzb(Iterable iterable) {
        return new zzgeg(true, zzfzo.zzk(iterable), null);
    }

    @SafeVarargs
    public static zzgeg zzc(m9.a... aVarArr) {
        return new zzgeg(true, zzfzo.zzm(aVarArr), null);
    }

    public static m9.a zzd(Iterable iterable) {
        return new zzgdq(zzfzo.zzk(iterable), true);
    }

    public static m9.a zze(m9.a aVar, Class cls, zzfwh zzfwhVar, Executor executor) {
        zzgcw zzgcwVar = new zzgcw(aVar, cls, zzfwhVar);
        aVar.addListener(zzgcwVar, zzgey.zzc(executor, zzgcwVar));
        return zzgcwVar;
    }

    public static m9.a zzf(m9.a aVar, Class cls, zzgdp zzgdpVar, Executor executor) {
        zzgcv zzgcvVar = new zzgcv(aVar, cls, zzgdpVar);
        aVar.addListener(zzgcvVar, zzgey.zzc(executor, zzgcvVar));
        return zzgcvVar;
    }

    public static m9.a zzg(Throwable th) {
        th.getClass();
        return new zzgel(th);
    }

    public static m9.a zzh(Object obj) {
        return obj == null ? zzgem.zza : new zzgem(obj);
    }

    public static m9.a zzi() {
        return zzgem.zza;
    }

    public static m9.a zzj(Callable callable, Executor executor) {
        zzgfh zzgfhVar = new zzgfh(callable);
        executor.execute(zzgfhVar);
        return zzgfhVar;
    }

    public static m9.a zzk(zzgdo zzgdoVar, Executor executor) {
        zzgfh zzgfhVar = new zzgfh(zzgdoVar);
        executor.execute(zzgfhVar);
        return zzgfhVar;
    }

    @SafeVarargs
    public static m9.a zzl(m9.a... aVarArr) {
        return new zzgdq(zzfzo.zzm(aVarArr), false);
    }

    public static m9.a zzm(m9.a aVar, zzfwh zzfwhVar, Executor executor) {
        zzgde zzgdeVar = new zzgde(aVar, zzfwhVar);
        aVar.addListener(zzgdeVar, zzgey.zzc(executor, zzgdeVar));
        return zzgdeVar;
    }

    public static m9.a zzn(m9.a aVar, zzgdp zzgdpVar, Executor executor) {
        int i = zzgdf.zzc;
        executor.getClass();
        zzgdd zzgddVar = new zzgdd(aVar, zzgdpVar);
        aVar.addListener(zzgddVar, zzgey.zzc(executor, zzgddVar));
        return zzgddVar;
    }

    public static m9.a zzo(m9.a aVar, long j4, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return aVar.isDone() ? aVar : zzgfe.zzf(aVar, j4, timeUnit, scheduledExecutorService);
    }

    public static Object zzp(Future future) throws ExecutionException {
        if (future.isDone()) {
            return zzgfj.zza(future);
        }
        throw new IllegalStateException(zzfxf.zzb("Future was expected to be done: %s", future));
    }

    public static Object zzq(Future future) {
        try {
            return zzgfj.zza(future);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof Error) {
                throw new zzgdx((Error) cause);
            }
            throw new zzgfi(cause);
        }
    }

    public static void zzr(m9.a aVar, zzgee zzgeeVar, Executor executor) {
        zzgeeVar.getClass();
        aVar.addListener(new zzgef(aVar, zzgeeVar), executor);
    }
}
