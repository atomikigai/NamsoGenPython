package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import e6.j2;
import java.util.List;
import q7.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzbgr extends zzayd implements zzbgs {
    public zzbgr() {
        super("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    public static zzbgs zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
        return iInterfaceQueryLocalInterface instanceof zzbgs ? (zzbgs) iInterfaceQueryLocalInterface : new zzbgq(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayd
    public final boolean zzdF(int i, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        switch (i) {
            case 1:
                String string = parcel.readString();
                zzaye.zzc(parcel);
                String strZzj = zzj(string);
                parcel2.writeNoException();
                parcel2.writeString(strZzj);
                return true;
            case 2:
                String string2 = parcel.readString();
                zzaye.zzc(parcel);
                zzbfy zzbfyVarZzg = zzg(string2);
                parcel2.writeNoException();
                zzaye.zzf(parcel2, zzbfyVarZzg);
                return true;
            case 3:
                List<String> listZzk = zzk();
                parcel2.writeNoException();
                parcel2.writeStringList(listZzk);
                return true;
            case 4:
                String strZzi = zzi();
                parcel2.writeNoException();
                parcel2.writeString(strZzi);
                return true;
            case 5:
                String string3 = parcel.readString();
                zzaye.zzc(parcel);
                zzn(string3);
                parcel2.writeNoException();
                return true;
            case 6:
                zzo();
                parcel2.writeNoException();
                return true;
            case 7:
                j2 j2VarZze = zze();
                parcel2.writeNoException();
                zzaye.zzf(parcel2, j2VarZze);
                return true;
            case 8:
                zzl();
                parcel2.writeNoException();
                return true;
            case 9:
                q7.a aVarZzh = zzh();
                parcel2.writeNoException();
                zzaye.zzf(parcel2, aVarZzh);
                return true;
            case 10:
                q7.a aVarY = b.y(parcel.readStrongBinder());
                zzaye.zzc(parcel);
                boolean zZzs = zzs(aVarY);
                parcel2.writeNoException();
                parcel2.writeInt(zZzs ? 1 : 0);
                return true;
            case 11:
                parcel2.writeNoException();
                zzaye.zzf(parcel2, null);
                return true;
            case 12:
                boolean zZzq = zzq();
                parcel2.writeNoException();
                int i11 = zzaye.zza;
                parcel2.writeInt(zZzq ? 1 : 0);
                return true;
            case 13:
                boolean zZzt = zzt();
                parcel2.writeNoException();
                int i12 = zzaye.zza;
                parcel2.writeInt(zZzt ? 1 : 0);
                return true;
            case 14:
                q7.a aVarY2 = b.y(parcel.readStrongBinder());
                zzaye.zzc(parcel);
                zzp(aVarY2);
                parcel2.writeNoException();
                return true;
            case 15:
                zzm();
                parcel2.writeNoException();
                return true;
            case 16:
                zzbfv zzbfvVarZzf = zzf();
                parcel2.writeNoException();
                zzaye.zzf(parcel2, zzbfvVarZzf);
                return true;
            case 17:
                q7.a aVarY3 = b.y(parcel.readStrongBinder());
                zzaye.zzc(parcel);
                boolean zZzr = zzr(aVarY3);
                parcel2.writeNoException();
                parcel2.writeInt(zZzr ? 1 : 0);
                return true;
            default:
                return false;
        }
    }
}
