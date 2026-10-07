package v7;

import android.app.PendingIntent;
import android.location.Location;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fido.u2f.api.common.SignRequestParams;
import com.google.android.gms.internal.ads.zzbbs;
import com.google.android.gms.internal.location.zzbe;
import com.google.android.gms.internal.p002firebaseauthapi.zzaia;
import com.google.android.gms.internal.p002firebaseauthapi.zzaic;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import java.util.ArrayList;
import java.util.List;
import v9.a0;
import v9.b0;
import v9.d0;
import v9.h0;
import v9.p;
import v9.q;
import v9.t;
import v9.u;
import v9.x;
import v9.y;
import w7.j;
import w7.k;
import w7.l;
import w7.z;
import x1.s;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9206a;

    public /* synthetic */ i(int i) {
        this.f9206a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f9206a) {
            case 0:
                int iS = com.bumptech.glide.c.S(parcel);
                Integer numK = null;
                Double dG = null;
                Uri uri = null;
                byte[] bArrF = null;
                ArrayList arrayListM = null;
                c cVar = null;
                String strI = null;
                while (parcel.dataPosition() < iS) {
                    int i = parcel.readInt();
                    switch ((char) i) {
                        case 2:
                            numK = com.bumptech.glide.c.K(i, parcel);
                            break;
                        case 3:
                            dG = com.bumptech.glide.c.G(i, parcel);
                            break;
                        case 4:
                            uri = (Uri) com.bumptech.glide.c.h(parcel, i, Uri.CREATOR);
                            break;
                        case 5:
                            bArrF = com.bumptech.glide.c.f(i, parcel);
                            break;
                        case 6:
                            arrayListM = com.bumptech.glide.c.m(parcel, i, h.CREATOR);
                            break;
                        case 7:
                            cVar = (c) com.bumptech.glide.c.h(parcel, i, c.CREATOR);
                            break;
                        case '\b':
                            strI = com.bumptech.glide.c.i(i, parcel);
                            break;
                        default:
                            com.bumptech.glide.c.R(i, parcel);
                            break;
                    }
                }
                com.bumptech.glide.c.n(iS, parcel);
                return new SignRequestParams(numK, dG, uri, bArrF, arrayListM, cVar, strI);
            case 1:
                int iS2 = com.bumptech.glide.c.S(parcel);
                String strI2 = null;
                while (parcel.dataPosition() < iS2) {
                    int i10 = parcel.readInt();
                    if (((char) i10) != 1) {
                        com.bumptech.glide.c.R(i10, parcel);
                    } else {
                        strI2 = com.bumptech.glide.c.i(i10, parcel);
                    }
                }
                com.bumptech.glide.c.n(iS2, parcel);
                return new p(strI2);
            case 2:
                int iS3 = com.bumptech.glide.c.S(parcel);
                String strI3 = null;
                String strI4 = null;
                while (parcel.dataPosition() < iS3) {
                    int i11 = parcel.readInt();
                    char c10 = (char) i11;
                    if (c10 == 1) {
                        strI3 = com.bumptech.glide.c.i(i11, parcel);
                    } else if (c10 != 2) {
                        com.bumptech.glide.c.R(i11, parcel);
                    } else {
                        strI4 = com.bumptech.glide.c.i(i11, parcel);
                    }
                }
                com.bumptech.glide.c.n(iS3, parcel);
                return new q(strI3, strI4);
            case 3:
                int iS4 = com.bumptech.glide.c.S(parcel);
                String strI5 = null;
                String strI6 = null;
                String strI7 = null;
                String strI8 = null;
                boolean zE = false;
                while (parcel.dataPosition() < iS4) {
                    int i12 = parcel.readInt();
                    char c11 = (char) i12;
                    if (c11 == 1) {
                        strI5 = com.bumptech.glide.c.i(i12, parcel);
                    } else if (c11 == 2) {
                        strI6 = com.bumptech.glide.c.i(i12, parcel);
                    } else if (c11 == 4) {
                        strI7 = com.bumptech.glide.c.i(i12, parcel);
                    } else if (c11 == 5) {
                        zE = com.bumptech.glide.c.E(i12, parcel);
                    } else if (c11 != 6) {
                        com.bumptech.glide.c.R(i12, parcel);
                    } else {
                        strI8 = com.bumptech.glide.c.i(i12, parcel);
                    }
                }
                com.bumptech.glide.c.n(iS4, parcel);
                return new t(strI5, strI6, strI7, strI8, zE);
            case 4:
                int iS5 = com.bumptech.glide.c.S(parcel);
                String strI9 = null;
                String strI10 = null;
                String strI11 = null;
                long jM = 0;
                while (parcel.dataPosition() < iS5) {
                    int i13 = parcel.readInt();
                    char c12 = (char) i13;
                    if (c12 == 1) {
                        strI9 = com.bumptech.glide.c.i(i13, parcel);
                    } else if (c12 == 2) {
                        strI10 = com.bumptech.glide.c.i(i13, parcel);
                    } else if (c12 == 3) {
                        jM = com.bumptech.glide.c.M(i13, parcel);
                    } else if (c12 != 4) {
                        com.bumptech.glide.c.R(i13, parcel);
                    } else {
                        strI11 = com.bumptech.glide.c.i(i13, parcel);
                    }
                }
                com.bumptech.glide.c.n(iS5, parcel);
                return new x(jM, strI9, strI10, strI11);
            case 5:
                int iS6 = com.bumptech.glide.c.S(parcel);
                String strI12 = null;
                while (parcel.dataPosition() < iS6) {
                    int i14 = parcel.readInt();
                    if (((char) i14) != 1) {
                        com.bumptech.glide.c.R(i14, parcel);
                    } else {
                        strI12 = com.bumptech.glide.c.i(i14, parcel);
                    }
                }
                com.bumptech.glide.c.n(iS6, parcel);
                return new y(strI12);
            case 6:
                int iS7 = com.bumptech.glide.c.S(parcel);
                String strI13 = null;
                String strI14 = null;
                zzaia zzaiaVar = null;
                long jM2 = 0;
                while (parcel.dataPosition() < iS7) {
                    int i15 = parcel.readInt();
                    char c13 = (char) i15;
                    if (c13 == 1) {
                        strI13 = com.bumptech.glide.c.i(i15, parcel);
                    } else if (c13 == 2) {
                        strI14 = com.bumptech.glide.c.i(i15, parcel);
                    } else if (c13 == 3) {
                        jM2 = com.bumptech.glide.c.M(i15, parcel);
                    } else if (c13 != 4) {
                        com.bumptech.glide.c.R(i15, parcel);
                    } else {
                        zzaiaVar = (zzaia) com.bumptech.glide.c.h(parcel, i15, zzaia.CREATOR);
                    }
                }
                com.bumptech.glide.c.n(iS7, parcel);
                return new a0(strI13, strI14, jM2, zzaiaVar);
            case 7:
                int iS8 = com.bumptech.glide.c.S(parcel);
                String strI15 = null;
                String strI16 = null;
                while (parcel.dataPosition() < iS8) {
                    int i16 = parcel.readInt();
                    char c14 = (char) i16;
                    if (c14 == 1) {
                        strI15 = com.bumptech.glide.c.i(i16, parcel);
                    } else if (c14 != 2) {
                        com.bumptech.glide.c.R(i16, parcel);
                    } else {
                        strI16 = com.bumptech.glide.c.i(i16, parcel);
                    }
                }
                com.bumptech.glide.c.n(iS8, parcel);
                return new b0(strI15, strI16);
            case 8:
                int iS9 = com.bumptech.glide.c.S(parcel);
                boolean zE2 = false;
                String strI17 = null;
                String strI18 = null;
                boolean zE3 = false;
                while (parcel.dataPosition() < iS9) {
                    int i17 = parcel.readInt();
                    char c15 = (char) i17;
                    if (c15 == 2) {
                        strI17 = com.bumptech.glide.c.i(i17, parcel);
                    } else if (c15 == 3) {
                        strI18 = com.bumptech.glide.c.i(i17, parcel);
                    } else if (c15 == 4) {
                        zE2 = com.bumptech.glide.c.E(i17, parcel);
                    } else if (c15 != 5) {
                        com.bumptech.glide.c.R(i17, parcel);
                    } else {
                        zE3 = com.bumptech.glide.c.E(i17, parcel);
                    }
                }
                com.bumptech.glide.c.n(iS9, parcel);
                return new d0(strI17, strI18, zE2, zE3);
            case 9:
                int iS10 = com.bumptech.glide.c.S(parcel);
                String strI19 = null;
                String strI20 = null;
                String strI21 = null;
                String strI22 = null;
                String strI23 = null;
                String strI24 = null;
                String strI25 = null;
                boolean zE4 = false;
                boolean zE5 = false;
                int iJ = 0;
                while (parcel.dataPosition() < iS10) {
                    int i18 = parcel.readInt();
                    switch ((char) i18) {
                        case 1:
                            strI19 = com.bumptech.glide.c.i(i18, parcel);
                            break;
                        case 2:
                            strI20 = com.bumptech.glide.c.i(i18, parcel);
                            break;
                        case 3:
                            strI21 = com.bumptech.glide.c.i(i18, parcel);
                            break;
                        case 4:
                            strI22 = com.bumptech.glide.c.i(i18, parcel);
                            break;
                        case 5:
                            zE4 = com.bumptech.glide.c.E(i18, parcel);
                            break;
                        case 6:
                            strI23 = com.bumptech.glide.c.i(i18, parcel);
                            break;
                        case 7:
                            zE5 = com.bumptech.glide.c.E(i18, parcel);
                            break;
                        case '\b':
                            strI24 = com.bumptech.glide.c.i(i18, parcel);
                            break;
                        case '\t':
                            iJ = com.bumptech.glide.c.J(i18, parcel);
                            break;
                        case '\n':
                            strI25 = com.bumptech.glide.c.i(i18, parcel);
                            break;
                        default:
                            com.bumptech.glide.c.R(i18, parcel);
                            break;
                    }
                }
                com.bumptech.glide.c.n(iS10, parcel);
                return new v9.b(strI19, strI20, strI21, strI22, zE4, strI23, zE5, strI24, iJ, strI25);
            case 10:
                int iS11 = com.bumptech.glide.c.S(parcel);
                while (parcel.dataPosition() < iS11) {
                    com.bumptech.glide.c.R(parcel.readInt(), parcel);
                }
                com.bumptech.glide.c.n(iS11, parcel);
                return new u();
            case 11:
                int iS12 = com.bumptech.glide.c.S(parcel);
                String strI26 = null;
                String strI27 = null;
                String strI28 = null;
                zzaic zzaicVar = null;
                String strI29 = null;
                String strI30 = null;
                String strI31 = null;
                while (parcel.dataPosition() < iS12) {
                    int i19 = parcel.readInt();
                    switch ((char) i19) {
                        case 1:
                            strI26 = com.bumptech.glide.c.i(i19, parcel);
                            break;
                        case 2:
                            strI27 = com.bumptech.glide.c.i(i19, parcel);
                            break;
                        case 3:
                            strI28 = com.bumptech.glide.c.i(i19, parcel);
                            break;
                        case 4:
                            zzaicVar = (zzaic) com.bumptech.glide.c.h(parcel, i19, zzaic.CREATOR);
                            break;
                        case 5:
                            strI29 = com.bumptech.glide.c.i(i19, parcel);
                            break;
                        case 6:
                            strI30 = com.bumptech.glide.c.i(i19, parcel);
                            break;
                        case 7:
                            strI31 = com.bumptech.glide.c.i(i19, parcel);
                            break;
                        default:
                            com.bumptech.glide.c.R(i19, parcel);
                            break;
                    }
                }
                com.bumptech.glide.c.n(iS12, parcel);
                return new h0(strI26, strI27, strI28, zzaicVar, strI29, strI30, strI31);
            case 12:
                int iS13 = com.bumptech.glide.c.S(parcel);
                boolean zE6 = false;
                String strI32 = null;
                String strI33 = null;
                String strI34 = null;
                String strI35 = null;
                while (parcel.dataPosition() < iS13) {
                    int i20 = parcel.readInt();
                    char c16 = (char) i20;
                    if (c16 == 1) {
                        strI32 = com.bumptech.glide.c.i(i20, parcel);
                    } else if (c16 == 2) {
                        strI33 = com.bumptech.glide.c.i(i20, parcel);
                    } else if (c16 == 3) {
                        strI34 = com.bumptech.glide.c.i(i20, parcel);
                    } else if (c16 == 4) {
                        strI35 = com.bumptech.glide.c.i(i20, parcel);
                    } else if (c16 != 5) {
                        com.bumptech.glide.c.R(i20, parcel);
                    } else {
                        zE6 = com.bumptech.glide.c.E(i20, parcel);
                    }
                }
                com.bumptech.glide.c.n(iS13, parcel);
                return new v9.e(strI32, strI33, strI34, strI35, zE6);
            case 13:
                int iS14 = com.bumptech.glide.c.S(parcel);
                String strI36 = null;
                while (parcel.dataPosition() < iS14) {
                    int i21 = parcel.readInt();
                    if (((char) i21) != 1) {
                        com.bumptech.glide.c.R(i21, parcel);
                    } else {
                        strI36 = com.bumptech.glide.c.i(i21, parcel);
                    }
                }
                com.bumptech.glide.c.n(iS14, parcel);
                return new v9.f(strI36);
            case 14:
                int iS15 = com.bumptech.glide.c.S(parcel);
                String strI37 = "";
                ArrayList arrayListM2 = null;
                int iJ2 = 0;
                String strI38 = null;
                while (parcel.dataPosition() < iS15) {
                    int i22 = parcel.readInt();
                    char c17 = (char) i22;
                    if (c17 == 1) {
                        arrayListM2 = com.bumptech.glide.c.m(parcel, i22, zzbe.CREATOR);
                    } else if (c17 == 2) {
                        iJ2 = com.bumptech.glide.c.J(i22, parcel);
                    } else if (c17 == 3) {
                        strI37 = com.bumptech.glide.c.i(i22, parcel);
                    } else if (c17 != 4) {
                        com.bumptech.glide.c.R(i22, parcel);
                    } else {
                        strI38 = com.bumptech.glide.c.i(i22, parcel);
                    }
                }
                com.bumptech.glide.c.n(iS15, parcel);
                return new w7.e(arrayListM2, iJ2, strI37, strI38);
            case 15:
                int iS16 = com.bumptech.glide.c.S(parcel);
                int iJ3 = zzbbs.zzq.zzf;
                long jM3 = 0;
                w7.y[] yVarArr = null;
                int iJ4 = 1;
                int iJ5 = 1;
                while (parcel.dataPosition() < iS16) {
                    int i23 = parcel.readInt();
                    char c18 = (char) i23;
                    if (c18 == 1) {
                        iJ4 = com.bumptech.glide.c.J(i23, parcel);
                    } else if (c18 == 2) {
                        iJ5 = com.bumptech.glide.c.J(i23, parcel);
                    } else if (c18 == 3) {
                        jM3 = com.bumptech.glide.c.M(i23, parcel);
                    } else if (c18 == 4) {
                        iJ3 = com.bumptech.glide.c.J(i23, parcel);
                    } else if (c18 != 5) {
                        com.bumptech.glide.c.R(i23, parcel);
                    } else {
                        yVarArr = (w7.y[]) com.bumptech.glide.c.l(parcel, i23, w7.y.CREATOR);
                    }
                }
                com.bumptech.glide.c.n(iS16, parcel);
                LocationAvailability locationAvailability = new LocationAvailability();
                locationAvailability.f2300d = iJ3;
                locationAvailability.f2297a = iJ4;
                locationAvailability.f2298b = iJ5;
                locationAvailability.f2299c = jM3;
                locationAvailability.e = yVarArr;
                return locationAvailability;
            case 16:
                int iS17 = com.bumptech.glide.c.S(parcel);
                int iJ6 = 102;
                long jM4 = 3600000;
                long jM5 = 600000;
                boolean zE7 = false;
                long jM6 = 0;
                float fH = 0.0f;
                int iJ7 = Integer.MAX_VALUE;
                long jM7 = Long.MAX_VALUE;
                boolean zE8 = false;
                while (parcel.dataPosition() < iS17) {
                    int i24 = parcel.readInt();
                    boolean z4 = zE8;
                    switch ((char) i24) {
                        case 1:
                            iJ6 = com.bumptech.glide.c.J(i24, parcel);
                            break;
                        case 2:
                            jM4 = com.bumptech.glide.c.M(i24, parcel);
                            break;
                        case 3:
                            jM5 = com.bumptech.glide.c.M(i24, parcel);
                            break;
                        case 4:
                            zE7 = com.bumptech.glide.c.E(i24, parcel);
                            break;
                        case 5:
                            jM7 = com.bumptech.glide.c.M(i24, parcel);
                            break;
                        case 6:
                            iJ7 = com.bumptech.glide.c.J(i24, parcel);
                            break;
                        case 7:
                            fH = com.bumptech.glide.c.H(i24, parcel);
                            break;
                        case '\b':
                            jM6 = com.bumptech.glide.c.M(i24, parcel);
                            break;
                        case '\t':
                            zE8 = com.bumptech.glide.c.E(i24, parcel);
                            continue;
                        default:
                            com.bumptech.glide.c.R(i24, parcel);
                            break;
                    }
                    zE8 = z4;
                }
                com.bumptech.glide.c.n(iS17, parcel);
                LocationRequest locationRequest = new LocationRequest();
                locationRequest.f2301a = iJ6;
                locationRequest.f2302b = jM4;
                locationRequest.f2303c = jM5;
                locationRequest.f2304d = zE7;
                locationRequest.e = jM7;
                locationRequest.f2305f = iJ7;
                locationRequest.f2306r = fH;
                locationRequest.f2307s = jM6;
                locationRequest.f2308t = zE8;
                return locationRequest;
            case 17:
                int iS18 = com.bumptech.glide.c.S(parcel);
                List listM = LocationResult.f2309b;
                while (parcel.dataPosition() < iS18) {
                    int i25 = parcel.readInt();
                    if (((char) i25) != 1) {
                        com.bumptech.glide.c.R(i25, parcel);
                    } else {
                        listM = com.bumptech.glide.c.m(parcel, i25, Location.CREATOR);
                    }
                }
                com.bumptech.glide.c.n(iS18, parcel);
                return new LocationResult(listM);
            case 18:
                int iS19 = com.bumptech.glide.c.S(parcel);
                String strI39 = "";
                String strI40 = "";
                String strI41 = strI40;
                while (parcel.dataPosition() < iS19) {
                    int i26 = parcel.readInt();
                    char c19 = (char) i26;
                    if (c19 == 1) {
                        strI40 = com.bumptech.glide.c.i(i26, parcel);
                    } else if (c19 == 2) {
                        strI41 = com.bumptech.glide.c.i(i26, parcel);
                    } else if (c19 != 5) {
                        com.bumptech.glide.c.R(i26, parcel);
                    } else {
                        strI39 = com.bumptech.glide.c.i(i26, parcel);
                    }
                }
                com.bumptech.glide.c.n(iS19, parcel);
                return new w7.x(strI39, strI40, strI41);
            case 19:
                int iS20 = com.bumptech.glide.c.S(parcel);
                ArrayList arrayListM3 = null;
                boolean zE9 = false;
                boolean zE10 = false;
                w7.x xVar = null;
                while (parcel.dataPosition() < iS20) {
                    int i27 = parcel.readInt();
                    char c20 = (char) i27;
                    if (c20 == 1) {
                        arrayListM3 = com.bumptech.glide.c.m(parcel, i27, LocationRequest.CREATOR);
                    } else if (c20 == 2) {
                        zE9 = com.bumptech.glide.c.E(i27, parcel);
                    } else if (c20 == 3) {
                        zE10 = com.bumptech.glide.c.E(i27, parcel);
                    } else if (c20 != 5) {
                        com.bumptech.glide.c.R(i27, parcel);
                    } else {
                        xVar = (w7.x) com.bumptech.glide.c.h(parcel, i27, w7.x.CREATOR);
                    }
                }
                com.bumptech.glide.c.n(iS20, parcel);
                return new w7.i(arrayListM3, zE9, zE10, xVar);
            case 20:
                int iS21 = com.bumptech.glide.c.S(parcel);
                Status status = null;
                k kVar = null;
                while (parcel.dataPosition() < iS21) {
                    int i28 = parcel.readInt();
                    char c21 = (char) i28;
                    if (c21 == 1) {
                        status = (Status) com.bumptech.glide.c.h(parcel, i28, Status.CREATOR);
                    } else if (c21 != 2) {
                        com.bumptech.glide.c.R(i28, parcel);
                    } else {
                        kVar = (k) com.bumptech.glide.c.h(parcel, i28, k.CREATOR);
                    }
                }
                com.bumptech.glide.c.n(iS21, parcel);
                return new j(status, kVar);
            case zzbbs.zzt.zzm /* 21 */:
                int iS22 = com.bumptech.glide.c.S(parcel);
                boolean zE11 = false;
                boolean zE12 = false;
                boolean zE13 = false;
                boolean zE14 = false;
                boolean zE15 = false;
                boolean zE16 = false;
                while (parcel.dataPosition() < iS22) {
                    int i29 = parcel.readInt();
                    switch ((char) i29) {
                        case 1:
                            zE11 = com.bumptech.glide.c.E(i29, parcel);
                            break;
                        case 2:
                            zE12 = com.bumptech.glide.c.E(i29, parcel);
                            break;
                        case 3:
                            zE13 = com.bumptech.glide.c.E(i29, parcel);
                            break;
                        case 4:
                            zE14 = com.bumptech.glide.c.E(i29, parcel);
                            break;
                        case 5:
                            zE15 = com.bumptech.glide.c.E(i29, parcel);
                            break;
                        case 6:
                            zE16 = com.bumptech.glide.c.E(i29, parcel);
                            break;
                        default:
                            com.bumptech.glide.c.R(i29, parcel);
                            break;
                    }
                }
                com.bumptech.glide.c.n(iS22, parcel);
                return new k(zE11, zE12, zE13, zE14, zE15, zE16);
            case 22:
                int iS23 = com.bumptech.glide.c.S(parcel);
                int iJ8 = 1;
                int iJ9 = 1;
                long jM8 = -1;
                long jM9 = -1;
                while (parcel.dataPosition() < iS23) {
                    int i30 = parcel.readInt();
                    char c22 = (char) i30;
                    if (c22 == 1) {
                        iJ8 = com.bumptech.glide.c.J(i30, parcel);
                    } else if (c22 == 2) {
                        iJ9 = com.bumptech.glide.c.J(i30, parcel);
                    } else if (c22 == 3) {
                        jM8 = com.bumptech.glide.c.M(i30, parcel);
                    } else if (c22 != 4) {
                        com.bumptech.glide.c.R(i30, parcel);
                    } else {
                        jM9 = com.bumptech.glide.c.M(i30, parcel);
                    }
                }
                com.bumptech.glide.c.n(iS23, parcel);
                return new w7.y(iJ8, iJ9, jM8, jM9);
            case 23:
                int iS24 = com.bumptech.glide.c.S(parcel);
                String strI42 = "";
                ArrayList arrayListK = null;
                PendingIntent pendingIntent = null;
                while (parcel.dataPosition() < iS24) {
                    int i31 = parcel.readInt();
                    char c23 = (char) i31;
                    if (c23 == 1) {
                        arrayListK = com.bumptech.glide.c.k(i31, parcel);
                    } else if (c23 == 2) {
                        pendingIntent = (PendingIntent) com.bumptech.glide.c.h(parcel, i31, PendingIntent.CREATOR);
                    } else if (c23 != 3) {
                        com.bumptech.glide.c.R(i31, parcel);
                    } else {
                        strI42 = com.bumptech.glide.c.i(i31, parcel);
                    }
                }
                com.bumptech.glide.c.n(iS24, parcel);
                return new z(arrayListK, pendingIntent, strI42);
            case 24:
                int iS25 = com.bumptech.glide.c.S(parcel);
                ArrayList arrayListM4 = null;
                int iJ10 = 0;
                while (parcel.dataPosition() < iS25) {
                    int i32 = parcel.readInt();
                    char c24 = (char) i32;
                    if (c24 == 1) {
                        arrayListM4 = com.bumptech.glide.c.m(parcel, i32, w7.a0.CREATOR);
                    } else if (c24 != 2) {
                        com.bumptech.glide.c.R(i32, parcel);
                    } else {
                        iJ10 = com.bumptech.glide.c.J(i32, parcel);
                    }
                }
                com.bumptech.glide.c.n(iS25, parcel);
                return new l(arrayListM4, iJ10);
            case 25:
                int iS26 = com.bumptech.glide.c.S(parcel);
                int iJ11 = 0;
                int iJ12 = 0;
                int iJ13 = 0;
                int iJ14 = 0;
                while (parcel.dataPosition() < iS26) {
                    int i33 = parcel.readInt();
                    char c25 = (char) i33;
                    if (c25 == 1) {
                        iJ11 = com.bumptech.glide.c.J(i33, parcel);
                    } else if (c25 == 2) {
                        iJ12 = com.bumptech.glide.c.J(i33, parcel);
                    } else if (c25 == 3) {
                        iJ13 = com.bumptech.glide.c.J(i33, parcel);
                    } else if (c25 != 4) {
                        com.bumptech.glide.c.R(i33, parcel);
                    } else {
                        iJ14 = com.bumptech.glide.c.J(i33, parcel);
                    }
                }
                com.bumptech.glide.c.n(iS26, parcel);
                return new w7.a0(iJ11, iJ12, iJ13, iJ14);
            case 26:
                int iS27 = com.bumptech.glide.c.S(parcel);
                int iJ15 = 0;
                int iJ16 = 0;
                while (parcel.dataPosition() < iS27) {
                    int i34 = parcel.readInt();
                    char c26 = (char) i34;
                    if (c26 == 1) {
                        iJ15 = com.bumptech.glide.c.J(i34, parcel);
                    } else if (c26 != 2) {
                        com.bumptech.glide.c.R(i34, parcel);
                    } else {
                        iJ16 = com.bumptech.glide.c.J(i34, parcel);
                    }
                }
                com.bumptech.glide.c.n(iS27, parcel);
                return new w7.b(iJ15, iJ16);
            case 27:
                int iS28 = com.bumptech.glide.c.S(parcel);
                ArrayList arrayListM5 = null;
                String strI43 = null;
                ArrayList arrayListM6 = null;
                String strI44 = null;
                while (parcel.dataPosition() < iS28) {
                    int i35 = parcel.readInt();
                    char c27 = (char) i35;
                    if (c27 == 1) {
                        arrayListM5 = com.bumptech.glide.c.m(parcel, i35, w7.b.CREATOR);
                    } else if (c27 == 2) {
                        strI43 = com.bumptech.glide.c.i(i35, parcel);
                    } else if (c27 == 3) {
                        arrayListM6 = com.bumptech.glide.c.m(parcel, i35, com.google.android.gms.common.internal.g.CREATOR);
                    } else if (c27 != 4) {
                        com.bumptech.glide.c.R(i35, parcel);
                    } else {
                        strI44 = com.bumptech.glide.c.i(i35, parcel);
                    }
                }
                com.bumptech.glide.c.n(iS28, parcel);
                return new w7.c(arrayListM5, strI43, arrayListM6, strI44);
            case 28:
                int iS29 = com.bumptech.glide.c.S(parcel);
                boolean zE17 = true;
                long jM10 = 50;
                float fH2 = 0.0f;
                long jM11 = Long.MAX_VALUE;
                int iJ17 = Integer.MAX_VALUE;
                while (parcel.dataPosition() < iS29) {
                    int i36 = parcel.readInt();
                    char c28 = (char) i36;
                    if (c28 == 1) {
                        zE17 = com.bumptech.glide.c.E(i36, parcel);
                    } else if (c28 == 2) {
                        jM10 = com.bumptech.glide.c.M(i36, parcel);
                    } else if (c28 == 3) {
                        fH2 = com.bumptech.glide.c.H(i36, parcel);
                    } else if (c28 == 4) {
                        jM11 = com.bumptech.glide.c.M(i36, parcel);
                    } else if (c28 != 5) {
                        com.bumptech.glide.c.R(i36, parcel);
                    } else {
                        iJ17 = com.bumptech.glide.c.J(i36, parcel);
                    }
                }
                com.bumptech.glide.c.n(iS29, parcel);
                return new w7.b0(zE17, jM10, fH2, jM11, iJ17);
            default:
                s sVar = new s();
                sVar.f10190a = parcel.readInt();
                sVar.f10191b = parcel.readInt();
                sVar.f10192c = parcel.readInt() == 1;
                return sVar;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f9206a) {
            case 0:
                return new SignRequestParams[i];
            case 1:
                return new p[i];
            case 2:
                return new q[i];
            case 3:
                return new t[i];
            case 4:
                return new x[i];
            case 5:
                return new y[i];
            case 6:
                return new a0[i];
            case 7:
                return new b0[i];
            case 8:
                return new d0[i];
            case 9:
                return new v9.b[i];
            case 10:
                return new u[i];
            case 11:
                return new h0[i];
            case 12:
                return new v9.e[i];
            case 13:
                return new v9.f[i];
            case 14:
                return new w7.e[i];
            case 15:
                return new LocationAvailability[i];
            case 16:
                return new LocationRequest[i];
            case 17:
                return new LocationResult[i];
            case 18:
                return new w7.x[i];
            case 19:
                return new w7.i[i];
            case 20:
                return new j[i];
            case zzbbs.zzt.zzm /* 21 */:
                return new k[i];
            case 22:
                return new w7.y[i];
            case 23:
                return new z[i];
            case 24:
                return new l[i];
            case 25:
                return new w7.a0[i];
            case 26:
                return new w7.b[i];
            case 27:
                return new w7.c[i];
            case 28:
                return new w7.b0[i];
            default:
                return new s[i];
        }
    }
}
