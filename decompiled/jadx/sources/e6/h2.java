package e6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class h2 extends h7.a {
    public static final Parcelable.Creator<h2> CREATOR = new b8.f(23);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f3316c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public h2 f3317d;
    public IBinder e;

    public h2(int i, String str, String str2, h2 h2Var, IBinder iBinder) {
        this.f3314a = i;
        this.f3315b = str;
        this.f3316c = str2;
        this.f3317d = h2Var;
        this.e = iBinder;
    }

    public final w5.a g() {
        h2 h2Var = this.f3317d;
        w5.a aVar = null;
        if (h2Var != null) {
            String str = h2Var.f3316c;
            aVar = new w5.a(h2Var.f3314a, h2Var.f3315b, str, null);
        }
        return new w5.a(this.f3314a, this.f3315b, this.f3316c, aVar);
    }

    public final w5.l h() {
        w5.a aVar;
        f2 d2Var;
        h2 h2Var = this.f3317d;
        if (h2Var == null) {
            aVar = null;
        } else {
            aVar = new w5.a(h2Var.f3314a, h2Var.f3315b, h2Var.f3316c, null);
        }
        IBinder iBinder = this.e;
        if (iBinder == null) {
            d2Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            d2Var = iInterfaceQueryLocalInterface instanceof f2 ? (f2) iInterfaceQueryLocalInterface : new d2(iBinder);
        }
        return new w5.l(this.f3314a, this.f3315b, this.f3316c, aVar, d2Var != null ? new w5.t(d2Var) : null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.R(parcel, 1, 4);
        parcel.writeInt(this.f3314a);
        com.bumptech.glide.d.K(parcel, 2, this.f3315b, false);
        com.bumptech.glide.d.K(parcel, 3, this.f3316c, false);
        com.bumptech.glide.d.J(parcel, 4, this.f3317d, i, false);
        com.bumptech.glide.d.F(parcel, 5, this.e);
        com.bumptech.glide.d.Q(iP, parcel);
    }
}
