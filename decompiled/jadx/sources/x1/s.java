package x1;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements Parcelable {
    public static final Parcelable.Creator<s> CREATOR = new v7.i(29);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f10190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f10192c;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f10190a);
        parcel.writeInt(this.f10191b);
        parcel.writeInt(this.f10192c ? 1 : 0);
    }
}
