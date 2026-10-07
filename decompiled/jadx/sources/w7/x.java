package w7;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class x extends h7.a {
    public static final Parcelable.Creator<x> CREATOR = new v7.i(18);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f9719c;

    public x(String str, String str2, String str3) {
        this.f9719c = str;
        this.f9717a = str2;
        this.f9718b = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.K(parcel, 1, this.f9717a, false);
        com.bumptech.glide.d.K(parcel, 2, this.f9718b, false);
        com.bumptech.glide.d.K(parcel, 5, this.f9719c, false);
        com.bumptech.glide.d.Q(iP, parcel);
    }
}
