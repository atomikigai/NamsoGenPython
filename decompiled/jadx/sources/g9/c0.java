package g9;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends x0.b {
    public static final Parcelable.Creator<c0> CREATOR = new androidx.fragment.app.q(4);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CharSequence f4325c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f4326d;

    public c0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f4325c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f4326d = parcel.readInt() == 1;
    }

    public final String toString() {
        return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f4325c) + "}";
    }

    @Override // x0.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        TextUtils.writeToParcel(this.f4325c, parcel, i);
        parcel.writeInt(this.f4326d ? 1 : 0);
    }
}
