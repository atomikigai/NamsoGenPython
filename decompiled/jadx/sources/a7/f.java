package a7;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.i0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends h7.a {
    public static final Parcelable.Creator<f> CREATOR = new n(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PendingIntent f220a;

    public f(PendingIntent pendingIntent) {
        i0.i(pendingIntent);
        this.f220a = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.J(parcel, 1, this.f220a, i, false);
        com.bumptech.glide.d.Q(iP, parcel);
    }
}
