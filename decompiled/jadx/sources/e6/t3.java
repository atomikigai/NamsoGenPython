package e6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class t3 extends h7.a {
    public static final Parcelable.Creator<t3> CREATOR = new r3(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f3448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public h2 f3449c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bundle f3450d;
    public final String e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f3451f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f3452r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f3453s;

    public t3(String str, long j4, h2 h2Var, Bundle bundle, String str2, String str3, String str4, String str5) {
        this.f3447a = str;
        this.f3448b = j4;
        this.f3449c = h2Var;
        this.f3450d = bundle;
        this.e = str2;
        this.f3451f = str3;
        this.f3452r = str4;
        this.f3453s = str5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.K(parcel, 1, this.f3447a, false);
        long j4 = this.f3448b;
        com.bumptech.glide.d.R(parcel, 2, 8);
        parcel.writeLong(j4);
        com.bumptech.glide.d.J(parcel, 3, this.f3449c, i, false);
        com.bumptech.glide.d.C(parcel, 4, this.f3450d, false);
        com.bumptech.glide.d.K(parcel, 5, this.e, false);
        com.bumptech.glide.d.K(parcel, 6, this.f3451f, false);
        com.bumptech.glide.d.K(parcel, 7, this.f3452r, false);
        com.bumptech.glide.d.K(parcel, 8, this.f3453s, false);
        com.bumptech.glide.d.Q(iP, parcel);
    }
}
