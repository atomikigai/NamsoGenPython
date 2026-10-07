package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbte extends zzayc implements zzbtg {
    public zzbte(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    @Override // com.google.android.gms.internal.ads.zzbtg
    public final boolean zzH() throws RemoteException {
        Parcel parcelZzdb = zzdb(11, zza());
        boolean zZzg = zzaye.zzg(parcelZzdb);
        parcelZzdb.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbtg
    public final void zzh(int i, int i10, Intent intent) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i);
        parcelZza.writeInt(i10);
        zzaye.zzd(parcelZza, intent);
        zzdc(12, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtg
    public final void zzi() throws RemoteException {
        zzdc(10, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbtg
    public final void zzk(q7.a aVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzf(parcelZza, aVar);
        zzdc(13, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtg
    public final void zzl(Bundle bundle) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzd(parcelZza, bundle);
        zzdc(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtg
    public final void zzm() throws RemoteException {
        zzdc(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbtg
    public final void zzo() throws RemoteException {
        zzdc(5, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbtg
    public final void zzp(int i, String[] strArr, int[] iArr) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i);
        parcelZza.writeStringArray(strArr);
        parcelZza.writeIntArray(iArr);
        zzdc(15, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtg
    public final void zzq() throws RemoteException {
        zzdc(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbtg
    public final void zzr() throws RemoteException {
        zzdc(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbtg
    public final void zzs(Bundle bundle) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzd(parcelZza, bundle);
        Parcel parcelZzdb = zzdb(6, parcelZza);
        if (parcelZzdb.readInt() != 0) {
            bundle.readFromParcel(parcelZzdb);
        }
        parcelZzdb.recycle();
    }

    @Override // com.google.android.gms.internal.ads.zzbtg
    public final void zzt() throws RemoteException {
        zzdc(3, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbtg
    public final void zzu() throws RemoteException {
        zzdc(7, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbtg
    public final void zzv() throws RemoteException {
        zzdc(14, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbtg
    public final void zzx() throws RemoteException {
        zzdc(9, zza());
    }
}
