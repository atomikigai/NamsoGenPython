package r4;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.internal.ads.zzbbs;
import da.v;
import java.util.ArrayList;
import java.util.HashMap;
import u7.a0;
import u7.b0;
import u7.b1;
import u7.c0;
import u7.d0;
import u7.e0;
import u7.f0;
import u7.h0;
import u7.i0;
import u7.j0;
import u7.k0;
import u7.l0;
import u7.m;
import u7.m0;
import u7.p0;
import u7.q0;
import u7.r0;
import u7.s0;
import u7.t0;
import u7.u0;
import u7.w;
import u7.x;
import u7.y;
import u7.z;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8141a;

    public /* synthetic */ a(int i) {
        this.f8141a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f8141a) {
            case 0:
                b bVar = new b();
                bVar.f8143b = -1;
                bVar.f8142a = parcel.readInt();
                bVar.f8143b = parcel.readInt();
                Bundle bundle = parcel.readBundle(b.class.getClassLoader());
                bVar.f8144c = new HashMap();
                for (String str : bundle.keySet()) {
                    bVar.f8144c.put(str, Integer.valueOf(bundle.getInt(str)));
                }
                return bVar;
            case 1:
                return new c(parcel);
            case 2:
                return new i((s4.i) parcel.readParcelable(s4.i.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt() == 1, (g) parcel.readSerializable(), (v9.d) parcel.readParcelable(v9.d.class.getClassLoader()));
            case 3:
                return new s4.a(parcel);
            case 4:
                return new s4.c(parcel.readString(), parcel.createTypedArrayList(c.CREATOR), (c) parcel.readParcelable(c.class.getClassLoader()), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), (v9.b) parcel.readParcelable(v9.b.class.getClassLoader()), (b) parcel.readParcelable(b.class.getClassLoader()));
            case 5:
                return new s4.i(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (Uri) parcel.readParcelable(Uri.class.getClassLoader()));
            case 6:
                String string = parcel.readString();
                try {
                    for (Transport transport : Transport.values()) {
                        if (string.equals(transport.f2284a)) {
                            return transport;
                        }
                    }
                    if (string.equals("hybrid")) {
                        return Transport.HYBRID;
                    }
                    throw new t7.a(v.i("Transport ", string, " not supported"));
                } catch (t7.a e) {
                    throw new RuntimeException(e);
                }
            case 7:
                u0.k kVar = new u0.k(parcel);
                kVar.f8772a = parcel.readInt();
                return kVar;
            case 8:
                int iS = com.bumptech.glide.c.S(parcel);
                String strI = null;
                String strI2 = null;
                while (parcel.dataPosition() < iS) {
                    int i = parcel.readInt();
                    char c10 = (char) i;
                    if (c10 == 1) {
                        strI = com.bumptech.glide.c.i(i, parcel);
                    } else if (c10 != 2) {
                        com.bumptech.glide.c.R(i, parcel);
                    } else {
                        strI2 = com.bumptech.glide.c.i(i, parcel);
                    }
                }
                com.bumptech.glide.c.n(iS, parcel);
                return new u6.c(strI, strI2);
            case 9:
                int iS2 = com.bumptech.glide.c.S(parcel);
                String strI3 = null;
                int iJ = 0;
                while (parcel.dataPosition() < iS2) {
                    int i10 = parcel.readInt();
                    char c11 = (char) i10;
                    if (c11 == 1) {
                        strI3 = com.bumptech.glide.c.i(i10, parcel);
                    } else if (c11 != 2) {
                        com.bumptech.glide.c.R(i10, parcel);
                    } else {
                        iJ = com.bumptech.glide.c.J(i10, parcel);
                    }
                }
                com.bumptech.glide.c.n(iS2, parcel);
                return new u6.d(strI3, iJ);
            case 10:
                try {
                    return u7.c.a(parcel.readString());
                } catch (u7.b e4) {
                    throw new RuntimeException(e4);
                }
            case 11:
                int iS3 = com.bumptech.glide.c.S(parcel);
                boolean zE = false;
                while (parcel.dataPosition() < iS3) {
                    int i11 = parcel.readInt();
                    if (((char) i11) != 1) {
                        com.bumptech.glide.c.R(i11, parcel);
                    } else {
                        zE = com.bumptech.glide.c.E(i11, parcel);
                    }
                }
                com.bumptech.glide.c.n(iS3, parcel);
                return new b1(zE);
            case 12:
                int iS4 = com.bumptech.glide.c.S(parcel);
                long jM = 0;
                while (parcel.dataPosition() < iS4) {
                    int i12 = parcel.readInt();
                    if (((char) i12) != 1) {
                        com.bumptech.glide.c.R(i12, parcel);
                    } else {
                        jM = com.bumptech.glide.c.M(i12, parcel);
                    }
                }
                com.bumptech.glide.c.n(iS4, parcel);
                return new p0(jM);
            case 13:
                int iS5 = com.bumptech.glide.c.S(parcel);
                boolean zE2 = false;
                while (parcel.dataPosition() < iS5) {
                    int i13 = parcel.readInt();
                    if (((char) i13) != 1) {
                        com.bumptech.glide.c.R(i13, parcel);
                    } else {
                        zE2 = com.bumptech.glide.c.E(i13, parcel);
                    }
                }
                com.bumptech.glide.c.n(iS5, parcel);
                return new q0(zE2);
            case 14:
                int iS6 = com.bumptech.glide.c.S(parcel);
                boolean zE3 = false;
                while (parcel.dataPosition() < iS6) {
                    int i14 = parcel.readInt();
                    if (((char) i14) != 1) {
                        com.bumptech.glide.c.R(i14, parcel);
                    } else {
                        zE3 = com.bumptech.glide.c.E(i14, parcel);
                    }
                }
                com.bumptech.glide.c.n(iS6, parcel);
                return new w(zE3);
            case 15:
                int iS7 = com.bumptech.glide.c.S(parcel);
                String strI4 = null;
                while (parcel.dataPosition() < iS7) {
                    int i15 = parcel.readInt();
                    if (((char) i15) != 1) {
                        com.bumptech.glide.c.R(i15, parcel);
                    } else {
                        strI4 = com.bumptech.glide.c.i(i15, parcel);
                    }
                }
                com.bumptech.glide.c.n(iS7, parcel);
                return new r0(strI4);
            case 16:
                int iS8 = com.bumptech.glide.c.S(parcel);
                while (true) {
                    byte[][] bArr = null;
                    while (true) {
                        if (parcel.dataPosition() >= iS8) {
                            com.bumptech.glide.c.n(iS8, parcel);
                            return new s0(bArr);
                        }
                        int i16 = parcel.readInt();
                        if (((char) i16) != 1) {
                            com.bumptech.glide.c.R(i16, parcel);
                        } else {
                            int iO = com.bumptech.glide.c.O(i16, parcel);
                            int iDataPosition = parcel.dataPosition();
                            if (iO == 0) {
                            }
                            int i17 = parcel.readInt();
                            byte[][] bArr2 = new byte[i17][];
                            for (int i18 = 0; i18 < i17; i18++) {
                                bArr2[i18] = parcel.createByteArray();
                            }
                            parcel.setDataPosition(iDataPosition + iO);
                            bArr = bArr2;
                        }
                        break;
                    }
                }
                break;
            case 17:
                int iS9 = com.bumptech.glide.c.S(parcel);
                c0 c0Var = null;
                f0 f0Var = null;
                byte[] bArrF = null;
                ArrayList arrayListM = null;
                Double dG = null;
                ArrayList arrayListM2 = null;
                m mVar = null;
                Integer numK = null;
                l0 l0Var = null;
                String strI5 = null;
                u7.f fVar = null;
                while (parcel.dataPosition() < iS9) {
                    int i19 = parcel.readInt();
                    switch ((char) i19) {
                        case 2:
                            c0Var = (c0) com.bumptech.glide.c.h(parcel, i19, c0.CREATOR);
                            break;
                        case 3:
                            f0Var = (f0) com.bumptech.glide.c.h(parcel, i19, f0.CREATOR);
                            break;
                        case 4:
                            bArrF = com.bumptech.glide.c.f(i19, parcel);
                            break;
                        case 5:
                            arrayListM = com.bumptech.glide.c.m(parcel, i19, a0.CREATOR);
                            break;
                        case 6:
                            dG = com.bumptech.glide.c.G(i19, parcel);
                            break;
                        case 7:
                            arrayListM2 = com.bumptech.glide.c.m(parcel, i19, z.CREATOR);
                            break;
                        case '\b':
                            mVar = (m) com.bumptech.glide.c.h(parcel, i19, m.CREATOR);
                            break;
                        case '\t':
                            numK = com.bumptech.glide.c.K(i19, parcel);
                            break;
                        case '\n':
                            l0Var = (l0) com.bumptech.glide.c.h(parcel, i19, l0.CREATOR);
                            break;
                        case 11:
                            strI5 = com.bumptech.glide.c.i(i19, parcel);
                            break;
                        case '\f':
                            fVar = (u7.f) com.bumptech.glide.c.h(parcel, i19, u7.f.CREATOR);
                            break;
                        default:
                            com.bumptech.glide.c.R(i19, parcel);
                            break;
                    }
                }
                com.bumptech.glide.c.n(iS9, parcel);
                return new y(c0Var, f0Var, bArrF, arrayListM, dG, arrayListM2, mVar, numK, l0Var, strI5, fVar);
            case 18:
                int iS10 = com.bumptech.glide.c.S(parcel);
                String strI6 = null;
                String strI7 = null;
                byte[] bArrF2 = null;
                u7.j jVar = null;
                u7.i iVar = null;
                u7.k kVar2 = null;
                u7.g gVar = null;
                String strI8 = null;
                while (parcel.dataPosition() < iS10) {
                    int i20 = parcel.readInt();
                    switch ((char) i20) {
                        case 1:
                            strI6 = com.bumptech.glide.c.i(i20, parcel);
                            break;
                        case 2:
                            strI7 = com.bumptech.glide.c.i(i20, parcel);
                            break;
                        case 3:
                            bArrF2 = com.bumptech.glide.c.f(i20, parcel);
                            break;
                        case 4:
                            jVar = (u7.j) com.bumptech.glide.c.h(parcel, i20, u7.j.CREATOR);
                            break;
                        case 5:
                            iVar = (u7.i) com.bumptech.glide.c.h(parcel, i20, u7.i.CREATOR);
                            break;
                        case 6:
                            kVar2 = (u7.k) com.bumptech.glide.c.h(parcel, i20, u7.k.CREATOR);
                            break;
                        case 7:
                            gVar = (u7.g) com.bumptech.glide.c.h(parcel, i20, u7.g.CREATOR);
                            break;
                        case '\b':
                            strI8 = com.bumptech.glide.c.i(i20, parcel);
                            break;
                        default:
                            com.bumptech.glide.c.R(i20, parcel);
                            break;
                    }
                }
                com.bumptech.glide.c.n(iS10, parcel);
                return new x(strI6, strI7, bArrF2, jVar, iVar, kVar2, gVar, strI8);
            case 19:
                int iS11 = com.bumptech.glide.c.S(parcel);
                String strI9 = null;
                byte[] bArrF3 = null;
                ArrayList arrayListM3 = null;
                while (parcel.dataPosition() < iS11) {
                    int i21 = parcel.readInt();
                    char c12 = (char) i21;
                    if (c12 == 2) {
                        strI9 = com.bumptech.glide.c.i(i21, parcel);
                    } else if (c12 == 3) {
                        bArrF3 = com.bumptech.glide.c.f(i21, parcel);
                    } else if (c12 != 4) {
                        com.bumptech.glide.c.R(i21, parcel);
                    } else {
                        arrayListM3 = com.bumptech.glide.c.m(parcel, i21, Transport.CREATOR);
                    }
                }
                com.bumptech.glide.c.n(iS11, parcel);
                return new z(strI9, bArrF3, arrayListM3);
            case 20:
                int iS12 = com.bumptech.glide.c.S(parcel);
                String strI10 = null;
                Integer numK2 = null;
                while (parcel.dataPosition() < iS12) {
                    int i22 = parcel.readInt();
                    char c13 = (char) i22;
                    if (c13 == 2) {
                        strI10 = com.bumptech.glide.c.i(i22, parcel);
                    } else if (c13 != 3) {
                        com.bumptech.glide.c.R(i22, parcel);
                    } else {
                        numK2 = com.bumptech.glide.c.K(i22, parcel);
                    }
                }
                com.bumptech.glide.c.n(iS12, parcel);
                return new a0(strI10, numK2.intValue());
            case zzbbs.zzt.zzm /* 21 */:
                int iS13 = com.bumptech.glide.c.S(parcel);
                byte[] bArrF4 = null;
                Double dG2 = null;
                String strI11 = null;
                ArrayList arrayListM4 = null;
                Integer numK3 = null;
                l0 l0Var2 = null;
                String strI12 = null;
                u7.f fVar2 = null;
                Long lN = null;
                while (parcel.dataPosition() < iS13) {
                    int i23 = parcel.readInt();
                    switch ((char) i23) {
                        case 2:
                            bArrF4 = com.bumptech.glide.c.f(i23, parcel);
                            break;
                        case 3:
                            dG2 = com.bumptech.glide.c.G(i23, parcel);
                            break;
                        case 4:
                            strI11 = com.bumptech.glide.c.i(i23, parcel);
                            break;
                        case 5:
                            arrayListM4 = com.bumptech.glide.c.m(parcel, i23, z.CREATOR);
                            break;
                        case 6:
                            numK3 = com.bumptech.glide.c.K(i23, parcel);
                            break;
                        case 7:
                            l0Var2 = (l0) com.bumptech.glide.c.h(parcel, i23, l0.CREATOR);
                            break;
                        case '\b':
                            strI12 = com.bumptech.glide.c.i(i23, parcel);
                            break;
                        case '\t':
                            fVar2 = (u7.f) com.bumptech.glide.c.h(parcel, i23, u7.f.CREATOR);
                            break;
                        case '\n':
                            lN = com.bumptech.glide.c.N(i23, parcel);
                            break;
                        default:
                            com.bumptech.glide.c.R(i23, parcel);
                            break;
                    }
                }
                com.bumptech.glide.c.n(iS13, parcel);
                return new b0(bArrF4, dG2, strI11, arrayListM4, numK3, l0Var2, strI12, fVar2, lN);
            case 22:
                int iS14 = com.bumptech.glide.c.S(parcel);
                String strI13 = null;
                String strI14 = null;
                String strI15 = null;
                while (parcel.dataPosition() < iS14) {
                    int i24 = parcel.readInt();
                    char c14 = (char) i24;
                    if (c14 == 2) {
                        strI13 = com.bumptech.glide.c.i(i24, parcel);
                    } else if (c14 == 3) {
                        strI14 = com.bumptech.glide.c.i(i24, parcel);
                    } else if (c14 != 4) {
                        com.bumptech.glide.c.R(i24, parcel);
                    } else {
                        strI15 = com.bumptech.glide.c.i(i24, parcel);
                    }
                }
                com.bumptech.glide.c.n(iS14, parcel);
                return new c0(strI13, strI14, strI15);
            case 23:
                try {
                    return e0.a(parcel.readString());
                } catch (d0 e10) {
                    throw new RuntimeException(e10);
                }
            case 24:
                int iS15 = com.bumptech.glide.c.S(parcel);
                byte[] bArrF5 = null;
                String strI16 = null;
                String strI17 = null;
                String strI18 = null;
                while (parcel.dataPosition() < iS15) {
                    int i25 = parcel.readInt();
                    char c15 = (char) i25;
                    if (c15 == 2) {
                        bArrF5 = com.bumptech.glide.c.f(i25, parcel);
                    } else if (c15 == 3) {
                        strI16 = com.bumptech.glide.c.i(i25, parcel);
                    } else if (c15 == 4) {
                        strI17 = com.bumptech.glide.c.i(i25, parcel);
                    } else if (c15 != 5) {
                        com.bumptech.glide.c.R(i25, parcel);
                    } else {
                        strI18 = com.bumptech.glide.c.i(i25, parcel);
                    }
                }
                com.bumptech.glide.c.n(iS15, parcel);
                return new f0(strI16, strI17, strI18, bArrF5);
            case 25:
                String string2 = parcel.readString();
                if (string2 == null) {
                    string2 = "";
                }
                try {
                    return i0.a(string2);
                } catch (h0 e11) {
                    throw new RuntimeException(e11);
                }
            case 26:
                try {
                    return j0.a(parcel.readString());
                } catch (k0 e12) {
                    throw new RuntimeException(e12);
                }
            case 27:
                int iS16 = com.bumptech.glide.c.S(parcel);
                String strI19 = null;
                String strI20 = null;
                while (parcel.dataPosition() < iS16) {
                    int i26 = parcel.readInt();
                    char c16 = (char) i26;
                    if (c16 == 2) {
                        strI19 = com.bumptech.glide.c.i(i26, parcel);
                    } else if (c16 != 3) {
                        com.bumptech.glide.c.R(i26, parcel);
                    } else {
                        strI20 = com.bumptech.glide.c.i(i26, parcel);
                    }
                }
                com.bumptech.glide.c.n(iS16, parcel);
                return new l0(strI19, strI20);
            case 28:
                int iS17 = com.bumptech.glide.c.S(parcel);
                boolean zE4 = false;
                while (parcel.dataPosition() < iS17) {
                    int i27 = parcel.readInt();
                    if (((char) i27) != 1) {
                        com.bumptech.glide.c.R(i27, parcel);
                    } else {
                        zE4 = com.bumptech.glide.c.E(i27, parcel);
                    }
                }
                com.bumptech.glide.c.n(iS17, parcel);
                return new m0(zE4);
            default:
                try {
                    return u0.a(parcel.readString());
                } catch (t0 e13) {
                    throw new RuntimeException(e13);
                }
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f8141a) {
            case 0:
                return new b[i];
            case 1:
                return new c[i];
            case 2:
                return new i[i];
            case 3:
                return new s4.a[i];
            case 4:
                return new s4.c[i];
            case 5:
                return new s4.i[i];
            case 6:
                return new Transport[i];
            case 7:
                return new u0.k[i];
            case 8:
                return new u6.c[i];
            case 9:
                return new u6.d[i];
            case 10:
                return new u7.c[i];
            case 11:
                return new b1[i];
            case 12:
                return new p0[i];
            case 13:
                return new q0[i];
            case 14:
                return new w[i];
            case 15:
                return new r0[i];
            case 16:
                return new s0[i];
            case 17:
                return new y[i];
            case 18:
                return new x[i];
            case 19:
                return new z[i];
            case 20:
                return new a0[i];
            case zzbbs.zzt.zzm /* 21 */:
                return new b0[i];
            case 22:
                return new c0[i];
            case 23:
                return new e0[i];
            case 24:
                return new f0[i];
            case 25:
                return new i0[i];
            case 26:
                return new j0[i];
            case 27:
                return new l0[i];
            case 28:
                return new m0[i];
            default:
                return new u0[i];
        }
    }
}
