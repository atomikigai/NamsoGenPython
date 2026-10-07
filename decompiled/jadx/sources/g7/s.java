package g7;

import android.os.Parcel;
import android.os.Parcelable;
import e6.r3;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class s extends h7.a {
    public static final Parcelable.Creator<s> CREATOR = new r3(12);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f4272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f4274c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f4275d;

    public s(boolean z4, String str, int i, int i10) {
        this.f4272a = z4;
        this.f4273b = str;
        this.f4274c = n9.b.E(i) - 1;
        this.f4275d = jd.l.z(i10) - 1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.R(parcel, 1, 4);
        parcel.writeInt(this.f4272a ? 1 : 0);
        com.bumptech.glide.d.K(parcel, 2, this.f4273b, false);
        com.bumptech.glide.d.R(parcel, 3, 4);
        parcel.writeInt(this.f4274c);
        com.bumptech.glide.d.R(parcel, 4, 4);
        parcel.writeInt(this.f4275d);
        com.bumptech.glide.d.Q(iP, parcel);
    }
}
