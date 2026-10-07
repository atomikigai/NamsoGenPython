package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import h6.q;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbvq extends zzayc implements IInterface {
    public zzbvq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.ITrustlessTokenListener");
    }

    public final void zze(q qVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzd(parcelZza, qVar);
        zzdc(2, parcelZza);
    }

    public final void zzf(String str, zzbuz zzbuzVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzaye.zzd(parcelZza, zzbuzVar);
        zzdc(1, parcelZza);
    }
}
