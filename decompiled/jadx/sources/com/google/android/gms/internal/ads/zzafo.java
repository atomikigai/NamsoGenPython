package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzafo implements zzbc {
    public static final Parcelable.Creator<zzafo> CREATOR;
    public final String zza;
    public final String zzb;
    public final long zzc;
    public final long zzd;
    public final byte[] zze;
    private int zzf;

    static {
        zzab zzabVar = new zzab();
        zzabVar.zzZ("application/id3");
        zzabVar.zzaf();
        zzab zzabVar2 = new zzab();
        zzabVar2.zzZ("application/x-scte35");
        zzabVar2.zzaf();
        CREATOR = new zzafn();
    }

    public zzafo(String str, String str2, long j4, long j10, byte[] bArr) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = j4;
        this.zzd = j10;
        this.zze = bArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzafo.class == obj.getClass()) {
            zzafo zzafoVar = (zzafo) obj;
            if (this.zzc == zzafoVar.zzc && this.zzd == zzafoVar.zzd && Objects.equals(this.zza, zzafoVar.zza) && Objects.equals(this.zzb, zzafoVar.zzb) && Arrays.equals(this.zze, zzafoVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzf;
        if (i != 0) {
            return i;
        }
        String str = this.zza;
        int iHashCode = str != null ? str.hashCode() : 0;
        String str2 = this.zzb;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        long j4 = this.zzc;
        long j10 = this.zzd;
        int iHashCode3 = Arrays.hashCode(this.zze) + ((((((((iHashCode + 527) * 31) + iHashCode2) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31);
        this.zzf = iHashCode3;
        return iHashCode3;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.zza + ", id=" + this.zzd + ", durationMs=" + this.zzc + ", value=" + this.zzb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeLong(this.zzc);
        parcel.writeLong(this.zzd);
        parcel.writeByteArray(this.zze);
    }

    public zzafo(Parcel parcel) {
        String string = parcel.readString();
        int i = zzen.zza;
        this.zza = string;
        this.zzb = parcel.readString();
        this.zzc = parcel.readLong();
        this.zzd = parcel.readLong();
        this.zze = parcel.createByteArray();
    }

    @Override // com.google.android.gms.internal.ads.zzbc
    public final /* synthetic */ void zza(zzay zzayVar) {
    }
}
