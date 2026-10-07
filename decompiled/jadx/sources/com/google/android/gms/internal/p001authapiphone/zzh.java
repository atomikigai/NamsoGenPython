package com.google.android.gms.internal.p001authapiphone;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.j;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzh extends zza implements IInterface {
    public zzh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
    }

    public final void zzc(zze zzeVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzb(parcelZza, zzeVar);
        zzb(4, parcelZza);
    }

    public final void zzd(String str, zzg zzgVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzc.zzb(parcelZza, zzgVar);
        zzb(5, parcelZza);
    }

    public final void zze(j jVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzb(parcelZza, jVar);
        zzb(3, parcelZza);
    }

    public final void zzf(j jVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzb(parcelZza, jVar);
        zzb(6, parcelZza);
    }

    public final void zzg(zzj zzjVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzb(parcelZza, zzjVar);
        zzb(1, parcelZza);
    }

    public final void zzh(String str, zzj zzjVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzc.zzb(parcelZza, zzjVar);
        zzb(2, parcelZza);
    }
}
