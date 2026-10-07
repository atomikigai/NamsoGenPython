package w9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class m extends h7.a {
    public static final Parcelable.Creator<m> CREATOR = new b(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f9848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f9849b;

    public m(ArrayList arrayList, ArrayList arrayList2) {
        this.f9848a = arrayList == null ? new ArrayList() : arrayList;
        this.f9849b = arrayList2 == null ? new ArrayList() : arrayList2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.O(parcel, 1, this.f9848a, false);
        com.bumptech.glide.d.O(parcel, 2, this.f9849b, false);
        com.bumptech.glide.d.Q(iP, parcel);
    }
}
