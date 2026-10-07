package x1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class d1 implements Parcelable {
    public static final Parcelable.Creator<d1> CREATOR = new c1(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f10033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f10035c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f10036d;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f10033a + ", mGapDir=" + this.f10034b + ", mHasUnwantedGapAfter=" + this.f10036d + ", mGapPerSpan=" + Arrays.toString(this.f10035c) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f10033a);
        parcel.writeInt(this.f10034b);
        parcel.writeInt(this.f10036d ? 1 : 0);
        int[] iArr = this.f10035c;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f10035c);
        }
    }
}
