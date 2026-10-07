package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzgdt extends zzgdu {
    final /* synthetic */ zzgdv zza;
    private final Callable zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgdt(zzgdv zzgdvVar, Callable callable, Executor executor) {
        super(zzgdvVar, executor);
        this.zza = zzgdvVar;
        this.zzc = callable;
    }

    @Override // com.google.android.gms.internal.ads.zzgeq
    public final Object zza() throws Exception {
        return this.zzc.call();
    }

    @Override // com.google.android.gms.internal.ads.zzgeq
    public final String zzb() {
        return this.zzc.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgdu
    public final void zzc(Object obj) {
        this.zza.zzc(obj);
    }
}
