package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdte implements zzhfx {
    private final zzdta zza;
    private final zzhgp zzb;

    public zzdte(zzdta zzdtaVar, zzhgp zzhgpVar, zzhgp zzhgpVar2) {
        this.zza = zzdtaVar;
        this.zzb = zzhgpVar;
    }

    public static Set zza(zzdta zzdtaVar, zzdtk zzdtkVar, Executor executor) {
        Set setZzd = zzdta.zzd(zzdtkVar, executor);
        zzhgf.zzb(setZzd);
        return setZzd;
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    public final /* bridge */ /* synthetic */ Object zzb() {
        return zza(this.zza, (zzdtk) this.zzb.zzb(), zzfin.zzc());
    }
}
