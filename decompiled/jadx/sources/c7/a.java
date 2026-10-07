package c7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import b8.f;
import com.bumptech.glide.d;
import com.google.android.gms.internal.ads.zzbbs;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends h7.a {
    public static final Parcelable.Creator<a> CREATOR = new f(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1783b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f1784c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f1785d;
    public final int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Bundle f1786f;

    public a(int i, String str, int i10, long j4, byte[] bArr, Bundle bundle) {
        this.e = i;
        this.f1782a = str;
        this.f1783b = i10;
        this.f1784c = j4;
        this.f1785d = bArr;
        this.f1786f = bundle;
    }

    public final String toString() {
        return "ProxyRequest[ url: " + this.f1782a + ", method: " + this.f1783b + " ]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = d.P(20293, parcel);
        d.K(parcel, 1, this.f1782a, false);
        d.R(parcel, 2, 4);
        parcel.writeInt(this.f1783b);
        d.R(parcel, 3, 8);
        parcel.writeLong(this.f1784c);
        d.D(parcel, 4, this.f1785d, false);
        d.C(parcel, 5, this.f1786f, false);
        d.R(parcel, zzbbs.zzq.zzf, 4);
        parcel.writeInt(this.e);
        d.Q(iP, parcel);
    }
}
