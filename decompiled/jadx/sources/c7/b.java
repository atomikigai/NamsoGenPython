package c7;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import b8.f;
import com.bumptech.glide.d;
import com.google.android.gms.internal.ads.zzbbs;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends h7.a {
    public static final Parcelable.Creator<b> CREATOR = new f(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PendingIntent f1788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1789c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f1790d;
    public final int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Bundle f1791f;

    public b(int i, int i10, PendingIntent pendingIntent, int i11, Bundle bundle, byte[] bArr) {
        this.e = i;
        this.f1787a = i10;
        this.f1789c = i11;
        this.f1791f = bundle;
        this.f1790d = bArr;
        this.f1788b = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = d.P(20293, parcel);
        d.R(parcel, 1, 4);
        parcel.writeInt(this.f1787a);
        d.J(parcel, 2, this.f1788b, i, false);
        d.R(parcel, 3, 4);
        parcel.writeInt(this.f1789c);
        d.C(parcel, 4, this.f1791f, false);
        d.D(parcel, 5, this.f1790d, false);
        d.R(parcel, zzbbs.zzq.zzf, 4);
        parcel.writeInt(this.e);
        d.Q(iP, parcel);
    }
}
