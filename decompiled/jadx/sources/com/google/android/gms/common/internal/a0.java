package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends h7.a {
    public static final Parcelable.Creator<a0> CREATOR = new b8.f(11);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Account f2175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2176c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final GoogleSignInAccount f2177d;

    public a0(int i, Account account, int i10, GoogleSignInAccount googleSignInAccount) {
        this.f2174a = i;
        this.f2175b = account;
        this.f2176c = i10;
        this.f2177d = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.R(parcel, 1, 4);
        parcel.writeInt(this.f2174a);
        com.bumptech.glide.d.J(parcel, 2, this.f2175b, i, false);
        com.bumptech.glide.d.R(parcel, 3, 4);
        parcel.writeInt(this.f2176c);
        com.bumptech.glide.d.J(parcel, 4, this.f2177d, i, false);
        com.bumptech.glide.d.Q(iP, parcel);
    }
}
