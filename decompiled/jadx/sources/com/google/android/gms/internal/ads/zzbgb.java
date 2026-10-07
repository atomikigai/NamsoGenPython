package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import q7.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzbgb extends zzayd implements zzbgc {
    public zzbgb() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    public static zzbgc zzdA(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
        return iInterfaceQueryLocalInterface instanceof zzbgc ? (zzbgc) iInterfaceQueryLocalInterface : new zzbga(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayd
    public final boolean zzdF(int i, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        zzbfv zzbftVar;
        switch (i) {
            case 1:
                String string = parcel.readString();
                q7.a aVarY = b.y(parcel.readStrongBinder());
                zzaye.zzc(parcel);
                zzdv(string, aVarY);
                parcel2.writeNoException();
                return true;
            case 2:
                String string2 = parcel.readString();
                zzaye.zzc(parcel);
                q7.a aVarZzb = zzb(string2);
                parcel2.writeNoException();
                zzaye.zzf(parcel2, aVarZzb);
                return true;
            case 3:
                q7.a aVarY2 = b.y(parcel.readStrongBinder());
                zzaye.zzc(parcel);
                zzdz(aVarY2);
                parcel2.writeNoException();
                return true;
            case 4:
                zzc();
                parcel2.writeNoException();
                return true;
            case 5:
                b.y(parcel.readStrongBinder());
                parcel.readInt();
                zzaye.zzc(parcel);
                parcel2.writeNoException();
                return true;
            case 6:
                q7.a aVarY3 = b.y(parcel.readStrongBinder());
                zzaye.zzc(parcel);
                zzdw(aVarY3);
                parcel2.writeNoException();
                return true;
            case 7:
                q7.a aVarY4 = b.y(parcel.readStrongBinder());
                zzaye.zzc(parcel);
                zzd(aVarY4);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    zzbftVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
                    zzbftVar = iInterfaceQueryLocalInterface instanceof zzbfv ? (zzbfv) iInterfaceQueryLocalInterface : new zzbft(strongBinder);
                }
                zzaye.zzc(parcel);
                zzdx(zzbftVar);
                parcel2.writeNoException();
                return true;
            case 9:
                q7.a aVarY5 = b.y(parcel.readStrongBinder());
                zzaye.zzc(parcel);
                zzdy(aVarY5);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
