package e6;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzayd;
import com.google.android.gms.internal.ads.zzaye;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e0 extends zzayd implements f0 {
    public e0() {
        super("com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // com.google.android.gms.internal.ads.zzayd
    public final boolean zzdF(int i, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        if (i == 1) {
            o3 o3Var = (o3) zzaye.zza(parcel, o3.CREATOR);
            zzaye.zzc(parcel);
            zzg(o3Var);
            parcel2.writeNoException();
            return true;
        }
        if (i == 2) {
            String strZze = zze();
            parcel2.writeNoException();
            parcel2.writeString(strZze);
            return true;
        }
        if (i == 3) {
            boolean zZzi = zzi();
            parcel2.writeNoException();
            int i11 = zzaye.zza;
            parcel2.writeInt(zZzi ? 1 : 0);
            return true;
        }
        if (i == 4) {
            String strZzf = zzf();
            parcel2.writeNoException();
            parcel2.writeString(strZzf);
            return true;
        }
        if (i != 5) {
            return false;
        }
        o3 o3Var2 = (o3) zzaye.zza(parcel, o3.CREATOR);
        int i12 = parcel.readInt();
        zzaye.zzc(parcel);
        zzh(o3Var2, i12);
        parcel2.writeNoException();
        return true;
    }
}
