package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.bumptech.glide.d;
import e6.o3;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbwq extends h7.a {
    public static final Parcelable.Creator<zzbwq> CREATOR = new zzbwr();
    public final o3 zza;
    public final String zzb;

    public zzbwq(o3 o3Var, String str) {
        this.zza = o3Var;
        this.zzb = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        o3 o3Var = this.zza;
        int iP = d.P(20293, parcel);
        d.J(parcel, 2, o3Var, i, false);
        d.K(parcel, 3, this.zzb, false);
        d.Q(iP, parcel);
    }
}
