package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import da.v;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzv implements Parcelable {
    public static final Parcelable.Creator<zzv> CREATOR = new zzu();
    public final UUID zza;
    public final String zzb;
    public final String zzc;
    public final byte[] zzd;
    private int zze;

    public zzv(Parcel parcel) {
        this.zza = new UUID(parcel.readLong(), parcel.readLong());
        this.zzb = parcel.readString();
        String string = parcel.readString();
        int i = zzen.zza;
        this.zzc = string;
        this.zzd = parcel.createByteArray();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzv)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        zzv zzvVar = (zzv) obj;
        return Objects.equals(this.zzb, zzvVar.zzb) && Objects.equals(this.zzc, zzvVar.zzc) && Objects.equals(this.zza, zzvVar.zza) && Arrays.equals(this.zzd, zzvVar.zzd);
    }

    public final int hashCode() {
        int i = this.zze;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.zza.hashCode() * 31;
        String str = this.zzb;
        int iHashCode2 = Arrays.hashCode(this.zzd) + v.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.zzc);
        this.zze = iHashCode2;
        return iHashCode2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.zza.getMostSignificantBits());
        parcel.writeLong(this.zza.getLeastSignificantBits());
        parcel.writeString(this.zzb);
        parcel.writeString(this.zzc);
        parcel.writeByteArray(this.zzd);
    }

    public zzv(UUID uuid, String str, String str2, byte[] bArr) {
        uuid.getClass();
        this.zza = uuid;
        this.zzb = null;
        this.zzc = zzbg.zze(str2);
        this.zzd = bArr;
    }
}
