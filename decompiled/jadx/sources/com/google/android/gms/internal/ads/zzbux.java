package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.bumptech.glide.d;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbux extends h7.a {
    public static final Parcelable.Creator<zzbux> CREATOR = new zzbuy();
    public final boolean zza;
    public final List zzb;

    public zzbux(boolean z4, List list) {
        this.zza = z4;
        this.zzb = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z4 = this.zza;
        int iP = d.P(20293, parcel);
        d.R(parcel, 2, 4);
        parcel.writeInt(z4 ? 1 : 0);
        d.M(parcel, 3, this.zzb);
        d.Q(iP, parcel);
    }

    public zzbux() {
        this(false, Collections.EMPTY_LIST);
    }
}
