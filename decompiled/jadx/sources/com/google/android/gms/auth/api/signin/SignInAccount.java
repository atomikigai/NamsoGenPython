package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import com.bumptech.glide.d;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.i0;
import d7.e;
import h7.a;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class SignInAccount extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInAccount> CREATOR = new e(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final GoogleSignInAccount f2033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f2034c;

    public SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.f2033b = googleSignInAccount;
        i0.f(str, "8.3 and 8.4 SDKs require non-null email");
        this.f2032a = str;
        i0.f(str2, "8.3 and 8.4 SDKs require non-null userId");
        this.f2034c = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = d.P(20293, parcel);
        d.K(parcel, 4, this.f2032a, false);
        d.J(parcel, 7, this.f2033b, i, false);
        d.K(parcel, 8, this.f2034c, false);
        d.Q(iP, parcel);
    }
}
