package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bumptech.glide.c;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbvc implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iS = c.S(parcel);
        String strI = null;
        Bundle bundleE = null;
        byte[] bArrF = null;
        String strI2 = null;
        String strI3 = null;
        int iJ = 0;
        boolean zE = false;
        while (parcel.dataPosition() < iS) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    strI = c.i(i, parcel);
                    break;
                case 2:
                    iJ = c.J(i, parcel);
                    break;
                case 3:
                    bundleE = c.e(i, parcel);
                    break;
                case 4:
                    bArrF = c.f(i, parcel);
                    break;
                case 5:
                    zE = c.E(i, parcel);
                    break;
                case 6:
                    strI2 = c.i(i, parcel);
                    break;
                case 7:
                    strI3 = c.i(i, parcel);
                    break;
                default:
                    c.R(i, parcel);
                    break;
            }
        }
        c.n(iS, parcel);
        return new zzbvb(strI, iJ, bundleE, bArrF, zE, strI2, strI3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbvb[i];
    }
}
