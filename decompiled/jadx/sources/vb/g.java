package vb;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class g extends d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object[] f9292d = new Object[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f9294b = f9292d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9295c;

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int length;
        int i10 = this.f9295c;
        if (i < 0 || i > i10) {
            throw new IndexOutOfBoundsException(q1.a.i(i, i10, "index: ", ", size: "));
        }
        if (i == i10) {
            addLast(obj);
            return;
        }
        if (i == 0) {
            addFirst(obj);
            return;
        }
        n();
        i(this.f9295c + 1);
        int iM = m(this.f9293a + i);
        int i11 = this.f9295c;
        if (i < ((i11 + 1) >> 1)) {
            if (iM == 0) {
                Object[] objArr = this.f9294b;
                jc.i.e(objArr, "<this>");
                iM = objArr.length;
            }
            int i12 = iM - 1;
            int i13 = this.f9293a;
            if (i13 == 0) {
                Object[] objArr2 = this.f9294b;
                jc.i.e(objArr2, "<this>");
                length = objArr2.length - 1;
            } else {
                length = i13 - 1;
            }
            int i14 = this.f9293a;
            if (i12 >= i14) {
                Object[] objArr3 = this.f9294b;
                objArr3[length] = objArr3[i14];
                h.K(objArr3, i14, objArr3, i14 + 1, i12 + 1);
            } else {
                Object[] objArr4 = this.f9294b;
                h.K(objArr4, i14 - 1, objArr4, i14, objArr4.length);
                Object[] objArr5 = this.f9294b;
                objArr5[objArr5.length - 1] = objArr5[0];
                h.K(objArr5, 0, objArr5, 1, i12 + 1);
            }
            this.f9294b[i12] = obj;
            this.f9293a = length;
        } else {
            int iM2 = m(i11 + this.f9293a);
            if (iM < iM2) {
                Object[] objArr6 = this.f9294b;
                h.K(objArr6, iM + 1, objArr6, iM, iM2);
            } else {
                Object[] objArr7 = this.f9294b;
                h.K(objArr7, 1, objArr7, 0, iM2);
                Object[] objArr8 = this.f9294b;
                objArr8[0] = objArr8[objArr8.length - 1];
                h.K(objArr8, iM + 1, objArr8, iM, objArr8.length - 1);
            }
            this.f9294b[iM] = obj;
        }
        this.f9295c++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        jc.i.e(collection, "elements");
        int i10 = this.f9295c;
        if (i < 0 || i > i10) {
            throw new IndexOutOfBoundsException(q1.a.i(i, i10, "index: ", ", size: "));
        }
        if (collection.isEmpty()) {
            return false;
        }
        if (i == this.f9295c) {
            return addAll(collection);
        }
        n();
        i(collection.size() + this.f9295c);
        int iM = m(this.f9295c + this.f9293a);
        int iM2 = m(this.f9293a + i);
        int size = collection.size();
        if (i >= ((this.f9295c + 1) >> 1)) {
            int i11 = iM2 + size;
            if (iM2 < iM) {
                int i12 = size + iM;
                Object[] objArr = this.f9294b;
                if (i12 <= objArr.length) {
                    h.K(objArr, i11, objArr, iM2, iM);
                } else if (i11 >= objArr.length) {
                    h.K(objArr, i11 - objArr.length, objArr, iM2, iM);
                } else {
                    int length = iM - (i12 - objArr.length);
                    h.K(objArr, 0, objArr, length, iM);
                    Object[] objArr2 = this.f9294b;
                    h.K(objArr2, i11, objArr2, iM2, length);
                }
            } else {
                Object[] objArr3 = this.f9294b;
                h.K(objArr3, size, objArr3, 0, iM);
                Object[] objArr4 = this.f9294b;
                if (i11 >= objArr4.length) {
                    h.K(objArr4, i11 - objArr4.length, objArr4, iM2, objArr4.length);
                } else {
                    h.K(objArr4, 0, objArr4, objArr4.length - size, objArr4.length);
                    Object[] objArr5 = this.f9294b;
                    h.K(objArr5, i11, objArr5, iM2, objArr5.length - size);
                }
            }
            h(iM2, collection);
            return true;
        }
        int i13 = this.f9293a;
        int length2 = i13 - size;
        if (iM2 < i13) {
            Object[] objArr6 = this.f9294b;
            h.K(objArr6, length2, objArr6, i13, objArr6.length);
            if (size >= iM2) {
                Object[] objArr7 = this.f9294b;
                h.K(objArr7, objArr7.length - size, objArr7, 0, iM2);
            } else {
                Object[] objArr8 = this.f9294b;
                h.K(objArr8, objArr8.length - size, objArr8, 0, size);
                Object[] objArr9 = this.f9294b;
                h.K(objArr9, 0, objArr9, size, iM2);
            }
        } else if (length2 >= 0) {
            Object[] objArr10 = this.f9294b;
            h.K(objArr10, length2, objArr10, i13, iM2);
        } else {
            Object[] objArr11 = this.f9294b;
            length2 += objArr11.length;
            int i14 = iM2 - i13;
            int length3 = objArr11.length - length2;
            if (length3 >= i14) {
                h.K(objArr11, length2, objArr11, i13, iM2);
            } else {
                h.K(objArr11, length2, objArr11, i13, i13 + length3);
                Object[] objArr12 = this.f9294b;
                h.K(objArr12, 0, objArr12, this.f9293a + length3, iM2);
            }
        }
        this.f9293a = length2;
        h(k(iM2 - size), collection);
        return true;
    }

    public final void addFirst(Object obj) {
        n();
        i(this.f9295c + 1);
        int length = this.f9293a;
        if (length == 0) {
            Object[] objArr = this.f9294b;
            jc.i.e(objArr, "<this>");
            length = objArr.length;
        }
        int i = length - 1;
        this.f9293a = i;
        this.f9294b[i] = obj;
        this.f9295c++;
    }

    public final void addLast(Object obj) {
        n();
        i(d() + 1);
        this.f9294b[m(d() + this.f9293a)] = obj;
        this.f9295c = d() + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            n();
            l(this.f9293a, m(d() + this.f9293a));
        }
        this.f9293a = 0;
        this.f9295c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // vb.d
    public final int d() {
        return this.f9295c;
    }

    @Override // vb.d
    public final Object g(int i) {
        int i10 = this.f9295c;
        if (i < 0 || i >= i10) {
            throw new IndexOutOfBoundsException(q1.a.i(i, i10, "index: ", ", size: "));
        }
        if (i == j.R(this)) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        n();
        int iM = m(this.f9293a + i);
        Object[] objArr = this.f9294b;
        Object obj = objArr[iM];
        if (i < (this.f9295c >> 1)) {
            int i11 = this.f9293a;
            if (iM >= i11) {
                h.K(objArr, i11 + 1, objArr, i11, iM);
            } else {
                h.K(objArr, 1, objArr, 0, iM);
                Object[] objArr2 = this.f9294b;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i12 = this.f9293a;
                h.K(objArr2, i12 + 1, objArr2, i12, objArr2.length - 1);
            }
            Object[] objArr3 = this.f9294b;
            int i13 = this.f9293a;
            objArr3[i13] = null;
            this.f9293a = j(i13);
        } else {
            int iM2 = m(j.R(this) + this.f9293a);
            if (iM <= iM2) {
                Object[] objArr4 = this.f9294b;
                h.K(objArr4, iM, objArr4, iM + 1, iM2 + 1);
            } else {
                Object[] objArr5 = this.f9294b;
                h.K(objArr5, iM, objArr5, iM + 1, objArr5.length);
                Object[] objArr6 = this.f9294b;
                objArr6[objArr6.length - 1] = objArr6[0];
                h.K(objArr6, 0, objArr6, 1, iM2 + 1);
            }
            this.f9294b[iM2] = null;
        }
        this.f9295c--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int iD = d();
        if (i < 0 || i >= iD) {
            throw new IndexOutOfBoundsException(q1.a.i(i, iD, "index: ", ", size: "));
        }
        return this.f9294b[m(this.f9293a + i)];
    }

    public final void h(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f9294b.length;
        while (i < length && it.hasNext()) {
            this.f9294b[i] = it.next();
            i++;
        }
        int i10 = this.f9293a;
        for (int i11 = 0; i11 < i10 && it.hasNext(); i11++) {
            this.f9294b[i11] = it.next();
        }
        this.f9295c = collection.size() + this.f9295c;
    }

    public final void i(int i) {
        if (i < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f9294b;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == f9292d) {
            if (i < 10) {
                i = 10;
            }
            this.f9294b = new Object[i];
            return;
        }
        int length = objArr.length;
        int i10 = length + (length >> 1);
        if (i10 - i < 0) {
            i10 = i;
        }
        if (i10 - 2147483639 > 0) {
            i10 = i > 2147483639 ? com.google.android.gms.common.api.f.API_PRIORITY_OTHER : 2147483639;
        }
        Object[] objArr2 = new Object[i10];
        h.K(objArr, 0, objArr2, this.f9293a, objArr.length);
        Object[] objArr3 = this.f9294b;
        int length2 = objArr3.length;
        int i11 = this.f9293a;
        h.K(objArr3, length2 - i11, objArr2, 0, i11);
        this.f9293a = 0;
        this.f9294b = objArr2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int iM = m(d() + this.f9293a);
        int length = this.f9293a;
        if (length < iM) {
            while (length < iM) {
                if (jc.i.a(obj, this.f9294b[length])) {
                    i = this.f9293a;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iM) {
            return -1;
        }
        int length2 = this.f9294b.length;
        while (length < length2) {
            if (jc.i.a(obj, this.f9294b[length])) {
                i = this.f9293a;
            } else {
                length++;
            }
        }
        for (int i10 = 0; i10 < iM; i10++) {
            if (jc.i.a(obj, this.f9294b[i10])) {
                length = i10 + this.f9294b.length;
                i = this.f9293a;
            }
        }
        return -1;
        return length - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return d() == 0;
    }

    public final int j(int i) {
        Object[] objArr = this.f9294b;
        jc.i.e(objArr, "<this>");
        if (i == objArr.length - 1) {
            return 0;
        }
        return i + 1;
    }

    public final int k(int i) {
        return i < 0 ? i + this.f9294b.length : i;
    }

    public final void l(int i, int i10) {
        if (i < i10) {
            h.N(this.f9294b, i, i10);
            return;
        }
        Object[] objArr = this.f9294b;
        h.N(objArr, i, objArr.length);
        h.N(this.f9294b, 0, i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i;
        int iM = m(this.f9295c + this.f9293a);
        int i10 = this.f9293a;
        if (i10 < iM) {
            length = iM - 1;
            if (i10 <= length) {
                while (!jc.i.a(obj, this.f9294b[length])) {
                    if (length != i10) {
                        length--;
                    }
                }
                i = this.f9293a;
                return length - i;
            }
            return -1;
        }
        if (i10 > iM) {
            for (int i11 = iM - 1; -1 < i11; i11--) {
                if (jc.i.a(obj, this.f9294b[i11])) {
                    length = i11 + this.f9294b.length;
                    i = this.f9293a;
                    return length - i;
                }
            }
            Object[] objArr = this.f9294b;
            jc.i.e(objArr, "<this>");
            length = objArr.length - 1;
            int i12 = this.f9293a;
            if (i12 <= length) {
                while (!jc.i.a(obj, this.f9294b[length])) {
                    if (length != i12) {
                        length--;
                    }
                }
                i = this.f9293a;
                return length - i;
            }
        }
        return -1;
    }

    public final int m(int i) {
        Object[] objArr = this.f9294b;
        return i >= objArr.length ? i - objArr.length : i;
    }

    public final void n() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        g(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int iM;
        jc.i.e(collection, "elements");
        boolean z4 = false;
        z4 = false;
        z4 = false;
        if (!isEmpty() && this.f9294b.length != 0) {
            int iM2 = m(this.f9295c + this.f9293a);
            int i = this.f9293a;
            if (i < iM2) {
                iM = i;
                while (i < iM2) {
                    Object obj = this.f9294b[i];
                    if (collection.contains(obj)) {
                        z4 = true;
                    } else {
                        this.f9294b[iM] = obj;
                        iM++;
                    }
                    i++;
                }
                h.N(this.f9294b, iM, iM2);
            } else {
                int length = this.f9294b.length;
                boolean z10 = false;
                int i10 = i;
                while (i < length) {
                    Object[] objArr = this.f9294b;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (collection.contains(obj2)) {
                        z10 = true;
                    } else {
                        this.f9294b[i10] = obj2;
                        i10++;
                    }
                    i++;
                }
                iM = m(i10);
                for (int i11 = 0; i11 < iM2; i11++) {
                    Object[] objArr2 = this.f9294b;
                    Object obj3 = objArr2[i11];
                    objArr2[i11] = null;
                    if (collection.contains(obj3)) {
                        z10 = true;
                    } else {
                        this.f9294b[iM] = obj3;
                        iM = j(iM);
                    }
                }
                z4 = z10;
            }
            if (z4) {
                n();
                this.f9295c = k(iM - this.f9293a);
            }
        }
        return z4;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        n();
        Object[] objArr = this.f9294b;
        int i = this.f9293a;
        Object obj = objArr[i];
        objArr[i] = null;
        this.f9293a = j(i);
        this.f9295c = d() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        n();
        int iM = m(j.R(this) + this.f9293a);
        Object[] objArr = this.f9294b;
        Object obj = objArr[iM];
        objArr[iM] = null;
        this.f9295c = d() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i10) {
        com.bumptech.glide.d.a(i, i10, this.f9295c);
        int i11 = i10 - i;
        if (i11 == 0) {
            return;
        }
        if (i11 == this.f9295c) {
            clear();
            return;
        }
        if (i11 == 1) {
            g(i);
            return;
        }
        n();
        if (i < this.f9295c - i10) {
            int iM = m((i - 1) + this.f9293a);
            int iM2 = m((i10 - 1) + this.f9293a);
            while (i > 0) {
                int i12 = iM + 1;
                int iMin = Math.min(i, Math.min(i12, iM2 + 1));
                Object[] objArr = this.f9294b;
                int i13 = iM2 - iMin;
                int i14 = iM - iMin;
                h.K(objArr, i13 + 1, objArr, i14 + 1, i12);
                iM = k(i14);
                iM2 = k(i13);
                i -= iMin;
            }
            int iM3 = m(this.f9293a + i11);
            l(this.f9293a, iM3);
            this.f9293a = iM3;
        } else {
            int iM4 = m(this.f9293a + i10);
            int iM5 = m(this.f9293a + i);
            int i15 = this.f9295c;
            while (true) {
                i15 -= i10;
                if (i15 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f9294b;
                i10 = Math.min(i15, Math.min(objArr2.length - iM4, objArr2.length - iM5));
                Object[] objArr3 = this.f9294b;
                int i16 = iM4 + i10;
                h.K(objArr3, iM5, objArr3, iM4, i16);
                iM4 = m(i16);
                iM5 = m(iM5 + i10);
            }
            int iM6 = m(this.f9295c + this.f9293a);
            l(k(iM6 - i11), iM6);
        }
        this.f9295c -= i11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int iM;
        jc.i.e(collection, "elements");
        boolean z4 = false;
        z4 = false;
        z4 = false;
        if (!isEmpty() && this.f9294b.length != 0) {
            int iM2 = m(this.f9295c + this.f9293a);
            int i = this.f9293a;
            if (i < iM2) {
                iM = i;
                while (i < iM2) {
                    Object obj = this.f9294b[i];
                    if (collection.contains(obj)) {
                        this.f9294b[iM] = obj;
                        iM++;
                    } else {
                        z4 = true;
                    }
                    i++;
                }
                h.N(this.f9294b, iM, iM2);
            } else {
                int length = this.f9294b.length;
                boolean z10 = false;
                int i10 = i;
                while (i < length) {
                    Object[] objArr = this.f9294b;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (collection.contains(obj2)) {
                        this.f9294b[i10] = obj2;
                        i10++;
                    } else {
                        z10 = true;
                    }
                    i++;
                }
                iM = m(i10);
                for (int i11 = 0; i11 < iM2; i11++) {
                    Object[] objArr2 = this.f9294b;
                    Object obj3 = objArr2[i11];
                    objArr2[i11] = null;
                    if (collection.contains(obj3)) {
                        this.f9294b[iM] = obj3;
                        iM = j(iM);
                    } else {
                        z10 = true;
                    }
                }
                z4 = z10;
            }
            if (z4) {
                n();
                this.f9295c = k(iM - this.f9293a);
            }
        }
        return z4;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int iD = d();
        if (i < 0 || i >= iD) {
            throw new IndexOutOfBoundsException(q1.a.i(i, iD, "index: ", ", size: "));
        }
        int iM = m(this.f9293a + i);
        Object[] objArr = this.f9294b;
        Object obj2 = objArr[iM];
        objArr[iM] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[d()]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        jc.i.e(objArr, "array");
        int length = objArr.length;
        int i = this.f9295c;
        if (length < i) {
            Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), i);
            jc.i.c(objNewInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            objArr = (Object[]) objNewInstance;
        }
        int iM = m(this.f9295c + this.f9293a);
        int i10 = this.f9293a;
        if (i10 < iM) {
            h.L(this.f9294b, i10, objArr, iM, 2);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f9294b;
            h.K(objArr2, 0, objArr, this.f9293a, objArr2.length);
            Object[] objArr3 = this.f9294b;
            h.K(objArr3, objArr3.length - this.f9293a, objArr, 0, iM);
        }
        int i11 = this.f9295c;
        if (i11 < objArr.length) {
            objArr[i11] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        jc.i.e(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        n();
        i(collection.size() + d());
        h(m(d() + this.f9293a), collection);
        return true;
    }
}
