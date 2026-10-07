package e6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzayd;
import com.google.android.gms.internal.ads.zzaye;
import com.google.android.gms.internal.ads.zzbfn;
import com.google.android.gms.internal.ads.zzbgv;
import com.google.android.gms.internal.ads.zzbgw;
import com.google.android.gms.internal.ads.zzbgy;
import com.google.android.gms.internal.ads.zzbgz;
import com.google.android.gms.internal.ads.zzbhb;
import com.google.android.gms.internal.ads.zzbhc;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzbhf;
import com.google.android.gms.internal.ads.zzbhi;
import com.google.android.gms.internal.ads.zzbhj;
import com.google.android.gms.internal.ads.zzbhl;
import com.google.android.gms.internal.ads.zzbhm;
import com.google.android.gms.internal.ads.zzbmb;
import com.google.android.gms.internal.ads.zzbmj;
import com.google.android.gms.internal.ads.zzbmk;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h0 extends zzayd implements i0 {
    public h0() {
        super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.internal.ads.zzayd
    public final boolean zzdF(int i, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        z xVar = null;
        c1 c1Var = null;
        switch (i) {
            case 1:
                f0 f0VarZze = zze();
                parcel2.writeNoException();
                zzaye.zzf(parcel2, f0VarZze);
                return true;
            case 2:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    xVar = iInterfaceQueryLocalInterface instanceof z ? (z) iInterfaceQueryLocalInterface : new x(strongBinder);
                }
                zzaye.zzc(parcel);
                zzl(xVar);
                parcel2.writeNoException();
                return true;
            case 3:
                zzbgw zzbgwVarZzb = zzbgv.zzb(parcel.readStrongBinder());
                zzaye.zzc(parcel);
                zzf(zzbgwVarZzb);
                parcel2.writeNoException();
                return true;
            case 4:
                zzbgz zzbgzVarZzb = zzbgy.zzb(parcel.readStrongBinder());
                zzaye.zzc(parcel);
                zzg(zzbgzVarZzb);
                parcel2.writeNoException();
                return true;
            case 5:
                String string = parcel.readString();
                zzbhf zzbhfVarZzb = zzbhe.zzb(parcel.readStrongBinder());
                zzbhc zzbhcVarZzb = zzbhb.zzb(parcel.readStrongBinder());
                zzaye.zzc(parcel);
                zzh(string, zzbhfVarZzb, zzbhcVarZzb);
                parcel2.writeNoException();
                return true;
            case 6:
                zzbfn zzbfnVar = (zzbfn) zzaye.zza(parcel, zzbfn.CREATOR);
                zzaye.zzc(parcel);
                zzo(zzbfnVar);
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    c1Var = iInterfaceQueryLocalInterface2 instanceof c1 ? (c1) iInterfaceQueryLocalInterface2 : new c1(strongBinder2);
                }
                zzaye.zzc(parcel);
                zzq(c1Var);
                parcel2.writeNoException();
                return true;
            case 8:
                zzbhj zzbhjVarZzb = zzbhi.zzb(parcel.readStrongBinder());
                q3 q3Var = (q3) zzaye.zza(parcel, q3.CREATOR);
                zzaye.zzc(parcel);
                zzj(zzbhjVarZzb, q3Var);
                parcel2.writeNoException();
                return true;
            case 9:
                z5.g gVar = (z5.g) zzaye.zza(parcel, z5.g.CREATOR);
                zzaye.zzc(parcel);
                zzp(gVar);
                parcel2.writeNoException();
                return true;
            case 10:
                zzbhm zzbhmVarZzb = zzbhl.zzb(parcel.readStrongBinder());
                zzaye.zzc(parcel);
                zzk(zzbhmVarZzb);
                parcel2.writeNoException();
                return true;
            case 11:
            case 12:
            default:
                return false;
            case 13:
                zzbmb zzbmbVar = (zzbmb) zzaye.zza(parcel, zzbmb.CREATOR);
                zzaye.zzc(parcel);
                zzn(zzbmbVar);
                parcel2.writeNoException();
                return true;
            case 14:
                zzbmk zzbmkVarZzb = zzbmj.zzb(parcel.readStrongBinder());
                zzaye.zzc(parcel);
                zzi(zzbmkVarZzb);
                parcel2.writeNoException();
                return true;
            case 15:
                z5.a aVar = (z5.a) zzaye.zza(parcel, z5.a.CREATOR);
                zzaye.zzc(parcel);
                zzm(aVar);
                parcel2.writeNoException();
                return true;
        }
    }
}
