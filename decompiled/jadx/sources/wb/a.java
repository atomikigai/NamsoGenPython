package wb;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements ListIterator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9882b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f9884d;
    public final vb.d e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9881a = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9883c = -1;

    public a(c cVar, int i) {
        this.e = cVar;
        this.f9882b = i;
        this.f9884d = ((AbstractList) cVar).modCount;
    }

    public void a() {
        if (((AbstractList) ((b) this.e).e).modCount != this.f9884d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.f9881a) {
            case 0:
                a();
                b bVar = (b) this.e;
                int i = this.f9882b;
                this.f9882b = i + 1;
                bVar.add(i, obj);
                this.f9883c = -1;
                this.f9884d = ((AbstractList) bVar).modCount;
                break;
            default:
                b();
                c cVar = (c) this.e;
                int i10 = this.f9882b;
                this.f9882b = i10 + 1;
                cVar.add(i10, obj);
                this.f9883c = -1;
                this.f9884d = ((AbstractList) cVar).modCount;
                break;
        }
    }

    public void b() {
        if (((AbstractList) ((c) this.e)).modCount != this.f9884d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f9881a) {
            case 0:
                return this.f9882b < ((b) this.e).f9887c;
            default:
                return this.f9882b < ((c) this.e).f9891b;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f9881a) {
            case 0:
                return this.f9882b > 0;
            default:
                return this.f9882b > 0;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f9881a) {
            case 0:
                a();
                int i = this.f9882b;
                b bVar = (b) this.e;
                if (i >= bVar.f9887c) {
                    throw new NoSuchElementException();
                }
                this.f9882b = i + 1;
                this.f9883c = i;
                return bVar.f9885a[bVar.f9886b + i];
            default:
                b();
                int i10 = this.f9882b;
                c cVar = (c) this.e;
                if (i10 >= cVar.f9891b) {
                    throw new NoSuchElementException();
                }
                this.f9882b = i10 + 1;
                this.f9883c = i10;
                return cVar.f9890a[i10];
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f9881a) {
            case 0:
                break;
        }
        return this.f9882b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f9881a) {
            case 0:
                a();
                int i = this.f9882b;
                if (i <= 0) {
                    throw new NoSuchElementException();
                }
                int i10 = i - 1;
                this.f9882b = i10;
                this.f9883c = i10;
                b bVar = (b) this.e;
                return bVar.f9885a[bVar.f9886b + i10];
            default:
                b();
                int i11 = this.f9882b;
                if (i11 <= 0) {
                    throw new NoSuchElementException();
                }
                int i12 = i11 - 1;
                this.f9882b = i12;
                this.f9883c = i12;
                return ((c) this.e).f9890a[i12];
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i;
        switch (this.f9881a) {
            case 0:
                i = this.f9882b;
                break;
            default:
                i = this.f9882b;
                break;
        }
        return i - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.f9881a) {
            case 0:
                b bVar = (b) this.e;
                a();
                int i = this.f9883c;
                if (i == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                bVar.g(i);
                this.f9882b = this.f9883c;
                this.f9883c = -1;
                this.f9884d = ((AbstractList) bVar).modCount;
                return;
            default:
                c cVar = (c) this.e;
                b();
                int i10 = this.f9883c;
                if (i10 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                cVar.g(i10);
                this.f9882b = this.f9883c;
                this.f9883c = -1;
                this.f9884d = ((AbstractList) cVar).modCount;
                return;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f9881a) {
            case 0:
                a();
                int i = this.f9883c;
                if (i == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((b) this.e).set(i, obj);
                return;
            default:
                b();
                int i10 = this.f9883c;
                if (i10 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((c) this.e).set(i10, obj);
                return;
        }
    }

    public a(b bVar, int i) {
        this.e = bVar;
        this.f9882b = i;
        this.f9884d = ((AbstractList) bVar).modCount;
    }
}
