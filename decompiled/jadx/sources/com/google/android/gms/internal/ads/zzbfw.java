package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import da.v;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbfw extends zzayc implements zzbfy {
    public zzbfw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    @Override // com.google.android.gms.internal.ads.zzbfy
    public final double zzb() throws RemoteException {
        Parcel parcelZzdb = zzdb(3, zza());
        double d10 = parcelZzdb.readDouble();
        parcelZzdb.recycle();
        return d10;
    }

    @Override // com.google.android.gms.internal.ads.zzbfy
    public final int zzc() throws RemoteException {
        Parcel parcelZzdb = zzdb(5, zza());
        int i = parcelZzdb.readInt();
        parcelZzdb.recycle();
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzbfy
    public final int zzd() throws RemoteException {
        Parcel parcelZzdb = zzdb(4, zza());
        int i = parcelZzdb.readInt();
        parcelZzdb.recycle();
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzbfy
    public final Uri zze() throws RemoteException {
        Parcel parcelZzdb = zzdb(2, zza());
        Uri uri = (Uri) zzaye.zza(parcelZzdb, Uri.CREATOR);
        parcelZzdb.recycle();
        return uri;
    }

    @Override // com.google.android.gms.internal.ads.zzbfy
    public final q7.a zzf() throws RemoteException {
        return v.o(zzdb(1, zza()));
    }
}
