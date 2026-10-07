package e6;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class l3 extends h7.a {
    public static final Parcelable.Creator<l3> CREATOR = new b8.f(28);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f3340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f3341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f3342c;

    public l3(w5.x xVar) {
        this(xVar.f9673a, xVar.f9674b, xVar.f9675c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.R(parcel, 2, 4);
        parcel.writeInt(this.f3340a ? 1 : 0);
        com.bumptech.glide.d.R(parcel, 3, 4);
        parcel.writeInt(this.f3341b ? 1 : 0);
        com.bumptech.glide.d.R(parcel, 4, 4);
        parcel.writeInt(this.f3342c ? 1 : 0);
        com.bumptech.glide.d.Q(iP, parcel);
    }

    public l3(boolean z4, boolean z10, boolean z11) {
        this.f3340a = z4;
        this.f3341b = z10;
        this.f3342c = z11;
    }
}
