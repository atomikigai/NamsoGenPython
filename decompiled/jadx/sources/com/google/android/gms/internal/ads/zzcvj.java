package com.google.android.gms.internal.ads;

import e6.h2;
import e6.t;
import h6.k0;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcvj implements zzcwm, zzddq, zzdbg, zzcxc, zzaym {
    private final zzcxe zza;
    private final zzfet zzb;
    private final ScheduledExecutorService zzc;
    private final Executor zzd;
    private ScheduledFuture zzf;
    private final String zzh;
    private final zzgfa zze = zzgfa.zze();
    private final AtomicBoolean zzg = new AtomicBoolean();

    public zzcvj(zzcxe zzcxeVar, zzfet zzfetVar, ScheduledExecutorService scheduledExecutorService, Executor executor, String str) {
        this.zza = zzcxeVar;
        this.zzb = zzfetVar;
        this.zzc = scheduledExecutorService;
        this.zzd = executor;
        this.zzh = str;
    }

    private final boolean zzm() {
        return this.zzh.equals("com.google.ads.mediation.admob.AdMobAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzc() {
        zzfet zzfetVar = this.zzb;
        if (zzfetVar.zze == 3) {
            return;
        }
        int i = zzfetVar.zzY;
        if (i == 0 || i == 1) {
            if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzle)).booleanValue() && zzm()) {
                return;
            }
            this.zza.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaym
    public final void zzdp(zzayl zzaylVar) {
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzle)).booleanValue() && zzm() && zzaylVar.zzj && this.zzg.compareAndSet(false, true) && this.zzb.zze != 3) {
            k0.k("Full screen 1px impression occurred");
            this.zza.zza();
        }
    }

    public final /* synthetic */ void zzh() {
        synchronized (this) {
            try {
                if (this.zze.isDone()) {
                    return;
                }
                this.zze.zzc(Boolean.TRUE);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbg
    public final synchronized void zzj() {
        try {
            if (this.zze.isDone()) {
                return;
            }
            ScheduledFuture scheduledFuture = this.zzf;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            this.zze.zzc(Boolean.TRUE);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddq
    public final void zzk() {
        if (this.zzb.zze == 3) {
            return;
        }
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzbC)).booleanValue()) {
            zzfet zzfetVar = this.zzb;
            if (zzfetVar.zzY == 2) {
                if (zzfetVar.zzq == 0) {
                    this.zza.zza();
                } else {
                    zzgei.zzr(this.zze, new zzcvi(this), this.zzd);
                    this.zzf = this.zzc.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcvh
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.zzh();
                        }
                    }, this.zzb.zzq, TimeUnit.MILLISECONDS);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxc
    public final synchronized void zzq(h2 h2Var) {
        try {
            if (this.zze.isDone()) {
                return;
            }
            ScheduledFuture scheduledFuture = this.zzf;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            this.zze.zzd(new Exception());
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zza() {
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzdbg
    public final void zzi() {
    }

    @Override // com.google.android.gms.internal.ads.zzddq
    public final void zzl() {
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzds(zzbwj zzbwjVar, String str, String str2) {
    }
}
