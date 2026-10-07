package v9;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class p extends d {
    public static final Parcelable.Creator<p> CREATOR = new v7.i(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9274a;

    public p(String str) {
        com.google.android.gms.common.internal.i0.e(str);
        this.f9274a = str;
    }

    @Override // v9.d
    public final String g() {
        return "github.com";
    }

    @Override // v9.d
    public final d h() {
        return new p(this.f9274a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.K(parcel, 1, this.f9274a, false);
        com.bumptech.glide.d.Q(iP, parcel);
    }
}
