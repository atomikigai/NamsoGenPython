package h6;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzayc;
import com.google.android.gms.internal.ads.zzaye;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class y extends zzayc implements z {
    @Override // h6.z
    public final void zze(q7.a aVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzf(parcelZza, aVar);
        zzdc(2, parcelZza);
    }

    @Override // h6.z
    public final boolean zzf(q7.a aVar, String str, String str2) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzf(parcelZza, aVar);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        Parcel parcelZzdb = zzdb(1, parcelZza);
        boolean zZzg = zzaye.zzg(parcelZzdb);
        parcelZzdb.recycle();
        return zZzg;
    }

    @Override // h6.z
    public final boolean zzg(q7.a aVar, f6.a aVar2) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzf(parcelZza, aVar);
        zzaye.zzd(parcelZza, aVar2);
        Parcel parcelZzdb = zzdb(3, parcelZza);
        boolean zZzg = zzaye.zzg(parcelZzdb);
        parcelZzdb.recycle();
        return zZzg;
    }
}
