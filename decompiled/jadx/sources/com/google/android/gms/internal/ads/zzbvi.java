package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzbvi extends zzayd implements zzbvj {
    public zzbvi() {
        super("com.google.android.gms.ads.internal.request.IAdsService");
    }

    @Override // com.google.android.gms.internal.ads.zzayd
    public final boolean zzdF(int i, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        zzbvm zzbvkVar = null;
        if (i == 1) {
            zzbuv zzbuvVar = (zzbuv) zzaye.zza(parcel, zzbuv.CREATOR);
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
                zzbvkVar = iInterfaceQueryLocalInterface instanceof zzbvm ? (zzbvm) iInterfaceQueryLocalInterface : new zzbvk(strongBinder);
            }
            zzaye.zzc(parcel);
            zzf(zzbuvVar, zzbvkVar);
        } else if (i == 2) {
            IBinder strongBinder2 = parcel.readStrongBinder();
            if (strongBinder2 != null) {
                strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
            }
            zzaye.zzc(parcel);
        } else {
            if (i != 3) {
                return false;
            }
            zzbvb zzbvbVar = (zzbvb) zzaye.zza(parcel, zzbvb.CREATOR);
            IBinder strongBinder3 = parcel.readStrongBinder();
            if (strongBinder3 != null) {
                IInterface iInterfaceQueryLocalInterface2 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
                zzbvkVar = iInterfaceQueryLocalInterface2 instanceof zzbvm ? (zzbvm) iInterfaceQueryLocalInterface2 : new zzbvk(strongBinder3);
            }
            zzaye.zzc(parcel);
            zze(zzbvbVar, zzbvkVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
