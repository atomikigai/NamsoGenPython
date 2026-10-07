package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import da.v;
import e6.e2;
import e6.f2;
import e6.i2;
import e6.j2;
import e6.n1;
import e6.q1;
import e6.y1;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbht extends zzayc implements zzbhv {
    public zzbht(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbhv
    public final void zzA() throws RemoteException {
        zzdc(28, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbhv
    public final void zzB(Bundle bundle) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzd(parcelZza, bundle);
        zzdc(33, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbhv
    public final void zzC(Bundle bundle) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzd(parcelZza, bundle);
        zzdc(17, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbhv
    public final void zzD() throws RemoteException {
        zzdc(27, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbhv
    public final void zzE(n1 n1Var) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzf(parcelZza, n1Var);
        zzdc(26, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbhv
    public final void zzF(y1 y1Var) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzf(parcelZza, y1Var);
        zzdc(32, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbhv
    public final void zzG(zzbhs zzbhsVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzf(parcelZza, zzbhsVar);
        zzdc(21, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbhv
    public final boolean zzH() throws RemoteException {
        Parcel parcelZzdb = zzdb(30, zza());
        boolean zZzg = zzaye.zzg(parcelZzdb);
        parcelZzdb.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbhv
    public final boolean zzI() throws RemoteException {
        Parcel parcelZzdb = zzdb(24, zza());
        boolean zZzg = zzaye.zzg(parcelZzdb);
        parcelZzdb.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbhv
    public final boolean zzJ(Bundle bundle) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzd(parcelZza, bundle);
        Parcel parcelZzdb = zzdb(16, parcelZza);
        boolean zZzg = zzaye.zzg(parcelZzdb);
        parcelZzdb.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbhv
    public final double zze() throws RemoteException {
        Parcel parcelZzdb = zzdb(8, zza());
        double d10 = parcelZzdb.readDouble();
        parcelZzdb.recycle();
        return d10;
    }

    @Override // com.google.android.gms.internal.ads.zzbhv
    public final Bundle zzf() throws RemoteException {
        Parcel parcelZzdb = zzdb(20, zza());
        Bundle bundle = (Bundle) zzaye.zza(parcelZzdb, Bundle.CREATOR);
        parcelZzdb.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzbhv
    public final f2 zzg() throws RemoteException {
        Parcel parcelZzdb = zzdb(31, zza());
        f2 f2VarZzb = e2.zzb(parcelZzdb.readStrongBinder());
        parcelZzdb.recycle();
        return f2VarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbhv
    public final j2 zzh() throws RemoteException {
        Parcel parcelZzdb = zzdb(11, zza());
        j2 j2VarZzb = i2.zzb(parcelZzdb.readStrongBinder());
        parcelZzdb.recycle();
        return j2VarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbhv
    public final zzbfr zzi() throws RemoteException {
        zzbfr zzbfpVar;
        Parcel parcelZzdb = zzdb(14, zza());
        IBinder strongBinder = parcelZzdb.readStrongBinder();
        if (strongBinder == null) {
            zzbfpVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
            zzbfpVar = iInterfaceQueryLocalInterface instanceof zzbfr ? (zzbfr) iInterfaceQueryLocalInterface : new zzbfp(strongBinder);
        }
        parcelZzdb.recycle();
        return zzbfpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbhv
    public final zzbfv zzj() throws RemoteException {
        zzbfv zzbftVar;
        Parcel parcelZzdb = zzdb(29, zza());
        IBinder strongBinder = parcelZzdb.readStrongBinder();
        if (strongBinder == null) {
            zzbftVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
            zzbftVar = iInterfaceQueryLocalInterface instanceof zzbfv ? (zzbfv) iInterfaceQueryLocalInterface : new zzbft(strongBinder);
        }
        parcelZzdb.recycle();
        return zzbftVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbhv
    public final zzbfy zzk() throws RemoteException {
        zzbfy zzbfwVar;
        Parcel parcelZzdb = zzdb(5, zza());
        IBinder strongBinder = parcelZzdb.readStrongBinder();
        if (strongBinder == null) {
            zzbfwVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            zzbfwVar = iInterfaceQueryLocalInterface instanceof zzbfy ? (zzbfy) iInterfaceQueryLocalInterface : new zzbfw(strongBinder);
        }
        parcelZzdb.recycle();
        return zzbfwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbhv
    public final q7.a zzl() throws RemoteException {
        return v.o(zzdb(19, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbhv
    public final q7.a zzm() throws RemoteException {
        return v.o(zzdb(18, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbhv
    public final String zzn() throws RemoteException {
        Parcel parcelZzdb = zzdb(7, zza());
        String string = parcelZzdb.readString();
        parcelZzdb.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbhv
    public final String zzo() throws RemoteException {
        Parcel parcelZzdb = zzdb(4, zza());
        String string = parcelZzdb.readString();
        parcelZzdb.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbhv
    public final String zzp() throws RemoteException {
        Parcel parcelZzdb = zzdb(6, zza());
        String string = parcelZzdb.readString();
        parcelZzdb.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbhv
    public final String zzq() throws RemoteException {
        Parcel parcelZzdb = zzdb(2, zza());
        String string = parcelZzdb.readString();
        parcelZzdb.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbhv
    public final String zzr() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbhv
    public final String zzs() throws RemoteException {
        Parcel parcelZzdb = zzdb(10, zza());
        String string = parcelZzdb.readString();
        parcelZzdb.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbhv
    public final String zzt() throws RemoteException {
        Parcel parcelZzdb = zzdb(9, zza());
        String string = parcelZzdb.readString();
        parcelZzdb.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbhv
    public final List zzu() throws RemoteException {
        Parcel parcelZzdb = zzdb(3, zza());
        ArrayList arrayListZzb = zzaye.zzb(parcelZzdb);
        parcelZzdb.recycle();
        return arrayListZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbhv
    public final List zzv() throws RemoteException {
        Parcel parcelZzdb = zzdb(23, zza());
        ArrayList arrayListZzb = zzaye.zzb(parcelZzdb);
        parcelZzdb.recycle();
        return arrayListZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbhv
    public final void zzw() throws RemoteException {
        zzdc(22, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbhv
    public final void zzx() throws RemoteException {
        zzdc(13, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbhv
    public final void zzy(q1 q1Var) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzf(parcelZza, q1Var);
        zzdc(25, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbhv
    public final void zzz(Bundle bundle) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzd(parcelZza, bundle);
        zzdc(15, parcelZza);
    }
}
