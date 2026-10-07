package r;

import androidx.datastore.preferences.protobuf.c1;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class e extends k implements Map {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c1 f8083d;
    public b e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public d f8084f;

    public e() {
        super(0);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        c1 c1Var = this.f8083d;
        if (c1Var != null) {
            return c1Var;
        }
        c1 c1Var2 = new c1(1, this);
        this.f8083d = c1Var2;
        return c1Var2;
    }

    public final boolean k(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Map
    public final Set keySet() {
        b bVar = this.e;
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b(this);
        this.e = bVar2;
        return bVar2;
    }

    public final boolean l(Collection collection) {
        int i = this.f8100c;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i != this.f8100c;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        b(map.size() + this.f8100c);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        d dVar = this.f8084f;
        if (dVar != null) {
            return dVar;
        }
        d dVar2 = new d(this);
        this.f8084f = dVar2;
        return dVar2;
    }
}
