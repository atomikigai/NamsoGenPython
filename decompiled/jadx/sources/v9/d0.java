package v9;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class d0 extends h7.a {
    public static final Parcelable.Creator<d0> CREATOR = new v7.i(8);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f9233c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f9234d;
    public final Uri e;

    public d0(String str, String str2, boolean z4, boolean z10) {
        this.f9231a = str;
        this.f9232b = str2;
        this.f9233c = z4;
        this.f9234d = z10;
        this.e = TextUtils.isEmpty(str2) ? null : Uri.parse(str2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.K(parcel, 2, this.f9231a, false);
        com.bumptech.glide.d.K(parcel, 3, this.f9232b, false);
        com.bumptech.glide.d.R(parcel, 4, 4);
        parcel.writeInt(this.f9233c ? 1 : 0);
        com.bumptech.glide.d.R(parcel, 5, 4);
        parcel.writeInt(this.f9234d ? 1 : 0);
        com.bumptech.glide.d.Q(iP, parcel);
    }
}
