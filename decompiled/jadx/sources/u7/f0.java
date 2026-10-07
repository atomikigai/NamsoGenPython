package u7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends h7.a {
    public static final Parcelable.Creator<f0> CREATOR = new r4.a(24);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f8899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f8901c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f8902d;

    public f0(String str, String str2, String str3, byte[] bArr) {
        com.google.android.gms.common.internal.i0.i(bArr);
        this.f8899a = bArr;
        com.google.android.gms.common.internal.i0.i(str);
        this.f8900b = str;
        this.f8901c = str2;
        com.google.android.gms.common.internal.i0.i(str3);
        this.f8902d = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return Arrays.equals(this.f8899a, f0Var.f8899a) && com.google.android.gms.common.internal.i0.m(this.f8900b, f0Var.f8900b) && com.google.android.gms.common.internal.i0.m(this.f8901c, f0Var.f8901c) && com.google.android.gms.common.internal.i0.m(this.f8902d, f0Var.f8902d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8899a, this.f8900b, this.f8901c, this.f8902d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.D(parcel, 2, this.f8899a, false);
        com.bumptech.glide.d.K(parcel, 3, this.f8900b, false);
        com.bumptech.glide.d.K(parcel, 4, this.f8901c, false);
        com.bumptech.glide.d.K(parcel, 5, this.f8902d, false);
        com.bumptech.glide.d.Q(iP, parcel);
    }
}
