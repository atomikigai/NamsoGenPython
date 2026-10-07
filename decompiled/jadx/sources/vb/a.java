package vb;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends jc.a implements ListIterator {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c f9286d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, int i) {
        super(cVar, 3);
        this.f9286d = cVar;
        int iD = cVar.d();
        if (i < 0 || i > iD) {
            throw new IndexOutOfBoundsException(q1.a.i(i, iD, "index: ", ", size: "));
        }
        this.f5757b = i;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f5757b > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f5757b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f5757b - 1;
        this.f5757b = i;
        return this.f9286d.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f5757b - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
