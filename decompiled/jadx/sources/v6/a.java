package v6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.i0;
import java.util.Arrays;
import u7.v0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends h7.a {
    public static final Parcelable.Creator<a> CREATOR = new v0(20);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f9172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f9173c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f9174d;
    public final int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f9175f;

    public a(int i, long j4, String str, int i10, int i11, String str2) {
        this.f9171a = i;
        this.f9172b = j4;
        i0.i(str);
        this.f9173c = str;
        this.f9174d = i10;
        this.e = i11;
        this.f9175f = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        a aVar = (a) obj;
        return this.f9171a == aVar.f9171a && this.f9172b == aVar.f9172b && i0.m(this.f9173c, aVar.f9173c) && this.f9174d == aVar.f9174d && this.e == aVar.e && i0.m(this.f9175f, aVar.f9175f);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f9171a), Long.valueOf(this.f9172b), this.f9173c, Integer.valueOf(this.f9174d), Integer.valueOf(this.e), this.f9175f});
    }

    public final String toString() {
        String str;
        int i = this.f9174d;
        if (i == 1) {
            str = "ADDED";
        } else if (i == 2) {
            str = "REMOVED";
        } else if (i != 3) {
            str = i != 4 ? "UNKNOWN" : "RENAMED_TO";
        } else {
            str = "RENAMED_FROM";
        }
        StringBuilder sbE = u3.b.e("AccountChangeEvent {accountName = ", this.f9173c, ", changeType = ", str, ", changeData = ");
        sbE.append(this.f9175f);
        sbE.append(", eventIndex = ");
        sbE.append(this.e);
        sbE.append("}");
        return sbE.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.R(parcel, 1, 4);
        parcel.writeInt(this.f9171a);
        com.bumptech.glide.d.R(parcel, 2, 8);
        parcel.writeLong(this.f9172b);
        com.bumptech.glide.d.K(parcel, 3, this.f9173c, false);
        com.bumptech.glide.d.R(parcel, 4, 4);
        parcel.writeInt(this.f9174d);
        com.bumptech.glide.d.R(parcel, 5, 4);
        parcel.writeInt(this.e);
        com.bumptech.glide.d.K(parcel, 6, this.f9175f, false);
        com.bumptech.glide.d.Q(iP, parcel);
    }
}
