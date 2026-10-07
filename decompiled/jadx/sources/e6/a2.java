package e6;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzayd;
import com.google.android.gms.internal.ads.zzaye;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a2 extends zzayd implements b2 {
    @Override // com.google.android.gms.internal.ads.zzayd
    public final boolean zzdF(int i, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        if (i != 1) {
            return false;
        }
        String string = parcel.readString();
        q7.a aVarY = q7.b.y(parcel.readStrongBinder());
        q7.a aVarY2 = q7.b.y(parcel.readStrongBinder());
        zzaye.zzc(parcel);
        zze(string, aVarY, aVarY2);
        parcel2.writeNoException();
        return true;
    }
}
