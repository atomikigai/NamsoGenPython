package k7;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.bumptech.glide.d;
import e6.r3;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends h7.a {
    public static final Parcelable.Creator<a> CREATOR = new r3(19);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f6061b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SparseArray f6062c = new SparseArray();

    public a(ArrayList arrayList, int i) {
        this.f6060a = i;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            c cVar = (c) arrayList.get(i10);
            String str = cVar.f6066b;
            int i11 = cVar.f6067c;
            this.f6061b.put(str, Integer.valueOf(i11));
            this.f6062c.put(i11, str);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = d.P(20293, parcel);
        d.R(parcel, 1, 4);
        parcel.writeInt(this.f6060a);
        ArrayList arrayList = new ArrayList();
        HashMap map = this.f6061b;
        for (String str : map.keySet()) {
            arrayList.add(new c(str, ((Integer) map.get(str)).intValue()));
        }
        d.O(parcel, 2, arrayList, false);
        d.Q(iP, parcel);
    }
}
