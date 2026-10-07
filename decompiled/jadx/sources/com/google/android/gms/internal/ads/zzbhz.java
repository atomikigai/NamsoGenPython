package com.google.android.gms.internal.ads;

import com.google.ads.mediation.e;
import z5.j;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzbhz extends zzbhb {
    final /* synthetic */ zzbic zza;

    public /* synthetic */ zzbhz(zzbic zzbicVar, zzbib zzbibVar) {
        this.zza = zzbicVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final void zze(zzbgs zzbgsVar, String str) {
        zzbic zzbicVar = this.zza;
        if (zzbicVar.zzb == null) {
            return;
        }
        j jVar = zzbicVar.zzb;
        e eVar = (e) jVar;
        eVar.f1956b.zze(eVar.f1955a, zzbicVar.zzf(zzbgsVar), str);
    }
}
