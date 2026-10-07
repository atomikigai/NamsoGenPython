package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.i0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class Scope extends h7.a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new b8.f(6);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2040b;

    public Scope(int i, String str) {
        i0.f(str, "scopeUri must not be null or empty");
        this.f2039a = i;
        this.f2040b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f2040b.equals(((Scope) obj).f2040b);
    }

    public final int hashCode() {
        return this.f2040b.hashCode();
    }

    public final String toString() {
        return this.f2040b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.R(parcel, 1, 4);
        parcel.writeInt(this.f2039a);
        com.bumptech.glide.d.K(parcel, 2, this.f2040b, false);
        com.bumptech.glide.d.Q(iP, parcel);
    }
}
