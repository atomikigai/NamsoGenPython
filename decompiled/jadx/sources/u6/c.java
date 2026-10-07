package u6;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends h7.a {
    public static final Parcelable.Creator<c> CREATOR = new r4.a(8);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8865b;

    public c(String str, String str2) {
        this.f8864a = str;
        this.f8865b = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.K(parcel, 1, this.f8864a, false);
        com.bumptech.glide.d.K(parcel, 2, this.f8865b, false);
        com.bumptech.glide.d.Q(iP, parcel);
    }
}
