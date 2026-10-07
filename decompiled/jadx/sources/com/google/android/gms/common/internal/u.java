package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends h7.a {
    public static final Parcelable.Creator<u> CREATOR = new b8.f(13);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f2265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f2266c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2267d;
    public final int e;

    public u(int i, int i10, int i11, boolean z4, boolean z10) {
        this.f2264a = i;
        this.f2265b = z4;
        this.f2266c = z10;
        this.f2267d = i10;
        this.e = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.R(parcel, 1, 4);
        parcel.writeInt(this.f2264a);
        com.bumptech.glide.d.R(parcel, 2, 4);
        parcel.writeInt(this.f2265b ? 1 : 0);
        com.bumptech.glide.d.R(parcel, 3, 4);
        parcel.writeInt(this.f2266c ? 1 : 0);
        com.bumptech.glide.d.R(parcel, 4, 4);
        parcel.writeInt(this.f2267d);
        com.bumptech.glide.d.R(parcel, 5, 4);
        parcel.writeInt(this.e);
        com.bumptech.glide.d.Q(iP, parcel);
    }
}
