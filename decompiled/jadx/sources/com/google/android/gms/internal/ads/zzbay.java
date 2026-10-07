package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bumptech.glide.c;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbay implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iS = c.S(parcel);
        boolean zE = false;
        int iJ = 0;
        String strI = null;
        String strI2 = null;
        String strI3 = null;
        String strI4 = null;
        Bundle bundleE = null;
        String strI5 = null;
        long jM = 0;
        long jM2 = 0;
        while (parcel.dataPosition() < iS) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 2:
                    strI = c.i(i, parcel);
                    break;
                case 3:
                    jM = c.M(i, parcel);
                    break;
                case 4:
                    strI2 = c.i(i, parcel);
                    break;
                case 5:
                    strI3 = c.i(i, parcel);
                    break;
                case 6:
                    strI4 = c.i(i, parcel);
                    break;
                case 7:
                    bundleE = c.e(i, parcel);
                    break;
                case '\b':
                    zE = c.E(i, parcel);
                    break;
                case '\t':
                    jM2 = c.M(i, parcel);
                    break;
                case '\n':
                    strI5 = c.i(i, parcel);
                    break;
                case 11:
                    iJ = c.J(i, parcel);
                    break;
                default:
                    c.R(i, parcel);
                    break;
            }
        }
        c.n(iS, parcel);
        return new zzbax(strI, jM, strI2, strI3, strI4, bundleE, zE, jM2, strI5, iJ);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbax[i];
    }
}
