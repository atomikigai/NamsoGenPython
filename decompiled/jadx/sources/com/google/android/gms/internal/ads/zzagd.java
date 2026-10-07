package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzagd extends zzagl {
    public static final Parcelable.Creator<zzagd> CREATOR = new zzagc();
    public final String zza;
    public final boolean zzb;
    public final boolean zzc;
    public final String[] zzd;
    private final zzagl[] zze;

    public zzagd(Parcel parcel) {
        super("CTOC");
        String string = parcel.readString();
        int i = zzen.zza;
        this.zza = string;
        this.zzb = parcel.readByte() != 0;
        this.zzc = parcel.readByte() != 0;
        this.zzd = parcel.createStringArray();
        int i10 = parcel.readInt();
        this.zze = new zzagl[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            this.zze[i11] = (zzagl) parcel.readParcelable(zzagl.class.getClassLoader());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzagd.class == obj.getClass()) {
            zzagd zzagdVar = (zzagd) obj;
            if (this.zzb == zzagdVar.zzb && this.zzc == zzagdVar.zzc && Objects.equals(this.zza, zzagdVar.zza) && Arrays.equals(this.zzd, zzagdVar.zzd) && Arrays.equals(this.zze, zzagdVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zza;
        return (((((this.zzb ? 1 : 0) + 527) * 31) + (this.zzc ? 1 : 0)) * 31) + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeByte(this.zzb ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.zzc ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.zzd);
        parcel.writeInt(this.zze.length);
        for (zzagl zzaglVar : this.zze) {
            parcel.writeParcelable(zzaglVar, 0);
        }
    }

    public zzagd(String str, boolean z4, boolean z10, String[] strArr, zzagl[] zzaglVarArr) {
        super("CTOC");
        this.zza = str;
        this.zzb = z4;
        this.zzc = z10;
        this.zzd = strArr;
        this.zze = zzaglVarArr;
    }
}
