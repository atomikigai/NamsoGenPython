package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import e6.e2;
import e6.f2;
import e6.o3;
import e6.w1;
import e6.y1;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbxa extends zzayc implements zzbxc {
    public zzbxa(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbxc
    public final Bundle zzb() throws RemoteException {
        Parcel parcelZzdb = zzdb(9, zza());
        Bundle bundle = (Bundle) zzaye.zza(parcelZzdb, Bundle.CREATOR);
        parcelZzdb.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzbxc
    public final f2 zzc() throws RemoteException {
        Parcel parcelZzdb = zzdb(12, zza());
        f2 f2VarZzb = e2.zzb(parcelZzdb.readStrongBinder());
        parcelZzdb.recycle();
        return f2VarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbxc
    public final zzbwz zzd() throws RemoteException {
        zzbwz zzbwxVar;
        Parcel parcelZzdb = zzdb(11, zza());
        IBinder strongBinder = parcelZzdb.readStrongBinder();
        if (strongBinder == null) {
            zzbwxVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
            zzbwxVar = iInterfaceQueryLocalInterface instanceof zzbwz ? (zzbwz) iInterfaceQueryLocalInterface : new zzbwx(strongBinder);
        }
        parcelZzdb.recycle();
        return zzbwxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbxc
    public final String zze() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbxc
    public final void zzf(o3 o3Var, zzbxj zzbxjVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzd(parcelZza, o3Var);
        zzaye.zzf(parcelZza, zzbxjVar);
        zzdc(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxc
    public final void zzg(o3 o3Var, zzbxj zzbxjVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzd(parcelZza, o3Var);
        zzaye.zzf(parcelZza, zzbxjVar);
        zzdc(14, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxc
    public final void zzh(boolean z4) throws RemoteException {
        Parcel parcelZza = zza();
        int i = zzaye.zza;
        parcelZza.writeInt(z4 ? 1 : 0);
        zzdc(15, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxc
    public final void zzi(w1 w1Var) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzf(parcelZza, w1Var);
        zzdc(8, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxc
    public final void zzj(y1 y1Var) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzf(parcelZza, y1Var);
        zzdc(13, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxc
    public final void zzk(zzbxf zzbxfVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzf(parcelZza, zzbxfVar);
        zzdc(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxc
    public final void zzl(zzbxq zzbxqVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzd(parcelZza, zzbxqVar);
        zzdc(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxc
    public final void zzm(q7.a aVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzf(parcelZza, aVar);
        zzdc(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxc
    public final void zzn(q7.a aVar, boolean z4) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbxc
    public final boolean zzo() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbxc
    public final void zzp(zzbxk zzbxkVar) throws RemoteException {
        throw null;
    }
}
