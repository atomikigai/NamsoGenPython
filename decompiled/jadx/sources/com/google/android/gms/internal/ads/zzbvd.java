package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbvd extends zzayc implements zzbvf {
    public zzbvd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final void zze(zzbvx zzbvxVar, zzbvp zzbvpVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzd(parcelZza, zzbvxVar);
        zzaye.zzf(parcelZza, zzbvpVar);
        zzdc(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final void zzf(zzbvx zzbvxVar, zzbvp zzbvpVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzd(parcelZza, zzbvxVar);
        zzaye.zzf(parcelZza, zzbvpVar);
        zzdc(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final void zzg(zzbvx zzbvxVar, zzbvp zzbvpVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzd(parcelZza, zzbvxVar);
        zzaye.zzf(parcelZza, zzbvpVar);
        zzdc(4, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final void zzh(String str, zzbvp zzbvpVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzaye.zzf(parcelZza, zzbvpVar);
        zzdc(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final void zzi(zzbuz zzbuzVar, zzbvq zzbvqVar) throws RemoteException {
        throw null;
    }
}
