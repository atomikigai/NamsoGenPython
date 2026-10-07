package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcpc implements zzhfx {
    private final zzhgp zza;
    private final zzhgp zzb;

    public zzcpc(zzhgp zzhgpVar, zzhgp zzhgpVar2) {
        this.zza = zzhgpVar;
        this.zzb = zzhgpVar2;
    }

    public static zzcze zzc(ScheduledExecutorService scheduledExecutorService, n7.a aVar) {
        return new zzcze(scheduledExecutorService, aVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzcze zzb() {
        return zzc((ScheduledExecutorService) this.zza.zzb(), (n7.a) this.zzb.zzb());
    }
}
