package t4;

import android.app.Application;
import com.google.firebase.auth.FirebaseAuth;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class g extends i {
    public g(Application application) {
        super(application);
    }

    @Override // t4.i, d5.c
    public final void h(FirebaseAuth firebaseAuth, u4.c cVar, String str) {
        f(s4.h.b());
        s4.c cVarW = cVar.w();
        ta.c cVarI = i(str, firebaseAuth);
        if (cVarW != null) {
            a5.b.u().getClass();
            if (a5.b.s(firebaseAuth, cVarW)) {
                cVar.v();
                a5.b.u().v(cVarW).e(cVar, cVarI).addOnSuccessListener(new e5.c(23, this, cVarI)).addOnFailureListener(new f(this));
                return;
            }
        }
        cVar.v();
        firebaseAuth.e(cVar, cVarI).addOnSuccessListener(new h(this, cVarI, 1)).addOnFailureListener(new h(this, cVarI, 2));
    }
}
