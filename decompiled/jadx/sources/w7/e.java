package w7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends h7.a {
    public static final Parcelable.Creator<e> CREATOR = new v7.i(14);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f9699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f9701c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f9702d;

    public e(ArrayList arrayList, int i, String str, String str2) {
        this.f9699a = arrayList;
        this.f9700b = i;
        this.f9701c = str;
        this.f9702d = str2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GeofencingRequest[geofences=");
        sb2.append(this.f9699a);
        sb2.append(", initialTrigger=");
        sb2.append(this.f9700b);
        sb2.append(", tag=");
        sb2.append(this.f9701c);
        sb2.append(", attributionTag=");
        return q1.a.m(sb2, this.f9702d, "]");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.O(parcel, 1, this.f9699a, false);
        com.bumptech.glide.d.R(parcel, 2, 4);
        parcel.writeInt(this.f9700b);
        com.bumptech.glide.d.K(parcel, 3, this.f9701c, false);
        com.bumptech.glide.d.K(parcel, 4, this.f9702d, false);
        com.bumptech.glide.d.Q(iP, parcel);
    }
}
