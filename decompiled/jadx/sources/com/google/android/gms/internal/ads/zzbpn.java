package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import da.v;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbpn extends zzayc implements zzbpp {
    public zzbpn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbpp
    public final q7.a zze() throws RemoteException {
        return v.o(zzdb(1, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbpp
    public final boolean zzf() throws RemoteException {
        Parcel parcelZzdb = zzdb(2, zza());
        boolean zZzg = zzaye.zzg(parcelZzdb);
        parcelZzdb.recycle();
        return zZzg;
    }
}
