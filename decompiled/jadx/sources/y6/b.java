package y6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.auth.zzbz;
import da.v;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import x1.c1;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends zzbz {
    public static final Parcelable.Creator<b> CREATOR = new c1(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final HashMap f10591f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f10592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f10594c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f10595d;
    public d e;

    static {
        HashMap map = new HashMap();
        f10591f = map;
        map.put("authenticatorData", new l7.a(11, true, 11, true, "authenticatorData", 2, e.class));
        map.put("progress", new l7.a(11, false, 11, false, "progress", 4, d.class));
    }

    public b(HashSet hashSet, int i, ArrayList arrayList, int i10, d dVar) {
        this.f10592a = hashSet;
        this.f10593b = i;
        this.f10594c = arrayList;
        this.f10595d = i10;
        this.e = dVar;
    }

    @Override // l7.b
    public final void addConcreteTypeArrayInternal(l7.a aVar, String str, ArrayList arrayList) {
        int i = aVar.f6848r;
        if (i != 2) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not a known ConcreteTypeArray type. Found %s", Integer.valueOf(i), arrayList.getClass().getCanonicalName()));
        }
        this.f10594c = arrayList;
        this.f10592a.add(Integer.valueOf(i));
    }

    @Override // l7.b
    public final void addConcreteTypeInternal(l7.a aVar, String str, l7.b bVar) {
        int i = aVar.f6848r;
        if (i != 4) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not a known custom type. Found %s", Integer.valueOf(i), bVar.getClass().getCanonicalName()));
        }
        this.e = (d) bVar;
        this.f10592a.add(Integer.valueOf(i));
    }

    @Override // l7.b
    public final /* synthetic */ Map getFieldMappings() {
        return f10591f;
    }

    @Override // l7.b
    public final Object getFieldValue(l7.a aVar) {
        int i = aVar.f6848r;
        if (i == 1) {
            return Integer.valueOf(this.f10593b);
        }
        if (i == 2) {
            return this.f10594c;
        }
        if (i == 4) {
            return this.e;
        }
        throw new IllegalStateException(v.f(aVar.f6848r, "Unknown SafeParcelable id="));
    }

    @Override // l7.b
    public final boolean isFieldSet(l7.a aVar) {
        return this.f10592a.contains(Integer.valueOf(aVar.f6848r));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        HashSet hashSet = this.f10592a;
        if (hashSet.contains(1)) {
            com.bumptech.glide.d.R(parcel, 1, 4);
            parcel.writeInt(this.f10593b);
        }
        if (hashSet.contains(2)) {
            com.bumptech.glide.d.O(parcel, 2, this.f10594c, true);
        }
        if (hashSet.contains(3)) {
            com.bumptech.glide.d.R(parcel, 3, 4);
            parcel.writeInt(this.f10595d);
        }
        if (hashSet.contains(4)) {
            com.bumptech.glide.d.J(parcel, 4, this.e, i, true);
        }
        com.bumptech.glide.d.Q(iP, parcel);
    }
}
