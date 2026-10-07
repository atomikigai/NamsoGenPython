package d5;

import android.app.Application;
import androidx.lifecycle.p0;
import java.util.concurrent.atomic.AtomicBoolean;
import jc.i;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f extends p0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Application f2922d;
    public final AtomicBoolean e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f2923f;

    public f(Application application) {
        i.e(application, "application");
        this.f2922d = application;
        this.e = new AtomicBoolean();
    }

    @Override // androidx.lifecycle.p0
    public void b() {
        this.e.set(false);
    }

    public final Application c() {
        Application application = this.f2922d;
        i.c(application, "null cannot be cast to non-null type T of androidx.lifecycle.AndroidViewModel.getApplication");
        return application;
    }

    public final void d(Object obj) {
        if (this.e.compareAndSet(false, true)) {
            this.f2923f = obj;
            e();
        }
    }

    public void e() {
    }
}
