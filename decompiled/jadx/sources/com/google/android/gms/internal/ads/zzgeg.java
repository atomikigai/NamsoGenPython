package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgeg {
    private final boolean zza;
    private final zzfzo zzb;

    public /* synthetic */ zzgeg(boolean z4, zzfzo zzfzoVar, zzgeh zzgehVar) {
        this.zza = z4;
        this.zzb = zzfzoVar;
    }

    public final m9.a zza(Callable callable, Executor executor) {
        return new zzgdv(this.zzb, this.zza, executor, callable);
    }
}
