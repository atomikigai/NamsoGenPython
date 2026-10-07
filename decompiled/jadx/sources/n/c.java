package n;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Map.Entry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f7120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f7121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f7122c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f7123d;

    public c(Object obj, Object obj2) {
        this.f7120a = obj;
        this.f7121b = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f7120a.equals(cVar.f7120a) && this.f7121b.equals(cVar.f7121b);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f7120a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f7121b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f7120a.hashCode() ^ this.f7121b.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f7120a + "=" + this.f7121b;
    }
}
