package y1;

import android.os.Looper;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public wc.e f10515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public yb.i f10516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Executor f10517c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public g.a0 f10518d;
    public h6.m e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public i f10519f;
    public boolean h;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final s5.j f10520g = new s5.j(new androidx.activity.a0(0, this, v.class, "onClosed", "onClosed()V", 0, 0, 2));
    public final ThreadLocal i = new ThreadLocal();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LinkedHashMap f10521j = new LinkedHashMap();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f10522k = true;

    public final void a() {
        if (this.h) {
            return;
        }
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public final void b() {
        if (l() && !m() && this.i.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    public final void c() {
        a();
        a();
        h2.b bVarZ = i().z();
        if (!bVarZ.M()) {
            a2.x xVar = new a2.x(h(), null, 5);
            Thread.interrupted();
            rc.b0.u(yb.j.f10674a, new a2.y(xVar, (yb.d) null));
        }
        if (bVarZ.N()) {
            bVarZ.v();
        } else {
            bVarZ.e();
        }
    }

    public List d(LinkedHashMap linkedHashMap) {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(vb.t.A(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            nc.b bVar = (nc.b) entry.getKey();
            jc.i.e(bVar, "<this>");
            Class clsA = ((jc.d) bVar).a();
            jc.i.c(clsA, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
            linkedHashMap2.put(clsA, entry.getValue());
        }
        return vb.q.f9297a;
    }

    public abstract i e();

    public androidx.emoji2.text.g f() {
        throw new ub.e(0);
    }

    public h2.e g(a aVar) {
        jc.i.e(aVar, "config");
        throw new ub.e(0);
    }

    public final i h() {
        i iVar = this.f10519f;
        if (iVar != null) {
            return iVar;
        }
        jc.i.i("internalTracker");
        throw null;
    }

    public final h2.e i() {
        h6.m mVar = this.e;
        if (mVar == null) {
            jc.i.i("connectionManager");
            throw null;
        }
        h2.e eVarC = mVar.c();
        if (eVarC != null) {
            return eVarC;
        }
        throw new IllegalStateException("Cannot return a SupportSQLiteOpenHelper since no SupportSQLiteOpenHelper.Factory was configured with Room.");
    }

    public Set j() {
        return vb.i.q0(new ArrayList(vb.k.U(vb.s.f9299a)));
    }

    public LinkedHashMap k() {
        int iA = vb.t.A(vb.k.U(vb.s.f9299a));
        if (iA < 16) {
            iA = 16;
        }
        return new LinkedHashMap(iA);
    }

    public final boolean l() {
        h6.m mVar = this.e;
        if (mVar != null) {
            return mVar.c() != null;
        }
        jc.i.i("connectionManager");
        throw null;
    }

    public final boolean m() {
        return p() && i().z().M();
    }

    public final void n() {
        i().z().C();
        if (m()) {
            return;
        }
        i iVarH = h();
        iVarH.f10451b.e(iVarH.e, iVarH.f10454f);
    }

    public final void o(g2.a aVar) {
        jc.i.e(aVar, "connection");
        i iVarH = h();
        l0 l0Var = iVarH.f10451b;
        l0Var.getClass();
        g2.c cVarR = aVar.R("PRAGMA query_only");
        try {
            cVarR.O();
            boolean z4 = cVarR.getLong(0) != 0;
            a.a.b(cVarR, null);
            if (!z4) {
                jd.d.o(aVar, "PRAGMA temp_store = MEMORY");
                jd.d.o(aVar, "PRAGMA recursive_triggers = 1");
                jd.d.o(aVar, "DROP TABLE IF EXISTS room_table_modification_log");
                if (l0Var.f10486d) {
                    jd.d.o(aVar, "CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                } else {
                    jd.d.o(aVar, pc.o.c0("CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)", "TEMP", ""));
                }
                com.bumptech.glide.manager.q qVar = l0Var.h;
                ReentrantLock reentrantLock = (ReentrantLock) qVar.f1933b;
                reentrantLock.lock();
                try {
                    qVar.f1932a = true;
                    reentrantLock.unlock();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
            synchronized (iVarH.f10455g) {
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                a.a.b(cVarR, th2);
                throw th3;
            }
        }
    }

    public final boolean p() {
        h6.m mVar = this.e;
        if (mVar == null) {
            jc.i.i("connectionManager");
            throw null;
        }
        h2.b bVar = (h2.b) mVar.f5034g;
        if (bVar != null) {
            return bVar.isOpen();
        }
        return false;
    }

    public final void q() {
        i().z().u();
    }

    public final Object r(boolean z4, ic.p pVar, ac.c cVar) {
        h6.m mVar = this.e;
        if (mVar != null) {
            return ((a2.b) mVar.f5033f).J(z4, pVar, cVar);
        }
        jc.i.i("connectionManager");
        throw null;
    }
}
