package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 implements Parcelable {
    public static final Parcelable.Creator<j0> CREATOR = new a7.n(27);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b[] f903c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f904d;
    public String e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList f905f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ArrayList f906r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ArrayList f907s;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.f901a);
        parcel.writeStringList(this.f902b);
        parcel.writeTypedArray(this.f903c, i);
        parcel.writeInt(this.f904d);
        parcel.writeString(this.e);
        parcel.writeStringList(this.f905f);
        parcel.writeTypedList(this.f906r);
        parcel.writeTypedList(this.f907s);
    }
}
