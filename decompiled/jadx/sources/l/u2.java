package l;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class u2 extends x0.b {
    public static final Parcelable.Creator<u2> CREATOR = new androidx.fragment.app.q(7);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f6437c;

    public u2(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f6437c = ((Boolean) parcel.readValue(null)).booleanValue();
    }

    public final String toString() {
        return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f6437c + "}";
    }

    @Override // x0.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeValue(Boolean.valueOf(this.f6437c));
    }
}
