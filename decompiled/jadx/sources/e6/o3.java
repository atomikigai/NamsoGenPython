package e6;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class o3 extends h7.a {
    public static final Parcelable.Creator<o3> CREATOR = new b8.f(29);
    public final String A;
    public final String B;
    public final boolean C;
    public final o0 D;
    public final int E;
    public final String F;
    public final List G;
    public final int H;
    public final String I;
    public final int J;
    public final long K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f3372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bundle f3373c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f3374d;
    public final List e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f3375f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f3376r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f3377s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f3378t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final j3 f3379u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Location f3380v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f3381w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Bundle f3382x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Bundle f3383y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final List f3384z;

    public o3(int i, long j4, Bundle bundle, int i10, List list, boolean z4, int i11, boolean z10, String str, j3 j3Var, Location location, String str2, Bundle bundle2, Bundle bundle3, List list2, String str3, String str4, boolean z11, o0 o0Var, int i12, String str5, List list3, int i13, String str6, int i14, long j10) {
        this.f3371a = i;
        this.f3372b = j4;
        this.f3373c = bundle == null ? new Bundle() : bundle;
        this.f3374d = i10;
        this.e = list;
        this.f3375f = z4;
        this.f3376r = i11;
        this.f3377s = z10;
        this.f3378t = str;
        this.f3379u = j3Var;
        this.f3380v = location;
        this.f3381w = str2;
        this.f3382x = bundle2 == null ? new Bundle() : bundle2;
        this.f3383y = bundle3;
        this.f3384z = list2;
        this.A = str3;
        this.B = str4;
        this.C = z11;
        this.D = o0Var;
        this.E = i12;
        this.F = str5;
        this.G = list3 == null ? new ArrayList() : list3;
        this.H = i13;
        this.I = str6;
        this.J = i14;
        this.K = j10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o3)) {
            return false;
        }
        o3 o3Var = (o3) obj;
        return g(o3Var) && this.K == o3Var.K;
    }

    public final boolean g(o3 o3Var) {
        return o3Var != null && this.f3371a == o3Var.f3371a && this.f3372b == o3Var.f3372b && p3.a.v(this.f3373c, o3Var.f3373c) && this.f3374d == o3Var.f3374d && com.google.android.gms.common.internal.i0.m(this.e, o3Var.e) && this.f3375f == o3Var.f3375f && this.f3376r == o3Var.f3376r && this.f3377s == o3Var.f3377s && com.google.android.gms.common.internal.i0.m(this.f3378t, o3Var.f3378t) && com.google.android.gms.common.internal.i0.m(this.f3379u, o3Var.f3379u) && com.google.android.gms.common.internal.i0.m(this.f3380v, o3Var.f3380v) && com.google.android.gms.common.internal.i0.m(this.f3381w, o3Var.f3381w) && p3.a.v(this.f3382x, o3Var.f3382x) && p3.a.v(this.f3383y, o3Var.f3383y) && com.google.android.gms.common.internal.i0.m(this.f3384z, o3Var.f3384z) && com.google.android.gms.common.internal.i0.m(this.A, o3Var.A) && com.google.android.gms.common.internal.i0.m(this.B, o3Var.B) && this.C == o3Var.C && this.E == o3Var.E && com.google.android.gms.common.internal.i0.m(this.F, o3Var.F) && com.google.android.gms.common.internal.i0.m(this.G, o3Var.G) && this.H == o3Var.H && com.google.android.gms.common.internal.i0.m(this.I, o3Var.I) && this.J == o3Var.J;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f3371a), Long.valueOf(this.f3372b), this.f3373c, Integer.valueOf(this.f3374d), this.e, Boolean.valueOf(this.f3375f), Integer.valueOf(this.f3376r), Boolean.valueOf(this.f3377s), this.f3378t, this.f3379u, this.f3380v, this.f3381w, this.f3382x, this.f3383y, this.f3384z, this.A, this.B, Boolean.valueOf(this.C), Integer.valueOf(this.E), this.F, this.G, Integer.valueOf(this.H), this.I, Integer.valueOf(this.J), Long.valueOf(this.K)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.R(parcel, 1, 4);
        parcel.writeInt(this.f3371a);
        com.bumptech.glide.d.R(parcel, 2, 8);
        parcel.writeLong(this.f3372b);
        com.bumptech.glide.d.C(parcel, 3, this.f3373c, false);
        com.bumptech.glide.d.R(parcel, 4, 4);
        parcel.writeInt(this.f3374d);
        com.bumptech.glide.d.M(parcel, 5, this.e);
        com.bumptech.glide.d.R(parcel, 6, 4);
        parcel.writeInt(this.f3375f ? 1 : 0);
        com.bumptech.glide.d.R(parcel, 7, 4);
        parcel.writeInt(this.f3376r);
        com.bumptech.glide.d.R(parcel, 8, 4);
        parcel.writeInt(this.f3377s ? 1 : 0);
        com.bumptech.glide.d.K(parcel, 9, this.f3378t, false);
        com.bumptech.glide.d.J(parcel, 10, this.f3379u, i, false);
        com.bumptech.glide.d.J(parcel, 11, this.f3380v, i, false);
        com.bumptech.glide.d.K(parcel, 12, this.f3381w, false);
        com.bumptech.glide.d.C(parcel, 13, this.f3382x, false);
        com.bumptech.glide.d.C(parcel, 14, this.f3383y, false);
        com.bumptech.glide.d.M(parcel, 15, this.f3384z);
        com.bumptech.glide.d.K(parcel, 16, this.A, false);
        com.bumptech.glide.d.K(parcel, 17, this.B, false);
        com.bumptech.glide.d.R(parcel, 18, 4);
        parcel.writeInt(this.C ? 1 : 0);
        com.bumptech.glide.d.J(parcel, 19, this.D, i, false);
        com.bumptech.glide.d.R(parcel, 20, 4);
        parcel.writeInt(this.E);
        com.bumptech.glide.d.K(parcel, 21, this.F, false);
        com.bumptech.glide.d.M(parcel, 22, this.G);
        com.bumptech.glide.d.R(parcel, 23, 4);
        parcel.writeInt(this.H);
        com.bumptech.glide.d.K(parcel, 24, this.I, false);
        com.bumptech.glide.d.R(parcel, 25, 4);
        parcel.writeInt(this.J);
        com.bumptech.glide.d.R(parcel, 26, 8);
        parcel.writeLong(this.K);
        com.bumptech.glide.d.Q(iP, parcel);
    }
}
