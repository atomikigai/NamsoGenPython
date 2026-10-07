package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bumptech.glide.d;
import h7.a;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcl extends a {
    public static final Parcelable.Creator<zzcl> CREATOR = new zzcm();
    public final long zza;
    public final long zzb;
    public final boolean zzc;
    public final String zzd;
    public final String zze;
    public final String zzf;
    public final Bundle zzg;
    public final String zzh;

    public zzcl(long j4, long j10, boolean z4, String str, String str2, String str3, Bundle bundle, String str4) {
        this.zza = j4;
        this.zzb = j10;
        this.zzc = z4;
        this.zzd = str;
        this.zze = str2;
        this.zzf = str3;
        this.zzg = bundle;
        this.zzh = str4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = d.P(20293, parcel);
        long j4 = this.zza;
        d.R(parcel, 1, 8);
        parcel.writeLong(j4);
        long j10 = this.zzb;
        d.R(parcel, 2, 8);
        parcel.writeLong(j10);
        boolean z4 = this.zzc;
        d.R(parcel, 3, 4);
        parcel.writeInt(z4 ? 1 : 0);
        d.K(parcel, 4, this.zzd, false);
        d.K(parcel, 5, this.zze, false);
        d.K(parcel, 6, this.zzf, false);
        d.C(parcel, 7, this.zzg, false);
        d.K(parcel, 8, this.zzh, false);
        d.Q(iP, parcel);
    }
}
