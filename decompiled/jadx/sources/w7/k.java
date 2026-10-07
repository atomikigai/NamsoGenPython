package w7;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends h7.a {
    public static final Parcelable.Creator<k> CREATOR = new v7.i(21);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f9710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f9711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f9712c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f9713d;
    public final boolean e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f9714f;

    public k(boolean z4, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        this.f9710a = z4;
        this.f9711b = z10;
        this.f9712c = z11;
        this.f9713d = z12;
        this.e = z13;
        this.f9714f = z14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.R(parcel, 1, 4);
        parcel.writeInt(this.f9710a ? 1 : 0);
        com.bumptech.glide.d.R(parcel, 2, 4);
        parcel.writeInt(this.f9711b ? 1 : 0);
        com.bumptech.glide.d.R(parcel, 3, 4);
        parcel.writeInt(this.f9712c ? 1 : 0);
        com.bumptech.glide.d.R(parcel, 4, 4);
        parcel.writeInt(this.f9713d ? 1 : 0);
        com.bumptech.glide.d.R(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        com.bumptech.glide.d.R(parcel, 6, 4);
        parcel.writeInt(this.f9714f ? 1 : 0);
        com.bumptech.glide.d.Q(iP, parcel);
    }
}
