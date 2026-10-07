package t4;

import android.app.Application;
import android.content.Intent;
import com.firebase.ui.auth.ui.email.EmailActivity;
import com.google.firebase.auth.FirebaseAuth;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class c extends o {
    public c(Application application) {
        super(application);
    }

    @Override // d5.c
    public final void g(int i, int i10, Intent intent) {
        if (i10 != 5 && i == 106) {
            r4.i iVarB = r4.i.b(intent);
            if (iVarB == null) {
                f(s4.h.a(new s4.j(0)));
            } else {
                f(s4.h.c(iVarB));
            }
        }
    }

    @Override // d5.c
    public final void h(FirebaseAuth firebaseAuth, u4.c cVar, String str) {
        s4.c cVarW = cVar.w();
        int i = EmailActivity.L;
        cVar.startActivityForResult(u4.c.t(cVar, EmailActivity.class, cVarW), 106);
    }
}
