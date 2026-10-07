package e6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzayd;
import com.google.android.gms.internal.ads.zzaye;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class g3 extends zzayd implements y1 {
    public g3() {
        super("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    public static y1 y(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
        return iInterfaceQueryLocalInterface instanceof y1 ? (y1) iInterfaceQueryLocalInterface : new x1(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayd
    public final boolean zzdF(int i, Parcel parcel, Parcel parcel2, int i10) {
        if (i == 1) {
            zzaye.zzc(parcel);
            parcel2.writeNoException();
        } else {
            if (i != 2) {
                return false;
            }
            parcel2.writeNoException();
            int i11 = zzaye.zza;
            parcel2.writeInt(1);
        }
        return true;
    }

    @Override // e6.y1
    public final boolean zzf() {
        return true;
    }

    @Override // e6.y1
    public final void B(s3 s3Var) {
    }
}
