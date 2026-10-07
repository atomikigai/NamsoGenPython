package f5;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import w9.a0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0 f3600b;

    public /* synthetic */ c(a0 a0Var, int i) {
        this.f3599a = i;
        this.f3600b = a0Var;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        switch (this.f3599a) {
            case 0:
                return task.isSuccessful() ? (a0) task.getResult() : this.f3600b;
            default:
                return Tasks.forResult(this.f3600b);
        }
    }
}
