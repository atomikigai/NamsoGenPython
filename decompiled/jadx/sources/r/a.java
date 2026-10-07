package r;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f8073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f8075c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8076d;
    public final /* synthetic */ Object e;

    public a(int i) {
        this.f8073a = i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f8074b < this.f8073a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object objF;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f8074b;
        switch (this.f8076d) {
            case 0:
                objF = ((e) this.e).f(i);
                break;
            case 1:
                objF = ((e) this.e).j(i);
                break;
            default:
                objF = ((f) this.e).f8086b[i];
                break;
        }
        this.f8074b++;
        this.f8075c = true;
        return objF;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f8075c) {
            throw new IllegalStateException("Call next() before removing an element.");
        }
        int i = this.f8074b - 1;
        this.f8074b = i;
        switch (this.f8076d) {
            case 0:
                ((e) this.e).h(i);
                break;
            case 1:
                ((e) this.e).h(i);
                break;
            default:
                ((f) this.e).d(i);
                break;
        }
        this.f8073a--;
        this.f8075c = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(f fVar) {
        this(fVar.f8087c);
        this.f8076d = 2;
        this.e = fVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(e eVar, int i) {
        this(eVar.f8100c);
        this.f8076d = i;
        switch (i) {
            case 1:
                this.e = eVar;
                this(eVar.f8100c);
                break;
            default:
                this.e = eVar;
                break;
        }
    }
}
