package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzexy implements zzhfx {
    private final zzhgp zza;
    private final zzhgp zzb;
    private final zzhgp zzc;

    public zzexy(zzhgp zzhgpVar, zzhgp zzhgpVar2, zzhgp zzhgpVar3, zzhgp zzhgpVar4, zzhgp zzhgpVar5) {
        this.zza = zzhgpVar;
        this.zzb = zzhgpVar3;
        this.zzc = zzhgpVar4;
    }

    public static zzexw zza(String str, zzbao zzbaoVar, zzbzz zzbzzVar, ScheduledExecutorService scheduledExecutorService, zzges zzgesVar) {
        return new zzexw(str, zzbaoVar, zzbzzVar, scheduledExecutorService, zzgesVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzexw(((zzeyw) this.zza).zza(), zzclc.zza(), (zzbzz) this.zzb.zzb(), (ScheduledExecutorService) this.zzc.zzb(), zzfin.zzc());
    }
}
