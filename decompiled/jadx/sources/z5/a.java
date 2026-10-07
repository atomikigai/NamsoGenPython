package z5;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import x1.c1;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends h7.a {
    public static final Parcelable.Creator<a> CREATOR = new c1(7);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f10968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IBinder f10969b;

    public a(boolean z4, IBinder iBinder) {
        this.f10968a = z4;
        this.f10969b = iBinder;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.R(parcel, 1, 4);
        parcel.writeInt(this.f10968a ? 1 : 0);
        com.bumptech.glide.d.F(parcel, 2, this.f10969b);
        com.bumptech.glide.d.Q(iP, parcel);
    }
}
