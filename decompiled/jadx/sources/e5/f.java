package e5;

import android.app.Application;
import android.text.TextUtils;
import com.google.firebase.auth.FirebaseAuth;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class f extends d5.e {
    public f(Application application) {
        super(application);
    }

    public final void i(String str, r4.i iVar) {
        if (TextUtils.isEmpty(str)) {
            f(s4.h.a(new r4.g(6)));
            return;
        }
        a5.b bVarU = a5.b.u();
        a5.c cVar = a5.c.f190c;
        String str2 = ((s4.c) this.f2923f).f8400s;
        if (iVar == null) {
            v9.e eVarS = com.bumptech.glide.c.s(str, str2);
            v9.e eVarS2 = com.bumptech.glide.c.s(str, str2);
            FirebaseAuth firebaseAuth = this.i;
            s4.c cVar2 = (s4.c) this.f2923f;
            bVarU.getClass();
            (a5.b.s(firebaseAuth, cVar2) ? firebaseAuth.f2702f.k(eVarS) : firebaseAuth.c(eVarS)).addOnSuccessListener(new c(1, this, cVar)).addOnFailureListener(new d(this, cVar, eVarS2, 0));
            return;
        }
        v9.d dVarO = com.bumptech.glide.d.o(iVar);
        v9.e eVarS3 = com.bumptech.glide.c.s(iVar.c(), str2);
        FirebaseAuth firebaseAuth2 = this.i;
        s4.c cVar3 = (s4.c) this.f2923f;
        bVarU.getClass();
        if (a5.b.s(firebaseAuth2, cVar3)) {
            bVarU.v((s4.c) this.f2923f).c(eVarS3).continueWithTask(new a5.a(dVarO, 0)).addOnCompleteListener(new d(this, cVar, dVarO, 1));
        } else {
            this.i.c(eVarS3).continueWithTask(new a(this, cVar, dVarO, iVar)).addOnSuccessListener(new e(this)).addOnFailureListener(new e(this));
        }
    }
}
