package gb;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import e6.r3;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class q extends h7.a {
    public static final Parcelable.Creator<q> CREATOR = new r3(15);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f4489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public r.e f4490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a2.l f4491c;

    public q(Bundle bundle) {
        this.f4489a = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.C(parcel, 2, this.f4489a, false);
        com.bumptech.glide.d.Q(iP, parcel);
    }
}
