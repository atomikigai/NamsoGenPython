package u7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 extends h7.a {
    public static final Parcelable.Creator<m0> CREATOR = new r4.a(28);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f8932a;

    public m0(boolean z4) {
        this.f8932a = z4;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof m0) && this.f8932a == ((m0) obj).f8932a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f8932a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.R(parcel, 1, 4);
        parcel.writeInt(this.f8932a ? 1 : 0);
        com.bumptech.glide.d.Q(iP, parcel);
    }
}
