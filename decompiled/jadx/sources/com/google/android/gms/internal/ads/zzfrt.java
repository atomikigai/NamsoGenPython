package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import q7.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzfrt extends zzayd implements zzfru {
    public zzfrt() {
        super("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    @Override // com.google.android.gms.internal.ads.zzayd
    public final boolean zzdF(int i, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        switch (i) {
            case 2:
                b.y(parcel.readStrongBinder());
                parcel.readString();
                zzaye.zzc(parcel);
                break;
            case 3:
                break;
            case 4:
                parcel.createIntArray();
                zzaye.zzc(parcel);
                break;
            case 5:
                parcel.createByteArray();
                zzaye.zzc(parcel);
                break;
            case 6:
                parcel.readInt();
                zzaye.zzc(parcel);
                break;
            case 7:
                parcel.readInt();
                zzaye.zzc(parcel);
                break;
            case 8:
                b.y(parcel.readStrongBinder());
                parcel.readString();
                parcel.readString();
                zzaye.zzc(parcel);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
