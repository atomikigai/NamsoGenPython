package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcsf {
    private final Executor zza;
    private final ScheduledExecutorService zzb;
    private final m9.a zzc;
    private volatile boolean zzd = true;

    public zzcsf(Executor executor, ScheduledExecutorService scheduledExecutorService, m9.a aVar) {
        this.zza = executor;
        this.zzb = scheduledExecutorService;
        this.zzc = aVar;
    }

    public static /* bridge */ /* synthetic */ void zzb(final zzcsf zzcsfVar, List list, final zzgee zzgeeVar) {
        if (list == null || list.isEmpty()) {
            zzcsfVar.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcsa
                @Override // java.lang.Runnable
                public final void run() {
                    zzgeeVar.zza(new zzdwn(3));
                }
            });
            return;
        }
        m9.a aVarZzh = zzgei.zzh(null);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            final m9.a aVar = (m9.a) it.next();
            aVarZzh = zzgei.zzn(zzgei.zzf(aVarZzh, Throwable.class, new zzgdp() { // from class: com.google.android.gms.internal.ads.zzcsb
                @Override // com.google.android.gms.internal.ads.zzgdp
                public final m9.a zza(Object obj) {
                    zzgeeVar.zza((Throwable) obj);
                    return zzgei.zzh(null);
                }
            }, zzcsfVar.zza), new zzgdp() { // from class: com.google.android.gms.internal.ads.zzcsc
                @Override // com.google.android.gms.internal.ads.zzgdp
                public final m9.a zza(Object obj) {
                    return this.zza.zza(zzgeeVar, aVar, (zzcrq) obj);
                }
            }, zzcsfVar.zza);
        }
        zzgei.zzr(aVarZzh, new zzcse(zzcsfVar, zzgeeVar), zzcsfVar.zza);
    }

    public final /* synthetic */ m9.a zza(zzgee zzgeeVar, m9.a aVar, zzcrq zzcrqVar) throws Exception {
        if (zzcrqVar != null) {
            zzgeeVar.zzb(zzcrqVar);
        }
        return zzgei.zzo(aVar, ((Long) zzbfa.zza.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzb);
    }

    public final /* synthetic */ void zzd() {
        this.zzd = false;
    }

    public final void zze(zzgee zzgeeVar) {
        zzgei.zzr(this.zzc, new zzcsd(this, zzgeeVar), this.zza);
    }

    public final boolean zzf() {
        return this.zzd;
    }
}
