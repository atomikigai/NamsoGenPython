package p4;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f7803a = new LinkedHashMap(100, 0.75f, true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f7804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f7805c;

    public j(long j4) {
        this.f7804b = j4;
    }

    public final synchronized Object a(Object obj) {
        i iVar;
        iVar = (i) this.f7803a.get(obj);
        return iVar != null ? iVar.f7801a : null;
    }

    public int b(Object obj) {
        return 1;
    }

    public final synchronized Object d(Object obj, Object obj2) {
        int iB = b(obj2);
        long j4 = iB;
        if (j4 >= this.f7804b) {
            c(obj, obj2);
            return null;
        }
        if (obj2 != null) {
            this.f7805c += j4;
        }
        i iVar = (i) this.f7803a.put(obj, obj2 == null ? null : new i(obj2, iB));
        if (iVar != null) {
            this.f7805c -= (long) iVar.f7802b;
            if (!iVar.f7801a.equals(obj2)) {
                c(obj, iVar.f7801a);
            }
        }
        e(this.f7804b);
        return iVar != null ? iVar.f7801a : null;
    }

    public final synchronized void e(long j4) {
        while (this.f7805c > j4) {
            Iterator it = this.f7803a.entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            i iVar = (i) entry.getValue();
            this.f7805c -= (long) iVar.f7802b;
            Object key = entry.getKey();
            it.remove();
            c(key, iVar.f7801a);
        }
    }

    public void c(Object obj, Object obj2) {
    }
}
