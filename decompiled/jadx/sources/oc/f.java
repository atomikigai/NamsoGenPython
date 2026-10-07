package oc;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class f implements Iterator, yb.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f7711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Iterator f7712c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public yb.d f7713d;

    public final RuntimeException a() {
        int i = this.f7710a;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f7710a);
    }

    public final void b(Object obj, ac.h hVar) {
        this.f7711b = obj;
        this.f7710a = 3;
        this.f7713d = hVar;
        zb.a aVar = zb.a.f11555a;
    }

    @Override // yb.d
    public final yb.i getContext() {
        return yb.j.f10674a;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i = this.f7710a;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        return true;
                    }
                    if (i == 4) {
                        return false;
                    }
                    throw a();
                }
                Iterator it = this.f7712c;
                jc.i.b(it);
                if (it.hasNext()) {
                    this.f7710a = 2;
                    return true;
                }
                this.f7712c = null;
            }
            this.f7710a = 5;
            yb.d dVar = this.f7713d;
            jc.i.b(dVar);
            this.f7713d = null;
            dVar.resumeWith(ub.k.f9073a);
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f7710a;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i == 2) {
            this.f7710a = 1;
            Iterator it = this.f7712c;
            jc.i.b(it);
            return it.next();
        }
        if (i != 3) {
            throw a();
        }
        this.f7710a = 0;
        Object obj = this.f7711b;
        this.f7711b = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // yb.d
    public final void resumeWith(Object obj) {
        r7.g.G(obj);
        this.f7710a = 4;
    }
}
