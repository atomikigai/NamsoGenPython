package e6;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzayc;
import com.google.android.gms.internal.ads.zzaye;
import com.google.android.gms.internal.ads.zzbpf;
import com.google.android.gms.internal.ads.zzbpg;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class f1 extends zzayc implements h1 {
    @Override // e6.h1
    public final zzbpg getAdapterCreator() throws RemoteException {
        Parcel parcelZzdb = zzdb(2, zza());
        zzbpg zzbpgVarZzf = zzbpf.zzf(parcelZzdb.readStrongBinder());
        parcelZzdb.recycle();
        return zzbpgVarZzf;
    }

    @Override // e6.h1
    public final w2 getLiteSdkVersion() throws RemoteException {
        Parcel parcelZzdb = zzdb(1, zza());
        w2 w2Var = (w2) zzaye.zza(parcelZzdb, w2.CREATOR);
        parcelZzdb.recycle();
        return w2Var;
    }
}
