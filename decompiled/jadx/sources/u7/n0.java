package u7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 extends h7.a {
    public static final Parcelable.Creator<n0> CREATOR = new v0(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f8936a;

    public n0(ArrayList arrayList) {
        this.f8936a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n0)) {
            return false;
        }
        List list = ((n0) obj).f8936a;
        List list2 = this.f8936a;
        if (list2 == null && list == null) {
            return true;
        }
        return list2 != null && list != null && list2.containsAll(list) && list.containsAll(list2);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{new HashSet(this.f8936a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.O(parcel, 1, this.f8936a, false);
        com.bumptech.glide.d.Q(iP, parcel);
    }
}
