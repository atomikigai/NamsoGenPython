package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.bumptech.glide.d;
import java.util.Arrays;
import w5.u;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbru extends h7.a {
    public static final Parcelable.Creator<zzbru> CREATOR = new zzbrv();
    public final int zza;
    public final int zzb;
    public final int zzc;

    public zzbru(int i, int i10, int i11) {
        this.zza = i;
        this.zzb = i10;
        this.zzc = i11;
    }

    public static zzbru zza(u uVar) {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzbru)) {
            zzbru zzbruVar = (zzbru) obj;
            if (zzbruVar.zzc == this.zzc && zzbruVar.zzb == this.zzb && zzbruVar.zza == this.zza) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new int[]{this.zza, this.zzb, this.zzc});
    }

    public final String toString() {
        return this.zza + "." + this.zzb + "." + this.zzc;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i10 = this.zza;
        int iP = d.P(20293, parcel);
        d.R(parcel, 1, 4);
        parcel.writeInt(i10);
        int i11 = this.zzb;
        d.R(parcel, 2, 4);
        parcel.writeInt(i11);
        int i12 = this.zzc;
        d.R(parcel, 3, 4);
        parcel.writeInt(i12);
        d.Q(iP, parcel);
    }
}
