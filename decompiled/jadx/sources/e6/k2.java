package e6;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzayc;
import com.google.android.gms.internal.ads.zzaye;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class k2 extends zzayc implements l2 {
    public k2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    @Override // e6.l2
    public final void C(boolean z4) throws RemoteException {
        Parcel parcelZza = zza();
        int i = zzaye.zza;
        parcelZza.writeInt(z4 ? 1 : 0);
        zzdc(5, parcelZza);
    }

    @Override // e6.l2
    public final void zze() throws RemoteException {
        zzdc(4, zza());
    }

    @Override // e6.l2
    public final void zzg() throws RemoteException {
        zzdc(3, zza());
    }

    @Override // e6.l2
    public final void zzh() throws RemoteException {
        zzdc(2, zza());
    }

    @Override // e6.l2
    public final void zzi() throws RemoteException {
        zzdc(1, zza());
    }
}
