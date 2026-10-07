package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import e6.i2;
import e6.j2;
import e6.o3;
import e6.q3;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbrd extends zzayc implements zzbrf {
    public zzbrd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzbrf
    public final j2 zze() throws RemoteException {
        Parcel parcelZzdb = zzdb(5, zza());
        j2 j2VarZzb = i2.zzb(parcelZzdb.readStrongBinder());
        parcelZzdb.recycle();
        return j2VarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbrf
    public final zzbru zzf() throws RemoteException {
        Parcel parcelZzdb = zzdb(2, zza());
        zzbru zzbruVar = (zzbru) zzaye.zza(parcelZzdb, zzbru.CREATOR);
        parcelZzdb.recycle();
        return zzbruVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbrf
    public final zzbru zzg() throws RemoteException {
        Parcel parcelZzdb = zzdb(3, zza());
        zzbru zzbruVar = (zzbru) zzaye.zza(parcelZzdb, zzbru.CREATOR);
        parcelZzdb.recycle();
        return zzbruVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbrf
    public final void zzh(q7.a aVar, String str, Bundle bundle, Bundle bundle2, q3 q3Var, zzbri zzbriVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzf(parcelZza, aVar);
        parcelZza.writeString(str);
        zzaye.zzd(parcelZza, bundle);
        zzaye.zzd(parcelZza, bundle2);
        zzaye.zzd(parcelZza, q3Var);
        zzaye.zzf(parcelZza, zzbriVar);
        zzdc(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrf
    public final void zzi(String str, String str2, o3 o3Var, q7.a aVar, zzbqq zzbqqVar, zzbpm zzbpmVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzaye.zzd(parcelZza, o3Var);
        zzaye.zzf(parcelZza, aVar);
        zzaye.zzf(parcelZza, zzbqqVar);
        zzaye.zzf(parcelZza, zzbpmVar);
        zzdc(23, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrf
    public final void zzj(String str, String str2, o3 o3Var, q7.a aVar, zzbqt zzbqtVar, zzbpm zzbpmVar, q3 q3Var) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzaye.zzd(parcelZza, o3Var);
        zzaye.zzf(parcelZza, aVar);
        zzaye.zzf(parcelZza, zzbqtVar);
        zzaye.zzf(parcelZza, zzbpmVar);
        zzaye.zzd(parcelZza, q3Var);
        zzdc(13, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrf
    public final void zzk(String str, String str2, o3 o3Var, q7.a aVar, zzbqt zzbqtVar, zzbpm zzbpmVar, q3 q3Var) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzaye.zzd(parcelZza, o3Var);
        zzaye.zzf(parcelZza, aVar);
        zzaye.zzf(parcelZza, zzbqtVar);
        zzaye.zzf(parcelZza, zzbpmVar);
        zzaye.zzd(parcelZza, q3Var);
        zzdc(21, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrf
    public final void zzl(String str, String str2, o3 o3Var, q7.a aVar, zzbqw zzbqwVar, zzbpm zzbpmVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzaye.zzd(parcelZza, o3Var);
        zzaye.zzf(parcelZza, aVar);
        zzaye.zzf(parcelZza, zzbqwVar);
        zzaye.zzf(parcelZza, zzbpmVar);
        zzdc(14, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrf
    public final void zzm(String str, String str2, o3 o3Var, q7.a aVar, zzbqz zzbqzVar, zzbpm zzbpmVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzaye.zzd(parcelZza, o3Var);
        zzaye.zzf(parcelZza, aVar);
        zzaye.zzf(parcelZza, zzbqzVar);
        zzaye.zzf(parcelZza, zzbpmVar);
        zzdc(18, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrf
    public final void zzn(String str, String str2, o3 o3Var, q7.a aVar, zzbqz zzbqzVar, zzbpm zzbpmVar, zzbfn zzbfnVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzaye.zzd(parcelZza, o3Var);
        zzaye.zzf(parcelZza, aVar);
        zzaye.zzf(parcelZza, zzbqzVar);
        zzaye.zzf(parcelZza, zzbpmVar);
        zzaye.zzd(parcelZza, zzbfnVar);
        zzdc(22, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrf
    public final void zzo(String str, String str2, o3 o3Var, q7.a aVar, zzbrc zzbrcVar, zzbpm zzbpmVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzaye.zzd(parcelZza, o3Var);
        zzaye.zzf(parcelZza, aVar);
        zzaye.zzf(parcelZza, zzbrcVar);
        zzaye.zzf(parcelZza, zzbpmVar);
        zzdc(20, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrf
    public final void zzp(String str, String str2, o3 o3Var, q7.a aVar, zzbrc zzbrcVar, zzbpm zzbpmVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzaye.zzd(parcelZza, o3Var);
        zzaye.zzf(parcelZza, aVar);
        zzaye.zzf(parcelZza, zzbrcVar);
        zzaye.zzf(parcelZza, zzbpmVar);
        zzdc(16, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrf
    public final void zzq(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzdc(19, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrf
    public final boolean zzr(q7.a aVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzf(parcelZza, aVar);
        Parcel parcelZzdb = zzdb(24, parcelZza);
        boolean zZzg = zzaye.zzg(parcelZzdb);
        parcelZzdb.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbrf
    public final boolean zzs(q7.a aVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzf(parcelZza, aVar);
        Parcel parcelZzdb = zzdb(15, parcelZza);
        boolean zZzg = zzaye.zzg(parcelZzdb);
        parcelZzdb.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbrf
    public final boolean zzt(q7.a aVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzf(parcelZza, aVar);
        Parcel parcelZzdb = zzdb(17, parcelZza);
        boolean zZzg = zzaye.zzg(parcelZzdb);
        parcelZzdb.recycle();
        return zZzg;
    }
}
