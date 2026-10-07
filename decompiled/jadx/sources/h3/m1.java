package h3;

import app.namso_gen.spacehowen.MainActivity;
import com.google.firebase.auth.FirebaseAuth;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MainActivity f4777a;

    public /* synthetic */ m1(MainActivity mainActivity) {
        this.f4777a = mainActivity;
    }

    public final void a(FirebaseAuth firebaseAuth) {
        int i = MainActivity.f1283j0;
        jc.i.e(firebaseAuth, "firebaseAuth");
        v9.n nVar = firebaseAuth.f2702f;
        MainActivity mainActivity = this.f4777a;
        if (nVar != null) {
            rc.b0.q(androidx.lifecycle.i0.e(mainActivity), null, new v1(nVar, mainActivity, null, 1), 3);
        } else {
            mainActivity.f1289f0 = false;
            mainActivity.f1290g0 = false;
            mainActivity.t();
        }
    }
}
