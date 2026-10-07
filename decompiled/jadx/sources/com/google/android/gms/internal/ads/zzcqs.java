package com.google.android.gms.internal.ads;

import e6.t;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcqs implements zzaym {
    private final zzcfk zza;
    private final Executor zzb;
    private final AtomicReference zzc = new AtomicReference();

    public zzcqs(zzcfk zzcfkVar, Executor executor) {
        this.zza = zzcfkVar;
        this.zzb = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzaym
    public final synchronized void zzdp(zzayl zzaylVar) {
        if (this.zza != null) {
            if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzmm)).booleanValue()) {
                if (zzaylVar.zzj) {
                    AtomicReference atomicReference = this.zzc;
                    Boolean bool = Boolean.TRUE;
                    if (!bool.equals(atomicReference.getAndSet(bool))) {
                        Executor executor = this.zzb;
                        final zzcfk zzcfkVar = this.zza;
                        Objects.requireNonNull(zzcfkVar);
                        executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcqq
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzcfkVar.onResume();
                            }
                        });
                        return;
                    }
                }
                if (!zzaylVar.zzj) {
                    AtomicReference atomicReference2 = this.zzc;
                    Boolean bool2 = Boolean.FALSE;
                    if (!bool2.equals(atomicReference2.getAndSet(bool2))) {
                        Executor executor2 = this.zzb;
                        final zzcfk zzcfkVar2 = this.zza;
                        Objects.requireNonNull(zzcfkVar2);
                        executor2.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcqr
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzcfkVar2.onPause();
                            }
                        });
                    }
                }
            }
        }
    }
}
