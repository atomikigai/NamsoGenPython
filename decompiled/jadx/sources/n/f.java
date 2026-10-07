package n;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class f implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f7127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f7128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakHashMap f7129c = new WeakHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f7130d = 0;

    public c d(Object obj) {
        c cVar = this.f7127a;
        while (cVar != null && !cVar.f7120a.equals(obj)) {
            cVar = cVar.f7122c;
        }
        return cVar;
    }

    public final boolean equals(Object obj) {
        b bVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f7130d != fVar.f7130d) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = fVar.iterator();
        while (true) {
            bVar = (b) it;
            if (!bVar.hasNext()) {
                break;
            }
            b bVar2 = (b) it2;
            if (!bVar2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) bVar.next();
            Object next = bVar2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return (bVar.hasNext() || ((b) it2).hasNext()) ? false : true;
    }

    public Object g(Object obj) {
        c cVarD = d(obj);
        if (cVarD == null) {
            return null;
        }
        this.f7130d--;
        WeakHashMap weakHashMap = this.f7129c;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((e) it.next()).a(cVarD);
            }
        }
        c cVar = cVarD.f7123d;
        if (cVar != null) {
            cVar.f7122c = cVarD.f7122c;
        } else {
            this.f7127a = cVarD.f7122c;
        }
        c cVar2 = cVarD.f7122c;
        if (cVar2 != null) {
            cVar2.f7123d = cVar;
        } else {
            this.f7128b = cVar;
        }
        cVarD.f7122c = null;
        cVarD.f7123d = null;
        return cVarD.f7121b;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) bVar.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        b bVar = new b(this.f7127a, this.f7128b, 0);
        this.f7129c.put(bVar, Boolean.FALSE);
        return bVar;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                sb2.append("]");
                return sb2.toString();
            }
            sb2.append(((Map.Entry) bVar.next()).toString());
            if (bVar.hasNext()) {
                sb2.append(", ");
            }
        }
    }
}
