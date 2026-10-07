package v9;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class q extends d {
    public static final Parcelable.Creator<q> CREATOR = new v7.i(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9276b;

    public q(String str, String str2) {
        if (str == null && str2 == null) {
            throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
        }
        if (str != null && str.length() == 0) {
            throw new IllegalArgumentException("idToken cannot be empty");
        }
        if (str2 != null && str2.length() == 0) {
            throw new IllegalArgumentException("accessToken cannot be empty");
        }
        this.f9275a = str;
        this.f9276b = str2;
    }

    @Override // v9.d
    public final String g() {
        return "google.com";
    }

    @Override // v9.d
    public final d h() {
        return new q(this.f9275a, this.f9276b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.K(parcel, 1, this.f9275a, false);
        com.bumptech.glide.d.K(parcel, 2, this.f9276b, false);
        com.bumptech.glide.d.Q(iP, parcel);
    }
}
