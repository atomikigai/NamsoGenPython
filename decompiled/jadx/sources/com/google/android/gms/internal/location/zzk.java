package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.bumptech.glide.c;
import com.google.android.gms.common.internal.g;
import java.util.List;
import w7.b0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzk implements Parcelable.Creator<zzj> {
    @Override // android.os.Parcelable.Creator
    public final zzj createFromParcel(Parcel parcel) {
        int iS = c.S(parcel);
        b0 b0Var = zzj.zzb;
        List<g> listM = zzj.zza;
        String strI = null;
        while (parcel.dataPosition() < iS) {
            int i = parcel.readInt();
            char c10 = (char) i;
            if (c10 == 1) {
                b0Var = (b0) c.h(parcel, i, b0.CREATOR);
            } else if (c10 == 2) {
                listM = c.m(parcel, i, g.CREATOR);
            } else if (c10 != 3) {
                c.R(i, parcel);
            } else {
                strI = c.i(i, parcel);
            }
        }
        c.n(iS, parcel);
        return new zzj(b0Var, listM, strI);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzj[] newArray(int i) {
        return new zzj[i];
    }
}
