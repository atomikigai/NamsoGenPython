package e3;

import da.v;
import fa.c1;
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
public abstract class i implements m9.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f3267d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger e = Logger.getLogger(i.class.getName());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c1 f3268f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Object f3269r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Object f3270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile d f3271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile h f3272c;

    static {
        c1 gVar;
        try {
            gVar = new e(AtomicReferenceFieldUpdater.newUpdater(h.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(h.class, h.class, "b"), AtomicReferenceFieldUpdater.newUpdater(i.class, h.class, "c"), AtomicReferenceFieldUpdater.newUpdater(i.class, d.class, "b"), AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            gVar = new g();
        }
        f3268f = gVar;
        if (th != null) {
            e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f3269r = new Object();
    }

    public static void b(i iVar) {
        d dVar;
        d dVar2;
        d dVar3 = null;
        while (true) {
            h hVar = iVar.f3272c;
            if (f3268f.j(iVar, hVar, h.f3264c)) {
                while (hVar != null) {
                    Thread thread = hVar.f3265a;
                    if (thread != null) {
                        hVar.f3265a = null;
                        LockSupport.unpark(thread);
                    }
                    hVar = hVar.f3266b;
                }
                do {
                    dVar = iVar.f3271b;
                } while (!f3268f.h(iVar, dVar, d.f3254d));
                while (true) {
                    dVar2 = dVar3;
                    dVar3 = dVar;
                    if (dVar3 == null) {
                        break;
                    }
                    dVar = dVar3.f3257c;
                    dVar3.f3257c = dVar2;
                }
                while (dVar2 != null) {
                    dVar3 = dVar2.f3257c;
                    Runnable runnable = dVar2.f3255a;
                    if (runnable instanceof f) {
                        f fVar = (f) runnable;
                        iVar = fVar.f3262a;
                        if (iVar.f3270a == fVar) {
                            if (f3268f.i(iVar, fVar, e(fVar.f3263b))) {
                            }
                        } else {
                            continue;
                        }
                    } else {
                        c(runnable, dVar2.f3256b);
                    }
                    dVar2 = dVar3;
                }
                return;
            }
        }
    }

    public static void c(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e4) {
            e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e4);
        }
    }

    public static Object d(Object obj) throws ExecutionException {
        if (obj instanceof a) {
            Throwable th = ((a) obj).f3250b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof c) {
            throw new ExecutionException(((c) obj).f3253a);
        }
        if (obj == f3269r) {
            return null;
        }
        return obj;
    }

    public static Object e(m9.a aVar) {
        Object obj;
        if (aVar instanceof i) {
            Object obj2 = ((i) aVar).f3270a;
            if (!(obj2 instanceof a)) {
                return obj2;
            }
            a aVar2 = (a) obj2;
            if (aVar2.f3249a) {
                return aVar2.f3250b != null ? new a(false, aVar2.f3250b) : a.f3248d;
            }
            return obj2;
        }
        boolean zIsCancelled = aVar.isCancelled();
        boolean z4 = true;
        if ((!f3267d) && zIsCancelled) {
            return a.f3248d;
        }
        boolean z10 = false;
        while (true) {
            try {
                try {
                    obj = aVar.get();
                    break;
                } catch (InterruptedException unused) {
                    z10 = z4;
                } catch (Throwable th) {
                    if (z10) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (CancellationException e4) {
                if (zIsCancelled) {
                    return new a(false, e4);
                }
                return new c(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + aVar, e4));
            } catch (ExecutionException e10) {
                return new c(e10.getCause());
            } catch (Throwable th2) {
                return new c(th2);
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return obj == null ? f3269r : obj;
    }

    public final void a(StringBuilder sb2) {
        Object obj;
        boolean z4 = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (InterruptedException unused) {
                    z4 = true;
                } catch (Throwable th) {
                    if (z4) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (CancellationException unused2) {
                sb2.append("CANCELLED");
                return;
            } catch (RuntimeException e4) {
                sb2.append("UNKNOWN, cause=[");
                sb2.append(e4.getClass());
                sb2.append(" thrown from get()]");
                return;
            } catch (ExecutionException e10) {
                sb2.append("FAILURE, cause=[");
                sb2.append(e10.getCause());
                sb2.append("]");
                return;
            }
        }
        if (z4) {
            Thread.currentThread().interrupt();
        }
        sb2.append("SUCCESS, result=[");
        sb2.append(obj == this ? "this future" : String.valueOf(obj));
        sb2.append("]");
    }

    @Override // m9.a
    public final void addListener(Runnable runnable, Executor executor) {
        runnable.getClass();
        executor.getClass();
        d dVar = this.f3271b;
        d dVar2 = d.f3254d;
        if (dVar != dVar2) {
            d dVar3 = new d(runnable, executor);
            do {
                dVar3.f3257c = dVar;
                if (f3268f.h(this, dVar, dVar3)) {
                    return;
                } else {
                    dVar = this.f3271b;
                }
            } while (dVar != dVar2);
        }
        c(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z4) {
        a aVar;
        Object obj = this.f3270a;
        if (!(obj == null) && !(obj instanceof f)) {
            return false;
        }
        if (f3267d) {
            aVar = new a(z4, new CancellationException("Future.cancel() was called."));
        } else {
            aVar = z4 ? a.f3247c : a.f3248d;
        }
        i iVar = this;
        boolean z10 = false;
        while (true) {
            if (f3268f.i(iVar, obj, aVar)) {
                b(iVar);
                if (!(obj instanceof f)) {
                    break;
                }
                m9.a aVar2 = ((f) obj).f3263b;
                if (!(aVar2 instanceof i)) {
                    aVar2.cancel(z4);
                    break;
                }
                iVar = (i) aVar2;
                obj = iVar.f3270a;
                if (!(obj == null) && !(obj instanceof f)) {
                    break;
                }
                z10 = true;
            } else {
                obj = iVar.f3270a;
                if (!(obj instanceof f)) {
                    return z10;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String f() {
        Object obj = this.f3270a;
        if (obj instanceof f) {
            StringBuilder sb2 = new StringBuilder("setFuture=[");
            m9.a aVar = ((f) obj).f3263b;
            return q1.a.m(sb2, aVar == this ? "this future" : String.valueOf(aVar), "]");
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void g(h hVar) {
        hVar.f3265a = null;
        while (true) {
            h hVar2 = this.f3272c;
            if (hVar2 == h.f3264c) {
                return;
            }
            h hVar3 = null;
            while (hVar2 != null) {
                h hVar4 = hVar2.f3266b;
                if (hVar2.f3265a != null) {
                    hVar3 = hVar2;
                } else if (hVar3 != null) {
                    hVar3.f3266b = hVar4;
                    if (hVar3.f3265a == null) {
                    }
                } else if (!f3268f.j(this, hVar2, hVar4)) {
                }
                hVar2 = hVar4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j4, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        boolean z4;
        h hVar = h.f3264c;
        long nanos = timeUnit.toNanos(j4);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f3270a;
        if ((obj != null) && (!(obj instanceof f))) {
            return d(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            h hVar2 = this.f3272c;
            if (hVar2 != hVar) {
                h hVar3 = new h();
                z4 = true;
                while (true) {
                    c1 c1Var = f3268f;
                    c1Var.A(hVar3, hVar2);
                    if (c1Var.j(this, hVar2, hVar3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                g(hVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f3270a;
                            if ((obj2 != null) && (!(obj2 instanceof f))) {
                                return d(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        g(hVar3);
                        break;
                    }
                    hVar2 = this.f3272c;
                    if (hVar2 == hVar) {
                    }
                }
            }
            return d(this.f3270a);
        }
        z4 = true;
        while (nanos > 0) {
            Object obj3 = this.f3270a;
            if ((obj3 != null ? z4 : false) && (!(obj3 instanceof f))) {
                return d(obj3);
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
            boolean z10 = (jConvert == 0 || nanos2 > 1000) ? z4 : false;
            if (jConvert > 0) {
                String strH2 = strH + jConvert + " " + lowerCase;
                if (z10) {
                    strH2 = v.h(strH2, ",");
                }
                strH = v.h(strH2, " ");
            }
            if (z10) {
                strH = strH + nanos2 + " nanoseconds ";
            }
            string3 = v.h(strH, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(v.h(string3, " but future completed as timeout expired"));
        }
        throw new TimeoutException(v.u(string3, " for ", string));
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f3270a instanceof a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.f3270a;
        return (!(obj instanceof f)) & (obj != null);
    }

    public final String toString() {
        String strF;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (this.f3270a instanceof a) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            a(sb2);
        } else {
            try {
                strF = f();
            } catch (RuntimeException e4) {
                strF = "Exception thrown from implementation: " + e4.getClass();
            }
            if (strF != null && !strF.isEmpty()) {
                sb2.append("PENDING, info=[");
                sb2.append(strF);
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

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        h hVar = h.f3264c;
        if (!Thread.interrupted()) {
            Object obj2 = this.f3270a;
            if ((obj2 != null) & (!(obj2 instanceof f))) {
                return d(obj2);
            }
            h hVar2 = this.f3272c;
            if (hVar2 != hVar) {
                h hVar3 = new h();
                do {
                    c1 c1Var = f3268f;
                    c1Var.A(hVar3, hVar2);
                    if (c1Var.j(this, hVar2, hVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f3270a;
                            } else {
                                g(hVar3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof f))));
                        return d(obj);
                    }
                    hVar2 = this.f3272c;
                } while (hVar2 != hVar);
            }
            return d(this.f3270a);
        }
        throw new InterruptedException();
    }
}
