package com.google.android.gms.internal.ads;

import d6.p;
import h6.m;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzesv implements zzevz {
    private final zzges zza;

    public zzesv(zzges zzgesVar) {
        this.zza = zzgesVar;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final int zza() {
        return 20;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final m9.a zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzesu
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String str;
                p pVar = p.C;
                m mVar = pVar.f2987n;
                synchronized (mVar.f5031c) {
                    str = (String) mVar.e;
                }
                return new zzesw(str, pVar.f2987n.n());
            }
        });
    }
}
