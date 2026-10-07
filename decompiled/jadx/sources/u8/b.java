package u8;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends x0.b {
    public static final Parcelable.Creator<b> CREATOR = new androidx.fragment.app.q(11);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f8990c;

    public b(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f8990c = parcel.readInt() == 1;
    }

    @Override // x0.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f8990c ? 1 : 0);
    }
}
