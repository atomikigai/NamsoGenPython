package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.bumptech.glide.c;
import e6.l3;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbfo implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iS = c.S(parcel);
        int iJ = 0;
        boolean zE = false;
        int iJ2 = 0;
        boolean zE2 = false;
        int iJ3 = 0;
        boolean zE3 = false;
        int iJ4 = 0;
        int iJ5 = 0;
        boolean zE4 = false;
        int iJ6 = 0;
        l3 l3Var = null;
        while (parcel.dataPosition() < iS) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    iJ = c.J(i, parcel);
                    break;
                case 2:
                    zE = c.E(i, parcel);
                    break;
                case 3:
                    iJ2 = c.J(i, parcel);
                    break;
                case 4:
                    zE2 = c.E(i, parcel);
                    break;
                case 5:
                    iJ3 = c.J(i, parcel);
                    break;
                case 6:
                    l3Var = (l3) c.h(parcel, i, l3.CREATOR);
                    break;
                case 7:
                    zE3 = c.E(i, parcel);
                    break;
                case '\b':
                    iJ4 = c.J(i, parcel);
                    break;
                case '\t':
                    iJ5 = c.J(i, parcel);
                    break;
                case '\n':
                    zE4 = c.E(i, parcel);
                    break;
                case 11:
                    iJ6 = c.J(i, parcel);
                    break;
                default:
                    c.R(i, parcel);
                    break;
            }
        }
        c.n(iS, parcel);
        return new zzbfn(iJ, zE, iJ2, zE2, iJ3, l3Var, zE3, iJ4, iJ5, zE4, iJ6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbfn[i];
    }
}
