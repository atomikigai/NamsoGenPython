package w9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.i0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class z implements h7.c {
    public static final Parcelable.Creator<z> CREATOR = new b(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f9872c;

    public z(boolean z4) {
        this.f9872c = z4;
        this.f9871b = null;
        this.f9870a = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.K(parcel, 1, this.f9870a, false);
        com.bumptech.glide.d.K(parcel, 2, this.f9871b, false);
        com.bumptech.glide.d.R(parcel, 3, 4);
        parcel.writeInt(this.f9872c ? 1 : 0);
        com.bumptech.glide.d.Q(iP, parcel);
    }

    public z(String str, String str2, boolean z4) {
        i0.e(str);
        i0.e(str2);
        this.f9870a = str;
        this.f9871b = str2;
        l.c(str2);
        this.f9872c = z4;
    }
}
