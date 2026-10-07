package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import e6.h2;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbpk extends zzayc implements zzbpm {
    public zzbpk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final void zze() throws RemoteException {
        zzdc(1, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final void zzf() throws RemoteException {
        zzdc(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final void zzg(int i) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i);
        zzdc(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final void zzh(h2 h2Var) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzd(parcelZza, h2Var);
        zzdc(23, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final void zzi(int i, String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i);
        parcelZza.writeString(str);
        zzdc(22, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final void zzj(int i) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final void zzk(h2 h2Var) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzd(parcelZza, h2Var);
        zzdc(24, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final void zzl(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzdc(21, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final void zzm() throws RemoteException {
        zzdc(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final void zzn() throws RemoteException {
        zzdc(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final void zzo() throws RemoteException {
        zzdc(6, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final void zzp() throws RemoteException {
        zzdc(5, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final void zzq(String str, String str2) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzdc(9, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final void zzr(zzbgs zzbgsVar, String str) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzf(parcelZza, zzbgsVar);
        parcelZza.writeString(str);
        zzdc(10, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final void zzs(zzbwv zzbwvVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final void zzt(zzbwz zzbwzVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzf(parcelZza, zzbwzVar);
        zzdc(16, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final void zzu() throws RemoteException {
        zzdc(18, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final void zzv() throws RemoteException {
        zzdc(11, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final void zzw() throws RemoteException {
        zzdc(15, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final void zzx() throws RemoteException {
        zzdc(20, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final void zzy() throws RemoteException {
        zzdc(13, zza());
    }
}
