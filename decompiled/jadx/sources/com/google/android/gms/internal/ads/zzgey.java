package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgey {
    public static zzges zza(ExecutorService executorService) {
        if (executorService instanceof zzges) {
            return (zzges) executorService;
        }
        return executorService instanceof ScheduledExecutorService ? new zzgex((ScheduledExecutorService) executorService) : new zzgeu(executorService);
    }

    public static Executor zzb() {
        return zzgdw.INSTANCE;
    }

    public static Executor zzc(Executor executor, zzgcy zzgcyVar) {
        executor.getClass();
        return executor == zzgdw.INSTANCE ? executor : new zzget(executor, zzgcyVar);
    }
}
