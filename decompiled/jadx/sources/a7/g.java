package a7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.i0;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends h7.a {
    public static final Parcelable.Creator<g> CREATOR = new n(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f221a;

    public g(int i) {
        this.f221a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return i0.m(Integer.valueOf(this.f221a), Integer.valueOf(((g) obj).f221a));
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f221a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.R(parcel, 1, 4);
        parcel.writeInt(this.f221a);
        com.bumptech.glide.d.Q(iP, parcel);
    }
}
