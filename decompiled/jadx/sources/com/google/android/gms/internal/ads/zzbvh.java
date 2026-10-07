package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbvh extends zzayc implements zzbvj {
    public zzbvh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdsService");
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final void zze(zzbvb zzbvbVar, zzbvm zzbvmVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzd(parcelZza, zzbvbVar);
        zzaye.zzf(parcelZza, zzbvmVar);
        zzdc(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final void zzf(zzbuv zzbuvVar, zzbvm zzbvmVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzd(parcelZza, zzbuvVar);
        zzaye.zzf(parcelZza, zzbvmVar);
        zzdc(1, parcelZza);
    }
}
