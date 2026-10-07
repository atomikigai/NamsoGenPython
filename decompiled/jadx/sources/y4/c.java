package y4;

import android.os.Bundle;
import android.widget.Toast;
import androidx.fragment.app.i0;
import app.namso_gen.spacehowen.R;
import com.firebase.ui.auth.ui.phone.PhoneActivity;
import com.google.firebase.auth.FirebaseAuth;
import r4.i;
import s4.h;
import v9.t;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends d5.d {
    public final /* synthetic */ int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g5.a f10564f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ PhoneActivity f10565r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(PhoneActivity phoneActivity, PhoneActivity phoneActivity2, g5.a aVar, int i) {
        super(phoneActivity2, null, phoneActivity2, R.string.fui_progress_dialog_signing_in);
        this.e = i;
        switch (i) {
            case 1:
                this.f10565r = phoneActivity;
                this.f10564f = aVar;
                super(phoneActivity2, null, phoneActivity2, R.string.fui_verifying);
                break;
            default:
                this.f10565r = phoneActivity;
                this.f10564f = aVar;
                break;
        }
    }

    @Override // d5.d
    public final void a(Exception exc) {
        switch (this.e) {
            case 0:
                PhoneActivity.z(this.f10565r, exc);
                break;
            default:
                boolean z4 = exc instanceof s4.g;
                PhoneActivity phoneActivity = this.f10565r;
                if (!z4) {
                    PhoneActivity.z(phoneActivity, exc);
                } else {
                    if (phoneActivity.p().y("SubmitConfirmationCodeFragment") == null) {
                        String str = ((s4.g) exc).f8416b;
                        i0 i0VarP = phoneActivity.p();
                        i0VarP.getClass();
                        androidx.fragment.app.a aVar = new androidx.fragment.app.a(i0VarP);
                        g gVar = new g();
                        Bundle bundle = new Bundle();
                        bundle.putString("extra_phone_number", str);
                        gVar.Y(bundle);
                        aVar.k(R.id.fragment_phone, gVar, "SubmitConfirmationCodeFragment");
                        aVar.c();
                        aVar.e(false);
                    }
                    PhoneActivity.z(phoneActivity, null);
                }
                break;
        }
    }

    @Override // d5.d
    public final void b(Object obj) {
        switch (this.e) {
            case 0:
                this.f10565r.x(this.f10564f.i.f2702f, (i) obj, null);
                return;
            default:
                e eVar = (e) obj;
                if (eVar.f10570c) {
                    PhoneActivity phoneActivity = this.f10565r;
                    Toast.makeText(phoneActivity, R.string.fui_auto_verified, 1).show();
                    i0 i0VarP = phoneActivity.p();
                    if (i0VarP.y("SubmitConfirmationCodeFragment") != null) {
                        i0VarP.K();
                    }
                }
                t tVar = eVar.f10569b;
                i iVarC = new fd.e(new s4.i("phone", null, eVar.f10568a, null, null)).c();
                boolean zF = iVarC.f();
                g5.a aVar = this.f10564f;
                if (!zF) {
                    aVar.f(h.a(iVarC.f8169f));
                    return;
                }
                if (!iVarC.e().equals("phone")) {
                    throw new IllegalStateException("This handler cannot be used without a phone response.");
                }
                aVar.f(h.b());
                a5.b bVarU = a5.b.u();
                FirebaseAuth firebaseAuth = aVar.i;
                s4.c cVar = (s4.c) aVar.f2923f;
                bVarU.getClass();
                (a5.b.s(firebaseAuth, cVar) ? firebaseAuth.f2702f.k(tVar) : firebaseAuth.c(tVar)).addOnSuccessListener(new e5.c(7, aVar, iVarC)).addOnFailureListener(new a5.a(aVar, 5));
                return;
        }
    }
}
