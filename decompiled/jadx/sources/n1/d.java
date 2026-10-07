package n1;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends Handler {
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        c cVar = (c) message.obj;
        int i = message.what;
        if (i != 1) {
            if (i != 2) {
                return;
            }
            a aVar = cVar.f7160a;
            return;
        }
        a aVar2 = cVar.f7160a;
        Object obj = cVar.f7161b[0];
        if (aVar2.f7156d.get()) {
            CountDownLatch countDownLatch = aVar2.f7157f;
            try {
                e7.d dVar = aVar2.f7158r;
                if (dVar.h == aVar2) {
                    SystemClock.uptimeMillis();
                    dVar.h = null;
                    dVar.b();
                }
                countDownLatch.countDown();
            } catch (Throwable th) {
                countDownLatch.countDown();
                throw th;
            }
        } else {
            try {
                e7.d dVar2 = aVar2.f7158r;
                if (dVar2.f3480g != aVar2) {
                    if (dVar2.h == aVar2) {
                        SystemClock.uptimeMillis();
                        dVar2.h = null;
                        dVar2.b();
                    }
                } else if (!dVar2.f3477c) {
                    SystemClock.uptimeMillis();
                    dVar2.f3480g = null;
                    m1.a aVar3 = dVar2.f3475a;
                    if (aVar3 != null) {
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            aVar3.j(obj);
                        } else {
                            aVar3.h(obj);
                        }
                    }
                }
                aVar2.f7157f.countDown();
            } catch (Throwable th2) {
                aVar2.f7157f.countDown();
                throw th2;
            }
        }
        aVar2.f7155c = 3;
    }
}
