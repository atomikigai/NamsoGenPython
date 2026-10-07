package oc;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class j implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Iterator f7716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f7717b;

    public j(k kVar) {
        this.f7717b = kVar;
        this.f7716a = kVar.f7718a.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7716a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f7717b.f7719b.invoke(this.f7716a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
