package com.google.android.gms.internal.ads;

import e6.t;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzesh implements zzhfx {
    private final zzhgp zza;
    private final zzhgp zzb;

    public zzesh(zzhgp zzhgpVar, zzhgp zzhgpVar2) {
        this.zza = zzhgpVar;
        this.zzb = zzhgpVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    public final Object zzb() {
        return new zzeun(((zzetx) this.zza).zzb(), ((Integer) t.f3437d.f3440c.zza(zzbcn.zzmi)).intValue(), (ScheduledExecutorService) this.zzb.zzb());
    }
}
