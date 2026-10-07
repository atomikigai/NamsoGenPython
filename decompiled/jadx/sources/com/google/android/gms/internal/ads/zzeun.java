package com.google.android.gms.internal.ads;

import d6.p;
import e6.t;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzeun implements zzevz {
    private final zzevz zza;
    private final long zzb;
    private final ScheduledExecutorService zzc;

    public zzeun(zzevz zzevzVar, long j4, ScheduledExecutorService scheduledExecutorService) {
        this.zza = zzevzVar;
        this.zzb = j4;
        this.zzc = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final int zza() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final m9.a zzb() {
        m9.a aVarZzb = this.zza.zzb();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzcq)).booleanValue()) {
            timeUnit = TimeUnit.MICROSECONDS;
        }
        long j4 = this.zzb;
        if (j4 > 0) {
            aVarZzb = zzgei.zzo(aVarZzb, j4, timeUnit, this.zzc);
        }
        return zzgei.zzf(aVarZzb, Throwable.class, new zzgdp() { // from class: com.google.android.gms.internal.ads.zzeum
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final m9.a zza(Object obj) {
                return this.zza.zzc((Throwable) obj);
            }
        }, zzcaj.zzf);
    }

    public final m9.a zzc(Throwable th) throws Exception {
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzcp)).booleanValue()) {
            zzevz zzevzVar = this.zza;
            p.C.f2982g.zzw(th, "OptionalSignalTimeout:" + zzevzVar.zza());
        }
        return zzgei.zzh(null);
    }
}
