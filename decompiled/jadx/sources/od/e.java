package od;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public class e extends x {
    public static final ReentrantLock h;
    public static final Condition i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final long f7728j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final long f7729k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static e f7730l;
    public boolean e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e f7731f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f7732g;

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        h = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        jc.i.d(conditionNewCondition, "newCondition(...)");
        i = conditionNewCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f7728j = millis;
        f7729k = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final void h() {
        e eVar;
        long j4 = this.f7770c;
        boolean z4 = this.f7768a;
        if (j4 != 0 || z4) {
            ReentrantLock reentrantLock = h;
            reentrantLock.lock();
            try {
                if (this.e) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.e = true;
                if (f7730l == null) {
                    f7730l = new e();
                    b bVar = new b("Okio Watchdog");
                    bVar.setDaemon(true);
                    bVar.start();
                }
                long jNanoTime = System.nanoTime();
                if (j4 != 0 && z4) {
                    this.f7732g = Math.min(j4, c() - jNanoTime) + jNanoTime;
                } else if (j4 != 0) {
                    this.f7732g = j4 + jNanoTime;
                } else {
                    if (!z4) {
                        throw new AssertionError();
                    }
                    this.f7732g = c();
                }
                long j10 = this.f7732g - jNanoTime;
                e eVar2 = f7730l;
                jc.i.b(eVar2);
                while (true) {
                    eVar = eVar2.f7731f;
                    if (eVar == null || j10 < eVar.f7732g - jNanoTime) {
                        break;
                        break;
                    }
                    eVar2 = eVar;
                }
                this.f7731f = eVar;
                eVar2.f7731f = this;
                if (eVar2 == f7730l) {
                    i.signal();
                }
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    public final boolean i() {
        ReentrantLock reentrantLock = h;
        reentrantLock.lock();
        try {
            if (!this.e) {
                return false;
            }
            this.e = false;
            e eVar = f7730l;
            while (eVar != null) {
                e eVar2 = eVar.f7731f;
                if (eVar2 == this) {
                    eVar.f7731f = this.f7731f;
                    this.f7731f = null;
                    return false;
                }
                eVar = eVar2;
            }
            return true;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void j() {
    }
}
