package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.bumptech.glide.d;
import e6.o3;
import e6.q3;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbzl extends h7.a {
    public static final Parcelable.Creator<zzbzl> CREATOR = new zzbzm();
    public final String zza;
    public final String zzb;

    @Deprecated
    public final q3 zzc;
    public final o3 zzd;

    public zzbzl(String str, String str2, q3 q3Var, o3 o3Var) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = q3Var;
        this.zzd = o3Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.zza;
        int iP = d.P(20293, parcel);
        d.K(parcel, 1, str, false);
        d.K(parcel, 2, this.zzb, false);
        d.J(parcel, 3, this.zzc, i, false);
        d.J(parcel, 4, this.zzd, i, false);
        d.Q(iP, parcel);
    }
}
