package u7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 extends h7.a {
    public static final Parcelable.Creator<p0> CREATOR = new r4.a(12);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f8943a;

    public p0(long j4) {
        this.f8943a = Long.valueOf(j4).longValue();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof p0) && this.f8943a == ((p0) obj).f8943a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f8943a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.R(parcel, 1, 8);
        parcel.writeLong(this.f8943a);
        com.bumptech.glide.d.Q(iP, parcel);
    }
}
