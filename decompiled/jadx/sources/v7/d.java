package v7;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import u7.v0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends h7.a {
    public static final Parcelable.Creator<d> CREATOR = new v0(25);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f9193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f9194c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f9195d;

    public d(int i, byte[] bArr, String str, ArrayList arrayList) {
        this.f9192a = i;
        this.f9193b = bArr;
        try {
            this.f9194c = f.a(str);
            this.f9195d = arrayList;
        } catch (e e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        List list = dVar.f9195d;
        if (!Arrays.equals(this.f9193b, dVar.f9193b) || !this.f9194c.equals(dVar.f9194c)) {
            return false;
        }
        List list2 = this.f9195d;
        if (list2 == null && list == null) {
            return true;
        }
        return list2 != null && list != null && list2.containsAll(list) && list.containsAll(list2);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.f9193b)), this.f9194c, this.f9195d});
    }

    public final String toString() {
        List list = this.f9195d;
        String string = list == null ? "null" : list.toString();
        byte[] bArr = this.f9193b;
        String strEncodeToString = bArr == null ? null : Base64.encodeToString(bArr, 0);
        StringBuilder sb2 = new StringBuilder("{keyHandle: ");
        sb2.append(strEncodeToString);
        sb2.append(", version: ");
        sb2.append(this.f9194c);
        sb2.append(", transports: ");
        return q1.a.m(sb2, string, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.R(parcel, 1, 4);
        parcel.writeInt(this.f9192a);
        com.bumptech.glide.d.D(parcel, 2, this.f9193b, false);
        com.bumptech.glide.d.K(parcel, 3, this.f9194c.f9198a, false);
        com.bumptech.glide.d.O(parcel, 4, this.f9195d, false);
        com.bumptech.glide.d.Q(iP, parcel);
    }
}
