package u2;

import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import t2.m;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f8800a = m.f("Schedulers");

    public static void a(t2.b bVar, WorkDatabase workDatabase, List list) {
        if (list == null || list.size() == 0) {
            return;
        }
        c3.j jVarX = workDatabase.x();
        workDatabase.c();
        try {
            ArrayList arrayListE = jVarX.e(bVar.h);
            ArrayList arrayListC = jVarX.c();
            if (arrayListE.size() > 0) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                int size = arrayListE.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayListE.get(i);
                    i++;
                    jVarX.o(((c3.i) obj).f1744a, jCurrentTimeMillis);
                }
            }
            workDatabase.q();
            workDatabase.n();
            if (arrayListE.size() > 0) {
                c3.i[] iVarArr = (c3.i[]) arrayListE.toArray(new c3.i[arrayListE.size()]);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    c cVar = (c) it.next();
                    if (cVar.b()) {
                        cVar.a(iVarArr);
                    }
                }
            }
            if (arrayListC.size() > 0) {
                c3.i[] iVarArr2 = (c3.i[]) arrayListC.toArray(new c3.i[arrayListC.size()]);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    c cVar2 = (c) it2.next();
                    if (!cVar2.b()) {
                        cVar2.a(iVarArr2);
                    }
                }
            }
        } catch (Throwable th) {
            workDatabase.n();
            throw th;
        }
    }
}
