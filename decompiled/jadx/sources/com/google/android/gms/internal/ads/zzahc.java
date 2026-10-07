package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import da.v;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzahc implements Parcelable {
    public static final Parcelable.Creator<zzahc> CREATOR = new zzahb();
    public final long zza;
    public final long zzb;
    public final int zzc;

    public zzahc(long j4, long j10, int i) {
        zzdb.zzd(j4 < j10);
        this.zza = j4;
        this.zzb = j10;
        this.zzc = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzahc.class == obj.getClass()) {
            zzahc zzahcVar = (zzahc) obj;
            if (this.zza == zzahcVar.zza && this.zzb == zzahcVar.zzb && this.zzc == zzahcVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.zza), Long.valueOf(this.zzb), Integer.valueOf(this.zzc)});
    }

    public final String toString() {
        long j4 = this.zza;
        long j10 = this.zzb;
        int i = this.zzc;
        Locale locale = Locale.US;
        StringBuilder sbL = v.l("Segment: startTimeMs=", ", endTimeMs=", j4);
        sbL.append(j10);
        sbL.append(", speedDivisor=");
        sbL.append(i);
        return sbL.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.zza);
        parcel.writeLong(this.zzb);
        parcel.writeInt(this.zzc);
    }
}
