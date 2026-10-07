package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends h7.a {
    public static final Parcelable.Creator<r> CREATOR = new b8.f(10);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2251c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f2252d;
    public final long e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f2253f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f2254r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f2255s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f2256t;

    public r(int i, int i10, int i11, long j4, long j10, String str, String str2, int i12, int i13) {
        this.f2249a = i;
        this.f2250b = i10;
        this.f2251c = i11;
        this.f2252d = j4;
        this.e = j10;
        this.f2253f = str;
        this.f2254r = str2;
        this.f2255s = i12;
        this.f2256t = i13;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.R(parcel, 1, 4);
        parcel.writeInt(this.f2249a);
        com.bumptech.glide.d.R(parcel, 2, 4);
        parcel.writeInt(this.f2250b);
        com.bumptech.glide.d.R(parcel, 3, 4);
        parcel.writeInt(this.f2251c);
        com.bumptech.glide.d.R(parcel, 4, 8);
        parcel.writeLong(this.f2252d);
        com.bumptech.glide.d.R(parcel, 5, 8);
        parcel.writeLong(this.e);
        com.bumptech.glide.d.K(parcel, 6, this.f2253f, false);
        com.bumptech.glide.d.K(parcel, 7, this.f2254r, false);
        com.bumptech.glide.d.R(parcel, 8, 4);
        parcel.writeInt(this.f2255s);
        com.bumptech.glide.d.R(parcel, 9, 4);
        parcel.writeInt(this.f2256t);
        com.bumptech.glide.d.Q(iP, parcel);
    }
}
