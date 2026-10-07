package r;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements Collection, Set {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f8085a = s.a.f8341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f8086b = s.a.f8342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f8087c;

    public f(int i) {
        if (i > 0) {
            i.a(this, i);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i;
        int iB;
        int i10 = this.f8087c;
        if (obj == null) {
            iB = i.b(this, null, 0);
            i = 0;
        } else {
            int iHashCode = obj.hashCode();
            i = iHashCode;
            iB = i.b(this, obj, iHashCode);
        }
        if (iB >= 0) {
            return false;
        }
        int i11 = ~iB;
        int[] iArr = this.f8085a;
        if (i10 >= iArr.length) {
            int i12 = 8;
            if (i10 >= 8) {
                i12 = (i10 >> 1) + i10;
            } else if (i10 < 4) {
                i12 = 4;
            }
            Object[] objArr = this.f8086b;
            int[] iArr2 = new int[i12];
            this.f8085a = iArr2;
            this.f8086b = new Object[i12];
            if (i10 != this.f8087c) {
                throw new ConcurrentModificationException();
            }
            if (iArr2.length != 0) {
                vb.h.I(0, 0, iArr.length, iArr, iArr2);
                vb.h.L(objArr, 0, this.f8086b, objArr.length, 6);
            }
        }
        if (i11 < i10) {
            int[] iArr3 = this.f8085a;
            int i13 = i11 + 1;
            vb.h.I(i13, i11, i10, iArr3, iArr3);
            Object[] objArr2 = this.f8086b;
            vb.h.K(objArr2, i13, objArr2, i11, i10);
        }
        int i14 = this.f8087c;
        if (i10 == i14) {
            int[] iArr4 = this.f8085a;
            if (i11 < iArr4.length) {
                iArr4[i11] = i;
                this.f8086b[i11] = obj;
                this.f8087c = i14 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        jc.i.e(collection, "elements");
        int size = collection.size() + this.f8087c;
        int i = this.f8087c;
        int[] iArr = this.f8085a;
        boolean zAdd = false;
        if (iArr.length < size) {
            Object[] objArr = this.f8086b;
            int[] iArr2 = new int[size];
            this.f8085a = iArr2;
            this.f8086b = new Object[size];
            if (i > 0) {
                vb.h.I(0, 0, i, iArr, iArr2);
                vb.h.L(objArr, 0, this.f8086b, this.f8087c, 6);
            }
        }
        if (this.f8087c != i) {
            throw new ConcurrentModificationException();
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.f8087c != 0) {
            this.f8085a = s.a.f8341a;
            this.f8086b = s.a.f8342b;
            this.f8087c = 0;
        }
        if (this.f8087c != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? i.b(this, null, 0) : i.b(this, obj, obj.hashCode())) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        jc.i.e(collection, "elements");
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final Object d(int i) {
        int i10 = this.f8087c;
        Object[] objArr = this.f8086b;
        Object obj = objArr[i];
        if (i10 <= 1) {
            clear();
            return obj;
        }
        int i11 = i10 - 1;
        int[] iArr = this.f8085a;
        if (iArr.length <= 8 || i10 >= iArr.length / 3) {
            if (i < i11) {
                int i12 = i + 1;
                vb.h.I(i, i12, i10, iArr, iArr);
                Object[] objArr2 = this.f8086b;
                vb.h.K(objArr2, i, objArr2, i12, i10);
            }
            this.f8086b[i11] = null;
        } else {
            int i13 = i10 > 8 ? i10 + (i10 >> 1) : 8;
            int[] iArr2 = new int[i13];
            this.f8085a = iArr2;
            this.f8086b = new Object[i13];
            if (i > 0) {
                vb.h.I(0, 0, i, iArr, iArr2);
                vb.h.L(objArr, 0, this.f8086b, i, 6);
            }
            if (i < i11) {
                int i14 = i + 1;
                vb.h.I(i, i14, i10, iArr, this.f8085a);
                vb.h.K(objArr, i, this.f8086b, i14, i10);
            }
        }
        if (i10 != this.f8087c) {
            throw new ConcurrentModificationException();
        }
        this.f8087c = i11;
        return obj;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || this.f8087c != ((Set) obj).size()) {
            return false;
        }
        try {
            int i = this.f8087c;
            for (int i10 = 0; i10 < i; i10++) {
                if (!((Set) obj).contains(this.f8086b[i10])) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f8085a;
        int i = this.f8087c;
        int i10 = 0;
        for (int i11 = 0; i11 < i; i11++) {
            i10 += iArr[i11];
        }
        return i10;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f8087c <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new a(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iB = obj == null ? i.b(this, null, 0) : i.b(this, obj, obj.hashCode());
        if (iB < 0) {
            return false;
        }
        d(iB);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        jc.i.e(collection, "elements");
        Iterator it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        boolean zContains;
        jc.i.e(collection, "elements");
        int i = this.f8087c - 1;
        boolean z4 = false;
        while (true) {
            int iIndexOf = -1;
            if (-1 >= i) {
                return z4;
            }
            Collection collection2 = collection;
            Object obj = this.f8086b[i];
            if (collection2 instanceof Collection) {
                zContains = collection2.contains(obj);
            } else {
                if (collection2 instanceof List) {
                    iIndexOf = ((List) collection2).indexOf(obj);
                } else {
                    int i10 = 0;
                    for (Object obj2 : collection2) {
                        if (i10 < 0) {
                            vb.j.T();
                            throw null;
                        }
                        if (jc.i.a(obj, obj2)) {
                            iIndexOf = i10;
                            break;
                        }
                        i10++;
                    }
                }
                zContains = iIndexOf >= 0;
            }
            if (!zContains) {
                d(i);
                z4 = true;
            }
            i--;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f8087c;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return vb.h.M(this.f8086b, 0, this.f8087c);
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f8087c * 14);
        sb2.append('{');
        int i = this.f8087c;
        for (int i10 = 0; i10 < i; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            Object obj = this.f8086b[i10];
            if (obj != this) {
                sb2.append(obj);
            } else {
                sb2.append("(this Set)");
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        jc.i.d(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        jc.i.e(objArr, "array");
        int i = this.f8087c;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        } else if (objArr.length > i) {
            objArr[i] = null;
        }
        vb.h.K(this.f8086b, 0, objArr, 0, this.f8087c);
        return objArr;
    }
}
