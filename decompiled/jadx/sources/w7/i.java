package w7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends h7.a {
    public static final Parcelable.Creator<i> CREATOR = new v7.i(19);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f9704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f9705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f9706c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x f9707d;

    public i(ArrayList arrayList, boolean z4, boolean z10, x xVar) {
        this.f9704a = arrayList;
        this.f9705b = z4;
        this.f9706c = z10;
        this.f9707d = xVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.O(parcel, 1, Collections.unmodifiableList(this.f9704a), false);
        com.bumptech.glide.d.R(parcel, 2, 4);
        parcel.writeInt(this.f9705b ? 1 : 0);
        com.bumptech.glide.d.R(parcel, 3, 4);
        parcel.writeInt(this.f9706c ? 1 : 0);
        com.bumptech.glide.d.J(parcel, 5, this.f9707d, i, false);
        com.bumptech.glide.d.Q(iP, parcel);
    }
}
