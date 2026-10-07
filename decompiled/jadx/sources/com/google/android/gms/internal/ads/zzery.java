package com.google.android.gms.internal.ads;

import e6.t;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzery implements zzhfx {
    private final zzhgp zza;

    public zzery(zzhgp zzhgpVar, zzhgp zzhgpVar2) {
        this.zza = zzhgpVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    public final Object zzb() {
        zzfzt zzfztVarZzn;
        zzeqr zzeqrVarZza = zzeqt.zza();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.zza.zzb();
        zzbce zzbceVar = zzbcn.zzef;
        t tVar = t.f3437d;
        if (((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue()) {
            zzfztVarZzn = zzfzt.zzo(new zzeun(zzeqrVarZza, ((Integer) tVar.f3440c.zza(zzbcn.zzeg)).intValue(), scheduledExecutorService));
        } else {
            zzfztVarZzn = zzfzt.zzn();
        }
        zzhgf.zzb(zzfztVarZzn);
        return zzfztVarZzn;
    }
}
