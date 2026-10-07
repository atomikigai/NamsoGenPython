package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbhn extends zzayc implements zzbhp {
    public zzbhn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbhp
    public final boolean zze(q7.a aVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzf(parcelZza, aVar);
        Parcel parcelZzdb = zzdb(2, parcelZza);
        boolean zZzg = zzaye.zzg(parcelZzdb);
        parcelZzdb.recycle();
        return zZzg;
    }
}
