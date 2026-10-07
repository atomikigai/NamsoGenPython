package b8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.b0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends h7.a {
    public static final Parcelable.Creator<h> CREATOR = new f(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g7.b f1433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b0 f1434c;

    public h(int i, g7.b bVar, b0 b0Var) {
        this.f1432a = i;
        this.f1433b = bVar;
        this.f1434c = b0Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.R(parcel, 1, 4);
        parcel.writeInt(this.f1432a);
        com.bumptech.glide.d.J(parcel, 2, this.f1433b, i, false);
        com.bumptech.glide.d.J(parcel, 3, this.f1434c, i, false);
        com.bumptech.glide.d.Q(iP, parcel);
    }
}
