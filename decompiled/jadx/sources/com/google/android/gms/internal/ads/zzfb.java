package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfb implements zzbc {
    public static final Parcelable.Creator<zzfb> CREATOR = new zzez();
    public final long zza;
    public final long zzb;
    public final long zzc;

    public zzfb(long j4, long j10, long j11) {
        this.zza = j4;
        this.zzb = j10;
        this.zzc = j11;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzfb)) {
            return false;
        }
        zzfb zzfbVar = (zzfb) obj;
        return this.zza == zzfbVar.zza && this.zzb == zzfbVar.zzb && this.zzc == zzfbVar.zzc;
    }

    public final int hashCode() {
        long j4 = this.zza;
        int i = (int) (j4 ^ (j4 >>> 32));
        long j10 = this.zzc;
        long j11 = this.zzb;
        return ((((i + 527) * 31) + ((int) ((j11 >>> 32) ^ j11))) * 31) + ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.zza + ", modification time=" + this.zzb + ", timescale=" + this.zzc;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.zza);
        parcel.writeLong(this.zzb);
        parcel.writeLong(this.zzc);
    }

    public /* synthetic */ zzfb(Parcel parcel, zzfa zzfaVar) {
        this.zza = parcel.readLong();
        this.zzb = parcel.readLong();
        this.zzc = parcel.readLong();
    }

    @Override // com.google.android.gms.internal.ads.zzbc
    public final /* synthetic */ void zza(zzay zzayVar) {
    }
}
