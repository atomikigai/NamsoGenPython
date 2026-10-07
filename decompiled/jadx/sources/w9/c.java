package w9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends h7.a {
    public static final Parcelable.Creator<c> CREATOR = new b(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f9814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f9815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f9816c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f9817d;
    public d0 e;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.K(parcel, 1, this.f9814a, false);
        com.bumptech.glide.d.K(parcel, 2, this.f9815b, false);
        com.bumptech.glide.d.O(parcel, 3, this.f9816c, false);
        com.bumptech.glide.d.O(parcel, 4, this.f9817d, false);
        com.bumptech.glide.d.J(parcel, 5, this.e, i, false);
        com.bumptech.glide.d.Q(iP, parcel);
    }
}
