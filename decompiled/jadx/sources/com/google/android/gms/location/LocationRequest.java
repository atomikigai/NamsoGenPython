package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.bumptech.glide.d;
import com.google.android.gms.common.internal.ReflectedParcelable;
import h7.a;
import java.util.Arrays;
import v7.i;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class LocationRequest extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationRequest> CREATOR = new i(16);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f2302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f2303c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2304d;
    public long e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2305f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f2306r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f2307s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f2308t;

    public final boolean equals(Object obj) {
        if (!(obj instanceof LocationRequest)) {
            return false;
        }
        LocationRequest locationRequest = (LocationRequest) obj;
        if (this.f2301a != locationRequest.f2301a) {
            return false;
        }
        long j4 = this.f2302b;
        long j10 = locationRequest.f2302b;
        if (j4 != j10 || this.f2303c != locationRequest.f2303c || this.f2304d != locationRequest.f2304d || this.e != locationRequest.e || this.f2305f != locationRequest.f2305f || this.f2306r != locationRequest.f2306r) {
            return false;
        }
        long j11 = this.f2307s;
        if (j11 >= j4) {
            j4 = j11;
        }
        long j12 = locationRequest.f2307s;
        if (j12 >= j10) {
            j10 = j12;
        }
        return j4 == j10 && this.f2308t == locationRequest.f2308t;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f2301a), Long.valueOf(this.f2302b), Float.valueOf(this.f2306r), Long.valueOf(this.f2307s)});
    }

    public final String toString() {
        String str;
        int i = this.f2305f;
        float f10 = this.f2306r;
        long j4 = this.f2307s;
        long j10 = this.f2302b;
        StringBuilder sb2 = new StringBuilder("Request[");
        int i10 = this.f2301a;
        if (i10 == 100) {
            str = "PRIORITY_HIGH_ACCURACY";
        } else if (i10 == 102) {
            str = "PRIORITY_BALANCED_POWER_ACCURACY";
        } else if (i10 != 104) {
            str = i10 != 105 ? "???" : "PRIORITY_NO_POWER";
        } else {
            str = "PRIORITY_LOW_POWER";
        }
        sb2.append(str);
        if (i10 != 105) {
            sb2.append(" requested=");
            sb2.append(j10);
            sb2.append("ms");
        }
        sb2.append(" fastest=");
        sb2.append(this.f2303c);
        sb2.append("ms");
        if (j4 > j10) {
            sb2.append(" maxWait=");
            sb2.append(j4);
            sb2.append("ms");
        }
        if (f10 > 0.0f) {
            sb2.append(" smallestDisplacement=");
            sb2.append(f10);
            sb2.append("m");
        }
        long j11 = this.e;
        if (j11 != Long.MAX_VALUE) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            sb2.append(" expireIn=");
            sb2.append(j11 - jElapsedRealtime);
            sb2.append("ms");
        }
        if (i != Integer.MAX_VALUE) {
            sb2.append(" num=");
            sb2.append(i);
        }
        sb2.append(']');
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = d.P(20293, parcel);
        int i10 = this.f2301a;
        d.R(parcel, 1, 4);
        parcel.writeInt(i10);
        long j4 = this.f2302b;
        d.R(parcel, 2, 8);
        parcel.writeLong(j4);
        long j10 = this.f2303c;
        d.R(parcel, 3, 8);
        parcel.writeLong(j10);
        boolean z4 = this.f2304d;
        d.R(parcel, 4, 4);
        parcel.writeInt(z4 ? 1 : 0);
        long j11 = this.e;
        d.R(parcel, 5, 8);
        parcel.writeLong(j11);
        int i11 = this.f2305f;
        d.R(parcel, 6, 4);
        parcel.writeInt(i11);
        float f10 = this.f2306r;
        d.R(parcel, 7, 4);
        parcel.writeFloat(f10);
        long j12 = this.f2307s;
        d.R(parcel, 8, 8);
        parcel.writeLong(j12);
        boolean z10 = this.f2308t;
        d.R(parcel, 9, 4);
        parcel.writeInt(z10 ? 1 : 0);
        d.Q(iP, parcel);
    }
}
