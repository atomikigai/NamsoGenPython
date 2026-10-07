package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbha extends zzayc implements zzbhc {
    public zzbha(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final void zze(zzbgs zzbgsVar, String str) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzf(parcelZza, zzbgsVar);
        parcelZza.writeString(str);
        zzdc(1, parcelZza);
    }
}
