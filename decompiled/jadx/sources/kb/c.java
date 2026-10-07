package kb;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final HashMap f6147d = new HashMap();
    public static final androidx.webkit.a e = new androidx.webkit.a(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f6148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f6149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Task f6150c = null;

    public c(Executor executor, n nVar) {
        this.f6148a = executor;
        this.f6149b = nVar;
    }

    public static Object a(Task task) throws ExecutionException, TimeoutException {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        ib.c cVar = new ib.c(23);
        Executor executor = e;
        task.addOnSuccessListener(executor, cVar);
        task.addOnFailureListener(executor, cVar);
        task.addOnCanceledListener(executor, cVar);
        if (!((CountDownLatch) cVar.f5256b).await(5L, timeUnit)) {
            throw new TimeoutException("Task await timed out.");
        }
        if (task.isSuccessful()) {
            return task.getResult();
        }
        throw new ExecutionException(task.getException());
    }

    public final synchronized Task b() {
        try {
            Task task = this.f6150c;
            if (task == null || (task.isComplete() && !this.f6150c.isSuccessful())) {
                this.f6150c = Tasks.call(this.f6148a, new androidx.webkit.internal.a(this.f6149b, 4));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f6150c;
    }

    public final Task c(e eVar) {
        gb.h hVar = new gb.h(2, this, eVar);
        Executor executor = this.f6148a;
        return Tasks.call(executor, hVar).onSuccessTask(executor, new e5.c(14, this, eVar));
    }
}
