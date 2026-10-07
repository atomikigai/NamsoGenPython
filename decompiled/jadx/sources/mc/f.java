package mc;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class f implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f7110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f7111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f7112c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f7113d;

    public f(long j4, long j10, long j11) {
        this.f7110a = j11;
        this.f7111b = j10;
        boolean z4 = false;
        if (j11 <= 0 ? j4 >= j10 : j4 <= j10) {
            z4 = true;
        }
        this.f7112c = z4;
        this.f7113d = z4 ? j4 : j10;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7112c;
    }

    @Override // java.util.Iterator
    public final Object next() {
        long j4 = this.f7113d;
        if (j4 != this.f7111b) {
            this.f7113d = this.f7110a + j4;
        } else {
            if (!this.f7112c) {
                throw new NoSuchElementException();
            }
            this.f7112c = false;
        }
        return Long.valueOf(j4);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
