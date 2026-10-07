package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class t0 extends b implements RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final t0 f713d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f715c;

    static {
        t0 t0Var = new t0(new Object[0], 0);
        f713d = t0Var;
        t0Var.f609a = false;
    }

    public t0(Object[] objArr, int i) {
        this.f714b = objArr;
        this.f715c = i;
    }

    @Override // androidx.datastore.preferences.protobuf.u
    public final u a(int i) {
        if (i >= this.f715c) {
            return new t0(Arrays.copyOf(this.f714b, i), this.f715c);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.b, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        d();
        int i = this.f715c;
        Object[] objArr = this.f714b;
        if (i == objArr.length) {
            this.f714b = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f714b;
        int i10 = this.f715c;
        this.f715c = i10 + 1;
        objArr2[i10] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void g(int i) {
        if (i < 0 || i >= this.f715c) {
            throw new IndexOutOfBoundsException("Index:" + i + ", Size:" + this.f715c);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        g(i);
        return this.f714b[i];
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        d();
        g(i);
        Object[] objArr = this.f714b;
        Object obj = objArr[i];
        int i10 = this.f715c;
        if (i < i10 - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i10 - i) - 1);
        }
        this.f715c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        d();
        g(i);
        Object[] objArr = this.f714b;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f715c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i10;
        d();
        if (i >= 0 && i <= (i10 = this.f715c)) {
            Object[] objArr = this.f714b;
            if (i10 < objArr.length) {
                System.arraycopy(objArr, i, objArr, i + 1, i10 - i);
            } else {
                Object[] objArr2 = new Object[q1.a.u(i10, 3, 2, 1)];
                System.arraycopy(objArr, 0, objArr2, 0, i);
                System.arraycopy(this.f714b, i, objArr2, i + 1, this.f715c - i);
                this.f714b = objArr2;
            }
            this.f714b[i] = obj;
            this.f715c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("Index:" + i + ", Size:" + this.f715c);
    }
}
