package y6;

import android.os.Parcel;
import android.os.Parcelable;
import x1.c1;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends h7.a {
    public static final Parcelable.Creator<a> CREATOR = new c1(6);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f10588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f10589c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f10590d;

    public a(int i, boolean z4, long j4, boolean z10) {
        this.f10587a = i;
        this.f10588b = z4;
        this.f10589c = j4;
        this.f10590d = z10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.R(parcel, 1, 4);
        parcel.writeInt(this.f10587a);
        com.bumptech.glide.d.R(parcel, 2, 4);
        parcel.writeInt(this.f10588b ? 1 : 0);
        com.bumptech.glide.d.R(parcel, 3, 8);
        parcel.writeLong(this.f10589c);
        com.bumptech.glide.d.R(parcel, 4, 4);
        parcel.writeInt(this.f10590d ? 1 : 0);
        com.bumptech.glide.d.Q(iP, parcel);
    }
}
