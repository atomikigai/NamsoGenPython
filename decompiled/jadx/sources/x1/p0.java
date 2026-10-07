package x1;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 extends x0.b {
    public static final Parcelable.Creator<p0> CREATOR = new androidx.fragment.app.q(13);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Parcelable f10170c;

    public p0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f10170c = parcel.readParcelable(classLoader == null ? h0.class.getClassLoader() : classLoader);
    }

    @Override // x0.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f10170c, 0);
    }
}
