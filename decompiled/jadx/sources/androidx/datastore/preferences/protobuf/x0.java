package androidx.datastore.preferences.protobuf;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class x0 extends AbstractMap {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f740r = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f742b = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map f743c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f744d;
    public volatile c1 e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Map f745f;

    public x0(int i) {
        this.f741a = i;
        Map map = Collections.EMPTY_MAP;
        this.f743c = map;
        this.f745f = map;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0024  */
    /* JADX WARN: Code duplicated, block: B:17:0x003e  */
    /* JADX WARN: Code duplicated, block: B:21:0x003c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0042 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0038 A[SYNTHETIC] */
    public final int a(Comparable comparable) {
        int i;
        int i10;
        int i11;
        int iCompareTo;
        int size = this.f742b.size();
        int i12 = size - 1;
        if (i12 < 0) {
            i = 0;
            while (i <= i12) {
                i11 = (i + i12) / 2;
                iCompareTo = comparable.compareTo(((a1) this.f742b.get(i11)).f606a);
                if (iCompareTo < 0) {
                    i12 = i11 - 1;
                } else {
                    if (iCompareTo > 0) {
                        return i11;
                    }
                    i = i11 + 1;
                }
            }
            i10 = i + 1;
        } else {
            int iCompareTo2 = comparable.compareTo(((a1) this.f742b.get(i12)).f606a);
            if (iCompareTo2 > 0) {
                i10 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i12;
                }
                i = 0;
                while (i <= i12) {
                    i11 = (i + i12) / 2;
                    iCompareTo = comparable.compareTo(((a1) this.f742b.get(i11)).f606a);
                    if (iCompareTo < 0) {
                        i12 = i11 - 1;
                    } else {
                        if (iCompareTo > 0) {
                            return i11;
                        }
                        i = i11 + 1;
                    }
                }
                i10 = i + 1;
            }
        }
        return -i10;
    }

    public final void b() {
        if (this.f744d) {
            throw new UnsupportedOperationException();
        }
    }

    public final Map.Entry c(int i) {
        return (Map.Entry) this.f742b.get(i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (!this.f742b.isEmpty()) {
            this.f742b.clear();
        }
        if (this.f743c.isEmpty()) {
            return;
        }
        this.f743c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f743c.containsKey(comparable);
    }

    public final Iterable d() {
        return this.f743c.isEmpty() ? m0.f668b : this.f743c.entrySet();
    }

    public final SortedMap e() {
        b();
        if (this.f743c.isEmpty() && !(this.f743c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f743c = treeMap;
            this.f745f = treeMap.descendingMap();
        }
        return (SortedMap) this.f743c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.e == null) {
            this.e = new c1(0, this);
        }
        return this.e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return super.equals(obj);
        }
        x0 x0Var = (x0) obj;
        int size = size();
        if (size == x0Var.size()) {
            int size2 = this.f742b.size();
            if (size2 != x0Var.f742b.size()) {
                return ((AbstractSet) entrySet()).equals(x0Var.entrySet());
            }
            for (int i = 0; i < size2; i++) {
                if (c(i).equals(x0Var.c(i))) {
                }
            }
            if (size2 != size) {
                return this.f743c.equals(x0Var.f743c);
            }
            return true;
        }
        return false;
    }

    public final Object f(Comparable comparable, Object obj) {
        b();
        int iA = a(comparable);
        if (iA >= 0) {
            return ((a1) this.f742b.get(iA)).setValue(obj);
        }
        b();
        boolean zIsEmpty = this.f742b.isEmpty();
        int i = this.f741a;
        if (zIsEmpty && !(this.f742b instanceof ArrayList)) {
            this.f742b = new ArrayList(i);
        }
        int i10 = -(iA + 1);
        if (i10 >= i) {
            return e().put(comparable, obj);
        }
        if (this.f742b.size() == i) {
            a1 a1Var = (a1) this.f742b.remove(i - 1);
            e().put(a1Var.f606a, a1Var.f607b);
        }
        this.f742b.add(i10, new a1(this, comparable, obj));
        return null;
    }

    public final Object g(int i) {
        b();
        Object obj = ((a1) this.f742b.remove(i)).f607b;
        if (!this.f743c.isEmpty()) {
            Iterator it = e().entrySet().iterator();
            List list = this.f742b;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new a1(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        return iA >= 0 ? ((a1) this.f742b.get(iA)).f607b : this.f743c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.f742b.size();
        int iHashCode = 0;
        for (int i = 0; i < size; i++) {
            iHashCode += ((a1) this.f742b.get(i)).hashCode();
        }
        return this.f743c.size() > 0 ? this.f743c.hashCode() + iHashCode : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* synthetic */ Object put(Object obj, Object obj2) {
        if (obj == null) {
            return f(null, obj2);
        }
        throw new ClassCastException();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        if (iA >= 0) {
            return g(iA);
        }
        if (this.f743c.isEmpty()) {
            return null;
        }
        return this.f743c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f743c.size() + this.f742b.size();
    }
}
