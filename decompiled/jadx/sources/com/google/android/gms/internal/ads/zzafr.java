package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzafr implements zzbc {
    public static final Parcelable.Creator<zzafr> CREATOR = new zzafq();
    public final int zza;
    public final String zzb;
    public final String zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final byte[] zzh;

    public zzafr(int i, String str, String str2, int i10, int i11, int i12, int i13, byte[] bArr) {
        this.zza = i;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = i10;
        this.zze = i11;
        this.zzf = i12;
        this.zzg = i13;
        this.zzh = bArr;
    }

    public static zzafr zzb(zzed zzedVar) {
        int iZzg = zzedVar.zzg();
        String strZze = zzbg.zze(zzedVar.zzB(zzedVar.zzg(), StandardCharsets.US_ASCII));
        String strZzB = zzedVar.zzB(zzedVar.zzg(), StandardCharsets.UTF_8);
        int iZzg2 = zzedVar.zzg();
        int iZzg3 = zzedVar.zzg();
        int iZzg4 = zzedVar.zzg();
        int iZzg5 = zzedVar.zzg();
        int iZzg6 = zzedVar.zzg();
        byte[] bArr = new byte[iZzg6];
        zzedVar.zzH(bArr, 0, iZzg6);
        return new zzafr(iZzg, strZze, strZzB, iZzg2, iZzg3, iZzg4, iZzg5, bArr);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzafr.class == obj.getClass()) {
            zzafr zzafrVar = (zzafr) obj;
            if (this.zza == zzafrVar.zza && this.zzb.equals(zzafrVar.zzb) && this.zzc.equals(zzafrVar.zzc) && this.zzd == zzafrVar.zzd && this.zze == zzafrVar.zze && this.zzf == zzafrVar.zzf && this.zzg == zzafrVar.zzg && Arrays.equals(this.zzh, zzafrVar.zzh)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zza + 527;
        int iHashCode = this.zzb.hashCode() + (i * 31);
        int iHashCode2 = this.zzc.hashCode() + (iHashCode * 31);
        byte[] bArr = this.zzh;
        return Arrays.hashCode(bArr) + (((((((((iHashCode2 * 31) + this.zzd) * 31) + this.zze) * 31) + this.zzf) * 31) + this.zzg) * 31);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.zzb + ", description=" + this.zzc;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeString(this.zzc);
        parcel.writeInt(this.zzd);
        parcel.writeInt(this.zze);
        parcel.writeInt(this.zzf);
        parcel.writeInt(this.zzg);
        parcel.writeByteArray(this.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzbc
    public final void zza(zzay zzayVar) {
        zzayVar.zza(this.zzh, this.zza);
    }

    public zzafr(Parcel parcel) {
        this.zza = parcel.readInt();
        String string = parcel.readString();
        int i = zzen.zza;
        this.zzb = string;
        this.zzc = parcel.readString();
        this.zzd = parcel.readInt();
        this.zze = parcel.readInt();
        this.zzf = parcel.readInt();
        this.zzg = parcel.readInt();
        this.zzh = parcel.createByteArray();
    }
}
