package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.bumptech.glide.d;
import r6.e;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbxq extends h7.a {
    public static final Parcelable.Creator<zzbxq> CREATOR = new zzbxr();
    public final String zza;
    public final String zzb;

    public zzbxq(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.zza;
        int iP = d.P(20293, parcel);
        d.K(parcel, 1, str, false);
        d.K(parcel, 2, this.zzb, false);
        d.Q(iP, parcel);
    }

    public zzbxq(e eVar) {
        throw null;
    }
}
