package u7;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public enum j0 implements Parcelable {
    /* JADX INFO: Fake field, exist only in values array */
    PRESENT("present"),
    /* JADX INFO: Fake field, exist only in values array */
    SUPPORTED("supported"),
    /* JADX INFO: Fake field, exist only in values array */
    NOT_SUPPORTED("not-supported");

    public static final Parcelable.Creator<j0> CREATOR = new r4.a(26);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8922a;

    j0(String str) {
        this.f8922a = str;
    }

    public static j0 a(String str) throws k0 {
        for (j0 j0Var : values()) {
            if (str.equals(j0Var.f8922a)) {
                return j0Var;
            }
        }
        throw new k0(da.v.i("TokenBindingStatus ", str, " not supported"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f8922a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8922a);
    }
}
