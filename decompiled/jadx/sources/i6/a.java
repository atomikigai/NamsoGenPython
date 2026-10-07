package i6;

import android.os.Parcel;
import android.os.Parcelable;
import e6.r3;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends h7.a {
    public static final Parcelable.Creator<a> CREATOR = new r3(17);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5215c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f5216d;
    public final boolean e;

    public a(String str, int i, int i10, boolean z4, boolean z10) {
        this.f5213a = str;
        this.f5214b = i;
        this.f5215c = i10;
        this.f5216d = z4;
        this.e = z10;
    }

    public static a g() {
        return new a(12451000, 12451000, true);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.K(parcel, 2, this.f5213a, false);
        com.bumptech.glide.d.R(parcel, 3, 4);
        parcel.writeInt(this.f5214b);
        com.bumptech.glide.d.R(parcel, 4, 4);
        parcel.writeInt(this.f5215c);
        com.bumptech.glide.d.R(parcel, 5, 4);
        parcel.writeInt(this.f5216d ? 1 : 0);
        com.bumptech.glide.d.R(parcel, 6, 4);
        parcel.writeInt(this.e ? 1 : 0);
        com.bumptech.glide.d.Q(iP, parcel);
    }

    public a(int i, int i10, boolean z4) {
        this(i, i10, 0, z4, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(int i, int i10, int i11, boolean z4, boolean z10) {
        String str;
        if (z4) {
            str = "0";
        } else {
            str = "1";
        }
        StringBuilder sbD = u3.b.d(i, i10, "afma-sdk-a-v", ".", ".");
        sbD.append(str);
        this(sbD.toString(), i, i10, z4, z10);
    }
}
