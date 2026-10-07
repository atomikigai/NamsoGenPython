package w9;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class e0 implements h7.c {
    public static final Parcelable.Creator<e0> CREATOR = new b(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f9834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f9835b;

    public e0(long j4, long j10) {
        this.f9834a = j4;
        this.f9835b = j10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.R(parcel, 1, 8);
        parcel.writeLong(this.f9834a);
        com.bumptech.glide.d.R(parcel, 2, 8);
        parcel.writeLong(this.f9835b);
        com.bumptech.glide.d.Q(iP, parcel);
    }
}
