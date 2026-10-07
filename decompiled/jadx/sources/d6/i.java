package d6;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends h7.a {
    public static final Parcelable.Creator<i> CREATOR = new b8.f(20);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f2954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f2955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f2956c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f2957d;
    public final float e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f2958f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f2959r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f2960s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f2961t;

    public i(boolean z4, boolean z10, String str, boolean z11, float f10, int i, boolean z12, boolean z13, boolean z14) {
        this.f2954a = z4;
        this.f2955b = z10;
        this.f2956c = str;
        this.f2957d = z11;
        this.e = f10;
        this.f2958f = i;
        this.f2959r = z12;
        this.f2960s = z13;
        this.f2961t = z14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.R(parcel, 2, 4);
        parcel.writeInt(this.f2954a ? 1 : 0);
        com.bumptech.glide.d.R(parcel, 3, 4);
        parcel.writeInt(this.f2955b ? 1 : 0);
        com.bumptech.glide.d.K(parcel, 4, this.f2956c, false);
        com.bumptech.glide.d.R(parcel, 5, 4);
        parcel.writeInt(this.f2957d ? 1 : 0);
        com.bumptech.glide.d.R(parcel, 6, 4);
        parcel.writeFloat(this.e);
        com.bumptech.glide.d.R(parcel, 7, 4);
        parcel.writeInt(this.f2958f);
        com.bumptech.glide.d.R(parcel, 8, 4);
        parcel.writeInt(this.f2959r ? 1 : 0);
        com.bumptech.glide.d.R(parcel, 9, 4);
        parcel.writeInt(this.f2960s ? 1 : 0);
        com.bumptech.glide.d.R(parcel, 10, 4);
        parcel.writeInt(this.f2961t ? 1 : 0);
        com.bumptech.glide.d.Q(iP, parcel);
    }

    public i(boolean z4, boolean z10, boolean z11, float f10, boolean z12, boolean z13, boolean z14) {
        this(z4, z10, null, z11, f10, -1, z12, z13, z14);
    }
}
