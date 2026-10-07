package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends h7.a {
    public static final Parcelable.Creator<g> CREATOR = new b8.f(8);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2189b;

    public g(int i, String str) {
        this.f2188a = i;
        this.f2189b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return gVar.f2188a == this.f2188a && i0.m(gVar.f2189b, this.f2189b);
    }

    public final int hashCode() {
        return this.f2188a;
    }

    public final String toString() {
        return this.f2188a + ":" + this.f2189b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.R(parcel, 1, 4);
        parcel.writeInt(this.f2188a);
        com.bumptech.glide.d.K(parcel, 2, this.f2189b, false);
        com.bumptech.glide.d.Q(iP, parcel);
    }
}
