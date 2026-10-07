package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import e6.j2;
import q7.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzbmd extends zzayd implements zzbme {
    public zzbmd() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAd");
    }

    @Override // com.google.android.gms.internal.ads.zzayd
    public final boolean zzdF(int i, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        zzbmh zzbmfVar;
        if (i == 3) {
            j2 j2VarZzb = zzb();
            parcel2.writeNoException();
            zzaye.zzf(parcel2, j2VarZzb);
            return true;
        }
        if (i == 4) {
            zzd();
            parcel2.writeNoException();
            return true;
        }
        if (i == 5) {
            q7.a aVarY = b.y(parcel.readStrongBinder());
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                zzbmfVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
                zzbmfVar = iInterfaceQueryLocalInterface instanceof zzbmh ? (zzbmh) iInterfaceQueryLocalInterface : new zzbmf(strongBinder);
            }
            zzaye.zzc(parcel);
            zzf(aVarY, zzbmfVar);
            parcel2.writeNoException();
            return true;
        }
        if (i == 6) {
            q7.a aVarY2 = b.y(parcel.readStrongBinder());
            zzaye.zzc(parcel);
            zze(aVarY2);
            parcel2.writeNoException();
            return true;
        }
        if (i != 7) {
            return false;
        }
        zzbfv zzbfvVarZzc = zzc();
        parcel2.writeNoException();
        zzaye.zzf(parcel2, zzbfvVarZzc);
        return true;
    }
}
