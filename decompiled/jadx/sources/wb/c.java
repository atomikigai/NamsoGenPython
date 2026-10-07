package wb;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends vb.d implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f9889d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f9890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f9892c;

    static {
        c cVar = new c(0);
        cVar.f9892c = true;
        f9889d = cVar;
    }

    public c(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        this.f9890a = new Object[i];
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        k();
        int i = this.f9891b;
        ((AbstractList) this).modCount++;
        l(i, 1);
        this.f9890a[i] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        jc.i.e(collection, "elements");
        k();
        int size = collection.size();
        i(this.f9891b, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        k();
        n(0, this.f9891b);
    }

    @Override // vb.d
    public final int d() {
        return this.f9891b;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.f9890a;
            int i = this.f9891b;
            if (i == list.size()) {
                for (int i10 = 0; i10 < i; i10++) {
                    if (jc.i.a(objArr[i10], list.get(i10))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // vb.d
    public final Object g(int i) {
        k();
        int i10 = this.f9891b;
        if (i < 0 || i >= i10) {
            throw new IndexOutOfBoundsException(q1.a.i(i, i10, "index: ", ", size: "));
        }
        return m(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int i10 = this.f9891b;
        if (i < 0 || i >= i10) {
            throw new IndexOutOfBoundsException(q1.a.i(i, i10, "index: ", ", size: "));
        }
        return this.f9890a[i];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        Object[] objArr = this.f9890a;
        int i = this.f9891b;
        int iHashCode = 1;
        for (int i10 = 0; i10 < i; i10++) {
            Object obj = objArr[i10];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    public final void i(int i, Collection collection, int i10) {
        ((AbstractList) this).modCount++;
        l(i, i10);
        Iterator it = collection.iterator();
        for (int i11 = 0; i11 < i10; i11++) {
            this.f9890a[i + i11] = it.next();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i = 0; i < this.f9891b; i++) {
            if (jc.i.a(this.f9890a[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f9891b == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void j(int i, Object obj) {
        ((AbstractList) this).modCount++;
        l(i, 1);
        this.f9890a[i] = obj;
    }

    public final void k() {
        if (this.f9892c) {
            throw new UnsupportedOperationException();
        }
    }

    public final void l(int i, int i10) {
        int i11 = this.f9891b + i10;
        if (i11 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.f9890a;
        if (i11 > objArr.length) {
            int length = objArr.length;
            int i12 = length + (length >> 1);
            if (i12 - i11 < 0) {
                i12 = i11;
            }
            if (i12 - 2147483639 > 0) {
                i12 = i11 > 2147483639 ? com.google.android.gms.common.api.f.API_PRIORITY_OTHER : 2147483639;
            }
            Object[] objArrCopyOf = Arrays.copyOf(objArr, i12);
            jc.i.d(objArrCopyOf, "copyOf(...)");
            this.f9890a = objArrCopyOf;
        }
        Object[] objArr2 = this.f9890a;
        vb.h.K(objArr2, i + i10, objArr2, i, this.f9891b);
        this.f9891b += i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i = this.f9891b - 1; i >= 0; i--) {
            if (jc.i.a(this.f9890a[i], obj)) {
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
        ((AbstractList) this).modCount++;
        Object[] objArr = this.f9890a;
        Object obj = objArr[i];
        vb.h.K(objArr, i, objArr, i + 1, this.f9891b);
        Object[] objArr2 = this.f9890a;
        int i10 = this.f9891b - 1;
        jc.i.e(objArr2, "<this>");
        objArr2[i10] = null;
        this.f9891b--;
        return obj;
    }

    public final void n(int i, int i10) {
        if (i10 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.f9890a;
        vb.h.K(objArr, i, objArr, i + i10, this.f9891b);
        Object[] objArr2 = this.f9890a;
        int i11 = this.f9891b;
        com.bumptech.glide.c.P(objArr2, i11 - i10, i11);
        this.f9891b -= i10;
    }

    public final int o(int i, int i10, Collection collection, boolean z4) {
        int i11 = 0;
        int i12 = 0;
        while (i11 < i10) {
            int i13 = i + i11;
            if (collection.contains(this.f9890a[i13]) == z4) {
                Object[] objArr = this.f9890a;
                i11++;
                objArr[i12 + i] = objArr[i13];
                i12++;
            } else {
                i11++;
            }
        }
        int i14 = i10 - i12;
        Object[] objArr2 = this.f9890a;
        vb.h.K(objArr2, i + i12, objArr2, i10 + i, this.f9891b);
        Object[] objArr3 = this.f9890a;
        int i15 = this.f9891b;
        com.bumptech.glide.c.P(objArr3, i15 - i14, i15);
        if (i14 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f9891b -= i14;
        return i14;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
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
        k();
        return o(0, this.f9891b, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        jc.i.e(collection, "elements");
        k();
        return o(0, this.f9891b, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        k();
        int i10 = this.f9891b;
        if (i < 0 || i >= i10) {
            throw new IndexOutOfBoundsException(q1.a.i(i, i10, "index: ", ", size: "));
        }
        Object[] objArr = this.f9890a;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i10) {
        com.bumptech.glide.d.a(i, i10, this.f9891b);
        return new b(this.f9890a, i, i10 - i, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        jc.i.e(objArr, "array");
        int length = objArr.length;
        int i = this.f9891b;
        if (length < i) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(this.f9890a, 0, i, objArr.getClass());
            jc.i.d(objArrCopyOfRange, "copyOfRange(...)");
            return objArrCopyOfRange;
        }
        vb.h.K(this.f9890a, 0, objArr, 0, i);
        int i10 = this.f9891b;
        if (i10 < objArr.length) {
            objArr[i10] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return com.bumptech.glide.c.a(this.f9890a, 0, this.f9891b, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        int i10 = this.f9891b;
        if (i < 0 || i > i10) {
            throw new IndexOutOfBoundsException(q1.a.i(i, i10, "index: ", ", size: "));
        }
        return new a(this, i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        jc.i.e(collection, "elements");
        k();
        int i10 = this.f9891b;
        if (i >= 0 && i <= i10) {
            int size = collection.size();
            i(i, collection, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(q1.a.i(i, i10, "index: ", ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        k();
        int i10 = this.f9891b;
        if (i >= 0 && i <= i10) {
            ((AbstractList) this).modCount++;
            l(i, 1);
            this.f9890a[i] = obj;
            return;
        }
        throw new IndexOutOfBoundsException(q1.a.i(i, i10, "index: ", ", size: "));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return vb.h.M(this.f9890a, 0, this.f9891b);
    }
}
