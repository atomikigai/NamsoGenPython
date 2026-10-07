package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.bumptech.glide.c;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbyf implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iS = c.S(parcel);
        String strI = null;
        String strI2 = null;
        ArrayList arrayListK = null;
        ArrayList arrayListK2 = null;
        boolean zE = false;
        boolean zE2 = false;
        boolean zE3 = false;
        boolean zE4 = false;
        while (parcel.dataPosition() < iS) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 2:
                    strI = c.i(i, parcel);
                    break;
                case 3:
                    strI2 = c.i(i, parcel);
                    break;
                case 4:
                    zE = c.E(i, parcel);
                    break;
                case 5:
                    zE2 = c.E(i, parcel);
                    break;
                case 6:
                    arrayListK = c.k(i, parcel);
                    break;
                case 7:
                    zE3 = c.E(i, parcel);
                    break;
                case '\b':
                    zE4 = c.E(i, parcel);
                    break;
                case '\t':
                    arrayListK2 = c.k(i, parcel);
                    break;
                default:
                    c.R(i, parcel);
                    break;
            }
        }
        c.n(iS, parcel);
        return new zzbye(strI, strI2, zE, zE2, arrayListK, zE3, zE4, arrayListK2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbye[i];
    }
}
