package w7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.i0;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends h7.a {
    public static final Parcelable.Creator<b> CREATOR = new v7.i(26);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9688b;

    public b(int i, int i10) {
        this.f9687a = i;
        this.f9688b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f9687a == bVar.f9687a && this.f9688b == bVar.f9688b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f9687a), Integer.valueOf(this.f9688b)});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(75);
        sb2.append("ActivityTransition [mActivityType=");
        sb2.append(this.f9687a);
        sb2.append(", mTransitionType=");
        sb2.append(this.f9688b);
        sb2.append(']');
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        i0.i(parcel);
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.R(parcel, 1, 4);
        parcel.writeInt(this.f9687a);
        com.bumptech.glide.d.R(parcel, 2, 4);
        parcel.writeInt(this.f9688b);
        com.bumptech.glide.d.Q(iP, parcel);
    }
}
