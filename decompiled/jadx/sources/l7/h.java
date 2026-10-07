package l7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.i0;
import e6.r3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends h7.a {
    public static final Parcelable.Creator<h> CREATOR = new r3(23);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f6866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6867c;

    public h(int i, String str, ArrayList arrayList) {
        this.f6865a = i;
        HashMap map = new HashMap();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            f fVar = (f) arrayList.get(i10);
            String str2 = fVar.f6860b;
            ArrayList arrayList2 = fVar.f6861c;
            HashMap map2 = new HashMap();
            i0.i(arrayList2);
            int size2 = arrayList2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                g gVar = (g) arrayList2.get(i11);
                map2.put(gVar.f6863b, gVar.f6864c);
            }
            map.put(str2, map2);
        }
        this.f6866b = map;
        i0.i(str);
        this.f6867c = str;
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            Map map3 = (Map) map.get((String) it.next());
            Iterator it2 = map3.keySet().iterator();
            while (it2.hasNext()) {
                ((a) map3.get((String) it2.next())).f6851u = this;
            }
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        HashMap map = this.f6866b;
        for (String str : map.keySet()) {
            sb2.append(str);
            sb2.append(":\n");
            Map map2 = (Map) map.get(str);
            for (String str2 : map2.keySet()) {
                sb2.append("  ");
                sb2.append(str2);
                sb2.append(": ");
                sb2.append(map2.get(str2));
            }
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.R(parcel, 1, 4);
        parcel.writeInt(this.f6865a);
        ArrayList arrayList = new ArrayList();
        HashMap map = this.f6866b;
        for (String str : map.keySet()) {
            arrayList.add(new f(str, (Map) map.get(str)));
        }
        com.bumptech.glide.d.O(parcel, 2, arrayList, false);
        com.bumptech.glide.d.K(parcel, 3, this.f6867c, false);
        com.bumptech.glide.d.Q(iP, parcel);
    }
}
