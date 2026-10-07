package pb;

import android.os.Parcel;
import android.os.Parcelable;
import e6.r3;
import jc.i;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new r3(28);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7842b;

    public e(int i, int i10) {
        this.f7841a = i;
        this.f7842b = i10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "out");
        parcel.writeInt(this.f7841a);
        parcel.writeInt(this.f7842b);
    }
}
