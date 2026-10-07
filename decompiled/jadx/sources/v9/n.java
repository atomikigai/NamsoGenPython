package v9;

import android.net.Uri;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class n extends h7.a implements c0 {
    public final Task g() {
        return FirebaseAuth.getInstance(n9.g.e(((w9.d0) this).f9821c)).j(this, false);
    }

    public abstract Uri h();

    public abstract String i();

    public abstract boolean j();

    public final Task k(d dVar) {
        com.google.android.gms.common.internal.i0.i(dVar);
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(n9.g.e(((w9.d0) this).f9821c));
        firebaseAuth.getClass();
        return firebaseAuth.e.zzn(firebaseAuth.f2698a, this, dVar.h(), new g0(firebaseAuth, 0));
    }

    public abstract w9.d0 l(List list);

    public abstract void m(ArrayList arrayList);
}
