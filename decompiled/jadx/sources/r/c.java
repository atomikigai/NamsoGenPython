package r;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Iterator, Map.Entry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f8078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8079b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f8080c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e f8081d;

    public c(e eVar) {
        this.f8081d = eVar;
        this.f8078a = eVar.f8100c - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f8080c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i = this.f8079b;
        e eVar = this.f8081d;
        return jc.i.a(key, eVar.f(i)) && jc.i.a(entry.getValue(), eVar.j(this.f8079b));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.f8080c) {
            return this.f8081d.f(this.f8079b);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f8080c) {
            return this.f8081d.j(this.f8079b);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f8079b < this.f8078a;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f8080c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i = this.f8079b;
        e eVar = this.f8081d;
        Object objF = eVar.f(i);
        Object objJ = eVar.j(this.f8079b);
        return (objF == null ? 0 : objF.hashCode()) ^ (objJ != null ? objJ.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f8079b++;
        this.f8080c = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f8080c) {
            throw new IllegalStateException();
        }
        this.f8081d.h(this.f8079b);
        this.f8079b--;
        this.f8078a--;
        this.f8080c = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f8080c) {
            return this.f8081d.i(this.f8079b, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
