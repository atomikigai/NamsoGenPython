package w3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements q4.b {
    public static final r7.k H = new r7.k();
    public boolean A;
    public t B;
    public boolean C;
    public r D;
    public h E;
    public volatile boolean F;
    public boolean G;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f9547c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p0.d f9548d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final o f9549f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final z3.d f9550r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final z3.d f9551s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final z3.d f9552t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public p f9554v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f9555w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f9556x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public x f9557y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f9558z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oc.i f9545a = new oc.i(new ArrayList(2), 1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q4.e f9546b = new q4.e();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final AtomicInteger f9553u = new AtomicInteger();
    public final r7.k e = H;

    public n(z3.d dVar, z3.d dVar2, z3.d dVar3, z3.d dVar4, k kVar, k kVar2, a2.l lVar) {
        this.f9550r = dVar;
        this.f9551s = dVar2;
        this.f9552t = dVar4;
        this.f9549f = kVar;
        this.f9547c = kVar2;
        this.f9548d = lVar;
    }

    public final synchronized void a(l4.f fVar, Executor executor) {
        try {
            this.f9546b.a();
            ((ArrayList) this.f9545a.f7715b).add(new m(fVar, executor));
            if (this.A) {
                e(1);
                executor.execute(new l(this, fVar, 1));
            } else if (this.C) {
                e(1);
                executor.execute(new l(this, fVar, 0));
            } else {
                p4.f.a("Cannot add callbacks to a cancelled EngineJob", !this.F);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void b() {
        if (f()) {
            return;
        }
        this.F = true;
        h hVar = this.E;
        hVar.L = true;
        f fVar = hVar.J;
        if (fVar != null) {
            fVar.cancel();
        }
        o oVar = this.f9549f;
        p pVar = this.f9554v;
        k kVar = (k) oVar;
        synchronized (kVar) {
            a4.a0 a0Var = kVar.f9534a;
            a0Var.getClass();
            HashMap map = a0Var.f111a;
            if (equals(map.get(pVar))) {
                map.remove(pVar);
            }
        }
    }

    @Override // q4.b
    public final q4.e c() {
        return this.f9546b;
    }

    public final void d() {
        r rVar;
        synchronized (this) {
            try {
                this.f9546b.a();
                p4.f.a("Not yet complete!", f());
                int iDecrementAndGet = this.f9553u.decrementAndGet();
                p4.f.a("Can't decrement below 0", iDecrementAndGet >= 0);
                if (iDecrementAndGet == 0) {
                    rVar = this.D;
                    g();
                } else {
                    rVar = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (rVar != null) {
            rVar.c();
        }
    }

    public final synchronized void e(int i) {
        r rVar;
        p4.f.a("Not yet complete!", f());
        if (this.f9553u.getAndAdd(i) == 0 && (rVar = this.D) != null) {
            rVar.a();
        }
    }

    public final boolean f() {
        return this.C || this.A || this.F;
    }

    public final synchronized void g() {
        boolean zA;
        if (this.f9554v == null) {
            throw new IllegalArgumentException();
        }
        ((ArrayList) this.f9545a.f7715b).clear();
        this.f9554v = null;
        this.D = null;
        this.f9557y = null;
        this.C = false;
        this.F = false;
        this.A = false;
        this.G = false;
        h hVar = this.E;
        ka.a aVar = hVar.f9517r;
        synchronized (aVar) {
            aVar.f6126a = true;
            zA = aVar.a();
        }
        if (zA) {
            hVar.k();
        }
        this.E = null;
        this.B = null;
        this.f9558z = 0;
        this.f9548d.b(this);
    }

    public final synchronized void h(l4.f fVar) {
        try {
            this.f9546b.a();
            ((ArrayList) this.f9545a.f7715b).remove(new m(fVar, p4.f.f7798b));
            if (((ArrayList) this.f9545a.f7715b).isEmpty()) {
                b();
                if (this.A || this.C) {
                    if (this.f9553u.get() == 0) {
                        g();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
