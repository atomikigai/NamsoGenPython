package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.webkit.TracingConfig;
import e6.f2;
import e6.g3;
import e6.j2;
import e6.m1;
import e6.n1;
import e6.q1;
import e6.v2;
import e6.y1;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzbhu extends zzayd implements zzbhv {
    public zzbhu() {
        super("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    @Override // com.google.android.gms.internal.ads.zzayd
    public final boolean zzdF(int i, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        zzbhs zzbhqVar = null;
        n1 m1Var = null;
        switch (i) {
            case 2:
                String strZzq = zzq();
                parcel2.writeNoException();
                parcel2.writeString(strZzq);
                return true;
            case 3:
                List listZzu = zzu();
                parcel2.writeNoException();
                parcel2.writeList(listZzu);
                return true;
            case 4:
                String strZzo = zzo();
                parcel2.writeNoException();
                parcel2.writeString(strZzo);
                return true;
            case 5:
                zzbfy zzbfyVarZzk = zzk();
                parcel2.writeNoException();
                zzaye.zzf(parcel2, zzbfyVarZzk);
                return true;
            case 6:
                String strZzp = zzp();
                parcel2.writeNoException();
                parcel2.writeString(strZzp);
                return true;
            case 7:
                String strZzn = zzn();
                parcel2.writeNoException();
                parcel2.writeString(strZzn);
                return true;
            case 8:
                double dZze = zze();
                parcel2.writeNoException();
                parcel2.writeDouble(dZze);
                return true;
            case 9:
                String strZzt = zzt();
                parcel2.writeNoException();
                parcel2.writeString(strZzt);
                return true;
            case 10:
                String strZzs = zzs();
                parcel2.writeNoException();
                parcel2.writeString(strZzs);
                return true;
            case 11:
                j2 j2VarZzh = zzh();
                parcel2.writeNoException();
                zzaye.zzf(parcel2, j2VarZzh);
                return true;
            case 12:
                String strZzr = zzr();
                parcel2.writeNoException();
                parcel2.writeString(strZzr);
                return true;
            case 13:
                zzx();
                parcel2.writeNoException();
                return true;
            case 14:
                zzbfr zzbfrVarZzi = zzi();
                parcel2.writeNoException();
                zzaye.zzf(parcel2, zzbfrVarZzi);
                return true;
            case 15:
                Bundle bundle = (Bundle) zzaye.zza(parcel, Bundle.CREATOR);
                zzaye.zzc(parcel);
                zzz(bundle);
                parcel2.writeNoException();
                return true;
            case 16:
                Bundle bundle2 = (Bundle) zzaye.zza(parcel, Bundle.CREATOR);
                zzaye.zzc(parcel);
                boolean zZzJ = zzJ(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(zZzJ ? 1 : 0);
                return true;
            case 17:
                Bundle bundle3 = (Bundle) zzaye.zza(parcel, Bundle.CREATOR);
                zzaye.zzc(parcel);
                zzC(bundle3);
                parcel2.writeNoException();
                return true;
            case 18:
                q7.a aVarZzm = zzm();
                parcel2.writeNoException();
                zzaye.zzf(parcel2, aVarZzm);
                return true;
            case 19:
                q7.a aVarZzl = zzl();
                parcel2.writeNoException();
                zzaye.zzf(parcel2, aVarZzl);
                return true;
            case 20:
                Bundle bundleZzf = zzf();
                parcel2.writeNoException();
                zzaye.zze(parcel2, bundleZzf);
                return true;
            case zzbbs.zzt.zzm /* 21 */:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
                    zzbhqVar = iInterfaceQueryLocalInterface instanceof zzbhs ? (zzbhs) iInterfaceQueryLocalInterface : new zzbhq(strongBinder);
                }
                zzaye.zzc(parcel);
                zzG(zzbhqVar);
                parcel2.writeNoException();
                return true;
            case 22:
                zzw();
                parcel2.writeNoException();
                return true;
            case 23:
                List listZzv = zzv();
                parcel2.writeNoException();
                parcel2.writeList(listZzv);
                return true;
            case 24:
                boolean zZzI = zzI();
                parcel2.writeNoException();
                int i11 = zzaye.zza;
                parcel2.writeInt(zZzI ? 1 : 0);
                return true;
            case 25:
                q1 q1VarY = v2.y(parcel.readStrongBinder());
                zzaye.zzc(parcel);
                zzy(q1VarY);
                parcel2.writeNoException();
                return true;
            case 26:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdListener");
                    m1Var = iInterfaceQueryLocalInterface2 instanceof n1 ? (n1) iInterfaceQueryLocalInterface2 : new m1(strongBinder2, "com.google.android.gms.ads.internal.client.IMuteThisAdListener");
                }
                zzaye.zzc(parcel);
                zzE(m1Var);
                parcel2.writeNoException();
                return true;
            case 27:
                zzD();
                parcel2.writeNoException();
                return true;
            case 28:
                zzA();
                parcel2.writeNoException();
                return true;
            case 29:
                zzbfv zzbfvVarZzj = zzj();
                parcel2.writeNoException();
                zzaye.zzf(parcel2, zzbfvVarZzj);
                return true;
            case 30:
                boolean zZzH = zzH();
                parcel2.writeNoException();
                int i12 = zzaye.zza;
                parcel2.writeInt(zZzH ? 1 : 0);
                return true;
            case 31:
                f2 f2VarZzg = zzg();
                parcel2.writeNoException();
                zzaye.zzf(parcel2, f2VarZzg);
                return true;
            case TracingConfig.CATEGORIES_JAVASCRIPT_AND_RENDERING /* 32 */:
                y1 y1VarY = g3.y(parcel.readStrongBinder());
                zzaye.zzc(parcel);
                zzF(y1VarY);
                parcel2.writeNoException();
                return true;
            case 33:
                Bundle bundle4 = (Bundle) zzaye.zza(parcel, Bundle.CREATOR);
                zzaye.zzc(parcel);
                zzB(bundle4);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
