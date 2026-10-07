package da;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b0 implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f3094b;

    public /* synthetic */ b0(TaskCompletionSource taskCompletionSource, int i) {
        this.f3093a = i;
        this.f3094b = taskCompletionSource;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        switch (this.f3093a) {
            case 0:
                boolean zIsSuccessful = task.isSuccessful();
                TaskCompletionSource taskCompletionSource = this.f3094b;
                if (zIsSuccessful) {
                    taskCompletionSource.trySetResult(task.getResult());
                } else if (task.getException() != null) {
                    taskCompletionSource.trySetException(task.getException());
                }
                break;
            case 1:
                boolean zIsSuccessful2 = task.isSuccessful();
                TaskCompletionSource taskCompletionSource2 = this.f3094b;
                if (zIsSuccessful2) {
                    taskCompletionSource2.trySetResult(task.getResult());
                } else if (task.getException() != null) {
                    taskCompletionSource2.trySetException(task.getException());
                }
                break;
            default:
                boolean zIsSuccessful3 = task.isSuccessful();
                TaskCompletionSource taskCompletionSource3 = this.f3094b;
                if (zIsSuccessful3) {
                    taskCompletionSource3.setResult(task.getResult());
                } else if (task.getException() != null) {
                    taskCompletionSource3.setException(task.getException());
                }
                break;
        }
        return null;
    }
}
