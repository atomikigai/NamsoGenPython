package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import e6.e2;
import e6.f2;
import e6.m0;
import e6.y1;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbad extends zzayc implements zzbaf {
    public zzbad(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbaf
    public final m0 zze() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbaf
    public final f2 zzf() throws RemoteException {
        Parcel parcelZzdb = zzdb(5, zza());
        f2 f2VarZzb = e2.zzb(parcelZzdb.readStrongBinder());
        parcelZzdb.recycle();
        return f2VarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbaf
    public final void zzg(boolean z4) throws RemoteException {
        Parcel parcelZza = zza();
        int i = zzaye.zza;
        parcelZza.writeInt(z4 ? 1 : 0);
        zzdc(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbaf
    public final void zzh(y1 y1Var) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzf(parcelZza, y1Var);
        zzdc(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbaf
    public final void zzi(q7.a aVar, zzbam zzbamVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzf(parcelZza, aVar);
        zzaye.zzf(parcelZza, zzbamVar);
        zzdc(4, parcelZza);
    }
}
