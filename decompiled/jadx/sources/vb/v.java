package vb;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class v extends c implements RandomAccess {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f9304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9306c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f9307d;

    public v(Object[] objArr, int i) {
        this.f9304a = objArr;
        if (i < 0) {
            throw new IllegalArgumentException(da.v.f(i, "ring buffer filled size should not be negative but it is ").toString());
        }
        if (i <= objArr.length) {
            this.f9305b = objArr.length;
            this.f9307d = i;
        } else {
            throw new IllegalArgumentException(("ring buffer filled size: " + i + " cannot be larger than the buffer size: " + objArr.length).toString());
        }
    }

    @Override // vb.c
    public final int d() {
        return this.f9307d;
    }

    public final void g() {
        if (20 > this.f9307d) {
            throw new IllegalArgumentException(("n shouldn't be greater than the buffer size: n = 20, size = " + this.f9307d).toString());
        }
        int i = this.f9306c;
        int i10 = this.f9305b;
        int i11 = (i + 20) % i10;
        Object[] objArr = this.f9304a;
        if (i > i11) {
            h.N(objArr, i, i10);
            h.N(objArr, 0, i11);
        } else {
            h.N(objArr, i, i11);
        }
        this.f9306c = i11;
        this.f9307d -= 20;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int iD = d();
        if (i < 0 || i >= iD) {
            throw new IndexOutOfBoundsException(q1.a.i(i, iD, "index: ", ", size: "));
        }
        return this.f9304a[(this.f9306c + i) % this.f9305b];
    }

    @Override // vb.c, java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new u(this);
    }

    @Override // vb.c, java.util.List, java.util.Collection
    public final Object[] toArray() {
        return toArray(new Object[d()]);
    }

    @Override // vb.c, java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        Object[] objArr2;
        jc.i.e(objArr, "array");
        int length = objArr.length;
        int i = this.f9307d;
        if (length < i) {
            objArr = Arrays.copyOf(objArr, i);
            jc.i.d(objArr, "copyOf(...)");
        }
        int i10 = this.f9307d;
        int i11 = this.f9306c;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            objArr2 = this.f9304a;
            if (i13 >= i10 || i11 >= this.f9305b) {
                break;
            }
            objArr[i13] = objArr2[i11];
            i13++;
            i11++;
        }
        while (i13 < i10) {
            objArr[i13] = objArr2[i12];
            i13++;
            i12++;
        }
        if (i10 < objArr.length) {
            objArr[i10] = null;
        }
        return objArr;
    }
}
