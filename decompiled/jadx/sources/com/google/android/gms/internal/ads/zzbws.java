package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbws extends zzayc implements zzbwu {
    public zzbws(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbwu
    public final void zze(q7.a aVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzf(parcelZza, aVar);
        zzdc(8, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwu
    public final void zzf(q7.a aVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzf(parcelZza, aVar);
        zzdc(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwu
    public final void zzg(q7.a aVar, int i) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzf(parcelZza, aVar);
        parcelZza.writeInt(i);
        zzdc(9, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwu
    public final void zzh(q7.a aVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbwu
    public final void zzi(q7.a aVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzf(parcelZza, aVar);
        zzdc(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwu
    public final void zzj(q7.a aVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzf(parcelZza, aVar);
        zzdc(4, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwu
    public final void zzk(q7.a aVar, int i) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbwu
    public final void zzl(q7.a aVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzf(parcelZza, aVar);
        zzdc(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwu
    public final void zzm(q7.a aVar, zzbwv zzbwvVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzf(parcelZza, aVar);
        zzaye.zzd(parcelZza, zzbwvVar);
        zzdc(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwu
    public final void zzn(q7.a aVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzf(parcelZza, aVar);
        zzdc(11, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwu
    public final void zzo(q7.a aVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzf(parcelZza, aVar);
        zzdc(5, parcelZza);
    }
}
