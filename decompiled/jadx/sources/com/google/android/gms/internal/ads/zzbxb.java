package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import e6.f2;
import e6.g3;
import e6.o3;
import e6.v1;
import e6.w1;
import e6.y1;
import q7.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzbxb extends zzayd implements zzbxc {
    public zzbxb() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    public static zzbxc zzq(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
        return iInterfaceQueryLocalInterface instanceof zzbxc ? (zzbxc) iInterfaceQueryLocalInterface : new zzbxa(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayd
    public final boolean zzdF(int i, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        zzbxj zzbxhVar = null;
        zzbxj zzbxhVar2 = null;
        w1 v1Var = null;
        zzbxk zzbxkVar = null;
        zzbxf zzbxdVar = null;
        switch (i) {
            case 1:
                o3 o3Var = (o3) zzaye.zza(parcel, o3.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    zzbxhVar = iInterfaceQueryLocalInterface instanceof zzbxj ? (zzbxj) iInterfaceQueryLocalInterface : new zzbxh(strongBinder);
                }
                zzaye.zzc(parcel);
                zzf(o3Var, zzbxhVar);
                parcel2.writeNoException();
                return true;
            case 2:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
                    zzbxdVar = iInterfaceQueryLocalInterface2 instanceof zzbxf ? (zzbxf) iInterfaceQueryLocalInterface2 : new zzbxd(strongBinder2);
                }
                zzaye.zzc(parcel);
                zzk(zzbxdVar);
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zZzo = zzo();
                parcel2.writeNoException();
                int i11 = zzaye.zza;
                parcel2.writeInt(zZzo ? 1 : 0);
                return true;
            case 4:
                String strZze = zze();
                parcel2.writeNoException();
                parcel2.writeString(strZze);
                return true;
            case 5:
                q7.a aVarY = b.y(parcel.readStrongBinder());
                zzaye.zzc(parcel);
                zzm(aVarY);
                parcel2.writeNoException();
                return true;
            case 6:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
                    zzbxkVar = iInterfaceQueryLocalInterface3 instanceof zzbxk ? (zzbxk) iInterfaceQueryLocalInterface3 : new zzbxk(strongBinder3);
                }
                zzaye.zzc(parcel);
                zzp(zzbxkVar);
                parcel2.writeNoException();
                return true;
            case 7:
                zzbxq zzbxqVar = (zzbxq) zzaye.zza(parcel, zzbxq.CREATOR);
                zzaye.zzc(parcel);
                zzl(zzbxqVar);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnAdMetadataChangedListener");
                    v1Var = iInterfaceQueryLocalInterface4 instanceof w1 ? (w1) iInterfaceQueryLocalInterface4 : new v1(strongBinder4, "com.google.android.gms.ads.internal.client.IOnAdMetadataChangedListener");
                }
                zzaye.zzc(parcel);
                zzi(v1Var);
                parcel2.writeNoException();
                return true;
            case 9:
                Bundle bundleZzb = zzb();
                parcel2.writeNoException();
                zzaye.zze(parcel2, bundleZzb);
                return true;
            case 10:
                q7.a aVarY2 = b.y(parcel.readStrongBinder());
                boolean zZzg = zzaye.zzg(parcel);
                zzaye.zzc(parcel);
                zzn(aVarY2, zZzg);
                parcel2.writeNoException();
                return true;
            case 11:
                zzbwz zzbwzVarZzd = zzd();
                parcel2.writeNoException();
                zzaye.zzf(parcel2, zzbwzVarZzd);
                return true;
            case 12:
                f2 f2VarZzc = zzc();
                parcel2.writeNoException();
                zzaye.zzf(parcel2, f2VarZzc);
                return true;
            case 13:
                y1 y1VarY = g3.y(parcel.readStrongBinder());
                zzaye.zzc(parcel);
                zzj(y1VarY);
                parcel2.writeNoException();
                return true;
            case 14:
                o3 o3Var2 = (o3) zzaye.zza(parcel, o3.CREATOR);
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    zzbxhVar2 = iInterfaceQueryLocalInterface5 instanceof zzbxj ? (zzbxj) iInterfaceQueryLocalInterface5 : new zzbxh(strongBinder5);
                }
                zzaye.zzc(parcel);
                zzg(o3Var2, zzbxhVar2);
                parcel2.writeNoException();
                return true;
            case 15:
                boolean zZzg2 = zzaye.zzg(parcel);
                zzaye.zzc(parcel);
                zzh(zZzg2);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
