package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import e6.r3;
import o2.b;
import o2.c;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new r3(27);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f1186a;

    public ParcelImpl(Parcel parcel) {
        this.f1186a = new b(parcel).h();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        new b(parcel).k(this.f1186a);
    }
}
