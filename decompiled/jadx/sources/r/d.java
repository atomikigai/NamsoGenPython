package r;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements Collection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f8082a;

    public d(e eVar) {
        this.f8082a = eVar;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f8082a.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f8082a.a(obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f8082a.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new a(this.f8082a, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        e eVar = this.f8082a;
        int iA = eVar.a(obj);
        if (iA < 0) {
            return false;
        }
        eVar.h(iA);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        e eVar = this.f8082a;
        int i = eVar.f8100c;
        int i10 = 0;
        boolean z4 = false;
        while (i10 < i) {
            if (collection.contains(eVar.j(i10))) {
                eVar.h(i10);
                i10--;
                i--;
                z4 = true;
            }
            i10++;
        }
        return z4;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        e eVar = this.f8082a;
        int i = eVar.f8100c;
        int i10 = 0;
        boolean z4 = false;
        while (i10 < i) {
            if (!collection.contains(eVar.j(i10))) {
                eVar.h(i10);
                i10--;
                i--;
                z4 = true;
            }
            i10++;
        }
        return z4;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f8082a.f8100c;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        e eVar = this.f8082a;
        int i = eVar.f8100c;
        Object[] objArr = new Object[i];
        for (int i10 = 0; i10 < i; i10++) {
            objArr[i10] = eVar.j(i10);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        e eVar = this.f8082a;
        int i = eVar.f8100c;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i10 = 0; i10 < i; i10++) {
            objArr[i10] = eVar.j(i10);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }
}
