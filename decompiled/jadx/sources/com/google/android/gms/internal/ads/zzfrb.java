package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfrb extends zzayc implements IInterface {
    public zzfrb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    public final zzfqz zze(zzfqx zzfqxVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzd(parcelZza, zzfqxVar);
        Parcel parcelZzdb = zzdb(1, parcelZza);
        zzfqz zzfqzVar = (zzfqz) zzaye.zza(parcelZzdb, zzfqz.CREATOR);
        parcelZzdb.recycle();
        return zzfqzVar;
    }

    public final zzfri zzf(zzfrg zzfrgVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzd(parcelZza, zzfrgVar);
        Parcel parcelZzdb = zzdb(3, parcelZza);
        zzfri zzfriVar = (zzfri) zzaye.zza(parcelZzdb, zzfri.CREATOR);
        parcelZzdb.recycle();
        return zzfriVar;
    }

    public final void zzg(zzfqu zzfquVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzd(parcelZza, zzfquVar);
        zzdc(2, parcelZza);
    }
}
