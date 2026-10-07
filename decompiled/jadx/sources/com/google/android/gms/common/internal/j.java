package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends h7.a {
    public static final Parcelable.Creator<j> CREATOR = new b8.f(15);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f2203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f2204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f2205c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f2206d;
    public final int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f2207f;

    public j(u uVar, boolean z4, boolean z10, int[] iArr, int i, int[] iArr2) {
        this.f2203a = uVar;
        this.f2204b = z4;
        this.f2205c = z10;
        this.f2206d = iArr;
        this.e = i;
        this.f2207f = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.J(parcel, 1, this.f2203a, i, false);
        com.bumptech.glide.d.R(parcel, 2, 4);
        parcel.writeInt(this.f2204b ? 1 : 0);
        com.bumptech.glide.d.R(parcel, 3, 4);
        parcel.writeInt(this.f2205c ? 1 : 0);
        com.bumptech.glide.d.G(parcel, 4, this.f2206d, false);
        com.bumptech.glide.d.R(parcel, 5, 4);
        parcel.writeInt(this.e);
        com.bumptech.glide.d.G(parcel, 6, this.f2207f, false);
        com.bumptech.glide.d.Q(iP, parcel);
    }
}
