package u7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class z0 extends h7.a {
    public static final Parcelable.Creator<z0> CREATOR = new v0(16);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f8985a;

    public z0(ArrayList arrayList) {
        com.google.android.gms.common.internal.i0.i(arrayList);
        this.f8985a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof z0)) {
            return false;
        }
        List list = ((z0) obj).f8985a;
        List list2 = this.f8985a;
        return list2.containsAll(list) && list.containsAll(list2);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{new HashSet(this.f8985a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.O(parcel, 1, this.f8985a, false);
        com.bumptech.glide.d.Q(iP, parcel);
    }
}
