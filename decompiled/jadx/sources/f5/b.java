package f5;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import w9.a0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements OnFailureListener, Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f3598a;

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        this.f3598a.f(s4.h.a(exc));
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        d dVar = this.f3598a;
        dVar.getClass();
        a0 a0Var = (a0) task.getResult();
        v9.d dVar2 = dVar.f3601j;
        return dVar2 == null ? Tasks.forResult(a0Var) : a0Var.f9802a.k(dVar2).continueWith(new c(a0Var, 0));
    }
}
