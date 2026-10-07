package wb;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends vb.d implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f9885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9887c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f9888d;
    public final c e;

    public b(Object[] objArr, int i, int i10, b bVar, c cVar) {
        jc.i.e(objArr, "backing");
        jc.i.e(cVar, "root");
        this.f9885a = objArr;
        this.f9886b = i;
        this.f9887c = i10;
        this.f9888d = bVar;
        this.e = cVar;
        ((AbstractList) this).modCount = ((AbstractList) cVar).modCount;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        l();
        k();
        j(this.f9886b + this.f9887c, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        jc.i.e(collection, "elements");
        l();
        k();
        int size = collection.size();
        i(this.f9886b + this.f9887c, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        l();
        k();
        n(this.f9886b, this.f9887c);
    }

    @Override // vb.d
    public final int d() {
        k();
        return this.f9887c;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        k();
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.f9885a;
            int i = this.f9887c;
            if (i == list.size()) {
                for (int i10 = 0; i10 < i; i10++) {
                    if (jc.i.a(objArr[this.f9886b + i10], list.get(i10))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // vb.d
    public final Object g(int i) {
        l();
        k();
        int i10 = this.f9887c;
        if (i < 0 || i >= i10) {
            throw new IndexOutOfBoundsException(q1.a.i(i, i10, "index: ", ", size: "));
        }
        return m(this.f9886b + i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        k();
        int i10 = this.f9887c;
        if (i < 0 || i >= i10) {
            throw new IndexOutOfBoundsException(q1.a.i(i, i10, "index: ", ", size: "));
        }
        return this.f9885a[this.f9886b + i];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        k();
        Object[] objArr = this.f9885a;
        int i = this.f9887c;
        int iHashCode = 1;
        for (int i10 = 0; i10 < i; i10++) {
            Object obj = objArr[this.f9886b + i10];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    public final void i(int i, Collection collection, int i10) {
        ((AbstractList) this).modCount++;
        c cVar = this.e;
        b bVar = this.f9888d;
        if (bVar != null) {
            bVar.i(i, collection, i10);
        } else {
            c cVar2 = c.f9889d;
            cVar.i(i, collection, i10);
        }
        this.f9885a = cVar.f9890a;
        this.f9887c += i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        k();
        for (int i = 0; i < this.f9887c; i++) {
            if (jc.i.a(this.f9885a[this.f9886b + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        k();
        return this.f9887c == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void j(int i, Object obj) {
        ((AbstractList) this).modCount++;
        c cVar = this.e;
        b bVar = this.f9888d;
        if (bVar != null) {
            bVar.j(i, obj);
        } else {
            c cVar2 = c.f9889d;
            cVar.j(i, obj);
        }
        this.f9885a = cVar.f9890a;
        this.f9887c++;
    }

    public final void k() {
        if (((AbstractList) this.e).modCount != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    public final void l() {
        if (this.e.f9892c) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        k();
        for (int i = this.f9887c - 1; i >= 0; i--) {
            if (jc.i.a(this.f9885a[this.f9886b + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    public final Object m(int i) {
        Object objM;
        ((AbstractList) this).modCount++;
        b bVar = this.f9888d;
        if (bVar != null) {
            objM = bVar.m(i);
        } else {
            c cVar = c.f9889d;
            objM = this.e.m(i);
        }
        this.f9887c--;
        return objM;
    }

    public final void n(int i, int i10) {
        if (i10 > 0) {
            ((AbstractList) this).modCount++;
        }
        b bVar = this.f9888d;
        if (bVar != null) {
            bVar.n(i, i10);
        } else {
            c cVar = c.f9889d;
            this.e.n(i, i10);
        }
        this.f9887c -= i10;
    }

    public final int o(int i, int i10, Collection collection, boolean z4) {
        int iO;
        b bVar = this.f9888d;
        if (bVar != null) {
            iO = bVar.o(i, i10, collection, z4);
        } else {
            c cVar = c.f9889d;
            iO = this.e.o(i, i10, collection, z4);
        }
        if (iO > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f9887c -= iO;
        return iO;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        l();
        k();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            g(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        jc.i.e(collection, "elements");
        l();
        k();
        return o(this.f9886b, this.f9887c, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        jc.i.e(collection, "elements");
        l();
        k();
        return o(this.f9886b, this.f9887c, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        l();
        k();
        int i10 = this.f9887c;
        if (i < 0 || i >= i10) {
            throw new IndexOutOfBoundsException(q1.a.i(i, i10, "index: ", ", size: "));
        }
        Object[] objArr = this.f9885a;
        int i11 = this.f9886b;
        Object obj2 = objArr[i11 + i];
        objArr[i11 + i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i10) {
        com.bumptech.glide.d.a(i, i10, this.f9887c);
        return new b(this.f9885a, this.f9886b + i, i10 - i, this, this.e);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        jc.i.e(objArr, "array");
        k();
        int length = objArr.length;
        int i = this.f9887c;
        int i10 = this.f9886b;
        if (length < i) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(this.f9885a, i10, i + i10, objArr.getClass());
            jc.i.d(objArrCopyOfRange, "copyOfRange(...)");
            return objArrCopyOfRange;
        }
        vb.h.K(this.f9885a, 0, objArr, i10, i + i10);
        int i11 = this.f9887c;
        if (i11 < objArr.length) {
            objArr[i11] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        k();
        return com.bumptech.glide.c.a(this.f9885a, this.f9886b, this.f9887c, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        k();
        int i10 = this.f9887c;
        if (i < 0 || i > i10) {
            throw new IndexOutOfBoundsException(q1.a.i(i, i10, "index: ", ", size: "));
        }
        return new a(this, i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        l();
        k();
        int i10 = this.f9887c;
        if (i >= 0 && i <= i10) {
            j(this.f9886b + i, obj);
            return;
        }
        throw new IndexOutOfBoundsException(q1.a.i(i, i10, "index: ", ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        jc.i.e(collection, "elements");
        l();
        k();
        int i10 = this.f9887c;
        if (i >= 0 && i <= i10) {
            int size = collection.size();
            i(this.f9886b + i, collection, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(q1.a.i(i, i10, "index: ", ", size: "));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        k();
        Object[] objArr = this.f9885a;
        int i = this.f9887c;
        int i10 = this.f9886b;
        return vb.h.M(objArr, i10, i + i10);
    }
}
