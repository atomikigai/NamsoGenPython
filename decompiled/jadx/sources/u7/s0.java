package u7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class s0 extends h7.a {
    public static final Parcelable.Creator<s0> CREATOR = new r4.a(16);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[][] f8949a;

    public s0(byte[][] bArr) {
        com.google.android.gms.common.internal.i0.b(bArr != null);
        com.google.android.gms.common.internal.i0.b(1 == ((bArr.length & 1) ^ 1));
        int i = 0;
        while (i < bArr.length) {
            com.google.android.gms.common.internal.i0.b(i == 0 || bArr[i] != null);
            int i10 = i + 1;
            com.google.android.gms.common.internal.i0.b(bArr[i10] != null);
            int length = bArr[i10].length;
            com.google.android.gms.common.internal.i0.b(length == 32 || length == 64);
            i += 2;
        }
        this.f8949a = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s0) {
            return Arrays.deepEquals(this.f8949a, ((s0) obj).f8949a);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = 0;
        for (byte[] bArr : this.f8949a) {
            iHashCode ^= Arrays.hashCode(new Object[]{bArr});
        }
        return iHashCode;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        byte[][] bArr = this.f8949a;
        if (bArr != null) {
            int iP2 = com.bumptech.glide.d.P(1, parcel);
            parcel.writeInt(bArr.length);
            for (byte[] bArr2 : bArr) {
                parcel.writeByteArray(bArr2);
            }
            com.bumptech.glide.d.Q(iP2, parcel);
        }
        com.bumptech.glide.d.Q(iP, parcel);
    }
}
