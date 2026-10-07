package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.bumptech.glide.d;
import com.google.android.gms.common.internal.ReflectedParcelable;
import h7.a;
import java.util.Arrays;
import v7.i;
import w7.y;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class LocationAvailability extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationAvailability> CREATOR = new i(15);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f2299c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2300d;
    public y[] e;

    public final boolean equals(Object obj) {
        if (obj instanceof LocationAvailability) {
            LocationAvailability locationAvailability = (LocationAvailability) obj;
            if (this.f2297a == locationAvailability.f2297a && this.f2298b == locationAvailability.f2298b && this.f2299c == locationAvailability.f2299c && this.f2300d == locationAvailability.f2300d && Arrays.equals(this.e, locationAvailability.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f2300d), Integer.valueOf(this.f2297a), Integer.valueOf(this.f2298b), Long.valueOf(this.f2299c), this.e});
    }

    public final String toString() {
        boolean z4 = this.f2300d < 1000;
        StringBuilder sb2 = new StringBuilder(48);
        sb2.append("LocationAvailability[isLocationAvailable: ");
        sb2.append(z4);
        sb2.append("]");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = d.P(20293, parcel);
        int i10 = this.f2297a;
        d.R(parcel, 1, 4);
        parcel.writeInt(i10);
        int i11 = this.f2298b;
        d.R(parcel, 2, 4);
        parcel.writeInt(i11);
        long j4 = this.f2299c;
        d.R(parcel, 3, 8);
        parcel.writeLong(j4);
        int i12 = this.f2300d;
        d.R(parcel, 4, 4);
        parcel.writeInt(i12);
        d.N(parcel, 5, this.e, i);
        d.Q(iP, parcel);
    }
}
