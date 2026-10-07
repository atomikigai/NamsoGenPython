package e6;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class w2 extends h7.a {
    public static final Parcelable.Creator<w2> CREATOR = new b8.f(24);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f3460c;

    public w2(int i, int i10, String str) {
        this.f3458a = i;
        this.f3459b = i10;
        this.f3460c = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.R(parcel, 1, 4);
        parcel.writeInt(this.f3458a);
        com.bumptech.glide.d.R(parcel, 2, 4);
        parcel.writeInt(this.f3459b);
        com.bumptech.glide.d.K(parcel, 3, this.f3460c, false);
        com.bumptech.glide.d.Q(iP, parcel);
    }
}
