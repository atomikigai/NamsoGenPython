package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfts extends zzayc implements zzftu {
    public zzfts(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.lmd.protocol.ILmdOverlayService");
    }

    @Override // com.google.android.gms.internal.ads.zzftu
    public final void zze(Bundle bundle, zzftw zzftwVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzd(parcelZza, bundle);
        zzaye.zzf(parcelZza, zzftwVar);
        zzdd(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzftu
    public final void zzf(String str, Bundle bundle, zzftw zzftwVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzaye.zzd(parcelZza, bundle);
        zzaye.zzf(parcelZza, zzftwVar);
        zzdd(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzftu
    public final void zzg(Bundle bundle, zzftw zzftwVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzd(parcelZza, bundle);
        zzaye.zzf(parcelZza, zzftwVar);
        zzdd(3, parcelZza);
    }
}
