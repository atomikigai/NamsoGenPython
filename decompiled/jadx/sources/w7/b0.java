package w7;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends h7.a {
    public static final Parcelable.Creator<b0> CREATOR = new v7.i(28);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f9689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f9690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f9691c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f9692d;
    public final int e;

    public b0(boolean z4, long j4, float f10, long j10, int i) {
        this.f9689a = z4;
        this.f9690b = j4;
        this.f9691c = f10;
        this.f9692d = j10;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return this.f9689a == b0Var.f9689a && this.f9690b == b0Var.f9690b && Float.compare(this.f9691c, b0Var.f9691c) == 0 && this.f9692d == b0Var.f9692d && this.e == b0Var.e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f9689a), Long.valueOf(this.f9690b), Float.valueOf(this.f9691c), Long.valueOf(this.f9692d), Integer.valueOf(this.e)});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeviceOrientationRequest[mShouldUseMag=");
        sb2.append(this.f9689a);
        sb2.append(" mMinimumSamplingPeriodMs=");
        sb2.append(this.f9690b);
        sb2.append(" mSmallestAngleChangeRadians=");
        sb2.append(this.f9691c);
        long j4 = this.f9692d;
        if (j4 != Long.MAX_VALUE) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            sb2.append(" expireIn=");
            sb2.append(j4 - jElapsedRealtime);
            sb2.append("ms");
        }
        int i = this.e;
        if (i != Integer.MAX_VALUE) {
            sb2.append(" num=");
            sb2.append(i);
        }
        sb2.append(']');
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.R(parcel, 1, 4);
        parcel.writeInt(this.f9689a ? 1 : 0);
        com.bumptech.glide.d.R(parcel, 2, 8);
        parcel.writeLong(this.f9690b);
        com.bumptech.glide.d.R(parcel, 3, 4);
        parcel.writeFloat(this.f9691c);
        com.bumptech.glide.d.R(parcel, 4, 8);
        parcel.writeLong(this.f9692d);
        com.bumptech.glide.d.R(parcel, 5, 4);
        parcel.writeInt(this.e);
        com.bumptech.glide.d.Q(iP, parcel);
    }
}
