package l7;

import android.os.Parcel;
import android.os.Parcelable;
import e6.r3;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends h7.a {
    public static final Parcelable.Creator<f> CREATOR = new r3(24);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f6861c;

    public f(int i, String str, ArrayList arrayList) {
        this.f6859a = i;
        this.f6860b = str;
        this.f6861c = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.R(parcel, 1, 4);
        parcel.writeInt(this.f6859a);
        com.bumptech.glide.d.K(parcel, 2, this.f6860b, false);
        com.bumptech.glide.d.O(parcel, 3, this.f6861c, false);
        com.bumptech.glide.d.Q(iP, parcel);
    }

    public f(String str, Map map) {
        ArrayList arrayList;
        this.f6859a = 1;
        this.f6860b = str;
        if (map == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (String str2 : map.keySet()) {
                arrayList.add(new g((a) map.get(str2), str2));
            }
        }
        this.f6861c = arrayList;
    }
}
