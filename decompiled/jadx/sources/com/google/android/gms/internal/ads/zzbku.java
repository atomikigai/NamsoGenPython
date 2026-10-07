package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbku extends zzayc implements zzbkw {
    public zzbku(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsManagerCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbkw
    public final zzbkt zze(q7.a aVar, zzbpg zzbpgVar, int i, zzbkq zzbkqVar) throws RemoteException {
        zzbkt zzbkrVar;
        Parcel parcelZza = zza();
        zzaye.zzf(parcelZza, aVar);
        zzaye.zzf(parcelZza, zzbpgVar);
        parcelZza.writeInt(243799000);
        zzaye.zzf(parcelZza, zzbkqVar);
        Parcel parcelZzdb = zzdb(1, parcelZza);
        IBinder strongBinder = parcelZzdb.readStrongBinder();
        if (strongBinder == null) {
            zzbkrVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
            zzbkrVar = iInterfaceQueryLocalInterface instanceof zzbkt ? (zzbkt) iInterfaceQueryLocalInterface : new zzbkr(strongBinder);
        }
        parcelZzdb.recycle();
        return zzbkrVar;
    }
}
