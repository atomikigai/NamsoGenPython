package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import q7.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzbgh extends zzayd implements zzbgi {
    public zzbgh() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
    }

    public static zzbgi zze(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
        return iInterfaceQueryLocalInterface instanceof zzbgi ? (zzbgi) iInterfaceQueryLocalInterface : new zzbgg(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayd
    public final boolean zzdF(int i, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        if (i == 1) {
            q7.a aVarY = b.y(parcel.readStrongBinder());
            zzaye.zzc(parcel);
            zzc(aVarY);
        } else if (i == 2) {
            zzd();
        } else {
            if (i != 3) {
                return false;
            }
            q7.a aVarY2 = b.y(parcel.readStrongBinder());
            zzaye.zzc(parcel);
            zzb(aVarY2);
        }
        parcel2.writeNoException();
        return true;
    }
}
