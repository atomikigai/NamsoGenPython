package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzexb implements zzhfx {
    private final zzhgp zza;
    private final zzhgp zzb;
    private final zzhgp zzc;
    private final zzhgp zzd;
    private final zzhgp zze;

    public zzexb(zzhgp zzhgpVar, zzhgp zzhgpVar2, zzhgp zzhgpVar3, zzhgp zzhgpVar4, zzhgp zzhgpVar5, zzhgp zzhgpVar6, zzhgp zzhgpVar7) {
        this.zza = zzhgpVar2;
        this.zzb = zzhgpVar3;
        this.zzc = zzhgpVar5;
        this.zzd = zzhgpVar6;
        this.zze = zzhgpVar7;
    }

    public static zzewz zza(zzbzq zzbzqVar, Context context, ScheduledExecutorService scheduledExecutorService, Executor executor, int i, boolean z4, boolean z10) {
        return new zzewz(zzbzqVar, context, scheduledExecutorService, executor, i, z4, z10);
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzewz(zzclk.zza(), ((zzchq) this.zza).zza(), (ScheduledExecutorService) this.zzb.zzb(), zzfin.zzc(), ((zzeyx) this.zzc).zzb().intValue(), ((zzeyy) this.zzd).zzb().booleanValue(), ((zzeza) this.zze).zzb().booleanValue());
    }
}
