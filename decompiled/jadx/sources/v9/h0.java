package v9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzac;
import com.google.android.gms.internal.p002firebaseauthapi.zzaic;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class h0 extends d {
    public static final Parcelable.Creator<h0> CREATOR = new v7.i(11);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f9250c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zzaic f9251d;
    public final String e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f9252f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f9253r;

    public h0(String str, String str2, String str3, zzaic zzaicVar, String str4, String str5, String str6) {
        this.f9248a = zzac.zzc(str);
        this.f9249b = str2;
        this.f9250c = str3;
        this.f9251d = zzaicVar;
        this.e = str4;
        this.f9252f = str5;
        this.f9253r = str6;
    }

    public static h0 i(zzaic zzaicVar) {
        com.google.android.gms.common.internal.i0.j(zzaicVar, "Must specify a non-null webSignInCredential");
        return new h0(null, null, null, zzaicVar, null, null, null);
    }

    @Override // v9.d
    public final String g() {
        return this.f9248a;
    }

    @Override // v9.d
    public final d h() {
        return new h0(this.f9248a, this.f9249b, this.f9250c, this.f9251d, this.e, this.f9252f, this.f9253r);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.K(parcel, 1, this.f9248a, false);
        com.bumptech.glide.d.K(parcel, 2, this.f9249b, false);
        com.bumptech.glide.d.K(parcel, 3, this.f9250c, false);
        com.bumptech.glide.d.J(parcel, 4, this.f9251d, i, false);
        com.bumptech.glide.d.K(parcel, 5, this.e, false);
        com.bumptech.glide.d.K(parcel, 6, this.f9252f, false);
        com.bumptech.glide.d.K(parcel, 7, this.f9253r, false);
        com.bumptech.glide.d.Q(iP, parcel);
    }
}
