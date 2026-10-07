package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.bumptech.glide.d;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzblc extends h7.a {
    public static final Parcelable.Creator<zzblc> CREATOR = new zzbld();
    public final String zza;
    public final String[] zzb;
    public final String[] zzc;

    public zzblc(String str, String[] strArr, String[] strArr2) {
        this.zza = str;
        this.zzb = strArr;
        this.zzc = strArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.zza;
        int iP = d.P(20293, parcel);
        d.K(parcel, 1, str, false);
        d.L(parcel, 2, this.zzb, false);
        d.L(parcel, 3, this.zzc, false);
        d.Q(iP, parcel);
    }
}
