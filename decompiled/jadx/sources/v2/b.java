package v2;

import a2.l;
import a3.e;
import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import c3.i;
import d3.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import o6.h0;
import t2.m;
import u2.c;
import u2.j;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements c, y2.b, u2.a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f9151t = m.f("GreedyScheduler");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f9152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f9153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y2.c f9154c;
    public final a e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f9156f;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Boolean f9158s;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashSet f9155d = new HashSet();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f9157r = new Object();

    public b(Context context, t2.b bVar, l lVar, j jVar) {
        this.f9152a = context;
        this.f9153b = jVar;
        this.f9154c = new y2.c(context, lVar, this);
        this.e = new a(this, bVar.e);
    }

    @Override // u2.c
    public final void a(i... iVarArr) {
        if (this.f9158s == null) {
            this.f9158s = Boolean.valueOf(h.a(this.f9152a, this.f9153b.f8820n));
        }
        if (!this.f9158s.booleanValue()) {
            m.d().e(f9151t, "Ignoring schedule request in a secondary process", new Throwable[0]);
            return;
        }
        if (!this.f9156f) {
            this.f9153b.f8824r.a(this);
            this.f9156f = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (i iVar : iVarArr) {
            long jA = iVar.a();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (iVar.f1745b == 1) {
                if (jCurrentTimeMillis < jA) {
                    a aVar = this.e;
                    if (aVar != null) {
                        h0 h0Var = aVar.f9149b;
                        HashMap map = aVar.f9150c;
                        Runnable runnable = (Runnable) map.remove(iVar.f1744a);
                        if (runnable != null) {
                            ((Handler) h0Var.f7621a).removeCallbacks(runnable);
                        }
                        e eVar = new e(24, aVar, iVar);
                        map.put(iVar.f1744a, eVar);
                        ((Handler) h0Var.f7621a).postDelayed(eVar, iVar.a() - System.currentTimeMillis());
                    }
                } else if (iVar.b()) {
                    t2.c cVar = iVar.f1750j;
                    if (cVar.f8534c) {
                        m.d().a(f9151t, "Ignoring WorkSpec " + iVar + ", Requires device idle.", new Throwable[0]);
                    } else if (cVar.h.f8540a.size() > 0) {
                        m.d().a(f9151t, "Ignoring WorkSpec " + iVar + ", Requires ContentUri triggers.", new Throwable[0]);
                    } else {
                        hashSet.add(iVar);
                        hashSet2.add(iVar.f1744a);
                    }
                } else {
                    m.d().a(f9151t, u3.b.b("Starting work for ", iVar.f1744a), new Throwable[0]);
                    this.f9153b.W(iVar.f1744a, null);
                }
            }
        }
        synchronized (this.f9157r) {
            try {
                if (!hashSet.isEmpty()) {
                    m.d().a(f9151t, "Starting tracking for [" + TextUtils.join(",", hashSet2) + "]", new Throwable[0]);
                    this.f9155d.addAll(hashSet);
                    this.f9154c.b(this.f9155d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // u2.c
    public final boolean b() {
        return false;
    }

    @Override // u2.a
    public final void c(String str, boolean z4) {
        synchronized (this.f9157r) {
            try {
                for (i iVar : this.f9155d) {
                    if (iVar.f1744a.equals(str)) {
                        m.d().a(f9151t, "Stopping tracking for " + str, new Throwable[0]);
                        this.f9155d.remove(iVar);
                        this.f9154c.b(this.f9155d);
                        break;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // u2.c
    public final void d(String str) {
        Runnable runnable;
        Boolean bool = this.f9158s;
        j jVar = this.f9153b;
        if (bool == null) {
            this.f9158s = Boolean.valueOf(h.a(this.f9152a, jVar.f8820n));
        }
        boolean zBooleanValue = this.f9158s.booleanValue();
        String str2 = f9151t;
        if (!zBooleanValue) {
            m.d().e(str2, "Ignoring schedule request in non-main process", new Throwable[0]);
            return;
        }
        if (!this.f9156f) {
            jVar.f8824r.a(this);
            this.f9156f = true;
        }
        m.d().a(str2, u3.b.b("Cancelling work ID ", str), new Throwable[0]);
        a aVar = this.e;
        if (aVar != null && (runnable = (Runnable) aVar.f9150c.remove(str)) != null) {
            ((Handler) aVar.f9149b.f7621a).removeCallbacks(runnable);
        }
        jVar.X(str);
    }

    @Override // y2.b
    public final void e(ArrayList arrayList) {
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            String str = (String) obj;
            m.d().a(f9151t, u3.b.b("Constraints not met: Cancelling work ID ", str), new Throwable[0]);
            this.f9153b.X(str);
        }
    }

    @Override // y2.b
    public final void f(List list) {
        ArrayList arrayList = (ArrayList) list;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            String str = (String) obj;
            m.d().a(f9151t, u3.b.b("Constraints met: Scheduling work ID ", str), new Throwable[0]);
            this.f9153b.W(str, null);
        }
    }
}
