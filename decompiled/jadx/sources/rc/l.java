package rc;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class l extends s {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f8298c = AtomicIntegerFieldUpdater.newUpdater(l.class, "_resumed");
    private volatile int _resumed;

    public l(k kVar, Throwable th, boolean z4) {
        if (th == null) {
            th = new CancellationException("Continuation " + kVar + " was cancelled normally");
        }
        super(z4, th);
        this._resumed = 0;
    }
}
