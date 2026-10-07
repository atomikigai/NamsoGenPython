package com.google.android.gms.internal.ads;

import e6.t;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzesg implements zzhfx {
    private final zzhgp zza;
    private final zzhgp zzb;
    private final zzhgp zzc;

    public zzesg(zzhgp zzhgpVar, zzhgp zzhgpVar2, zzhgp zzhgpVar3, zzhgp zzhgpVar4) {
        this.zza = zzhgpVar2;
        this.zzb = zzhgpVar3;
        this.zzc = zzhgpVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    public final Object zzb() {
        zzets zzetsVarZza = zzetu.zza();
        zzeqp zzeqpVar = (zzeqp) this.zza.zzb();
        List list = (List) this.zzb.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.zzc.zzb();
        if (list.contains("24")) {
            return new zzeun(zzeqpVar, ((Integer) t.f3437d.f3440c.zza(zzbcn.zzlS)).intValue(), scheduledExecutorService);
        }
        return new zzeun(zzetsVarZza, ((Integer) t.f3437d.f3440c.zza(zzbcn.zzlS)).intValue(), scheduledExecutorService);
    }
}
