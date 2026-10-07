package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import e6.f2;
import e6.g3;
import e6.m0;
import e6.y1;
import q7.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzbae extends zzayd implements zzbaf {
    public zzbae() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    public static zzbaf zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
        return iInterfaceQueryLocalInterface instanceof zzbaf ? (zzbaf) iInterfaceQueryLocalInterface : new zzbad(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayd
    public final boolean zzdF(int i, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        zzbam zzbakVar;
        switch (i) {
            case 2:
                m0 m0VarZze = zze();
                parcel2.writeNoException();
                zzaye.zzf(parcel2, m0VarZze);
                return true;
            case 3:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdPresentationCallback");
                }
                zzaye.zzc(parcel);
                parcel2.writeNoException();
                return true;
            case 4:
                q7.a aVarY = b.y(parcel.readStrongBinder());
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 == null) {
                    zzbakVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
                    zzbakVar = iInterfaceQueryLocalInterface instanceof zzbam ? (zzbam) iInterfaceQueryLocalInterface : new zzbak(strongBinder2);
                }
                zzaye.zzc(parcel);
                zzi(aVarY, zzbakVar);
                parcel2.writeNoException();
                return true;
            case 5:
                f2 f2VarZzf = zzf();
                parcel2.writeNoException();
                zzaye.zzf(parcel2, f2VarZzf);
                return true;
            case 6:
                boolean zZzg = zzaye.zzg(parcel);
                zzaye.zzc(parcel);
                zzg(zZzg);
                parcel2.writeNoException();
                return true;
            case 7:
                y1 y1VarY = g3.y(parcel.readStrongBinder());
                zzaye.zzc(parcel);
                zzh(y1VarY);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
