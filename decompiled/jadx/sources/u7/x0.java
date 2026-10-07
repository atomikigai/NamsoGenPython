package u7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class x0 extends h7.a {
    public static final Parcelable.Creator<x0> CREATOR = new v0(7);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f8966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f8967b;

    public x0(byte[] bArr, boolean z4) {
        this.f8966a = z4;
        this.f8967b = bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        return this.f8966a == x0Var.f8966a && Arrays.equals(this.f8967b, x0Var.f8967b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f8966a), this.f8967b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.R(parcel, 1, 4);
        parcel.writeInt(this.f8966a ? 1 : 0);
        com.bumptech.glide.d.D(parcel, 2, this.f8967b, false);
        com.bumptech.glide.d.Q(iP, parcel);
    }
}
