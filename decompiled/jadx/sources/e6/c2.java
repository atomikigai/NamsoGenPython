package e6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzayc;
import com.google.android.gms.internal.ads.zzaye;
import com.google.android.gms.internal.ads.zzbpc;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class c2 extends zzayc {
    public final b2 y(q7.b bVar, zzbpc zzbpcVar) throws RemoteException {
        b2 z1Var;
        Parcel parcelZza = zza();
        zzaye.zzf(parcelZza, bVar);
        zzaye.zzf(parcelZza, zzbpcVar);
        parcelZza.writeInt(243799000);
        Parcel parcelZzdb = zzdb(1, parcelZza);
        IBinder strongBinder = parcelZzdb.readStrongBinder();
        if (strongBinder == null) {
            z1Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            z1Var = iInterfaceQueryLocalInterface instanceof b2 ? (b2) iInterfaceQueryLocalInterface : new z1(strongBinder);
        }
        parcelZzdb.recycle();
        return z1Var;
    }
}
