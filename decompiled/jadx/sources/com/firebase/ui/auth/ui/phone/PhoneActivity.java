package com.firebase.ui.auth.ui.phone;

import a2.l;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.i0;
import androidx.webkit.TracingConfig;
import app.namso_gen.spacehowen.R;
import com.google.android.gms.internal.ads.zzbbs;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import r4.f;
import r4.i;
import u.e;
import u4.a;
import v9.h;
import y4.b;
import y4.c;
import y4.d;
import y4.g;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class PhoneActivity extends a {
    public static final /* synthetic */ int M = 0;
    public d L;

    public static void z(PhoneActivity phoneActivity, Exception exc) {
        TextInputLayout textInputLayout;
        View view;
        View view2;
        b bVar = (b) phoneActivity.p().y("VerifyPhoneFragment");
        g gVar = (g) phoneActivity.p().y("SubmitConfirmationCodeFragment");
        if (bVar == null || (view2 = bVar.P) == null) {
            textInputLayout = (gVar == null || (view = gVar.P) == null) ? null : (TextInputLayout) view.findViewById(R.id.confirmation_code_layout);
        } else {
            textInputLayout = (TextInputLayout) view2.findViewById(R.id.phone_layout);
        }
        if (textInputLayout == null) {
            return;
        }
        if (exc instanceof f) {
            phoneActivity.u(((f) exc).f8159a.g(), 5);
            return;
        }
        int iH = 37;
        if (!(exc instanceof h)) {
            if (exc != null) {
                textInputLayout.setError(phoneActivity.B(37));
                return;
            } else {
                textInputLayout.setError(null);
                return;
            }
        }
        try {
            iH = u3.b.h(((h) exc).f9247a);
        } catch (IllegalArgumentException unused) {
        }
        if (iH == 11) {
            phoneActivity.u(i.a(new r4.g(12)).g(), 0);
        } else {
            textInputLayout.setError(phoneActivity.B(iH));
        }
    }

    public final u4.b A() {
        u4.b bVar = (b) p().y("VerifyPhoneFragment");
        if (bVar == null || bVar.P == null) {
            bVar = (g) p().y("SubmitConfirmationCodeFragment");
        }
        if (bVar == null || bVar.P == null) {
            throw new IllegalStateException("No fragments added");
        }
        return bVar;
    }

    public final String B(int i) {
        int iD = e.d(i);
        if (iD == 15) {
            return getString(R.string.fui_error_too_many_attempts);
        }
        if (iD == 25) {
            return getString(R.string.fui_invalid_phone_number);
        }
        if (iD == 27) {
            return getString(R.string.fui_incorrect_code_dialog_body);
        }
        if (iD == 31) {
            return getString(R.string.fui_error_session_expired);
        }
        if (iD == 32) {
            return getString(R.string.fui_error_quota_exceeded);
        }
        switch (i) {
            case 1:
                return "The custom token format is incorrect. Please check the documentation.";
            case 2:
                return "Invalid configuration. Ensure your app's SHA1 is correct in the Firebase console.";
            case 3:
                return "The supplied auth credential is malformed or has expired.";
            case 4:
                return "The email address is badly formatted.";
            case 5:
                return "The password is invalid or the user does not have a password.";
            case 6:
                return "The supplied credentials do not correspond to the previously signed in user.";
            case 7:
                return "This operation is sensitive and requires recent authentication. Log in again before retrying this request.";
            case 8:
                return "An account already exists with the same email address but different sign-in credentials. Sign in using a provider associated with this email address.";
            case 9:
                return "The email address is already in use by another account.";
            case 10:
                return "This credential is already associated with a different user account.";
            case 11:
                return "The user account has been disabled by an administrator.";
            case 12:
                return "The user's credential has expired. The user must sign in again.";
            case 13:
                return "There is no user record corresponding to this identifier. The user may have been deleted.";
            case 14:
                return "The user's credential is no longer valid. The user must sign in again.";
            case 15:
                return "This operation is not allowed. Enable the sign-in method in the Authentication tab of the Firebase console";
            case 16:
                return "We have blocked all requests from this device due to unusual activity. Try again later.";
            case 17:
                return "The given password is too weak, please choose a stronger password.";
            case 18:
                return "The out of band code has expired.";
            case 19:
                return "The out of band code is invalid. This can happen if the code is malformed, expired, or has already been used.";
            case 20:
                return "The email template corresponding to this action contains invalid characters in its message. Please fix by going to the Auth email templates section in the Firebase Console.";
            case zzbbs.zzt.zzm /* 21 */:
                return "The email corresponding to this action failed to send as the provided recipient email address is invalid.";
            case 22:
                return "The email template corresponding to this action contains an invalid sender email or name. Please fix by going to the Auth email templates section in the Firebase Console.";
            case 23:
                return "An email address must be provided.";
            case 24:
                return "A password must be provided.";
            case 25:
                return "To send verification codes, provide a phone number for the recipient.";
            case 26:
                return "The format of the phone number provided is incorrect. Please enter the phone number in a format that can be parsed into E.164 format. E.164 phone numbers are written in the format [+][country code][subscriber number including area code].";
            case 27:
                return "The phone auth credential was created with an empty sms verification code";
            case 28:
                return "The sms verification code used to create the phone auth credential is invalid. Please resend the verification code sms and be sure use the verification code provided by the user.";
            case 29:
                return "The phone auth credential was created with an empty verification ID";
            case 30:
                return "The verification ID used to create the phone auth credential is invalid.";
            case 31:
                return "An error occurred during authentication using the PhoneAuthCredential. Please retry authentication.";
            case TracingConfig.CATEGORIES_JAVASCRIPT_AND_RENDERING /* 32 */:
                return "The sms code has expired. Please re-send the verification code to try again.";
            case 33:
                return "The sms quota for this project has been exceeded.";
            case 34:
                return "This app is not authorized to use Firebase Authentication. Please verify that the correct package name and SHA-1 are configured in the Firebase Console.";
            case 35:
                return "The API that you are calling is not available on devices without Google Play Services.";
            case 36:
                return "The web operation was canceled by the user";
            case 37:
                return "An unknown error occurred.";
            default:
                throw null;
        }
    }

    @Override // u4.g
    public final void b() {
        A().b();
    }

    @Override // u4.g
    public final void i(int i) {
        A().i(i);
    }

    @Override // androidx.activity.m, android.app.Activity
    public final void onBackPressed() {
        ArrayList arrayList = p().f880d;
        if ((arrayList != null ? arrayList.size() : 0) > 0) {
            p().K();
        } else {
            super.onBackPressed();
        }
    }

    @Override // u4.a, androidx.fragment.app.w, androidx.activity.m, d0.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.fui_activity_register_phone);
        g5.a aVar = (g5.a) new l(this).q(g5.a.class);
        aVar.d(w());
        aVar.f2917g.d(this, new c(this, this, aVar, 0));
        d dVar = (d) new l(this).q(d.class);
        this.L = dVar;
        dVar.d(w());
        d dVar2 = this.L;
        if (dVar2.f10566j == null && bundle != null) {
            dVar2.f10566j = bundle.getString("verification_id");
        }
        this.L.f2917g.d(this, new c(this, this, aVar, 1));
        if (bundle != null) {
            return;
        }
        Bundle bundle2 = getIntent().getExtras().getBundle("extra_params");
        b bVar = new b();
        Bundle bundle3 = new Bundle();
        bundle3.putBundle("extra_params", bundle2);
        bVar.Y(bundle3);
        i0 i0VarP = p();
        i0VarP.getClass();
        androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(i0VarP);
        aVar2.k(R.id.fragment_phone, bVar, "VerifyPhoneFragment");
        aVar2.g();
        aVar2.e(false);
    }

    @Override // androidx.activity.m, d0.i, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("verification_id", this.L.f10566j);
    }
}
