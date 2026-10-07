package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import e6.h2;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbqu extends zzayc implements zzbqw {
    public zzbqu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbqw
    public final void zze(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString("Adapter returned null.");
        zzdc(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqw
    public final void zzf(h2 h2Var) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzd(parcelZza, h2Var);
        zzdc(4, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqw
    public final void zzg() throws RemoteException {
        zzdc(2, zza());
    }
}
