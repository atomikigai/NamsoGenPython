package f6;

import android.os.Parcel;
import android.os.Parcelable;
import com.bumptech.glide.d;
import e6.r3;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends h7.a {
    public static final Parcelable.Creator<a> CREATOR = new r3(6);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f3613c;

    public a(String str, String str2, String str3) {
        this.f3611a = str;
        this.f3612b = str2;
        this.f3613c = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = d.P(20293, parcel);
        d.K(parcel, 1, this.f3611a, false);
        d.K(parcel, 2, this.f3612b, false);
        d.K(parcel, 3, this.f3613c, false);
        d.Q(iP, parcel);
    }
}
