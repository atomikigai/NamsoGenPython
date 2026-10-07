package u7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends h7.a {
    public static final Parcelable.Creator<c0> CREATOR = new r4.a(22);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f8886c;

    public c0(String str, String str2, String str3) {
        com.google.android.gms.common.internal.i0.i(str);
        this.f8884a = str;
        com.google.android.gms.common.internal.i0.i(str2);
        this.f8885b = str2;
        this.f8886c = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return com.google.android.gms.common.internal.i0.m(this.f8884a, c0Var.f8884a) && com.google.android.gms.common.internal.i0.m(this.f8885b, c0Var.f8885b) && com.google.android.gms.common.internal.i0.m(this.f8886c, c0Var.f8886c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8884a, this.f8885b, this.f8886c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.K(parcel, 2, this.f8884a, false);
        com.bumptech.glide.d.K(parcel, 3, this.f8885b, false);
        com.bumptech.glide.d.K(parcel, 4, this.f8886c, false);
        com.bumptech.glide.d.Q(iP, parcel);
    }
}
