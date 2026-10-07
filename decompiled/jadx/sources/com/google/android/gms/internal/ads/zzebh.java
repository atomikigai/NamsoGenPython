package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzebh implements zzhfx {
    private final zzhgp zza;
    private final zzhgp zzb;
    private final zzhgp zzc;
    private final zzhgp zzd;
    private final zzhgp zze;

    public zzebh(zzhgp zzhgpVar, zzhgp zzhgpVar2, zzhgp zzhgpVar3, zzhgp zzhgpVar4, zzhgp zzhgpVar5, zzhgp zzhgpVar6, zzhgp zzhgpVar7, zzhgp zzhgpVar8) {
        this.zza = zzhgpVar;
        this.zzb = zzhgpVar4;
        this.zzc = zzhgpVar5;
        this.zzd = zzhgpVar6;
        this.zze = zzhgpVar8;
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzebg(((zzchq) this.zza).zza(), zzfin.zzc(), zzcin.zza(), ((zzcia) this.zzb).zzb(), ((zzebz) this.zzc).zzb(), (ArrayDeque) this.zzd.zzb(), zzcik.zza(), (zzfko) this.zze.zzb());
    }
}
