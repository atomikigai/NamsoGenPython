package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bumptech.glide.c;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcm implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iS = c.S(parcel);
        String strI = null;
        String strI2 = null;
        String strI3 = null;
        Bundle bundleE = null;
        String strI4 = null;
        boolean zE = false;
        long jM = 0;
        long jM2 = 0;
        while (parcel.dataPosition() < iS) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    jM = c.M(i, parcel);
                    break;
                case 2:
                    jM2 = c.M(i, parcel);
                    break;
                case 3:
                    zE = c.E(i, parcel);
                    break;
                case 4:
                    strI = c.i(i, parcel);
                    break;
                case 5:
                    strI2 = c.i(i, parcel);
                    break;
                case 6:
                    strI3 = c.i(i, parcel);
                    break;
                case 7:
                    bundleE = c.e(i, parcel);
                    break;
                case '\b':
                    strI4 = c.i(i, parcel);
                    break;
                default:
                    c.R(i, parcel);
                    break;
            }
        }
        c.n(iS, parcel);
        return new zzcl(jM, jM2, zE, strI, strI2, strI3, bundleE, strI4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzcl[i];
    }
}
