package u7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 extends h7.a {
    public static final Parcelable.Creator<r0> CREATOR = new r4.a(15);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8946a;

    public r0(String str) {
        com.google.android.gms.common.internal.i0.i(str);
        this.f8946a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r0) {
            return this.f8946a.equals(((r0) obj).f8946a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8946a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.K(parcel, 1, this.f8946a, false);
        com.bumptech.glide.d.Q(iP, parcel);
    }
}
