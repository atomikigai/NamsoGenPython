package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import h6.q;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzbvo extends zzayd implements zzbvp {
    public zzbvo() {
        super("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.zzayd
    public final boolean zzdF(int i, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        if (i == 1) {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) zzaye.zza(parcel, ParcelFileDescriptor.CREATOR);
            zzaye.zzc(parcel);
            zzf(parcelFileDescriptor);
        } else if (i == 2) {
            q qVar = (q) zzaye.zza(parcel, q.CREATOR);
            zzaye.zzc(parcel);
            zze(qVar);
        } else {
            if (i != 3) {
                return false;
            }
            ParcelFileDescriptor parcelFileDescriptor2 = (ParcelFileDescriptor) zzaye.zza(parcel, ParcelFileDescriptor.CREATOR);
            zzbvx zzbvxVar = (zzbvx) zzaye.zza(parcel, zzbvx.CREATOR);
            zzaye.zzc(parcel);
            zzg(parcelFileDescriptor2, zzbvxVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
