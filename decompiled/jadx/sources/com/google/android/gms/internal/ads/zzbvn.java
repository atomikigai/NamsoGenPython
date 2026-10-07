package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import h6.q;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbvn extends zzayc implements zzbvp {
    public zzbvn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final void zze(q qVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzd(parcelZza, qVar);
        zzdc(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final void zzf(ParcelFileDescriptor parcelFileDescriptor) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzd(parcelZza, parcelFileDescriptor);
        zzdc(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final void zzg(ParcelFileDescriptor parcelFileDescriptor, zzbvx zzbvxVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzd(parcelZza, parcelFileDescriptor);
        zzaye.zzd(parcelZza, zzbvxVar);
        zzdc(3, parcelZza);
    }
}
