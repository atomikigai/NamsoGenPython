package wb;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class f implements Map, Serializable {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final f f9896y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f9897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f9898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f9899c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f9900d;
    public int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f9901f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f9902r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f9903s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f9904t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public g f9905u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public h f9906v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public g f9907w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f9908x;

    static {
        f fVar = new f(0);
        fVar.f9908x = true;
        f9896y = fVar;
    }

    public f() {
        this(8);
    }

    public final int a(Object obj) {
        b();
        while (true) {
            int i = i(obj);
            int i10 = this.e * 2;
            int length = this.f9900d.length / 2;
            if (i10 > length) {
                i10 = length;
            }
            int i11 = 0;
            while (true) {
                int[] iArr = this.f9900d;
                int i12 = iArr[i];
                if (i12 <= 0) {
                    int i13 = this.f9901f;
                    Object[] objArr = this.f9897a;
                    if (i13 >= objArr.length) {
                        f(1);
                        break;
                    }
                    int i14 = i13 + 1;
                    this.f9901f = i14;
                    objArr[i13] = obj;
                    this.f9899c[i13] = i;
                    iArr[i] = i14;
                    this.f9904t++;
                    this.f9903s++;
                    if (i11 > this.e) {
                        this.e = i11;
                    }
                    return i13;
                }
                if (jc.i.a(this.f9897a[i12 - 1], obj)) {
                    return -i12;
                }
                i11++;
                if (i11 > i10) {
                    j(this.f9900d.length * 2);
                    break;
                }
                i = i == 0 ? this.f9900d.length - 1 : i - 1;
            }
        }
    }

    public final void b() {
        if (this.f9908x) {
            throw new UnsupportedOperationException();
        }
    }

    public final void c(boolean z4) {
        int i;
        Object[] objArr = this.f9898b;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            i = this.f9901f;
            if (i10 >= i) {
                break;
            }
            int[] iArr = this.f9899c;
            int i12 = iArr[i10];
            if (i12 >= 0) {
                Object[] objArr2 = this.f9897a;
                objArr2[i11] = objArr2[i10];
                if (objArr != null) {
                    objArr[i11] = objArr[i10];
                }
                if (z4) {
                    iArr[i11] = i12;
                    this.f9900d[i12] = i11 + 1;
                }
                i11++;
            }
            i10++;
        }
        com.bumptech.glide.c.P(this.f9897a, i11, i);
        if (objArr != null) {
            com.bumptech.glide.c.P(objArr, i11, this.f9901f);
        }
        this.f9901f = i11;
    }

    @Override // java.util.Map
    public final void clear() {
        b();
        int i = this.f9901f - 1;
        if (i >= 0) {
            int i10 = 0;
            while (true) {
                int[] iArr = this.f9899c;
                int i11 = iArr[i10];
                if (i11 >= 0) {
                    this.f9900d[i11] = 0;
                    iArr[i10] = -1;
                }
                if (i10 == i) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        com.bumptech.glide.c.P(this.f9897a, 0, this.f9901f);
        Object[] objArr = this.f9898b;
        if (objArr != null) {
            com.bumptech.glide.c.P(objArr, 0, this.f9901f);
        }
        this.f9904t = 0;
        this.f9901f = 0;
        this.f9903s++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return g(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return h(obj) >= 0;
    }

    public final boolean d(Collection collection) {
        jc.i.e(collection, "m");
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    if (!e((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean e(Map.Entry entry) {
        jc.i.e(entry, "entry");
        int iG = g(entry.getKey());
        if (iG < 0) {
            return false;
        }
        Object[] objArr = this.f9898b;
        jc.i.b(objArr);
        return jc.i.a(objArr[iG], entry.getValue());
    }

    @Override // java.util.Map
    public final Set entrySet() {
        g gVar = this.f9907w;
        if (gVar != null) {
            return gVar;
        }
        g gVar2 = new g(this, 0);
        this.f9907w = gVar2;
        return gVar2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        return this.f9904t == map.size() && d(map.entrySet());
    }

    public final void f(int i) {
        Object[] objArrCopyOf;
        Object[] objArr = this.f9897a;
        int length = objArr.length;
        int i10 = this.f9901f;
        int i11 = length - i10;
        int i12 = i10 - this.f9904t;
        if (i11 < i && i11 + i12 >= i && i12 >= objArr.length / 4) {
            c(true);
            return;
        }
        int i13 = i10 + i;
        if (i13 < 0) {
            throw new OutOfMemoryError();
        }
        if (i13 > objArr.length) {
            int length2 = objArr.length;
            int i14 = length2 + (length2 >> 1);
            if (i14 - i13 < 0) {
                i14 = i13;
            }
            if (i14 - 2147483639 > 0) {
                i14 = i13 > 2147483639 ? com.google.android.gms.common.api.f.API_PRIORITY_OTHER : 2147483639;
            }
            Object[] objArrCopyOf2 = Arrays.copyOf(objArr, i14);
            jc.i.d(objArrCopyOf2, "copyOf(...)");
            this.f9897a = objArrCopyOf2;
            Object[] objArr2 = this.f9898b;
            if (objArr2 != null) {
                objArrCopyOf = Arrays.copyOf(objArr2, i14);
                jc.i.d(objArrCopyOf, "copyOf(...)");
            } else {
                objArrCopyOf = null;
            }
            this.f9898b = objArrCopyOf;
            int[] iArrCopyOf = Arrays.copyOf(this.f9899c, i14);
            jc.i.d(iArrCopyOf, "copyOf(...)");
            this.f9899c = iArrCopyOf;
            int iHighestOneBit = Integer.highestOneBit((i14 >= 1 ? i14 : 1) * 3);
            if (iHighestOneBit > this.f9900d.length) {
                j(iHighestOneBit);
            }
        }
    }

    public final int g(Object obj) {
        int i = i(obj);
        int i10 = this.e;
        while (true) {
            int i11 = this.f9900d[i];
            if (i11 == 0) {
                return -1;
            }
            if (i11 > 0) {
                int i12 = i11 - 1;
                if (jc.i.a(this.f9897a[i12], obj)) {
                    return i12;
                }
            }
            i10--;
            if (i10 < 0) {
                return -1;
            }
            i = i == 0 ? this.f9900d.length - 1 : i - 1;
        }
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int iG = g(obj);
        if (iG < 0) {
            return null;
        }
        Object[] objArr = this.f9898b;
        jc.i.b(objArr);
        return objArr[iG];
    }

    public final int h(Object obj) {
        int i = this.f9901f;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.f9899c[i] >= 0) {
                Object[] objArr = this.f9898b;
                jc.i.b(objArr);
                if (jc.i.a(objArr[i], obj)) {
                    return i;
                }
            }
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        d dVar = new d(this, 0);
        int i = 0;
        while (dVar.hasNext()) {
            int i10 = dVar.f3575a;
            f fVar = (f) dVar.f3578d;
            if (i10 >= fVar.f9901f) {
                throw new NoSuchElementException();
            }
            dVar.f3575a = i10 + 1;
            dVar.f3576b = i10;
            Object obj = fVar.f9897a[i10];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = fVar.f9898b;
            jc.i.b(objArr);
            Object obj2 = objArr[dVar.f3576b];
            int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
            dVar.e();
            i += iHashCode ^ iHashCode2;
        }
        return i;
    }

    public final int i(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.f9902r;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f9904t == 0;
    }

    public final void j(int i) {
        int[] iArr;
        this.f9903s++;
        int i10 = 0;
        if (this.f9901f > this.f9904t) {
            c(false);
        }
        this.f9900d = new int[i];
        this.f9902r = Integer.numberOfLeadingZeros(i) + 1;
        while (i10 < this.f9901f) {
            int i11 = i10 + 1;
            int i12 = i(this.f9897a[i10]);
            int i13 = this.e;
            while (true) {
                iArr = this.f9900d;
                if (iArr[i12] == 0) {
                    break;
                }
                i13--;
                if (i13 < 0) {
                    throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                }
                i12 = i12 == 0 ? iArr.length - 1 : i12 - 1;
            }
            iArr[i12] = i11;
            this.f9899c[i10] = i12;
            i10 = i11;
        }
    }

    public final void k(int i) {
        Object[] objArr = this.f9897a;
        jc.i.e(objArr, "<this>");
        objArr[i] = null;
        Object[] objArr2 = this.f9898b;
        if (objArr2 != null) {
            objArr2[i] = null;
        }
        int length = this.f9899c[i];
        int i10 = this.e * 2;
        int length2 = this.f9900d.length / 2;
        if (i10 > length2) {
            i10 = length2;
        }
        int i11 = i10;
        int i12 = 0;
        int i13 = length;
        do {
            length = length == 0 ? this.f9900d.length - 1 : length - 1;
            i12++;
            if (i12 > this.e) {
                this.f9900d[i13] = 0;
            } else {
                int[] iArr = this.f9900d;
                int i14 = iArr[length];
                if (i14 == 0) {
                    iArr[i13] = 0;
                } else {
                    if (i14 < 0) {
                        iArr[i13] = -1;
                    } else {
                        int i15 = i14 - 1;
                        int i16 = i(this.f9897a[i15]) - length;
                        int[] iArr2 = this.f9900d;
                        if ((i16 & (iArr2.length - 1)) >= i12) {
                            iArr2[i13] = i14;
                            this.f9899c[i15] = i13;
                        }
                        i11--;
                    }
                    i13 = length;
                    i12 = 0;
                    i11--;
                }
            }
            this.f9899c[i] = -1;
            this.f9904t--;
            this.f9903s++;
        } while (i11 >= 0);
        this.f9900d[i13] = -1;
        this.f9899c[i] = -1;
        this.f9904t--;
        this.f9903s++;
    }

    @Override // java.util.Map
    public final Set keySet() {
        g gVar = this.f9905u;
        if (gVar != null) {
            return gVar;
        }
        g gVar2 = new g(this, 1);
        this.f9905u = gVar2;
        return gVar2;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        b();
        int iA = a(obj);
        Object[] objArr = this.f9898b;
        if (objArr == null) {
            int length = this.f9897a.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            this.f9898b = objArr;
        }
        if (iA >= 0) {
            objArr[iA] = obj2;
            return null;
        }
        int i = (-iA) - 1;
        Object obj3 = objArr[i];
        objArr[i] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        jc.i.e(map, "from");
        b();
        Set<Map.Entry> setEntrySet = map.entrySet();
        if (setEntrySet.isEmpty()) {
            return;
        }
        f(setEntrySet.size());
        for (Map.Entry entry : setEntrySet) {
            int iA = a(entry.getKey());
            Object[] objArr = this.f9898b;
            if (objArr == null) {
                int length = this.f9897a.length;
                if (length < 0) {
                    throw new IllegalArgumentException("capacity must be non-negative.");
                }
                objArr = new Object[length];
                this.f9898b = objArr;
            }
            if (iA >= 0) {
                objArr[iA] = entry.getValue();
            } else {
                int i = (-iA) - 1;
                if (!jc.i.a(entry.getValue(), objArr[i])) {
                    objArr[i] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        b();
        int iG = g(obj);
        if (iG < 0) {
            return null;
        }
        Object[] objArr = this.f9898b;
        jc.i.b(objArr);
        Object obj2 = objArr[iG];
        k(iG);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f9904t;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder((this.f9904t * 3) + 2);
        sb2.append("{");
        int i = 0;
        d dVar = new d(this, 0);
        while (dVar.hasNext()) {
            if (i > 0) {
                sb2.append(", ");
            }
            int i10 = dVar.f3575a;
            f fVar = (f) dVar.f3578d;
            if (i10 >= fVar.f9901f) {
                throw new NoSuchElementException();
            }
            dVar.f3575a = i10 + 1;
            dVar.f3576b = i10;
            Object obj = fVar.f9897a[i10];
            if (obj == fVar) {
                sb2.append("(this Map)");
            } else {
                sb2.append(obj);
            }
            sb2.append('=');
            Object[] objArr = fVar.f9898b;
            jc.i.b(objArr);
            Object obj2 = objArr[dVar.f3576b];
            if (obj2 == fVar) {
                sb2.append("(this Map)");
            } else {
                sb2.append(obj2);
            }
            dVar.e();
            i++;
        }
        sb2.append("}");
        String string = sb2.toString();
        jc.i.d(string, "toString(...)");
        return string;
    }

    @Override // java.util.Map
    public final Collection values() {
        h hVar = this.f9906v;
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h(this);
        this.f9906v = hVar2;
        return hVar2;
    }

    public f(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        Object[] objArr = new Object[i];
        int[] iArr = new int[i];
        int iHighestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
        this.f9897a = objArr;
        this.f9898b = null;
        this.f9899c = iArr;
        this.f9900d = new int[iHighestOneBit];
        this.e = 2;
        this.f9901f = 0;
        this.f9902r = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
    }
}
