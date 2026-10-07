package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class o0 extends h7.a {
    public static final Parcelable.Creator<o0> CREATOR = new b8.f(14);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Bundle f2232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g7.d[] f2233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2234c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public j f2235d;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.C(parcel, 1, this.f2232a, false);
        com.bumptech.glide.d.N(parcel, 2, this.f2233b, i);
        int i10 = this.f2234c;
        com.bumptech.glide.d.R(parcel, 3, 4);
        parcel.writeInt(i10);
        com.bumptech.glide.d.J(parcel, 4, this.f2235d, i, false);
        com.bumptech.glide.d.Q(iP, parcel);
    }
}
