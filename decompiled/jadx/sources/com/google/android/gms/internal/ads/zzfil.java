package com.google.android.gms.internal.ads;

import e6.t;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfil implements zzhfx {
    public static zzfil zza() {
        return zzfik.zza;
    }

    public static zzges zzc() {
        zzges zzgesVar;
        zzbce zzbceVar = zzbcn.zzfG;
        t tVar = t.f3437d;
        if (((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue()) {
            zzgesVar = zzcaj.zzc;
        } else {
            zzgesVar = ((Boolean) tVar.f3440c.zza(zzbcn.zzfF)).booleanValue() ? zzcaj.zza : zzcaj.zze;
        }
        zzhgf.zzb(zzgesVar);
        return zzgesVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    public final /* synthetic */ Object zzb() {
        return zzc();
    }
}
