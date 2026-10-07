package u7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class w0 extends h7.a {
    public static final Parcelable.Creator<w0> CREATOR = new v0(6);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f8957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f8958b;

    public w0(byte[] bArr, byte[] bArr2) {
        this.f8957a = bArr;
        this.f8958b = bArr2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return Arrays.equals(this.f8957a, w0Var.f8957a) && Arrays.equals(this.f8958b, w0Var.f8958b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8957a, this.f8958b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.D(parcel, 1, this.f8957a, false);
        com.bumptech.glide.d.D(parcel, 2, this.f8958b, false);
        com.bumptech.glide.d.Q(iP, parcel);
    }
}
