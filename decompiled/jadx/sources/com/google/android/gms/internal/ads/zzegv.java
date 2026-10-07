package com.google.android.gms.internal.ads;

import e6.t;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzegv implements zzefb {
    private final zzcqh zza;
    private final zzegc zzb;
    private final zzges zzc;
    private final zzcwo zzd;
    private final ScheduledExecutorService zze;
    private final zzdsh zzf;

    public zzegv(zzcqh zzcqhVar, zzegc zzegcVar, zzcwo zzcwoVar, ScheduledExecutorService scheduledExecutorService, zzges zzgesVar, zzdsh zzdshVar) {
        this.zza = zzcqhVar;
        this.zzb = zzegcVar;
        this.zzd = zzcwoVar;
        this.zze = scheduledExecutorService;
        this.zzc = zzgesVar;
        this.zzf = zzdshVar;
    }

    @Override // com.google.android.gms.internal.ads.zzefb
    public final m9.a zza(final zzfff zzfffVar, final zzfet zzfetVar) {
        return this.zzc.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzegt
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzc(zzfffVar, zzfetVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzefb
    public final boolean zzb(zzfff zzfffVar, zzfet zzfetVar) {
        zzbhp zzbhpVarZza = zzfffVar.zza.zza.zza();
        boolean zZzb = this.zzb.zzb(zzfffVar, zzfetVar);
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzlH)).booleanValue()) {
            this.zzf.zzb().put("has_dbl", zzbhpVarZza != null ? "1" : "0");
            this.zzf.zzb().put("crdb", true == zZzb ? "1" : "0");
        }
        return zzbhpVarZza != null && zZzb;
    }

    public final /* synthetic */ zzcpd zzc(final zzfff zzfffVar, final zzfet zzfetVar) throws Exception {
        return this.zza.zzb(new zzcsg(zzfffVar, zzfetVar, null), new zzcqy(zzfffVar.zza.zza.zza(), new Runnable() { // from class: com.google.android.gms.internal.ads.zzegs
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzf(zzfffVar, zzfetVar);
            }
        })).zza();
    }

    public final /* synthetic */ void zzf(zzfff zzfffVar, zzfet zzfetVar) {
        zzgei.zzr(zzgei.zzo(this.zzb.zza(zzfffVar, zzfetVar), zzfetVar.zzR, TimeUnit.SECONDS, this.zze), new zzegu(this), this.zzc);
    }
}
