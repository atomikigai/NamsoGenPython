package w7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.i0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends h7.a {
    public static final Parcelable.Creator<l> CREATOR = new v7.i(24);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f9715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9716b;

    public l(ArrayList arrayList, int i) {
        this.f9715a = arrayList;
        this.f9716b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return i0.m(this.f9715a, lVar.f9715a) && this.f9716b == lVar.f9716b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9715a, Integer.valueOf(this.f9716b)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        i0.i(parcel);
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.O(parcel, 1, this.f9715a, false);
        com.bumptech.glide.d.R(parcel, 2, 4);
        parcel.writeInt(this.f9716b);
        com.bumptech.glide.d.Q(iP, parcel);
    }
}
