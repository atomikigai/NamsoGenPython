package d1;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import jc.i;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f2791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f2792b;

    public b(LinkedHashMap linkedHashMap, boolean z4) {
        this.f2791a = linkedHashMap;
        this.f2792b = new AtomicBoolean(z4);
    }

    public final Map a() {
        Map mapUnmodifiableMap = Collections.unmodifiableMap(this.f2791a);
        i.d(mapUnmodifiableMap, "unmodifiableMap(preferencesMap)");
        return mapUnmodifiableMap;
    }

    public final Object b(d dVar) {
        i.e(dVar, "key");
        return this.f2791a.get(dVar);
    }

    public final void c(d dVar, Object obj) {
        i.e(dVar, "key");
        AtomicBoolean atomicBoolean = this.f2792b;
        if (atomicBoolean.get()) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
        }
        LinkedHashMap linkedHashMap = this.f2791a;
        if (obj == null) {
            if (atomicBoolean.get()) {
                throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
            }
            linkedHashMap.remove(dVar);
        } else {
            if (!(obj instanceof Set)) {
                linkedHashMap.put(dVar, obj);
                return;
            }
            Set setUnmodifiableSet = Collections.unmodifiableSet(vb.i.q0((Iterable) obj));
            i.d(setUnmodifiableSet, "unmodifiableSet(value.toSet())");
            linkedHashMap.put(dVar, setUnmodifiableSet);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        return i.a(this.f2791a, ((b) obj).f2791a);
    }

    public final int hashCode() {
        return this.f2791a.hashCode();
    }

    public final String toString() {
        return vb.i.e0(this.f2791a.entrySet(), ",\n", "{\n", "\n}", a.f2790a, 24);
    }

    public /* synthetic */ b(boolean z4) {
        this(new LinkedHashMap(), z4);
    }
}
