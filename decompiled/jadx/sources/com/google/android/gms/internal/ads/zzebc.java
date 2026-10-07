package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import d6.p;
import e6.t;
import h6.k0;
import h6.q;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzebc implements zzgee {
    final /* synthetic */ zzbvx zza;
    final /* synthetic */ zzbvp zzb;

    public zzebc(zzebg zzebgVar, zzbvx zzbvxVar, zzbvp zzbvpVar) {
        this.zza = zzbvxVar;
        this.zzb = zzbvpVar;
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
    public final void zzb(Object obj) {
        Bundle bundle;
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
        try {
            zzbce zzbceVar = zzbcn.zzci;
            t tVar = t.f3437d;
            if (!((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue()) {
                this.zzb.zzf(parcelFileDescriptor);
                return;
            }
            if (((Boolean) tVar.f3440c.zza(zzbcn.zzcj)).booleanValue() && (bundle = this.zza.zzm) != null) {
                String strZza = zzdrv.BINDER_CALL_START.zza();
                p.C.f2983j.getClass();
                bundle.putLong(strZza, System.currentTimeMillis());
            }
            this.zzb.zzg(parcelFileDescriptor, this.zza);
        } catch (RemoteException e) {
            k0.l("Service can't call client", e);
        }
    }
}
