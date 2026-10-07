package e6;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzayc;
import com.google.android.gms.internal.ads.zzaye;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class x1 extends zzayc implements y1 {
    public x1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    @Override // e6.y1
    public final void B(s3 s3Var) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzd(parcelZza, s3Var);
        zzdc(1, parcelZza);
    }

    @Override // e6.y1
    public final boolean zzf() throws RemoteException {
        Parcel parcelZzdb = zzdb(2, zza());
        boolean zZzg = zzaye.zzg(parcelZzdb);
        parcelZzdb.recycle();
        return zZzg;
    }
}
