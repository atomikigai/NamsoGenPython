package com.google.android.gms.internal.ads;

import e6.t;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzesl implements zzhfx {
    private final zzhgp zza;
    private final zzhgp zzb;
    private final zzhgp zzc;
    private final zzhgp zzd;

    public zzesl(zzhgp zzhgpVar, zzhgp zzhgpVar2, zzhgp zzhgpVar3, zzhgp zzhgpVar4) {
        this.zza = zzhgpVar;
        this.zzb = zzhgpVar2;
        this.zzc = zzhgpVar3;
        this.zzd = zzhgpVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    public final Object zzb() {
        zzevo zzevoVarZzb = ((zzevq) this.zza).zzb();
        zzeqp zzeqpVar = (zzeqp) this.zzb.zzb();
        List list = (List) this.zzc.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.zzd.zzb();
        if (list.contains("35")) {
            return new zzeun(zzeqpVar, ((Integer) t.f3437d.f3440c.zza(zzbcn.zzlN)).intValue(), scheduledExecutorService);
        }
        return new zzeun(zzevoVarZzb, ((Integer) t.f3437d.f3440c.zza(zzbcn.zzlN)).intValue(), scheduledExecutorService);
    }
}
