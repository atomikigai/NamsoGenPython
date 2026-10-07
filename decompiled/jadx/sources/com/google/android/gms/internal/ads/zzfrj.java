package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.bumptech.glide.c;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfrj implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iS = c.S(parcel);
        int iJ = 0;
        byte[] bArrF = null;
        int iJ2 = 0;
        while (parcel.dataPosition() < iS) {
            int i = parcel.readInt();
            char c10 = (char) i;
            if (c10 == 1) {
                iJ = c.J(i, parcel);
            } else if (c10 == 2) {
                bArrF = c.f(i, parcel);
            } else if (c10 != 3) {
                c.R(i, parcel);
            } else {
                iJ2 = c.J(i, parcel);
            }
        }
        c.n(iS, parcel);
        return new zzfri(iJ, bArrF, iJ2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzfri[i];
    }
}
