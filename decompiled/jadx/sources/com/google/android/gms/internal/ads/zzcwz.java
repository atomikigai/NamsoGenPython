package com.google.android.gms.internal.ads;

import e6.h2;
import e6.t;
import i6.h;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcwz extends zzdcc implements zzcwq {
    private final ScheduledExecutorService zzb;
    private ScheduledFuture zzc;
    private boolean zzd;

    public zzcwz(zzcwy zzcwyVar, Set set, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        super(set);
        this.zzd = false;
        this.zzb = scheduledExecutorService;
        zzo(zzcwyVar, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzcwq
    public final void zza(final h2 h2Var) {
        zzq(new zzdcb() { // from class: com.google.android.gms.internal.ads.zzcwr
            @Override // com.google.android.gms.internal.ads.zzdcb
            public final void zza(Object obj) {
                ((zzcwq) obj).zza(h2Var);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcwq
    public final void zzb() {
        zzq(new zzdcb() { // from class: com.google.android.gms.internal.ads.zzcws
            @Override // com.google.android.gms.internal.ads.zzdcb
            public final void zza(Object obj) {
                ((zzcwq) obj).zzb();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcwq
    public final void zzc(final zzdgu zzdguVar) {
        if (this.zzd) {
            return;
        }
        ScheduledFuture scheduledFuture = this.zzc;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        zzq(new zzdcb() { // from class: com.google.android.gms.internal.ads.zzcwu
            @Override // com.google.android.gms.internal.ads.zzdcb
            public final void zza(Object obj) {
                ((zzcwq) obj).zzc(zzdguVar);
            }
        });
    }

    public final /* synthetic */ void zzd() {
        synchronized (this) {
            h.d("Timeout waiting for show call succeed to be called.");
            zzc(new zzdgu("Timeout for show call succeed."));
            this.zzd = true;
        }
    }

    public final synchronized void zze() {
        ScheduledFuture scheduledFuture = this.zzc;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
    }

    public final void zzf() {
        this.zzc = this.zzb.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcwt
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzd();
            }
        }, ((Integer) t.f3437d.f3440c.zza(zzbcn.zzkq)).intValue(), TimeUnit.MILLISECONDS);
    }
}
