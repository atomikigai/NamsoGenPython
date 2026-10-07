package u7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class y extends l {
    public static final Parcelable.Creator<y> CREATOR = new r4.a(17);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f8968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f0 f8969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f8970c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f8971d;
    public final Double e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f8972f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final m f8973r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Integer f8974s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final l0 f8975t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final e f8976u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final f f8977v;

    public y(c0 c0Var, f0 f0Var, byte[] bArr, ArrayList arrayList, Double d10, ArrayList arrayList2, m mVar, Integer num, l0 l0Var, String str, f fVar) {
        com.google.android.gms.common.internal.i0.i(c0Var);
        this.f8968a = c0Var;
        com.google.android.gms.common.internal.i0.i(f0Var);
        this.f8969b = f0Var;
        com.google.android.gms.common.internal.i0.i(bArr);
        this.f8970c = bArr;
        com.google.android.gms.common.internal.i0.i(arrayList);
        this.f8971d = arrayList;
        this.e = d10;
        this.f8972f = arrayList2;
        this.f8973r = mVar;
        this.f8974s = num;
        this.f8975t = l0Var;
        if (str != null) {
            try {
                this.f8976u = e.a(str);
            } catch (d e) {
                throw new IllegalArgumentException(e);
            }
        } else {
            this.f8976u = null;
        }
        this.f8977v = fVar;
    }

    public final boolean equals(Object obj) {
        List list;
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        List list2 = yVar.f8971d;
        List list3 = yVar.f8972f;
        if (com.google.android.gms.common.internal.i0.m(this.f8968a, yVar.f8968a) && com.google.android.gms.common.internal.i0.m(this.f8969b, yVar.f8969b) && Arrays.equals(this.f8970c, yVar.f8970c) && com.google.android.gms.common.internal.i0.m(this.e, yVar.e)) {
            List list4 = this.f8971d;
            if (list4.containsAll(list2) && list2.containsAll(list4) && ((((list = this.f8972f) == null && list3 == null) || (list != null && list3 != null && list.containsAll(list3) && list3.containsAll(list))) && com.google.android.gms.common.internal.i0.m(this.f8973r, yVar.f8973r) && com.google.android.gms.common.internal.i0.m(this.f8974s, yVar.f8974s) && com.google.android.gms.common.internal.i0.m(this.f8975t, yVar.f8975t) && com.google.android.gms.common.internal.i0.m(this.f8976u, yVar.f8976u) && com.google.android.gms.common.internal.i0.m(this.f8977v, yVar.f8977v))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8968a, this.f8969b, Integer.valueOf(Arrays.hashCode(this.f8970c)), this.f8971d, this.e, this.f8972f, this.f8973r, this.f8974s, this.f8975t, this.f8976u, this.f8977v});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.J(parcel, 2, this.f8968a, i, false);
        com.bumptech.glide.d.J(parcel, 3, this.f8969b, i, false);
        com.bumptech.glide.d.D(parcel, 4, this.f8970c, false);
        com.bumptech.glide.d.O(parcel, 5, this.f8971d, false);
        com.bumptech.glide.d.E(parcel, 6, this.e);
        com.bumptech.glide.d.O(parcel, 7, this.f8972f, false);
        com.bumptech.glide.d.J(parcel, 8, this.f8973r, i, false);
        com.bumptech.glide.d.H(parcel, 9, this.f8974s);
        com.bumptech.glide.d.J(parcel, 10, this.f8975t, i, false);
        e eVar = this.f8976u;
        com.bumptech.glide.d.K(parcel, 11, eVar == null ? null : eVar.f8888a, false);
        com.bumptech.glide.d.J(parcel, 12, this.f8977v, i, false);
        com.bumptech.glide.d.Q(iP, parcel);
    }
}
