package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import da.v;
import e6.i2;
import e6.j2;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbft extends zzayc implements zzbfv {
    public zzbft(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    @Override // com.google.android.gms.internal.ads.zzbfv
    public final float zze() throws RemoteException {
        Parcel parcelZzdb = zzdb(2, zza());
        float f10 = parcelZzdb.readFloat();
        parcelZzdb.recycle();
        return f10;
    }

    @Override // com.google.android.gms.internal.ads.zzbfv
    public final float zzf() throws RemoteException {
        Parcel parcelZzdb = zzdb(6, zza());
        float f10 = parcelZzdb.readFloat();
        parcelZzdb.recycle();
        return f10;
    }

    @Override // com.google.android.gms.internal.ads.zzbfv
    public final float zzg() throws RemoteException {
        Parcel parcelZzdb = zzdb(5, zza());
        float f10 = parcelZzdb.readFloat();
        parcelZzdb.recycle();
        return f10;
    }

    @Override // com.google.android.gms.internal.ads.zzbfv
    public final j2 zzh() throws RemoteException {
        Parcel parcelZzdb = zzdb(7, zza());
        j2 j2VarZzb = i2.zzb(parcelZzdb.readStrongBinder());
        parcelZzdb.recycle();
        return j2VarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbfv
    public final q7.a zzi() throws RemoteException {
        return v.o(zzdb(4, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbfv
    public final void zzj(q7.a aVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzf(parcelZza, aVar);
        zzdc(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbfv
    public final boolean zzk() throws RemoteException {
        Parcel parcelZzdb = zzdb(10, zza());
        boolean zZzg = zzaye.zzg(parcelZzdb);
        parcelZzdb.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbfv
    public final boolean zzl() throws RemoteException {
        Parcel parcelZzdb = zzdb(8, zza());
        boolean zZzg = zzaye.zzg(parcelZzdb);
        parcelZzdb.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbfv
    public final void zzm(zzbhg zzbhgVar) throws RemoteException {
        throw null;
    }
}
