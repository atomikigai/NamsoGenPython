package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import da.v;
import e6.i2;
import e6.j2;
import e6.o3;
import e6.q3;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbph extends zzayc implements zzbpj {
    public zzbph(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final void zzA(q7.a aVar, o3 o3Var, String str, zzbpm zzbpmVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzf(parcelZza, aVar);
        zzaye.zzd(parcelZza, o3Var);
        parcelZza.writeString(str);
        zzaye.zzf(parcelZza, zzbpmVar);
        zzdc(28, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final void zzB(o3 o3Var, String str, String str2) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final void zzC(q7.a aVar, o3 o3Var, String str, zzbpm zzbpmVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzf(parcelZza, aVar);
        zzaye.zzd(parcelZza, o3Var);
        parcelZza.writeString(str);
        zzaye.zzf(parcelZza, zzbpmVar);
        zzdc(32, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final void zzD(q7.a aVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzf(parcelZza, aVar);
        zzdc(21, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final void zzE() throws RemoteException {
        zzdc(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final void zzF() throws RemoteException {
        zzdc(9, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final void zzG(boolean z4) throws RemoteException {
        Parcel parcelZza = zza();
        int i = zzaye.zza;
        parcelZza.writeInt(z4 ? 1 : 0);
        zzdc(25, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final void zzH(q7.a aVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzf(parcelZza, aVar);
        zzdc(39, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final void zzI() throws RemoteException {
        zzdc(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final void zzJ(q7.a aVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzf(parcelZza, aVar);
        zzdc(37, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final void zzK(q7.a aVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzf(parcelZza, aVar);
        zzdc(30, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final void zzL() throws RemoteException {
        zzdc(12, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final boolean zzM() throws RemoteException {
        Parcel parcelZzdb = zzdb(22, zza());
        boolean zZzg = zzaye.zzg(parcelZzdb);
        parcelZzdb.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final boolean zzN() throws RemoteException {
        Parcel parcelZzdb = zzdb(13, zza());
        boolean zZzg = zzaye.zzg(parcelZzdb);
        parcelZzdb.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final zzbpr zzO() throws RemoteException {
        zzbpr zzbprVar;
        Parcel parcelZzdb = zzdb(15, zza());
        IBinder strongBinder = parcelZzdb.readStrongBinder();
        if (strongBinder == null) {
            zzbprVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
            zzbprVar = iInterfaceQueryLocalInterface instanceof zzbpr ? (zzbpr) iInterfaceQueryLocalInterface : new zzbpr(strongBinder);
        }
        parcelZzdb.recycle();
        return zzbprVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final zzbps zzP() throws RemoteException {
        zzbps zzbpsVar;
        Parcel parcelZzdb = zzdb(16, zza());
        IBinder strongBinder = parcelZzdb.readStrongBinder();
        if (strongBinder == null) {
            zzbpsVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            zzbpsVar = iInterfaceQueryLocalInterface instanceof zzbps ? (zzbps) iInterfaceQueryLocalInterface : new zzbps(strongBinder);
        }
        parcelZzdb.recycle();
        return zzbpsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final Bundle zze() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final Bundle zzf() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final Bundle zzg() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final j2 zzh() throws RemoteException {
        Parcel parcelZzdb = zzdb(26, zza());
        j2 j2VarZzb = i2.zzb(parcelZzdb.readStrongBinder());
        parcelZzdb.recycle();
        return j2VarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final zzbgs zzi() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final zzbpp zzj() throws RemoteException {
        zzbpp zzbpnVar;
        Parcel parcelZzdb = zzdb(36, zza());
        IBinder strongBinder = parcelZzdb.readStrongBinder();
        if (strongBinder == null) {
            zzbpnVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
            zzbpnVar = iInterfaceQueryLocalInterface instanceof zzbpp ? (zzbpp) iInterfaceQueryLocalInterface : new zzbpn(strongBinder);
        }
        parcelZzdb.recycle();
        return zzbpnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final zzbpv zzk() throws RemoteException {
        zzbpv zzbptVar;
        Parcel parcelZzdb = zzdb(27, zza());
        IBinder strongBinder = parcelZzdb.readStrongBinder();
        if (strongBinder == null) {
            zzbptVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
            zzbptVar = iInterfaceQueryLocalInterface instanceof zzbpv ? (zzbpv) iInterfaceQueryLocalInterface : new zzbpt(strongBinder);
        }
        parcelZzdb.recycle();
        return zzbptVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final zzbru zzl() throws RemoteException {
        Parcel parcelZzdb = zzdb(33, zza());
        zzbru zzbruVar = (zzbru) zzaye.zza(parcelZzdb, zzbru.CREATOR);
        parcelZzdb.recycle();
        return zzbruVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final zzbru zzm() throws RemoteException {
        Parcel parcelZzdb = zzdb(34, zza());
        zzbru zzbruVar = (zzbru) zzaye.zza(parcelZzdb, zzbru.CREATOR);
        parcelZzdb.recycle();
        return zzbruVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final q7.a zzn() throws RemoteException {
        return v.o(zzdb(2, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final void zzo() throws RemoteException {
        zzdc(5, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final void zzp(q7.a aVar, o3 o3Var, String str, zzbwu zzbwuVar, String str2) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzf(parcelZza, aVar);
        zzaye.zzd(parcelZza, o3Var);
        parcelZza.writeString(null);
        zzaye.zzf(parcelZza, zzbwuVar);
        parcelZza.writeString(str2);
        zzdc(10, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final void zzq(q7.a aVar, zzblt zzbltVar, List list) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzf(parcelZza, aVar);
        zzaye.zzf(parcelZza, zzbltVar);
        parcelZza.writeTypedList(list);
        zzdc(31, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final void zzr(q7.a aVar, zzbwu zzbwuVar, List list) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzf(parcelZza, aVar);
        zzaye.zzf(parcelZza, zzbwuVar);
        parcelZza.writeStringList(list);
        zzdc(23, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final void zzs(o3 o3Var, String str) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzd(parcelZza, o3Var);
        parcelZza.writeString(str);
        zzdc(11, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final void zzt(q7.a aVar, o3 o3Var, String str, zzbpm zzbpmVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzf(parcelZza, aVar);
        zzaye.zzd(parcelZza, o3Var);
        parcelZza.writeString(str);
        zzaye.zzf(parcelZza, zzbpmVar);
        zzdc(38, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final void zzu(q7.a aVar, q3 q3Var, o3 o3Var, String str, zzbpm zzbpmVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final void zzv(q7.a aVar, q3 q3Var, o3 o3Var, String str, String str2, zzbpm zzbpmVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzf(parcelZza, aVar);
        zzaye.zzd(parcelZza, q3Var);
        zzaye.zzd(parcelZza, o3Var);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzaye.zzf(parcelZza, zzbpmVar);
        zzdc(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final void zzw(q7.a aVar, q3 q3Var, o3 o3Var, String str, String str2, zzbpm zzbpmVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzf(parcelZza, aVar);
        zzaye.zzd(parcelZza, q3Var);
        zzaye.zzd(parcelZza, o3Var);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzaye.zzf(parcelZza, zzbpmVar);
        zzdc(35, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final void zzx(q7.a aVar, o3 o3Var, String str, zzbpm zzbpmVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final void zzy(q7.a aVar, o3 o3Var, String str, String str2, zzbpm zzbpmVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzf(parcelZza, aVar);
        zzaye.zzd(parcelZza, o3Var);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzaye.zzf(parcelZza, zzbpmVar);
        zzdc(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final void zzz(q7.a aVar, o3 o3Var, String str, String str2, zzbpm zzbpmVar, zzbfn zzbfnVar, List list) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzf(parcelZza, aVar);
        zzaye.zzd(parcelZza, o3Var);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzaye.zzf(parcelZza, zzbpmVar);
        zzaye.zzd(parcelZza, zzbfnVar);
        parcelZza.writeStringList(list);
        zzdc(14, parcelZza);
    }
}
