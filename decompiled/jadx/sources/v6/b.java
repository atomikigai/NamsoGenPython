package v6;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import u7.v0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends h7.a {
    public static final Parcelable.Creator<b> CREATOR = new v0(21);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f9178c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Account f9179d;

    public b(int i, int i10, String str, Account account) {
        this.f9176a = i;
        this.f9177b = i10;
        this.f9178c = str;
        if (account != null || TextUtils.isEmpty(str)) {
            this.f9179d = account;
        } else {
            this.f9179d = new Account(str, "com.google");
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.R(parcel, 1, 4);
        parcel.writeInt(this.f9176a);
        com.bumptech.glide.d.R(parcel, 2, 4);
        parcel.writeInt(this.f9177b);
        com.bumptech.glide.d.K(parcel, 3, this.f9178c, false);
        com.bumptech.glide.d.J(parcel, 4, this.f9179d, i, false);
        com.bumptech.glide.d.Q(iP, parcel);
    }
}
