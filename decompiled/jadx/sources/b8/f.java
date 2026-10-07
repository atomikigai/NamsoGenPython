package b8;

import android.accounts.Account;
import android.app.PendingIntent;
import android.location.Location;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.a0;
import com.google.android.gms.common.internal.b0;
import com.google.android.gms.common.internal.j;
import com.google.android.gms.common.internal.k;
import com.google.android.gms.common.internal.o0;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.common.internal.v;
import com.google.android.gms.internal.ads.zzbbs;
import d6.i;
import e6.h2;
import e6.h3;
import e6.i3;
import e6.j3;
import e6.l3;
import e6.m2;
import e6.o3;
import e6.w2;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1429a;

    public /* synthetic */ f(int i) {
        this.f1429a = i;
    }

    public static void a(k kVar, Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        int i10 = kVar.f2210a;
        com.bumptech.glide.d.R(parcel, 1, 4);
        parcel.writeInt(i10);
        int i11 = kVar.f2211b;
        com.bumptech.glide.d.R(parcel, 2, 4);
        parcel.writeInt(i11);
        int i12 = kVar.f2212c;
        com.bumptech.glide.d.R(parcel, 3, 4);
        parcel.writeInt(i12);
        com.bumptech.glide.d.K(parcel, 4, kVar.f2213d, false);
        com.bumptech.glide.d.F(parcel, 5, kVar.e);
        com.bumptech.glide.d.N(parcel, 6, kVar.f2214f, i);
        com.bumptech.glide.d.C(parcel, 7, kVar.f2215r, false);
        com.bumptech.glide.d.J(parcel, 8, kVar.f2216s, i, false);
        com.bumptech.glide.d.N(parcel, 10, kVar.f2217t, i);
        com.bumptech.glide.d.N(parcel, 11, kVar.f2218u, i);
        boolean z4 = kVar.f2219v;
        com.bumptech.glide.d.R(parcel, 12, 4);
        parcel.writeInt(z4 ? 1 : 0);
        int i13 = kVar.f2220w;
        com.bumptech.glide.d.R(parcel, 13, 4);
        parcel.writeInt(i13);
        boolean z10 = kVar.f2221x;
        com.bumptech.glide.d.R(parcel, 14, 4);
        parcel.writeInt(z10 ? 1 : 0);
        com.bumptech.glide.d.K(parcel, 15, kVar.f2222y, false);
        com.bumptech.glide.d.Q(iP, parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        ArrayList arrayListK = null;
        String strI = null;
        String strI2 = null;
        String strI3 = null;
        String strI4 = null;
        Bundle bundleE = null;
        Account account = null;
        ArrayList arrayListM = null;
        String strI5 = null;
        String strI6 = null;
        String strI7 = null;
        c.b bVar = null;
        g7.b bVar2 = null;
        a0 a0Var = null;
        int iJ = 0;
        boolean zE = false;
        int iJ2 = 0;
        int iJ3 = 0;
        int iJ4 = 0;
        int iJ5 = 0;
        int iJ6 = 0;
        int iJ7 = 0;
        int iJ8 = 0;
        int iJ9 = 0;
        int iJ10 = 0;
        int iJ11 = 0;
        int iJ12 = 0;
        switch (this.f1429a) {
            case 0:
                int iS = com.bumptech.glide.c.S(parcel);
                String strI8 = null;
                while (parcel.dataPosition() < iS) {
                    int i = parcel.readInt();
                    char c10 = (char) i;
                    if (c10 == 1) {
                        arrayListK = com.bumptech.glide.c.k(i, parcel);
                    } else if (c10 != 2) {
                        com.bumptech.glide.c.R(i, parcel);
                    } else {
                        strI8 = com.bumptech.glide.c.i(i, parcel);
                    }
                }
                com.bumptech.glide.c.n(iS, parcel);
                return new e(strI8, arrayListK);
            case 1:
                int iS2 = com.bumptech.glide.c.S(parcel);
                while (parcel.dataPosition() < iS2) {
                    int i10 = parcel.readInt();
                    char c11 = (char) i10;
                    if (c11 == 1) {
                        iJ = com.bumptech.glide.c.J(i10, parcel);
                    } else if (c11 != 2) {
                        com.bumptech.glide.c.R(i10, parcel);
                    } else {
                        a0Var = (a0) com.bumptech.glide.c.h(parcel, i10, a0.CREATOR);
                    }
                }
                com.bumptech.glide.c.n(iS2, parcel);
                return new g(iJ, a0Var);
            case 2:
                int iS3 = com.bumptech.glide.c.S(parcel);
                b0 b0Var = null;
                while (parcel.dataPosition() < iS3) {
                    int i11 = parcel.readInt();
                    char c12 = (char) i11;
                    if (c12 == 1) {
                        iJ12 = com.bumptech.glide.c.J(i11, parcel);
                    } else if (c12 == 2) {
                        bVar2 = (g7.b) com.bumptech.glide.c.h(parcel, i11, g7.b.CREATOR);
                    } else if (c12 != 3) {
                        com.bumptech.glide.c.R(i11, parcel);
                    } else {
                        b0Var = (b0) com.bumptech.glide.c.h(parcel, i11, b0.CREATOR);
                    }
                }
                com.bumptech.glide.c.n(iS3, parcel);
                return new h(iJ12, bVar2, b0Var);
            case 3:
                c.d dVar = new c.d();
                IBinder strongBinder = parcel.readStrongBinder();
                int i12 = c.c.f1711b;
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(c.b.i);
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof c.b)) {
                        c.a aVar = new c.a();
                        aVar.f1710a = strongBinder;
                        bVar = aVar;
                    } else {
                        bVar = (c.b) iInterfaceQueryLocalInterface;
                    }
                }
                dVar.f1713a = bVar;
                return dVar;
            case 4:
                int iS4 = com.bumptech.glide.c.S(parcel);
                long jM = 0;
                String strI9 = null;
                byte[] bArrF = null;
                Bundle bundleE2 = null;
                int iJ13 = 0;
                int iJ14 = 0;
                while (parcel.dataPosition() < iS4) {
                    int i13 = parcel.readInt();
                    char c13 = (char) i13;
                    if (c13 == 1) {
                        strI9 = com.bumptech.glide.c.i(i13, parcel);
                    } else if (c13 == 2) {
                        iJ14 = com.bumptech.glide.c.J(i13, parcel);
                    } else if (c13 == 3) {
                        jM = com.bumptech.glide.c.M(i13, parcel);
                    } else if (c13 == 4) {
                        bArrF = com.bumptech.glide.c.f(i13, parcel);
                    } else if (c13 == 5) {
                        bundleE2 = com.bumptech.glide.c.e(i13, parcel);
                    } else if (c13 != 1000) {
                        com.bumptech.glide.c.R(i13, parcel);
                    } else {
                        iJ13 = com.bumptech.glide.c.J(i13, parcel);
                    }
                }
                com.bumptech.glide.c.n(iS4, parcel);
                return new c7.a(iJ13, strI9, iJ14, jM, bArrF, bundleE2);
            case 5:
                int iS5 = com.bumptech.glide.c.S(parcel);
                PendingIntent pendingIntent = null;
                Bundle bundleE3 = null;
                byte[] bArrF2 = null;
                int iJ15 = 0;
                int iJ16 = 0;
                int iJ17 = 0;
                while (parcel.dataPosition() < iS5) {
                    int i14 = parcel.readInt();
                    char c14 = (char) i14;
                    if (c14 == 1) {
                        iJ16 = com.bumptech.glide.c.J(i14, parcel);
                    } else if (c14 == 2) {
                        pendingIntent = (PendingIntent) com.bumptech.glide.c.h(parcel, i14, PendingIntent.CREATOR);
                    } else if (c14 == 3) {
                        iJ17 = com.bumptech.glide.c.J(i14, parcel);
                    } else if (c14 == 4) {
                        bundleE3 = com.bumptech.glide.c.e(i14, parcel);
                    } else if (c14 == 5) {
                        bArrF2 = com.bumptech.glide.c.f(i14, parcel);
                    } else if (c14 != 1000) {
                        com.bumptech.glide.c.R(i14, parcel);
                    } else {
                        iJ15 = com.bumptech.glide.c.J(i14, parcel);
                    }
                }
                com.bumptech.glide.c.n(iS5, parcel);
                return new c7.b(iJ15, iJ16, pendingIntent, iJ17, bundleE3, bArrF2);
            case 6:
                int iS6 = com.bumptech.glide.c.S(parcel);
                while (parcel.dataPosition() < iS6) {
                    int i15 = parcel.readInt();
                    char c15 = (char) i15;
                    if (c15 == 1) {
                        iJ11 = com.bumptech.glide.c.J(i15, parcel);
                    } else if (c15 != 2) {
                        com.bumptech.glide.c.R(i15, parcel);
                    } else {
                        strI7 = com.bumptech.glide.c.i(i15, parcel);
                    }
                }
                com.bumptech.glide.c.n(iS6, parcel);
                return new Scope(iJ11, strI7);
            case 7:
                int iS7 = com.bumptech.glide.c.S(parcel);
                PendingIntent pendingIntent2 = null;
                g7.b bVar3 = null;
                while (parcel.dataPosition() < iS7) {
                    int i16 = parcel.readInt();
                    char c16 = (char) i16;
                    if (c16 == 1) {
                        iJ10 = com.bumptech.glide.c.J(i16, parcel);
                    } else if (c16 == 2) {
                        strI6 = com.bumptech.glide.c.i(i16, parcel);
                    } else if (c16 == 3) {
                        pendingIntent2 = (PendingIntent) com.bumptech.glide.c.h(parcel, i16, PendingIntent.CREATOR);
                    } else if (c16 != 4) {
                        com.bumptech.glide.c.R(i16, parcel);
                    } else {
                        bVar3 = (g7.b) com.bumptech.glide.c.h(parcel, i16, g7.b.CREATOR);
                    }
                }
                com.bumptech.glide.c.n(iS7, parcel);
                return new Status(iJ10, strI6, pendingIntent2, bVar3);
            case 8:
                int iS8 = com.bumptech.glide.c.S(parcel);
                while (parcel.dataPosition() < iS8) {
                    int i17 = parcel.readInt();
                    char c17 = (char) i17;
                    if (c17 == 1) {
                        iJ9 = com.bumptech.glide.c.J(i17, parcel);
                    } else if (c17 != 2) {
                        com.bumptech.glide.c.R(i17, parcel);
                    } else {
                        strI5 = com.bumptech.glide.c.i(i17, parcel);
                    }
                }
                com.bumptech.glide.c.n(iS8, parcel);
                return new com.google.android.gms.common.internal.g(iJ9, strI5);
            case 9:
                int iS9 = com.bumptech.glide.c.S(parcel);
                while (parcel.dataPosition() < iS9) {
                    int i18 = parcel.readInt();
                    char c18 = (char) i18;
                    if (c18 == 1) {
                        iJ8 = com.bumptech.glide.c.J(i18, parcel);
                    } else if (c18 != 2) {
                        com.bumptech.glide.c.R(i18, parcel);
                    } else {
                        arrayListM = com.bumptech.glide.c.m(parcel, i18, r.CREATOR);
                    }
                }
                com.bumptech.glide.c.n(iS9, parcel);
                return new v(iJ8, arrayListM);
            case 10:
                int iS10 = com.bumptech.glide.c.S(parcel);
                int iJ18 = -1;
                long jM2 = 0;
                long jM3 = 0;
                String strI10 = null;
                String strI11 = null;
                int iJ19 = 0;
                int iJ20 = 0;
                int iJ21 = 0;
                int iJ22 = 0;
                while (parcel.dataPosition() < iS10) {
                    int i19 = parcel.readInt();
                    switch ((char) i19) {
                        case 1:
                            iJ19 = com.bumptech.glide.c.J(i19, parcel);
                            break;
                        case 2:
                            iJ20 = com.bumptech.glide.c.J(i19, parcel);
                            break;
                        case 3:
                            iJ21 = com.bumptech.glide.c.J(i19, parcel);
                            break;
                        case 4:
                            jM2 = com.bumptech.glide.c.M(i19, parcel);
                            break;
                        case 5:
                            jM3 = com.bumptech.glide.c.M(i19, parcel);
                            break;
                        case 6:
                            strI10 = com.bumptech.glide.c.i(i19, parcel);
                            break;
                        case 7:
                            strI11 = com.bumptech.glide.c.i(i19, parcel);
                            break;
                        case '\b':
                            iJ22 = com.bumptech.glide.c.J(i19, parcel);
                            break;
                        case '\t':
                            iJ18 = com.bumptech.glide.c.J(i19, parcel);
                            break;
                        default:
                            com.bumptech.glide.c.R(i19, parcel);
                            break;
                    }
                }
                com.bumptech.glide.c.n(iS10, parcel);
                return new r(iJ19, iJ20, iJ21, jM2, jM3, strI10, strI11, iJ22, iJ18);
            case 11:
                int iS11 = com.bumptech.glide.c.S(parcel);
                GoogleSignInAccount googleSignInAccount = null;
                int iJ23 = 0;
                while (parcel.dataPosition() < iS11) {
                    int i20 = parcel.readInt();
                    char c19 = (char) i20;
                    if (c19 == 1) {
                        iJ7 = com.bumptech.glide.c.J(i20, parcel);
                    } else if (c19 == 2) {
                        account = (Account) com.bumptech.glide.c.h(parcel, i20, Account.CREATOR);
                    } else if (c19 == 3) {
                        iJ23 = com.bumptech.glide.c.J(i20, parcel);
                    } else if (c19 != 4) {
                        com.bumptech.glide.c.R(i20, parcel);
                    } else {
                        googleSignInAccount = (GoogleSignInAccount) com.bumptech.glide.c.h(parcel, i20, GoogleSignInAccount.CREATOR);
                    }
                }
                com.bumptech.glide.c.n(iS11, parcel);
                return new a0(iJ7, account, iJ23, googleSignInAccount);
            case 12:
                int iS12 = com.bumptech.glide.c.S(parcel);
                IBinder iBinderI = null;
                g7.b bVar4 = null;
                int iJ24 = 0;
                boolean zE2 = false;
                boolean zE3 = false;
                while (parcel.dataPosition() < iS12) {
                    int i21 = parcel.readInt();
                    char c20 = (char) i21;
                    if (c20 == 1) {
                        iJ24 = com.bumptech.glide.c.J(i21, parcel);
                    } else if (c20 == 2) {
                        iBinderI = com.bumptech.glide.c.I(i21, parcel);
                    } else if (c20 == 3) {
                        bVar4 = (g7.b) com.bumptech.glide.c.h(parcel, i21, g7.b.CREATOR);
                    } else if (c20 == 4) {
                        zE2 = com.bumptech.glide.c.E(i21, parcel);
                    } else if (c20 != 5) {
                        com.bumptech.glide.c.R(i21, parcel);
                    } else {
                        zE3 = com.bumptech.glide.c.E(i21, parcel);
                    }
                }
                com.bumptech.glide.c.n(iS12, parcel);
                return new b0(iJ24, iBinderI, bVar4, zE2, zE3);
            case 13:
                int iS13 = com.bumptech.glide.c.S(parcel);
                int iJ25 = 0;
                int iJ26 = 0;
                int iJ27 = 0;
                boolean zE4 = false;
                boolean zE5 = false;
                while (parcel.dataPosition() < iS13) {
                    int i22 = parcel.readInt();
                    char c21 = (char) i22;
                    if (c21 == 1) {
                        iJ25 = com.bumptech.glide.c.J(i22, parcel);
                    } else if (c21 == 2) {
                        zE4 = com.bumptech.glide.c.E(i22, parcel);
                    } else if (c21 == 3) {
                        zE5 = com.bumptech.glide.c.E(i22, parcel);
                    } else if (c21 == 4) {
                        iJ26 = com.bumptech.glide.c.J(i22, parcel);
                    } else if (c21 != 5) {
                        com.bumptech.glide.c.R(i22, parcel);
                    } else {
                        iJ27 = com.bumptech.glide.c.J(i22, parcel);
                    }
                }
                com.bumptech.glide.c.n(iS13, parcel);
                return new u(iJ25, iJ26, iJ27, zE4, zE5);
            case 14:
                int iS14 = com.bumptech.glide.c.S(parcel);
                g7.d[] dVarArr = null;
                j jVar = null;
                while (parcel.dataPosition() < iS14) {
                    int i23 = parcel.readInt();
                    char c22 = (char) i23;
                    if (c22 == 1) {
                        bundleE = com.bumptech.glide.c.e(i23, parcel);
                    } else if (c22 == 2) {
                        dVarArr = (g7.d[]) com.bumptech.glide.c.l(parcel, i23, g7.d.CREATOR);
                    } else if (c22 == 3) {
                        iJ6 = com.bumptech.glide.c.J(i23, parcel);
                    } else if (c22 != 4) {
                        com.bumptech.glide.c.R(i23, parcel);
                    } else {
                        jVar = (j) com.bumptech.glide.c.h(parcel, i23, j.CREATOR);
                    }
                }
                com.bumptech.glide.c.n(iS14, parcel);
                o0 o0Var = new o0();
                o0Var.f2232a = bundleE;
                o0Var.f2233b = dVarArr;
                o0Var.f2234c = iJ6;
                o0Var.f2235d = jVar;
                return o0Var;
            case 15:
                int iS15 = com.bumptech.glide.c.S(parcel);
                u uVar = null;
                int[] iArrG = null;
                int[] iArrG2 = null;
                boolean zE6 = false;
                boolean zE7 = false;
                int iJ28 = 0;
                while (parcel.dataPosition() < iS15) {
                    int i24 = parcel.readInt();
                    switch ((char) i24) {
                        case 1:
                            uVar = (u) com.bumptech.glide.c.h(parcel, i24, u.CREATOR);
                            break;
                        case 2:
                            zE6 = com.bumptech.glide.c.E(i24, parcel);
                            break;
                        case 3:
                            zE7 = com.bumptech.glide.c.E(i24, parcel);
                            break;
                        case 4:
                            iArrG = com.bumptech.glide.c.g(i24, parcel);
                            break;
                        case 5:
                            iJ28 = com.bumptech.glide.c.J(i24, parcel);
                            break;
                        case 6:
                            iArrG2 = com.bumptech.glide.c.g(i24, parcel);
                            break;
                        default:
                            com.bumptech.glide.c.R(i24, parcel);
                            break;
                    }
                }
                com.bumptech.glide.c.n(iS15, parcel);
                return new j(uVar, zE6, zE7, iArrG, iJ28, iArrG2);
            case 16:
                int iS16 = com.bumptech.glide.c.S(parcel);
                Bundle bundle = new Bundle();
                Scope[] scopeArr = k.f2209z;
                g7.d[] dVarArr2 = k.A;
                g7.d[] dVarArr3 = dVarArr2;
                String strI12 = null;
                IBinder iBinderI2 = null;
                Account account2 = null;
                String strI13 = null;
                int iJ29 = 0;
                int iJ30 = 0;
                int iJ31 = 0;
                boolean zE8 = false;
                int iJ32 = 0;
                boolean zE9 = false;
                while (parcel.dataPosition() < iS16) {
                    int i25 = parcel.readInt();
                    switch ((char) i25) {
                        case 1:
                            iJ29 = com.bumptech.glide.c.J(i25, parcel);
                            break;
                        case 2:
                            iJ30 = com.bumptech.glide.c.J(i25, parcel);
                            break;
                        case 3:
                            iJ31 = com.bumptech.glide.c.J(i25, parcel);
                            break;
                        case 4:
                            strI12 = com.bumptech.glide.c.i(i25, parcel);
                            break;
                        case 5:
                            iBinderI2 = com.bumptech.glide.c.I(i25, parcel);
                            break;
                        case 6:
                            scopeArr = (Scope[]) com.bumptech.glide.c.l(parcel, i25, Scope.CREATOR);
                            break;
                        case 7:
                            bundle = com.bumptech.glide.c.e(i25, parcel);
                            break;
                        case '\b':
                            account2 = (Account) com.bumptech.glide.c.h(parcel, i25, Account.CREATOR);
                            break;
                        case '\t':
                        default:
                            com.bumptech.glide.c.R(i25, parcel);
                            break;
                        case '\n':
                            dVarArr2 = (g7.d[]) com.bumptech.glide.c.l(parcel, i25, g7.d.CREATOR);
                            break;
                        case 11:
                            dVarArr3 = (g7.d[]) com.bumptech.glide.c.l(parcel, i25, g7.d.CREATOR);
                            break;
                        case '\f':
                            zE8 = com.bumptech.glide.c.E(i25, parcel);
                            break;
                        case '\r':
                            iJ32 = com.bumptech.glide.c.J(i25, parcel);
                            break;
                        case 14:
                            zE9 = com.bumptech.glide.c.E(i25, parcel);
                            break;
                        case 15:
                            strI13 = com.bumptech.glide.c.i(i25, parcel);
                            break;
                    }
                }
                com.bumptech.glide.c.n(iS16, parcel);
                return new k(iJ29, iJ30, iJ31, strI12, iBinderI2, scopeArr, bundle, account2, dVarArr2, dVarArr3, zE8, iJ32, zE9, strI13);
            case 17:
                return new com.google.android.material.datepicker.b((com.google.android.material.datepicker.r) parcel.readParcelable(com.google.android.material.datepicker.r.class.getClassLoader()), (com.google.android.material.datepicker.r) parcel.readParcelable(com.google.android.material.datepicker.r.class.getClassLoader()), (com.google.android.material.datepicker.d) parcel.readParcelable(com.google.android.material.datepicker.d.class.getClassLoader()), (com.google.android.material.datepicker.r) parcel.readParcelable(com.google.android.material.datepicker.r.class.getClassLoader()), parcel.readInt());
            case 18:
                return new com.google.android.material.datepicker.d(parcel.readLong());
            case 19:
                return com.google.android.material.datepicker.r.a(parcel.readInt(), parcel.readInt());
            case 20:
                int iS17 = com.bumptech.glide.c.S(parcel);
                float fH = 0.0f;
                String strI14 = null;
                boolean zE10 = false;
                boolean zE11 = false;
                boolean zE12 = false;
                int iJ33 = 0;
                boolean zE13 = false;
                boolean zE14 = false;
                boolean zE15 = false;
                while (parcel.dataPosition() < iS17) {
                    int i26 = parcel.readInt();
                    switch ((char) i26) {
                        case 2:
                            zE10 = com.bumptech.glide.c.E(i26, parcel);
                            break;
                        case 3:
                            zE11 = com.bumptech.glide.c.E(i26, parcel);
                            break;
                        case 4:
                            strI14 = com.bumptech.glide.c.i(i26, parcel);
                            break;
                        case 5:
                            zE12 = com.bumptech.glide.c.E(i26, parcel);
                            break;
                        case 6:
                            fH = com.bumptech.glide.c.H(i26, parcel);
                            break;
                        case 7:
                            iJ33 = com.bumptech.glide.c.J(i26, parcel);
                            break;
                        case '\b':
                            zE13 = com.bumptech.glide.c.E(i26, parcel);
                            break;
                        case '\t':
                            zE14 = com.bumptech.glide.c.E(i26, parcel);
                            break;
                        case '\n':
                            zE15 = com.bumptech.glide.c.E(i26, parcel);
                            break;
                        default:
                            com.bumptech.glide.c.R(i26, parcel);
                            break;
                    }
                }
                com.bumptech.glide.c.n(iS17, parcel);
                return new i(zE10, zE11, strI14, zE12, fH, iJ33, zE13, zE14, zE15);
            case zzbbs.zzt.zzm /* 21 */:
                int iS18 = com.bumptech.glide.c.S(parcel);
                String strI15 = null;
                while (parcel.dataPosition() < iS18) {
                    int i27 = parcel.readInt();
                    char c23 = (char) i27;
                    if (c23 == 1) {
                        strI4 = com.bumptech.glide.c.i(i27, parcel);
                    } else if (c23 != 2) {
                        com.bumptech.glide.c.R(i27, parcel);
                    } else {
                        strI15 = com.bumptech.glide.c.i(i27, parcel);
                    }
                }
                com.bumptech.glide.c.n(iS18, parcel);
                return new e6.o0(strI4, strI15);
            case 22:
                int iS19 = com.bumptech.glide.c.S(parcel);
                while (parcel.dataPosition() < iS19) {
                    int i28 = parcel.readInt();
                    if (((char) i28) != 2) {
                        com.bumptech.glide.c.R(i28, parcel);
                    } else {
                        iJ5 = com.bumptech.glide.c.J(i28, parcel);
                    }
                }
                com.bumptech.glide.c.n(iS19, parcel);
                return new m2(iJ5);
            case 23:
                int iS20 = com.bumptech.glide.c.S(parcel);
                String strI16 = null;
                String strI17 = null;
                h2 h2Var = null;
                IBinder iBinderI3 = null;
                int iJ34 = 0;
                while (parcel.dataPosition() < iS20) {
                    int i29 = parcel.readInt();
                    char c24 = (char) i29;
                    if (c24 == 1) {
                        iJ34 = com.bumptech.glide.c.J(i29, parcel);
                    } else if (c24 == 2) {
                        strI16 = com.bumptech.glide.c.i(i29, parcel);
                    } else if (c24 == 3) {
                        strI17 = com.bumptech.glide.c.i(i29, parcel);
                    } else if (c24 == 4) {
                        h2Var = (h2) com.bumptech.glide.c.h(parcel, i29, h2.CREATOR);
                    } else if (c24 != 5) {
                        com.bumptech.glide.c.R(i29, parcel);
                    } else {
                        iBinderI3 = com.bumptech.glide.c.I(i29, parcel);
                    }
                }
                com.bumptech.glide.c.n(iS20, parcel);
                return new h2(iJ34, strI16, strI17, h2Var, iBinderI3);
            case 24:
                int iS21 = com.bumptech.glide.c.S(parcel);
                int iJ35 = 0;
                while (parcel.dataPosition() < iS21) {
                    int i30 = parcel.readInt();
                    char c25 = (char) i30;
                    if (c25 == 1) {
                        iJ4 = com.bumptech.glide.c.J(i30, parcel);
                    } else if (c25 == 2) {
                        iJ35 = com.bumptech.glide.c.J(i30, parcel);
                    } else if (c25 != 3) {
                        com.bumptech.glide.c.R(i30, parcel);
                    } else {
                        strI3 = com.bumptech.glide.c.i(i30, parcel);
                    }
                }
                com.bumptech.glide.c.n(iS21, parcel);
                return new w2(iJ4, iJ35, strI3);
            case 25:
                int iS22 = com.bumptech.glide.c.S(parcel);
                o3 o3Var = null;
                int iJ36 = 0;
                while (parcel.dataPosition() < iS22) {
                    int i31 = parcel.readInt();
                    char c26 = (char) i31;
                    if (c26 == 1) {
                        strI2 = com.bumptech.glide.c.i(i31, parcel);
                    } else if (c26 == 2) {
                        iJ3 = com.bumptech.glide.c.J(i31, parcel);
                    } else if (c26 == 3) {
                        o3Var = (o3) com.bumptech.glide.c.h(parcel, i31, o3.CREATOR);
                    } else if (c26 != 4) {
                        com.bumptech.glide.c.R(i31, parcel);
                    } else {
                        iJ36 = com.bumptech.glide.c.J(i31, parcel);
                    }
                }
                com.bumptech.glide.c.n(iS22, parcel);
                return new h3(strI2, iJ3, o3Var, iJ36);
            case 26:
                int iS23 = com.bumptech.glide.c.S(parcel);
                int iJ37 = 0;
                while (parcel.dataPosition() < iS23) {
                    int i32 = parcel.readInt();
                    char c27 = (char) i32;
                    if (c27 == 1) {
                        iJ2 = com.bumptech.glide.c.J(i32, parcel);
                    } else if (c27 != 2) {
                        com.bumptech.glide.c.R(i32, parcel);
                    } else {
                        iJ37 = com.bumptech.glide.c.J(i32, parcel);
                    }
                }
                com.bumptech.glide.c.n(iS23, parcel);
                return new i3(iJ2, iJ37);
            case 27:
                int iS24 = com.bumptech.glide.c.S(parcel);
                while (parcel.dataPosition() < iS24) {
                    int i33 = parcel.readInt();
                    if (((char) i33) != 15) {
                        com.bumptech.glide.c.R(i33, parcel);
                    } else {
                        strI = com.bumptech.glide.c.i(i33, parcel);
                    }
                }
                com.bumptech.glide.c.n(iS24, parcel);
                return new j3(strI);
            case 28:
                int iS25 = com.bumptech.glide.c.S(parcel);
                boolean zE16 = false;
                boolean zE17 = false;
                while (parcel.dataPosition() < iS25) {
                    int i34 = parcel.readInt();
                    char c28 = (char) i34;
                    if (c28 == 2) {
                        zE = com.bumptech.glide.c.E(i34, parcel);
                    } else if (c28 == 3) {
                        zE16 = com.bumptech.glide.c.E(i34, parcel);
                    } else if (c28 != 4) {
                        com.bumptech.glide.c.R(i34, parcel);
                    } else {
                        zE17 = com.bumptech.glide.c.E(i34, parcel);
                    }
                }
                com.bumptech.glide.c.n(iS25, parcel);
                return new l3(zE, zE16, zE17);
            default:
                int iS26 = com.bumptech.glide.c.S(parcel);
                long jM4 = 0;
                long jM5 = 0;
                Bundle bundleE4 = null;
                ArrayList arrayListK2 = null;
                String strI18 = null;
                j3 j3Var = null;
                Location location = null;
                String strI19 = null;
                Bundle bundleE5 = null;
                Bundle bundleE6 = null;
                ArrayList arrayListK3 = null;
                String strI20 = null;
                String strI21 = null;
                e6.o0 o0Var2 = null;
                String strI22 = null;
                ArrayList arrayListK4 = null;
                String strI23 = null;
                int iJ38 = 0;
                int iJ39 = 0;
                boolean zE18 = false;
                int iJ40 = 0;
                boolean zE19 = false;
                boolean zE20 = false;
                int iJ41 = 0;
                int iJ42 = 0;
                int iJ43 = 0;
                while (parcel.dataPosition() < iS26) {
                    int i35 = parcel.readInt();
                    switch ((char) i35) {
                        case 1:
                            iJ38 = com.bumptech.glide.c.J(i35, parcel);
                            break;
                        case 2:
                            jM4 = com.bumptech.glide.c.M(i35, parcel);
                            break;
                        case 3:
                            bundleE4 = com.bumptech.glide.c.e(i35, parcel);
                            break;
                        case 4:
                            iJ39 = com.bumptech.glide.c.J(i35, parcel);
                            break;
                        case 5:
                            arrayListK2 = com.bumptech.glide.c.k(i35, parcel);
                            break;
                        case 6:
                            zE18 = com.bumptech.glide.c.E(i35, parcel);
                            break;
                        case 7:
                            iJ40 = com.bumptech.glide.c.J(i35, parcel);
                            break;
                        case '\b':
                            zE19 = com.bumptech.glide.c.E(i35, parcel);
                            break;
                        case '\t':
                            strI18 = com.bumptech.glide.c.i(i35, parcel);
                            break;
                        case '\n':
                            j3Var = (j3) com.bumptech.glide.c.h(parcel, i35, j3.CREATOR);
                            break;
                        case 11:
                            location = (Location) com.bumptech.glide.c.h(parcel, i35, Location.CREATOR);
                            break;
                        case '\f':
                            strI19 = com.bumptech.glide.c.i(i35, parcel);
                            break;
                        case '\r':
                            bundleE5 = com.bumptech.glide.c.e(i35, parcel);
                            break;
                        case 14:
                            bundleE6 = com.bumptech.glide.c.e(i35, parcel);
                            break;
                        case 15:
                            arrayListK3 = com.bumptech.glide.c.k(i35, parcel);
                            break;
                        case 16:
                            strI20 = com.bumptech.glide.c.i(i35, parcel);
                            break;
                        case 17:
                            strI21 = com.bumptech.glide.c.i(i35, parcel);
                            break;
                        case 18:
                            zE20 = com.bumptech.glide.c.E(i35, parcel);
                            break;
                        case 19:
                            o0Var2 = (e6.o0) com.bumptech.glide.c.h(parcel, i35, e6.o0.CREATOR);
                            break;
                        case 20:
                            iJ41 = com.bumptech.glide.c.J(i35, parcel);
                            break;
                        case zzbbs.zzt.zzm /* 21 */:
                            strI22 = com.bumptech.glide.c.i(i35, parcel);
                            break;
                        case 22:
                            arrayListK4 = com.bumptech.glide.c.k(i35, parcel);
                            break;
                        case 23:
                            iJ42 = com.bumptech.glide.c.J(i35, parcel);
                            break;
                        case 24:
                            strI23 = com.bumptech.glide.c.i(i35, parcel);
                            break;
                        case 25:
                            iJ43 = com.bumptech.glide.c.J(i35, parcel);
                            break;
                        case 26:
                            jM5 = com.bumptech.glide.c.M(i35, parcel);
                            break;
                        default:
                            com.bumptech.glide.c.R(i35, parcel);
                            break;
                    }
                }
                com.bumptech.glide.c.n(iS26, parcel);
                return new o3(iJ38, jM4, bundleE4, iJ39, arrayListK2, zE18, iJ40, zE19, strI18, j3Var, location, strI19, bundleE5, bundleE6, arrayListK3, strI20, strI21, zE20, o0Var2, iJ41, strI22, arrayListK4, iJ42, strI23, iJ43, jM5);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f1429a) {
            case 0:
                return new e[i];
            case 1:
                return new g[i];
            case 2:
                return new h[i];
            case 3:
                return new c.d[i];
            case 4:
                return new c7.a[i];
            case 5:
                return new c7.b[i];
            case 6:
                return new Scope[i];
            case 7:
                return new Status[i];
            case 8:
                return new com.google.android.gms.common.internal.g[i];
            case 9:
                return new v[i];
            case 10:
                return new r[i];
            case 11:
                return new a0[i];
            case 12:
                return new b0[i];
            case 13:
                return new u[i];
            case 14:
                return new o0[i];
            case 15:
                return new j[i];
            case 16:
                return new k[i];
            case 17:
                return new com.google.android.material.datepicker.b[i];
            case 18:
                return new com.google.android.material.datepicker.d[i];
            case 19:
                return new com.google.android.material.datepicker.r[i];
            case 20:
                return new i[i];
            case zzbbs.zzt.zzm /* 21 */:
                return new e6.o0[i];
            case 22:
                return new m2[i];
            case 23:
                return new h2[i];
            case 24:
                return new w2[i];
            case 25:
                return new h3[i];
            case 26:
                return new i3[i];
            case 27:
                return new j3[i];
            case 28:
                return new l3[i];
            default:
                return new o3[i];
        }
    }
}
