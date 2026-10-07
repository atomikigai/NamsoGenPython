package androidx.lifecycle;

import android.os.Looper;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class y {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Object f1104k = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f1105a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n.f f1106b = new n.f();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1107c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f1108d;
    public volatile Object e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile Object f1109f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f1110g;
    public boolean h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final androidx.activity.i f1111j;

    public y() {
        Object obj = f1104k;
        this.f1109f = obj;
        this.f1111j = new androidx.activity.i(this, 4);
        this.e = obj;
        this.f1110g = -1;
    }

    public static void a(String str) {
        m.a.V().f6959a.getClass();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(da.v.i("Cannot invoke ", str, " on a background thread"));
        }
    }

    public final void b(x xVar) {
        if (xVar.f1101b) {
            if (!xVar.e()) {
                xVar.b(false);
                return;
            }
            int i = xVar.f1102c;
            int i10 = this.f1110g;
            if (i >= i10) {
                return;
            }
            xVar.f1102c = i10;
            xVar.f1100a.m(this.e);
        }
    }

    public final void c(x xVar) {
        if (this.h) {
            this.i = true;
            return;
        }
        this.h = true;
        do {
            this.i = false;
            if (xVar != null) {
                b(xVar);
                xVar = null;
            } else {
                n.f fVar = this.f1106b;
                fVar.getClass();
                n.d dVar = new n.d(fVar);
                fVar.f7129c.put(dVar, Boolean.FALSE);
                while (dVar.hasNext()) {
                    b((x) ((Map.Entry) dVar.next()).getValue());
                    if (this.i) {
                        break;
                    }
                }
            }
        } while (this.i);
        this.h = false;
    }

    public final void d(r rVar, z zVar) {
        Object obj;
        a("observe");
        if (rVar.l().f1093d == m.f1065a) {
            return;
        }
        LiveData$LifecycleBoundObserver liveData$LifecycleBoundObserver = new LiveData$LifecycleBoundObserver(this, rVar, zVar);
        n.f fVar = this.f1106b;
        n.c cVarD = fVar.d(zVar);
        if (cVarD != null) {
            obj = cVarD.f7121b;
        } else {
            n.c cVar = new n.c(zVar, liveData$LifecycleBoundObserver);
            fVar.f7130d++;
            n.c cVar2 = fVar.f7128b;
            if (cVar2 == null) {
                fVar.f7127a = cVar;
                fVar.f7128b = cVar;
            } else {
                cVar2.f7122c = cVar;
                cVar.f7123d = cVar2;
                fVar.f7128b = cVar;
            }
            obj = null;
        }
        x xVar = (x) obj;
        if (xVar != null && !xVar.d(rVar)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (xVar != null) {
            return;
        }
        rVar.l().a(liveData$LifecycleBoundObserver);
    }

    public final void e(ib.c cVar) {
        Object obj;
        a("observeForever");
        w wVar = new w(this, cVar);
        n.f fVar = this.f1106b;
        n.c cVarD = fVar.d(cVar);
        if (cVarD != null) {
            obj = cVarD.f7121b;
        } else {
            n.c cVar2 = new n.c(cVar, wVar);
            fVar.f7130d++;
            n.c cVar3 = fVar.f7128b;
            if (cVar3 == null) {
                fVar.f7127a = cVar2;
                fVar.f7128b = cVar2;
            } else {
                cVar3.f7122c = cVar2;
                cVar2.f7123d = cVar3;
                fVar.f7128b = cVar2;
            }
            obj = null;
        }
        x xVar = (x) obj;
        if (xVar instanceof LiveData$LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (xVar != null) {
            return;
        }
        wVar.b(true);
    }

    public final void h(Object obj) {
        boolean z4;
        synchronized (this.f1105a) {
            z4 = this.f1109f == f1104k;
            this.f1109f = obj;
        }
        if (z4) {
            m.a aVarV = m.a.V();
            androidx.activity.i iVar = this.f1111j;
            m.d dVar = aVarV.f6959a;
            if (dVar.f6964c == null) {
                synchronized (dVar.f6962a) {
                    try {
                        if (dVar.f6964c == null) {
                            dVar.f6964c = m.d.V(Looper.getMainLooper());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            dVar.f6964c.post(iVar);
        }
    }

    public void i(z zVar) {
        a("removeObserver");
        x xVar = (x) this.f1106b.g(zVar);
        if (xVar == null) {
            return;
        }
        xVar.c();
        xVar.b(false);
    }

    public void j(Object obj) {
        a("setValue");
        this.f1110g++;
        this.e = obj;
        c(null);
    }

    public void f() {
    }

    public void g() {
    }
}
