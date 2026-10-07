package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import da.v;
import e6.i2;
import e6.j2;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbpt extends zzayc implements zzbpv {
    public zzbpt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    @Override // com.google.android.gms.internal.ads.zzbpv
    public final boolean zzA() throws RemoteException {
        Parcel parcelZzdb = zzdb(18, zza());
        boolean zZzg = zzaye.zzg(parcelZzdb);
        parcelZzdb.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbpv
    public final boolean zzB() throws RemoteException {
        Parcel parcelZzdb = zzdb(17, zza());
        boolean zZzg = zzaye.zzg(parcelZzdb);
        parcelZzdb.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbpv
    public final double zze() throws RemoteException {
        Parcel parcelZzdb = zzdb(8, zza());
        double d10 = parcelZzdb.readDouble();
        parcelZzdb.recycle();
        return d10;
    }

    @Override // com.google.android.gms.internal.ads.zzbpv
    public final float zzf() throws RemoteException {
        Parcel parcelZzdb = zzdb(23, zza());
        float f10 = parcelZzdb.readFloat();
        parcelZzdb.recycle();
        return f10;
    }

    @Override // com.google.android.gms.internal.ads.zzbpv
    public final float zzg() throws RemoteException {
        Parcel parcelZzdb = zzdb(25, zza());
        float f10 = parcelZzdb.readFloat();
        parcelZzdb.recycle();
        return f10;
    }

    @Override // com.google.android.gms.internal.ads.zzbpv
    public final float zzh() throws RemoteException {
        Parcel parcelZzdb = zzdb(24, zza());
        float f10 = parcelZzdb.readFloat();
        parcelZzdb.recycle();
        return f10;
    }

    @Override // com.google.android.gms.internal.ads.zzbpv
    public final Bundle zzi() throws RemoteException {
        Parcel parcelZzdb = zzdb(16, zza());
        Bundle bundle = (Bundle) zzaye.zza(parcelZzdb, Bundle.CREATOR);
        parcelZzdb.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzbpv
    public final j2 zzj() throws RemoteException {
        Parcel parcelZzdb = zzdb(11, zza());
        j2 j2VarZzb = i2.zzb(parcelZzdb.readStrongBinder());
        parcelZzdb.recycle();
        return j2VarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbpv
    public final zzbfr zzk() throws RemoteException {
        Parcel parcelZzdb = zzdb(12, zza());
        zzbfr zzbfrVarZzj = zzbfq.zzj(parcelZzdb.readStrongBinder());
        parcelZzdb.recycle();
        return zzbfrVarZzj;
    }

    @Override // com.google.android.gms.internal.ads.zzbpv
    public final zzbfy zzl() throws RemoteException {
        Parcel parcelZzdb = zzdb(5, zza());
        zzbfy zzbfyVarZzg = zzbfx.zzg(parcelZzdb.readStrongBinder());
        parcelZzdb.recycle();
        return zzbfyVarZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbpv
    public final q7.a zzm() throws RemoteException {
        return v.o(zzdb(13, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbpv
    public final q7.a zzn() throws RemoteException {
        return v.o(zzdb(14, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbpv
    public final q7.a zzo() throws RemoteException {
        return v.o(zzdb(15, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbpv
    public final String zzp() throws RemoteException {
        Parcel parcelZzdb = zzdb(7, zza());
        String string = parcelZzdb.readString();
        parcelZzdb.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbpv
    public final String zzq() throws RemoteException {
        Parcel parcelZzdb = zzdb(4, zza());
        String string = parcelZzdb.readString();
        parcelZzdb.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbpv
    public final String zzr() throws RemoteException {
        Parcel parcelZzdb = zzdb(6, zza());
        String string = parcelZzdb.readString();
        parcelZzdb.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbpv
    public final String zzs() throws RemoteException {
        Parcel parcelZzdb = zzdb(2, zza());
        String string = parcelZzdb.readString();
        parcelZzdb.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbpv
    public final String zzt() throws RemoteException {
        Parcel parcelZzdb = zzdb(10, zza());
        String string = parcelZzdb.readString();
        parcelZzdb.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbpv
    public final String zzu() throws RemoteException {
        Parcel parcelZzdb = zzdb(9, zza());
        String string = parcelZzdb.readString();
        parcelZzdb.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbpv
    public final List zzv() throws RemoteException {
        Parcel parcelZzdb = zzdb(3, zza());
        ArrayList arrayListZzb = zzaye.zzb(parcelZzdb);
        parcelZzdb.recycle();
        return arrayListZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbpv
    public final void zzw(q7.a aVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzf(parcelZza, aVar);
        zzdc(20, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpv
    public final void zzx() throws RemoteException {
        zzdc(19, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpv
    public final void zzy(q7.a aVar, q7.a aVar2, q7.a aVar3) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzf(parcelZza, aVar);
        zzaye.zzf(parcelZza, aVar2);
        zzaye.zzf(parcelZza, aVar3);
        zzdc(21, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpv
    public final void zzz(q7.a aVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzf(parcelZza, aVar);
        zzdc(22, parcelZza);
    }
}
