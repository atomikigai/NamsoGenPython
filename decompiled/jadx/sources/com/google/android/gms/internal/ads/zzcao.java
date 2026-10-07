package com.google.android.gms.internal.ads;

import d6.p;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class zzcao implements m9.a {
    private final zzgfa zza = zzgfa.zze();

    @Override // m9.a
    public final void addListener(Runnable runnable, Executor executor) {
        this.zza.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z4) {
        return this.zza.cancel(z4);
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws ExecutionException, InterruptedException {
        return this.zza.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.zza.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.zza.isDone();
    }

    public void zza(Object obj) {
        zzc(obj);
    }

    public final boolean zzc(Object obj) {
        boolean zZzc = this.zza.zzc(obj);
        zza(zZzc);
        return zZzc;
    }

    public final boolean zzd(Throwable th) {
        boolean zZzd = this.zza.zzd(th);
        zza(zZzd);
        return zZzd;
    }

    private static final boolean zza(boolean z4) {
        if (!z4) {
            p.C.f2982g.zzv(new IllegalStateException("Provided SettableFuture with multiple values."), "SettableFuture");
        }
        return z4;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j4, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return this.zza.get(j4, timeUnit);
    }
}
