package x1;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;
import com.google.android.gms.auth.api.credentials.HintRequest;
import com.google.android.gms.auth.api.credentials.IdToken;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class c1 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10028a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i;
        switch (this.f10028a) {
            case 0:
                d1 d1Var = new d1();
                d1Var.f10033a = parcel.readInt();
                d1Var.f10034b = parcel.readInt();
                d1Var.f10036d = parcel.readInt() == 1;
                int i10 = parcel.readInt();
                if (i10 > 0) {
                    int[] iArr = new int[i10];
                    d1Var.f10035c = iArr;
                    parcel.readIntArray(iArr);
                }
                return d1Var;
            case 1:
                e1 e1Var = new e1();
                e1Var.f10047a = parcel.readInt();
                e1Var.f10048b = parcel.readInt();
                int i11 = parcel.readInt();
                e1Var.f10049c = i11;
                if (i11 > 0) {
                    int[] iArr2 = new int[i11];
                    e1Var.f10050d = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int i12 = parcel.readInt();
                e1Var.e = i12;
                if (i12 > 0) {
                    int[] iArr3 = new int[i12];
                    e1Var.f10051f = iArr3;
                    parcel.readIntArray(iArr3);
                }
                e1Var.f10053s = parcel.readInt() == 1;
                e1Var.f10054t = parcel.readInt() == 1;
                e1Var.f10055u = parcel.readInt() == 1;
                e1Var.f10052r = parcel.readArrayList(d1.class.getClassLoader());
                return e1Var;
            case 2:
                int iS = com.bumptech.glide.c.S(parcel);
                HashSet hashSet = new HashSet();
                int i13 = 0;
                ArrayList arrayList = null;
                y6.d dVar = null;
                int i14 = 0;
                while (parcel.dataPosition() < iS) {
                    int i15 = parcel.readInt();
                    char c10 = (char) i15;
                    if (c10 == 1) {
                        int iJ = com.bumptech.glide.c.J(i15, parcel);
                        hashSet.add(1);
                        i14 = iJ;
                    } else if (c10 == 2) {
                        ArrayList arrayListM = com.bumptech.glide.c.m(parcel, i15, y6.e.CREATOR);
                        hashSet.add(2);
                        arrayList = arrayListM;
                    } else if (c10 == 3) {
                        int iJ2 = com.bumptech.glide.c.J(i15, parcel);
                        hashSet.add(3);
                        i13 = iJ2;
                    } else if (c10 != 4) {
                        com.bumptech.glide.c.R(i15, parcel);
                    } else {
                        y6.d dVar2 = (y6.d) com.bumptech.glide.c.h(parcel, i15, y6.d.CREATOR);
                        hashSet.add(4);
                        dVar = dVar2;
                    }
                }
                if (parcel.dataPosition() == iS) {
                    return new y6.b(hashSet, i14, arrayList, i13, dVar);
                }
                throw new h7.b(da.v.f(iS, "Overread allowed size end="), parcel);
            case 3:
                int iS2 = com.bumptech.glide.c.S(parcel);
                int iJ3 = 0;
                ArrayList arrayListK = null;
                ArrayList arrayListK2 = null;
                ArrayList arrayListK3 = null;
                ArrayList arrayListK4 = null;
                ArrayList arrayListK5 = null;
                while (parcel.dataPosition() < iS2) {
                    int i16 = parcel.readInt();
                    switch ((char) i16) {
                        case 1:
                            iJ3 = com.bumptech.glide.c.J(i16, parcel);
                            break;
                        case 2:
                            arrayListK = com.bumptech.glide.c.k(i16, parcel);
                            break;
                        case 3:
                            arrayListK2 = com.bumptech.glide.c.k(i16, parcel);
                            break;
                        case 4:
                            arrayListK3 = com.bumptech.glide.c.k(i16, parcel);
                            break;
                        case 5:
                            arrayListK4 = com.bumptech.glide.c.k(i16, parcel);
                            break;
                        case 6:
                            arrayListK5 = com.bumptech.glide.c.k(i16, parcel);
                            break;
                        default:
                            com.bumptech.glide.c.R(i16, parcel);
                            break;
                    }
                }
                com.bumptech.glide.c.n(iS2, parcel);
                return new y6.d(iJ3, arrayListK, arrayListK2, arrayListK3, arrayListK4, arrayListK5);
            case 4:
                int iS3 = com.bumptech.glide.c.S(parcel);
                HashSet hashSet2 = new HashSet();
                int iJ4 = 0;
                y6.f fVar = null;
                String str = null;
                String str2 = null;
                String str3 = null;
                while (true) {
                    int i17 = iJ4;
                    while (true) {
                        if (parcel.dataPosition() >= iS3) {
                            if (parcel.dataPosition() == iS3) {
                                return new y6.e(hashSet2, i17, fVar, str, str2, str3);
                            }
                            throw new h7.b(da.v.f(iS3, "Overread allowed size end="), parcel);
                        }
                        i = parcel.readInt();
                        char c11 = (char) i;
                        if (c11 != 1) {
                            if (c11 == 2) {
                                y6.f fVar2 = (y6.f) com.bumptech.glide.c.h(parcel, i, y6.f.CREATOR);
                                hashSet2.add(2);
                                fVar = fVar2;
                            } else if (c11 == 3) {
                                String strI = com.bumptech.glide.c.i(i, parcel);
                                hashSet2.add(3);
                                str = strI;
                            } else if (c11 == 4) {
                                String strI2 = com.bumptech.glide.c.i(i, parcel);
                                hashSet2.add(4);
                                str2 = strI2;
                            } else if (c11 != 5) {
                                com.bumptech.glide.c.R(i, parcel);
                            } else {
                                String strI3 = com.bumptech.glide.c.i(i, parcel);
                                hashSet2.add(5);
                                str3 = strI3;
                            }
                        }
                    }
                    iJ4 = com.bumptech.glide.c.J(i, parcel);
                    hashSet2.add(1);
                }
                break;
            case 5:
                int iS4 = com.bumptech.glide.c.S(parcel);
                HashSet hashSet3 = new HashSet();
                int i18 = 0;
                String str4 = null;
                byte[] bArr = null;
                PendingIntent pendingIntent = null;
                y6.a aVar = null;
                int i19 = 0;
                while (parcel.dataPosition() < iS4) {
                    int i20 = parcel.readInt();
                    switch ((char) i20) {
                        case 1:
                            int iJ5 = com.bumptech.glide.c.J(i20, parcel);
                            hashSet3.add(1);
                            i19 = iJ5;
                            break;
                        case 2:
                            String strI4 = com.bumptech.glide.c.i(i20, parcel);
                            hashSet3.add(2);
                            str4 = strI4;
                            break;
                        case 3:
                            int iJ6 = com.bumptech.glide.c.J(i20, parcel);
                            hashSet3.add(3);
                            i18 = iJ6;
                            break;
                        case 4:
                            byte[] bArrF = com.bumptech.glide.c.f(i20, parcel);
                            hashSet3.add(4);
                            bArr = bArrF;
                            break;
                        case 5:
                            PendingIntent pendingIntent2 = (PendingIntent) com.bumptech.glide.c.h(parcel, i20, PendingIntent.CREATOR);
                            hashSet3.add(5);
                            pendingIntent = pendingIntent2;
                            break;
                        case 6:
                            y6.a aVar2 = (y6.a) com.bumptech.glide.c.h(parcel, i20, y6.a.CREATOR);
                            hashSet3.add(6);
                            aVar = aVar2;
                            break;
                        default:
                            com.bumptech.glide.c.R(i20, parcel);
                            break;
                    }
                }
                if (parcel.dataPosition() == iS4) {
                    return new y6.f(hashSet3, i19, str4, i18, bArr, pendingIntent, aVar);
                }
                throw new h7.b(da.v.f(iS4, "Overread allowed size end="), parcel);
            case 6:
                int iS5 = com.bumptech.glide.c.S(parcel);
                int iJ7 = 0;
                boolean zE = false;
                boolean zE2 = false;
                long jM = 0;
                while (parcel.dataPosition() < iS5) {
                    int i21 = parcel.readInt();
                    char c12 = (char) i21;
                    if (c12 == 1) {
                        iJ7 = com.bumptech.glide.c.J(i21, parcel);
                    } else if (c12 == 2) {
                        zE = com.bumptech.glide.c.E(i21, parcel);
                    } else if (c12 == 3) {
                        jM = com.bumptech.glide.c.M(i21, parcel);
                    } else if (c12 != 4) {
                        com.bumptech.glide.c.R(i21, parcel);
                    } else {
                        zE2 = com.bumptech.glide.c.E(i21, parcel);
                    }
                }
                com.bumptech.glide.c.n(iS5, parcel);
                return new y6.a(iJ7, zE, jM, zE2);
            case 7:
                int iS6 = com.bumptech.glide.c.S(parcel);
                IBinder iBinderI = null;
                boolean zE3 = false;
                while (parcel.dataPosition() < iS6) {
                    int i22 = parcel.readInt();
                    char c13 = (char) i22;
                    if (c13 == 1) {
                        zE3 = com.bumptech.glide.c.E(i22, parcel);
                    } else if (c13 != 2) {
                        com.bumptech.glide.c.R(i22, parcel);
                    } else {
                        iBinderI = com.bumptech.glide.c.I(i22, parcel);
                    }
                }
                com.bumptech.glide.c.n(iS6, parcel);
                return new z5.a(zE3, iBinderI);
            case 8:
                int iS7 = com.bumptech.glide.c.S(parcel);
                IBinder iBinderI2 = null;
                boolean zE4 = false;
                IBinder iBinderI3 = null;
                while (parcel.dataPosition() < iS7) {
                    int i23 = parcel.readInt();
                    char c14 = (char) i23;
                    if (c14 == 1) {
                        zE4 = com.bumptech.glide.c.E(i23, parcel);
                    } else if (c14 == 2) {
                        iBinderI2 = com.bumptech.glide.c.I(i23, parcel);
                    } else if (c14 != 3) {
                        com.bumptech.glide.c.R(i23, parcel);
                    } else {
                        iBinderI3 = com.bumptech.glide.c.I(i23, parcel);
                    }
                }
                com.bumptech.glide.c.n(iS7, parcel);
                return new z5.g(zE4, iBinderI2, iBinderI3);
            case 9:
                int iS8 = com.bumptech.glide.c.S(parcel);
                String strI5 = null;
                String strI6 = null;
                Uri uri = null;
                ArrayList arrayListM2 = null;
                String strI7 = null;
                String strI8 = null;
                String strI9 = null;
                String strI10 = null;
                while (parcel.dataPosition() < iS8) {
                    int i24 = parcel.readInt();
                    switch ((char) i24) {
                        case 1:
                            strI5 = com.bumptech.glide.c.i(i24, parcel);
                            break;
                        case 2:
                            strI6 = com.bumptech.glide.c.i(i24, parcel);
                            break;
                        case 3:
                            uri = (Uri) com.bumptech.glide.c.h(parcel, i24, Uri.CREATOR);
                            break;
                        case 4:
                            arrayListM2 = com.bumptech.glide.c.m(parcel, i24, IdToken.CREATOR);
                            break;
                        case 5:
                            strI7 = com.bumptech.glide.c.i(i24, parcel);
                            break;
                        case 6:
                            strI8 = com.bumptech.glide.c.i(i24, parcel);
                            break;
                        case 7:
                        case '\b':
                        default:
                            com.bumptech.glide.c.R(i24, parcel);
                            break;
                        case '\t':
                            strI9 = com.bumptech.glide.c.i(i24, parcel);
                            break;
                        case '\n':
                            strI10 = com.bumptech.glide.c.i(i24, parcel);
                            break;
                    }
                }
                com.bumptech.glide.c.n(iS8, parcel);
                return new Credential(strI5, strI6, uri, arrayListM2, strI7, strI8, strI9, strI10);
            case 10:
                int iS9 = com.bumptech.glide.c.S(parcel);
                int iJ8 = 0;
                boolean zE5 = false;
                boolean zE6 = false;
                boolean zE7 = false;
                int iJ9 = 0;
                while (parcel.dataPosition() < iS9) {
                    int i25 = parcel.readInt();
                    char c15 = (char) i25;
                    if (c15 == 1) {
                        zE5 = com.bumptech.glide.c.E(i25, parcel);
                    } else if (c15 == 2) {
                        zE6 = com.bumptech.glide.c.E(i25, parcel);
                    } else if (c15 == 3) {
                        zE7 = com.bumptech.glide.c.E(i25, parcel);
                    } else if (c15 == 4) {
                        iJ9 = com.bumptech.glide.c.J(i25, parcel);
                    } else if (c15 != 1000) {
                        com.bumptech.glide.c.R(i25, parcel);
                    } else {
                        iJ8 = com.bumptech.glide.c.J(i25, parcel);
                    }
                }
                com.bumptech.glide.c.n(iS9, parcel);
                return new CredentialPickerConfig(iJ8, zE5, zE6, zE7, iJ9);
            case 11:
                int iS10 = com.bumptech.glide.c.S(parcel);
                int iJ10 = 0;
                boolean zE8 = false;
                boolean zE9 = false;
                boolean zE10 = false;
                String[] strArrJ = null;
                CredentialPickerConfig credentialPickerConfig = null;
                CredentialPickerConfig credentialPickerConfig2 = null;
                String strI11 = null;
                String strI12 = null;
                while (parcel.dataPosition() < iS10) {
                    int i26 = parcel.readInt();
                    char c16 = (char) i26;
                    if (c16 != 1000) {
                        switch (c16) {
                            case 1:
                                zE8 = com.bumptech.glide.c.E(i26, parcel);
                                break;
                            case 2:
                                strArrJ = com.bumptech.glide.c.j(i26, parcel);
                                break;
                            case 3:
                                credentialPickerConfig = (CredentialPickerConfig) com.bumptech.glide.c.h(parcel, i26, CredentialPickerConfig.CREATOR);
                                break;
                            case 4:
                                credentialPickerConfig2 = (CredentialPickerConfig) com.bumptech.glide.c.h(parcel, i26, CredentialPickerConfig.CREATOR);
                                break;
                            case 5:
                                zE9 = com.bumptech.glide.c.E(i26, parcel);
                                break;
                            case 6:
                                strI11 = com.bumptech.glide.c.i(i26, parcel);
                                break;
                            case 7:
                                strI12 = com.bumptech.glide.c.i(i26, parcel);
                                break;
                            case '\b':
                                zE10 = com.bumptech.glide.c.E(i26, parcel);
                                break;
                            default:
                                com.bumptech.glide.c.R(i26, parcel);
                                break;
                        }
                    } else {
                        iJ10 = com.bumptech.glide.c.J(i26, parcel);
                    }
                }
                com.bumptech.glide.c.n(iS10, parcel);
                return new z6.a(iJ10, zE8, strArrJ, credentialPickerConfig, credentialPickerConfig2, zE9, strI11, strI12, zE10);
            case 12:
                int iS11 = com.bumptech.glide.c.S(parcel);
                CredentialPickerConfig credentialPickerConfig3 = null;
                String[] strArrJ2 = null;
                String strI13 = null;
                String strI14 = null;
                int iJ11 = 0;
                boolean zE11 = false;
                boolean zE12 = false;
                boolean zE13 = false;
                while (parcel.dataPosition() < iS11) {
                    int i27 = parcel.readInt();
                    char c17 = (char) i27;
                    if (c17 != 1000) {
                        switch (c17) {
                            case 1:
                                credentialPickerConfig3 = (CredentialPickerConfig) com.bumptech.glide.c.h(parcel, i27, CredentialPickerConfig.CREATOR);
                                break;
                            case 2:
                                zE11 = com.bumptech.glide.c.E(i27, parcel);
                                break;
                            case 3:
                                zE12 = com.bumptech.glide.c.E(i27, parcel);
                                break;
                            case 4:
                                strArrJ2 = com.bumptech.glide.c.j(i27, parcel);
                                break;
                            case 5:
                                zE13 = com.bumptech.glide.c.E(i27, parcel);
                                break;
                            case 6:
                                strI13 = com.bumptech.glide.c.i(i27, parcel);
                                break;
                            case 7:
                                strI14 = com.bumptech.glide.c.i(i27, parcel);
                                break;
                            default:
                                com.bumptech.glide.c.R(i27, parcel);
                                break;
                        }
                    } else {
                        iJ11 = com.bumptech.glide.c.J(i27, parcel);
                    }
                }
                com.bumptech.glide.c.n(iS11, parcel);
                return new HintRequest(iJ11, credentialPickerConfig3, zE11, zE12, strArrJ2, zE13, strI13, strI14);
            default:
                int iS12 = com.bumptech.glide.c.S(parcel);
                String strI15 = null;
                String strI16 = null;
                while (parcel.dataPosition() < iS12) {
                    int i28 = parcel.readInt();
                    char c18 = (char) i28;
                    if (c18 == 1) {
                        strI15 = com.bumptech.glide.c.i(i28, parcel);
                    } else if (c18 != 2) {
                        com.bumptech.glide.c.R(i28, parcel);
                    } else {
                        strI16 = com.bumptech.glide.c.i(i28, parcel);
                    }
                }
                com.bumptech.glide.c.n(iS12, parcel);
                return new IdToken(strI15, strI16);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f10028a) {
            case 0:
                return new d1[i];
            case 1:
                return new e1[i];
            case 2:
                return new y6.b[i];
            case 3:
                return new y6.d[i];
            case 4:
                return new y6.e[i];
            case 5:
                return new y6.f[i];
            case 6:
                return new y6.a[i];
            case 7:
                return new z5.a[i];
            case 8:
                return new z5.g[i];
            case 9:
                return new Credential[i];
            case 10:
                return new CredentialPickerConfig[i];
            case 11:
                return new z6.a[i];
            case 12:
                return new HintRequest[i];
            default:
                return new IdToken[i];
        }
    }
}
