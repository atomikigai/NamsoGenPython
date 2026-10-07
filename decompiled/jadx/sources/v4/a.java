package v4;

import android.content.Intent;
import com.firebase.ui.auth.ui.credentials.CredentialSaveActivity;
import com.firebase.ui.auth.ui.idp.AuthMethodPickerActivity;
import com.firebase.ui.auth.ui.idp.SingleSignInActivity;
import com.firebase.ui.auth.ui.idp.WelcomeBackIdpPrompt;
import d5.d;
import r4.e;
import r4.f;
import r4.i;
import u4.c;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends d {
    public final /* synthetic */ int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f9167f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ c f9168r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(c cVar, c cVar2, Object obj, int i) {
        super(cVar2);
        this.e = i;
        this.f9168r = cVar;
        this.f9167f = obj;
    }

    @Override // d5.d
    public final void a(Exception exc) {
        switch (this.e) {
            case 0:
                ((CredentialSaveActivity) this.f9168r).u(((i) this.f9167f).g(), -1);
                break;
            case 1:
                if (!(exc instanceof f)) {
                    c(i.a(exc));
                } else {
                    ((AuthMethodPickerActivity) this.f9168r).u(new Intent().putExtra("extra_idp_response", i.a(exc)), 0);
                }
                break;
            case 2:
                SingleSignInActivity singleSignInActivity = (SingleSignInActivity) this.f9168r;
                if (!(exc instanceof f)) {
                    singleSignInActivity.O.j(i.a(exc));
                } else {
                    singleSignInActivity.u(new Intent().putExtra("extra_idp_response", i.a(exc)), 0);
                }
                break;
            default:
                ((f5.d) this.f9167f).i(i.a(exc));
                break;
        }
    }

    @Override // d5.d
    public final void b(Object obj) {
        switch (this.e) {
            case 0:
                ((CredentialSaveActivity) this.f9168r).u(((i) obj).g(), -1);
                break;
            case 1:
                c((i) obj);
                break;
            case 2:
                i iVar = (i) obj;
                SingleSignInActivity singleSignInActivity = (SingleSignInActivity) this.f9168r;
                if (e.e.contains((String) this.f9167f)) {
                    singleSignInActivity.v();
                } else if (iVar.f()) {
                    singleSignInActivity.u(iVar.g(), iVar.f() ? -1 : 0);
                }
                singleSignInActivity.O.j(iVar);
                break;
            default:
                i iVar2 = (i) obj;
                f5.d dVar = (f5.d) this.f9167f;
                WelcomeBackIdpPrompt welcomeBackIdpPrompt = (WelcomeBackIdpPrompt) this.f9168r;
                welcomeBackIdpPrompt.v();
                if (!e.e.contains(iVar2.e()) && iVar2.f8166b == null && dVar.f3601j == null) {
                    welcomeBackIdpPrompt.u(iVar2.g(), -1);
                } else {
                    dVar.i(iVar2);
                }
                break;
        }
    }

    public void c(i iVar) {
        boolean z4;
        AuthMethodPickerActivity authMethodPickerActivity = (AuthMethodPickerActivity) this.f9168r;
        if (e.e.contains((String) this.f9167f)) {
            authMethodPickerActivity.v();
            z4 = true;
        } else {
            z4 = false;
        }
        if (!iVar.f()) {
            authMethodPickerActivity.L.j(iVar);
        } else if (z4) {
            authMethodPickerActivity.L.j(iVar);
        } else {
            authMethodPickerActivity.u(iVar.g(), iVar.f() ? -1 : 0);
        }
    }
}
