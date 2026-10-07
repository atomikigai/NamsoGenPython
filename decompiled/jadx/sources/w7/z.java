package w7;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.location.zzbs;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class z extends h7.a {
    public static final Parcelable.Creator<z> CREATOR = new v7.i(23);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzbs f9724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PendingIntent f9725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f9726c;

    public z(List list, PendingIntent pendingIntent, String str) {
        this.f9724a = list == null ? zzbs.zzi() : zzbs.zzj(list);
        this.f9725b = pendingIntent;
        this.f9726c = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.M(parcel, 1, this.f9724a);
        com.bumptech.glide.d.J(parcel, 2, this.f9725b, i, false);
        com.bumptech.glide.d.K(parcel, 3, this.f9726c, false);
        com.bumptech.glide.d.Q(iP, parcel);
    }
}
