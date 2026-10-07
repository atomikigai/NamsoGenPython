package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbaz extends zzayc implements IInterface {
    public zzbaz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
    }

    public final long zze(zzbax zzbaxVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzd(parcelZza, zzbaxVar);
        Parcel parcelZzdb = zzdb(3, parcelZza);
        long j4 = parcelZzdb.readLong();
        parcelZzdb.recycle();
        return j4;
    }

    public final zzbau zzf(zzbax zzbaxVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzd(parcelZza, zzbaxVar);
        Parcel parcelZzdb = zzdb(1, parcelZza);
        zzbau zzbauVar = (zzbau) zzaye.zza(parcelZzdb, zzbau.CREATOR);
        parcelZzdb.recycle();
        return zzbauVar;
    }

    public final zzbau zzg(zzbax zzbaxVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzd(parcelZza, zzbaxVar);
        Parcel parcelZzdb = zzdb(2, parcelZza);
        zzbau zzbauVar = (zzbau) zzaye.zza(parcelZzdb, zzbau.CREATOR);
        parcelZzdb.recycle();
        return zzbauVar;
    }
}
