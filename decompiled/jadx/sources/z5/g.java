package z5;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import e6.y0;
import e6.z0;
import x1.c1;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends h7.a {
    public static final Parcelable.Creator<g> CREATOR = new c1(8);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f10982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z0 f10983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IBinder f10984c;

    public g(boolean z4, IBinder iBinder, IBinder iBinder2) {
        this.f10982a = z4;
        this.f10983b = iBinder != null ? y0.zzd(iBinder) : null;
        this.f10984c = iBinder2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.R(parcel, 1, 4);
        parcel.writeInt(this.f10982a ? 1 : 0);
        z0 z0Var = this.f10983b;
        com.bumptech.glide.d.F(parcel, 2, z0Var == null ? null : z0Var.asBinder());
        com.bumptech.glide.d.F(parcel, 3, this.f10984c);
        com.bumptech.glide.d.Q(iP, parcel);
    }
}
