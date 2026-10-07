package r4;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f8142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HashMap f8144c;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f8142a);
        parcel.writeInt(this.f8143b);
        Bundle bundle = new Bundle();
        HashMap map = this.f8144c;
        for (String str : map.keySet()) {
            bundle.putInt(str, ((Integer) map.get(str)).intValue());
        }
        parcel.writeBundle(bundle);
    }
}
