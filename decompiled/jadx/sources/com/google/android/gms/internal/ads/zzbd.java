package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import da.v;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbd implements Parcelable {
    public static final Parcelable.Creator<zzbd> CREATOR = new zzbb();
    public final long zza;
    private final zzbc[] zzb;

    public zzbd(long j4, zzbc... zzbcVarArr) {
        this.zza = j4;
        this.zzb = zzbcVarArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzbd.class == obj.getClass()) {
            zzbd zzbdVar = (zzbd) obj;
            if (Arrays.equals(this.zzb, zzbdVar.zzb) && this.zza == zzbdVar.zza) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = Arrays.hashCode(this.zzb) * 31;
        long j4 = this.zza;
        return iHashCode + ((int) (j4 ^ (j4 >>> 32)));
    }

    public final String toString() {
        long j4 = this.zza;
        return v.i("entries=", Arrays.toString(this.zzb), j4 == -9223372036854775807L ? "" : v.g(", presentationTimeUs=", j4));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.zzb.length);
        for (zzbc zzbcVar : this.zzb) {
            parcel.writeParcelable(zzbcVar, 0);
        }
        parcel.writeLong(this.zza);
    }

    public final int zza() {
        return this.zzb.length;
    }

    public final zzbc zzb(int i) {
        return this.zzb[i];
    }

    public final zzbd zzc(zzbc... zzbcVarArr) {
        int length = zzbcVarArr.length;
        if (length == 0) {
            return this;
        }
        long j4 = this.zza;
        zzbc[] zzbcVarArr2 = this.zzb;
        int i = zzen.zza;
        int length2 = zzbcVarArr2.length;
        Object[] objArrCopyOf = Arrays.copyOf(zzbcVarArr2, length2 + length);
        System.arraycopy(zzbcVarArr, 0, objArrCopyOf, length2, length);
        return new zzbd(j4, (zzbc[]) objArrCopyOf);
    }

    public final zzbd zzd(zzbd zzbdVar) {
        return zzbdVar == null ? this : zzc(zzbdVar.zzb);
    }

    public zzbd(Parcel parcel) {
        this.zzb = new zzbc[parcel.readInt()];
        int i = 0;
        while (true) {
            zzbc[] zzbcVarArr = this.zzb;
            if (i >= zzbcVarArr.length) {
                this.zza = parcel.readLong();
                return;
            } else {
                zzbcVarArr[i] = (zzbc) parcel.readParcelable(zzbc.class.getClassLoader());
                i++;
            }
        }
    }

    public zzbd(List list) {
        this(-9223372036854775807L, (zzbc[]) list.toArray(new zzbc[0]));
    }
}
