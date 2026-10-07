package z7;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class o implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Iterator f11284a;

    public o(p pVar) {
        this.f11284a = pVar.f11292a.keySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f11284a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return (String) this.f11284a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
