package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.bumptech.glide.c;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfhk implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iS = c.S(parcel);
        int iJ = 0;
        int iJ2 = 0;
        int iJ3 = 0;
        int iJ4 = 0;
        int iJ5 = 0;
        int iJ6 = 0;
        String strI = null;
        while (parcel.dataPosition() < iS) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    iJ = c.J(i, parcel);
                    break;
                case 2:
                    iJ2 = c.J(i, parcel);
                    break;
                case 3:
                    iJ3 = c.J(i, parcel);
                    break;
                case 4:
                    iJ4 = c.J(i, parcel);
                    break;
                case 5:
                    strI = c.i(i, parcel);
                    break;
                case 6:
                    iJ5 = c.J(i, parcel);
                    break;
                case 7:
                    iJ6 = c.J(i, parcel);
                    break;
                default:
                    c.R(i, parcel);
                    break;
            }
        }
        c.n(iS, parcel);
        return new zzfhj(iJ, iJ2, iJ3, iJ4, strI, iJ5, iJ6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzfhj[i];
    }
}
