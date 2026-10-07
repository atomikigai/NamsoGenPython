package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import q7.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzbzg extends zzayd implements zzbzh {
    public zzbzg() {
        super("com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    public static zzbzh zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
        return iInterfaceQueryLocalInterface instanceof zzbzh ? (zzbzh) iInterfaceQueryLocalInterface : new zzbzf(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayd
    public final boolean zzdF(int i, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        zzbze zzbzcVar = null;
        switch (i) {
            case 1:
                q7.a aVarY = b.y(parcel.readStrongBinder());
                zzbzl zzbzlVar = (zzbzl) zzaye.zza(parcel, zzbzl.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalCallback");
                    zzbzcVar = iInterfaceQueryLocalInterface instanceof zzbze ? (zzbze) iInterfaceQueryLocalInterface : new zzbzc(strongBinder);
                }
                zzaye.zzc(parcel);
                zzf(aVarY, zzbzlVar, zzbzcVar);
                parcel2.writeNoException();
                return true;
            case 2:
                q7.a aVarY2 = b.y(parcel.readStrongBinder());
                zzaye.zzc(parcel);
                zzk(aVarY2);
                parcel2.writeNoException();
                return true;
            case 3:
                b.y(parcel.readStrongBinder());
                b.y(parcel.readStrongBinder());
                zzaye.zzc(parcel);
                parcel2.writeNoException();
                zzaye.zzf(parcel2, null);
                return true;
            case 4:
                b.y(parcel.readStrongBinder());
                zzaye.zzc(parcel);
                parcel2.writeNoException();
                zzaye.zzf(parcel2, null);
                return true;
            case 5:
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(Uri.CREATOR);
                q7.a aVarY3 = b.y(parcel.readStrongBinder());
                zzbtv zzbtvVarZzb = zzbtu.zzb(parcel.readStrongBinder());
                zzaye.zzc(parcel);
                zzm(arrayListCreateTypedArrayList, aVarY3, zzbtvVarZzb);
                parcel2.writeNoException();
                return true;
            case 6:
                ArrayList arrayListCreateTypedArrayList2 = parcel.createTypedArrayList(Uri.CREATOR);
                q7.a aVarY4 = b.y(parcel.readStrongBinder());
                zzbtv zzbtvVarZzb2 = zzbtu.zzb(parcel.readStrongBinder());
                zzaye.zzc(parcel);
                zzl(arrayListCreateTypedArrayList2, aVarY4, zzbtvVarZzb2);
                parcel2.writeNoException();
                return true;
            case 7:
                zzbue zzbueVar = (zzbue) zzaye.zza(parcel, zzbue.CREATOR);
                zzaye.zzc(parcel);
                zzg(zzbueVar);
                parcel2.writeNoException();
                return true;
            case 8:
                q7.a aVarY5 = b.y(parcel.readStrongBinder());
                zzaye.zzc(parcel);
                zzj(aVarY5);
                parcel2.writeNoException();
                return true;
            case 9:
                ArrayList arrayListCreateTypedArrayList3 = parcel.createTypedArrayList(Uri.CREATOR);
                q7.a aVarY6 = b.y(parcel.readStrongBinder());
                zzbtv zzbtvVarZzb3 = zzbtu.zzb(parcel.readStrongBinder());
                zzaye.zzc(parcel);
                zzi(arrayListCreateTypedArrayList3, aVarY6, zzbtvVarZzb3);
                parcel2.writeNoException();
                return true;
            case 10:
                ArrayList arrayListCreateTypedArrayList4 = parcel.createTypedArrayList(Uri.CREATOR);
                q7.a aVarY7 = b.y(parcel.readStrongBinder());
                zzbtv zzbtvVarZzb4 = zzbtu.zzb(parcel.readStrongBinder());
                zzaye.zzc(parcel);
                zzh(arrayListCreateTypedArrayList4, aVarY7, zzbtvVarZzb4);
                parcel2.writeNoException();
                return true;
            case 11:
                q7.a aVarY8 = b.y(parcel.readStrongBinder());
                q7.a aVarY9 = b.y(parcel.readStrongBinder());
                String string = parcel.readString();
                q7.a aVarY10 = b.y(parcel.readStrongBinder());
                zzaye.zzc(parcel);
                q7.a aVarZze = zze(aVarY8, aVarY9, string, aVarY10);
                parcel2.writeNoException();
                zzaye.zzf(parcel2, aVarZze);
                return true;
            default:
                return false;
        }
    }
}
