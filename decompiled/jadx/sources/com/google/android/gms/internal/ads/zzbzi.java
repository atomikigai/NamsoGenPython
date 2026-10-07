package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbzi extends zzayc implements zzbzk {
    public zzbzi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbzk
    public final zzbzh zze(q7.a aVar, zzbpg zzbpgVar, int i) throws RemoteException {
        zzbzh zzbzfVar;
        Parcel parcelZza = zza();
        zzaye.zzf(parcelZza, aVar);
        zzaye.zzf(parcelZza, zzbpgVar);
        parcelZza.writeInt(243799000);
        Parcel parcelZzdb = zzdb(2, parcelZza);
        IBinder strongBinder = parcelZzdb.readStrongBinder();
        if (strongBinder == null) {
            zzbzfVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
            zzbzfVar = iInterfaceQueryLocalInterface instanceof zzbzh ? (zzbzh) iInterfaceQueryLocalInterface : new zzbzf(strongBinder);
        }
        parcelZzdb.recycle();
        return zzbzfVar;
    }
}
