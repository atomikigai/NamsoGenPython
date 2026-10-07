package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import e6.h2;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzbxe extends zzayd implements zzbxf {
    public zzbxe() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzayd
    public final boolean zzdF(int i, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        zzbwz zzbwxVar;
        switch (i) {
            case 1:
                zzj();
                break;
            case 2:
                zzg();
                break;
            case 3:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    zzbwxVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
                    zzbwxVar = iInterfaceQueryLocalInterface instanceof zzbwz ? (zzbwz) iInterfaceQueryLocalInterface : new zzbwx(strongBinder);
                }
                zzaye.zzc(parcel);
                zzk(zzbwxVar);
                break;
            case 4:
                int i11 = parcel.readInt();
                zzaye.zzc(parcel);
                zzh(i11);
                break;
            case 5:
                h2 h2Var = (h2) zzaye.zza(parcel, h2.CREATOR);
                zzaye.zzc(parcel);
                zzi(h2Var);
                break;
            case 6:
                zzf();
                break;
            case 7:
                zze();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
