package w3;

import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements e, Runnable, Comparable, q4.b {
    public n A;
    public int B;
    public long C;
    public Object D;
    public Thread E;
    public u3.f F;
    public u3.f G;
    public Object H;
    public com.bumptech.glide.load.data.e I;
    public volatile f J;
    public volatile boolean K;
    public volatile boolean L;
    public boolean M;
    public int N;
    public int O;
    public int P;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g7.i f9515d;
    public final p0.d e;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public com.bumptech.glide.e f9518s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public u3.f f9519t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public com.bumptech.glide.f f9520u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public p f9521v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f9522w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f9523x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public j f9524y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public u3.i f9525z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f9512a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f9513b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q4.e f9514c = new q4.e();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final q5.d f9516f = new q5.d();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ka.a f9517r = new ka.a();

    public h(g7.i iVar, a2.l lVar) {
        this.f9515d = iVar;
        this.e = lVar;
    }

    @Override // w3.e
    public final void a(u3.f fVar, Exception exc, com.bumptech.glide.load.data.e eVar, int i) {
        eVar.c();
        t tVar = new t("Fetching data failed", Collections.singletonList(exc));
        Class clsA = eVar.a();
        tVar.f9575b = fVar;
        tVar.f9576c = i;
        tVar.f9577d = clsA;
        this.f9513b.add(tVar);
        if (Thread.currentThread() != this.E) {
            l(2);
        } else {
            m();
        }
    }

    @Override // w3.e
    public final void b(u3.f fVar, Object obj, com.bumptech.glide.load.data.e eVar, int i, u3.f fVar2) {
        this.F = fVar;
        this.H = obj;
        this.I = eVar;
        this.P = i;
        this.G = fVar2;
        this.M = fVar != this.f9512a.a().get(0);
        if (Thread.currentThread() != this.E) {
            l(3);
        } else {
            f();
        }
    }

    @Override // q4.b
    public final q4.e c() {
        return this.f9514c;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        h hVar = (h) obj;
        int iOrdinal = this.f9520u.ordinal() - hVar.f9520u.ordinal();
        return iOrdinal == 0 ? this.B - hVar.B : iOrdinal;
    }

    public final x d(com.bumptech.glide.load.data.e eVar, Object obj, int i) {
        if (obj == null) {
            eVar.c();
            return null;
        }
        try {
            int i10 = p4.h.f7800b;
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            x xVarE = e(i, obj);
            if (Log.isLoggable("DecodeJob", 2)) {
                i("Decoded result " + xVarE, null, jElapsedRealtimeNanos);
            }
            return xVarE;
        } finally {
            eVar.c();
        }
    }

    public final x e(int i, Object obj) {
        Class<?> cls = obj.getClass();
        g gVar = this.f9512a;
        v vVarC = gVar.c(cls);
        u3.i iVar = this.f9525z;
        if (Build.VERSION.SDK_INT >= 26) {
            boolean z4 = i == 4 || gVar.f9511r;
            u3.h hVar = d4.o.i;
            Boolean bool = (Boolean) iVar.c(hVar);
            if (bool == null || (bool.booleanValue() && !z4)) {
                iVar = new u3.i();
                p4.c cVar = this.f9525z.f8852b;
                p4.c cVar2 = iVar.f8852b;
                cVar2.g(cVar);
                cVar2.put(hVar, Boolean.valueOf(z4));
            }
        }
        u3.i iVar2 = iVar;
        com.bumptech.glide.load.data.g gVarG = this.f9518s.a().g(obj);
        try {
            return vVarC.a(this.f9522w, this.f9523x, gVarG, new ea.j(this, i), iVar2);
        } finally {
            gVarG.c();
        }
    }

    public final void f() {
        x xVarD;
        boolean zA;
        if (Log.isLoggable("DecodeJob", 2)) {
            i("Retrieved data", "data: " + this.H + ", cache key: " + this.F + ", fetcher: " + this.I, this.C);
        }
        w wVar = null;
        try {
            xVarD = d(this.I, this.H, this.P);
        } catch (t e) {
            u3.f fVar = this.G;
            int i = this.P;
            e.f9575b = fVar;
            e.f9576c = i;
            e.f9577d = null;
            this.f9513b.add(e);
            xVarD = null;
        }
        if (xVarD == null) {
            m();
            return;
        }
        int i10 = this.P;
        boolean z4 = this.M;
        if (xVarD instanceof u) {
            ((u) xVarD).a();
        }
        if (((w) this.f9516f.f8041c) != null) {
            wVar = (w) w.e.c();
            wVar.f9584d = false;
            wVar.f9583c = true;
            wVar.f9582b = xVarD;
            xVarD = wVar;
        }
        o();
        n nVar = this.A;
        synchronized (nVar) {
            nVar.f9557y = xVarD;
            nVar.f9558z = i10;
            nVar.G = z4;
        }
        synchronized (nVar) {
            try {
                nVar.f9546b.a();
                if (nVar.F) {
                    nVar.f9557y.b();
                    nVar.g();
                } else {
                    if (((ArrayList) nVar.f9545a.f7715b).isEmpty()) {
                        throw new IllegalStateException("Received a resource without any callbacks to notify");
                    }
                    if (nVar.A) {
                        throw new IllegalStateException("Already have resource");
                    }
                    r7.k kVar = nVar.e;
                    x xVar = nVar.f9557y;
                    boolean z10 = nVar.f9555w;
                    p pVar = nVar.f9554v;
                    q qVar = nVar.f9547c;
                    kVar.getClass();
                    nVar.D = new r(xVar, z10, true, pVar, qVar);
                    nVar.A = true;
                    oc.i iVar = nVar.f9545a;
                    iVar.getClass();
                    ArrayList arrayList = new ArrayList((ArrayList) iVar.f7715b);
                    nVar.e(arrayList.size() + 1);
                    ((k) nVar.f9549f).d(nVar, nVar.f9554v, nVar.D);
                    int size = arrayList.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        m mVar = (m) obj;
                        mVar.f9544b.execute(new l(nVar, mVar.f9543a, 1));
                    }
                    nVar.d();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.N = 5;
        try {
            q5.d dVar = this.f9516f;
            if (((w) dVar.f8041c) != null) {
                g7.i iVar2 = this.f9515d;
                u3.i iVar3 = this.f9525z;
                dVar.getClass();
                try {
                    iVar2.a().b((u3.f) dVar.f8039a, new q5.d((u3.l) dVar.f8040b, (w) dVar.f8041c, iVar3));
                    ((w) dVar.f8041c).a();
                } catch (Throwable th2) {
                    ((w) dVar.f8041c).a();
                    throw th2;
                }
            }
            if (wVar != null) {
                wVar.a();
            }
            ka.a aVar = this.f9517r;
            synchronized (aVar) {
                aVar.f6127b = true;
                zA = aVar.a();
            }
            if (zA) {
                k();
            }
        } catch (Throwable th3) {
            if (wVar != null) {
                wVar.a();
            }
            throw th3;
        }
    }

    public final f g() {
        int iD = u.e.d(this.N);
        g gVar = this.f9512a;
        if (iD == 1) {
            return new y(gVar, this);
        }
        if (iD == 2) {
            return new c(gVar.a(), gVar, this);
        }
        if (iD == 3) {
            return new a0(gVar, this);
        }
        if (iD == 5) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: ".concat(u3.b.g(this.N)));
    }

    public final int h(int i) {
        boolean z4;
        boolean z10;
        int iD = u.e.d(i);
        if (iD == 0) {
            switch (this.f9524y.f9533a) {
                case 0:
                case 1:
                    z4 = false;
                    break;
                default:
                    z4 = true;
                    break;
            }
            if (z4) {
                return 2;
            }
            return h(2);
        }
        if (iD != 1) {
            if (iD == 2) {
                return 4;
            }
            if (iD == 3 || iD == 5) {
                return 6;
            }
            throw new IllegalArgumentException("Unrecognized stage: ".concat(u3.b.g(i)));
        }
        switch (this.f9524y.f9533a) {
            case 0:
                z10 = false;
                break;
            case 1:
            default:
                z10 = true;
                break;
        }
        if (z10) {
            return 3;
        }
        return h(3);
    }

    public final void i(String str, String str2, long j4) {
        StringBuilder sbC = u.e.c(str, " in ");
        sbC.append(p4.h.a(j4));
        sbC.append(", load key: ");
        sbC.append(this.f9521v);
        sbC.append(str2 != null ? ", ".concat(str2) : "");
        sbC.append(", thread: ");
        sbC.append(Thread.currentThread().getName());
        Log.v("DecodeJob", sbC.toString());
    }

    public final void j() {
        boolean zA;
        o();
        t tVar = new t("Failed to load resource", new ArrayList(this.f9513b));
        n nVar = this.A;
        synchronized (nVar) {
            nVar.B = tVar;
        }
        synchronized (nVar) {
            try {
                nVar.f9546b.a();
                if (nVar.F) {
                    nVar.g();
                } else {
                    if (((ArrayList) nVar.f9545a.f7715b).isEmpty()) {
                        throw new IllegalStateException("Received an exception without any callbacks to notify");
                    }
                    if (nVar.C) {
                        throw new IllegalStateException("Already failed once");
                    }
                    nVar.C = true;
                    p pVar = nVar.f9554v;
                    oc.i iVar = nVar.f9545a;
                    iVar.getClass();
                    ArrayList arrayList = new ArrayList((ArrayList) iVar.f7715b);
                    nVar.e(arrayList.size() + 1);
                    ((k) nVar.f9549f).d(nVar, pVar, null);
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        m mVar = (m) obj;
                        mVar.f9544b.execute(new l(nVar, mVar.f9543a, 0));
                    }
                    nVar.d();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ka.a aVar = this.f9517r;
        synchronized (aVar) {
            aVar.f6128c = true;
            zA = aVar.a();
        }
        if (zA) {
            k();
        }
    }

    public final void k() {
        ka.a aVar = this.f9517r;
        synchronized (aVar) {
            aVar.f6127b = false;
            aVar.f6126a = false;
            aVar.f6128c = false;
        }
        q5.d dVar = this.f9516f;
        dVar.f8039a = null;
        dVar.f8040b = null;
        dVar.f8041c = null;
        g gVar = this.f9512a;
        gVar.f9499c = null;
        gVar.f9500d = null;
        gVar.f9507n = null;
        gVar.f9502g = null;
        gVar.f9504k = null;
        gVar.i = null;
        gVar.f9508o = null;
        gVar.f9503j = null;
        gVar.f9509p = null;
        gVar.f9497a.clear();
        gVar.f9505l = false;
        gVar.f9498b.clear();
        gVar.f9506m = false;
        this.K = false;
        this.f9518s = null;
        this.f9519t = null;
        this.f9525z = null;
        this.f9520u = null;
        this.f9521v = null;
        this.A = null;
        this.N = 0;
        this.J = null;
        this.E = null;
        this.F = null;
        this.H = null;
        this.P = 0;
        this.I = null;
        this.C = 0L;
        this.L = false;
        this.D = null;
        this.f9513b.clear();
        this.e.b(this);
    }

    public final void l(int i) {
        this.O = i;
        n nVar = this.A;
        (nVar.f9556x ? nVar.f9552t : nVar.f9551s).execute(this);
    }

    public final void m() {
        this.E = Thread.currentThread();
        int i = p4.h.f7800b;
        this.C = SystemClock.elapsedRealtimeNanos();
        boolean zC = false;
        while (!this.L && this.J != null && !(zC = this.J.c())) {
            this.N = h(this.N);
            this.J = g();
            if (this.N == 4) {
                l(2);
                return;
            }
        }
        if ((this.N == 6 || this.L) && !zC) {
            j();
        }
    }

    public final void n() {
        String str;
        int iD = u.e.d(this.O);
        if (iD == 0) {
            this.N = h(1);
            this.J = g();
            m();
        } else {
            if (iD == 1) {
                m();
                return;
            }
            if (iD == 2) {
                f();
                return;
            }
            int i = this.O;
            if (i == 1) {
                str = "INITIALIZE";
            } else if (i != 2) {
                str = i != 3 ? "null" : "DECODE_DATA";
            } else {
                str = "SWITCH_TO_SOURCE_SERVICE";
            }
            throw new IllegalStateException("Unrecognized run reason: ".concat(str));
        }
    }

    public final void o() {
        Throwable th;
        this.f9514c.a();
        if (!this.K) {
            this.K = true;
            return;
        }
        if (this.f9513b.isEmpty()) {
            th = null;
        } else {
            ArrayList arrayList = this.f9513b;
            th = (Throwable) arrayList.get(arrayList.size() - 1);
        }
        throw new IllegalStateException("Already notified", th);
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.bumptech.glide.load.data.e eVar = this.I;
        try {
            try {
                if (this.L) {
                    j();
                    if (eVar != null) {
                        eVar.c();
                        return;
                    }
                    return;
                }
                n();
                if (eVar != null) {
                    eVar.c();
                }
            } catch (Throwable th) {
                if (eVar != null) {
                    eVar.c();
                }
                throw th;
            }
        } catch (b e) {
            throw e;
        } catch (Throwable th2) {
            if (Log.isLoggable("DecodeJob", 3)) {
                Log.d("DecodeJob", "DecodeJob threw unexpectedly, isCancelled: " + this.L + ", stage: " + u3.b.g(this.N), th2);
            }
            if (this.N != 5) {
                this.f9513b.add(th2);
                j();
            }
            if (!this.L) {
                throw th2;
            }
            throw th2;
        }
    }
}
