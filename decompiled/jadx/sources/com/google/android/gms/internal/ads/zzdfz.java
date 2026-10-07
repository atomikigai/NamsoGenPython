package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdfz implements zzhfx {
    private final zzdfn zza;
    private final zzhgp zzb;

    public zzdfz(zzdfn zzdfnVar, zzhgp zzhgpVar) {
        this.zza = zzdfnVar;
        this.zzb = zzhgpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setZzf = this.zza.zzf((zzcvj) this.zzb.zzb());
        zzhgf.zzb(setZzf);
        return setZzf;
    }
}
