package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzgdv extends zzgdi {
    private zzgdu zza;

    public zzgdv(zzfzj zzfzjVar, boolean z4, Executor executor, Callable callable) {
        super(zzfzjVar, z4, false);
        this.zza = new zzgdt(this, callable, executor);
        zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzgcy
    public final void zzq() {
        zzgdu zzgduVar = this.zza;
        if (zzgduVar != null) {
            zzgduVar.zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgdi
    public final void zzu() {
        zzgdu zzgduVar = this.zza;
        if (zzgduVar != null) {
            zzgduVar.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgdi
    public final void zzy(int i) {
        super.zzy(i);
        if (i == 1) {
            this.zza = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgdi
    public final void zzf(int i, Object obj) {
    }
}
