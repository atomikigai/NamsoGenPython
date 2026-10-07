package l7;

import android.os.Parcel;
import android.os.Parcelable;
import e6.r3;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends h7.a {
    public static final Parcelable.Creator<g> CREATOR = new r3(22);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f6864c;

    public g(a aVar, String str) {
        this.f6862a = 1;
        this.f6863b = str;
        this.f6864c = aVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.R(parcel, 1, 4);
        parcel.writeInt(this.f6862a);
        com.bumptech.glide.d.K(parcel, 2, this.f6863b, false);
        com.bumptech.glide.d.J(parcel, 3, this.f6864c, i, false);
        com.bumptech.glide.d.Q(iP, parcel);
    }

    public g(a aVar, String str, int i) {
        this.f6862a = i;
        this.f6863b = str;
        this.f6864c = aVar;
    }
}
