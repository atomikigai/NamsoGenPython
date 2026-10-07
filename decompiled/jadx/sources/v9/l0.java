package v9;

import com.google.firebase.auth.FirebaseAuth;
import h3.m1;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class l0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9265a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f9266b;

    public l0(FirebaseAuth firebaseAuth) {
        this.f9266b = firebaseAuth;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9265a) {
            case 0:
                FirebaseAuth firebaseAuth = this.f9266b;
                Iterator it = firebaseAuth.f2700c.iterator();
                if (it.hasNext()) {
                    throw q1.a.g(it);
                }
                Iterator it2 = firebaseAuth.f2699b.iterator();
                if (it2.hasNext()) {
                    throw q1.a.g(it2);
                }
                return;
            default:
                FirebaseAuth firebaseAuth2 = this.f9266b;
                Iterator it3 = firebaseAuth2.f2701d.iterator();
                while (it3.hasNext()) {
                    ((m1) it3.next()).a(firebaseAuth2);
                }
                return;
        }
    }

    public l0(FirebaseAuth firebaseAuth, db.b bVar) {
        this.f9266b = firebaseAuth;
    }
}
