package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import da.v;
import e6.i2;
import e6.j2;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbps extends zzayc implements IInterface {
    public zzbps(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
    }

    public final Bundle zze() throws RemoteException {
        Parcel parcelZzdb = zzdb(13, zza());
        Bundle bundle = (Bundle) zzaye.zza(parcelZzdb, Bundle.CREATOR);
        parcelZzdb.recycle();
        return bundle;
    }

    public final j2 zzf() throws RemoteException {
        Parcel parcelZzdb = zzdb(16, zza());
        j2 j2VarZzb = i2.zzb(parcelZzdb.readStrongBinder());
        parcelZzdb.recycle();
        return j2VarZzb;
    }

    public final zzbfr zzg() throws RemoteException {
        Parcel parcelZzdb = zzdb(19, zza());
        zzbfr zzbfrVarZzj = zzbfq.zzj(parcelZzdb.readStrongBinder());
        parcelZzdb.recycle();
        return zzbfrVarZzj;
    }

    public final zzbfy zzh() throws RemoteException {
        Parcel parcelZzdb = zzdb(5, zza());
        zzbfy zzbfyVarZzg = zzbfx.zzg(parcelZzdb.readStrongBinder());
        parcelZzdb.recycle();
        return zzbfyVarZzg;
    }

    public final q7.a zzi() throws RemoteException {
        return v.o(zzdb(15, zza()));
    }

    public final q7.a zzj() throws RemoteException {
        return v.o(zzdb(20, zza()));
    }

    public final q7.a zzk() throws RemoteException {
        return v.o(zzdb(21, zza()));
    }

    public final String zzl() throws RemoteException {
        Parcel parcelZzdb = zzdb(7, zza());
        String string = parcelZzdb.readString();
        parcelZzdb.recycle();
        return string;
    }

    public final String zzm() throws RemoteException {
        Parcel parcelZzdb = zzdb(4, zza());
        String string = parcelZzdb.readString();
        parcelZzdb.recycle();
        return string;
    }

    public final String zzn() throws RemoteException {
        Parcel parcelZzdb = zzdb(6, zza());
        String string = parcelZzdb.readString();
        parcelZzdb.recycle();
        return string;
    }

    public final String zzo() throws RemoteException {
        Parcel parcelZzdb = zzdb(2, zza());
        String string = parcelZzdb.readString();
        parcelZzdb.recycle();
        return string;
    }

    public final List zzp() throws RemoteException {
        Parcel parcelZzdb = zzdb(3, zza());
        ArrayList arrayListZzb = zzaye.zzb(parcelZzdb);
        parcelZzdb.recycle();
        return arrayListZzb;
    }

    public final void zzq(q7.a aVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzf(parcelZza, aVar);
        zzdc(9, parcelZza);
    }

    public final void zzr() throws RemoteException {
        zzdc(8, zza());
    }

    public final void zzs(q7.a aVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzf(parcelZza, aVar);
        zzdc(10, parcelZza);
    }

    public final void zzt(q7.a aVar, q7.a aVar2, q7.a aVar3) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzf(parcelZza, aVar);
        zzaye.zzf(parcelZza, aVar2);
        zzaye.zzf(parcelZza, aVar3);
        zzdc(22, parcelZza);
    }

    public final void zzu(q7.a aVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzf(parcelZza, aVar);
        zzdc(14, parcelZza);
    }

    public final boolean zzv() throws RemoteException {
        Parcel parcelZzdb = zzdb(12, zza());
        boolean zZzg = zzaye.zzg(parcelZzdb);
        parcelZzdb.recycle();
        return zZzg;
    }

    public final boolean zzw() throws RemoteException {
        Parcel parcelZzdb = zzdb(11, zza());
        boolean zZzg = zzaye.zzg(parcelZzdb);
        parcelZzdb.recycle();
        return zZzg;
    }
}
