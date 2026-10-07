package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends h7.a {
    public static final Parcelable.Creator<b0> CREATOR = new b8.f(12);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IBinder f2179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g7.b f2180c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f2181d;
    public final boolean e;

    public b0(int i, IBinder iBinder, g7.b bVar, boolean z4, boolean z10) {
        this.f2178a = i;
        this.f2179b = iBinder;
        this.f2180c = bVar;
        this.f2181d = z4;
        this.e = z10;
    }

    public final boolean equals(Object obj) {
        Object v0Var;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        if (!this.f2180c.equals(b0Var.f2180c)) {
            return false;
        }
        Object v0Var2 = null;
        IBinder iBinder = this.f2179b;
        if (iBinder == null) {
            v0Var = null;
        } else {
            int i = a.f2173a;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            v0Var = iInterfaceQueryLocalInterface instanceof n ? (n) iInterfaceQueryLocalInterface : new v0(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
        }
        IBinder iBinder2 = b0Var.f2179b;
        if (iBinder2 != null) {
            int i10 = a.f2173a;
            IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            v0Var2 = iInterfaceQueryLocalInterface2 instanceof n ? (n) iInterfaceQueryLocalInterface2 : new v0(iBinder2, "com.google.android.gms.common.internal.IAccountAccessor");
        }
        return i0.m(v0Var, v0Var2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.R(parcel, 1, 4);
        parcel.writeInt(this.f2178a);
        com.bumptech.glide.d.F(parcel, 2, this.f2179b);
        com.bumptech.glide.d.J(parcel, 3, this.f2180c, i, false);
        com.bumptech.glide.d.R(parcel, 4, 4);
        parcel.writeInt(this.f2181d ? 1 : 0);
        com.bumptech.glide.d.R(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        com.bumptech.glide.d.Q(iP, parcel);
    }
}
