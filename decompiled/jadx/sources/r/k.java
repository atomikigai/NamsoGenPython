package r;

import da.v;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f8098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f8099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f8100c;

    public k(int i) {
        this.f8098a = i == 0 ? s.a.f8341a : new int[i];
        this.f8099b = i == 0 ? s.a.f8342b : new Object[i << 1];
    }

    public final int a(Object obj) {
        int i = this.f8100c * 2;
        Object[] objArr = this.f8099b;
        if (obj == null) {
            for (int i10 = 1; i10 < i; i10 += 2) {
                if (objArr[i10] == null) {
                    return i10 >> 1;
                }
            }
            return -1;
        }
        for (int i11 = 1; i11 < i; i11 += 2) {
            if (obj.equals(objArr[i11])) {
                return i11 >> 1;
            }
        }
        return -1;
    }

    public final void b(int i) {
        int i10 = this.f8100c;
        int[] iArr = this.f8098a;
        if (iArr.length < i) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, i);
            jc.i.d(iArrCopyOf, "copyOf(this, newSize)");
            this.f8098a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f8099b, i * 2);
            jc.i.d(objArrCopyOf, "copyOf(this, newSize)");
            this.f8099b = objArrCopyOf;
        }
        if (this.f8100c != i10) {
            throw new ConcurrentModificationException();
        }
    }

    public final int c(int i, Object obj) {
        int i10 = this.f8100c;
        if (i10 == 0) {
            return -1;
        }
        int iA = s.a.a(this.f8098a, i10, i);
        if (iA < 0 || jc.i.a(obj, this.f8099b[iA << 1])) {
            return iA;
        }
        int i11 = iA + 1;
        while (i11 < i10 && this.f8098a[i11] == i) {
            if (jc.i.a(obj, this.f8099b[i11 << 1])) {
                return i11;
            }
            i11++;
        }
        for (int i12 = iA - 1; i12 >= 0 && this.f8098a[i12] == i; i12--) {
            if (jc.i.a(obj, this.f8099b[i12 << 1])) {
                return i12;
            }
        }
        return ~i11;
    }

    public void clear() {
        if (this.f8100c > 0) {
            this.f8098a = s.a.f8341a;
            this.f8099b = s.a.f8342b;
            this.f8100c = 0;
        }
        if (this.f8100c > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return d(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return a(obj) >= 0;
    }

    public final int d(Object obj) {
        return obj == null ? e() : c(obj.hashCode(), obj);
    }

    public final int e() {
        int i = this.f8100c;
        if (i == 0) {
            return -1;
        }
        int iA = s.a.a(this.f8098a, i, 0);
        if (iA < 0 || this.f8099b[iA << 1] == null) {
            return iA;
        }
        int i10 = iA + 1;
        while (i10 < i && this.f8098a[i10] == 0) {
            if (this.f8099b[i10 << 1] == null) {
                return i10;
            }
            i10++;
        }
        for (int i11 = iA - 1; i11 >= 0 && this.f8098a[i11] == 0; i11--) {
            if (this.f8099b[i11 << 1] == null) {
                return i11;
            }
        }
        return ~i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof k) {
                int i = this.f8100c;
                if (i != ((k) obj).f8100c) {
                    return false;
                }
                k kVar = (k) obj;
                for (int i10 = 0; i10 < i; i10++) {
                    Object objF = f(i10);
                    Object objJ = j(i10);
                    Object obj2 = kVar.get(objF);
                    if (objJ == null) {
                        if (obj2 != null || !kVar.containsKey(objF)) {
                            return false;
                        }
                    } else if (!objJ.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.f8100c != ((Map) obj).size()) {
                return false;
            }
            int i11 = this.f8100c;
            for (int i12 = 0; i12 < i11; i12++) {
                Object objF2 = f(i12);
                Object objJ2 = j(i12);
                Object obj3 = ((Map) obj).get(objF2);
                if (objJ2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(objF2)) {
                        return false;
                    }
                } else if (!objJ2.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final Object f(int i) {
        if (i < 0 || i >= this.f8100c) {
            throw new IllegalArgumentException(v.f(i, "Expected index to be within 0..size()-1, but was ").toString());
        }
        return this.f8099b[i << 1];
    }

    public void g(k kVar) {
        jc.i.e(kVar, "map");
        int i = kVar.f8100c;
        b(this.f8100c + i);
        if (this.f8100c != 0) {
            for (int i10 = 0; i10 < i; i10++) {
                put(kVar.f(i10), kVar.j(i10));
            }
        } else if (i > 0) {
            vb.h.I(0, 0, i, kVar.f8098a, this.f8098a);
            vb.h.K(kVar.f8099b, 0, this.f8099b, 0, i << 1);
            this.f8100c = i;
        }
    }

    public Object get(Object obj) {
        int iD = d(obj);
        if (iD >= 0) {
            return this.f8099b[(iD << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int iD = d(obj);
        return iD >= 0 ? this.f8099b[(iD << 1) + 1] : obj2;
    }

    public Object h(int i) {
        int i10;
        if (i < 0 || i >= (i10 = this.f8100c)) {
            throw new IllegalArgumentException(v.f(i, "Expected index to be within 0..size()-1, but was ").toString());
        }
        Object[] objArr = this.f8099b;
        int i11 = i << 1;
        Object obj = objArr[i11 + 1];
        if (i10 <= 1) {
            clear();
            return obj;
        }
        int i12 = i10 - 1;
        int[] iArr = this.f8098a;
        if (iArr.length <= 8 || i10 >= iArr.length / 3) {
            if (i < i12) {
                int i13 = i + 1;
                vb.h.I(i, i13, i10, iArr, iArr);
                Object[] objArr2 = this.f8099b;
                vb.h.K(objArr2, i11, objArr2, i13 << 1, i10 << 1);
            }
            Object[] objArr3 = this.f8099b;
            int i14 = i12 << 1;
            objArr3[i14] = null;
            objArr3[i14 + 1] = null;
        } else {
            int i15 = i10 > 8 ? i10 + (i10 >> 1) : 8;
            int[] iArrCopyOf = Arrays.copyOf(iArr, i15);
            jc.i.d(iArrCopyOf, "copyOf(this, newSize)");
            this.f8098a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f8099b, i15 << 1);
            jc.i.d(objArrCopyOf, "copyOf(this, newSize)");
            this.f8099b = objArrCopyOf;
            if (i10 != this.f8100c) {
                throw new ConcurrentModificationException();
            }
            if (i > 0) {
                vb.h.I(0, 0, i, iArr, this.f8098a);
                vb.h.K(objArr, 0, this.f8099b, 0, i11);
            }
            if (i < i12) {
                int i16 = i + 1;
                vb.h.I(i, i16, i10, iArr, this.f8098a);
                vb.h.K(objArr, i11, this.f8099b, i16 << 1, i10 << 1);
            }
        }
        if (i10 != this.f8100c) {
            throw new ConcurrentModificationException();
        }
        this.f8100c = i12;
        return obj;
    }

    public int hashCode() {
        int[] iArr = this.f8098a;
        Object[] objArr = this.f8099b;
        int i = this.f8100c;
        int i10 = 1;
        int i11 = 0;
        int iHashCode = 0;
        while (i11 < i) {
            Object obj = objArr[i10];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i11];
            i11++;
            i10 += 2;
        }
        return iHashCode;
    }

    public Object i(int i, Object obj) {
        if (i < 0 || i >= this.f8100c) {
            throw new IllegalArgumentException(v.f(i, "Expected index to be within 0..size()-1, but was ").toString());
        }
        int i10 = (i << 1) + 1;
        Object[] objArr = this.f8099b;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        return obj2;
    }

    public final boolean isEmpty() {
        return this.f8100c <= 0;
    }

    public final Object j(int i) {
        if (i < 0 || i >= this.f8100c) {
            throw new IllegalArgumentException(v.f(i, "Expected index to be within 0..size()-1, but was ").toString());
        }
        return this.f8099b[(i << 1) + 1];
    }

    public Object put(Object obj, Object obj2) {
        int i = this.f8100c;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int iC = obj != null ? c(iHashCode, obj) : e();
        if (iC >= 0) {
            int i10 = (iC << 1) + 1;
            Object[] objArr = this.f8099b;
            Object obj3 = objArr[i10];
            objArr[i10] = obj2;
            return obj3;
        }
        int i11 = ~iC;
        int[] iArr = this.f8098a;
        if (i >= iArr.length) {
            int i12 = 8;
            if (i >= 8) {
                i12 = (i >> 1) + i;
            } else if (i < 4) {
                i12 = 4;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i12);
            jc.i.d(iArrCopyOf, "copyOf(this, newSize)");
            this.f8098a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f8099b, i12 << 1);
            jc.i.d(objArrCopyOf, "copyOf(this, newSize)");
            this.f8099b = objArrCopyOf;
            if (i != this.f8100c) {
                throw new ConcurrentModificationException();
            }
        }
        if (i11 < i) {
            int[] iArr2 = this.f8098a;
            int i13 = i11 + 1;
            vb.h.I(i13, i11, i, iArr2, iArr2);
            Object[] objArr2 = this.f8099b;
            vb.h.K(objArr2, i13 << 1, objArr2, i11 << 1, this.f8100c << 1);
        }
        int i14 = this.f8100c;
        if (i == i14) {
            int[] iArr3 = this.f8098a;
            if (i11 < iArr3.length) {
                iArr3[i11] = iHashCode;
                Object[] objArr3 = this.f8099b;
                int i15 = i11 << 1;
                objArr3[i15] = obj;
                objArr3[i15 + 1] = obj2;
                this.f8100c = i14 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public Object remove(Object obj) {
        int iD = d(obj);
        if (iD >= 0) {
            return h(iD);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int iD = d(obj);
        if (iD >= 0) {
            return i(iD, obj2);
        }
        return null;
    }

    public final int size() {
        return this.f8100c;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f8100c * 28);
        sb2.append('{');
        int i = this.f8100c;
        for (int i10 = 0; i10 < i; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            Object objF = f(i10);
            if (objF != sb2) {
                sb2.append(objF);
            } else {
                sb2.append("(this Map)");
            }
            sb2.append('=');
            Object objJ = j(i10);
            if (objJ != sb2) {
                sb2.append(objJ);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        jc.i.d(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    public final boolean remove(Object obj, Object obj2) {
        int iD = d(obj);
        if (iD < 0 || !jc.i.a(obj2, j(iD))) {
            return false;
        }
        h(iD);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int iD = d(obj);
        if (iD < 0 || !jc.i.a(obj2, j(iD))) {
            return false;
        }
        i(iD, obj3);
        return true;
    }

    public k(k kVar) {
        this(0);
        if (kVar != null) {
            g(kVar);
        }
    }
}
