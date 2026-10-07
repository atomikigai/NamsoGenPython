package y2;

import a3.h;
import a3.i;
import a3.j;
import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import t2.m;
import z2.d;
import z2.e;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements z2.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f10541d = m.f("WorkConstraintsTracker");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f10542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z2.c[] f10543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f10544c;

    public c(Context context, f3.a aVar, b bVar) {
        Context applicationContext = context.getApplicationContext();
        this.f10542a = bVar;
        this.f10543b = new z2.c[]{new z2.a((a3.a) j.c(applicationContext, aVar).f107a, 0), new z2.a((a3.b) j.c(applicationContext, aVar).f108b, 1), new z2.a((i) j.c(applicationContext, aVar).f110d, 4), new z2.a((h) j.c(applicationContext, aVar).f109c, 2), new z2.a((h) j.c(applicationContext, aVar).f109c, 3), new e((h) j.c(applicationContext, aVar).f109c), new d((h) j.c(applicationContext, aVar).f109c)};
        this.f10544c = new Object();
    }

    public final boolean a(String str) {
        synchronized (this.f10544c) {
            try {
                for (z2.c cVar : this.f10543b) {
                    Object obj = cVar.f10957b;
                    if (obj != null && cVar.b(obj) && cVar.f10956a.contains(str)) {
                        m.d().a(f10541d, "Work " + str + " constrained by " + cVar.getClass().getSimpleName(), new Throwable[0]);
                        return false;
                    }
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(Collection collection) {
        synchronized (this.f10544c) {
            try {
                for (z2.c cVar : this.f10543b) {
                    if (cVar.f10959d != null) {
                        cVar.f10959d = null;
                        cVar.d(null, cVar.f10957b);
                    }
                }
                for (z2.c cVar2 : this.f10543b) {
                    cVar2.c(collection);
                }
                for (z2.c cVar3 : this.f10543b) {
                    if (cVar3.f10959d != this) {
                        cVar3.f10959d = this;
                        cVar3.d(this, cVar3.f10957b);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        synchronized (this.f10544c) {
            try {
                for (z2.c cVar : this.f10543b) {
                    ArrayList arrayList = cVar.f10956a;
                    if (!arrayList.isEmpty()) {
                        arrayList.clear();
                        cVar.f10958c.b(cVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
