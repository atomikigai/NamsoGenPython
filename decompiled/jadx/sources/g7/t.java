package g7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.d0;
import com.google.android.gms.common.internal.w0;
import e6.r3;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class t extends h7.a {
    public static final Parcelable.Creator<t> CREATOR = new r3(13);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f4277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f4278c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f4279d;

    public t(String str, o oVar, boolean z4, boolean z10) {
        this.f4276a = str;
        this.f4277b = oVar;
        this.f4278c = z4;
        this.f4279d = z10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.K(parcel, 1, this.f4276a, false);
        o oVar = this.f4277b;
        if (oVar == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            oVar = null;
        }
        com.bumptech.glide.d.F(parcel, 2, oVar);
        com.bumptech.glide.d.R(parcel, 3, 4);
        parcel.writeInt(this.f4278c ? 1 : 0);
        com.bumptech.glide.d.R(parcel, 4, 4);
        parcel.writeInt(this.f4279d ? 1 : 0);
        com.bumptech.glide.d.Q(iP, parcel);
    }

    public t(String str, IBinder iBinder, boolean z4, boolean z10) {
        d0 w0Var;
        this.f4276a = str;
        o oVar = null;
        if (iBinder != null) {
            try {
                int i = n.f4259b;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
                if (iInterfaceQueryLocalInterface instanceof d0) {
                    w0Var = (d0) iInterfaceQueryLocalInterface;
                } else {
                    w0Var = new w0(iBinder, "com.google.android.gms.common.internal.ICertData");
                }
                q7.a aVarZzd = w0Var.zzd();
                byte[] bArr = aVarZzd == null ? null : (byte[]) q7.b.I(aVarZzd);
                if (bArr != null) {
                    oVar = new o(bArr);
                } else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e);
            }
        }
        this.f4277b = oVar;
        this.f4278c = z4;
        this.f4279d = z10;
    }
}
