package w9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzahb;
import java.util.ArrayList;
import v9.h0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9805a;

    public /* synthetic */ b(int i) {
        this.f9805a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f9805a) {
            case 0:
                int iS = com.bumptech.glide.c.S(parcel);
                long jM = 0;
                long jM2 = 0;
                while (parcel.dataPosition() < iS) {
                    int i = parcel.readInt();
                    char c10 = (char) i;
                    if (c10 == 1) {
                        jM = com.bumptech.glide.c.M(i, parcel);
                    } else if (c10 != 2) {
                        com.bumptech.glide.c.R(i, parcel);
                    } else {
                        jM2 = com.bumptech.glide.c.M(i, parcel);
                    }
                }
                com.bumptech.glide.c.n(iS, parcel);
                return new e0(jM, jM2);
            case 1:
                int iS2 = com.bumptech.glide.c.S(parcel);
                String strI = null;
                String strI2 = null;
                ArrayList arrayListM = null;
                ArrayList arrayListM2 = null;
                d0 d0Var = null;
                while (parcel.dataPosition() < iS2) {
                    int i10 = parcel.readInt();
                    char c11 = (char) i10;
                    if (c11 == 1) {
                        strI = com.bumptech.glide.c.i(i10, parcel);
                    } else if (c11 == 2) {
                        strI2 = com.bumptech.glide.c.i(i10, parcel);
                    } else if (c11 == 3) {
                        arrayListM = com.bumptech.glide.c.m(parcel, i10, v9.x.CREATOR);
                    } else if (c11 == 4) {
                        arrayListM2 = com.bumptech.glide.c.m(parcel, i10, v9.a0.CREATOR);
                    } else if (c11 != 5) {
                        com.bumptech.glide.c.R(i10, parcel);
                    } else {
                        d0Var = (d0) com.bumptech.glide.c.h(parcel, i10, d0.CREATOR);
                    }
                }
                com.bumptech.glide.c.n(iS2, parcel);
                c cVar = new c();
                cVar.f9814a = strI;
                cVar.f9815b = strI2;
                cVar.f9816c = arrayListM;
                cVar.f9817d = arrayListM2;
                cVar.e = d0Var;
                return cVar;
            case 2:
                int iS3 = com.bumptech.glide.c.S(parcel);
                ArrayList arrayListM3 = null;
                ArrayList arrayListM4 = null;
                while (parcel.dataPosition() < iS3) {
                    int i11 = parcel.readInt();
                    char c12 = (char) i11;
                    if (c12 == 1) {
                        arrayListM3 = com.bumptech.glide.c.m(parcel, i11, v9.x.CREATOR);
                    } else if (c12 != 2) {
                        com.bumptech.glide.c.R(i11, parcel);
                    } else {
                        arrayListM4 = com.bumptech.glide.c.m(parcel, i11, v9.a0.CREATOR);
                    }
                }
                com.bumptech.glide.c.n(iS3, parcel);
                return new m(arrayListM3, arrayListM4);
            case 3:
                int iS4 = com.bumptech.glide.c.S(parcel);
                boolean zE = false;
                String strI3 = null;
                String strI4 = null;
                while (parcel.dataPosition() < iS4) {
                    int i12 = parcel.readInt();
                    char c13 = (char) i12;
                    if (c13 == 1) {
                        strI3 = com.bumptech.glide.c.i(i12, parcel);
                    } else if (c13 == 2) {
                        strI4 = com.bumptech.glide.c.i(i12, parcel);
                    } else if (c13 != 3) {
                        com.bumptech.glide.c.R(i12, parcel);
                    } else {
                        zE = com.bumptech.glide.c.E(i12, parcel);
                    }
                }
                com.bumptech.glide.c.n(iS4, parcel);
                return new z(strI3, strI4, zE);
            case 4:
                int iS5 = com.bumptech.glide.c.S(parcel);
                d0 d0Var2 = null;
                z zVar = null;
                h0 h0Var = null;
                while (parcel.dataPosition() < iS5) {
                    int i13 = parcel.readInt();
                    char c14 = (char) i13;
                    if (c14 == 1) {
                        d0Var2 = (d0) com.bumptech.glide.c.h(parcel, i13, d0.CREATOR);
                    } else if (c14 == 2) {
                        zVar = (z) com.bumptech.glide.c.h(parcel, i13, z.CREATOR);
                    } else if (c14 != 3) {
                        com.bumptech.glide.c.R(i13, parcel);
                    } else {
                        h0Var = (h0) com.bumptech.glide.c.h(parcel, i13, h0.CREATOR);
                    }
                }
                com.bumptech.glide.c.n(iS5, parcel);
                a0 a0Var = new a0();
                a0Var.f9802a = d0Var2;
                a0Var.f9803b = zVar;
                a0Var.f9804c = h0Var;
                return a0Var;
            case 5:
                int iS6 = com.bumptech.glide.c.S(parcel);
                String strI5 = null;
                String strI6 = null;
                String strI7 = null;
                String strI8 = null;
                String strI9 = null;
                String strI10 = null;
                String strI11 = null;
                boolean zE2 = false;
                while (parcel.dataPosition() < iS6) {
                    int i14 = parcel.readInt();
                    switch ((char) i14) {
                        case 1:
                            strI5 = com.bumptech.glide.c.i(i14, parcel);
                            break;
                        case 2:
                            strI6 = com.bumptech.glide.c.i(i14, parcel);
                            break;
                        case 3:
                            strI9 = com.bumptech.glide.c.i(i14, parcel);
                            break;
                        case 4:
                            strI8 = com.bumptech.glide.c.i(i14, parcel);
                            break;
                        case 5:
                            strI7 = com.bumptech.glide.c.i(i14, parcel);
                            break;
                        case 6:
                            strI10 = com.bumptech.glide.c.i(i14, parcel);
                            break;
                        case 7:
                            zE2 = com.bumptech.glide.c.E(i14, parcel);
                            break;
                        case '\b':
                            strI11 = com.bumptech.glide.c.i(i14, parcel);
                            break;
                        default:
                            com.bumptech.glide.c.R(i14, parcel);
                            break;
                    }
                }
                com.bumptech.glide.c.n(iS6, parcel);
                return new b0(strI5, strI6, strI7, strI8, strI9, strI10, zE2, strI11);
            default:
                int iS7 = com.bumptech.glide.c.S(parcel);
                zzahb zzahbVar = null;
                b0 b0Var = null;
                String strI12 = null;
                String strI13 = null;
                ArrayList arrayListM5 = null;
                ArrayList arrayListK = null;
                String strI14 = null;
                Boolean boolF = null;
                e0 e0Var = null;
                h0 h0Var2 = null;
                m mVar = null;
                boolean zE3 = false;
                while (parcel.dataPosition() < iS7) {
                    int i15 = parcel.readInt();
                    switch ((char) i15) {
                        case 1:
                            zzahbVar = (zzahb) com.bumptech.glide.c.h(parcel, i15, zzahb.CREATOR);
                            break;
                        case 2:
                            b0Var = (b0) com.bumptech.glide.c.h(parcel, i15, b0.CREATOR);
                            break;
                        case 3:
                            strI12 = com.bumptech.glide.c.i(i15, parcel);
                            break;
                        case 4:
                            strI13 = com.bumptech.glide.c.i(i15, parcel);
                            break;
                        case 5:
                            arrayListM5 = com.bumptech.glide.c.m(parcel, i15, b0.CREATOR);
                            break;
                        case 6:
                            arrayListK = com.bumptech.glide.c.k(i15, parcel);
                            break;
                        case 7:
                            strI14 = com.bumptech.glide.c.i(i15, parcel);
                            break;
                        case '\b':
                            boolF = com.bumptech.glide.c.F(i15, parcel);
                            break;
                        case '\t':
                            e0Var = (e0) com.bumptech.glide.c.h(parcel, i15, e0.CREATOR);
                            break;
                        case '\n':
                            zE3 = com.bumptech.glide.c.E(i15, parcel);
                            break;
                        case 11:
                            h0Var2 = (h0) com.bumptech.glide.c.h(parcel, i15, h0.CREATOR);
                            break;
                        case '\f':
                            mVar = (m) com.bumptech.glide.c.h(parcel, i15, m.CREATOR);
                            break;
                        default:
                            com.bumptech.glide.c.R(i15, parcel);
                            break;
                    }
                }
                com.bumptech.glide.c.n(iS7, parcel);
                return new d0(zzahbVar, b0Var, strI12, strI13, arrayListM5, arrayListK, strI14, boolF, e0Var, zE3, h0Var2, mVar);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.f9805a) {
            case 0:
                return new e0[i];
            case 1:
                return new c[i];
            case 2:
                return new m[i];
            case 3:
                return new z[i];
            case 4:
                return new a0[i];
            case 5:
                return new b0[i];
            default:
                return new d0[i];
        }
    }
}
