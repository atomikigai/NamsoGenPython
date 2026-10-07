package e6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzayc;
import com.google.android.gms.internal.ads.zzaye;
import com.google.android.gms.internal.ads.zzbfn;
import com.google.android.gms.internal.ads.zzbhc;
import com.google.android.gms.internal.ads.zzbhf;
import com.google.android.gms.internal.ads.zzbhm;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 extends zzayc implements i0 {
    public g0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // e6.i0
    public final f0 zze() throws RemoteException {
        f0 d0Var;
        Parcel parcelZzdb = zzdb(1, zza());
        IBinder strongBinder = parcelZzdb.readStrongBinder();
        if (strongBinder == null) {
            d0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoader");
            d0Var = iInterfaceQueryLocalInterface instanceof f0 ? (f0) iInterfaceQueryLocalInterface : new d0(strongBinder, "com.google.android.gms.ads.internal.client.IAdLoader");
        }
        parcelZzdb.recycle();
        return d0Var;
    }

    @Override // e6.i0
    public final void zzh(String str, zzbhf zzbhfVar, zzbhc zzbhcVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzaye.zzf(parcelZza, zzbhfVar);
        zzaye.zzf(parcelZza, zzbhcVar);
        zzdc(5, parcelZza);
    }

    @Override // e6.i0
    public final void zzk(zzbhm zzbhmVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzf(parcelZza, zzbhmVar);
        zzdc(10, parcelZza);
    }

    @Override // e6.i0
    public final void zzl(z zVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzf(parcelZza, zVar);
        zzdc(2, parcelZza);
    }

    @Override // e6.i0
    public final void zzo(zzbfn zzbfnVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzd(parcelZza, zzbfnVar);
        zzdc(6, parcelZza);
    }
}
