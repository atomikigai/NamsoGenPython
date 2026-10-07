package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bumptech.glide.d;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbvb extends h7.a {
    public static final Parcelable.Creator<zzbvb> CREATOR = new zzbvc();
    public final String zza;
    public final int zzb;
    public final Bundle zzc;
    public final byte[] zzd;
    public final boolean zze;
    public final String zzf;
    public final String zzg;

    public zzbvb(String str, int i, Bundle bundle, byte[] bArr, boolean z4, String str2, String str3) {
        this.zza = str;
        this.zzb = i;
        this.zzc = bundle;
        this.zzd = bArr;
        this.zze = z4;
        this.zzf = str2;
        this.zzg = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.zza;
        int iP = d.P(20293, parcel);
        d.K(parcel, 1, str, false);
        int i10 = this.zzb;
        d.R(parcel, 2, 4);
        parcel.writeInt(i10);
        d.C(parcel, 3, this.zzc, false);
        d.D(parcel, 4, this.zzd, false);
        boolean z4 = this.zze;
        d.R(parcel, 5, 4);
        parcel.writeInt(z4 ? 1 : 0);
        d.K(parcel, 6, this.zzf, false);
        d.K(parcel, 7, this.zzg, false);
        d.Q(iP, parcel);
    }
}
