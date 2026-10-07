package w2;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import d3.k;
import d3.u;
import java.util.ArrayList;
import java.util.concurrent.ScheduledExecutorService;
import t2.m;
import u2.j;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements u2.a {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f9468v = m.f("SystemAlarmDispatcher");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f9469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f3.a f9470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u f9471c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u2.b f9472d;
    public final j e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b f9473f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Handler f9474r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ArrayList f9475s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Intent f9476t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public SystemAlarmService f9477u;

    public g(SystemAlarmService systemAlarmService) {
        Context applicationContext = systemAlarmService.getApplicationContext();
        this.f9469a = applicationContext;
        this.f9473f = new b(applicationContext);
        this.f9471c = new u();
        j jVarS = j.S(systemAlarmService);
        this.e = jVarS;
        u2.b bVar = jVarS.f8824r;
        this.f9472d = bVar;
        this.f9470b = jVarS.f8822p;
        bVar.a(this);
        this.f9475s = new ArrayList();
        this.f9476t = null;
        this.f9474r = new Handler(Looper.getMainLooper());
    }

    public final void a(Intent intent, int i) {
        m mVarD = m.d();
        String str = f9468v;
        int i10 = 0;
        mVarD.a(str, String.format("Adding command %s (%s)", intent, Integer.valueOf(i)), new Throwable[0]);
        b();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            m.d().h(str, "Unknown command. Ignoring", new Throwable[0]);
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            b();
            synchronized (this.f9475s) {
                try {
                    ArrayList arrayList = this.f9475s;
                    int size = arrayList.size();
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) obj).getAction())) {
                            return;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        intent.putExtra("KEY_START_ID", i);
        synchronized (this.f9475s) {
            try {
                boolean zIsEmpty = this.f9475s.isEmpty();
                this.f9475s.add(intent);
                if (zIsEmpty) {
                    f();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b() {
        if (this.f9474r.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    @Override // u2.a
    public final void c(String str, boolean z4) {
        String str2 = b.f9449d;
        Intent intent = new Intent(this.f9469a, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z4);
        e(new androidx.activity.g(this, intent, 0, 6));
    }

    public final void d() {
        m.d().a(f9468v, "Destroying SystemAlarmDispatcher", new Throwable[0]);
        this.f9472d.e(this);
        ScheduledExecutorService scheduledExecutorService = this.f9471c.f2852a;
        if (!scheduledExecutorService.isShutdown()) {
            scheduledExecutorService.shutdownNow();
        }
        this.f9477u = null;
    }

    public final void e(Runnable runnable) {
        this.f9474r.post(runnable);
    }

    public final void f() {
        b();
        PowerManager.WakeLock wakeLockA = k.a(this.f9469a, "ProcessCommand");
        try {
            wakeLockA.acquire();
            this.e.f8822p.m(new f(this, 0));
        } finally {
            wakeLockA.release();
        }
    }
}
