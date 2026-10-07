package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Parcel;
import android.os.Parcelable;
import com.bumptech.glide.c;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbuw implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iS = c.S(parcel);
        int iJ = 0;
        boolean zE = false;
        boolean zE2 = false;
        ApplicationInfo applicationInfo = null;
        String strI = null;
        PackageInfo packageInfo = null;
        String strI2 = null;
        String strI3 = null;
        ArrayList arrayListK = null;
        while (parcel.dataPosition() < iS) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    applicationInfo = (ApplicationInfo) c.h(parcel, i, ApplicationInfo.CREATOR);
                    break;
                case 2:
                    strI = c.i(i, parcel);
                    break;
                case 3:
                    packageInfo = (PackageInfo) c.h(parcel, i, PackageInfo.CREATOR);
                    break;
                case 4:
                    strI2 = c.i(i, parcel);
                    break;
                case 5:
                    iJ = c.J(i, parcel);
                    break;
                case 6:
                    strI3 = c.i(i, parcel);
                    break;
                case 7:
                    arrayListK = c.k(i, parcel);
                    break;
                case '\b':
                    zE = c.E(i, parcel);
                    break;
                case '\t':
                    zE2 = c.E(i, parcel);
                    break;
                default:
                    c.R(i, parcel);
                    break;
            }
        }
        c.n(iS, parcel);
        return new zzbuv(applicationInfo, strI, packageInfo, strI2, iJ, strI3, arrayListK, zE, zE2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbuv[i];
    }
}
