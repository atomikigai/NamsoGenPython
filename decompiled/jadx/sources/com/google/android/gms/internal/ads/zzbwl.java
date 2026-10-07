package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import e6.f2;
import e6.p0;
import e6.q0;
import q7.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzbwl extends zzayd implements zzbwm {
    public zzbwl() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
    }

    @Override // com.google.android.gms.internal.ads.zzayd
    public final boolean zzdF(int i, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        if (i == 1) {
            zzbwq zzbwqVar = (zzbwq) zzaye.zza(parcel, zzbwq.CREATOR);
            zzaye.zzc(parcel);
            zzg(zzbwqVar);
            parcel2.writeNoException();
            return true;
        }
        if (i == 2) {
            zzq();
            parcel2.writeNoException();
            return true;
        }
        zzbwp zzbwnVar = null;
        zzbwk zzbwkVar = null;
        q0 p0Var = null;
        if (i == 3) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                zzbwnVar = iInterfaceQueryLocalInterface instanceof zzbwp ? (zzbwp) iInterfaceQueryLocalInterface : new zzbwn(strongBinder);
            }
            zzaye.zzc(parcel);
            zzo(zzbwnVar);
            parcel2.writeNoException();
            return true;
        }
        if (i == 34) {
            boolean zZzg = zzaye.zzg(parcel);
            zzaye.zzc(parcel);
            zzn(zZzg);
            parcel2.writeNoException();
            return true;
        }
        switch (i) {
            case 5:
                boolean zZzs = zzs();
                parcel2.writeNoException();
                int i11 = zzaye.zza;
                parcel2.writeInt(zZzs ? 1 : 0);
                return true;
            case 6:
                zzh();
                parcel2.writeNoException();
                return true;
            case 7:
                zzj();
                parcel2.writeNoException();
                return true;
            case 8:
                zze();
                parcel2.writeNoException();
                return true;
            case 9:
                q7.a aVarY = b.y(parcel.readStrongBinder());
                zzaye.zzc(parcel);
                zzi(aVarY);
                parcel2.writeNoException();
                return true;
            case 10:
                q7.a aVarY2 = b.y(parcel.readStrongBinder());
                zzaye.zzc(parcel);
                zzk(aVarY2);
                parcel2.writeNoException();
                return true;
            case 11:
                q7.a aVarY3 = b.y(parcel.readStrongBinder());
                zzaye.zzc(parcel);
                zzf(aVarY3);
                parcel2.writeNoException();
                return true;
            case 12:
                String strZzd = zzd();
                parcel2.writeNoException();
                parcel2.writeString(strZzd);
                return true;
            case 13:
                String string = parcel.readString();
                zzaye.zzc(parcel);
                zzp(string);
                parcel2.writeNoException();
                return true;
            case 14:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
                    p0Var = iInterfaceQueryLocalInterface2 instanceof q0 ? (q0) iInterfaceQueryLocalInterface2 : new p0(strongBinder2);
                }
                zzaye.zzc(parcel);
                zzl(p0Var);
                parcel2.writeNoException();
                return true;
            case 15:
                Bundle bundleZzb = zzb();
                parcel2.writeNoException();
                zzaye.zze(parcel2, bundleZzb);
                return true;
            case 16:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
                    zzbwkVar = iInterfaceQueryLocalInterface3 instanceof zzbwk ? (zzbwk) iInterfaceQueryLocalInterface3 : new zzbwk(strongBinder3);
                }
                zzaye.zzc(parcel);
                zzu(zzbwkVar);
                parcel2.writeNoException();
                return true;
            case 17:
                parcel.readString();
                zzaye.zzc(parcel);
                parcel2.writeNoException();
                return true;
            case 18:
                q7.a aVarY4 = b.y(parcel.readStrongBinder());
                zzaye.zzc(parcel);
                zzr(aVarY4);
                parcel2.writeNoException();
                return true;
            case 19:
                String string2 = parcel.readString();
                zzaye.zzc(parcel);
                zzm(string2);
                parcel2.writeNoException();
                return true;
            case 20:
                boolean zZzt = zzt();
                parcel2.writeNoException();
                int i12 = zzaye.zza;
                parcel2.writeInt(zZzt ? 1 : 0);
                return true;
            case zzbbs.zzt.zzm /* 21 */:
                f2 f2VarZzc = zzc();
                parcel2.writeNoException();
                zzaye.zzf(parcel2, f2VarZzc);
                return true;
            default:
                return false;
        }
    }
}
