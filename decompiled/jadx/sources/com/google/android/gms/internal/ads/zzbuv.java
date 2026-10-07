package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Parcel;
import android.os.Parcelable;
import com.bumptech.glide.d;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbuv extends h7.a {
    public static final Parcelable.Creator<zzbuv> CREATOR = new zzbuw();
    public final ApplicationInfo zza;
    public final String zzb;
    public final PackageInfo zzc;
    public final String zzd;
    public final int zze;
    public final String zzf;
    public final List zzg;
    public final boolean zzh;
    public final boolean zzi;

    public zzbuv(ApplicationInfo applicationInfo, String str, PackageInfo packageInfo, String str2, int i, String str3, List list, boolean z4, boolean z10) {
        this.zzb = str;
        this.zza = applicationInfo;
        this.zzc = packageInfo;
        this.zzd = str2;
        this.zze = i;
        this.zzf = str3;
        this.zzg = list;
        this.zzh = z4;
        this.zzi = z10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ApplicationInfo applicationInfo = this.zza;
        int iP = d.P(20293, parcel);
        d.J(parcel, 1, applicationInfo, i, false);
        d.K(parcel, 2, this.zzb, false);
        d.J(parcel, 3, this.zzc, i, false);
        d.K(parcel, 4, this.zzd, false);
        int i10 = this.zze;
        d.R(parcel, 5, 4);
        parcel.writeInt(i10);
        d.K(parcel, 6, this.zzf, false);
        d.M(parcel, 7, this.zzg);
        boolean z4 = this.zzh;
        d.R(parcel, 8, 4);
        parcel.writeInt(z4 ? 1 : 0);
        boolean z10 = this.zzi;
        d.R(parcel, 9, 4);
        parcel.writeInt(z10 ? 1 : 0);
        d.Q(iP, parcel);
    }
}
