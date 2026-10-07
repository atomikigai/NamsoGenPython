package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.bumptech.glide.d;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfri extends h7.a {
    public static final Parcelable.Creator<zzfri> CREATOR = new zzfrj();
    public final int zza;
    public final byte[] zzb;
    public final int zzc;

    public zzfri(int i, byte[] bArr, int i10) {
        this.zza = i;
        this.zzb = bArr == null ? null : Arrays.copyOf(bArr, bArr.length);
        this.zzc = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i10 = this.zza;
        int iP = d.P(20293, parcel);
        d.R(parcel, 1, 4);
        parcel.writeInt(i10);
        d.D(parcel, 2, this.zzb, false);
        int i11 = this.zzc;
        d.R(parcel, 3, 4);
        parcel.writeInt(i11);
        d.Q(iP, parcel);
    }

    public zzfri(byte[] bArr, int i) {
        this(1, null, 1);
    }
}
