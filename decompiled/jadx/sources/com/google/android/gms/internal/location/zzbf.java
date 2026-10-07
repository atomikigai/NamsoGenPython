package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.bumptech.glide.c;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbf implements Parcelable.Creator<zzbe> {
    @Override // android.os.Parcelable.Creator
    public final zzbe createFromParcel(Parcel parcel) {
        int iS = c.S(parcel);
        String strI = null;
        int iJ = 0;
        short s10 = 0;
        int iJ2 = 0;
        double d10 = 0.0d;
        double d11 = 0.0d;
        float fH = 0.0f;
        long jM = 0;
        int iJ3 = -1;
        while (parcel.dataPosition() < iS) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    strI = c.i(i, parcel);
                    break;
                case 2:
                    jM = c.M(i, parcel);
                    break;
                case 3:
                    c.U(parcel, i, 4);
                    s10 = (short) parcel.readInt();
                    break;
                case 4:
                    c.U(parcel, i, 8);
                    d10 = parcel.readDouble();
                    break;
                case 5:
                    c.U(parcel, i, 8);
                    d11 = parcel.readDouble();
                    break;
                case 6:
                    fH = c.H(i, parcel);
                    break;
                case 7:
                    iJ = c.J(i, parcel);
                    break;
                case '\b':
                    iJ2 = c.J(i, parcel);
                    break;
                case '\t':
                    iJ3 = c.J(i, parcel);
                    break;
                default:
                    c.R(i, parcel);
                    break;
            }
        }
        c.n(iS, parcel);
        return new zzbe(strI, iJ, s10, d10, d11, fH, jM, iJ2, iJ3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzbe[] newArray(int i) {
        return new zzbe[i];
    }
}
