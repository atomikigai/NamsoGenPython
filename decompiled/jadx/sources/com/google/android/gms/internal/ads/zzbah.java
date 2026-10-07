package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import e6.h2;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzbah extends zzayd implements zzbai {
    public zzbah() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    public static zzbai zze(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
        return iInterfaceQueryLocalInterface instanceof zzbai ? (zzbai) iInterfaceQueryLocalInterface : new zzbag(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayd
    public final boolean zzdF(int i, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        zzbaf zzbadVar;
        if (i == 1) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                zzbadVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
                zzbadVar = iInterfaceQueryLocalInterface instanceof zzbaf ? (zzbaf) iInterfaceQueryLocalInterface : new zzbad(strongBinder);
            }
            zzaye.zzc(parcel);
            zzd(zzbadVar);
        } else if (i == 2) {
            parcel.readInt();
            zzaye.zzc(parcel);
        } else {
            if (i != 3) {
                return false;
            }
            h2 h2Var = (h2) zzaye.zza(parcel, h2.CREATOR);
            zzaye.zzc(parcel);
            zzc(h2Var);
        }
        parcel2.writeNoException();
        return true;
    }
}
