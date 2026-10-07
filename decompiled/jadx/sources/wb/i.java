package wb;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class i extends vb.e implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i f9912b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f9913a;

    static {
        f fVar = f.f9896y;
        f9912b = new i(f.f9896y);
    }

    public i(f fVar) {
        jc.i.e(fVar, "backing");
        this.f9913a = fVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        return this.f9913a.a(obj) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        jc.i.e(collection, "elements");
        this.f9913a.b();
        return super.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f9913a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f9913a.containsKey(obj);
    }

    @Override // vb.e
    public final int d() {
        return this.f9913a.f9904t;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f9913a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        f fVar = this.f9913a;
        fVar.getClass();
        return new d(fVar, 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        f fVar = this.f9913a;
        fVar.b();
        int iG = fVar.g(obj);
        if (iG < 0) {
            return false;
        }
        fVar.k(iG);
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        jc.i.e(collection, "elements");
        this.f9913a.b();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        jc.i.e(collection, "elements");
        this.f9913a.b();
        return super.retainAll(collection);
    }

    public i() {
        this(new f());
    }
}
