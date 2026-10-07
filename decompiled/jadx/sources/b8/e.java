package b8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.s;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends h7.a implements s {
    public static final Parcelable.Creator<e> CREATOR = new f(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f1427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1428b;

    public e(String str, ArrayList arrayList) {
        this.f1427a = arrayList;
        this.f1428b = str;
    }

    @Override // com.google.android.gms.common.api.s
    public final Status getStatus() {
        return this.f1428b != null ? Status.e : Status.f2044t;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.M(parcel, 1, this.f1427a);
        com.bumptech.glide.d.K(parcel, 2, this.f1428b, false);
        com.bumptech.glide.d.Q(iP, parcel);
    }
}
