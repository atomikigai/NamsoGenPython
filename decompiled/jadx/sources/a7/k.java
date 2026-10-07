package a7;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.i0;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends h7.a {
    public static final Parcelable.Creator<k> CREATOR = new n(11);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PendingIntent f231a;

    public k(PendingIntent pendingIntent) {
        i0.i(pendingIntent);
        this.f231a = pendingIntent;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return i0.m(this.f231a, ((k) obj).f231a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f231a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.J(parcel, 1, this.f231a, i, false);
        com.bumptech.glide.d.Q(iP, parcel);
    }
}
