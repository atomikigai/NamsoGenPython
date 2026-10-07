package u7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class y0 extends h7.a {
    public static final Parcelable.Creator<y0> CREATOR = new v0(15);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f8978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f8979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f8980c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f8981d;

    public y0(long j4, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f8978a = j4;
        com.google.android.gms.common.internal.i0.i(bArr);
        this.f8979b = bArr;
        com.google.android.gms.common.internal.i0.i(bArr2);
        this.f8980c = bArr2;
        com.google.android.gms.common.internal.i0.i(bArr3);
        this.f8981d = bArr3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        return this.f8978a == y0Var.f8978a && Arrays.equals(this.f8979b, y0Var.f8979b) && Arrays.equals(this.f8980c, y0Var.f8980c) && Arrays.equals(this.f8981d, y0Var.f8981d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f8978a), this.f8979b, this.f8980c, this.f8981d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.R(parcel, 1, 8);
        parcel.writeLong(this.f8978a);
        com.bumptech.glide.d.D(parcel, 2, this.f8979b, false);
        com.bumptech.glide.d.D(parcel, 3, this.f8980c, false);
        com.bumptech.glide.d.D(parcel, 4, this.f8981d, false);
        com.bumptech.glide.d.Q(iP, parcel);
    }
}
