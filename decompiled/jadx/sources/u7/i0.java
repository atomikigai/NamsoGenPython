package u7;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public enum i0 implements Parcelable {
    /* JADX INFO: Fake field, exist only in values array */
    RESIDENT_KEY_DISCOURAGED("discouraged"),
    /* JADX INFO: Fake field, exist only in values array */
    RESIDENT_KEY_PREFERRED("preferred"),
    /* JADX INFO: Fake field, exist only in values array */
    RESIDENT_KEY_REQUIRED("required");

    public static final Parcelable.Creator<i0> CREATOR = new r4.a(25);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8916a;

    i0(String str) {
        this.f8916a = str;
    }

    public static i0 a(String str) {
        for (i0 i0Var : values()) {
            if (str.equals(i0Var.f8916a)) {
                return i0Var;
            }
        }
        throw new h0(da.v.i("Resident key requirement ", str, " not supported"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f8916a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8916a);
    }
}
