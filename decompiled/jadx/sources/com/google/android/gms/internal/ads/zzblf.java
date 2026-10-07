package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.bumptech.glide.c;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzblf implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iS = c.S(parcel);
        long jM = 0;
        boolean zE = false;
        int iJ = 0;
        boolean zE2 = false;
        String strI = null;
        byte[] bArrF = null;
        String[] strArrJ = null;
        String[] strArrJ2 = null;
        while (parcel.dataPosition() < iS) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    zE = c.E(i, parcel);
                    break;
                case 2:
                    strI = c.i(i, parcel);
                    break;
                case 3:
                    iJ = c.J(i, parcel);
                    break;
                case 4:
                    bArrF = c.f(i, parcel);
                    break;
                case 5:
                    strArrJ = c.j(i, parcel);
                    break;
                case 6:
                    strArrJ2 = c.j(i, parcel);
                    break;
                case 7:
                    zE2 = c.E(i, parcel);
                    break;
                case '\b':
                    jM = c.M(i, parcel);
                    break;
                default:
                    c.R(i, parcel);
                    break;
            }
        }
        c.n(iS, parcel);
        return new zzble(zE, strI, iJ, bArrF, strArrJ, strArrJ2, zE2, jM);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzble[i];
    }
}
