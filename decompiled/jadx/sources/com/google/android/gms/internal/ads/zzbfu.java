package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import e6.j2;
import q7.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzbfu extends zzayd implements zzbfv {
    public zzbfu() {
        super("com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    @Override // com.google.android.gms.internal.ads.zzayd
    public final boolean zzdF(int i, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        zzbhg zzbhgVar;
        switch (i) {
            case 2:
                float fZze = zze();
                parcel2.writeNoException();
                parcel2.writeFloat(fZze);
                return true;
            case 3:
                q7.a aVarY = b.y(parcel.readStrongBinder());
                zzaye.zzc(parcel);
                zzj(aVarY);
                parcel2.writeNoException();
                return true;
            case 4:
                q7.a aVarZzi = zzi();
                parcel2.writeNoException();
                zzaye.zzf(parcel2, aVarZzi);
                return true;
            case 5:
                float fZzg = zzg();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzg);
                return true;
            case 6:
                float fZzf = zzf();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzf);
                return true;
            case 7:
                j2 j2VarZzh = zzh();
                parcel2.writeNoException();
                zzaye.zzf(parcel2, j2VarZzh);
                return true;
            case 8:
                boolean zZzl = zzl();
                parcel2.writeNoException();
                int i11 = zzaye.zza;
                parcel2.writeInt(zZzl ? 1 : 0);
                return true;
            case 9:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    zzbhgVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnMediaContentChangedListener");
                    zzbhgVar = iInterfaceQueryLocalInterface instanceof zzbhg ? (zzbhg) iInterfaceQueryLocalInterface : new zzbhg(strongBinder);
                }
                zzaye.zzc(parcel);
                zzm(zzbhgVar);
                parcel2.writeNoException();
                return true;
            case 10:
                boolean zZzk = zzk();
                parcel2.writeNoException();
                int i12 = zzaye.zza;
                parcel2.writeInt(zZzk ? 1 : 0);
                return true;
            default:
                return false;
        }
    }
}
