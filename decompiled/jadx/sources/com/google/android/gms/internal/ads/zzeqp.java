package com.google.android.gms.internal.ads;

import e6.t;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzeqp implements zzevz {
    private final AtomicReference zza = new AtomicReference();
    private final AtomicReference zzb = new AtomicReference(Boolean.FALSE);
    private final n7.a zzc;
    private final Executor zzd;
    private final zzevz zze;
    private final long zzf;
    private final zzdsm zzg;

    public zzeqp(zzevz zzevzVar, long j4, n7.a aVar, Executor executor, zzdsm zzdsmVar) {
        this.zzc = aVar;
        this.zze = zzevzVar;
        this.zzf = j4;
        this.zzd = executor;
        this.zzg = zzdsmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final int zza() {
        return this.zze.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final m9.a zzb() {
        zzeqo zzeqoVar;
        zzbce zzbceVar = zzbcn.zzlw;
        t tVar = t.f3437d;
        if (((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue()) {
            if (((Boolean) tVar.f3440c.zza(zzbcn.zzlv)).booleanValue() && !((Boolean) this.zzb.getAndSet(Boolean.TRUE)).booleanValue()) {
                ScheduledExecutorService scheduledExecutorService = zzcaj.zzd;
                Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzeqm
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzeqp zzeqpVar = this.zza;
                        zzeqpVar.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeqn
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzeqpVar.zzd();
                            }
                        });
                    }
                };
                long j4 = this.zzf;
                scheduledExecutorService.scheduleWithFixedDelay(runnable, j4, j4, TimeUnit.MILLISECONDS);
            }
            synchronized (this) {
                try {
                    zzeqoVar = (zzeqo) this.zza.get();
                    if (zzeqoVar == null) {
                        zzeqo zzeqoVar2 = new zzeqo(this.zze.zzb(), this.zzf, this.zzc);
                        this.zza.set(zzeqoVar2);
                        return zzeqoVar2.zza;
                    }
                    if (!((Boolean) this.zzb.get()).booleanValue() && zzeqoVar.zza()) {
                        m9.a aVar = zzeqoVar.zza;
                        zzevz zzevzVar = this.zze;
                        zzeqo zzeqoVar3 = new zzeqo(zzevzVar.zzb(), this.zzf, this.zzc);
                        this.zza.set(zzeqoVar3);
                        if (((Boolean) tVar.f3440c.zza(zzbcn.zzlx)).booleanValue()) {
                            if (((Boolean) tVar.f3440c.zza(zzbcn.zzly)).booleanValue()) {
                                zzdsl zzdslVarZza = this.zzg.zza();
                                zzdslVarZza.zzb("action", "scs");
                                zzdslVarZza.zzb("sid", String.valueOf(this.zze.zza()));
                                zzdslVarZza.zzf();
                            }
                            return aVar;
                        }
                        zzeqoVar = zzeqoVar3;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else {
            zzeqoVar = (zzeqo) this.zza.get();
            if (zzeqoVar == null || zzeqoVar.zza()) {
                zzevz zzevzVar2 = this.zze;
                zzeqo zzeqoVar4 = new zzeqo(zzevzVar2.zzb(), this.zzf, this.zzc);
                this.zza.set(zzeqoVar4);
                zzeqoVar = zzeqoVar4;
            }
        }
        return zzeqoVar.zza;
    }

    public final /* synthetic */ void zzd() {
        this.zza.set(new zzeqo(this.zze.zzb(), this.zzf, this.zzc));
    }
}
