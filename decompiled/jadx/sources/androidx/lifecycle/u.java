package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class u extends Service implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a2.l f1097a = new a2.l(this);

    @Override // androidx.lifecycle.r
    public final t l() {
        return (t) this.f1097a.f43b;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        jc.i.e(intent, "intent");
        this.f1097a.H(l.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.f1097a.H(l.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        l lVar = l.ON_STOP;
        a2.l lVar2 = this.f1097a;
        lVar2.H(lVar);
        lVar2.H(l.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i) {
        this.f1097a.H(l.ON_START);
        super.onStart(intent, i);
    }
}
