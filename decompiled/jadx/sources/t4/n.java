package t4;

import android.app.Application;
import android.os.Bundle;
import android.text.TextUtils;
import com.firebase.ui.auth.ui.email.EmailActivity;
import com.firebase.ui.auth.ui.idp.AuthMethodPickerActivity;
import com.firebase.ui.auth.ui.idp.SingleSignInActivity;
import com.firebase.ui.auth.ui.phone.PhoneActivity;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.internal.i0;
import com.google.firebase.auth.FirebaseAuth;
import v9.m0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class n extends d5.e {
    public n(Application application) {
        super(application);
    }

    public final void i(Credential credential) {
        String str;
        String str2 = credential.f1981a;
        String str3 = credential.e;
        if (!TextUtils.isEmpty(str3)) {
            r4.i iVarC = new fd.e(new s4.i("password", str2, null, null, null)).c();
            f(s4.h.b());
            FirebaseAuth firebaseAuth = this.i;
            firebaseAuth.getClass();
            i0.e(str2);
            i0.e(str3);
            String str4 = firebaseAuth.f2705k;
            new m0(firebaseAuth, str2, false, null, str3, str4).s(firebaseAuth, str4, firebaseAuth.f2708n).addOnSuccessListener(new e5.c(24, this, iVarC)).addOnFailureListener(new e5.c(25, this, credential));
            return;
        }
        String str5 = credential.f1985f;
        if (str5 == null) {
            k();
            return;
        }
        switch (str5) {
            case "https://github.com":
                str = "github.com";
                break;
            case "https://phone.firebase":
                str = "phone";
                break;
            case "https://accounts.google.com":
                str = "google.com";
                break;
            case "https://twitter.com":
                str = "twitter.com";
                break;
            case "https://www.facebook.com":
                str = "facebook.com";
                break;
            default:
                str = null;
                break;
        }
        j(str, str2);
    }

    public final void j(String str, String str2) {
        str.getClass();
        if (str.equals("phone")) {
            Bundle bundle = new Bundle();
            bundle.putString("extra_phone_number", str2);
            Application applicationC = c();
            s4.c cVar = (s4.c) this.f2923f;
            int i = PhoneActivity.M;
            f(s4.h.a(new s4.d(u4.c.t(applicationC, PhoneActivity.class, cVar).putExtra("extra_params", bundle), 107)));
            return;
        }
        if (str.equals("password")) {
            Application applicationC2 = c();
            s4.c cVar2 = (s4.c) this.f2923f;
            int i10 = EmailActivity.L;
            f(s4.h.a(new s4.d(u4.c.t(applicationC2, EmailActivity.class, cVar2).putExtra("extra_email", str2), 106)));
            return;
        }
        Application applicationC3 = c();
        s4.c cVar3 = (s4.c) this.f2923f;
        s4.i iVar = new s4.i(str, str2, null, null, null);
        int i11 = SingleSignInActivity.Q;
        f(s4.h.a(new s4.d(u4.c.t(applicationC3, SingleSignInActivity.class, cVar3).putExtra("extra_user", iVar), 109)));
    }

    public final void k() {
        if (((s4.c) this.f2923f).a()) {
            Application applicationC = c();
            s4.c cVar = (s4.c) this.f2923f;
            int i = AuthMethodPickerActivity.Q;
            f(s4.h.a(new s4.d(u4.c.t(applicationC, AuthMethodPickerActivity.class, cVar), 105)));
            return;
        }
        s4.c cVar2 = (s4.c) this.f2923f;
        r4.c cVar3 = cVar2.f8396c;
        if (cVar3 == null) {
            cVar3 = (r4.c) cVar2.f8395b.get(0);
        }
        String str = cVar3.f8145a;
        str.getClass();
        switch (str) {
            case "phone":
                Application applicationC2 = c();
                s4.c cVar4 = (s4.c) this.f2923f;
                Bundle bundleA = cVar3.a();
                int i10 = PhoneActivity.M;
                f(s4.h.a(new s4.d(u4.c.t(applicationC2, PhoneActivity.class, cVar4).putExtra("extra_params", bundleA), 107)));
                break;
            case "password":
            case "emailLink":
                Application applicationC3 = c();
                s4.c cVar5 = (s4.c) this.f2923f;
                int i11 = EmailActivity.L;
                f(s4.h.a(new s4.d(u4.c.t(applicationC3, EmailActivity.class, cVar5), 106)));
                break;
            default:
                j(str, null);
                break;
        }
    }
}
