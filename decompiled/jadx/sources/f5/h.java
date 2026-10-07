package f5;

import android.app.Application;
import android.content.Intent;
import android.text.TextUtils;
import com.firebase.ui.auth.ui.email.WelcomeBackEmailLinkPrompt;
import com.firebase.ui.auth.ui.email.WelcomeBackPasswordPrompt;
import com.firebase.ui.auth.ui.idp.WelcomeBackIdpPrompt;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import java.util.List;
import r4.i;
import w9.a0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class h extends d5.e {
    public h(Application application) {
        super(application);
    }

    public final void i(int i, int i10, Intent intent) {
        if (i == 108) {
            i iVarB = i.b(intent);
            if (i10 == -1) {
                f(s4.h.c(iVarB));
            } else {
                f(s4.h.a(iVarB == null ? new r4.g(0, "Link canceled by user.") : iVarB.f8169f));
            }
        }
    }

    public final void j(final i iVar) {
        boolean zF = iVar.f();
        v9.d dVar = iVar.f8166b;
        if (!zF && dVar == null && iVar.c() == null) {
            f(s4.h.a(iVar.f8169f));
            return;
        }
        String strE = iVar.e();
        if (TextUtils.equals(strE, "password") || TextUtils.equals(strE, "phone")) {
            throw new IllegalStateException("This handler cannot be used with email or phone providers");
        }
        f(s4.h.b());
        if (dVar != null) {
            final int i = 1;
            com.bumptech.glide.d.l(this.i, (s4.c) this.f2923f, iVar.c()).addOnSuccessListener(new OnSuccessListener(this) { // from class: f5.e

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ h f3604b;

                {
                    this.f3604b = this;
                }

                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    switch (i) {
                        case 0:
                            this.f3604b.h(iVar, (a0) obj);
                            break;
                        default:
                            List list = (List) obj;
                            h hVar = this.f3604b;
                            hVar.getClass();
                            if (!list.isEmpty()) {
                                hVar.k((String) list.get(0), iVar);
                            } else {
                                hVar.f(s4.h.a(new r4.g(3, "No supported providers.")));
                            }
                            break;
                    }
                }
            }).addOnFailureListener(new g(this, 1));
            return;
        }
        v9.d dVarO = com.bumptech.glide.d.o(iVar);
        a5.b bVarU = a5.b.u();
        FirebaseAuth firebaseAuth = this.i;
        s4.c cVar = (s4.c) this.f2923f;
        bVarU.getClass();
        Task taskK = a5.b.s(firebaseAuth, cVar) ? firebaseAuth.f2702f.k(dVarO) : firebaseAuth.c(dVarO);
        final int i10 = 0;
        taskK.continueWithTask(new q3.e(iVar)).addOnSuccessListener(new OnSuccessListener(this) { // from class: f5.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f3604b;

            {
                this.f3604b = this;
            }

            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                switch (i10) {
                    case 0:
                        this.f3604b.h(iVar, (a0) obj);
                        break;
                    default:
                        List list = (List) obj;
                        h hVar = this.f3604b;
                        hVar.getClass();
                        if (!list.isEmpty()) {
                            hVar.k((String) list.get(0), iVar);
                        } else {
                            hVar.f(s4.h.a(new r4.g(3, "No supported providers.")));
                        }
                        break;
                }
            }
        }).addOnFailureListener(new f(this, iVar, dVarO));
    }

    public final void k(String str, i iVar) {
        if (str == null) {
            throw new IllegalStateException("No provider even though we received a FirebaseAuthUserCollisionException");
        }
        if (str.equals("password")) {
            Application applicationC = c();
            s4.c cVar = (s4.c) this.f2923f;
            int i = WelcomeBackPasswordPrompt.R;
            f(s4.h.a(new s4.d(u4.c.t(applicationC, WelcomeBackPasswordPrompt.class, cVar).putExtra("extra_idp_response", iVar), 108)));
            return;
        }
        if (!str.equals("emailLink")) {
            f(s4.h.a(new s4.d(WelcomeBackIdpPrompt.z(c(), (s4.c) this.f2923f, new s4.i(str, iVar.c(), null, null, null), iVar), 108)));
            return;
        }
        Application applicationC2 = c();
        s4.c cVar2 = (s4.c) this.f2923f;
        int i10 = WelcomeBackEmailLinkPrompt.O;
        f(s4.h.a(new s4.d(u4.c.t(applicationC2, WelcomeBackEmailLinkPrompt.class, cVar2).putExtra("extra_idp_response", iVar), 112)));
    }
}
