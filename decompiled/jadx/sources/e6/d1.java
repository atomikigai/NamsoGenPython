package e6;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzayc;
import com.google.android.gms.internal.ads.zzaye;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class d1 extends zzayc implements e1 {
    @Override // e6.e1
    public final void zzb() throws RemoteException {
        zzdc(5, zza());
    }

    @Override // e6.e1
    public final void zzc() throws RemoteException {
        zzdc(3, zza());
    }

    @Override // e6.e1
    public final void zzd(h2 h2Var) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzd(parcelZza, h2Var);
        zzdc(1, parcelZza);
    }

    @Override // e6.e1
    public final void zze() throws RemoteException {
        zzdc(4, zza());
    }

    @Override // e6.e1
    public final void zzf() throws RemoteException {
        zzdc(2, zza());
    }
}
