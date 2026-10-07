package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import da.v;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzer implements zzbc {
    public static final Parcelable.Creator<zzer> CREATOR = new zzep();
    public final String zza;
    public final byte[] zzb;
    public final int zzc;
    public final int zzd;

    public /* synthetic */ zzer(Parcel parcel, zzeq zzeqVar) {
        String string = parcel.readString();
        int i = zzen.zza;
        this.zza = string;
        byte[] bArrCreateByteArray = parcel.createByteArray();
        this.zzb = bArrCreateByteArray;
        this.zzc = parcel.readInt();
        int i10 = parcel.readInt();
        this.zzd = i10;
        zzb(string, bArrCreateByteArray, i10);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static void zzb(String str, byte[] bArr, int i) {
        byte b10;
        boolean z4 = true;
        switch (str.hashCode()) {
            case -1949883051:
                if (str.equals("com.android.capture.fps")) {
                    zzdb.zzd(i == 23 && bArr.length == 4);
                    return;
                }
                return;
            case -1555642602:
                if (str.equals("editable.tracks.samples.location")) {
                    if (i != 75 || bArr.length != 1 || ((b10 = bArr[0]) != 0 && b10 != 1)) {
                        z4 = false;
                    }
                    zzdb.zzd(z4);
                    return;
                }
                return;
            case 101820674:
                if (!str.equals("editable.tracks.length")) {
                    return;
                }
                break;
            case 188404399:
                if (!str.equals("editable.tracks.offset")) {
                    return;
                }
                break;
            case 1805012160:
                if (str.equals("editable.tracks.map")) {
                    zzdb.zzd(i == 0);
                    return;
                }
                return;
            default:
                return;
        }
        zzdb.zzd(i == 78 && bArr.length == 8);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzer.class == obj.getClass()) {
            zzer zzerVar = (zzer) obj;
            if (this.zza.equals(zzerVar.zza) && Arrays.equals(this.zzb, zzerVar.zzb) && this.zzc == zzerVar.zzc && this.zzd == zzerVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode() + 527;
        return ((((Arrays.hashCode(this.zzb) + (iHashCode * 31)) * 31) + this.zzc) * 31) + this.zzd;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x009e  */
    /* JADX WARN: Code duplicated, block: B:28:0x00aa A[LOOP:0: B:26:0x00a7->B:28:0x00aa, LOOP_END] */
    public final String toString() {
        String string;
        byte[] bArr;
        StringBuilder sb2;
        int i = this.zzd;
        int i10 = 0;
        if (i != 0) {
            if (i == 1) {
                string = zzen.zzB(this.zzb);
            } else if (i == 23) {
                string = String.valueOf(Float.intBitsToFloat(zzgcr.zzd(this.zzb)));
            } else if (i == 67) {
                string = String.valueOf(zzgcr.zzd(this.zzb));
            } else if (i == 75) {
                string = String.valueOf(this.zzb[0] & 255);
            } else if (i != 78) {
                bArr = this.zzb;
                int length = bArr.length;
                sb2 = new StringBuilder(length + length);
                while (i10 < bArr.length) {
                    sb2.append(Character.forDigit((bArr[i10] >> 4) & 15, 16));
                    sb2.append(Character.forDigit(bArr[i10] & 15, 16));
                    i10++;
                }
                string = sb2.toString();
            } else {
                string = String.valueOf(new zzed(this.zzb).zzw());
            }
        } else if (this.zza.equals("editable.tracks.map")) {
            zzdb.zzg(this.zza.equals("editable.tracks.map"), "Metadata is not an editable tracks map");
            byte b10 = this.zzb[1];
            ArrayList arrayList = new ArrayList();
            while (i10 < b10) {
                arrayList.add(Integer.valueOf(this.zzb[i10 + 2]));
                i10++;
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append("track types = ");
            zzfwi.zzb(sb3, arrayList, ",");
            string = sb3.toString();
        } else {
            bArr = this.zzb;
            int length2 = bArr.length;
            sb2 = new StringBuilder(length2 + length2);
            while (i10 < bArr.length) {
                sb2.append(Character.forDigit((bArr[i10] >> 4) & 15, 16));
                sb2.append(Character.forDigit(bArr[i10] & 15, 16));
                i10++;
            }
            string = sb2.toString();
        }
        return v.j("mdta: key=", this.zza, ", value=", string);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeByteArray(this.zzb);
        parcel.writeInt(this.zzc);
        parcel.writeInt(this.zzd);
    }

    public zzer(String str, byte[] bArr, int i, int i10) {
        zzb(str, bArr, i10);
        this.zza = str;
        this.zzb = bArr;
        this.zzc = i;
        this.zzd = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzbc
    public final /* synthetic */ void zza(zzay zzayVar) {
    }
}
