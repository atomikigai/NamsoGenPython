package t4;

import com.google.android.gms.common.api.r;
import com.google.android.gms.internal.p000authapi.zbe;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import w9.a0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements OnSuccessListener, OnFailureListener, OnCompleteListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f8604a;

    public /* synthetic */ m(n nVar) {
        this.f8604a = nVar;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        n nVar = this.f8604a;
        nVar.getClass();
        try {
            nVar.i(((zbe) ((z6.b) task.getResult(com.google.android.gms.common.api.j.class)).f10994a).getCredential());
        } catch (r e) {
            if (e.getStatusCode() == 6) {
                nVar.f(s4.h.a(new s4.e(101, e.getStatus().f2047c)));
            } else {
                nVar.k();
            }
        } catch (com.google.android.gms.common.api.j unused) {
            nVar.k();
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        this.f8604a.f(s4.h.a(exc));
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        a0 a0Var = (a0) obj;
        n nVar = this.f8604a;
        nVar.getClass();
        nVar.h(new fd.e(new s4.i(a0Var.f9804c.f9248a, a0Var.f9802a.f9820b.f9810f, null, null, null)).c(), a0Var);
    }
}
