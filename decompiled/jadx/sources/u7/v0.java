package u7;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.u2f.api.common.RegisterRequestParams;
import com.google.android.gms.internal.ads.zzbbs;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class v0 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8955a;

    public /* synthetic */ v0(int i) {
        this.f8955a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f8955a) {
            case 0:
                int iS = com.bumptech.glide.c.S(parcel);
                ArrayList arrayListM = null;
                while (parcel.dataPosition() < iS) {
                    int i = parcel.readInt();
                    if (((char) i) != 1) {
                        com.bumptech.glide.c.R(i, parcel);
                    } else {
                        arrayListM = com.bumptech.glide.c.m(parcel, i, o0.CREATOR);
                    }
                }
                com.bumptech.glide.c.n(iS, parcel);
                return new n0(arrayListM);
            case 1:
                try {
                    return e.a(parcel.readString());
                } catch (d e) {
                    throw new RuntimeException(e);
                }
            case 2:
                int iS2 = com.bumptech.glide.c.S(parcel);
                int iJ = 0;
                short s10 = 0;
                short s11 = 0;
                while (parcel.dataPosition() < iS2) {
                    int i10 = parcel.readInt();
                    char c10 = (char) i10;
                    if (c10 == 1) {
                        iJ = com.bumptech.glide.c.J(i10, parcel);
                    } else if (c10 == 2) {
                        com.bumptech.glide.c.U(parcel, i10, 4);
                        s10 = (short) parcel.readInt();
                    } else if (c10 != 3) {
                        com.bumptech.glide.c.R(i10, parcel);
                    } else {
                        com.bumptech.glide.c.U(parcel, i10, 4);
                        s11 = (short) parcel.readInt();
                    }
                }
                com.bumptech.glide.c.n(iS2, parcel);
                return new o0(iJ, s10, s11);
            case 3:
                int iS3 = com.bumptech.glide.c.S(parcel);
                n0 n0Var = null;
                w0 w0Var = null;
                h hVar = null;
                x0 x0Var = null;
                while (parcel.dataPosition() < iS3) {
                    int i11 = parcel.readInt();
                    char c11 = (char) i11;
                    if (c11 == 1) {
                        n0Var = (n0) com.bumptech.glide.c.h(parcel, i11, n0.CREATOR);
                    } else if (c11 == 2) {
                        w0Var = (w0) com.bumptech.glide.c.h(parcel, i11, w0.CREATOR);
                    } else if (c11 == 3) {
                        hVar = (h) com.bumptech.glide.c.h(parcel, i11, h.CREATOR);
                    } else if (c11 != 4) {
                        com.bumptech.glide.c.R(i11, parcel);
                    } else {
                        x0Var = (x0) com.bumptech.glide.c.h(parcel, i11, x0.CREATOR);
                    }
                }
                com.bumptech.glide.c.n(iS3, parcel);
                return new g(n0Var, w0Var, hVar, x0Var);
            case 4:
                int iS4 = com.bumptech.glide.c.S(parcel);
                v vVar = null;
                z0 z0Var = null;
                m0 m0Var = null;
                b1 b1Var = null;
                p0 p0Var = null;
                q0 q0Var = null;
                a1 a1Var = null;
                r0 r0Var = null;
                w wVar = null;
                s0 s0Var = null;
                while (parcel.dataPosition() < iS4) {
                    int i12 = parcel.readInt();
                    switch ((char) i12) {
                        case 2:
                            vVar = (v) com.bumptech.glide.c.h(parcel, i12, v.CREATOR);
                            break;
                        case 3:
                            z0Var = (z0) com.bumptech.glide.c.h(parcel, i12, z0.CREATOR);
                            break;
                        case 4:
                            m0Var = (m0) com.bumptech.glide.c.h(parcel, i12, m0.CREATOR);
                            break;
                        case 5:
                            b1Var = (b1) com.bumptech.glide.c.h(parcel, i12, b1.CREATOR);
                            break;
                        case 6:
                            p0Var = (p0) com.bumptech.glide.c.h(parcel, i12, p0.CREATOR);
                            break;
                        case 7:
                            q0Var = (q0) com.bumptech.glide.c.h(parcel, i12, q0.CREATOR);
                            break;
                        case '\b':
                            a1Var = (a1) com.bumptech.glide.c.h(parcel, i12, a1.CREATOR);
                            break;
                        case '\t':
                            r0Var = (r0) com.bumptech.glide.c.h(parcel, i12, r0.CREATOR);
                            break;
                        case '\n':
                            wVar = (w) com.bumptech.glide.c.h(parcel, i12, w.CREATOR);
                            break;
                        case 11:
                            s0Var = (s0) com.bumptech.glide.c.h(parcel, i12, s0.CREATOR);
                            break;
                        default:
                            com.bumptech.glide.c.R(i12, parcel);
                            break;
                    }
                }
                com.bumptech.glide.c.n(iS4, parcel);
                return new f(vVar, z0Var, m0Var, b1Var, p0Var, q0Var, a1Var, r0Var, wVar, s0Var);
            case 5:
                int iS5 = com.bumptech.glide.c.S(parcel);
                boolean zE = false;
                while (parcel.dataPosition() < iS5) {
                    int i13 = parcel.readInt();
                    if (((char) i13) != 1) {
                        com.bumptech.glide.c.R(i13, parcel);
                    } else {
                        zE = com.bumptech.glide.c.E(i13, parcel);
                    }
                }
                com.bumptech.glide.c.n(iS5, parcel);
                return new h(zE);
            case 6:
                int iS6 = com.bumptech.glide.c.S(parcel);
                byte[] bArrF = null;
                byte[] bArrF2 = null;
                while (parcel.dataPosition() < iS6) {
                    int i14 = parcel.readInt();
                    char c12 = (char) i14;
                    if (c12 == 1) {
                        bArrF = com.bumptech.glide.c.f(i14, parcel);
                    } else if (c12 != 2) {
                        com.bumptech.glide.c.R(i14, parcel);
                    } else {
                        bArrF2 = com.bumptech.glide.c.f(i14, parcel);
                    }
                }
                com.bumptech.glide.c.n(iS6, parcel);
                return new w0(bArrF, bArrF2);
            case 7:
                int iS7 = com.bumptech.glide.c.S(parcel);
                byte[] bArrF3 = null;
                boolean zE2 = false;
                while (parcel.dataPosition() < iS7) {
                    int i15 = parcel.readInt();
                    char c13 = (char) i15;
                    if (c13 == 1) {
                        zE2 = com.bumptech.glide.c.E(i15, parcel);
                    } else if (c13 != 2) {
                        com.bumptech.glide.c.R(i15, parcel);
                    } else {
                        bArrF3 = com.bumptech.glide.c.f(i15, parcel);
                    }
                }
                com.bumptech.glide.c.n(iS7, parcel);
                return new x0(bArrF3, zE2);
            case 8:
                int iS8 = com.bumptech.glide.c.S(parcel);
                byte[] bArrF4 = null;
                byte[] bArrF5 = null;
                byte[] bArrF6 = null;
                byte[] bArrF7 = null;
                byte[] bArrF8 = null;
                while (parcel.dataPosition() < iS8) {
                    int i16 = parcel.readInt();
                    char c14 = (char) i16;
                    if (c14 == 2) {
                        bArrF4 = com.bumptech.glide.c.f(i16, parcel);
                    } else if (c14 == 3) {
                        bArrF5 = com.bumptech.glide.c.f(i16, parcel);
                    } else if (c14 == 4) {
                        bArrF6 = com.bumptech.glide.c.f(i16, parcel);
                    } else if (c14 == 5) {
                        bArrF7 = com.bumptech.glide.c.f(i16, parcel);
                    } else if (c14 != 6) {
                        com.bumptech.glide.c.R(i16, parcel);
                    } else {
                        bArrF8 = com.bumptech.glide.c.f(i16, parcel);
                    }
                }
                com.bumptech.glide.c.n(iS8, parcel);
                return new i(bArrF4, bArrF5, bArrF6, bArrF7, bArrF8);
            case 9:
                int iS9 = com.bumptech.glide.c.S(parcel);
                byte[] bArrF9 = null;
                byte[] bArrF10 = null;
                byte[] bArrF11 = null;
                String[] strArrJ = null;
                while (parcel.dataPosition() < iS9) {
                    int i17 = parcel.readInt();
                    char c15 = (char) i17;
                    if (c15 == 2) {
                        bArrF9 = com.bumptech.glide.c.f(i17, parcel);
                    } else if (c15 == 3) {
                        bArrF10 = com.bumptech.glide.c.f(i17, parcel);
                    } else if (c15 == 4) {
                        bArrF11 = com.bumptech.glide.c.f(i17, parcel);
                    } else if (c15 != 5) {
                        com.bumptech.glide.c.R(i17, parcel);
                    } else {
                        strArrJ = com.bumptech.glide.c.j(i17, parcel);
                    }
                }
                com.bumptech.glide.c.n(iS9, parcel);
                return new j(bArrF9, bArrF10, bArrF11, strArrJ);
            case 10:
                int iS10 = com.bumptech.glide.c.S(parcel);
                int iJ2 = 0;
                String strI = null;
                int iJ3 = 0;
                while (parcel.dataPosition() < iS10) {
                    int i18 = parcel.readInt();
                    char c16 = (char) i18;
                    if (c16 == 2) {
                        iJ2 = com.bumptech.glide.c.J(i18, parcel);
                    } else if (c16 == 3) {
                        strI = com.bumptech.glide.c.i(i18, parcel);
                    } else if (c16 != 4) {
                        com.bumptech.glide.c.R(i18, parcel);
                    } else {
                        iJ3 = com.bumptech.glide.c.J(i18, parcel);
                    }
                }
                com.bumptech.glide.c.n(iS10, parcel);
                return new k(iJ2, strI, iJ3);
            case 11:
                int iS11 = com.bumptech.glide.c.S(parcel);
                String strI2 = null;
                Boolean boolF = null;
                String strI3 = null;
                String strI4 = null;
                while (parcel.dataPosition() < iS11) {
                    int i19 = parcel.readInt();
                    char c17 = (char) i19;
                    if (c17 == 2) {
                        strI2 = com.bumptech.glide.c.i(i19, parcel);
                    } else if (c17 == 3) {
                        boolF = com.bumptech.glide.c.F(i19, parcel);
                    } else if (c17 == 4) {
                        strI3 = com.bumptech.glide.c.i(i19, parcel);
                    } else if (c17 != 5) {
                        com.bumptech.glide.c.R(i19, parcel);
                    } else {
                        strI4 = com.bumptech.glide.c.i(i19, parcel);
                    }
                }
                com.bumptech.glide.c.n(iS11, parcel);
                return new m(strI2, boolF, strI3, strI4);
            case 12:
                int iS12 = com.bumptech.glide.c.S(parcel);
                y yVar = null;
                Uri uri = null;
                byte[] bArrF12 = null;
                while (parcel.dataPosition() < iS12) {
                    int i20 = parcel.readInt();
                    char c18 = (char) i20;
                    if (c18 == 2) {
                        yVar = (y) com.bumptech.glide.c.h(parcel, i20, y.CREATOR);
                    } else if (c18 == 3) {
                        uri = (Uri) com.bumptech.glide.c.h(parcel, i20, Uri.CREATOR);
                    } else if (c18 != 4) {
                        com.bumptech.glide.c.R(i20, parcel);
                    } else {
                        bArrF12 = com.bumptech.glide.c.f(i20, parcel);
                    }
                }
                com.bumptech.glide.c.n(iS12, parcel);
                return new n(yVar, uri, bArrF12);
            case 13:
                int iS13 = com.bumptech.glide.c.S(parcel);
                b0 b0Var = null;
                Uri uri2 = null;
                byte[] bArrF13 = null;
                while (parcel.dataPosition() < iS13) {
                    int i21 = parcel.readInt();
                    char c19 = (char) i21;
                    if (c19 == 2) {
                        b0Var = (b0) com.bumptech.glide.c.h(parcel, i21, b0.CREATOR);
                    } else if (c19 == 3) {
                        uri2 = (Uri) com.bumptech.glide.c.h(parcel, i21, Uri.CREATOR);
                    } else if (c19 != 4) {
                        com.bumptech.glide.c.R(i21, parcel);
                    } else {
                        bArrF13 = com.bumptech.glide.c.f(i21, parcel);
                    }
                }
                com.bumptech.glide.c.n(iS13, parcel);
                return new o(b0Var, uri2, bArrF13);
            case 14:
                try {
                    return r.a(parcel.readInt());
                } catch (q e4) {
                    throw new RuntimeException(e4);
                }
            case 15:
                int iS14 = com.bumptech.glide.c.S(parcel);
                byte[] bArrF14 = null;
                byte[] bArrF15 = null;
                byte[] bArrF16 = null;
                long jM = 0;
                while (parcel.dataPosition() < iS14) {
                    int i22 = parcel.readInt();
                    char c20 = (char) i22;
                    if (c20 == 1) {
                        jM = com.bumptech.glide.c.M(i22, parcel);
                    } else if (c20 == 2) {
                        bArrF14 = com.bumptech.glide.c.f(i22, parcel);
                    } else if (c20 == 3) {
                        bArrF15 = com.bumptech.glide.c.f(i22, parcel);
                    } else if (c20 != 4) {
                        com.bumptech.glide.c.R(i22, parcel);
                    } else {
                        bArrF16 = com.bumptech.glide.c.f(i22, parcel);
                    }
                }
                com.bumptech.glide.c.n(iS14, parcel);
                return new y0(jM, bArrF14, bArrF15, bArrF16);
            case 16:
                int iS15 = com.bumptech.glide.c.S(parcel);
                ArrayList arrayListM2 = null;
                while (parcel.dataPosition() < iS15) {
                    int i23 = parcel.readInt();
                    if (((char) i23) != 1) {
                        com.bumptech.glide.c.R(i23, parcel);
                    } else {
                        arrayListM2 = com.bumptech.glide.c.m(parcel, i23, y0.CREATOR);
                    }
                }
                com.bumptech.glide.c.n(iS15, parcel);
                return new z0(arrayListM2);
            case 17:
                int iS16 = com.bumptech.glide.c.S(parcel);
                boolean zE3 = false;
                while (parcel.dataPosition() < iS16) {
                    int i24 = parcel.readInt();
                    if (((char) i24) != 1) {
                        com.bumptech.glide.c.R(i24, parcel);
                    } else {
                        zE3 = com.bumptech.glide.c.E(i24, parcel);
                    }
                }
                com.bumptech.glide.c.n(iS16, parcel);
                return new a1(zE3);
            case 18:
                try {
                    return u.a(parcel.readInt());
                } catch (t e10) {
                    throw new IllegalArgumentException(e10);
                }
            case 19:
                int iS17 = com.bumptech.glide.c.S(parcel);
                String strI5 = null;
                while (parcel.dataPosition() < iS17) {
                    int i25 = parcel.readInt();
                    if (((char) i25) != 2) {
                        com.bumptech.glide.c.R(i25, parcel);
                    } else {
                        strI5 = com.bumptech.glide.c.i(i25, parcel);
                    }
                }
                com.bumptech.glide.c.n(iS17, parcel);
                return new v(strI5);
            case 20:
                int iS18 = com.bumptech.glide.c.S(parcel);
                int iJ4 = 0;
                int iJ5 = 0;
                int iJ6 = 0;
                long jM2 = 0;
                String strI6 = null;
                String strI7 = null;
                while (parcel.dataPosition() < iS18) {
                    int i26 = parcel.readInt();
                    switch ((char) i26) {
                        case 1:
                            iJ4 = com.bumptech.glide.c.J(i26, parcel);
                            break;
                        case 2:
                            jM2 = com.bumptech.glide.c.M(i26, parcel);
                            break;
                        case 3:
                            strI6 = com.bumptech.glide.c.i(i26, parcel);
                            break;
                        case 4:
                            iJ5 = com.bumptech.glide.c.J(i26, parcel);
                            break;
                        case 5:
                            iJ6 = com.bumptech.glide.c.J(i26, parcel);
                            break;
                        case 6:
                            strI7 = com.bumptech.glide.c.i(i26, parcel);
                            break;
                        default:
                            com.bumptech.glide.c.R(i26, parcel);
                            break;
                    }
                }
                com.bumptech.glide.c.n(iS18, parcel);
                return new v6.a(iJ4, jM2, strI6, iJ5, iJ6, strI7);
            case zzbbs.zzt.zzm /* 21 */:
                int iS19 = com.bumptech.glide.c.S(parcel);
                int iJ7 = 0;
                String strI8 = null;
                Account account = null;
                int iJ8 = 0;
                while (parcel.dataPosition() < iS19) {
                    int i27 = parcel.readInt();
                    char c21 = (char) i27;
                    if (c21 == 1) {
                        iJ7 = com.bumptech.glide.c.J(i27, parcel);
                    } else if (c21 == 2) {
                        iJ8 = com.bumptech.glide.c.J(i27, parcel);
                    } else if (c21 == 3) {
                        strI8 = com.bumptech.glide.c.i(i27, parcel);
                    } else if (c21 != 4) {
                        com.bumptech.glide.c.R(i27, parcel);
                    } else {
                        account = (Account) com.bumptech.glide.c.h(parcel, i27, Account.CREATOR);
                    }
                }
                com.bumptech.glide.c.n(iS19, parcel);
                return new v6.b(iJ7, iJ8, strI8, account);
            case 22:
                int iS20 = com.bumptech.glide.c.S(parcel);
                int iJ9 = 0;
                ArrayList arrayListM3 = null;
                while (parcel.dataPosition() < iS20) {
                    int i28 = parcel.readInt();
                    char c22 = (char) i28;
                    if (c22 == 1) {
                        iJ9 = com.bumptech.glide.c.J(i28, parcel);
                    } else if (c22 != 2) {
                        com.bumptech.glide.c.R(i28, parcel);
                    } else {
                        arrayListM3 = com.bumptech.glide.c.m(parcel, i28, v6.a.CREATOR);
                    }
                }
                com.bumptech.glide.c.n(iS20, parcel);
                return new v6.c(arrayListM3, iJ9);
            case 23:
                try {
                    return v7.c.g(parcel.readInt());
                } catch (v7.b e11) {
                    throw new RuntimeException(e11);
                }
            case 24:
                int iS21 = com.bumptech.glide.c.S(parcel);
                String strI9 = null;
                int iJ10 = 0;
                String strI10 = null;
                while (parcel.dataPosition() < iS21) {
                    int i29 = parcel.readInt();
                    char c23 = (char) i29;
                    if (c23 == 2) {
                        iJ10 = com.bumptech.glide.c.J(i29, parcel);
                    } else if (c23 == 3) {
                        strI9 = com.bumptech.glide.c.i(i29, parcel);
                    } else if (c23 != 4) {
                        com.bumptech.glide.c.R(i29, parcel);
                    } else {
                        strI10 = com.bumptech.glide.c.i(i29, parcel);
                    }
                }
                com.bumptech.glide.c.n(iS21, parcel);
                return new v7.c(iJ10, strI9, strI10);
            case 25:
                int iS22 = com.bumptech.glide.c.S(parcel);
                byte[] bArrF17 = null;
                ArrayList arrayListM4 = null;
                int iJ11 = 0;
                String strI11 = null;
                while (parcel.dataPosition() < iS22) {
                    int i30 = parcel.readInt();
                    char c24 = (char) i30;
                    if (c24 == 1) {
                        iJ11 = com.bumptech.glide.c.J(i30, parcel);
                    } else if (c24 == 2) {
                        bArrF17 = com.bumptech.glide.c.f(i30, parcel);
                    } else if (c24 == 3) {
                        strI11 = com.bumptech.glide.c.i(i30, parcel);
                    } else if (c24 != 4) {
                        com.bumptech.glide.c.R(i30, parcel);
                    } else {
                        arrayListM4 = com.bumptech.glide.c.m(parcel, i30, Transport.CREATOR);
                    }
                }
                com.bumptech.glide.c.n(iS22, parcel);
                return new v7.d(iJ11, bArrF17, strI11, arrayListM4);
            case 26:
                try {
                    return v7.f.a(parcel.readString());
                } catch (v7.e e12) {
                    throw new RuntimeException(e12);
                }
            case 27:
                int iS23 = com.bumptech.glide.c.S(parcel);
                String strI12 = null;
                String strI13 = null;
                int iJ12 = 0;
                byte[] bArrF18 = null;
                while (parcel.dataPosition() < iS23) {
                    int i31 = parcel.readInt();
                    char c25 = (char) i31;
                    if (c25 == 1) {
                        iJ12 = com.bumptech.glide.c.J(i31, parcel);
                    } else if (c25 == 2) {
                        strI12 = com.bumptech.glide.c.i(i31, parcel);
                    } else if (c25 == 3) {
                        bArrF18 = com.bumptech.glide.c.f(i31, parcel);
                    } else if (c25 != 4) {
                        com.bumptech.glide.c.R(i31, parcel);
                    } else {
                        strI13 = com.bumptech.glide.c.i(i31, parcel);
                    }
                }
                com.bumptech.glide.c.n(iS23, parcel);
                return new v7.g(strI12, strI13, iJ12, bArrF18);
            case 28:
                int iS24 = com.bumptech.glide.c.S(parcel);
                Integer numK = null;
                Double dG = null;
                Uri uri3 = null;
                ArrayList arrayListM5 = null;
                ArrayList arrayListM6 = null;
                v7.c cVar = null;
                String strI14 = null;
                while (parcel.dataPosition() < iS24) {
                    int i32 = parcel.readInt();
                    switch ((char) i32) {
                        case 2:
                            numK = com.bumptech.glide.c.K(i32, parcel);
                            break;
                        case 3:
                            dG = com.bumptech.glide.c.G(i32, parcel);
                            break;
                        case 4:
                            uri3 = (Uri) com.bumptech.glide.c.h(parcel, i32, Uri.CREATOR);
                            break;
                        case 5:
                            arrayListM5 = com.bumptech.glide.c.m(parcel, i32, v7.g.CREATOR);
                            break;
                        case 6:
                            arrayListM6 = com.bumptech.glide.c.m(parcel, i32, v7.h.CREATOR);
                            break;
                        case 7:
                            cVar = (v7.c) com.bumptech.glide.c.h(parcel, i32, v7.c.CREATOR);
                            break;
                        case '\b':
                            strI14 = com.bumptech.glide.c.i(i32, parcel);
                            break;
                        default:
                            com.bumptech.glide.c.R(i32, parcel);
                            break;
                    }
                }
                com.bumptech.glide.c.n(iS24, parcel);
                return new RegisterRequestParams(numK, dG, uri3, arrayListM5, arrayListM6, cVar, strI14);
            default:
                int iS25 = com.bumptech.glide.c.S(parcel);
                v7.d dVar = null;
                String strI15 = null;
                String strI16 = null;
                while (parcel.dataPosition() < iS25) {
                    int i33 = parcel.readInt();
                    char c26 = (char) i33;
                    if (c26 == 2) {
                        dVar = (v7.d) com.bumptech.glide.c.h(parcel, i33, v7.d.CREATOR);
                    } else if (c26 == 3) {
                        strI15 = com.bumptech.glide.c.i(i33, parcel);
                    } else if (c26 != 4) {
                        com.bumptech.glide.c.R(i33, parcel);
                    } else {
                        strI16 = com.bumptech.glide.c.i(i33, parcel);
                    }
                }
                com.bumptech.glide.c.n(iS25, parcel);
                return new v7.h(dVar, strI15, strI16);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.f8955a) {
            case 0:
                return new n0[i];
            case 1:
                return new e[i];
            case 2:
                return new o0[i];
            case 3:
                return new g[i];
            case 4:
                return new f[i];
            case 5:
                return new h[i];
            case 6:
                return new w0[i];
            case 7:
                return new x0[i];
            case 8:
                return new i[i];
            case 9:
                return new j[i];
            case 10:
                return new k[i];
            case 11:
                return new m[i];
            case 12:
                return new n[i];
            case 13:
                return new o[i];
            case 14:
                return new r[i];
            case 15:
                return new y0[i];
            case 16:
                return new z0[i];
            case 17:
                return new a1[i];
            case 18:
                return new u[i];
            case 19:
                return new v[i];
            case 20:
                return new v6.a[i];
            case zzbbs.zzt.zzm /* 21 */:
                return new v6.b[i];
            case 22:
                return new v6.c[i];
            case 23:
                return new v7.a[i];
            case 24:
                return new v7.c[i];
            case 25:
                return new v7.d[i];
            case 26:
                return new v7.f[i];
            case 27:
                return new v7.g[i];
            case 28:
                return new RegisterRequestParams[i];
            default:
                return new v7.h[i];
        }
    }
}
