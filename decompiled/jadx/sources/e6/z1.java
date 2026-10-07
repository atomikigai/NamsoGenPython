package e6;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzayc;
import com.google.android.gms.internal.ads.zzaye;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class z1 extends zzayc implements b2 {
    public z1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOutOfContextTester");
    }

    @Override // e6.b2
    public final void zze(String str, q7.a aVar, q7.a aVar2) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzaye.zzf(parcelZza, aVar);
        zzaye.zzf(parcelZza, aVar2);
        zzdc(1, parcelZza);
    }
}
