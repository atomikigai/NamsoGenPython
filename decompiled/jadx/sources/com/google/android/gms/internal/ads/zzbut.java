package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.webkit.TracingConfig;
import com.bumptech.glide.c;
import e6.m2;
import e6.o3;
import e6.q3;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbut implements Parcelable.Creator {
    public static final zzbus zza(Parcel parcel) {
        int iS = c.S(parcel);
        float fH = 0.0f;
        float fH2 = 0.0f;
        long jM = 0;
        long jM2 = 0;
        int iJ = 0;
        Bundle bundleE = null;
        o3 o3Var = null;
        q3 q3Var = null;
        String strI = null;
        ApplicationInfo applicationInfo = null;
        PackageInfo packageInfo = null;
        String strI2 = null;
        String strI3 = null;
        String strI4 = null;
        i6.a aVar = null;
        Bundle bundleE2 = null;
        int iJ2 = 0;
        ArrayList arrayListK = null;
        Bundle bundleE3 = null;
        boolean zE = false;
        int iJ3 = 0;
        int iJ4 = 0;
        String strI5 = null;
        String strI6 = null;
        ArrayList arrayListK2 = null;
        String strI7 = null;
        zzbfn zzbfnVar = null;
        ArrayList arrayListK3 = null;
        String strI8 = null;
        boolean zE2 = false;
        int iJ5 = 0;
        int iJ6 = 0;
        boolean zE3 = false;
        String strI9 = null;
        String strI10 = null;
        boolean zE4 = false;
        int iJ7 = 0;
        Bundle bundleE4 = null;
        String strI11 = null;
        m2 m2Var = null;
        boolean zE5 = false;
        Bundle bundleE5 = null;
        String strI12 = null;
        String strI13 = null;
        String strI14 = null;
        boolean zE6 = false;
        ArrayList arrayList = null;
        String strI15 = null;
        ArrayList arrayListK4 = null;
        int iJ8 = 0;
        boolean zE7 = false;
        boolean zE8 = false;
        boolean zE9 = false;
        ArrayList arrayListK5 = null;
        String strI16 = null;
        zzbmb zzbmbVar = null;
        String strI17 = null;
        Bundle bundleE6 = null;
        while (parcel.dataPosition() < iS) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    iJ = c.J(i, parcel);
                    break;
                case 2:
                    bundleE = c.e(i, parcel);
                    break;
                case 3:
                    o3Var = (o3) c.h(parcel, i, o3.CREATOR);
                    break;
                case 4:
                    q3Var = (q3) c.h(parcel, i, q3.CREATOR);
                    break;
                case 5:
                    strI = c.i(i, parcel);
                    break;
                case 6:
                    applicationInfo = (ApplicationInfo) c.h(parcel, i, ApplicationInfo.CREATOR);
                    break;
                case 7:
                    packageInfo = (PackageInfo) c.h(parcel, i, PackageInfo.CREATOR);
                    break;
                case '\b':
                    strI2 = c.i(i, parcel);
                    break;
                case '\t':
                    strI3 = c.i(i, parcel);
                    break;
                case '\n':
                    strI4 = c.i(i, parcel);
                    break;
                case 11:
                    aVar = (i6.a) c.h(parcel, i, i6.a.CREATOR);
                    break;
                case '\f':
                    bundleE2 = c.e(i, parcel);
                    break;
                case '\r':
                    iJ2 = c.J(i, parcel);
                    break;
                case 14:
                    arrayListK = c.k(i, parcel);
                    break;
                case 15:
                    bundleE3 = c.e(i, parcel);
                    break;
                case 16:
                    zE = c.E(i, parcel);
                    break;
                case 17:
                case 22:
                case 23:
                case 24:
                case TracingConfig.CATEGORIES_JAVASCRIPT_AND_RENDERING /* 32 */:
                case '&':
                case '>':
                default:
                    c.R(i, parcel);
                    break;
                case 18:
                    iJ3 = c.J(i, parcel);
                    break;
                case 19:
                    iJ4 = c.J(i, parcel);
                    break;
                case 20:
                    fH = c.H(i, parcel);
                    break;
                case zzbbs.zzt.zzm /* 21 */:
                    strI5 = c.i(i, parcel);
                    break;
                case 25:
                    jM = c.M(i, parcel);
                    break;
                case 26:
                    strI6 = c.i(i, parcel);
                    break;
                case 27:
                    arrayListK2 = c.k(i, parcel);
                    break;
                case 28:
                    strI7 = c.i(i, parcel);
                    break;
                case 29:
                    zzbfnVar = (zzbfn) c.h(parcel, i, zzbfn.CREATOR);
                    break;
                case 30:
                    arrayListK3 = c.k(i, parcel);
                    break;
                case 31:
                    jM2 = c.M(i, parcel);
                    break;
                case '!':
                    strI8 = c.i(i, parcel);
                    break;
                case '\"':
                    fH2 = c.H(i, parcel);
                    break;
                case '#':
                    iJ5 = c.J(i, parcel);
                    break;
                case '$':
                    iJ6 = c.J(i, parcel);
                    break;
                case '%':
                    zE3 = c.E(i, parcel);
                    break;
                case '\'':
                    strI9 = c.i(i, parcel);
                    break;
                case '(':
                    zE2 = c.E(i, parcel);
                    break;
                case ')':
                    strI10 = c.i(i, parcel);
                    break;
                case '*':
                    zE4 = c.E(i, parcel);
                    break;
                case '+':
                    iJ7 = c.J(i, parcel);
                    break;
                case ',':
                    bundleE4 = c.e(i, parcel);
                    break;
                case '-':
                    strI11 = c.i(i, parcel);
                    break;
                case '.':
                    m2Var = (m2) c.h(parcel, i, m2.CREATOR);
                    break;
                case '/':
                    zE5 = c.E(i, parcel);
                    break;
                case '0':
                    bundleE5 = c.e(i, parcel);
                    break;
                case '1':
                    strI12 = c.i(i, parcel);
                    break;
                case '2':
                    strI13 = c.i(i, parcel);
                    break;
                case '3':
                    strI14 = c.i(i, parcel);
                    break;
                case '4':
                    zE6 = c.E(i, parcel);
                    break;
                case '5':
                    int iO = c.O(i, parcel);
                    int iDataPosition = parcel.dataPosition();
                    if (iO == 0) {
                        arrayList = null;
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        int i10 = parcel.readInt();
                        for (int i11 = 0; i11 < i10; i11++) {
                            arrayList2.add(Integer.valueOf(parcel.readInt()));
                        }
                        parcel.setDataPosition(iDataPosition + iO);
                        arrayList = arrayList2;
                    }
                    break;
                case '6':
                    strI15 = c.i(i, parcel);
                    break;
                case '7':
                    arrayListK4 = c.k(i, parcel);
                    break;
                case '8':
                    iJ8 = c.J(i, parcel);
                    break;
                case '9':
                    zE7 = c.E(i, parcel);
                    break;
                case ':':
                    zE8 = c.E(i, parcel);
                    break;
                case ';':
                    zE9 = c.E(i, parcel);
                    break;
                case '<':
                    arrayListK5 = c.k(i, parcel);
                    break;
                case '=':
                    strI16 = c.i(i, parcel);
                    break;
                case '?':
                    zzbmbVar = (zzbmb) c.h(parcel, i, zzbmb.CREATOR);
                    break;
                case TracingConfig.CATEGORIES_FRAME_VIEWER /* 64 */:
                    strI17 = c.i(i, parcel);
                    break;
                case 'A':
                    bundleE6 = c.e(i, parcel);
                    break;
            }
        }
        c.n(iS, parcel);
        return new zzbus(iJ, bundleE, o3Var, q3Var, strI, applicationInfo, packageInfo, strI2, strI3, strI4, aVar, bundleE2, iJ2, arrayListK, bundleE3, zE, iJ3, iJ4, fH, strI5, jM, strI6, arrayListK2, strI7, zzbfnVar, arrayListK3, jM2, strI8, fH2, zE2, iJ5, iJ6, zE3, strI9, strI10, zE4, iJ7, bundleE4, strI11, m2Var, zE5, bundleE5, strI12, strI13, strI14, zE6, arrayList, strI15, arrayListK4, iJ8, zE7, zE8, zE9, arrayListK5, strI16, zzbmbVar, strI17, bundleE6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zza(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbus[i];
    }
}
