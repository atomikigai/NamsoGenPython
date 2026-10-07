package e6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzayc;
import com.google.android.gms.internal.ads.zzaye;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class g2 extends zzayc implements j2 {
    public g2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoController");
    }

    @Override // e6.j2
    public final float zze() {
        throw null;
    }

    @Override // e6.j2
    public final float zzf() {
        throw null;
    }

    @Override // e6.j2
    public final float zzg() {
        throw null;
    }

    @Override // e6.j2
    public final l2 zzi() throws RemoteException {
        l2 k2Var;
        Parcel parcelZzdb = zzdb(11, zza());
        IBinder strongBinder = parcelZzdb.readStrongBinder();
        if (strongBinder == null) {
            k2Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
            k2Var = iInterfaceQueryLocalInterface instanceof l2 ? (l2) iInterfaceQueryLocalInterface : new k2(strongBinder);
        }
        parcelZzdb.recycle();
        return k2Var;
    }

    @Override // e6.j2
    public final void zzm(l2 l2Var) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzf(parcelZza, l2Var);
        zzdc(8, parcelZza);
    }
}
