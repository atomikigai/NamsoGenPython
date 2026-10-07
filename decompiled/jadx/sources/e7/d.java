package e7;

import android.util.Log;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import com.google.android.gms.common.api.o;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public m1.a f3475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f3476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f3477c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f3478d;
    public boolean e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Executor f3479f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile n1.a f3480g;
    public volatile n1.a h;
    public final Semaphore i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Set f3481j;

    public d(SignInHubActivity signInHubActivity, Set set) {
        ThreadPoolExecutor threadPoolExecutor = n1.a.f7150s;
        this.f3476b = false;
        this.f3477c = false;
        this.f3478d = true;
        this.e = false;
        signInHubActivity.getApplicationContext();
        this.f3479f = threadPoolExecutor;
        this.i = new Semaphore(0);
        this.f3481j = set;
    }

    public final void a() {
        if (this.f3480g != null) {
            if (!this.f3476b) {
                this.e = true;
            }
            if (this.h != null) {
                this.f3480g.getClass();
                this.f3480g = null;
                return;
            }
            this.f3480g.getClass();
            n1.a aVar = this.f3480g;
            aVar.f7156d.set(true);
            if (aVar.f7154b.cancel(false)) {
                this.h = this.f3480g;
            }
            this.f3480g = null;
        }
    }

    public final void b() {
        if (this.h != null || this.f3480g == null) {
            return;
        }
        this.f3480g.getClass();
        n1.a aVar = this.f3480g;
        Executor executor = this.f3479f;
        if (aVar.f7155c == 1) {
            aVar.f7155c = 2;
            aVar.f7153a.getClass();
            executor.execute(aVar.f7154b);
        } else {
            int iD = u.e.d(aVar.f7155c);
            if (iD == 1) {
                throw new IllegalStateException("Cannot execute task: the task is already running.");
            }
            if (iD == 2) {
                throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
            throw new IllegalStateException("We should never reach this state");
        }
    }

    public final void c() {
        Iterator it = this.f3481j.iterator();
        if (it.hasNext()) {
            ((o) it.next()).getClass();
            throw new UnsupportedOperationException();
        }
        try {
            this.i.tryAcquire(0, 5L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", e);
            Thread.currentThread().interrupt();
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        p3.a.d(sb2, this);
        sb2.append(" id=");
        sb2.append(0);
        sb2.append("}");
        return sb2.toString();
    }
}
