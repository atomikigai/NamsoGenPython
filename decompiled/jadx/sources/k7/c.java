package k7;

import android.os.Parcel;
import android.os.Parcelable;
import com.bumptech.glide.d;
import e6.r3;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends h7.a {
    public static final Parcelable.Creator<c> CREATOR = new r3(20);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6067c;

    public c(int i, String str, int i10) {
        this.f6065a = i;
        this.f6066b = str;
        this.f6067c = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = d.P(20293, parcel);
        d.R(parcel, 1, 4);
        parcel.writeInt(this.f6065a);
        d.K(parcel, 2, this.f6066b, false);
        d.R(parcel, 3, 4);
        parcel.writeInt(this.f6067c);
        d.Q(iP, parcel);
    }

    public c(String str, int i) {
        this.f6065a = 1;
        this.f6066b = str;
        this.f6067c = i;
    }
}
