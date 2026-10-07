package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.i0;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class Status extends h7.a implements s, ReflectedParcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PendingIntent f2047c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g7.b f2048d;
    public static final Status e = new Status(0, null, null, null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Status f2041f = new Status(14, null, null, null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Status f2042r = new Status(8, null, null, null);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Status f2043s = new Status(15, null, null, null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Status f2044t = new Status(16, null, null, null);
    public static final Parcelable.Creator<Status> CREATOR = new b8.f(7);

    public Status(int i, String str, PendingIntent pendingIntent, g7.b bVar) {
        this.f2045a = i;
        this.f2046b = str;
        this.f2047c = pendingIntent;
        this.f2048d = bVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f2045a == status.f2045a && i0.m(this.f2046b, status.f2046b) && i0.m(this.f2047c, status.f2047c) && i0.m(this.f2048d, status.f2048d);
    }

    public final boolean g() {
        return this.f2045a <= 0;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f2045a), this.f2046b, this.f2047c, this.f2048d});
    }

    public final String toString() {
        aa.c cVar = new aa.c(this);
        String strP = this.f2046b;
        if (strP == null) {
            strP = qd.b.p(this.f2045a);
        }
        cVar.b(strP, "statusCode");
        cVar.b(this.f2047c, "resolution");
        return cVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.R(parcel, 1, 4);
        parcel.writeInt(this.f2045a);
        com.bumptech.glide.d.K(parcel, 2, this.f2046b, false);
        com.bumptech.glide.d.J(parcel, 3, this.f2047c, i, false);
        com.bumptech.glide.d.J(parcel, 4, this.f2048d, i, false);
        com.bumptech.glide.d.Q(iP, parcel);
    }

    @Override // com.google.android.gms.common.api.s
    public final Status getStatus() {
        return this;
    }
}
