package vb;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class u implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f9301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9302c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f9303d;
    public final /* synthetic */ v e;

    public u(v vVar) {
        this.e = vVar;
        this.f9302c = vVar.f9307d;
        this.f9303d = vVar.f9306c;
    }

    public final boolean a() {
        this.f9300a = 3;
        int i = this.f9302c;
        if (i == 0) {
            this.f9300a = 2;
        } else {
            v vVar = this.e;
            Object[] objArr = vVar.f9304a;
            int i10 = this.f9303d;
            this.f9301b = objArr[i10];
            this.f9300a = 1;
            this.f9303d = (i10 + 1) % vVar.f9305b;
            this.f9302c = i - 1;
        }
        return this.f9300a == 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f9300a;
        if (i == 0) {
            return a();
        }
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f9300a;
        if (i == 1) {
            this.f9300a = 0;
            return this.f9301b;
        }
        if (i == 2 || !a()) {
            throw new NoSuchElementException();
        }
        this.f9300a = 0;
        return this.f9301b;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
