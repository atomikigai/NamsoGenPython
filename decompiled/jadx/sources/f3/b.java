package f3;

import a2.l;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.common.zzi;
import java.util.concurrent.Executor;
import l5.o;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f3586b;

    public /* synthetic */ b(Object obj, int i) {
        this.f3585a = i;
        this.f3586b = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f3585a) {
            case 0:
                ((Handler) ((l) this.f3586b).f44c).post(runnable);
                break;
            case 1:
                ((Executor) this.f3586b).execute(new o(0, runnable));
                break;
            default:
                ((zzi) this.f3586b).post(runnable);
                break;
        }
    }

    public b(Looper looper) {
        this.f3585a = 2;
        this.f3586b = new zzi(looper);
    }
}
