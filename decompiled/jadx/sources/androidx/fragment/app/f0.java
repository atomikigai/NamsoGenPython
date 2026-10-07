package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 implements Parcelable {
    public static final Parcelable.Creator<f0> CREATOR = new a7.n(26);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f867b;

    public f0(String str, int i) {
        this.f866a = str;
        this.f867b = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f866a);
        parcel.writeInt(this.f867b);
    }
}
