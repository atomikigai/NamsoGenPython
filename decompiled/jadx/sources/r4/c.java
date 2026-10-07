package r4;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bundle f8146b;

    public c(String str, Bundle bundle) {
        this.f8145a = str;
        this.f8146b = new Bundle(bundle);
    }

    public final Bundle a() {
        return new Bundle(this.f8146b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        return this.f8145a.equals(((c) obj).f8145a);
    }

    public final int hashCode() {
        return this.f8145a.hashCode();
    }

    public final String toString() {
        return "IdpConfig{mProviderId='" + this.f8145a + "', mParams=" + this.f8146b + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8145a);
        parcel.writeBundle(this.f8146b);
    }

    public c(Parcel parcel) {
        this.f8145a = parcel.readString();
        this.f8146b = parcel.readBundle(c.class.getClassLoader());
    }
}
