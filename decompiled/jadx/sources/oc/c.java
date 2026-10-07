package oc;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Iterator f7705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7706b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f7707c;

    public c(d dVar) {
        this.f7705a = ((d) dVar.f7709b).iterator();
    }

    public final void a() {
        Object next;
        do {
            Iterator it = this.f7705a;
            if (!it.hasNext()) {
                this.f7706b = 0;
                return;
            }
            next = it.next();
        } while (!Boolean.valueOf(next instanceof sb.e).booleanValue());
        this.f7707c = next;
        this.f7706b = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f7706b == -1) {
            a();
        }
        return this.f7706b == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f7706b == -1) {
            a();
        }
        if (this.f7706b == 0) {
            throw new NoSuchElementException();
        }
        Object obj = this.f7707c;
        this.f7707c = null;
        this.f7706b = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
