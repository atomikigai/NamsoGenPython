package l;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class g3 extends x0.b {
    public static final Parcelable.Creator<g3> CREATOR = new androidx.fragment.app.q(8);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6280c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f6281d;

    public g3(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f6280c = parcel.readInt();
        this.f6281d = parcel.readInt() != 0;
    }

    @Override // x0.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f6280c);
        parcel.writeInt(this.f6281d ? 1 : 0);
    }
}
