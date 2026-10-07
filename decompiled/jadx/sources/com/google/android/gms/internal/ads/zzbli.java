package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbli extends zzayc implements IInterface {
    public zzbli(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
    }

    public final void zze(zzblc zzblcVar, zzblh zzblhVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzd(parcelZza, zzblcVar);
        zzaye.zzf(parcelZza, zzblhVar);
        zzdd(2, parcelZza);
    }
}
