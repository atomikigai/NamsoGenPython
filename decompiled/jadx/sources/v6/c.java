package v6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.i0;
import java.util.ArrayList;
import java.util.List;
import u7.v0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends h7.a {
    public static final Parcelable.Creator<c> CREATOR = new v0(22);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f9181b;

    public c(ArrayList arrayList, int i) {
        this.f9180a = i;
        i0.i(arrayList);
        this.f9181b = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.R(parcel, 1, 4);
        parcel.writeInt(this.f9180a);
        com.bumptech.glide.d.O(parcel, 2, this.f9181b, false);
        com.bumptech.glide.d.Q(iP, parcel);
    }
}
