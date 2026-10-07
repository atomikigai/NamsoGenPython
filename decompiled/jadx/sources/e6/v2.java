package e6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzayd;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class v2 extends zzayd implements q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3457b;

    public v2(String str, String str2) {
        super("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
        this.f3456a = str;
        this.f3457b = str2;
    }

    public static q1 y(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
        return iInterfaceQueryLocalInterface instanceof q1 ? (q1) iInterfaceQueryLocalInterface : new p1(iBinder, "com.google.android.gms.ads.internal.client.IMuteThisAdReason");
    }

    @Override // com.google.android.gms.internal.ads.zzayd
    public final boolean zzdF(int i, Parcel parcel, Parcel parcel2, int i10) {
        if (i == 1) {
            parcel2.writeNoException();
            parcel2.writeString(this.f3456a);
        } else {
            if (i != 2) {
                return false;
            }
            parcel2.writeNoException();
            parcel2.writeString(this.f3457b);
        }
        return true;
    }

    @Override // e6.q1
    public final String zze() {
        return this.f3456a;
    }

    @Override // e6.q1
    public final String zzf() {
        return this.f3457b;
    }
}
