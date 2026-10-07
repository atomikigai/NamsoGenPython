package g7;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import e6.r3;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends h7.a {
    public static final Parcelable.Creator<r> CREATOR = new r3(11);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f4268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f4269c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f4270d;
    public final boolean e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f4271f;

    public r(String str, boolean z4, boolean z10, IBinder iBinder, boolean z11, boolean z12) {
        this.f4267a = str;
        this.f4268b = z4;
        this.f4269c = z10;
        this.f4270d = (Context) q7.b.I(q7.b.y(iBinder));
        this.e = z11;
        this.f4271f = z12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.K(parcel, 1, this.f4267a, false);
        com.bumptech.glide.d.R(parcel, 2, 4);
        parcel.writeInt(this.f4268b ? 1 : 0);
        com.bumptech.glide.d.R(parcel, 3, 4);
        parcel.writeInt(this.f4269c ? 1 : 0);
        com.bumptech.glide.d.F(parcel, 4, new q7.b(this.f4270d));
        com.bumptech.glide.d.R(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        com.bumptech.glide.d.R(parcel, 6, 4);
        parcel.writeInt(this.f4271f ? 1 : 0);
        com.bumptech.glide.d.Q(iP, parcel);
    }
}
