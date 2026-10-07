package f5;

import android.app.Application;
import android.text.TextUtils;
import com.google.firebase.auth.FirebaseAuth;
import r4.i;
import v9.n;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class d extends d5.e {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public v9.d f3601j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f3602k;

    public d(Application application) {
        super(application);
    }

    public final void i(i iVar) {
        n nVar;
        if (!iVar.f()) {
            f(s4.h.a(iVar.f8169f));
            return;
        }
        String strE = iVar.e();
        if (TextUtils.equals(strE, "password") || TextUtils.equals(strE, "phone")) {
            throw new IllegalStateException("This handler cannot be used to link email or phone providers.");
        }
        String str = this.f3602k;
        if (str != null && !str.equals(iVar.c())) {
            f(s4.h.a(new r4.g(6)));
            return;
        }
        f(s4.h.b());
        if (r4.e.f8154d.contains(iVar.e()) && this.f3601j != null && (nVar = this.i.f2702f) != null && !nVar.j()) {
            this.i.f2702f.k(this.f3601j).addOnSuccessListener(new a(this, iVar)).addOnFailureListener(new a5.f(22));
            return;
        }
        a5.b bVarU = a5.b.u();
        v9.d dVarO = com.bumptech.glide.d.o(iVar);
        FirebaseAuth firebaseAuth = this.i;
        s4.c cVar = (s4.c) this.f2923f;
        bVarU.getClass();
        if (!a5.b.s(firebaseAuth, cVar)) {
            this.i.c(dVarO).continueWithTask(new b(this)).addOnCompleteListener(new a(this, iVar));
            return;
        }
        v9.d dVar = this.f3601j;
        if (dVar == null) {
            g(dVarO);
        } else {
            bVarU.v((s4.c) this.f2923f).c(dVarO).continueWithTask(new a5.a(dVar, 0)).addOnSuccessListener(new e5.c(6, this, dVarO)).addOnFailureListener(new b(this));
        }
    }
}
