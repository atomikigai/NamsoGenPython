package b8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends h7.a {
    public static final Parcelable.Creator<g> CREATOR = new f(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f1431b;

    public g(int i, a0 a0Var) {
        this.f1430a = i;
        this.f1431b = a0Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.R(parcel, 1, 4);
        parcel.writeInt(this.f1430a);
        com.bumptech.glide.d.J(parcel, 2, this.f1431b, i, false);
        com.bumptech.glide.d.Q(iP, parcel);
    }
}
