package w7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.i0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends h7.a {
    public static final Parcelable.Creator<c> CREATOR = new v7.i(27);
    public static final b0.h e = new b0.h(14);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f9693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f9695c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f9696d;

    public c(ArrayList arrayList, String str, ArrayList arrayList2, String str2) {
        i0.j(arrayList, "transitions can't be null");
        int i = 0;
        i0.a("transitions can't be empty.", arrayList.size() > 0);
        TreeSet treeSet = new TreeSet(e);
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            b bVar = (b) obj;
            i0.a("Found duplicated transition: " + bVar + ".", treeSet.add(bVar));
        }
        this.f9693a = Collections.unmodifiableList(arrayList);
        this.f9694b = str;
        this.f9695c = arrayList2 == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(arrayList2);
        this.f9696d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (i0.m(this.f9693a, cVar.f9693a) && i0.m(this.f9694b, cVar.f9694b) && i0.m(this.f9696d, cVar.f9696d) && i0.m(this.f9695c, cVar.f9695c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f9693a.hashCode() * 31;
        String str = this.f9694b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        List list = this.f9695c;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        String str2 = this.f9696d;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f9693a);
        String strValueOf2 = String.valueOf(this.f9695c);
        int length = strValueOf.length();
        String str = this.f9694b;
        int length2 = String.valueOf(str).length();
        int length3 = strValueOf2.length();
        String str2 = this.f9696d;
        StringBuilder sb2 = new StringBuilder(length + 79 + length2 + length3 + String.valueOf(str2).length());
        sb2.append("ActivityTransitionRequest [mTransitions=");
        sb2.append(strValueOf);
        sb2.append(", mTag='");
        sb2.append(str);
        sb2.append("', mClients=");
        sb2.append(strValueOf2);
        sb2.append(", mAttributionTag=");
        sb2.append(str2);
        sb2.append(']');
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        i0.i(parcel);
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.O(parcel, 1, this.f9693a, false);
        com.bumptech.glide.d.K(parcel, 2, this.f9694b, false);
        com.bumptech.glide.d.O(parcel, 3, this.f9695c, false);
        com.bumptech.glide.d.K(parcel, 4, this.f9696d, false);
        com.bumptech.glide.d.Q(iP, parcel);
    }
}
