package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzagb extends zzagl {
    public static final Parcelable.Creator<zzagb> CREATOR = new zzaga();
    public final String zza;
    public final int zzb;
    public final int zzc;
    public final long zzd;
    public final long zze;
    private final zzagl[] zzg;

    public zzagb(Parcel parcel) {
        super("CHAP");
        String string = parcel.readString();
        int i = zzen.zza;
        this.zza = string;
        this.zzb = parcel.readInt();
        this.zzc = parcel.readInt();
        this.zzd = parcel.readLong();
        this.zze = parcel.readLong();
        int i10 = parcel.readInt();
        this.zzg = new zzagl[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            this.zzg[i11] = (zzagl) parcel.readParcelable(zzagl.class.getClassLoader());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzagl, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzagb.class == obj.getClass()) {
            zzagb zzagbVar = (zzagb) obj;
            if (this.zzb == zzagbVar.zzb && this.zzc == zzagbVar.zzc && this.zzd == zzagbVar.zzd && this.zze == zzagbVar.zze && Objects.equals(this.zza, zzagbVar.zza) && Arrays.equals(this.zzg, zzagbVar.zzg)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zza;
        return ((((((((this.zzb + 527) * 31) + this.zzc) * 31) + ((int) this.zzd)) * 31) + ((int) this.zze)) * 31) + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeInt(this.zzb);
        parcel.writeInt(this.zzc);
        parcel.writeLong(this.zzd);
        parcel.writeLong(this.zze);
        parcel.writeInt(this.zzg.length);
        for (zzagl zzaglVar : this.zzg) {
            parcel.writeParcelable(zzaglVar, 0);
        }
    }

    public zzagb(String str, int i, int i10, long j4, long j10, zzagl[] zzaglVarArr) {
        super("CHAP");
        this.zza = str;
        this.zzb = i;
        this.zzc = i10;
        this.zzd = j4;
        this.zze = j10;
        this.zzg = zzaglVarArr;
    }
}
