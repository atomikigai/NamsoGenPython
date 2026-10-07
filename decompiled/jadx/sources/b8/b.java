package b8;

import a7.n;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.s;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends h7.a implements s {
    public static final Parcelable.Creator<b> CREATOR = new n(29);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Intent f1426c;

    public b(int i, int i10, Intent intent) {
        this.f1424a = i;
        this.f1425b = i10;
        this.f1426c = intent;
    }

    @Override // com.google.android.gms.common.api.s
    public final Status getStatus() {
        return this.f1425b == 0 ? Status.e : Status.f2044t;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.R(parcel, 1, 4);
        parcel.writeInt(this.f1424a);
        com.bumptech.glide.d.R(parcel, 2, 4);
        parcel.writeInt(this.f1425b);
        com.bumptech.glide.d.J(parcel, 3, this.f1426c, i, false);
        com.bumptech.glide.d.Q(iP, parcel);
    }
}
