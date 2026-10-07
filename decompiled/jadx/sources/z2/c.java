package z2;

import a3.f;
import c3.i;
import java.util.ArrayList;
import java.util.Iterator;
import t2.m;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f10956a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f10957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f10958c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b f10959d;

    public c(f fVar) {
        this.f10958c = fVar;
    }

    public abstract boolean a(i iVar);

    public abstract boolean b(Object obj);

    public final void c(Iterable iterable) {
        this.f10956a.clear();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            if (a(iVar)) {
                this.f10956a.add(iVar.f1744a);
            }
        }
        if (this.f10956a.isEmpty()) {
            this.f10958c.b(this);
        } else {
            f fVar = this.f10958c;
            synchronized (fVar.f102c) {
                try {
                    if (fVar.f103d.add(this)) {
                        if (fVar.f103d.size() == 1) {
                            fVar.e = fVar.a();
                            m.d().a(f.f99f, String.format("%s: initial state = %s", fVar.getClass().getSimpleName(), fVar.e), new Throwable[0]);
                            fVar.d();
                        }
                        Object obj = fVar.e;
                        this.f10957b = obj;
                        d(this.f10959d, obj);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        d(this.f10959d, this.f10957b);
    }

    public final void d(b bVar, Object obj) {
        if (this.f10956a.isEmpty() || bVar == null) {
            return;
        }
        if (obj == null || b(obj)) {
            ArrayList arrayList = this.f10956a;
            y2.c cVar = (y2.c) bVar;
            synchronized (cVar.f10544c) {
                try {
                    y2.b bVar2 = cVar.f10542a;
                    if (bVar2 != null) {
                        bVar2.e(arrayList);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        ArrayList arrayList2 = this.f10956a;
        y2.c cVar2 = (y2.c) bVar;
        synchronized (cVar2.f10544c) {
            try {
                ArrayList arrayList3 = new ArrayList();
                int size = arrayList2.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList2.get(i);
                    i++;
                    String str = (String) obj2;
                    if (cVar2.a(str)) {
                        m.d().a(y2.c.f10541d, "Constraints met for " + str, new Throwable[0]);
                        arrayList3.add(str);
                    }
                }
                y2.b bVar3 = cVar2.f10542a;
                if (bVar3 != null) {
                    bVar3.f(arrayList3);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
