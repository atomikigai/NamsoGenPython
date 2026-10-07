package x0;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.q;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Parcelable f10011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f10010b = new a();
    public static final Parcelable.Creator<b> CREATOR = new q(12);

    public b() {
        this.f10011a = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f10011a, i);
    }

    public b(Parcelable parcelable) {
        if (parcelable != null) {
            this.f10011a = parcelable == f10010b ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public b(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.f10011a = parcelable == null ? f10010b : parcelable;
    }
}
