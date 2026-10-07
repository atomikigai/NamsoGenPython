package com.google.android.gms.internal.ads;

import h6.p;
import i6.h;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzbzv extends p {
    final /* synthetic */ zzbzz zza;

    public zzbzv(zzbzz zzbzzVar) {
        this.zza = zzbzzVar;
    }

    @Override // h6.p
    public final void zza() {
        zzbzz zzbzzVar = this.zza;
        zzbcq zzbcqVar = new zzbcq(zzbzzVar.zze, zzbzzVar.zzf.f5213a);
        synchronized (this.zza.zza) {
            try {
                zzbct zzbctVar = d6.p.C.f2985l;
                zzbct.zza(this.zza.zzh, zzbcqVar);
            } catch (IllegalArgumentException e) {
                h.h("Cannot config CSI reporter.", e);
            }
        }
    }
}
