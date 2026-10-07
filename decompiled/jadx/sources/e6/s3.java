package e6;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class s3 extends h7.a {
    public static final Parcelable.Creator<s3> CREATOR = new r3(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f3435c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f3436d;

    public s3(int i, int i10, long j4, String str) {
        this.f3433a = i;
        this.f3434b = i10;
        this.f3435c = str;
        this.f3436d = j4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.R(parcel, 1, 4);
        parcel.writeInt(this.f3433a);
        com.bumptech.glide.d.R(parcel, 2, 4);
        parcel.writeInt(this.f3434b);
        com.bumptech.glide.d.K(parcel, 3, this.f3435c, false);
        com.bumptech.glide.d.R(parcel, 4, 8);
        parcel.writeLong(this.f3436d);
        com.bumptech.glide.d.Q(iP, parcel);
    }
}
