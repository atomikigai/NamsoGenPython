package t4;

import android.app.Application;
import android.content.Intent;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import java.util.Set;
import v9.f0;
import w9.a0;
import w9.d0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class b extends o {
    public FirebaseAuth h;

    public b(Application application) {
        super(application);
    }

    @Override // d5.f
    public final void e() {
        String str = ((s4.c) this.f2923f).f8394a;
        Set set = r4.e.f8153c;
        this.h = r4.e.a(n9.g.e(str)).f8158b;
    }

    @Override // d5.c
    public final void h(FirebaseAuth firebaseAuth, u4.c cVar, String str) {
        Task taskZzB;
        f(s4.h.b());
        FirebaseAuth firebaseAuth2 = this.h;
        v9.n nVar = firebaseAuth2.f2702f;
        if (nVar == null || !nVar.j()) {
            taskZzB = firebaseAuth2.e.zzB(firebaseAuth2.f2698a, new f0(firebaseAuth2), firebaseAuth2.f2705k);
        } else {
            d0 d0Var = (d0) firebaseAuth2.f2702f;
            d0Var.f9827u = false;
            taskZzB = Tasks.forResult(new a0(d0Var));
        }
        taskZzB.addOnSuccessListener(new a(this)).addOnFailureListener(new a(this));
    }

    @Override // d5.c
    public final void g(int i, int i10, Intent intent) {
    }
}
