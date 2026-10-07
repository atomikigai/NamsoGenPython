package z7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.zzbbs;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11064a;

    public /* synthetic */ d(int i) {
        this.f11064a = i;
    }

    public static void a(q qVar, Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.K(parcel, 2, qVar.f11302a, false);
        com.bumptech.glide.d.J(parcel, 3, qVar.f11303b, i, false);
        com.bumptech.glide.d.K(parcel, 4, qVar.f11304c, false);
        long j4 = qVar.f11305d;
        com.bumptech.glide.d.R(parcel, 5, 8);
        parcel.writeLong(j4);
        com.bumptech.glide.d.Q(iP, parcel);
    }

    public static void b(a3 a3Var, Parcel parcel) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        int i = a3Var.f11014a;
        com.bumptech.glide.d.R(parcel, 1, 4);
        parcel.writeInt(i);
        com.bumptech.glide.d.K(parcel, 2, a3Var.f11015b, false);
        long j4 = a3Var.f11016c;
        com.bumptech.glide.d.R(parcel, 3, 8);
        parcel.writeLong(j4);
        com.bumptech.glide.d.I(parcel, 4, a3Var.f11017d);
        com.bumptech.glide.d.K(parcel, 6, a3Var.e, false);
        com.bumptech.glide.d.K(parcel, 7, a3Var.f11018f, false);
        com.bumptech.glide.d.E(parcel, 8, a3Var.f11019r);
        com.bumptech.glide.d.Q(iP, parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f11064a) {
            case 0:
                int iS = com.bumptech.glide.c.S(parcel);
                String strI = null;
                String strI2 = null;
                a3 a3Var = null;
                String strI3 = null;
                q qVar = null;
                q qVar2 = null;
                q qVar3 = null;
                long jM = 0;
                long jM2 = 0;
                long jM3 = 0;
                boolean zE = false;
                while (parcel.dataPosition() < iS) {
                    int i = parcel.readInt();
                    switch ((char) i) {
                        case 2:
                            strI = com.bumptech.glide.c.i(i, parcel);
                            break;
                        case 3:
                            strI2 = com.bumptech.glide.c.i(i, parcel);
                            break;
                        case 4:
                            a3Var = (a3) com.bumptech.glide.c.h(parcel, i, a3.CREATOR);
                            break;
                        case 5:
                            jM = com.bumptech.glide.c.M(i, parcel);
                            break;
                        case 6:
                            zE = com.bumptech.glide.c.E(i, parcel);
                            break;
                        case 7:
                            strI3 = com.bumptech.glide.c.i(i, parcel);
                            break;
                        case '\b':
                            qVar = (q) com.bumptech.glide.c.h(parcel, i, q.CREATOR);
                            break;
                        case '\t':
                            jM2 = com.bumptech.glide.c.M(i, parcel);
                            break;
                        case '\n':
                            qVar2 = (q) com.bumptech.glide.c.h(parcel, i, q.CREATOR);
                            break;
                        case 11:
                            jM3 = com.bumptech.glide.c.M(i, parcel);
                            break;
                        case '\f':
                            qVar3 = (q) com.bumptech.glide.c.h(parcel, i, q.CREATOR);
                            break;
                        default:
                            com.bumptech.glide.c.R(i, parcel);
                            break;
                    }
                }
                com.bumptech.glide.c.n(iS, parcel);
                return new c(strI, strI2, a3Var, jM, zE, strI3, qVar, jM2, qVar2, jM3, qVar3);
            case 1:
                int iS2 = com.bumptech.glide.c.S(parcel);
                Bundle bundleE = null;
                while (parcel.dataPosition() < iS2) {
                    int i10 = parcel.readInt();
                    if (((char) i10) != 2) {
                        com.bumptech.glide.c.R(i10, parcel);
                    } else {
                        bundleE = com.bumptech.glide.c.e(i10, parcel);
                    }
                }
                com.bumptech.glide.c.n(iS2, parcel);
                return new p(bundleE);
            case 2:
                int iS3 = com.bumptech.glide.c.S(parcel);
                long jM4 = 0;
                String strI4 = null;
                p pVar = null;
                String strI5 = null;
                while (parcel.dataPosition() < iS3) {
                    int i11 = parcel.readInt();
                    char c10 = (char) i11;
                    if (c10 == 2) {
                        strI4 = com.bumptech.glide.c.i(i11, parcel);
                    } else if (c10 == 3) {
                        pVar = (p) com.bumptech.glide.c.h(parcel, i11, p.CREATOR);
                    } else if (c10 == 4) {
                        strI5 = com.bumptech.glide.c.i(i11, parcel);
                    } else if (c10 != 5) {
                        com.bumptech.glide.c.R(i11, parcel);
                    } else {
                        jM4 = com.bumptech.glide.c.M(i11, parcel);
                    }
                }
                com.bumptech.glide.c.n(iS3, parcel);
                return new q(strI4, pVar, strI5, jM4);
            case 3:
                int iS4 = com.bumptech.glide.c.S(parcel);
                String strI6 = null;
                Long lN = null;
                Float fValueOf = null;
                String strI7 = null;
                String strI8 = null;
                Double dG = null;
                long jM5 = 0;
                int iJ = 0;
                while (parcel.dataPosition() < iS4) {
                    int i12 = parcel.readInt();
                    switch ((char) i12) {
                        case 1:
                            iJ = com.bumptech.glide.c.J(i12, parcel);
                            break;
                        case 2:
                            strI6 = com.bumptech.glide.c.i(i12, parcel);
                            break;
                        case 3:
                            jM5 = com.bumptech.glide.c.M(i12, parcel);
                            break;
                        case 4:
                            lN = com.bumptech.glide.c.N(i12, parcel);
                            break;
                        case 5:
                            int iO = com.bumptech.glide.c.O(i12, parcel);
                            if (iO != 0) {
                                com.bumptech.glide.c.T(parcel, iO, 4);
                                fValueOf = Float.valueOf(parcel.readFloat());
                            } else {
                                fValueOf = null;
                            }
                            break;
                        case 6:
                            strI7 = com.bumptech.glide.c.i(i12, parcel);
                            break;
                        case 7:
                            strI8 = com.bumptech.glide.c.i(i12, parcel);
                            break;
                        case '\b':
                            dG = com.bumptech.glide.c.G(i12, parcel);
                            break;
                        default:
                            com.bumptech.glide.c.R(i12, parcel);
                            break;
                    }
                }
                com.bumptech.glide.c.n(iS4, parcel);
                return new a3(iJ, strI6, jM5, lN, fValueOf, strI7, strI8, dG);
            default:
                int iS5 = com.bumptech.glide.c.S(parcel);
                long jM6 = 0;
                long jM7 = 0;
                long jM8 = 0;
                long jM9 = 0;
                long jM10 = 0;
                long jM11 = 0;
                boolean zE2 = false;
                int iJ2 = 0;
                boolean zE3 = false;
                boolean zE4 = false;
                String strI9 = null;
                String strI10 = null;
                String strI11 = null;
                String strI12 = null;
                String strI13 = null;
                String strI14 = null;
                String strI15 = null;
                Boolean boolF = null;
                ArrayList arrayListK = null;
                String strI16 = null;
                String strI17 = null;
                String strI18 = "";
                String strI19 = strI18;
                boolean zE5 = true;
                boolean zE6 = true;
                long jM12 = -2147483648L;
                while (parcel.dataPosition() < iS5) {
                    int i13 = parcel.readInt();
                    switch ((char) i13) {
                        case 2:
                            strI9 = com.bumptech.glide.c.i(i13, parcel);
                            break;
                        case 3:
                            strI10 = com.bumptech.glide.c.i(i13, parcel);
                            break;
                        case 4:
                            strI11 = com.bumptech.glide.c.i(i13, parcel);
                            break;
                        case 5:
                            strI12 = com.bumptech.glide.c.i(i13, parcel);
                            break;
                        case 6:
                            jM6 = com.bumptech.glide.c.M(i13, parcel);
                            break;
                        case 7:
                            jM7 = com.bumptech.glide.c.M(i13, parcel);
                            break;
                        case '\b':
                            strI13 = com.bumptech.glide.c.i(i13, parcel);
                            break;
                        case '\t':
                            zE5 = com.bumptech.glide.c.E(i13, parcel);
                            break;
                        case '\n':
                            zE2 = com.bumptech.glide.c.E(i13, parcel);
                            break;
                        case 11:
                            jM12 = com.bumptech.glide.c.M(i13, parcel);
                            break;
                        case '\f':
                            strI14 = com.bumptech.glide.c.i(i13, parcel);
                            break;
                        case '\r':
                            jM8 = com.bumptech.glide.c.M(i13, parcel);
                            break;
                        case 14:
                            jM9 = com.bumptech.glide.c.M(i13, parcel);
                            break;
                        case 15:
                            iJ2 = com.bumptech.glide.c.J(i13, parcel);
                            break;
                        case 16:
                            zE6 = com.bumptech.glide.c.E(i13, parcel);
                            break;
                        case 17:
                        case 20:
                        default:
                            com.bumptech.glide.c.R(i13, parcel);
                            break;
                        case 18:
                            zE3 = com.bumptech.glide.c.E(i13, parcel);
                            break;
                        case 19:
                            strI15 = com.bumptech.glide.c.i(i13, parcel);
                            break;
                        case zzbbs.zzt.zzm /* 21 */:
                            boolF = com.bumptech.glide.c.F(i13, parcel);
                            break;
                        case 22:
                            jM10 = com.bumptech.glide.c.M(i13, parcel);
                            break;
                        case 23:
                            arrayListK = com.bumptech.glide.c.k(i13, parcel);
                            break;
                        case 24:
                            strI16 = com.bumptech.glide.c.i(i13, parcel);
                            break;
                        case 25:
                            strI18 = com.bumptech.glide.c.i(i13, parcel);
                            break;
                        case 26:
                            strI19 = com.bumptech.glide.c.i(i13, parcel);
                            break;
                        case 27:
                            strI17 = com.bumptech.glide.c.i(i13, parcel);
                            break;
                        case 28:
                            zE4 = com.bumptech.glide.c.E(i13, parcel);
                            break;
                        case 29:
                            jM11 = com.bumptech.glide.c.M(i13, parcel);
                            break;
                    }
                }
                com.bumptech.glide.c.n(iS5, parcel);
                return new f3(strI9, strI10, strI11, strI12, jM6, jM7, strI13, zE5, zE2, jM12, strI14, jM8, jM9, iJ2, zE6, zE3, strI15, boolF, jM10, arrayListK, strI16, strI18, strI19, strI17, zE4, jM11);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.f11064a) {
            case 0:
                return new c[i];
            case 1:
                return new p[i];
            case 2:
                return new q[i];
            case 3:
                return new a3[i];
            default:
                return new f3[i];
        }
    }
}
