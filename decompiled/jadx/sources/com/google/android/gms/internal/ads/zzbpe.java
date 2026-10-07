package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbpe extends zzayc implements zzbpg {
    public zzbpe(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbpg
    public final zzbpj zzb(String str) throws RemoteException {
        zzbpj zzbphVar;
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzdb = zzdb(1, parcelZza);
        IBinder strongBinder = parcelZzdb.readStrongBinder();
        if (strongBinder == null) {
            zzbphVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            zzbphVar = iInterfaceQueryLocalInterface instanceof zzbpj ? (zzbpj) iInterfaceQueryLocalInterface : new zzbph(strongBinder);
        }
        parcelZzdb.recycle();
        return zzbphVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpg
    public final zzbrf zzc(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzdb = zzdb(3, parcelZza);
        zzbrf zzbrfVarZzb = zzbre.zzb(parcelZzdb.readStrongBinder());
        parcelZzdb.recycle();
        return zzbrfVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbpg
    public final boolean zzd(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzdb = zzdb(4, parcelZza);
        boolean zZzg = zzaye.zzg(parcelZzdb);
        parcelZzdb.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbpg
    public final boolean zze(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzdb = zzdb(2, parcelZza);
        boolean zZzg = zzaye.zzg(parcelZzdb);
        parcelZzdb.recycle();
        return zZzg;
    }
}
