package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.bumptech.glide.c;
import e6.o3;
import e6.q3;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbzm implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iS = c.S(parcel);
        String strI = null;
        String strI2 = null;
        q3 q3Var = null;
        o3 o3Var = null;
        while (parcel.dataPosition() < iS) {
            int i = parcel.readInt();
            char c10 = (char) i;
            if (c10 == 1) {
                strI = c.i(i, parcel);
            } else if (c10 == 2) {
                strI2 = c.i(i, parcel);
            } else if (c10 == 3) {
                q3Var = (q3) c.h(parcel, i, q3.CREATOR);
            } else if (c10 != 4) {
                c.R(i, parcel);
            } else {
                o3Var = (o3) c.h(parcel, i, o3.CREATOR);
            }
        }
        c.n(iS, parcel);
        return new zzbzl(strI, strI2, q3Var, o3Var);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbzl[i];
    }
}
