package com.google.android.gms.internal.ads;

import e6.t;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzchx implements zzhfx {
    private final zzhgp zza;

    public zzchx(zzhgp zzhgpVar, zzhgp zzhgpVar2) {
        this.zza = zzhgpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    public final Object zzb() {
        Set setSingleton = ((Boolean) t.f3437d.f3440c.zza(zzbcn.zzbJ)).booleanValue() ? Collections.singleton(new zzded((zzdur) this.zza.zzb(), zzfin.zzc())) : Collections.EMPTY_SET;
        zzhgf.zzb(setSingleton);
        return setSingleton;
    }
}
