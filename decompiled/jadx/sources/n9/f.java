package n9;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class f extends BroadcastReceiver {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicReference f7355b = new AtomicReference();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f7356a;

    public f(Context context) {
        this.f7356a = context;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        synchronized (g.f7357k) {
            try {
                Iterator it = ((r.d) g.f7358l.values()).iterator();
                while (it.hasNext()) {
                    ((g) it.next()).g();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f7356a.unregisterReceiver(this);
    }
}
