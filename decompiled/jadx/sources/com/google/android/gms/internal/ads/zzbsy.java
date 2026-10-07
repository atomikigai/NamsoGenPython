package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import q7.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzbsy extends zzayd implements zzbsz {
    public zzbsy() {
        super("com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    public static zzbsz zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
        return iInterfaceQueryLocalInterface instanceof zzbsz ? (zzbsz) iInterfaceQueryLocalInterface : new zzbsx(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayd
    public final boolean zzdF(int i, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        switch (i) {
            case 1:
                Intent intent = (Intent) zzaye.zza(parcel, Intent.CREATOR);
                zzaye.zzc(parcel);
                zze(intent);
                break;
            case 2:
                q7.a aVarY = b.y(parcel.readStrongBinder());
                String string = parcel.readString();
                String string2 = parcel.readString();
                zzaye.zzc(parcel);
                zzi(aVarY, string, string2);
                break;
            case 3:
                zzh();
                break;
            case 4:
                q7.a aVarY2 = b.y(parcel.readStrongBinder());
                zzaye.zzc(parcel);
                zzg(aVarY2);
                break;
            case 5:
                String[] strArrCreateStringArray = parcel.createStringArray();
                int[] iArrCreateIntArray = parcel.createIntArray();
                q7.a aVarY3 = b.y(parcel.readStrongBinder());
                zzaye.zzc(parcel);
                zzf(strArrCreateStringArray, iArrCreateIntArray, aVarY3);
                break;
            case 6:
                q7.a aVarY4 = b.y(parcel.readStrongBinder());
                f6.a aVar = (f6.a) zzaye.zza(parcel, f6.a.CREATOR);
                zzaye.zzc(parcel);
                zzj(aVarY4, aVar);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
