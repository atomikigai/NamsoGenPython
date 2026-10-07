package android.support.v4.media.session;

import a7.n;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new n(21);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f308c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f309d;
    public int e;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f306a);
        parcel.writeInt(this.f308c);
        parcel.writeInt(this.f309d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f307b);
    }
}
