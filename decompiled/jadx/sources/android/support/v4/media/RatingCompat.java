package android.support.v4.media;

import a7.n;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new n(17);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f301b;

    public RatingCompat(int i, float f10) {
        this.f300a = i;
        this.f301b = f10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.f300a;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Rating:style=");
        sb2.append(this.f300a);
        sb2.append(" rating=");
        float f10 = this.f301b;
        sb2.append(f10 < 0.0f ? "unrated" : String.valueOf(f10));
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f300a);
        parcel.writeFloat(this.f301b);
    }
}
