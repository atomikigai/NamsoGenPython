package mc;

import java.util.Iterator;
import java.util.NoSuchElementException;
import jc.i;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7102a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7104c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f7105d;
    public int e;

    public b(char c10, char c11, int i) {
        boolean z4 = false;
        this.f7103b = i;
        this.f7104c = c11;
        if (i <= 0 ? i.f(c10, c11) >= 0 : i.f(c10, c11) <= 0) {
            z4 = true;
        }
        this.f7105d = z4;
        this.e = z4 ? c10 : c11;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f7102a) {
            case 0:
                break;
        }
        return this.f7105d;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f7102a) {
            case 0:
                int i = this.e;
                if (i != this.f7104c) {
                    this.e = this.f7103b + i;
                } else {
                    if (!this.f7105d) {
                        throw new NoSuchElementException();
                    }
                    this.f7105d = false;
                }
                return Character.valueOf((char) i);
            default:
                return Integer.valueOf(nextInt());
        }
    }

    public int nextInt() {
        int i = this.e;
        if (i != this.f7104c) {
            this.e = this.f7103b + i;
            return i;
        }
        if (!this.f7105d) {
            throw new NoSuchElementException();
        }
        this.f7105d = false;
        return i;
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f7102a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public b(int i, int i10, int i11) {
        this.f7103b = i11;
        this.f7104c = i10;
        boolean z4 = false;
        if (i11 <= 0 ? i >= i10 : i <= i10) {
            z4 = true;
        }
        this.f7105d = z4;
        this.e = z4 ? i : i10;
    }
}
