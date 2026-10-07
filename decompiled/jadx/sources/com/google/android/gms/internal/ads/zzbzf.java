package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import da.v;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbzf extends zzayc implements zzbzh {
    public zzbzf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    @Override // com.google.android.gms.internal.ads.zzbzh
    public final q7.a zze(q7.a aVar, q7.a aVar2, String str, q7.a aVar3) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzf(parcelZza, aVar);
        zzaye.zzf(parcelZza, aVar2);
        parcelZza.writeString(str);
        zzaye.zzf(parcelZza, aVar3);
        return v.o(zzdb(11, parcelZza));
    }

    @Override // com.google.android.gms.internal.ads.zzbzh
    public final void zzf(q7.a aVar, zzbzl zzbzlVar, zzbze zzbzeVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzf(parcelZza, aVar);
        zzaye.zzd(parcelZza, zzbzlVar);
        zzaye.zzf(parcelZza, zzbzeVar);
        zzdc(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbzh
    public final void zzg(zzbue zzbueVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzd(parcelZza, zzbueVar);
        zzdc(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbzh
    public final void zzh(List list, q7.a aVar, zzbtv zzbtvVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeTypedList(list);
        zzaye.zzf(parcelZza, aVar);
        zzaye.zzf(parcelZza, zzbtvVar);
        zzdc(10, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbzh
    public final void zzi(List list, q7.a aVar, zzbtv zzbtvVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeTypedList(list);
        zzaye.zzf(parcelZza, aVar);
        zzaye.zzf(parcelZza, zzbtvVar);
        zzdc(9, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbzh
    public final void zzj(q7.a aVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzf(parcelZza, aVar);
        zzdc(8, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbzh
    public final void zzk(q7.a aVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzf(parcelZza, aVar);
        zzdc(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbzh
    public final void zzl(List list, q7.a aVar, zzbtv zzbtvVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeTypedList(list);
        zzaye.zzf(parcelZza, aVar);
        zzaye.zzf(parcelZza, zzbtvVar);
        zzdc(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbzh
    public final void zzm(List list, q7.a aVar, zzbtv zzbtvVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeTypedList(list);
        zzaye.zzf(parcelZza, aVar);
        zzaye.zzf(parcelZza, zzbtvVar);
        zzdc(5, parcelZza);
    }
}
