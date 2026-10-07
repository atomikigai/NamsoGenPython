package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.bumptech.glide.d;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzblp extends h7.a {
    public static final Parcelable.Creator<zzblp> CREATOR = new zzblq();
    public final String zza;
    public final boolean zzb;
    public final int zzc;
    public final String zzd;

    public zzblp(String str, boolean z4, int i, String str2) {
        this.zza = str;
        this.zzb = z4;
        this.zzc = i;
        this.zzd = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.zza;
        int iP = d.P(20293, parcel);
        d.K(parcel, 1, str, false);
        boolean z4 = this.zzb;
        d.R(parcel, 2, 4);
        parcel.writeInt(z4 ? 1 : 0);
        int i10 = this.zzc;
        d.R(parcel, 3, 4);
        parcel.writeInt(i10);
        d.K(parcel, 4, this.zzd, false);
        d.Q(iP, parcel);
    }
}
