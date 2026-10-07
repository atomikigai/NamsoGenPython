package u2;

import a2.l;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.ListenableWorker;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import da.v;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import t2.m;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements a, b3.a {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f8789w = m.f("Processor");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f8791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t2.b f8792c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l f8793d;
    public final WorkDatabase e;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final List f8796s;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final HashMap f8795r = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f8794f = new HashMap();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final HashSet f8797t = new HashSet();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ArrayList f8798u = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public PowerManager.WakeLock f8790a = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Object f8799v = new Object();

    public b(Context context, t2.b bVar, l lVar, WorkDatabase workDatabase, List list) {
        this.f8791b = context;
        this.f8792c = bVar;
        this.f8793d = lVar;
        this.e = workDatabase;
        this.f8796s = list;
    }

    public static boolean b(String str, k kVar) {
        boolean zIsDone;
        if (kVar == null) {
            m.d().a(f8789w, u3.b.b("WorkerWrapper could not be found for ", str), new Throwable[0]);
            return false;
        }
        kVar.D = true;
        kVar.h();
        m9.a aVar = kVar.C;
        if (aVar != null) {
            zIsDone = aVar.isDone();
            kVar.C.cancel(true);
        } else {
            zIsDone = false;
        }
        ListenableWorker listenableWorker = kVar.f8832f;
        if (listenableWorker == null || zIsDone) {
            m.d().a(k.E, "WorkSpec " + kVar.e + " is already done. Not interrupting.", new Throwable[0]);
        } else {
            listenableWorker.stop();
        }
        m.d().a(f8789w, u3.b.b("WorkerWrapper interrupted for ", str), new Throwable[0]);
        return true;
    }

    public final void a(a aVar) {
        synchronized (this.f8799v) {
            this.f8798u.add(aVar);
        }
    }

    @Override // u2.a
    public final void c(String str, boolean z4) {
        synchronized (this.f8799v) {
            try {
                this.f8795r.remove(str);
                int i = 0;
                m.d().a(f8789w, b.class.getSimpleName() + " " + str + " executed; reschedule = " + z4, new Throwable[0]);
                ArrayList arrayList = this.f8798u;
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((a) obj).c(str, z4);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean d(String str) {
        boolean z4;
        synchronized (this.f8799v) {
            try {
                z4 = this.f8795r.containsKey(str) || this.f8794f.containsKey(str);
            } catch (Throwable th) {
                throw th;
            }
        }
        return z4;
    }

    public final void e(a aVar) {
        synchronized (this.f8799v) {
            this.f8798u.remove(aVar);
        }
    }

    public final void f(String str, t2.g gVar) {
        synchronized (this.f8799v) {
            try {
                m.d().e(f8789w, "Moving WorkSpec (" + str + ") to the foreground", new Throwable[0]);
                k kVar = (k) this.f8795r.remove(str);
                if (kVar != null) {
                    if (this.f8790a == null) {
                        PowerManager.WakeLock wakeLockA = d3.k.a(this.f8791b, "ProcessorForegroundLck");
                        this.f8790a = wakeLockA;
                        wakeLockA.acquire();
                    }
                    this.f8794f.put(str, kVar);
                    e0.k.startForegroundService(this.f8791b, b3.c.b(this.f8791b, str, gVar));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean g(String str, q5.d dVar) {
        synchronized (this.f8799v) {
            try {
                if (d(str)) {
                    m.d().a(f8789w, "Work " + str + " is already enqueued for processing", new Throwable[0]);
                    return false;
                }
                Context context = this.f8791b;
                t2.b bVar = this.f8792c;
                l lVar = this.f8793d;
                WorkDatabase workDatabase = this.e;
                q5.d dVar2 = new q5.d(4);
                Context applicationContext = context.getApplicationContext();
                List list = this.f8796s;
                if (dVar == null) {
                    dVar = dVar2;
                }
                k kVar = new k();
                kVar.f8834s = new t2.i();
                e3.k kVar2 = new e3.k();
                kVar.B = kVar2;
                kVar.C = null;
                kVar.f8828a = applicationContext;
                kVar.f8833r = lVar;
                kVar.f8836u = this;
                kVar.f8829b = str;
                kVar.f8830c = list;
                kVar.f8831d = dVar;
                kVar.f8832f = null;
                kVar.f8835t = bVar;
                kVar.f8837v = workDatabase;
                kVar.f8838w = workDatabase.x();
                kVar.f8839x = workDatabase.s();
                kVar.f8840y = workDatabase.y();
                b3.b bVar2 = new b3.b(17);
                bVar2.f1367c = this;
                bVar2.f1366b = str;
                bVar2.f1368d = kVar2;
                kVar2.addListener(bVar2, (f3.b) this.f8793d.f45d);
                this.f8795r.put(str, kVar);
                ((d3.i) this.f8793d.f43b).execute(kVar);
                m.d().a(f8789w, v.u(b.class.getSimpleName(), ": processing ", str), new Throwable[0]);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h() {
        synchronized (this.f8799v) {
            try {
                if (this.f8794f.isEmpty()) {
                    Context context = this.f8791b;
                    String str = b3.c.f1369u;
                    Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                    intent.setAction("ACTION_STOP_FOREGROUND");
                    try {
                        this.f8791b.startService(intent);
                    } catch (Throwable th) {
                        m.d().b(f8789w, "Unable to stop foreground service", th);
                    }
                    PowerManager.WakeLock wakeLock = this.f8790a;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.f8790a = null;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean i(String str) {
        boolean zB;
        synchronized (this.f8799v) {
            m.d().a(f8789w, "Processor stopping foreground work " + str, new Throwable[0]);
            zB = b(str, (k) this.f8794f.remove(str));
        }
        return zB;
    }

    public final boolean j(String str) {
        boolean zB;
        synchronized (this.f8799v) {
            m.d().a(f8789w, "Processor stopping background work " + str, new Throwable[0]);
            zB = b(str, (k) this.f8795r.remove(str));
        }
        return zB;
    }
}
