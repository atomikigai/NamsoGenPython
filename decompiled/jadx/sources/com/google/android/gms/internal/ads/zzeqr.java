package com.google.android.gms.internal.ads;

import d6.p;
import h6.n0;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzeqr implements zzevz {
    private final zzges zza;

    public zzeqr(zzges zzgesVar) {
        this.zza = zzgesVar;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final int zza() {
        return 55;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final m9.a zzb() {
        return this.zza.zzb(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzeqq
            @Override // java.util.concurrent.Callable
            public final Object call() {
                p pVar = p.C;
                pVar.f2983j.getClass();
                return new zzeqs(System.currentTimeMillis() - ((n0) pVar.f2982g.zzi()).n().zza());
            }
        });
    }
}
