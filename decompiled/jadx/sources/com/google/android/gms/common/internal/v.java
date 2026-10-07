package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class v extends h7.a {
    public static final Parcelable.Creator<v> CREATOR = new b8.f(9);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f2272b;

    public v(int i, List list) {
        this.f2271a = i;
        this.f2272b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.R(parcel, 1, 4);
        parcel.writeInt(this.f2271a);
        com.bumptech.glide.d.O(parcel, 2, this.f2272b, false);
        com.bumptech.glide.d.Q(iP, parcel);
    }
}
