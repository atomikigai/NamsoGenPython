package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.bumptech.glide.c;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzaid implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iS = c.S(parcel);
        String strI = null;
        String strI2 = null;
        String strI3 = null;
        String strI4 = null;
        String strI5 = null;
        String strI6 = null;
        String strI7 = null;
        String strI8 = null;
        String strI9 = null;
        String strI10 = null;
        String strI11 = null;
        String strI12 = null;
        String strI13 = null;
        boolean zE = false;
        boolean zE2 = false;
        boolean zE3 = false;
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
                    strI3 = c.i(i, parcel);
                    break;
                case 5:
                    strI4 = c.i(i, parcel);
                    break;
                case 6:
                    strI5 = c.i(i, parcel);
                    break;
                case 7:
                    strI6 = c.i(i, parcel);
                    break;
                case '\b':
                    strI7 = c.i(i, parcel);
                    break;
                case '\t':
                    strI8 = c.i(i, parcel);
                    break;
                case '\n':
                    zE = c.E(i, parcel);
                    break;
                case 11:
                    zE2 = c.E(i, parcel);
                    break;
                case '\f':
                    strI9 = c.i(i, parcel);
                    break;
                case '\r':
                    strI10 = c.i(i, parcel);
                    break;
                case 14:
                    strI11 = c.i(i, parcel);
                    break;
                case 15:
                    strI12 = c.i(i, parcel);
                    break;
                case 16:
                    zE3 = c.E(i, parcel);
                    break;
                case 17:
                    strI13 = c.i(i, parcel);
                    break;
                default:
                    c.R(i, parcel);
                    break;
            }
        }
        c.n(iS, parcel);
        return new zzaic(strI, strI2, strI3, strI4, strI5, strI6, strI7, strI8, zE, zE2, strI9, strI10, strI11, strI12, zE3, strI13);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzaic[i];
    }
}
