package com.google.android.gms.internal.ads;

import e6.s3;
import e6.y1;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzemv implements zzcyx {
    private final AtomicReference zza = new AtomicReference();

    public final void zza(y1 y1Var) {
        this.zza.set(y1Var);
    }

    @Override // com.google.android.gms.internal.ads.zzcyx
    public final void zzh(final s3 s3Var) {
        zzfby.zza(this.zza, new zzfbx() { // from class: com.google.android.gms.internal.ads.zzemu
            @Override // com.google.android.gms.internal.ads.zzfbx
            public final void zza(Object obj) {
                ((y1) obj).B(s3Var);
            }
        });
    }
}
