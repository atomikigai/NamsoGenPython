package e6;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzayc;
import com.google.android.gms.internal.ads.zzaye;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class d2 extends zzayc implements f2 {
    public d2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IResponseInfo");
    }

    @Override // e6.f2
    public final Bundle zze() throws RemoteException {
        Parcel parcelZzdb = zzdb(5, zza());
        Bundle bundle = (Bundle) zzaye.zza(parcelZzdb, Bundle.CREATOR);
        parcelZzdb.recycle();
        return bundle;
    }

    @Override // e6.f2
    public final t3 zzf() throws RemoteException {
        Parcel parcelZzdb = zzdb(4, zza());
        t3 t3Var = (t3) zzaye.zza(parcelZzdb, t3.CREATOR);
        parcelZzdb.recycle();
        return t3Var;
    }

    @Override // e6.f2
    public final String zzg() throws RemoteException {
        Parcel parcelZzdb = zzdb(1, zza());
        String string = parcelZzdb.readString();
        parcelZzdb.recycle();
        return string;
    }

    @Override // e6.f2
    public final String zzh() throws RemoteException {
        Parcel parcelZzdb = zzdb(6, zza());
        String string = parcelZzdb.readString();
        parcelZzdb.recycle();
        return string;
    }

    @Override // e6.f2
    public final String zzi() throws RemoteException {
        Parcel parcelZzdb = zzdb(2, zza());
        String string = parcelZzdb.readString();
        parcelZzdb.recycle();
        return string;
    }

    @Override // e6.f2
    public final List zzj() throws RemoteException {
        Parcel parcelZzdb = zzdb(3, zza());
        ArrayList arrayListCreateTypedArrayList = parcelZzdb.createTypedArrayList(t3.CREATOR);
        parcelZzdb.recycle();
        return arrayListCreateTypedArrayList;
    }
}
