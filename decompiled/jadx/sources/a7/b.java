package a7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.i0;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends h7.a {
    public static final Parcelable.Creator<b> CREATOR = new n(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f209b;

    public b(String str, boolean z4) {
        if (z4) {
            i0.i(str);
        }
        this.f208a = z4;
        this.f209b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f208a == bVar.f208a && i0.m(this.f209b, bVar.f209b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f208a), this.f209b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.R(parcel, 1, 4);
        parcel.writeInt(this.f208a ? 1 : 0);
        com.bumptech.glide.d.K(parcel, 2, this.f209b, false);
        com.bumptech.glide.d.Q(iP, parcel);
    }
}
