package w7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends h7.a implements com.google.android.gms.common.api.s {
    public static final Parcelable.Creator<j> CREATOR = new v7.i(20);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Status f9708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f9709b;

    public j(Status status, k kVar) {
        this.f9708a = status;
        this.f9709b = kVar;
    }

    @Override // com.google.android.gms.common.api.s
    public final Status getStatus() {
        return this.f9708a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.J(parcel, 1, this.f9708a, i, false);
        com.bumptech.glide.d.J(parcel, 2, this.f9709b, i, false);
        com.bumptech.glide.d.Q(iP, parcel);
    }
}
