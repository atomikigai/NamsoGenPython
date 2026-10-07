package v9;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class t extends d implements Cloneable {
    public static final Parcelable.Creator<t> CREATOR = new v7.i(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f9279c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f9280d;
    public final String e;

    public t(String str, String str2, String str3, String str4, boolean z4) {
        boolean z10 = true;
        if ((TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) && (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4))) {
            z10 = false;
        }
        com.google.android.gms.common.internal.i0.a("Cannot create PhoneAuthCredential without either sessionInfo + smsCode or temporary proof + phoneNumber.", z10);
        this.f9277a = str;
        this.f9278b = str2;
        this.f9279c = str3;
        this.f9280d = z4;
        this.e = str4;
    }

    public final Object clone() {
        boolean z4 = this.f9280d;
        return new t(this.f9277a, this.f9278b, this.f9279c, this.e, z4);
    }

    @Override // v9.d
    public final String g() {
        return "phone";
    }

    @Override // v9.d
    public final d h() {
        boolean z4 = this.f9280d;
        return new t(this.f9277a, this.f9278b, this.f9279c, this.e, z4);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.K(parcel, 1, this.f9277a, false);
        com.bumptech.glide.d.K(parcel, 2, this.f9278b, false);
        com.bumptech.glide.d.K(parcel, 4, this.f9279c, false);
        boolean z4 = this.f9280d;
        com.bumptech.glide.d.R(parcel, 5, 4);
        parcel.writeInt(z4 ? 1 : 0);
        com.bumptech.glide.d.K(parcel, 6, this.e, false);
        com.bumptech.glide.d.Q(iP, parcel);
    }
}
