package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.bumptech.glide.c;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzay implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iS = c.S(parcel);
        int iJ = 0;
        String strI = null;
        while (parcel.dataPosition() < iS) {
            int i = parcel.readInt();
            char c10 = (char) i;
            if (c10 == 1) {
                iJ = c.J(i, parcel);
            } else if (c10 != 2) {
                c.R(i, parcel);
            } else {
                strI = c.i(i, parcel);
            }
        }
        c.n(iS, parcel);
        return new zzax(iJ, strI);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzax[i];
    }
}
