package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzeif {
    private final Executor zza;
    private final ScheduledExecutorService zzb;
    private final zzcrt zzc;
    private final zzeiv zzd;
    private final zzfln zze;
    private final zzgfa zzf = zzgfa.zze();
    private final AtomicBoolean zzg = new AtomicBoolean();
    private zzeig zzh;
    private zzfff zzi;

    public zzeif(Executor executor, ScheduledExecutorService scheduledExecutorService, zzcrt zzcrtVar, zzeiv zzeivVar, zzfln zzflnVar) {
        this.zza = executor;
        this.zzb = scheduledExecutorService;
        this.zzc = zzcrtVar;
        this.zzd = zzeivVar;
        this.zze = zzflnVar;
    }

    private final synchronized m9.a zzd(zzfet zzfetVar) {
        Iterator it = zzfetVar.zza.iterator();
        while (it.hasNext()) {
            zzefb zzefbVarZza = this.zzc.zza(zzfetVar.zzb, (String) it.next());
            if (zzefbVarZza != null && zzefbVarZza.zzb(this.zzi, zzfetVar)) {
                return zzgei.zzo(zzefbVarZza.zza(this.zzi, zzfetVar), zzfetVar.zzR, TimeUnit.MILLISECONDS, this.zzb);
            }
        }
        return zzgei.zzg(new zzdwn(3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zze(zzfet zzfetVar) {
        m9.a aVarZzd = zzd(zzfetVar);
        this.zzd.zzf(this.zzi, zzfetVar, aVarZzd, this.zze);
        zzgei.zzr(aVarZzd, new zzeie(this, zzfetVar), this.zza);
    }

    public final synchronized m9.a zzb(zzfff zzfffVar) {
        try {
            if (!this.zzg.getAndSet(true)) {
                if (zzfffVar.zzb.zza.isEmpty()) {
                    this.zzf.zzd(new zzeiz(3, zzejc.zzc(zzfffVar)));
                } else {
                    this.zzi = zzfffVar;
                    this.zzh = new zzeig(zzfffVar, this.zzd, this.zzf);
                    this.zzd.zzk(zzfffVar.zzb.zza);
                    zzfet zzfetVarZza = this.zzh.zza();
                    while (zzfetVarZza != null) {
                        zze(zzfetVarZza);
                        zzfetVarZza = this.zzh.zza();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.zzf;
    }
}
