package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bumptech.glide.c;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbvy implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iS = c.S(parcel);
        Bundle bundleE = null;
        i6.a aVar = null;
        ApplicationInfo applicationInfo = null;
        String strI = null;
        ArrayList arrayListK = null;
        PackageInfo packageInfo = null;
        String strI2 = null;
        String strI3 = null;
        zzfhj zzfhjVar = null;
        String strI4 = null;
        Bundle bundleE2 = null;
        boolean zE = false;
        boolean zE2 = false;
        while (parcel.dataPosition() < iS) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    bundleE = c.e(i, parcel);
                    break;
                case 2:
                    aVar = (i6.a) c.h(parcel, i, i6.a.CREATOR);
                    break;
                case 3:
                    applicationInfo = (ApplicationInfo) c.h(parcel, i, ApplicationInfo.CREATOR);
                    break;
                case 4:
                    strI = c.i(i, parcel);
                    break;
                case 5:
                    arrayListK = c.k(i, parcel);
                    break;
                case 6:
                    packageInfo = (PackageInfo) c.h(parcel, i, PackageInfo.CREATOR);
                    break;
                case 7:
                    strI2 = c.i(i, parcel);
                    break;
                case '\b':
                default:
                    c.R(i, parcel);
                    break;
                case '\t':
                    strI3 = c.i(i, parcel);
                    break;
                case '\n':
                    zzfhjVar = (zzfhj) c.h(parcel, i, zzfhj.CREATOR);
                    break;
                case 11:
                    strI4 = c.i(i, parcel);
                    break;
                case '\f':
                    zE = c.E(i, parcel);
                    break;
                case '\r':
                    zE2 = c.E(i, parcel);
                    break;
                case 14:
                    bundleE2 = c.e(i, parcel);
                    break;
            }
        }
        c.n(iS, parcel);
        return new zzbvx(bundleE, aVar, applicationInfo, strI, arrayListK, packageInfo, strI2, strI3, zzfhjVar, strI4, zE, zE2, bundleE2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbvx[i];
    }
}
