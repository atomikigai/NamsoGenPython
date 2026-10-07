package v9;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends h7.a {
    public static final Parcelable.Creator<b> CREATOR = new v7.i(9);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f9218c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f9219d;
    public final boolean e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f9220f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f9221r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f9222s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f9223t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final String f9224u;

    public b(String str, String str2, String str3, String str4, boolean z4, String str5, boolean z10, String str6, int i, String str7) {
        this.f9216a = str;
        this.f9217b = str2;
        this.f9218c = str3;
        this.f9219d = str4;
        this.e = z4;
        this.f9220f = str5;
        this.f9221r = z10;
        this.f9222s = str6;
        this.f9223t = i;
        this.f9224u = str7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.K(parcel, 1, this.f9216a, false);
        com.bumptech.glide.d.K(parcel, 2, this.f9217b, false);
        com.bumptech.glide.d.K(parcel, 3, this.f9218c, false);
        com.bumptech.glide.d.K(parcel, 4, this.f9219d, false);
        com.bumptech.glide.d.R(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        com.bumptech.glide.d.K(parcel, 6, this.f9220f, false);
        com.bumptech.glide.d.R(parcel, 7, 4);
        parcel.writeInt(this.f9221r ? 1 : 0);
        com.bumptech.glide.d.K(parcel, 8, this.f9222s, false);
        int i10 = this.f9223t;
        com.bumptech.glide.d.R(parcel, 9, 4);
        parcel.writeInt(i10);
        com.bumptech.glide.d.K(parcel, 10, this.f9224u, false);
        com.bumptech.glide.d.Q(iP, parcel);
    }

    public b(a aVar) {
        this.f9216a = aVar.f9207a;
        this.f9217b = aVar.f9208b;
        this.f9218c = null;
        this.f9219d = aVar.f9209c;
        this.e = aVar.f9210d;
        this.f9220f = aVar.e;
        this.f9221r = aVar.f9211f;
        this.f9224u = null;
    }
}
