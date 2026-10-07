package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.bumptech.glide.d;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzble extends h7.a {
    public static final Parcelable.Creator<zzble> CREATOR = new zzblf();
    public final boolean zza;
    public final String zzb;
    public final int zzc;
    public final byte[] zzd;
    public final String[] zze;
    public final String[] zzf;
    public final boolean zzg;
    public final long zzh;

    public zzble(boolean z4, String str, int i, byte[] bArr, String[] strArr, String[] strArr2, boolean z10, long j4) {
        this.zza = z4;
        this.zzb = str;
        this.zzc = i;
        this.zzd = bArr;
        this.zze = strArr;
        this.zzf = strArr2;
        this.zzg = z10;
        this.zzh = j4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z4 = this.zza;
        int iP = d.P(20293, parcel);
        d.R(parcel, 1, 4);
        parcel.writeInt(z4 ? 1 : 0);
        d.K(parcel, 2, this.zzb, false);
        int i10 = this.zzc;
        d.R(parcel, 3, 4);
        parcel.writeInt(i10);
        d.D(parcel, 4, this.zzd, false);
        d.L(parcel, 5, this.zze, false);
        d.L(parcel, 6, this.zzf, false);
        boolean z10 = this.zzg;
        d.R(parcel, 7, 4);
        parcel.writeInt(z10 ? 1 : 0);
        long j4 = this.zzh;
        d.R(parcel, 8, 8);
        parcel.writeLong(j4);
        d.Q(iP, parcel);
    }
}
