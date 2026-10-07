package com.google.android.gms.internal.ads;

import da.v;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzgfh extends zzgdy implements RunnableFuture {
    private volatile zzgeq zza;

    public zzgfh(zzgdo zzgdoVar) {
        this.zza = new zzgff(this, zzgdoVar);
    }

    public static zzgfh zze(Runnable runnable, Object obj) {
        return new zzgfh(Executors.callable(runnable, obj));
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        zzgeq zzgeqVar = this.zza;
        if (zzgeqVar != null) {
            zzgeqVar.run();
        }
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzgcy
    public final String zza() {
        zzgeq zzgeqVar = this.zza;
        return zzgeqVar != null ? v.i("task=[", zzgeqVar.toString(), "]") : super.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzgcy
    public final void zzb() {
        zzgeq zzgeqVar;
        if (zzt() && (zzgeqVar = this.zza) != null) {
            zzgeqVar.zzh();
        }
        this.zza = null;
    }

    public zzgfh(Callable callable) {
        this.zza = new zzgfg(this, callable);
    }
}
