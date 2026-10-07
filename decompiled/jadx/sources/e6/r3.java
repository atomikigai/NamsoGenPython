package e6;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.internal.ads.zzbbs;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class r3 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3426a;

    public /* synthetic */ r3(int i) {
        this.f3426a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f3426a) {
            case 0:
                int iS = com.bumptech.glide.c.S(parcel);
                int iJ = 0;
                int iJ2 = 0;
                boolean zE = false;
                int iJ3 = 0;
                int iJ4 = 0;
                boolean zE2 = false;
                boolean zE3 = false;
                boolean zE4 = false;
                boolean zE5 = false;
                boolean zE6 = false;
                boolean zE7 = false;
                boolean zE8 = false;
                boolean zE9 = false;
                String strI = null;
                q3[] q3VarArr = null;
                while (parcel.dataPosition() < iS) {
                    int i = parcel.readInt();
                    switch ((char) i) {
                        case 2:
                            strI = com.bumptech.glide.c.i(i, parcel);
                            break;
                        case 3:
                            iJ = com.bumptech.glide.c.J(i, parcel);
                            break;
                        case 4:
                            iJ2 = com.bumptech.glide.c.J(i, parcel);
                            break;
                        case 5:
                            zE = com.bumptech.glide.c.E(i, parcel);
                            break;
                        case 6:
                            iJ3 = com.bumptech.glide.c.J(i, parcel);
                            break;
                        case 7:
                            iJ4 = com.bumptech.glide.c.J(i, parcel);
                            break;
                        case '\b':
                            q3VarArr = (q3[]) com.bumptech.glide.c.l(parcel, i, q3.CREATOR);
                            break;
                        case '\t':
                            zE2 = com.bumptech.glide.c.E(i, parcel);
                            break;
                        case '\n':
                            zE3 = com.bumptech.glide.c.E(i, parcel);
                            break;
                        case 11:
                            zE4 = com.bumptech.glide.c.E(i, parcel);
                            break;
                        case '\f':
                            zE5 = com.bumptech.glide.c.E(i, parcel);
                            break;
                        case '\r':
                            zE6 = com.bumptech.glide.c.E(i, parcel);
                            break;
                        case 14:
                            zE7 = com.bumptech.glide.c.E(i, parcel);
                            break;
                        case 15:
                            zE8 = com.bumptech.glide.c.E(i, parcel);
                            break;
                        case 16:
                            zE9 = com.bumptech.glide.c.E(i, parcel);
                            break;
                        default:
                            com.bumptech.glide.c.R(i, parcel);
                            break;
                    }
                }
                com.bumptech.glide.c.n(iS, parcel);
                return new q3(strI, iJ, iJ2, zE, iJ3, iJ4, q3VarArr, zE2, zE3, zE4, zE5, zE6, zE7, zE8, zE9);
            case 1:
                int iS2 = com.bumptech.glide.c.S(parcel);
                long jM = 0;
                String strI2 = null;
                int iJ5 = 0;
                int iJ6 = 0;
                while (parcel.dataPosition() < iS2) {
                    int i10 = parcel.readInt();
                    char c10 = (char) i10;
                    if (c10 == 1) {
                        iJ5 = com.bumptech.glide.c.J(i10, parcel);
                    } else if (c10 == 2) {
                        iJ6 = com.bumptech.glide.c.J(i10, parcel);
                    } else if (c10 == 3) {
                        strI2 = com.bumptech.glide.c.i(i10, parcel);
                    } else if (c10 != 4) {
                        com.bumptech.glide.c.R(i10, parcel);
                    } else {
                        jM = com.bumptech.glide.c.M(i10, parcel);
                    }
                }
                com.bumptech.glide.c.n(iS2, parcel);
                return new s3(iJ5, iJ6, jM, strI2);
            case 2:
                int iS3 = com.bumptech.glide.c.S(parcel);
                String strI3 = null;
                h2 h2Var = null;
                Bundle bundleE = null;
                String strI4 = null;
                String strI5 = null;
                String strI6 = null;
                String strI7 = null;
                long jM2 = 0;
                while (parcel.dataPosition() < iS3) {
                    int i11 = parcel.readInt();
                    switch ((char) i11) {
                        case 1:
                            strI3 = com.bumptech.glide.c.i(i11, parcel);
                            break;
                        case 2:
                            jM2 = com.bumptech.glide.c.M(i11, parcel);
                            break;
                        case 3:
                            h2Var = (h2) com.bumptech.glide.c.h(parcel, i11, h2.CREATOR);
                            break;
                        case 4:
                            bundleE = com.bumptech.glide.c.e(i11, parcel);
                            break;
                        case 5:
                            strI4 = com.bumptech.glide.c.i(i11, parcel);
                            break;
                        case 6:
                            strI5 = com.bumptech.glide.c.i(i11, parcel);
                            break;
                        case 7:
                            strI6 = com.bumptech.glide.c.i(i11, parcel);
                            break;
                        case '\b':
                            strI7 = com.bumptech.glide.c.i(i11, parcel);
                            break;
                        default:
                            com.bumptech.glide.c.R(i11, parcel);
                            break;
                    }
                }
                com.bumptech.glide.c.n(iS3, parcel);
                return new t3(strI3, jM2, h2Var, bundleE, strI4, strI5, strI6, strI7);
            case 3:
                int iS4 = com.bumptech.glide.c.S(parcel);
                int iJ7 = 0;
                while (parcel.dataPosition() < iS4) {
                    int i12 = parcel.readInt();
                    if (((char) i12) != 2) {
                        com.bumptech.glide.c.R(i12, parcel);
                    } else {
                        iJ7 = com.bumptech.glide.c.J(i12, parcel);
                    }
                }
                com.bumptech.glide.c.n(iS4, parcel);
                return new u3(iJ7);
            case 4:
                int iS5 = com.bumptech.glide.c.S(parcel);
                Bundle bundleE2 = null;
                int iJ8 = 0;
                int iJ9 = 0;
                while (parcel.dataPosition() < iS5) {
                    int i13 = parcel.readInt();
                    char c11 = (char) i13;
                    if (c11 == 1) {
                        iJ8 = com.bumptech.glide.c.J(i13, parcel);
                    } else if (c11 == 2) {
                        iJ9 = com.bumptech.glide.c.J(i13, parcel);
                    } else if (c11 != 3) {
                        com.bumptech.glide.c.R(i13, parcel);
                    } else {
                        bundleE2 = com.bumptech.glide.c.e(i13, parcel);
                    }
                }
                com.bumptech.glide.c.n(iS5, parcel);
                return new e7.a(iJ8, iJ9, bundleE2);
            case 5:
                int iS6 = com.bumptech.glide.c.S(parcel);
                String strI8 = null;
                GoogleSignInOptions googleSignInOptions = null;
                while (parcel.dataPosition() < iS6) {
                    int i14 = parcel.readInt();
                    char c12 = (char) i14;
                    if (c12 == 2) {
                        strI8 = com.bumptech.glide.c.i(i14, parcel);
                    } else if (c12 != 5) {
                        com.bumptech.glide.c.R(i14, parcel);
                    } else {
                        googleSignInOptions = (GoogleSignInOptions) com.bumptech.glide.c.h(parcel, i14, GoogleSignInOptions.CREATOR);
                    }
                }
                com.bumptech.glide.c.n(iS6, parcel);
                return new SignInConfiguration(strI8, googleSignInOptions);
            case 6:
                int iS7 = com.bumptech.glide.c.S(parcel);
                String strI9 = null;
                String strI10 = null;
                String strI11 = null;
                while (parcel.dataPosition() < iS7) {
                    int i15 = parcel.readInt();
                    char c13 = (char) i15;
                    if (c13 == 1) {
                        strI9 = com.bumptech.glide.c.i(i15, parcel);
                    } else if (c13 == 2) {
                        strI10 = com.bumptech.glide.c.i(i15, parcel);
                    } else if (c13 != 3) {
                        com.bumptech.glide.c.R(i15, parcel);
                    } else {
                        strI11 = com.bumptech.glide.c.i(i15, parcel);
                    }
                }
                com.bumptech.glide.c.n(iS7, parcel);
                return new f6.a(strI9, strI10, strI11);
            case 7:
                int iS8 = com.bumptech.glide.c.S(parcel);
                boolean zE10 = false;
                String strI12 = null;
                String strI13 = null;
                String strI14 = null;
                String strI15 = null;
                String strI16 = null;
                String strI17 = null;
                String strI18 = null;
                Intent intent = null;
                IBinder iBinderI = null;
                while (parcel.dataPosition() < iS8) {
                    int i16 = parcel.readInt();
                    switch ((char) i16) {
                        case 2:
                            strI12 = com.bumptech.glide.c.i(i16, parcel);
                            break;
                        case 3:
                            strI13 = com.bumptech.glide.c.i(i16, parcel);
                            break;
                        case 4:
                            strI14 = com.bumptech.glide.c.i(i16, parcel);
                            break;
                        case 5:
                            strI15 = com.bumptech.glide.c.i(i16, parcel);
                            break;
                        case 6:
                            strI16 = com.bumptech.glide.c.i(i16, parcel);
                            break;
                        case 7:
                            strI17 = com.bumptech.glide.c.i(i16, parcel);
                            break;
                        case '\b':
                            strI18 = com.bumptech.glide.c.i(i16, parcel);
                            break;
                        case '\t':
                            intent = (Intent) com.bumptech.glide.c.h(parcel, i16, Intent.CREATOR);
                            break;
                        case '\n':
                            iBinderI = com.bumptech.glide.c.I(i16, parcel);
                            break;
                        case 11:
                            zE10 = com.bumptech.glide.c.E(i16, parcel);
                            break;
                        default:
                            com.bumptech.glide.c.R(i16, parcel);
                            break;
                    }
                }
                com.bumptech.glide.c.n(iS8, parcel);
                return new g6.e(strI12, strI13, strI14, strI15, strI16, strI17, strI18, intent, iBinderI, zE10);
            case 8:
                int iS9 = com.bumptech.glide.c.S(parcel);
                long jM3 = 0;
                boolean zE11 = false;
                int iJ10 = 0;
                int iJ11 = 0;
                boolean zE12 = false;
                g6.e eVar = null;
                IBinder iBinderI2 = null;
                IBinder iBinderI3 = null;
                IBinder iBinderI4 = null;
                IBinder iBinderI5 = null;
                String strI19 = null;
                String strI20 = null;
                IBinder iBinderI6 = null;
                String strI21 = null;
                i6.a aVar = null;
                String strI22 = null;
                d6.i iVar = null;
                IBinder iBinderI7 = null;
                String strI23 = null;
                String strI24 = null;
                String strI25 = null;
                IBinder iBinderI8 = null;
                IBinder iBinderI9 = null;
                IBinder iBinderI10 = null;
                while (parcel.dataPosition() < iS9) {
                    int i17 = parcel.readInt();
                    switch ((char) i17) {
                        case 2:
                            eVar = (g6.e) com.bumptech.glide.c.h(parcel, i17, g6.e.CREATOR);
                            break;
                        case 3:
                            iBinderI2 = com.bumptech.glide.c.I(i17, parcel);
                            break;
                        case 4:
                            iBinderI3 = com.bumptech.glide.c.I(i17, parcel);
                            break;
                        case 5:
                            iBinderI4 = com.bumptech.glide.c.I(i17, parcel);
                            break;
                        case 6:
                            iBinderI5 = com.bumptech.glide.c.I(i17, parcel);
                            break;
                        case 7:
                            strI19 = com.bumptech.glide.c.i(i17, parcel);
                            break;
                        case '\b':
                            zE11 = com.bumptech.glide.c.E(i17, parcel);
                            break;
                        case '\t':
                            strI20 = com.bumptech.glide.c.i(i17, parcel);
                            break;
                        case '\n':
                            iBinderI6 = com.bumptech.glide.c.I(i17, parcel);
                            break;
                        case 11:
                            iJ10 = com.bumptech.glide.c.J(i17, parcel);
                            break;
                        case '\f':
                            iJ11 = com.bumptech.glide.c.J(i17, parcel);
                            break;
                        case '\r':
                            strI21 = com.bumptech.glide.c.i(i17, parcel);
                            break;
                        case 14:
                            aVar = (i6.a) com.bumptech.glide.c.h(parcel, i17, i6.a.CREATOR);
                            break;
                        case 15:
                        case 20:
                        case zzbbs.zzt.zzm /* 21 */:
                        case 22:
                        case 23:
                        default:
                            com.bumptech.glide.c.R(i17, parcel);
                            break;
                        case 16:
                            strI22 = com.bumptech.glide.c.i(i17, parcel);
                            break;
                        case 17:
                            iVar = (d6.i) com.bumptech.glide.c.h(parcel, i17, d6.i.CREATOR);
                            break;
                        case 18:
                            iBinderI7 = com.bumptech.glide.c.I(i17, parcel);
                            break;
                        case 19:
                            strI23 = com.bumptech.glide.c.i(i17, parcel);
                            break;
                        case 24:
                            strI24 = com.bumptech.glide.c.i(i17, parcel);
                            break;
                        case 25:
                            strI25 = com.bumptech.glide.c.i(i17, parcel);
                            break;
                        case 26:
                            iBinderI8 = com.bumptech.glide.c.I(i17, parcel);
                            break;
                        case 27:
                            iBinderI9 = com.bumptech.glide.c.I(i17, parcel);
                            break;
                        case 28:
                            iBinderI10 = com.bumptech.glide.c.I(i17, parcel);
                            break;
                        case 29:
                            zE12 = com.bumptech.glide.c.E(i17, parcel);
                            break;
                        case 30:
                            jM3 = com.bumptech.glide.c.M(i17, parcel);
                            break;
                    }
                }
                com.bumptech.glide.c.n(iS9, parcel);
                return new AdOverlayInfoParcel(eVar, iBinderI2, iBinderI3, iBinderI4, iBinderI5, strI19, zE11, strI20, iBinderI6, iJ10, iJ11, strI21, aVar, strI22, iVar, iBinderI7, strI23, strI24, strI25, iBinderI8, iBinderI9, iBinderI10, zE12, jM3);
            case 9:
                int iS10 = com.bumptech.glide.c.S(parcel);
                PendingIntent pendingIntent = null;
                int iJ12 = 0;
                int iJ13 = 0;
                String strI26 = null;
                while (parcel.dataPosition() < iS10) {
                    int i18 = parcel.readInt();
                    char c14 = (char) i18;
                    if (c14 == 1) {
                        iJ12 = com.bumptech.glide.c.J(i18, parcel);
                    } else if (c14 == 2) {
                        iJ13 = com.bumptech.glide.c.J(i18, parcel);
                    } else if (c14 == 3) {
                        pendingIntent = (PendingIntent) com.bumptech.glide.c.h(parcel, i18, PendingIntent.CREATOR);
                    } else if (c14 != 4) {
                        com.bumptech.glide.c.R(i18, parcel);
                    } else {
                        strI26 = com.bumptech.glide.c.i(i18, parcel);
                    }
                }
                com.bumptech.glide.c.n(iS10, parcel);
                return new g7.b(iJ12, iJ13, pendingIntent, strI26);
            case 10:
                int iS11 = com.bumptech.glide.c.S(parcel);
                long jM4 = -1;
                int iJ14 = 0;
                String strI27 = null;
                while (parcel.dataPosition() < iS11) {
                    int i19 = parcel.readInt();
                    char c15 = (char) i19;
                    if (c15 == 1) {
                        strI27 = com.bumptech.glide.c.i(i19, parcel);
                    } else if (c15 == 2) {
                        iJ14 = com.bumptech.glide.c.J(i19, parcel);
                    } else if (c15 != 3) {
                        com.bumptech.glide.c.R(i19, parcel);
                    } else {
                        jM4 = com.bumptech.glide.c.M(i19, parcel);
                    }
                }
                com.bumptech.glide.c.n(iS11, parcel);
                return new g7.d(iJ14, jM4, strI27);
            case 11:
                int iS12 = com.bumptech.glide.c.S(parcel);
                boolean zE13 = false;
                boolean zE14 = false;
                boolean zE15 = false;
                boolean zE16 = false;
                String strI28 = null;
                IBinder iBinderI11 = null;
                while (parcel.dataPosition() < iS12) {
                    int i20 = parcel.readInt();
                    switch ((char) i20) {
                        case 1:
                            strI28 = com.bumptech.glide.c.i(i20, parcel);
                            break;
                        case 2:
                            zE13 = com.bumptech.glide.c.E(i20, parcel);
                            break;
                        case 3:
                            zE14 = com.bumptech.glide.c.E(i20, parcel);
                            break;
                        case 4:
                            iBinderI11 = com.bumptech.glide.c.I(i20, parcel);
                            break;
                        case 5:
                            zE15 = com.bumptech.glide.c.E(i20, parcel);
                            break;
                        case 6:
                            zE16 = com.bumptech.glide.c.E(i20, parcel);
                            break;
                        default:
                            com.bumptech.glide.c.R(i20, parcel);
                            break;
                    }
                }
                com.bumptech.glide.c.n(iS12, parcel);
                return new g7.r(strI28, zE13, zE14, iBinderI11, zE15, zE16);
            case 12:
                int iS13 = com.bumptech.glide.c.S(parcel);
                boolean zE17 = false;
                int iJ15 = 0;
                String strI29 = null;
                int iJ16 = 0;
                while (parcel.dataPosition() < iS13) {
                    int i21 = parcel.readInt();
                    char c16 = (char) i21;
                    if (c16 == 1) {
                        zE17 = com.bumptech.glide.c.E(i21, parcel);
                    } else if (c16 == 2) {
                        strI29 = com.bumptech.glide.c.i(i21, parcel);
                    } else if (c16 == 3) {
                        iJ16 = com.bumptech.glide.c.J(i21, parcel);
                    } else if (c16 != 4) {
                        com.bumptech.glide.c.R(i21, parcel);
                    } else {
                        iJ15 = com.bumptech.glide.c.J(i21, parcel);
                    }
                }
                com.bumptech.glide.c.n(iS13, parcel);
                return new g7.s(zE17, strI29, iJ16, iJ15);
            case 13:
                int iS14 = com.bumptech.glide.c.S(parcel);
                boolean zE18 = false;
                String strI30 = null;
                IBinder iBinderI12 = null;
                boolean zE19 = false;
                while (parcel.dataPosition() < iS14) {
                    int i22 = parcel.readInt();
                    char c17 = (char) i22;
                    if (c17 == 1) {
                        strI30 = com.bumptech.glide.c.i(i22, parcel);
                    } else if (c17 == 2) {
                        iBinderI12 = com.bumptech.glide.c.I(i22, parcel);
                    } else if (c17 == 3) {
                        zE18 = com.bumptech.glide.c.E(i22, parcel);
                    } else if (c17 != 4) {
                        com.bumptech.glide.c.R(i22, parcel);
                    } else {
                        zE19 = com.bumptech.glide.c.E(i22, parcel);
                    }
                }
                com.bumptech.glide.c.n(iS14, parcel);
                return new g7.t(strI30, iBinderI12, zE18, zE19);
            case 14:
                g8.b bVar = new g8.b();
                bVar.f4303t = 255;
                bVar.f4305v = -2;
                bVar.f4306w = -2;
                bVar.f4307x = -2;
                bVar.E = Boolean.TRUE;
                bVar.f4296a = parcel.readInt();
                bVar.f4297b = (Integer) parcel.readSerializable();
                bVar.f4298c = (Integer) parcel.readSerializable();
                bVar.f4299d = (Integer) parcel.readSerializable();
                bVar.e = (Integer) parcel.readSerializable();
                bVar.f4300f = (Integer) parcel.readSerializable();
                bVar.f4301r = (Integer) parcel.readSerializable();
                bVar.f4302s = (Integer) parcel.readSerializable();
                bVar.f4303t = parcel.readInt();
                bVar.f4304u = parcel.readString();
                bVar.f4305v = parcel.readInt();
                bVar.f4306w = parcel.readInt();
                bVar.f4307x = parcel.readInt();
                bVar.f4309z = parcel.readString();
                bVar.A = parcel.readString();
                bVar.B = parcel.readInt();
                bVar.D = (Integer) parcel.readSerializable();
                bVar.F = (Integer) parcel.readSerializable();
                bVar.G = (Integer) parcel.readSerializable();
                bVar.H = (Integer) parcel.readSerializable();
                bVar.I = (Integer) parcel.readSerializable();
                bVar.J = (Integer) parcel.readSerializable();
                bVar.K = (Integer) parcel.readSerializable();
                bVar.N = (Integer) parcel.readSerializable();
                bVar.L = (Integer) parcel.readSerializable();
                bVar.M = (Integer) parcel.readSerializable();
                bVar.E = (Boolean) parcel.readSerializable();
                bVar.f4308y = (Locale) parcel.readSerializable();
                bVar.O = (Boolean) parcel.readSerializable();
                return bVar;
            case 15:
                int iS15 = com.bumptech.glide.c.S(parcel);
                Bundle bundleE3 = null;
                while (parcel.dataPosition() < iS15) {
                    int i23 = parcel.readInt();
                    if (((char) i23) != 2) {
                        com.bumptech.glide.c.R(i23, parcel);
                    } else {
                        bundleE3 = com.bumptech.glide.c.e(i23, parcel);
                    }
                }
                com.bumptech.glide.c.n(iS15, parcel);
                return new gb.q(bundleE3);
            case 16:
                int iS16 = com.bumptech.glide.c.S(parcel);
                int iJ17 = 0;
                String strI31 = null;
                while (parcel.dataPosition() < iS16) {
                    int i24 = parcel.readInt();
                    char c18 = (char) i24;
                    if (c18 == 1) {
                        strI31 = com.bumptech.glide.c.i(i24, parcel);
                    } else if (c18 != 2) {
                        com.bumptech.glide.c.R(i24, parcel);
                    } else {
                        iJ17 = com.bumptech.glide.c.J(i24, parcel);
                    }
                }
                com.bumptech.glide.c.n(iS16, parcel);
                return new h6.q(strI31, iJ17);
            case 17:
                int iS17 = com.bumptech.glide.c.S(parcel);
                int iJ18 = 0;
                int iJ19 = 0;
                boolean zE20 = false;
                boolean zE21 = false;
                String strI32 = null;
                while (parcel.dataPosition() < iS17) {
                    int i25 = parcel.readInt();
                    char c19 = (char) i25;
                    if (c19 == 2) {
                        strI32 = com.bumptech.glide.c.i(i25, parcel);
                    } else if (c19 == 3) {
                        iJ18 = com.bumptech.glide.c.J(i25, parcel);
                    } else if (c19 == 4) {
                        iJ19 = com.bumptech.glide.c.J(i25, parcel);
                    } else if (c19 == 5) {
                        zE20 = com.bumptech.glide.c.E(i25, parcel);
                    } else if (c19 != 6) {
                        com.bumptech.glide.c.R(i25, parcel);
                    } else {
                        zE21 = com.bumptech.glide.c.E(i25, parcel);
                    }
                }
                com.bumptech.glide.c.n(iS17, parcel);
                return new i6.a(strI32, iJ18, iJ19, zE20, zE21);
            case 18:
                int iS18 = com.bumptech.glide.c.S(parcel);
                k7.a aVar2 = null;
                int iJ20 = 0;
                while (parcel.dataPosition() < iS18) {
                    int i26 = parcel.readInt();
                    char c20 = (char) i26;
                    if (c20 == 1) {
                        iJ20 = com.bumptech.glide.c.J(i26, parcel);
                    } else if (c20 != 2) {
                        com.bumptech.glide.c.R(i26, parcel);
                    } else {
                        aVar2 = (k7.a) com.bumptech.glide.c.h(parcel, i26, k7.a.CREATOR);
                    }
                }
                com.bumptech.glide.c.n(iS18, parcel);
                return new k7.b(iJ20, aVar2);
            case 19:
                int iS19 = com.bumptech.glide.c.S(parcel);
                ArrayList arrayListM = null;
                int iJ21 = 0;
                while (parcel.dataPosition() < iS19) {
                    int i27 = parcel.readInt();
                    char c21 = (char) i27;
                    if (c21 == 1) {
                        iJ21 = com.bumptech.glide.c.J(i27, parcel);
                    } else if (c21 != 2) {
                        com.bumptech.glide.c.R(i27, parcel);
                    } else {
                        arrayListM = com.bumptech.glide.c.m(parcel, i27, k7.c.CREATOR);
                    }
                }
                com.bumptech.glide.c.n(iS19, parcel);
                return new k7.a(arrayListM, iJ21);
            case 20:
                int iS20 = com.bumptech.glide.c.S(parcel);
                int iJ22 = 0;
                String strI33 = null;
                int iJ23 = 0;
                while (parcel.dataPosition() < iS20) {
                    int i28 = parcel.readInt();
                    char c22 = (char) i28;
                    if (c22 == 1) {
                        iJ22 = com.bumptech.glide.c.J(i28, parcel);
                    } else if (c22 == 2) {
                        strI33 = com.bumptech.glide.c.i(i28, parcel);
                    } else if (c22 != 3) {
                        com.bumptech.glide.c.R(i28, parcel);
                    } else {
                        iJ23 = com.bumptech.glide.c.J(i28, parcel);
                    }
                }
                com.bumptech.glide.c.n(iS20, parcel);
                return new k7.c(iJ22, strI33, iJ23);
            case zzbbs.zzt.zzm /* 21 */:
                l.n0 n0Var = new l.n0(parcel);
                n0Var.f6369a = parcel.readByte() != 0;
                return n0Var;
            case 22:
                int iS21 = com.bumptech.glide.c.S(parcel);
                String strI34 = null;
                int iJ24 = 0;
                l7.a aVar3 = null;
                while (parcel.dataPosition() < iS21) {
                    int i29 = parcel.readInt();
                    char c23 = (char) i29;
                    if (c23 == 1) {
                        iJ24 = com.bumptech.glide.c.J(i29, parcel);
                    } else if (c23 == 2) {
                        strI34 = com.bumptech.glide.c.i(i29, parcel);
                    } else if (c23 != 3) {
                        com.bumptech.glide.c.R(i29, parcel);
                    } else {
                        aVar3 = (l7.a) com.bumptech.glide.c.h(parcel, i29, l7.a.CREATOR);
                    }
                }
                com.bumptech.glide.c.n(iS21, parcel);
                return new l7.g(aVar3, strI34, iJ24);
            case 23:
                int iS22 = com.bumptech.glide.c.S(parcel);
                ArrayList arrayListM2 = null;
                int iJ25 = 0;
                String strI35 = null;
                while (parcel.dataPosition() < iS22) {
                    int i30 = parcel.readInt();
                    char c24 = (char) i30;
                    if (c24 == 1) {
                        iJ25 = com.bumptech.glide.c.J(i30, parcel);
                    } else if (c24 == 2) {
                        arrayListM2 = com.bumptech.glide.c.m(parcel, i30, l7.f.CREATOR);
                    } else if (c24 != 3) {
                        com.bumptech.glide.c.R(i30, parcel);
                    } else {
                        strI35 = com.bumptech.glide.c.i(i30, parcel);
                    }
                }
                com.bumptech.glide.c.n(iS22, parcel);
                return new l7.h(iJ25, strI35, arrayListM2);
            case 24:
                int iS23 = com.bumptech.glide.c.S(parcel);
                String strI36 = null;
                int iJ26 = 0;
                ArrayList arrayListM3 = null;
                while (parcel.dataPosition() < iS23) {
                    int i31 = parcel.readInt();
                    char c25 = (char) i31;
                    if (c25 == 1) {
                        iJ26 = com.bumptech.glide.c.J(i31, parcel);
                    } else if (c25 == 2) {
                        strI36 = com.bumptech.glide.c.i(i31, parcel);
                    } else if (c25 != 3) {
                        com.bumptech.glide.c.R(i31, parcel);
                    } else {
                        arrayListM3 = com.bumptech.glide.c.m(parcel, i31, l7.g.CREATOR);
                    }
                }
                com.bumptech.glide.c.n(iS23, parcel);
                return new l7.f(iJ26, strI36, arrayListM3);
            case 25:
                int iS24 = com.bumptech.glide.c.S(parcel);
                int iJ27 = 0;
                Parcel parcel2 = null;
                l7.h hVar = null;
                while (parcel.dataPosition() < iS24) {
                    int i32 = parcel.readInt();
                    char c26 = (char) i32;
                    if (c26 == 1) {
                        iJ27 = com.bumptech.glide.c.J(i32, parcel);
                    } else if (c26 == 2) {
                        int iO = com.bumptech.glide.c.O(i32, parcel);
                        int iDataPosition = parcel.dataPosition();
                        if (iO == 0) {
                            parcel2 = null;
                        } else {
                            Parcel parcelObtain = Parcel.obtain();
                            parcelObtain.appendFrom(parcel, iDataPosition, iO);
                            parcel.setDataPosition(iDataPosition + iO);
                            parcel2 = parcelObtain;
                        }
                    } else if (c26 != 3) {
                        com.bumptech.glide.c.R(i32, parcel);
                    } else {
                        hVar = (l7.h) com.bumptech.glide.c.h(parcel, i32, l7.h.CREATOR);
                    }
                }
                com.bumptech.glide.c.n(iS24, parcel);
                return new l7.d(iJ27, parcel2, hVar);
            case 26:
                m8.a aVar4 = new m8.a(parcel);
                aVar4.f7072a = ((Integer) parcel.readValue(m8.a.class.getClassLoader())).intValue();
                return aVar4;
            case 27:
                return new ParcelImpl(parcel);
            case 28:
                jc.i.e(parcel, "parcel");
                return new pb.e(parcel.readInt(), parcel.readInt());
            default:
                jc.i.e(parcel, "parcel");
                return new pb.f(parcel.readInt(), parcel.readInt() != 0);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f3426a) {
            case 0:
                return new q3[i];
            case 1:
                return new s3[i];
            case 2:
                return new t3[i];
            case 3:
                return new u3[i];
            case 4:
                return new e7.a[i];
            case 5:
                return new SignInConfiguration[i];
            case 6:
                return new f6.a[i];
            case 7:
                return new g6.e[i];
            case 8:
                return new AdOverlayInfoParcel[i];
            case 9:
                return new g7.b[i];
            case 10:
                return new g7.d[i];
            case 11:
                return new g7.r[i];
            case 12:
                return new g7.s[i];
            case 13:
                return new g7.t[i];
            case 14:
                return new g8.b[i];
            case 15:
                return new gb.q[i];
            case 16:
                return new h6.q[i];
            case 17:
                return new i6.a[i];
            case 18:
                return new k7.b[i];
            case 19:
                return new k7.a[i];
            case 20:
                return new k7.c[i];
            case zzbbs.zzt.zzm /* 21 */:
                return new l.n0[i];
            case 22:
                return new l7.g[i];
            case 23:
                return new l7.h[i];
            case 24:
                return new l7.f[i];
            case 25:
                return new l7.d[i];
            case 26:
                return new m8.a[i];
            case 27:
                return new ParcelImpl[i];
            case 28:
                return new pb.e[i];
            default:
                return new pb.f[i];
        }
    }
}
