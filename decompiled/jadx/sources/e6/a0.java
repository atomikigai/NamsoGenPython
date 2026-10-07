package e6;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzayc;
import com.google.android.gms.internal.ads.zzaye;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends zzayc implements c0 {
    @Override // e6.c0
    public final void zzb(h2 h2Var) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzd(parcelZza, h2Var);
        zzdc(2, parcelZza);
    }

    @Override // e6.c0
    public final void zzc() throws RemoteException {
        zzdc(1, zza());
    }
}
