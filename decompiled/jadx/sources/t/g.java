package t;

import da.v;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g implements m9.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f8506d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger e = Logger.getLogger(g.class.getName());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final r7.g f8507f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Object f8508r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Object f8509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile c f8510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile f f8511c;

    static {
        r7.g eVar;
        try {
            eVar = new d(AtomicReferenceFieldUpdater.newUpdater(f.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(f.class, f.class, "b"), AtomicReferenceFieldUpdater.newUpdater(g.class, f.class, "c"), AtomicReferenceFieldUpdater.newUpdater(g.class, c.class, "b"), AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            eVar = new e();
        }
        f8507f = eVar;
        if (th != null) {
            e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f8508r = new Object();
    }

    public static void c(g gVar) {
        f fVar;
        c cVar;
        c cVar2;
        c cVar3;
        do {
            fVar = gVar.f8511c;
        } while (!f8507f.d(gVar, fVar, f.f8503c));
        while (true) {
            cVar = null;
            if (fVar == null) {
                break;
            }
            Thread thread = fVar.f8504a;
            if (thread != null) {
                fVar.f8504a = null;
                LockSupport.unpark(thread);
            }
            fVar = fVar.f8505b;
        }
        gVar.b();
        do {
            cVar2 = gVar.f8510b;
        } while (!f8507f.b(gVar, cVar2, c.f8496d));
        while (true) {
            cVar3 = cVar;
            cVar = cVar2;
            if (cVar == null) {
                break;
            }
            cVar2 = cVar.f8499c;
            cVar.f8499c = cVar3;
        }
        while (cVar3 != null) {
            c cVar4 = cVar3.f8499c;
            d(cVar3.f8497a, cVar3.f8498b);
            cVar3 = cVar4;
        }
    }

    public static void d(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e4) {
            e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e4);
        }
    }

    public static Object e(Object obj) throws ExecutionException {
        if (obj instanceof a) {
            Throwable th = ((a) obj).f8494b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof b) {
            throw new ExecutionException(((b) obj).f8495a);
        }
        if (obj == f8508r) {
            return null;
        }
        return obj;
    }

    public static Object f(g gVar) {
        Object obj;
        boolean z4 = false;
        while (true) {
            try {
                obj = gVar.get();
                break;
            } catch (InterruptedException unused) {
                z4 = true;
            } catch (Throwable th) {
                if (z4) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z4) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public final void a(StringBuilder sb2) {
        try {
            Object objF = f(this);
            sb2.append("SUCCESS, result=[");
            sb2.append(objF == this ? "this future" : String.valueOf(objF));
            sb2.append("]");
        } catch (CancellationException unused) {
            sb2.append("CANCELLED");
        } catch (RuntimeException e4) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e4.getClass());
            sb2.append(" thrown from get()]");
        } catch (ExecutionException e10) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e10.getCause());
            sb2.append("]");
        }
    }

    @Override // m9.a
    public final void addListener(Runnable runnable, Executor executor) {
        runnable.getClass();
        executor.getClass();
        c cVar = this.f8510b;
        c cVar2 = c.f8496d;
        if (cVar != cVar2) {
            c cVar3 = new c(runnable, executor);
            do {
                cVar3.f8499c = cVar;
                if (f8507f.b(this, cVar, cVar3)) {
                    return;
                } else {
                    cVar = this.f8510b;
                }
            } while (cVar != cVar2);
        }
        d(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z4) {
        a aVar;
        Object obj = this.f8509a;
        if (obj == null) {
            if (f8506d) {
                aVar = new a(z4, new CancellationException("Future.cancel() was called."));
            } else {
                aVar = z4 ? a.f8491c : a.f8492d;
            }
            if (f8507f.c(this, obj, aVar)) {
                c(this);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String g() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j4, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        f fVar = f.f8503c;
        long nanos = timeUnit.toNanos(j4);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f8509a;
        if (obj != null) {
            return e(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            f fVar2 = this.f8511c;
            if (fVar2 != fVar) {
                f fVar3 = new f();
                while (true) {
                    r7.g gVar = f8507f;
                    gVar.z(fVar3, fVar2);
                    if (gVar.d(this, fVar2, fVar3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                h(fVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f8509a;
                            if (obj2 != null) {
                                return e(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        h(fVar3);
                        break;
                    }
                    fVar2 = this.f8511c;
                    if (fVar2 == fVar) {
                    }
                }
            }
            return e(this.f8509a);
        }
        while (nanos > 0) {
            Object obj3 = this.f8509a;
            if (obj3 != null) {
                return e(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        StringBuilder sbL = v.l("Waited ", " ", j4);
        sbL.append(timeUnit.toString().toLowerCase(locale));
        String string3 = sbL.toString();
        if (nanos + 1000 < 0) {
            String strH = v.h(string3, " (plus ");
            long j10 = -nanos;
            long jConvert = timeUnit.convert(j10, TimeUnit.NANOSECONDS);
            long nanos2 = j10 - timeUnit.toNanos(jConvert);
            boolean z4 = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String strH2 = strH + jConvert + " " + lowerCase;
                if (z4) {
                    strH2 = v.h(strH2, ",");
                }
                strH = v.h(strH2, " ");
            }
            if (z4) {
                strH = strH + nanos2 + " nanoseconds ";
            }
            string3 = v.h(strH, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(v.h(string3, " but future completed as timeout expired"));
        }
        throw new TimeoutException(v.u(string3, " for ", string));
    }

    public final void h(f fVar) {
        fVar.f8504a = null;
        while (true) {
            f fVar2 = this.f8511c;
            if (fVar2 == f.f8503c) {
                return;
            }
            f fVar3 = null;
            while (fVar2 != null) {
                f fVar4 = fVar2.f8505b;
                if (fVar2.f8504a != null) {
                    fVar3 = fVar2;
                } else if (fVar3 != null) {
                    fVar3.f8505b = fVar4;
                    if (fVar3.f8504a == null) {
                    }
                } else if (!f8507f.d(this, fVar2, fVar4)) {
                }
                fVar2 = fVar4;
            }
            return;
        }
    }

    public boolean i(Object obj) {
        if (obj == null) {
            obj = f8508r;
        }
        if (!f8507f.c(this, null, obj)) {
            return false;
        }
        c(this);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f8509a instanceof a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f8509a != null;
    }

    public boolean j(Throwable th) {
        th.getClass();
        if (!f8507f.c(this, null, new b(th))) {
            return false;
        }
        c(this);
        return true;
    }

    public final String toString() {
        String strG;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (this.f8509a instanceof a) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            a(sb2);
        } else {
            try {
                strG = g();
            } catch (RuntimeException e4) {
                strG = "Exception thrown from implementation: " + e4.getClass();
            }
            if (strG != null && !strG.isEmpty()) {
                sb2.append("PENDING, info=[");
                sb2.append(strG);
                sb2.append("]");
            } else if (isDone()) {
                a(sb2);
            } else {
                sb2.append("PENDING");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    public void b() {
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        f fVar = f.f8503c;
        if (!Thread.interrupted()) {
            Object obj2 = this.f8509a;
            if (obj2 != null) {
                return e(obj2);
            }
            f fVar2 = this.f8511c;
            if (fVar2 != fVar) {
                f fVar3 = new f();
                do {
                    r7.g gVar = f8507f;
                    gVar.z(fVar3, fVar2);
                    if (gVar.d(this, fVar2, fVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f8509a;
                            } else {
                                h(fVar3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return e(obj);
                    }
                    fVar2 = this.f8511c;
                } while (fVar2 != fVar);
            }
            return e(this.f8509a);
        }
        throw new InterruptedException();
    }
}
