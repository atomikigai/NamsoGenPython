package v9;

import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzadz;
import com.google.firebase.auth.FirebaseAuth;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class j0 extends v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9256a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f9258c;

    public j0(FirebaseAuth firebaseAuth, v1.b bVar, j0 j0Var) {
        this.f9257b = bVar;
        this.f9258c = j0Var;
    }

    @Override // v9.v
    public void onCodeAutoRetrievalTimeOut(String str) {
        switch (this.f9256a) {
            case 0:
                ((j0) this.f9258c).onCodeAutoRetrievalTimeOut(str);
                break;
            default:
                super.onCodeAutoRetrievalTimeOut(str);
                break;
        }
    }

    @Override // v9.v
    public final void onCodeSent(String str, u uVar) {
        switch (this.f9256a) {
            case 0:
                ((j0) this.f9258c).onCodeSent(str, uVar);
                break;
            default:
                y4.d dVar = (y4.d) this.f9258c;
                dVar.f10566j = str;
                dVar.f10567k = uVar;
                dVar.f(s4.h.a(new s4.g((String) this.f9257b)));
                break;
        }
    }

    @Override // v9.v
    public final void onVerificationCompleted(t tVar) {
        switch (this.f9256a) {
            case 0:
                ((j0) this.f9258c).onVerificationCompleted(tVar);
                break;
            default:
                ((y4.d) this.f9258c).f(s4.h.c(new y4.e((String) this.f9257b, tVar, true)));
                break;
        }
    }

    @Override // v9.v
    public final void onVerificationFailed(n9.h hVar) {
        int i = this.f9256a;
        Object obj = this.f9258c;
        switch (i) {
            case 0:
                v1.b bVar = (v1.b) this.f9257b;
                String str = bVar.f9117b;
                int i10 = zzadz.zzb;
                if ((hVar instanceof h) && ((h) hVar).f9247a.endsWith("ALTERNATE_CLIENT_IDENTIFIER_REQUIRED")) {
                    bVar.f9118c = true;
                    Log.d("FirebaseAuth", "Re-triggering phone verification with Recaptcha flow forced for phone number ".concat(String.valueOf(str)));
                    FirebaseAuth.i(bVar);
                } else {
                    Log.d("FirebaseAuth", "Invoking original failure callbacks after phone verification failure for " + str + ", error - " + hVar.getMessage());
                    ((j0) obj).onVerificationFailed(hVar);
                }
                break;
            default:
                ((y4.d) obj).f(s4.h.a(hVar));
                break;
        }
    }

    public j0(y4.d dVar, String str) {
        this.f9258c = dVar;
        this.f9257b = str;
    }
}
