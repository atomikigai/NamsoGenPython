package r4;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;
import androidx.fragment.app.i0;
import androidx.fragment.app.q0;
import app.namso_gen.spacehowen.R;
import com.firebase.ui.auth.KickoffActivity;
import com.firebase.ui.auth.ui.email.EmailActivity;
import com.firebase.ui.auth.ui.email.EmailLinkCatcherActivity;
import com.firebase.ui.auth.ui.email.EmailLinkErrorRecoveryActivity;
import com.firebase.ui.auth.ui.email.RecoverPasswordActivity;
import com.firebase.ui.auth.ui.email.WelcomeBackPasswordPrompt;
import com.firebase.ui.auth.ui.idp.AuthMethodPickerActivity;
import com.firebase.ui.auth.ui.idp.SingleSignInActivity;
import com.firebase.ui.auth.ui.idp.WelcomeBackIdpPrompt;
import com.google.android.material.textfield.TextInputLayout;
import da.v;
import h3.m2;
import java.util.ArrayList;
import java.util.WeakHashMap;
import q0.j0;
import q0.v0;
import v9.m;
import v9.n;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends d5.d {
    public final /* synthetic */ int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f8170f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(u4.a aVar, u4.a aVar2, int i) {
        super(aVar2, null, aVar2, R.string.fui_progress_dialog_signing_in);
        this.e = i;
        this.f8170f = aVar;
    }

    @Override // d5.d
    public final void a(Exception exc) {
        String string;
        String string2;
        int iH;
        int i = this.e;
        int i10 = R.string.fui_error_unknown;
        Object obj = this.f8170f;
        switch (i) {
            case 0:
                KickoffActivity kickoffActivity = (KickoffActivity) obj;
                if (exc instanceof s4.j) {
                    kickoffActivity.u(null, 0);
                } else if (!(exc instanceof f)) {
                    kickoffActivity.u(i.d(exc), 0);
                } else {
                    kickoffActivity.u(new Intent().putExtra("extra_idp_response", ((f) exc).f8159a), 0);
                }
                break;
            case 1:
                w4.b bVar = (w4.b) obj;
                if ((exc instanceof g) && ((g) exc).f8160a == 3) {
                    EmailActivity emailActivity = (EmailActivity) bVar.f9605m0;
                    emailActivity.getClass();
                    emailActivity.u(i.d(new g(3, exc.getMessage())), 0);
                }
                if (exc instanceof n9.i) {
                    d9.j.g(bVar.P, bVar.v(R.string.fui_no_internet)).h();
                }
                break;
            case 2:
                EmailLinkCatcherActivity emailLinkCatcherActivity = (EmailLinkCatcherActivity) obj;
                if (exc instanceof s4.j) {
                    emailLinkCatcherActivity.u(null, 0);
                } else if (exc instanceof f) {
                    emailLinkCatcherActivity.u(new Intent().putExtra("extra_idp_response", ((f) exc).f8159a), 0);
                } else if (exc instanceof g) {
                    int i11 = ((g) exc).f8160a;
                    if (i11 == 8 || i11 == 7 || i11 == 11) {
                        int i12 = EmailLinkCatcherActivity.P;
                        AlertDialog.Builder builder = new AlertDialog.Builder(emailLinkCatcherActivity);
                        if (i11 == 11) {
                            string = emailLinkCatcherActivity.getString(R.string.fui_email_link_different_anonymous_user_header);
                            string2 = emailLinkCatcherActivity.getString(R.string.fui_email_link_different_anonymous_user_message);
                        } else if (i11 == 7) {
                            string = emailLinkCatcherActivity.getString(R.string.fui_email_link_invalid_link_header);
                            string2 = emailLinkCatcherActivity.getString(R.string.fui_email_link_invalid_link_message);
                        } else {
                            string = emailLinkCatcherActivity.getString(R.string.fui_email_link_wrong_device_header);
                            string2 = emailLinkCatcherActivity.getString(R.string.fui_email_link_wrong_device_message);
                        }
                        builder.setTitle(string).setMessage(string2).setPositiveButton(R.string.fui_email_link_dismiss_button, new h3.g(emailLinkCatcherActivity, i11, 1)).create().show();
                    } else if (i11 == 9 || i11 == 6) {
                        EmailLinkCatcherActivity.y(emailLinkCatcherActivity, 115);
                    } else if (i11 == 10) {
                        EmailLinkCatcherActivity.y(emailLinkCatcherActivity, 116);
                    }
                } else if (!(exc instanceof v9.i)) {
                    emailLinkCatcherActivity.u(i.d(exc), 0);
                } else {
                    EmailLinkCatcherActivity.y(emailLinkCatcherActivity, 115);
                }
                break;
            case 3:
                EmailActivity emailActivity2 = (EmailActivity) ((w4.g) obj).f9608l0;
                emailActivity2.getClass();
                emailActivity2.u(i.d(new g(3, exc.getMessage())), 0);
                break;
            case 4:
                ((w4.i) obj).f9614j0.setError(exc.getMessage());
                break;
            case 5:
                RecoverPasswordActivity recoverPasswordActivity = (RecoverPasswordActivity) obj;
                if ((exc instanceof v9.j) || (exc instanceof v9.i)) {
                    recoverPasswordActivity.O.setError(recoverPasswordActivity.getString(R.string.fui_error_email_does_not_exist));
                } else {
                    recoverPasswordActivity.O.setError(recoverPasswordActivity.getString(R.string.fui_error_unknown));
                }
                break;
            case 6:
                w4.k kVar = (w4.k) obj;
                if (exc instanceof m) {
                    kVar.f9623n0.setError(kVar.u().getQuantityString(R.plurals.fui_error_weak_password, R.integer.fui_min_password_length));
                } else if (exc instanceof v9.i) {
                    kVar.f9622m0.setError(kVar.v(R.string.fui_invalid_email_address));
                } else if (!(exc instanceof f)) {
                    kVar.f9622m0.setError(kVar.v(R.string.fui_email_account_creation_error));
                } else {
                    i iVar = ((f) exc).f8159a;
                    EmailActivity emailActivity3 = (EmailActivity) kVar.f9627r0;
                    emailActivity3.getClass();
                    emailActivity3.u(iVar.g(), 5);
                }
                break;
            case 7:
                WelcomeBackPasswordPrompt welcomeBackPasswordPrompt = (WelcomeBackPasswordPrompt) obj;
                if (!(exc instanceof f)) {
                    if (exc instanceof v9.h) {
                        try {
                            iH = u3.b.h(((v9.h) exc).f9247a);
                        } catch (IllegalArgumentException unused) {
                            iH = 37;
                        }
                        if (iH == 11) {
                            welcomeBackPasswordPrompt.u(i.a(new g(12)).g(), 0);
                        }
                    }
                    TextInputLayout textInputLayout = welcomeBackPasswordPrompt.P;
                    if (exc instanceof v9.i) {
                        i10 = R.string.fui_error_invalid_password;
                    }
                    textInputLayout.setError(welcomeBackPasswordPrompt.getString(i10));
                } else {
                    welcomeBackPasswordPrompt.u(((f) exc).f8159a.g(), 5);
                }
                break;
            case 8:
                AuthMethodPickerActivity authMethodPickerActivity = (AuthMethodPickerActivity) obj;
                if (!(exc instanceof s4.j)) {
                    if (exc instanceof f) {
                        authMethodPickerActivity.u(((f) exc).f8159a.g(), 5);
                    } else if (!(exc instanceof g)) {
                        Toast.makeText(authMethodPickerActivity, authMethodPickerActivity.getString(R.string.fui_error_unknown), 0).show();
                    } else {
                        authMethodPickerActivity.u(i.a((g) exc).g(), 0);
                    }
                    break;
                }
                break;
            case 9:
                SingleSignInActivity singleSignInActivity = (SingleSignInActivity) obj;
                if (!(exc instanceof f)) {
                    singleSignInActivity.u(i.d(exc), 0);
                } else {
                    singleSignInActivity.u(new Intent().putExtra("extra_idp_response", ((f) exc).f8159a), 0);
                }
                break;
            case 10:
                WelcomeBackIdpPrompt welcomeBackIdpPrompt = (WelcomeBackIdpPrompt) obj;
                if (!(exc instanceof f)) {
                    welcomeBackIdpPrompt.u(i.d(exc), 0);
                } else {
                    welcomeBackIdpPrompt.u(((f) exc).f8159a.g(), 5);
                }
                break;
        }
    }

    @Override // d5.d
    public final void b(Object obj) {
        int i = this.e;
        Object obj2 = this.f8170f;
        switch (i) {
            case 0:
                ((KickoffActivity) obj2).u(((i) obj).g(), -1);
                return;
            case 1:
                s4.i iVar = (s4.i) obj;
                String str = iVar.f8422b;
                String str2 = iVar.f8421a;
                w4.b bVar = (w4.b) obj2;
                bVar.f9603j0.setText(str);
                if (str2 != null) {
                    if (!str2.equals("password") && !str2.equals("emailLink")) {
                        EmailActivity emailActivity = (EmailActivity) bVar.f9605m0;
                        emailActivity.startActivityForResult(WelcomeBackIdpPrompt.z(emailActivity, emailActivity.w(), iVar, null), 103);
                        emailActivity.overridePendingTransition(R.anim.fui_slide_in_right, R.anim.fui_slide_out_left);
                        return;
                    }
                    EmailActivity emailActivity2 = (EmailActivity) bVar.f9605m0;
                    emailActivity2.getClass();
                    if (str2.equals("emailLink")) {
                        emailActivity2.z(com.bumptech.glide.d.q("emailLink", emailActivity2.w().f8395b), iVar.f8422b);
                        return;
                    }
                    s4.c cVarW = emailActivity2.w();
                    i iVarC = new fd.e(iVar).c();
                    int i10 = WelcomeBackPasswordPrompt.R;
                    emailActivity2.startActivityForResult(u4.c.t(emailActivity2, WelcomeBackPasswordPrompt.class, cVarW).putExtra("extra_idp_response", iVarC), 104);
                    emailActivity2.overridePendingTransition(R.anim.fui_slide_in_right, R.anim.fui_slide_out_left);
                    return;
                }
                w4.a aVar = bVar.f9605m0;
                s4.i iVar2 = new s4.i("password", str, null, iVar.f8424d, iVar.e);
                EmailActivity emailActivity3 = (EmailActivity) aVar;
                TextInputLayout textInputLayout = (TextInputLayout) emailActivity3.findViewById(R.id.email_layout);
                c cVarP = com.bumptech.glide.d.p("password", emailActivity3.w().f8395b);
                if (cVarP == null) {
                    cVarP = com.bumptech.glide.d.p("emailLink", emailActivity3.w().f8395b);
                }
                if (!cVarP.a().getBoolean("extra_allow_new_emails", true)) {
                    textInputLayout.setError(emailActivity3.getString(R.string.fui_error_email_does_not_exist));
                    return;
                }
                i0 i0VarP = emailActivity3.p();
                i0VarP.getClass();
                androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(i0VarP);
                if (cVarP.f8145a.equals("emailLink")) {
                    emailActivity3.z(cVarP, str);
                    return;
                }
                w4.k kVar = new w4.k();
                Bundle bundle = new Bundle();
                bundle.putParcelable("extra_user", iVar2);
                kVar.Y(bundle);
                aVar2.k(R.id.fragment_register_email, kVar, "RegisterEmailFragment");
                if (textInputLayout != null) {
                    String string = emailActivity3.getString(R.string.fui_email_field_name);
                    WeakHashMap weakHashMap = v0.f7946a;
                    j0.v(textInputLayout, string);
                    int i11 = q0.f966a;
                    String strK = j0.k(textInputLayout);
                    if (strK == null) {
                        throw new IllegalArgumentException("Unique transitionNames are required for all sharedElements");
                    }
                    if (aVar2.f827n == null) {
                        aVar2.f827n = new ArrayList();
                        aVar2.f828o = new ArrayList();
                    } else {
                        if (aVar2.f828o.contains(string)) {
                            throw new IllegalArgumentException(v.i("A shared element with the target name '", string, "' has already been added to the transaction."));
                        }
                        if (aVar2.f827n.contains(strK)) {
                            throw new IllegalArgumentException(v.i("A shared element with the source name '", strK, "' has already been added to the transaction."));
                        }
                    }
                    aVar2.f827n.add(strK);
                    aVar2.f828o.add(string);
                }
                aVar2.g();
                aVar2.e(false);
                return;
            case 2:
                ((EmailLinkCatcherActivity) obj2).u(((i) obj).g(), -1);
                return;
            case 3:
                Log.w("EmailLinkFragment", "Email for email link sign in sent successfully.");
                w4.g gVar = (w4.g) obj2;
                gVar.f8859h0.postDelayed(new androidx.activity.d(this, 19), Math.max(750 - (System.currentTimeMillis() - gVar.f8861j0), 0L));
                gVar.f9610n0 = true;
                return;
            case 4:
                EmailLinkErrorRecoveryActivity emailLinkErrorRecoveryActivity = (EmailLinkErrorRecoveryActivity) ((w4.i) obj2).f9616m0;
                emailLinkErrorRecoveryActivity.getClass();
                emailLinkErrorRecoveryActivity.u(((i) obj).g(), -1);
                return;
            case 5:
                RecoverPasswordActivity recoverPasswordActivity = (RecoverPasswordActivity) obj2;
                recoverPasswordActivity.O.setError(null);
                p8.b bVar2 = new p8.b(recoverPasswordActivity);
                bVar2.o();
                String string2 = recoverPasswordActivity.getString(R.string.fui_confirm_recovery_body, (String) obj);
                g.b bVar3 = (g.b) bVar2.f3530b;
                bVar3.f3972f = string2;
                bVar3.f3978n = new m2(recoverPasswordActivity, 3);
                bVar2.n();
                bVar2.m();
                return;
            case 6:
                w4.k kVar2 = (w4.k) obj2;
                n nVar = kVar2.f9617g0.i.f2702f;
                String string3 = kVar2.f9621l0.getText().toString();
                kVar2.f8855f0.x(nVar, (i) obj, string3);
                return;
            case 7:
                WelcomeBackPasswordPrompt welcomeBackPasswordPrompt = (WelcomeBackPasswordPrompt) obj2;
                e5.k kVar3 = welcomeBackPasswordPrompt.M;
                welcomeBackPasswordPrompt.x(kVar3.i.f2702f, (i) obj, kVar3.f3291j);
                return;
            case 8:
                AuthMethodPickerActivity authMethodPickerActivity = (AuthMethodPickerActivity) obj2;
                authMethodPickerActivity.x(authMethodPickerActivity.L.i.f2702f, (i) obj, null);
                return;
            case 9:
                SingleSignInActivity singleSignInActivity = (SingleSignInActivity) obj2;
                singleSignInActivity.x(singleSignInActivity.O.i.f2702f, (i) obj, null);
                return;
            case 10:
                ((WelcomeBackIdpPrompt) obj2).u(((i) obj).g(), -1);
                return;
            default:
                ((y4.b) obj2).c0((s4.f) obj);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(u4.c cVar, u4.c cVar2, int i) {
        super(cVar2);
        this.e = i;
        this.f8170f = cVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(u4.b bVar, u4.b bVar2, int i) {
        super(null, bVar2, bVar2, R.string.fui_progress_dialog_loading);
        this.e = i;
        this.f8170f = bVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(RecoverPasswordActivity recoverPasswordActivity, RecoverPasswordActivity recoverPasswordActivity2) {
        super(recoverPasswordActivity2, null, recoverPasswordActivity2, R.string.fui_progress_dialog_sending);
        this.e = 5;
        this.f8170f = recoverPasswordActivity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(w4.k kVar, w4.k kVar2) {
        super(null, kVar2, kVar2, R.string.fui_progress_dialog_signing_up);
        this.e = 6;
        this.f8170f = kVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(w4.g gVar, w4.g gVar2) {
        super(null, gVar2, gVar2, R.string.fui_progress_dialog_sending);
        this.e = 3;
        this.f8170f = gVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(w4.b bVar, w4.b bVar2) {
        super(null, bVar2, bVar2, R.string.fui_progress_dialog_checking_accounts);
        this.e = 1;
        this.f8170f = bVar;
    }

    private final void c(Exception exc) {
    }
}
