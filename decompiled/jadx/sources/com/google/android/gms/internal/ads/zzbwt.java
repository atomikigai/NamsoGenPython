package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import q7.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzbwt extends zzayd implements zzbwu {
    public zzbwt() {
        super("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    public static zzbwu zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
        return iInterfaceQueryLocalInterface instanceof zzbwu ? (zzbwu) iInterfaceQueryLocalInterface : new zzbws(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayd
    public final boolean zzdF(int i, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        switch (i) {
            case 1:
                q7.a aVarY = b.y(parcel.readStrongBinder());
                zzaye.zzc(parcel);
                zzl(aVarY);
                break;
            case 2:
                q7.a aVarY2 = b.y(parcel.readStrongBinder());
                int i11 = parcel.readInt();
                zzaye.zzc(parcel);
                zzk(aVarY2, i11);
                break;
            case 3:
                q7.a aVarY3 = b.y(parcel.readStrongBinder());
                zzaye.zzc(parcel);
                zzi(aVarY3);
                break;
            case 4:
                q7.a aVarY4 = b.y(parcel.readStrongBinder());
                zzaye.zzc(parcel);
                zzj(aVarY4);
                break;
            case 5:
                q7.a aVarY5 = b.y(parcel.readStrongBinder());
                zzaye.zzc(parcel);
                zzo(aVarY5);
                break;
            case 6:
                q7.a aVarY6 = b.y(parcel.readStrongBinder());
                zzaye.zzc(parcel);
                zzf(aVarY6);
                break;
            case 7:
                q7.a aVarY7 = b.y(parcel.readStrongBinder());
                zzbwv zzbwvVar = (zzbwv) zzaye.zza(parcel, zzbwv.CREATOR);
                zzaye.zzc(parcel);
                zzm(aVarY7, zzbwvVar);
                break;
            case 8:
                q7.a aVarY8 = b.y(parcel.readStrongBinder());
                zzaye.zzc(parcel);
                zze(aVarY8);
                break;
            case 9:
                q7.a aVarY9 = b.y(parcel.readStrongBinder());
                int i12 = parcel.readInt();
                zzaye.zzc(parcel);
                zzg(aVarY9, i12);
                break;
            case 10:
                q7.a aVarY10 = b.y(parcel.readStrongBinder());
                zzaye.zzc(parcel);
                zzh(aVarY10);
                break;
            case 11:
                q7.a aVarY11 = b.y(parcel.readStrongBinder());
                zzaye.zzc(parcel);
                zzn(aVarY11);
                break;
            case 12:
                zzaye.zzc(parcel);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
