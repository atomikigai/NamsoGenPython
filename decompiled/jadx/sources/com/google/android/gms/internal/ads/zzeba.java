package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import h6.k0;
import h6.q;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzeba implements zzgee {
    final /* synthetic */ zzbuz zza;
    final /* synthetic */ zzbvq zzb;

    public zzeba(zzebg zzebgVar, zzbvq zzbvqVar, zzbuz zzbuzVar) {
        this.zzb = zzbvqVar;
        this.zza = zzbuzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final void zza(Throwable th) {
        try {
            this.zzb.zze(q.g(th));
        } catch (RemoteException e) {
            k0.l("Service can't call client", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        try {
            this.zzb.zzf((String) obj, this.zza);
        } catch (RemoteException e) {
            k0.l("Service can't call client", e);
        }
    }
}
