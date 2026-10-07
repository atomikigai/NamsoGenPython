package e6;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzayc;
import com.google.android.gms.internal.ads.zzaye;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class x extends zzayc implements z {
    public x(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdListener");
    }

    @Override // e6.z
    public final void zzc() throws RemoteException {
        zzdc(6, zza());
    }

    @Override // e6.z
    public final void zzd() throws RemoteException {
        zzdc(1, zza());
    }

    @Override // e6.z
    public final void zze(int i) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i);
        zzdc(2, parcelZza);
    }

    @Override // e6.z
    public final void zzf(h2 h2Var) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzd(parcelZza, h2Var);
        zzdc(8, parcelZza);
    }

    @Override // e6.z
    public final void zzg() throws RemoteException {
        zzdc(7, zza());
    }

    @Override // e6.z
    public final void zzh() throws RemoteException {
        zzdc(3, zza());
    }

    @Override // e6.z
    public final void zzi() throws RemoteException {
        zzdc(4, zza());
    }

    @Override // e6.z
    public final void zzj() throws RemoteException {
        zzdc(5, zza());
    }

    @Override // e6.z
    public final void zzk() throws RemoteException {
        zzdc(9, zza());
    }
}
