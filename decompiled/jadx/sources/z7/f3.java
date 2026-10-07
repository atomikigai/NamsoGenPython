package z7;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class f3 extends h7.a {
    public static final Parcelable.Creator<f3> CREATOR = new d(4);
    public final boolean A;
    public final String B;
    public final Boolean C;
    public final long D;
    public final List E;
    public final String F;
    public final String G;
    public final String H;
    public final String I;
    public final boolean J;
    public final long K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f11121c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f11122d;
    public final long e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f11123f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f11124r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f11125s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f11126t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final long f11127u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f11128v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final long f11129w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final long f11130x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f11131y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final boolean f11132z;

    public f3(String str, String str2, String str3, long j4, String str4, long j10, long j11, String str5, boolean z4, boolean z10, String str6, long j12, int i, boolean z11, boolean z12, String str7, Boolean bool, long j13, List list, String str8, String str9, String str10, boolean z13, long j14) {
        com.google.android.gms.common.internal.i0.e(str);
        this.f11119a = str;
        this.f11120b = true == TextUtils.isEmpty(str2) ? null : str2;
        this.f11121c = str3;
        this.f11127u = j4;
        this.f11122d = str4;
        this.e = j10;
        this.f11123f = j11;
        this.f11124r = str5;
        this.f11125s = z4;
        this.f11126t = z10;
        this.f11128v = str6;
        this.f11129w = 0L;
        this.f11130x = j12;
        this.f11131y = i;
        this.f11132z = z11;
        this.A = z12;
        this.B = str7;
        this.C = bool;
        this.D = j13;
        this.E = list;
        this.F = null;
        this.G = str8;
        this.H = str9;
        this.I = str10;
        this.J = z13;
        this.K = j14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.K(parcel, 2, this.f11119a, false);
        com.bumptech.glide.d.K(parcel, 3, this.f11120b, false);
        com.bumptech.glide.d.K(parcel, 4, this.f11121c, false);
        com.bumptech.glide.d.K(parcel, 5, this.f11122d, false);
        com.bumptech.glide.d.R(parcel, 6, 8);
        parcel.writeLong(this.e);
        com.bumptech.glide.d.R(parcel, 7, 8);
        parcel.writeLong(this.f11123f);
        com.bumptech.glide.d.K(parcel, 8, this.f11124r, false);
        com.bumptech.glide.d.R(parcel, 9, 4);
        parcel.writeInt(this.f11125s ? 1 : 0);
        com.bumptech.glide.d.R(parcel, 10, 4);
        parcel.writeInt(this.f11126t ? 1 : 0);
        com.bumptech.glide.d.R(parcel, 11, 8);
        parcel.writeLong(this.f11127u);
        com.bumptech.glide.d.K(parcel, 12, this.f11128v, false);
        com.bumptech.glide.d.R(parcel, 13, 8);
        parcel.writeLong(this.f11129w);
        com.bumptech.glide.d.R(parcel, 14, 8);
        parcel.writeLong(this.f11130x);
        com.bumptech.glide.d.R(parcel, 15, 4);
        parcel.writeInt(this.f11131y);
        com.bumptech.glide.d.R(parcel, 16, 4);
        parcel.writeInt(this.f11132z ? 1 : 0);
        com.bumptech.glide.d.R(parcel, 18, 4);
        parcel.writeInt(this.A ? 1 : 0);
        com.bumptech.glide.d.K(parcel, 19, this.B, false);
        com.bumptech.glide.d.B(parcel, 21, this.C);
        com.bumptech.glide.d.R(parcel, 22, 8);
        parcel.writeLong(this.D);
        com.bumptech.glide.d.M(parcel, 23, this.E);
        com.bumptech.glide.d.K(parcel, 24, this.F, false);
        com.bumptech.glide.d.K(parcel, 25, this.G, false);
        com.bumptech.glide.d.K(parcel, 26, this.H, false);
        com.bumptech.glide.d.K(parcel, 27, this.I, false);
        com.bumptech.glide.d.R(parcel, 28, 4);
        parcel.writeInt(this.J ? 1 : 0);
        com.bumptech.glide.d.R(parcel, 29, 8);
        parcel.writeLong(this.K);
        com.bumptech.glide.d.Q(iP, parcel);
    }

    public f3(String str, String str2, String str3, String str4, long j4, long j10, String str5, boolean z4, boolean z10, long j11, String str6, long j12, long j13, int i, boolean z11, boolean z12, String str7, Boolean bool, long j14, ArrayList arrayList, String str8, String str9, String str10, String str11, boolean z13, long j15) {
        this.f11119a = str;
        this.f11120b = str2;
        this.f11121c = str3;
        this.f11127u = j11;
        this.f11122d = str4;
        this.e = j4;
        this.f11123f = j10;
        this.f11124r = str5;
        this.f11125s = z4;
        this.f11126t = z10;
        this.f11128v = str6;
        this.f11129w = j12;
        this.f11130x = j13;
        this.f11131y = i;
        this.f11132z = z11;
        this.A = z12;
        this.B = str7;
        this.C = bool;
        this.D = j14;
        this.E = arrayList;
        this.F = str8;
        this.G = str9;
        this.H = str10;
        this.I = str11;
        this.J = z13;
        this.K = j15;
    }
}
