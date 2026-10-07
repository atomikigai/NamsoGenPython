package e6;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class i3 extends h7.a {
    public static final Parcelable.Creator<i3> CREATOR = new b8.f(26);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3327b;

    public i3(int i, int i10) {
        this.f3326a = i;
        this.f3327b = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.R(parcel, 1, 4);
        parcel.writeInt(this.f3326a);
        com.bumptech.glide.d.R(parcel, 2, 4);
        parcel.writeInt(this.f3327b);
        com.bumptech.glide.d.Q(iP, parcel);
    }
}
