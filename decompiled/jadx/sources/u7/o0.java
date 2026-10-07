package u7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class o0 extends h7.a {
    public static final Parcelable.Creator<o0> CREATOR = new v0(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final short f8941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final short f8942c;

    public o0(int i, short s10, short s11) {
        this.f8940a = i;
        this.f8941b = s10;
        this.f8942c = s11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return this.f8940a == o0Var.f8940a && this.f8941b == o0Var.f8941b && this.f8942c == o0Var.f8942c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f8940a), Short.valueOf(this.f8941b), Short.valueOf(this.f8942c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.R(parcel, 1, 4);
        parcel.writeInt(this.f8940a);
        com.bumptech.glide.d.R(parcel, 2, 4);
        parcel.writeInt(this.f8941b);
        com.bumptech.glide.d.R(parcel, 3, 4);
        parcel.writeInt(this.f8942c);
        com.bumptech.glide.d.Q(iP, parcel);
    }
}
