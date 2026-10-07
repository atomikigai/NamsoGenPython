package e6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzayc;
import com.google.android.gms.internal.ads.zzaye;
import com.google.android.gms.internal.ads.zzbgb;
import com.google.android.gms.internal.ads.zzbgc;
import com.google.android.gms.internal.ads.zzbkq;
import com.google.android.gms.internal.ads.zzbks;
import com.google.android.gms.internal.ads.zzbkt;
import com.google.android.gms.internal.ads.zzbpg;
import com.google.android.gms.internal.ads.zzbsy;
import com.google.android.gms.internal.ads.zzbsz;
import com.google.android.gms.internal.ads.zzbtf;
import com.google.android.gms.internal.ads.zzbtg;
import com.google.android.gms.internal.ads.zzbxb;
import com.google.android.gms.internal.ads.zzbxc;
import com.google.android.gms.internal.ads.zzbzg;
import com.google.android.gms.internal.ads.zzbzh;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a1 extends zzayc implements b1 {
    @Override // e6.b1
    public final zzbxc A(q7.a aVar, String str, zzbpg zzbpgVar, int i) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzf(parcelZza, aVar);
        parcelZza.writeString(str);
        zzaye.zzf(parcelZza, zzbpgVar);
        parcelZza.writeInt(243799000);
        Parcel parcelZzdb = zzdb(12, parcelZza);
        zzbxc zzbxcVarZzq = zzbxb.zzq(parcelZzdb.readStrongBinder());
        parcelZzdb.recycle();
        return zzbxcVarZzq;
    }

    @Override // e6.b1
    public final m0 D(q7.a aVar, q3 q3Var, String str, zzbpg zzbpgVar, int i) throws RemoteException {
        m0 k0Var;
        Parcel parcelZza = zza();
        zzaye.zzf(parcelZza, aVar);
        zzaye.zzd(parcelZza, q3Var);
        parcelZza.writeString(str);
        zzaye.zzf(parcelZza, zzbpgVar);
        parcelZza.writeInt(243799000);
        Parcel parcelZzdb = zzdb(13, parcelZza);
        IBinder strongBinder = parcelZzdb.readStrongBinder();
        if (strongBinder == null) {
            k0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            k0Var = iInterfaceQueryLocalInterface instanceof m0 ? (m0) iInterfaceQueryLocalInterface : new k0(strongBinder);
        }
        parcelZzdb.recycle();
        return k0Var;
    }

    @Override // e6.b1
    public final i0 E(q7.a aVar, String str, zzbpg zzbpgVar, int i) throws RemoteException {
        i0 g0Var;
        Parcel parcelZza = zza();
        zzaye.zzf(parcelZza, aVar);
        parcelZza.writeString(str);
        zzaye.zzf(parcelZza, zzbpgVar);
        parcelZza.writeInt(243799000);
        Parcel parcelZzdb = zzdb(3, parcelZza);
        IBinder strongBinder = parcelZzdb.readStrongBinder();
        if (strongBinder == null) {
            g0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            g0Var = iInterfaceQueryLocalInterface instanceof i0 ? (i0) iInterfaceQueryLocalInterface : new g0(strongBinder);
        }
        parcelZzdb.recycle();
        return g0Var;
    }

    @Override // e6.b1
    public final zzbgc G(q7.a aVar, q7.a aVar2) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzf(parcelZza, aVar);
        zzaye.zzf(parcelZza, aVar2);
        Parcel parcelZzdb = zzdb(5, parcelZza);
        zzbgc zzbgcVarZzdA = zzbgb.zzdA(parcelZzdb.readStrongBinder());
        parcelZzdb.recycle();
        return zzbgcVarZzdA;
    }

    @Override // e6.b1
    public final zzbkt b(q7.a aVar, zzbpg zzbpgVar, int i, zzbkq zzbkqVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzf(parcelZza, aVar);
        zzaye.zzf(parcelZza, zzbpgVar);
        parcelZza.writeInt(243799000);
        zzaye.zzf(parcelZza, zzbkqVar);
        Parcel parcelZzdb = zzdb(16, parcelZza);
        zzbkt zzbktVarZzb = zzbks.zzb(parcelZzdb.readStrongBinder());
        parcelZzdb.recycle();
        return zzbktVarZzb;
    }

    @Override // e6.b1
    public final zzbsz d(q7.a aVar, zzbpg zzbpgVar, int i) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzf(parcelZza, aVar);
        zzaye.zzf(parcelZza, zzbpgVar);
        parcelZza.writeInt(243799000);
        Parcel parcelZzdb = zzdb(15, parcelZza);
        zzbsz zzbszVarZzb = zzbsy.zzb(parcelZzdb.readStrongBinder());
        parcelZzdb.recycle();
        return zzbszVarZzb;
    }

    @Override // e6.b1
    public final v0 n(q7.a aVar, zzbpg zzbpgVar, int i) throws RemoteException {
        v0 t0Var;
        Parcel parcelZza = zza();
        zzaye.zzf(parcelZza, aVar);
        zzaye.zzf(parcelZza, zzbpgVar);
        parcelZza.writeInt(243799000);
        Parcel parcelZzdb = zzdb(18, parcelZza);
        IBinder strongBinder = parcelZzdb.readStrongBinder();
        if (strongBinder == null) {
            t0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloader");
            t0Var = iInterfaceQueryLocalInterface instanceof v0 ? (v0) iInterfaceQueryLocalInterface : new t0(strongBinder);
        }
        parcelZzdb.recycle();
        return t0Var;
    }

    @Override // e6.b1
    public final k1 p(q7.a aVar, int i) throws RemoteException {
        k1 i1Var;
        Parcel parcelZza = zza();
        zzaye.zzf(parcelZza, aVar);
        parcelZza.writeInt(243799000);
        Parcel parcelZzdb = zzdb(9, parcelZza);
        IBinder strongBinder = parcelZzdb.readStrongBinder();
        if (strongBinder == null) {
            i1Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            i1Var = iInterfaceQueryLocalInterface instanceof k1 ? (k1) iInterfaceQueryLocalInterface : new i1(strongBinder);
        }
        parcelZzdb.recycle();
        return i1Var;
    }

    @Override // e6.b1
    public final zzbzh t(q7.a aVar, zzbpg zzbpgVar, int i) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzf(parcelZza, aVar);
        zzaye.zzf(parcelZza, zzbpgVar);
        parcelZza.writeInt(243799000);
        Parcel parcelZzdb = zzdb(14, parcelZza);
        zzbzh zzbzhVarZzb = zzbzg.zzb(parcelZzdb.readStrongBinder());
        parcelZzdb.recycle();
        return zzbzhVarZzb;
    }

    @Override // e6.b1
    public final m0 u(q7.a aVar, q3 q3Var, String str, zzbpg zzbpgVar, int i) throws RemoteException {
        m0 k0Var;
        Parcel parcelZza = zza();
        zzaye.zzf(parcelZza, aVar);
        zzaye.zzd(parcelZza, q3Var);
        parcelZza.writeString(str);
        zzaye.zzf(parcelZza, zzbpgVar);
        parcelZza.writeInt(243799000);
        Parcel parcelZzdb = zzdb(2, parcelZza);
        IBinder strongBinder = parcelZzdb.readStrongBinder();
        if (strongBinder == null) {
            k0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            k0Var = iInterfaceQueryLocalInterface instanceof m0 ? (m0) iInterfaceQueryLocalInterface : new k0(strongBinder);
        }
        parcelZzdb.recycle();
        return k0Var;
    }

    @Override // e6.b1
    public final m0 v(q7.a aVar, q3 q3Var, String str, int i) throws RemoteException {
        m0 k0Var;
        Parcel parcelZza = zza();
        zzaye.zzf(parcelZza, aVar);
        zzaye.zzd(parcelZza, q3Var);
        parcelZza.writeString(str);
        parcelZza.writeInt(243799000);
        Parcel parcelZzdb = zzdb(10, parcelZza);
        IBinder strongBinder = parcelZzdb.readStrongBinder();
        if (strongBinder == null) {
            k0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            k0Var = iInterfaceQueryLocalInterface instanceof m0 ? (m0) iInterfaceQueryLocalInterface : new k0(strongBinder);
        }
        parcelZzdb.recycle();
        return k0Var;
    }

    @Override // e6.b1
    public final b2 w(q7.a aVar, zzbpg zzbpgVar, int i) throws RemoteException {
        b2 z1Var;
        Parcel parcelZza = zza();
        zzaye.zzf(parcelZza, aVar);
        zzaye.zzf(parcelZza, zzbpgVar);
        parcelZza.writeInt(243799000);
        Parcel parcelZzdb = zzdb(17, parcelZza);
        IBinder strongBinder = parcelZzdb.readStrongBinder();
        if (strongBinder == null) {
            z1Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            z1Var = iInterfaceQueryLocalInterface instanceof b2 ? (b2) iInterfaceQueryLocalInterface : new z1(strongBinder);
        }
        parcelZzdb.recycle();
        return z1Var;
    }

    @Override // e6.b1
    public final m0 x(q7.a aVar, q3 q3Var, String str, zzbpg zzbpgVar, int i) throws RemoteException {
        m0 k0Var;
        Parcel parcelZza = zza();
        zzaye.zzf(parcelZza, aVar);
        zzaye.zzd(parcelZza, q3Var);
        parcelZza.writeString(str);
        zzaye.zzf(parcelZza, zzbpgVar);
        parcelZza.writeInt(243799000);
        Parcel parcelZzdb = zzdb(1, parcelZza);
        IBinder strongBinder = parcelZzdb.readStrongBinder();
        if (strongBinder == null) {
            k0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            k0Var = iInterfaceQueryLocalInterface instanceof m0 ? (m0) iInterfaceQueryLocalInterface : new k0(strongBinder);
        }
        parcelZzdb.recycle();
        return k0Var;
    }

    @Override // e6.b1
    public final zzbtg zzn(q7.a aVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzf(parcelZza, aVar);
        Parcel parcelZzdb = zzdb(8, parcelZza);
        zzbtg zzbtgVarZzI = zzbtf.zzI(parcelZzdb.readStrongBinder());
        parcelZzdb.recycle();
        return zzbtgVarZzI;
    }
}
