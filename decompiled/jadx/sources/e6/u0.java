package e6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzayd;
import com.google.android.gms.internal.ads.zzaye;
import com.google.android.gms.internal.ads.zzbaf;
import com.google.android.gms.internal.ads.zzbpf;
import com.google.android.gms.internal.ads.zzbpg;
import com.google.android.gms.internal.ads.zzbxc;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class u0 extends zzayd implements v0 {
    @Override // com.google.android.gms.internal.ads.zzayd
    public final boolean zzdF(int i, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        s0 r0Var;
        switch (i) {
            case 1:
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(h3.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    r0Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloadCallback");
                    r0Var = iInterfaceQueryLocalInterface instanceof s0 ? (s0) iInterfaceQueryLocalInterface : new r0(strongBinder, "com.google.android.gms.ads.internal.client.IAdPreloadCallback");
                }
                zzaye.zzc(parcel);
                zzi(arrayListCreateTypedArrayList, r0Var);
                parcel2.writeNoException();
                return true;
            case 2:
                String string = parcel.readString();
                zzaye.zzc(parcel);
                boolean zZzl = zzl(string);
                parcel2.writeNoException();
                parcel2.writeInt(zZzl ? 1 : 0);
                return true;
            case 3:
                String string2 = parcel.readString();
                zzaye.zzc(parcel);
                zzbxc zzbxcVarZzg = zzg(string2);
                parcel2.writeNoException();
                zzaye.zzf(parcel2, zzbxcVarZzg);
                return true;
            case 4:
                String string3 = parcel.readString();
                zzaye.zzc(parcel);
                boolean zZzj = zzj(string3);
                parcel2.writeNoException();
                parcel2.writeInt(zZzj ? 1 : 0);
                return true;
            case 5:
                String string4 = parcel.readString();
                zzaye.zzc(parcel);
                zzbaf zzbafVarZze = zze(string4);
                parcel2.writeNoException();
                zzaye.zzf(parcel2, zzbafVarZze);
                return true;
            case 6:
                String string5 = parcel.readString();
                zzaye.zzc(parcel);
                boolean zZzk = zzk(string5);
                parcel2.writeNoException();
                parcel2.writeInt(zZzk ? 1 : 0);
                return true;
            case 7:
                String string6 = parcel.readString();
                zzaye.zzc(parcel);
                m0 m0VarZzf = zzf(string6);
                parcel2.writeNoException();
                zzaye.zzf(parcel2, m0VarZzf);
                return true;
            case 8:
                zzbpg zzbpgVarZzf = zzbpf.zzf(parcel.readStrongBinder());
                zzaye.zzc(parcel);
                zzh(zzbpgVarZzf);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
