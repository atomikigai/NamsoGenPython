package u7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends l {
    public static final Parcelable.Creator<b0> CREATOR = new r4.a(21);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f8873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f8874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f8875c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f8876d;
    public final Integer e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l0 f8877f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final u0 f8878r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final f f8879s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Long f8880t;

    public b0(byte[] bArr, Double d10, String str, ArrayList arrayList, Integer num, l0 l0Var, String str2, f fVar, Long l2) {
        com.google.android.gms.common.internal.i0.i(bArr);
        this.f8873a = bArr;
        this.f8874b = d10;
        com.google.android.gms.common.internal.i0.i(str);
        this.f8875c = str;
        this.f8876d = arrayList;
        this.e = num;
        this.f8877f = l0Var;
        this.f8880t = l2;
        if (str2 != null) {
            try {
                this.f8878r = u0.a(str2);
            } catch (t0 e) {
                throw new IllegalArgumentException(e);
            }
        } else {
            this.f8878r = null;
        }
        this.f8879s = fVar;
    }

    public final boolean equals(Object obj) {
        List list;
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        List list2 = b0Var.f8876d;
        return Arrays.equals(this.f8873a, b0Var.f8873a) && com.google.android.gms.common.internal.i0.m(this.f8874b, b0Var.f8874b) && com.google.android.gms.common.internal.i0.m(this.f8875c, b0Var.f8875c) && (((list = this.f8876d) == null && list2 == null) || (list != null && list2 != null && list.containsAll(list2) && list2.containsAll(list))) && com.google.android.gms.common.internal.i0.m(this.e, b0Var.e) && com.google.android.gms.common.internal.i0.m(this.f8877f, b0Var.f8877f) && com.google.android.gms.common.internal.i0.m(this.f8878r, b0Var.f8878r) && com.google.android.gms.common.internal.i0.m(this.f8879s, b0Var.f8879s) && com.google.android.gms.common.internal.i0.m(this.f8880t, b0Var.f8880t);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.f8873a)), this.f8874b, this.f8875c, this.f8876d, this.e, this.f8877f, this.f8878r, this.f8879s, this.f8880t});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.D(parcel, 2, this.f8873a, false);
        com.bumptech.glide.d.E(parcel, 3, this.f8874b);
        com.bumptech.glide.d.K(parcel, 4, this.f8875c, false);
        com.bumptech.glide.d.O(parcel, 5, this.f8876d, false);
        com.bumptech.glide.d.H(parcel, 6, this.e);
        com.bumptech.glide.d.J(parcel, 7, this.f8877f, i, false);
        u0 u0Var = this.f8878r;
        com.bumptech.glide.d.K(parcel, 8, u0Var == null ? null : u0Var.f8953a, false);
        com.bumptech.glide.d.J(parcel, 9, this.f8879s, i, false);
        com.bumptech.glide.d.I(parcel, 10, this.f8880t);
        com.bumptech.glide.d.Q(iP, parcel);
    }
}
