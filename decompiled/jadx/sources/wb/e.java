package wb;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class e implements Map.Entry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f9893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9895c;

    public e(f fVar, int i) {
        jc.i.e(fVar, "map");
        this.f9893a = fVar;
        this.f9894b = i;
        this.f9895c = fVar.f9903s;
    }

    public final void a() {
        if (this.f9893a.f9903s != this.f9895c) {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return jc.i.a(entry.getKey(), getKey()) && jc.i.a(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        a();
        return this.f9893a.f9897a[this.f9894b];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        a();
        Object[] objArr = this.f9893a.f9898b;
        jc.i.b(objArr);
        return objArr[this.f9894b];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        int iHashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        return iHashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        a();
        f fVar = this.f9893a;
        fVar.b();
        Object[] objArr = fVar.f9898b;
        if (objArr == null) {
            int length = fVar.f9897a.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            fVar.f9898b = objArr;
        }
        int i = this.f9894b;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getKey());
        sb2.append('=');
        sb2.append(getValue());
        return sb2.toString();
    }
}
