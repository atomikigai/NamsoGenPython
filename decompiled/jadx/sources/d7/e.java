package d7;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3011a;

    public /* synthetic */ e(int i) {
        this.f3011a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f3011a) {
            case 0:
                int iS = com.bumptech.glide.c.S(parcel);
                String strI = null;
                String strI2 = null;
                String strI3 = null;
                String strI4 = null;
                Uri uri = null;
                String strI5 = null;
                String strI6 = null;
                ArrayList arrayListM = null;
                String strI7 = null;
                String strI8 = null;
                long jM = 0;
                int iJ = 0;
                while (parcel.dataPosition() < iS) {
                    int i = parcel.readInt();
                    switch ((char) i) {
                        case 1:
                            iJ = com.bumptech.glide.c.J(i, parcel);
                            break;
                        case 2:
                            strI = com.bumptech.glide.c.i(i, parcel);
                            break;
                        case 3:
                            strI2 = com.bumptech.glide.c.i(i, parcel);
                            break;
                        case 4:
                            strI3 = com.bumptech.glide.c.i(i, parcel);
                            break;
                        case 5:
                            strI4 = com.bumptech.glide.c.i(i, parcel);
                            break;
                        case 6:
                            uri = (Uri) com.bumptech.glide.c.h(parcel, i, Uri.CREATOR);
                            break;
                        case 7:
                            strI5 = com.bumptech.glide.c.i(i, parcel);
                            break;
                        case '\b':
                            jM = com.bumptech.glide.c.M(i, parcel);
                            break;
                        case '\t':
                            strI6 = com.bumptech.glide.c.i(i, parcel);
                            break;
                        case '\n':
                            arrayListM = com.bumptech.glide.c.m(parcel, i, Scope.CREATOR);
                            break;
                        case 11:
                            strI7 = com.bumptech.glide.c.i(i, parcel);
                            break;
                        case '\f':
                            strI8 = com.bumptech.glide.c.i(i, parcel);
                            break;
                        default:
                            com.bumptech.glide.c.R(i, parcel);
                            break;
                    }
                }
                com.bumptech.glide.c.n(iS, parcel);
                return new GoogleSignInAccount(iJ, strI, strI2, strI3, strI4, uri, strI5, jM, strI6, arrayListM, strI7, strI8);
            case 1:
                int iS2 = com.bumptech.glide.c.S(parcel);
                ArrayList arrayListM2 = null;
                ArrayList arrayListM3 = null;
                Account account = null;
                String strI9 = null;
                String strI10 = null;
                String strI11 = null;
                int iJ2 = 0;
                boolean zE = false;
                boolean zE2 = false;
                boolean zE3 = false;
                while (parcel.dataPosition() < iS2) {
                    int i10 = parcel.readInt();
                    switch ((char) i10) {
                        case 1:
                            iJ2 = com.bumptech.glide.c.J(i10, parcel);
                            break;
                        case 2:
                            arrayListM3 = com.bumptech.glide.c.m(parcel, i10, Scope.CREATOR);
                            break;
                        case 3:
                            account = (Account) com.bumptech.glide.c.h(parcel, i10, Account.CREATOR);
                            break;
                        case 4:
                            zE = com.bumptech.glide.c.E(i10, parcel);
                            break;
                        case 5:
                            zE2 = com.bumptech.glide.c.E(i10, parcel);
                            break;
                        case 6:
                            zE3 = com.bumptech.glide.c.E(i10, parcel);
                            break;
                        case 7:
                            strI9 = com.bumptech.glide.c.i(i10, parcel);
                            break;
                        case '\b':
                            strI10 = com.bumptech.glide.c.i(i10, parcel);
                            break;
                        case '\t':
                            arrayListM2 = com.bumptech.glide.c.m(parcel, i10, e7.a.CREATOR);
                            break;
                        case '\n':
                            strI11 = com.bumptech.glide.c.i(i10, parcel);
                            break;
                        default:
                            com.bumptech.glide.c.R(i10, parcel);
                            break;
                    }
                }
                com.bumptech.glide.c.n(iS2, parcel);
                return new GoogleSignInOptions(iJ2, arrayListM3, account, zE, zE2, zE3, strI9, strI10, GoogleSignInOptions.h(arrayListM2), strI11);
            default:
                int iS3 = com.bumptech.glide.c.S(parcel);
                String strI12 = "";
                GoogleSignInAccount googleSignInAccount = null;
                String strI13 = "";
                while (parcel.dataPosition() < iS3) {
                    int i11 = parcel.readInt();
                    char c10 = (char) i11;
                    if (c10 == 4) {
                        strI12 = com.bumptech.glide.c.i(i11, parcel);
                    } else if (c10 == 7) {
                        googleSignInAccount = (GoogleSignInAccount) com.bumptech.glide.c.h(parcel, i11, GoogleSignInAccount.CREATOR);
                    } else if (c10 != '\b') {
                        com.bumptech.glide.c.R(i11, parcel);
                    } else {
                        strI13 = com.bumptech.glide.c.i(i11, parcel);
                    }
                }
                com.bumptech.glide.c.n(iS3, parcel);
                return new SignInAccount(strI12, googleSignInAccount, strI13);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.f3011a) {
            case 0:
                return new GoogleSignInAccount[i];
            case 1:
                return new GoogleSignInOptions[i];
            default:
                return new SignInAccount[i];
        }
    }
}
