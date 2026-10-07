package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import e6.m0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbhh extends zzayc implements zzbhj {
    public zzbhh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbhj
    public final void zze(m0 m0Var, q7.a aVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzf(parcelZza, m0Var);
        zzaye.zzf(parcelZza, aVar);
        zzdc(1, parcelZza);
    }
}
