package e6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzayc;
import com.google.android.gms.internal.ads.zzaye;
import com.google.android.gms.internal.ads.zzbai;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 extends zzayc implements m0 {
    public k0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManager");
    }

    @Override // e6.m0
    public final void zzB() throws RemoteException {
        zzdc(6, zza());
    }

    @Override // e6.m0
    public final void zzC(w wVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzf(parcelZza, wVar);
        zzdc(20, parcelZza);
    }

    @Override // e6.m0
    public final void zzD(z zVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzf(parcelZza, zVar);
        zzdc(7, parcelZza);
    }

    @Override // e6.m0
    public final void zzF(q3 q3Var) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzd(parcelZza, q3Var);
        zzdc(13, parcelZza);
    }

    @Override // e6.m0
    public final void zzG(z0 z0Var) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzf(parcelZza, z0Var);
        zzdc(8, parcelZza);
    }

    @Override // e6.m0
    public final void zzH(zzbai zzbaiVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzf(parcelZza, zzbaiVar);
        zzdc(40, parcelZza);
    }

    @Override // e6.m0
    public final void zzI(u3 u3Var) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzd(parcelZza, u3Var);
        zzdc(39, parcelZza);
    }

    @Override // e6.m0
    public final void zzJ(e1 e1Var) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzf(parcelZza, e1Var);
        zzdc(45, parcelZza);
    }

    @Override // e6.m0
    public final void zzL(boolean z4) throws RemoteException {
        Parcel parcelZza = zza();
        int i = zzaye.zza;
        parcelZza.writeInt(z4 ? 1 : 0);
        zzdc(34, parcelZza);
    }

    @Override // e6.m0
    public final void zzN(boolean z4) throws RemoteException {
        Parcel parcelZza = zza();
        int i = zzaye.zza;
        parcelZza.writeInt(z4 ? 1 : 0);
        zzdc(22, parcelZza);
    }

    @Override // e6.m0
    public final void zzP(y1 y1Var) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzf(parcelZza, y1Var);
        zzdc(42, parcelZza);
    }

    @Override // e6.m0
    public final void zzU(l3 l3Var) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzd(parcelZza, l3Var);
        zzdc(29, parcelZza);
    }

    @Override // e6.m0
    public final void zzW(q7.a aVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzf(parcelZza, aVar);
        zzdc(44, parcelZza);
    }

    @Override // e6.m0
    public final boolean zzab(o3 o3Var) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzd(parcelZza, o3Var);
        Parcel parcelZzdb = zzdb(4, parcelZza);
        boolean zZzg = zzaye.zzg(parcelZzdb);
        parcelZzdb.recycle();
        return zZzg;
    }

    @Override // e6.m0
    public final q3 zzg() throws RemoteException {
        Parcel parcelZzdb = zzdb(12, zza());
        q3 q3Var = (q3) zzaye.zza(parcelZzdb, q3.CREATOR);
        parcelZzdb.recycle();
        return q3Var;
    }

    @Override // e6.m0
    public final z zzi() throws RemoteException {
        z xVar;
        Parcel parcelZzdb = zzdb(33, zza());
        IBinder strongBinder = parcelZzdb.readStrongBinder();
        if (strongBinder == null) {
            xVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
            xVar = iInterfaceQueryLocalInterface instanceof z ? (z) iInterfaceQueryLocalInterface : new x(strongBinder);
        }
        parcelZzdb.recycle();
        return xVar;
    }

    @Override // e6.m0
    public final z0 zzj() throws RemoteException {
        z0 x0Var;
        Parcel parcelZzdb = zzdb(32, zza());
        IBinder strongBinder = parcelZzdb.readStrongBinder();
        if (strongBinder == null) {
            x0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
            x0Var = iInterfaceQueryLocalInterface instanceof z0 ? (z0) iInterfaceQueryLocalInterface : new x0(strongBinder);
        }
        parcelZzdb.recycle();
        return x0Var;
    }

    @Override // e6.m0
    public final f2 zzk() throws RemoteException {
        f2 d2Var;
        Parcel parcelZzdb = zzdb(41, zza());
        IBinder strongBinder = parcelZzdb.readStrongBinder();
        if (strongBinder == null) {
            d2Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            d2Var = iInterfaceQueryLocalInterface instanceof f2 ? (f2) iInterfaceQueryLocalInterface : new d2(strongBinder);
        }
        parcelZzdb.recycle();
        return d2Var;
    }

    @Override // e6.m0
    public final j2 zzl() throws RemoteException {
        j2 g2Var;
        Parcel parcelZzdb = zzdb(26, zza());
        IBinder strongBinder = parcelZzdb.readStrongBinder();
        if (strongBinder == null) {
            g2Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
            g2Var = iInterfaceQueryLocalInterface instanceof j2 ? (j2) iInterfaceQueryLocalInterface : new g2(strongBinder);
        }
        parcelZzdb.recycle();
        return g2Var;
    }

    @Override // e6.m0
    public final q7.a zzn() {
        return da.v.o(zzdb(1, zza()));
    }

    @Override // e6.m0
    public final String zzr() throws RemoteException {
        Parcel parcelZzdb = zzdb(31, zza());
        String string = parcelZzdb.readString();
        parcelZzdb.recycle();
        return string;
    }

    @Override // e6.m0
    public final void zzx() throws RemoteException {
        zzdc(2, zza());
    }

    @Override // e6.m0
    public final void zzy(o3 o3Var, c0 c0Var) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzd(parcelZza, o3Var);
        zzaye.zzf(parcelZza, c0Var);
        zzdc(43, parcelZza);
    }

    @Override // e6.m0
    public final void zzz() throws RemoteException {
        zzdc(5, zza());
    }
}
