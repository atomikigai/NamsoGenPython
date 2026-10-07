package v9;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class b0 extends d {
    public static final Parcelable.Creator<b0> CREATOR = new v7.i(7);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9226b;

    public b0(String str, String str2) {
        com.google.android.gms.common.internal.i0.e(str);
        this.f9225a = str;
        com.google.android.gms.common.internal.i0.e(str2);
        this.f9226b = str2;
    }

    @Override // v9.d
    public final String g() {
        return "twitter.com";
    }

    @Override // v9.d
    public final d h() {
        return new b0(this.f9225a, this.f9226b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.K(parcel, 1, this.f9225a, false);
        com.bumptech.glide.d.K(parcel, 2, this.f9226b, false);
        com.bumptech.glide.d.Q(iP, parcel);
    }
}
