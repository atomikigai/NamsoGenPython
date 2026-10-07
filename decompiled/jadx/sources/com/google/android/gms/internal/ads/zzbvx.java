package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bumptech.glide.d;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbvx extends h7.a {
    public static final Parcelable.Creator<zzbvx> CREATOR = new zzbvy();
    public final Bundle zza;
    public final i6.a zzb;
    public final ApplicationInfo zzc;
    public final String zzd;
    public final List zze;
    public final PackageInfo zzf;
    public final String zzg;
    public final String zzh;
    public zzfhj zzi;
    public String zzj;
    public final boolean zzk;
    public final boolean zzl;
    public final Bundle zzm;

    public zzbvx(Bundle bundle, i6.a aVar, ApplicationInfo applicationInfo, String str, List list, PackageInfo packageInfo, String str2, String str3, zzfhj zzfhjVar, String str4, boolean z4, boolean z10, Bundle bundle2) {
        this.zza = bundle;
        this.zzb = aVar;
        this.zzd = str;
        this.zzc = applicationInfo;
        this.zze = list;
        this.zzf = packageInfo;
        this.zzg = str2;
        this.zzh = str3;
        this.zzi = zzfhjVar;
        this.zzj = str4;
        this.zzk = z4;
        this.zzl = z10;
        this.zzm = bundle2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = this.zza;
        int iP = d.P(20293, parcel);
        d.C(parcel, 1, bundle, false);
        d.J(parcel, 2, this.zzb, i, false);
        d.J(parcel, 3, this.zzc, i, false);
        d.K(parcel, 4, this.zzd, false);
        d.M(parcel, 5, this.zze);
        d.J(parcel, 6, this.zzf, i, false);
        d.K(parcel, 7, this.zzg, false);
        d.K(parcel, 9, this.zzh, false);
        d.J(parcel, 10, this.zzi, i, false);
        d.K(parcel, 11, this.zzj, false);
        boolean z4 = this.zzk;
        d.R(parcel, 12, 4);
        parcel.writeInt(z4 ? 1 : 0);
        boolean z10 = this.zzl;
        d.R(parcel, 13, 4);
        parcel.writeInt(z10 ? 1 : 0);
        d.C(parcel, 14, this.zzm, false);
        d.Q(iP, parcel);
    }
}
