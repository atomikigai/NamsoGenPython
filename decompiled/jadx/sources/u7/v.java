package u7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class v extends h7.a {
    public static final Parcelable.Creator<v> CREATOR = new v0(19);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8954a;

    public v(String str) {
        com.google.android.gms.common.internal.i0.i(str);
        this.f8954a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof v) {
            return this.f8954a.equals(((v) obj).f8954a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8954a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.K(parcel, 2, this.f8954a, false);
        com.bumptech.glide.d.Q(iP, parcel);
    }
}
