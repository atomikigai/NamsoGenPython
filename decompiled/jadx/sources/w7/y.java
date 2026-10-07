package w7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class y extends h7.a {
    public static final Parcelable.Creator<y> CREATOR = new v7.i(22);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f9722c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f9723d;

    public y(int i, int i10, long j4, long j10) {
        this.f9720a = i;
        this.f9721b = i10;
        this.f9722c = j4;
        this.f9723d = j10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof y) {
            y yVar = (y) obj;
            if (this.f9720a == yVar.f9720a && this.f9721b == yVar.f9721b && this.f9722c == yVar.f9722c && this.f9723d == yVar.f9723d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f9721b), Integer.valueOf(this.f9720a), Long.valueOf(this.f9723d), Long.valueOf(this.f9722c)});
    }

    public final String toString() {
        return "NetworkLocationStatus: Wifi status: " + this.f9720a + " Cell status: " + this.f9721b + " elapsed time NS: " + this.f9723d + " system time ms: " + this.f9722c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.R(parcel, 1, 4);
        parcel.writeInt(this.f9720a);
        com.bumptech.glide.d.R(parcel, 2, 4);
        parcel.writeInt(this.f9721b);
        com.bumptech.glide.d.R(parcel, 3, 8);
        parcel.writeLong(this.f9722c);
        com.bumptech.glide.d.R(parcel, 4, 8);
        parcel.writeLong(this.f9723d);
        com.bumptech.glide.d.Q(iP, parcel);
    }
}
