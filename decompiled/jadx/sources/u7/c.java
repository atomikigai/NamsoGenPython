package u7;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public enum c implements Parcelable {
    /* JADX INFO: Fake field, exist only in values array */
    PLATFORM("platform"),
    /* JADX INFO: Fake field, exist only in values array */
    CROSS_PLATFORM("cross-platform");

    public static final Parcelable.Creator<c> CREATOR = new r4.a(10);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8883a;

    c(String str) {
        this.f8883a = str;
    }

    public static c a(String str) {
        for (c cVar : values()) {
            if (str.equals(cVar.f8883a)) {
                return cVar;
            }
        }
        throw new b(da.v.i("Attachment ", str, " not supported"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f8883a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8883a);
    }
}
