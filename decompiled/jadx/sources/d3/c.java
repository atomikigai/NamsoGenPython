package d3;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s5.j f2804a = new s5.j(3);

    public static void a(u2.j jVar, String str) {
        WorkDatabase workDatabase = jVar.f8821o;
        c3.j jVarX = workDatabase.x();
        aa.c cVarS = workDatabase.s();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            int i = jVarX.i(str2);
            if (i != 3 && i != 4) {
                jVarX.r(6, str2);
            }
            linkedList.addAll(cVarS.w(str2));
        }
        u2.b bVar = jVar.f8824r;
        synchronized (bVar.f8799v) {
            try {
                t2.m.d().a(u2.b.f8789w, "Processor cancelling " + str, new Throwable[0]);
                bVar.f8797t.add(str);
                u2.k kVar = (u2.k) bVar.f8794f.remove(str);
                boolean z4 = kVar != null;
                if (kVar == null) {
                    kVar = (u2.k) bVar.f8795r.remove(str);
                }
                u2.b.b(str, kVar);
                if (z4) {
                    bVar.h();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it = jVar.f8823q.iterator();
        while (it.hasNext()) {
            ((u2.c) it.next()).d(str);
        }
    }

    public abstract void b();

    @Override // java.lang.Runnable
    public final void run() {
        s5.j jVar = this.f2804a;
        try {
            b();
            jVar.C(t2.r.f8556m);
        } catch (Throwable th) {
            jVar.C(new t2.o(th));
        }
    }
}
