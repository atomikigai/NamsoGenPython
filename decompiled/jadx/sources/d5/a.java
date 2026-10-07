package d5;

import android.app.Application;
import com.google.firebase.auth.FirebaseAuth;
import n9.g;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a extends b {
    public d7.a h;
    public FirebaseAuth i;

    public a(Application application) {
        super(application);
    }

    @Override // d5.f
    public final void e() {
        this.i = FirebaseAuth.getInstance(g.e(((s4.c) this.f2923f).f8394a));
        this.h = n9.b.n(c());
    }
}
