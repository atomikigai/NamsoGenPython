package u7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a1 extends h7.a {
    public static final Parcelable.Creator<a1> CREATOR = new v0(17);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f8872a;

    public a1(boolean z4) {
        this.f8872a = Boolean.valueOf(z4).booleanValue();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof a1) && this.f8872a == ((a1) obj).f8872a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f8872a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.R(parcel, 1, 4);
        parcel.writeInt(this.f8872a ? 1 : 0);
        com.bumptech.glide.d.Q(iP, parcel);
    }
}
