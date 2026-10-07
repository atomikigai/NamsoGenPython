package e6;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.webkit.TracingConfig;
import com.google.android.gms.internal.ads.zzayd;
import com.google.android.gms.internal.ads.zzaye;
import com.google.android.gms.internal.ads.zzbah;
import com.google.android.gms.internal.ads.zzbai;
import com.google.android.gms.internal.ads.zzbbs;
import com.google.android.gms.internal.ads.zzbdh;
import com.google.android.gms.internal.ads.zzbdi;
import com.google.android.gms.internal.ads.zzbto;
import com.google.android.gms.internal.ads.zzbtp;
import com.google.android.gms.internal.ads.zzbtr;
import com.google.android.gms.internal.ads.zzbts;
import com.google.android.gms.internal.ads.zzbwo;
import com.google.android.gms.internal.ads.zzbwp;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l0 extends zzayd implements m0 {
    public l0() {
        super("com.google.android.gms.ads.internal.client.IAdManager");
    }

    public static m0 zzad(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
        return iInterfaceQueryLocalInterface instanceof m0 ? (m0) iInterfaceQueryLocalInterface : new k0(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayd
    public final boolean zzdF(int i, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        z xVar = null;
        e1 d1Var = null;
        c0 a0Var = null;
        y1 x1Var = null;
        q0 p0Var = null;
        c1 c1Var = null;
        w vVar = null;
        z0 x0Var = null;
        switch (i) {
            case 1:
                q7.a aVarZzn = zzn();
                parcel2.writeNoException();
                zzaye.zzf(parcel2, aVarZzn);
                return true;
            case 2:
                zzx();
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zZzaa = zzaa();
                parcel2.writeNoException();
                int i11 = zzaye.zza;
                parcel2.writeInt(zZzaa ? 1 : 0);
                return true;
            case 4:
                o3 o3Var = (o3) zzaye.zza(parcel, o3.CREATOR);
                zzaye.zzc(parcel);
                boolean zZzab = zzab(o3Var);
                parcel2.writeNoException();
                parcel2.writeInt(zZzab ? 1 : 0);
                return true;
            case 5:
                zzz();
                parcel2.writeNoException();
                return true;
            case 6:
                zzB();
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    xVar = iInterfaceQueryLocalInterface instanceof z ? (z) iInterfaceQueryLocalInterface : new x(strongBinder);
                }
                zzaye.zzc(parcel);
                zzD(xVar);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
                    x0Var = iInterfaceQueryLocalInterface2 instanceof z0 ? (z0) iInterfaceQueryLocalInterface2 : new x0(strongBinder2);
                }
                zzaye.zzc(parcel);
                zzG(x0Var);
                parcel2.writeNoException();
                return true;
            case 9:
                zzX();
                parcel2.writeNoException();
                return true;
            case 10:
                parcel2.writeNoException();
                return true;
            case 11:
                zzA();
                parcel2.writeNoException();
                return true;
            case 12:
                q3 q3VarZzg = zzg();
                parcel2.writeNoException();
                zzaye.zze(parcel2, q3VarZzg);
                return true;
            case 13:
                q3 q3Var = (q3) zzaye.zza(parcel, q3.CREATOR);
                zzaye.zzc(parcel);
                zzF(q3Var);
                parcel2.writeNoException();
                return true;
            case 14:
                zzbtp zzbtpVarZzb = zzbto.zzb(parcel.readStrongBinder());
                zzaye.zzc(parcel);
                zzM(zzbtpVarZzb);
                parcel2.writeNoException();
                return true;
            case 15:
                zzbts zzbtsVarZzb = zzbtr.zzb(parcel.readStrongBinder());
                String string = parcel.readString();
                zzaye.zzc(parcel);
                zzQ(zzbtsVarZzb, string);
                parcel2.writeNoException();
                return true;
            case 16:
            case 17:
            case 27:
            case 28:
            default:
                return false;
            case 18:
                String strZzs = zzs();
                parcel2.writeNoException();
                parcel2.writeString(strZzs);
                return true;
            case 19:
                zzbdi zzbdiVarZzb = zzbdh.zzb(parcel.readStrongBinder());
                zzaye.zzc(parcel);
                zzO(zzbdiVarZzb);
                parcel2.writeNoException();
                return true;
            case 20:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdClickListener");
                    vVar = iInterfaceQueryLocalInterface3 instanceof w ? (w) iInterfaceQueryLocalInterface3 : new v(strongBinder3, "com.google.android.gms.ads.internal.client.IAdClickListener");
                }
                zzaye.zzc(parcel);
                zzC(vVar);
                parcel2.writeNoException();
                return true;
            case zzbbs.zzt.zzm /* 21 */:
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    c1Var = iInterfaceQueryLocalInterface4 instanceof c1 ? (c1) iInterfaceQueryLocalInterface4 : new c1(strongBinder4);
                }
                zzaye.zzc(parcel);
                zzac(c1Var);
                parcel2.writeNoException();
                return true;
            case 22:
                boolean zZzg = zzaye.zzg(parcel);
                zzaye.zzc(parcel);
                zzN(zZzg);
                parcel2.writeNoException();
                return true;
            case 23:
                boolean zZzZ = zzZ();
                parcel2.writeNoException();
                int i12 = zzaye.zza;
                parcel2.writeInt(zZzZ ? 1 : 0);
                return true;
            case 24:
                zzbwp zzbwpVarZzb = zzbwo.zzb(parcel.readStrongBinder());
                zzaye.zzc(parcel);
                zzS(zzbwpVarZzb);
                parcel2.writeNoException();
                return true;
            case 25:
                String string2 = parcel.readString();
                zzaye.zzc(parcel);
                zzT(string2);
                parcel2.writeNoException();
                return true;
            case 26:
                j2 j2VarZzl = zzl();
                parcel2.writeNoException();
                zzaye.zzf(parcel2, j2VarZzl);
                return true;
            case 29:
                l3 l3Var = (l3) zzaye.zza(parcel, l3.CREATOR);
                zzaye.zzc(parcel);
                zzU(l3Var);
                parcel2.writeNoException();
                return true;
            case 30:
                m2 m2Var = (m2) zzaye.zza(parcel, m2.CREATOR);
                zzaye.zzc(parcel);
                zzK(m2Var);
                parcel2.writeNoException();
                return true;
            case 31:
                String strZzr = zzr();
                parcel2.writeNoException();
                parcel2.writeString(strZzr);
                return true;
            case TracingConfig.CATEGORIES_JAVASCRIPT_AND_RENDERING /* 32 */:
                z0 z0VarZzj = zzj();
                parcel2.writeNoException();
                zzaye.zzf(parcel2, z0VarZzj);
                return true;
            case 33:
                z zVarZzi = zzi();
                parcel2.writeNoException();
                zzaye.zzf(parcel2, zVarZzi);
                return true;
            case 34:
                boolean zZzg2 = zzaye.zzg(parcel);
                zzaye.zzc(parcel);
                zzL(zZzg2);
                parcel2.writeNoException();
                return true;
            case 35:
                String strZzt = zzt();
                parcel2.writeNoException();
                parcel2.writeString(strZzt);
                return true;
            case 36:
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
                    p0Var = iInterfaceQueryLocalInterface5 instanceof q0 ? (q0) iInterfaceQueryLocalInterface5 : new p0(strongBinder5);
                }
                zzaye.zzc(parcel);
                zzE(p0Var);
                parcel2.writeNoException();
                return true;
            case 37:
                Bundle bundleZzd = zzd();
                parcel2.writeNoException();
                zzaye.zze(parcel2, bundleZzd);
                return true;
            case 38:
                String string3 = parcel.readString();
                zzaye.zzc(parcel);
                zzR(string3);
                parcel2.writeNoException();
                return true;
            case 39:
                u3 u3Var = (u3) zzaye.zza(parcel, u3.CREATOR);
                zzaye.zzc(parcel);
                zzI(u3Var);
                parcel2.writeNoException();
                return true;
            case 40:
                zzbai zzbaiVarZze = zzbah.zze(parcel.readStrongBinder());
                zzaye.zzc(parcel);
                zzH(zzbaiVarZze);
                parcel2.writeNoException();
                return true;
            case 41:
                f2 f2VarZzk = zzk();
                parcel2.writeNoException();
                zzaye.zzf(parcel2, f2VarZzk);
                return true;
            case 42:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
                    x1Var = iInterfaceQueryLocalInterface6 instanceof y1 ? (y1) iInterfaceQueryLocalInterface6 : new x1(strongBinder6);
                }
                zzaye.zzc(parcel);
                zzP(x1Var);
                parcel2.writeNoException();
                return true;
            case 43:
                o3 o3Var2 = (o3) zzaye.zza(parcel, o3.CREATOR);
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoadCallback");
                    a0Var = iInterfaceQueryLocalInterface7 instanceof c0 ? (c0) iInterfaceQueryLocalInterface7 : new a0(strongBinder7, "com.google.android.gms.ads.internal.client.IAdLoadCallback");
                }
                zzaye.zzc(parcel);
                zzy(o3Var2, a0Var);
                parcel2.writeNoException();
                return true;
            case 44:
                q7.a aVarY = q7.b.y(parcel.readStrongBinder());
                zzaye.zzc(parcel);
                zzW(aVarY);
                parcel2.writeNoException();
                return true;
            case 45:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
                    d1Var = iInterfaceQueryLocalInterface8 instanceof e1 ? (e1) iInterfaceQueryLocalInterface8 : new d1(strongBinder8, "com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
                }
                zzaye.zzc(parcel);
                zzJ(d1Var);
                parcel2.writeNoException();
                return true;
            case 46:
                boolean zZzY = zzY();
                parcel2.writeNoException();
                int i13 = zzaye.zza;
                parcel2.writeInt(zZzY ? 1 : 0);
                return true;
        }
    }
}
