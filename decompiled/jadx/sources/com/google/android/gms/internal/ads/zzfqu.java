package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.bumptech.glide.d;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfqu extends h7.a {
    public static final Parcelable.Creator<zzfqu> CREATOR = new zzfqv();
    public final int zza;
    public final byte[] zzb;

    public zzfqu(int i, byte[] bArr) {
        this.zza = i;
        this.zzb = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i10 = this.zza;
        int iP = d.P(20293, parcel);
        d.R(parcel, 1, 4);
        parcel.writeInt(i10);
        d.D(parcel, 2, this.zzb, false);
        d.Q(iP, parcel);
    }

    public zzfqu(byte[] bArr) {
        this(1, bArr);
    }
}
