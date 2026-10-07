package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import e6.h2;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzbpl extends zzayd implements zzbpm {
    public zzbpl() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    public static zzbpm zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        return iInterfaceQueryLocalInterface instanceof zzbpm ? (zzbpm) iInterfaceQueryLocalInterface : new zzbpk(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayd
    public final boolean zzdF(int i, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        switch (i) {
            case 1:
                zze();
                break;
            case 2:
                zzf();
                break;
            case 3:
                int i11 = parcel.readInt();
                zzaye.zzc(parcel);
                zzg(i11);
                break;
            case 4:
                zzn();
                break;
            case 5:
                zzp();
                break;
            case 6:
                zzo();
                break;
            case 7:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
                }
                zzaye.zzc(parcel);
                break;
            case 8:
                zzm();
                break;
            case 9:
                String string = parcel.readString();
                String string2 = parcel.readString();
                zzaye.zzc(parcel);
                zzq(string, string2);
                break;
            case 10:
                zzbgr.zzb(parcel.readStrongBinder());
                parcel.readString();
                zzaye.zzc(parcel);
                break;
            case 11:
                zzv();
                break;
            case 12:
                parcel.readString();
                zzaye.zzc(parcel);
                break;
            case 13:
                zzy();
                break;
            case 14:
                zzbwv zzbwvVar = (zzbwv) zzaye.zza(parcel, zzbwv.CREATOR);
                zzaye.zzc(parcel);
                zzs(zzbwvVar);
                break;
            case 15:
                zzw();
                break;
            case 16:
                zzbwz zzbwzVarZzb = zzbwy.zzb(parcel.readStrongBinder());
                zzaye.zzc(parcel);
                zzt(zzbwzVarZzb);
                break;
            case 17:
                int i12 = parcel.readInt();
                zzaye.zzc(parcel);
                zzj(i12);
                break;
            case 18:
                zzu();
                break;
            case 19:
                zzaye.zzc(parcel);
                break;
            case 20:
                zzx();
                break;
            case zzbbs.zzt.zzm /* 21 */:
                String string3 = parcel.readString();
                zzaye.zzc(parcel);
                zzl(string3);
                break;
            case 22:
                int i13 = parcel.readInt();
                String string4 = parcel.readString();
                zzaye.zzc(parcel);
                zzi(i13, string4);
                break;
            case 23:
                h2 h2Var = (h2) zzaye.zza(parcel, h2.CREATOR);
                zzaye.zzc(parcel);
                zzh(h2Var);
                break;
            case 24:
                h2 h2Var2 = (h2) zzaye.zza(parcel, h2.CREATOR);
                zzaye.zzc(parcel);
                zzk(h2Var2);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
