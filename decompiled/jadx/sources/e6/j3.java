package e6;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class j3 extends h7.a {
    public static final Parcelable.Creator<j3> CREATOR = new b8.f(27);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3331a;

    public j3(String str) {
        this.f3331a = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.K(parcel, 15, this.f3331a, false);
        com.bumptech.glide.d.Q(iP, parcel);
    }
}
