package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class zzaft implements zzbc {
    public static final Parcelable.Creator<zzaft> CREATOR = new zzafs();
    public final String zza;
    public final String zzb;

    public zzaft(Parcel parcel) {
        String string = parcel.readString();
        int i = zzen.zza;
        this.zza = string;
        this.zzb = parcel.readString();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzaft zzaftVar = (zzaft) obj;
            if (this.zza.equals(zzaftVar.zza) && this.zzb.equals(zzaftVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode() + 527;
        return this.zzb.hashCode() + (iHashCode * 31);
    }

    public final String toString() {
        return "VC: " + this.zza + "=" + this.zzb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.ads.zzbc
    public final void zza(zzay zzayVar) {
        String str = this.zza;
        switch (str.hashCode()) {
            case 62359119:
                if (str.equals("ALBUM")) {
                    zzayVar.zzd(this.zzb);
                }
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    zzayVar.zzq(this.zzb);
                }
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    zzayVar.zzh(this.zzb);
                }
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    zzayVar.zzc(this.zzb);
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    zzayVar.zze(this.zzb);
                }
                break;
        }
    }

    public zzaft(String str, String str2) {
        this.zza = zzfwa.zzb(str);
        this.zzb = str2;
    }
}
