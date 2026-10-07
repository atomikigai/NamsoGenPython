package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzczc implements Runnable {
    private final WeakReference zza;

    @Override // java.lang.Runnable
    public final void run() {
        zzcze zzczeVar = (zzcze) this.zza.get();
        if (zzczeVar != null) {
            zzczeVar.zzq(new zzdcb() { // from class: com.google.android.gms.internal.ads.zzcza
                @Override // com.google.android.gms.internal.ads.zzdcb
                public final void zza(Object obj) throws ExecutionException, InterruptedException {
                    ((zzcyy) obj).zzb();
                }
            });
        }
    }
}
