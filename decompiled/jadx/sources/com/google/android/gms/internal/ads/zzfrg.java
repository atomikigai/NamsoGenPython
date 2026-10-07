package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.bumptech.glide.d;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfrg extends h7.a {
    public static final Parcelable.Creator<zzfrg> CREATOR = new zzfrh();
    public final int zza;
    public final int zzb;
    public final String zzc;
    public final String zzd;
    public final int zze;

    public zzfrg(int i, int i10, int i11, String str, String str2) {
        this.zza = i;
        this.zzb = i10;
        this.zzc = str;
        this.zzd = str2;
        this.zze = i11;
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
        d.K(parcel, 3, this.zzc, false);
        d.K(parcel, 4, this.zzd, false);
        int i12 = this.zze;
        d.R(parcel, 5, 4);
        parcel.writeInt(i12);
        d.Q(iP, parcel);
    }

    public zzfrg(int i, int i10, String str, String str2) {
        this(1, 1, i10 - 1, str, str2);
    }
}
