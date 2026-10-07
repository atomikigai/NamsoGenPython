package k7;

import android.os.Parcel;
import android.os.Parcelable;
import com.bumptech.glide.d;
import e6.r3;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends h7.a {
    public static final Parcelable.Creator<b> CREATOR = new r3(18);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f6064b;

    public b(int i, a aVar) {
        this.f6063a = i;
        this.f6064b = aVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = d.P(20293, parcel);
        d.R(parcel, 1, 4);
        parcel.writeInt(this.f6063a);
        d.J(parcel, 2, this.f6064b, i, false);
        d.Q(iP, parcel);
    }

    public b(a aVar) {
        this.f6063a = 1;
        this.f6064b = aVar;
    }
}
