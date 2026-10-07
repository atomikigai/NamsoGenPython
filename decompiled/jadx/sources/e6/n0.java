package e6;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzayc;
import com.google.android.gms.internal.ads.zzaye;
import com.google.android.gms.internal.ads.zzbpg;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 extends zzayc {
    public n0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManagerCreator");
    }

    public final IBinder y(q7.b bVar, q3 q3Var, String str, zzbpg zzbpgVar, int i) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzf(parcelZza, bVar);
        zzaye.zzd(parcelZza, q3Var);
        parcelZza.writeString(str);
        zzaye.zzf(parcelZza, zzbpgVar);
        parcelZza.writeInt(243799000);
        parcelZza.writeInt(i);
        Parcel parcelZzdb = zzdb(2, parcelZza);
        IBinder strongBinder = parcelZzdb.readStrongBinder();
        parcelZzdb.recycle();
        return strongBinder;
    }
}
