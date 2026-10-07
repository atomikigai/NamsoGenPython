package com.google.android.gms.internal.ads;

import e6.m0;
import e6.s0;
import e6.u0;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfma extends u0 {
    private final zzfmg zza;

    public zzfma(zzfmg zzfmgVar) {
        super("com.google.android.gms.ads.internal.client.IAdPreloader");
        this.zza = zzfmgVar;
    }

    @Override // e6.v0
    public final zzbaf zze(String str) {
        return this.zza.zza(str);
    }

    @Override // e6.v0
    public final m0 zzf(String str) {
        return this.zza.zzb(str);
    }

    @Override // e6.v0
    public final zzbxc zzg(String str) {
        return this.zza.zzc(str);
    }

    @Override // e6.v0
    public final void zzh(zzbpg zzbpgVar) {
        this.zza.zze(zzbpgVar);
    }

    @Override // e6.v0
    public final synchronized void zzi(List list, s0 s0Var) {
        this.zza.zzf(list, s0Var);
    }

    @Override // e6.v0
    public final boolean zzj(String str) {
        return this.zza.zzg(str);
    }

    @Override // e6.v0
    public final boolean zzk(String str) {
        return this.zza.zzh(str);
    }

    @Override // e6.v0
    public final boolean zzl(String str) {
        return this.zza.zzi(str);
    }
}
