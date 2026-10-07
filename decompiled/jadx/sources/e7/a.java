package e7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import e6.r3;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends h7.a {
    public static final Parcelable.Creator<a> CREATOR = new r3(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bundle f3467c;

    public a(int i, int i10, Bundle bundle) {
        this.f3465a = i;
        this.f3466b = i10;
        this.f3467c = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.R(parcel, 1, 4);
        parcel.writeInt(this.f3465a);
        com.bumptech.glide.d.R(parcel, 2, 4);
        parcel.writeInt(this.f3466b);
        com.bumptech.glide.d.C(parcel, 3, this.f3467c, false);
        com.bumptech.glide.d.Q(iP, parcel);
    }
}
