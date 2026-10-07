package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import e6.j2;
import java.util.List;
import q7.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzbpu extends zzayd implements zzbpv {
    public zzbpu() {
        super("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    public static zzbpv zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
        return iInterfaceQueryLocalInterface instanceof zzbpv ? (zzbpv) iInterfaceQueryLocalInterface : new zzbpt(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayd
    public final boolean zzdF(int i, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        switch (i) {
            case 2:
                String strZzs = zzs();
                parcel2.writeNoException();
                parcel2.writeString(strZzs);
                return true;
            case 3:
                List listZzv = zzv();
                parcel2.writeNoException();
                parcel2.writeList(listZzv);
                return true;
            case 4:
                String strZzq = zzq();
                parcel2.writeNoException();
                parcel2.writeString(strZzq);
                return true;
            case 5:
                zzbfy zzbfyVarZzl = zzl();
                parcel2.writeNoException();
                zzaye.zzf(parcel2, zzbfyVarZzl);
                return true;
            case 6:
                String strZzr = zzr();
                parcel2.writeNoException();
                parcel2.writeString(strZzr);
                return true;
            case 7:
                String strZzp = zzp();
                parcel2.writeNoException();
                parcel2.writeString(strZzp);
                return true;
            case 8:
                double dZze = zze();
                parcel2.writeNoException();
                parcel2.writeDouble(dZze);
                return true;
            case 9:
                String strZzu = zzu();
                parcel2.writeNoException();
                parcel2.writeString(strZzu);
                return true;
            case 10:
                String strZzt = zzt();
                parcel2.writeNoException();
                parcel2.writeString(strZzt);
                return true;
            case 11:
                j2 j2VarZzj = zzj();
                parcel2.writeNoException();
                zzaye.zzf(parcel2, j2VarZzj);
                return true;
            case 12:
                parcel2.writeNoException();
                zzaye.zzf(parcel2, null);
                return true;
            case 13:
                q7.a aVarZzm = zzm();
                parcel2.writeNoException();
                zzaye.zzf(parcel2, aVarZzm);
                return true;
            case 14:
                q7.a aVarZzn = zzn();
                parcel2.writeNoException();
                zzaye.zzf(parcel2, aVarZzn);
                return true;
            case 15:
                q7.a aVarZzo = zzo();
                parcel2.writeNoException();
                zzaye.zzf(parcel2, aVarZzo);
                return true;
            case 16:
                Bundle bundleZzi = zzi();
                parcel2.writeNoException();
                zzaye.zze(parcel2, bundleZzi);
                return true;
            case 17:
                boolean zZzB = zzB();
                parcel2.writeNoException();
                int i11 = zzaye.zza;
                parcel2.writeInt(zZzB ? 1 : 0);
                return true;
            case 18:
                boolean zZzA = zzA();
                parcel2.writeNoException();
                int i12 = zzaye.zza;
                parcel2.writeInt(zZzA ? 1 : 0);
                return true;
            case 19:
                zzx();
                parcel2.writeNoException();
                return true;
            case 20:
                q7.a aVarY = b.y(parcel.readStrongBinder());
                zzaye.zzc(parcel);
                zzw(aVarY);
                parcel2.writeNoException();
                return true;
            case zzbbs.zzt.zzm /* 21 */:
                q7.a aVarY2 = b.y(parcel.readStrongBinder());
                q7.a aVarY3 = b.y(parcel.readStrongBinder());
                q7.a aVarY4 = b.y(parcel.readStrongBinder());
                zzaye.zzc(parcel);
                zzy(aVarY2, aVarY3, aVarY4);
                parcel2.writeNoException();
                return true;
            case 22:
                q7.a aVarY5 = b.y(parcel.readStrongBinder());
                zzaye.zzc(parcel);
                zzz(aVarY5);
                parcel2.writeNoException();
                return true;
            case 23:
                float fZzf = zzf();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzf);
                return true;
            case 24:
                float fZzh = zzh();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzh);
                return true;
            case 25:
                float fZzg = zzg();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzg);
                return true;
            default:
                return false;
        }
    }
}
