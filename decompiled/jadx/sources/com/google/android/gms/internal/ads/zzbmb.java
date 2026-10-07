package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.bumptech.glide.d;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbmb extends h7.a {
    public static final Parcelable.Creator<zzbmb> CREATOR = new zzbmc();
    public final int zza;
    public final int zzb;
    public final String zzc;
    public final int zzd;

    public zzbmb(int i, int i10, String str, int i11) {
        this.zza = i;
        this.zzb = i10;
        this.zzc = str;
        this.zzd = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i10 = this.zzb;
        int iP = d.P(20293, parcel);
        d.R(parcel, 1, 4);
        parcel.writeInt(i10);
        d.K(parcel, 2, this.zzc, false);
        int i11 = this.zzd;
        d.R(parcel, 3, 4);
        parcel.writeInt(i11);
        int i12 = this.zza;
        d.R(parcel, zzbbs.zzq.zzf, 4);
        parcel.writeInt(i12);
        d.Q(iP, parcel);
    }
}
