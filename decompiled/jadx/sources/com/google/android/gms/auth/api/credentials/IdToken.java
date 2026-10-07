package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bumptech.glide.d;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.i0;
import h7.a;
import x1.c1;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class IdToken extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<IdToken> CREATOR = new c1(13);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2000b;

    public IdToken(String str, String str2) {
        i0.a("account type string cannot be null or empty", !TextUtils.isEmpty(str));
        i0.a("id token string cannot be null or empty", !TextUtils.isEmpty(str2));
        this.f1999a = str;
        this.f2000b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IdToken)) {
            return false;
        }
        IdToken idToken = (IdToken) obj;
        return i0.m(this.f1999a, idToken.f1999a) && i0.m(this.f2000b, idToken.f2000b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = d.P(20293, parcel);
        d.K(parcel, 1, this.f1999a, false);
        d.K(parcel, 2, this.f2000b, false);
        d.Q(iP, parcel);
    }
}
