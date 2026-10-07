package v9;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzadv;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class e0 extends a.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f9239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f9240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f9241c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f9242d;

    public e0(FirebaseAuth firebaseAuth, boolean z4, n nVar, e eVar) {
        this.f9242d = firebaseAuth;
        this.f9239a = z4;
        this.f9240b = nVar;
        this.f9241c = eVar;
    }

    @Override // a.a
    public final Task q(String str) {
        if (TextUtils.isEmpty(str)) {
            Log.i("FirebaseAuth", "Email link login/reauth with empty reCAPTCHA token");
        } else {
            Log.i("FirebaseAuth", "Got reCAPTCHA token for login/reauth with email link");
        }
        boolean z4 = this.f9239a;
        e eVar = this.f9241c;
        FirebaseAuth firebaseAuth = this.f9242d;
        if (!z4) {
            return firebaseAuth.e.zzF(firebaseAuth.f2698a, eVar, str, new f0(firebaseAuth));
        }
        zzadv zzadvVar = firebaseAuth.e;
        n9.g gVar = firebaseAuth.f2698a;
        n nVar = this.f9240b;
        com.google.android.gms.common.internal.i0.i(nVar);
        return zzadvVar.zzr(gVar, nVar, eVar, str, new g0(firebaseAuth, 0));
    }
}
